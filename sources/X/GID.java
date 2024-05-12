package X;

import android.os.Bundle;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.subscription.SubscriptionNotificationPrompt;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class GID extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public static final GID LJLIL = new GID();

    public GID() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        TuxSheet tuxSheet = SubscriptionNotificationPrompt.LJLJI;
        if (tuxSheet != null) {
            Bundle bundle = new Bundle();
            bundle.putBoolean("is_not_other_exit", true);
            tuxSheet.setArguments(bundle);
            TuxSheet tuxSheet2 = SubscriptionNotificationPrompt.LJLJI;
            if (tuxSheet2 != null) {
                tuxSheet2.dismiss();
                return C76800UCe.LIZ;
            }
            o.LJIJI("sheet");
            throw null;
        }
        o.LJIJI("sheet");
        throw null;
    }
}
