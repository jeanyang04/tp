package seedu.address.logic.parser;

import static seedu.address.logic.Messages.MESSAGE_INVALID_COMMAND_FORMAT;
import static seedu.address.logic.parser.CommandParserTestUtil.assertParseFailure;

import org.junit.jupiter.api.Test;

import seedu.address.logic.commands.DeleteConfirmCommand;

/**
 * As we are only doing white-box testing, our test cases do not cover path variations
 * outside of the DeleteCommand code. For example, inputs "1" and "1 abc" take the
 * same path through the DeleteCommand, and therefore we test only one of them.
 * The path variation for those two cases occur inside the ParserUtil, and
 * therefore should be covered by the ParserUtilTest.
 */
public class DeleteConfirmCommandParserTest {

    private DeleteCommandParser parser = new DeleteCommandParser();

    // Uncomment once message constraints are updated
    //    @Test
    //    public void parse_validArgs_returnsDeleteCommand() {
    //        IdentityNumber identityNumber = new IdentityNumber("S1234567A");  // Example IdentityNumber
    //        assertParseSuccess(parser, "S1234567A", new DeleteCommand(identityNumber));
    //    }

    @Test
    public void parse_invalidArgs_throwsParseException() {
        assertParseFailure(parser, "invalid_id", String.format(MESSAGE_INVALID_COMMAND_FORMAT,
                DeleteConfirmCommand.MESSAGE_USAGE));
    }
}