package X;

import android.app.Dialog;
import kotlin.jvm.internal.AqS175S0100000_9;
import kotlin.jvm.internal.o;

@InterfaceC55642Lsc("global_motivate_login_pop")
/* renamed from: X.LKq, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54088LKq extends AbstractC56325M8r<Dialog> {
    public final ActivityC45651qj LJLIL;
    public final InterfaceC88472Yns<ActivityC45651qj, Dialog> LJLILLLLZI;
    public final int LJLJI = 205;

    @Override // X.InterfaceC55641Lsb
    public final C54082LKk getPopupContext() {
        ActivityC45651qj activityC45651qj = this.LJLIL;
        return C54081LKj.LIZ(activityC45651qj, activityC45651qj);
    }

    @Override // X.M74
    public final boolean canShow() {
        if (!HG3.LJIILL().isLogin() && com.bytedance.hox.Hox.LJLLI.LIZ(this.LJLIL).wv0("For You")) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC56321M8n
    public final int getPriority() {
        return this.LJLJI;
    }

    @Override // com.bytedance.poplayer.IPopupTask
    public final Object showPopup(C54082LKk context) {
        o.LJIIIZ(context, "context");
        return this.LJLILLLLZI.invoke(this.LJLIL);
    }

    public C54088LKq(ActivityC45651qj activityC45651qj, AqS175S0100000_9 aqS175S0100000_9) {
        this.LJLIL = activityC45651qj;
        this.LJLILLLLZI = aqS175S0100000_9;
    }
}
