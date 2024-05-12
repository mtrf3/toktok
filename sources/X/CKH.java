package X;

import Y.ACallableS4S1000000_5;
import com.bytedance.android.livesdk.broadcast.interaction.widget.task_animation.TaskFinishAnimationWidget;

/* loaded from: classes6.dex */
public final class CKH extends CKI {
    public final /* synthetic */ TaskFinishAnimationWidget LJLIL;

    public CKH(TaskFinishAnimationWidget taskFinishAnimationWidget) {
        this.LJLIL = taskFinishAnimationWidget;
    }

    @Override // X.CKI, X.InterfaceC32416Cns
    public final void onFailed(Throwable th) {
        C0NB.LJFF("TaskFinishAnimationWidget", th.toString(), th);
    }

    @Override // X.CKI, X.InterfaceC32416Cns
    public final void LIZLLL(long j, String str) {
        C32022ChW.LIZIZ().LIZ(this.LJLIL.LJLJJLL, new ACallableS4S1000000_5(str, 1), 100);
    }
}
