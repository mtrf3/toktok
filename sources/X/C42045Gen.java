package X;

import android.view.ViewPropertyAnimator;
import com.ss.android.ugc.aweme.shortvideo.ui.publishprogress.ParallelPublishDialogFragment;

/* renamed from: X.Gen, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42045Gen implements InterfaceC43357Gzx {
    public final /* synthetic */ ParallelPublishDialogFragment LIZ;
    public final /* synthetic */ C43356Gzw LIZIZ;
    public final /* synthetic */ ViewPropertyAnimator LIZJ;

    public C42045Gen(ParallelPublishDialogFragment parallelPublishDialogFragment, C43356Gzw c43356Gzw, ViewPropertyAnimator viewPropertyAnimator) {
        this.LIZ = parallelPublishDialogFragment;
        this.LIZIZ = c43356Gzw;
        this.LIZJ = viewPropertyAnimator;
    }

    @Override // X.InterfaceC43357Gzx
    public final void onCancel() {
        this.LIZ.LJLLILLLL.LJ(this.LIZIZ);
        this.LIZJ.cancel();
    }
}
