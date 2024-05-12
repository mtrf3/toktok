package X;

import android.app.Dialog;
import kotlin.jvm.internal.o;

@InterfaceC55642Lsc("feed_hpas_2sv")
/* renamed from: X.LhF, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54937LhF extends AbstractC56325M8r<Dialog> {
    public final ActivityC45651qj LJLIL;
    public final boolean LJLILLLLZI;
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
        RCX rcx = new RCX(this.LJLIL, this.LJLILLLLZI);
        if (!new C03880Dg(2).LIZJ(300000, "com/ss/android/ugc/aweme/account/login/twostep/Hpas2svDialog", "show", rcx, new Object[0], "void", new C65300Pk0(false, "()V", "7909111965143028231")).LIZ) {
            rcx.show();
        }
        RCX.LJLJL = rcx;
        return rcx;
    }

    public C54937LhF(ActivityC45651qj activity, boolean z) {
        o.LJIIIZ(activity, "activity");
        this.LJLIL = activity;
        this.LJLILLLLZI = z;
        this.LJLJI = 395;
    }
}
