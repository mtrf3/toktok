package X;

import android.view.View;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.subscription.SubscriptionNotificationPrompt;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class GIE implements View.OnClickListener {
    public static final GIE LJLIL = new GIE();

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        FMX.LJIIL("click_cancellation_info_prompt", new C188727au().LIZ);
        TuxSheet tuxSheet = SubscriptionNotificationPrompt.LJLJI;
        if (tuxSheet != null) {
            tuxSheet.dismiss();
        } else {
            o.LJIJI("sheet");
            throw null;
        }
    }
}
