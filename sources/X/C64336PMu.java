package X;

import Y.ARunnableS14S0201000_11;
import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.feed.model.BigThumb;

/* renamed from: X.PMu, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64336PMu implements InterfaceC78660Uu0 {
    public final /* synthetic */ C73701SwD LJLIL;
    public final /* synthetic */ BigThumb LJLILLLLZI;
    public final /* synthetic */ int LJLJI;

    @Override // X.InterfaceC78660Uu0
    public final void LIZ() {
    }

    @Override // X.InterfaceC78660Uu0
    public final void onFailed(Throwable th) {
    }

    @Override // X.InterfaceC78660Uu0
    public final void onProgress(float f) {
    }

    @Override // X.InterfaceC78660Uu0
    public final void LIZIZ(Bitmap bitmap) {
        if (bitmap == null) {
            return;
        }
        C73701SwD c73701SwD = this.LJLIL;
        c73701SwD.getClass();
        c73701SwD.LIZJ = bitmap;
        this.LJLIL.LIZLLL = this.LJLILLLLZI.getFext();
        if (this.LJLIL.LIZJ() == null) {
            return;
        }
        C38816FLg.LJ(new ARunnableS14S0201000_11(this.LJLJI, this.LJLIL, this.LJLILLLLZI, 9));
    }

    public C64336PMu(C73701SwD c73701SwD, BigThumb bigThumb, int i) {
        this.LJLIL = c73701SwD;
        this.LJLILLLLZI = bigThumb;
        this.LJLJI = i;
    }
}
