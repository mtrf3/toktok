package X;

import android.app.Dialog;
import kotlin.jvm.internal.AqS175S0100000_9;
import kotlin.jvm.internal.o;

@InterfaceC55642Lsc("global_encourage_login_pop")
/* renamed from: X.LKw, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54094LKw extends AbstractC56325M8r<Dialog> {
    public final ActivityC45651qj LJLIL;
    public final InterfaceC88472Yns<ActivityC45651qj, Dialog> LJLILLLLZI;
    public final int LJLJI;

    @Override // X.InterfaceC55641Lsb
    public final C54082LKk getPopupContext() {
        ActivityC45651qj activityC45651qj = this.LJLIL;
        return C54081LKj.LIZ(activityC45651qj, activityC45651qj);
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

    public C54094LKw(ActivityC45651qj activity, AqS175S0100000_9 aqS175S0100000_9) {
        o.LJIIIZ(activity, "activity");
        this.LJLIL = activity;
        this.LJLILLLLZI = aqS175S0100000_9;
        this.LJLJI = 206;
    }
}
