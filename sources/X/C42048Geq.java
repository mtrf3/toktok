package X;

import android.view.ViewPropertyAnimator;
import com.ss.android.ugc.aweme.shortvideo.ui.publishprogress.ParallelPublishDialogFragment;

/* renamed from: X.Geq, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42048Geq implements InterfaceC43357Gzx {
    public final /* synthetic */ ParallelPublishDialogFragment LIZ;
    public final /* synthetic */ C43356Gzw LIZIZ;
    public final /* synthetic */ ViewPropertyAnimator LIZJ;
    public final /* synthetic */ ViewPropertyAnimator LIZLLL;
    public final /* synthetic */ ViewPropertyAnimator LJ;

    public C42048Geq(ParallelPublishDialogFragment parallelPublishDialogFragment, C43356Gzw c43356Gzw, ViewPropertyAnimator viewPropertyAnimator, ViewPropertyAnimator viewPropertyAnimator2, ViewPropertyAnimator viewPropertyAnimator3) {
        this.LIZ = parallelPublishDialogFragment;
        this.LIZIZ = c43356Gzw;
        this.LIZJ = viewPropertyAnimator;
        this.LIZLLL = viewPropertyAnimator2;
        this.LJ = viewPropertyAnimator3;
    }

    @Override // X.InterfaceC43357Gzx
    public final void onCancel() {
        this.LIZ.LJLLILLLL.LJ(this.LIZIZ);
        this.LIZJ.cancel();
        this.LIZLLL.cancel();
        this.LJ.cancel();
    }
}
