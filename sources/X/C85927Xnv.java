package X;

import Y.ACListenerS33S0110000_15;
import com.ss.android.ugc.aweme.setting.serverpush.model.PushItem;
import kotlin.jvm.internal.o;

/* renamed from: X.Xnv, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85927Xnv extends AbstractC85929Xnx {
    public final PushItem LJLJJLL;

    @Override // X.C25860ACy
    /* renamed from: LJIIJJI */
    public final C25859ACx LJIIIIZZ() {
        boolean LIZ = C85919Xnn.LIZ(this.LJLJJL);
        if (LIZ && o.LJ(this.LJLJJLL.itemId, "sms")) {
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("page_name", "notification_setting_page");
            c188727au.LJIIIZ("exp_name", "sms_notification");
            FMX.LJIIL("show_sms_notification_setting", c188727au.LIZ);
        }
        return new C25859ACx(this.LJLJJLL.display.title, LJIILJJIL(), new ACListenerS33S0110000_15(this, LIZ, 4), null, LIZ, null, null, null, false, false, null, this.LJLJJLL.display.description, LJIILL(), false, null, null, null, 8376296);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C85927Xnv(PushItem pushItem) {
        super(pushItem);
        o.LJIIIZ(pushItem, "pushItem");
        this.LJLJJLL = pushItem;
    }
}
