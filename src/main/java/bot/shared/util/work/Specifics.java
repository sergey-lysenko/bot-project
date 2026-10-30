package bot.shared.util.work;

import works.lysenko.tree.base.*;
import works.lysenko.util.apis.exception.checked.*;

/**
 * Exceptional handler for Bot test execution.
 */
public class Specifics extends Exceptional {

    @Override
    public final void action() throws SafeguardException {

        if (unresolved()) super.action();
    }
}
