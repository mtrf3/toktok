package X;

import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.base.model.UrlModel;

/* renamed from: X.MlS, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57746MlS implements InterfaceC78660Uu0 {
    public final /* synthetic */ C86192XsC LJLIL;
    public final /* synthetic */ UrlModel LJLILLLLZI;
    public final /* synthetic */ long LJLJI;
    public final /* synthetic */ InterfaceC65052gv<Bitmap> LJLJJI;

    @Override // X.InterfaceC78660Uu0
    public final void onProgress(float f) {
    }

    @Override // X.InterfaceC78660Uu0
    public final void LIZ() {
        long currentTimeMillis = System.currentTimeMillis();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append('[');
        LIZ.append(this.LJLIL.hashCode());
        LIZ.append("](");
        LIZ.append(this.LJLILLLLZI.hashCode());
        LIZ.append(") fetch cancel time: ");
        LIZ.append(currentTimeMillis - this.LJLJI);
        C221018lt.LIZ("AvatarUnionImpl", X1D.LIZIZ(LIZ));
        ((C73578SuE) this.LJLJJI).onError(new C57747MlT(this.LJLIL));
    }

    @Override // X.InterfaceC78660Uu0
    public final void LIZIZ(Bitmap bitmap) {
        if (bitmap != null) {
            long currentTimeMillis = System.currentTimeMillis();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append('[');
            LIZ.append(this.LJLIL.hashCode());
            LIZ.append("](");
            LIZ.append(this.LJLILLLLZI.hashCode());
            LIZ.append(") fetch ok time: ");
            LIZ.append(currentTimeMillis - this.LJLJI);
            C221018lt.LIZ("AvatarUnionImpl", X1D.LIZIZ(LIZ));
            ((C73578SuE) this.LJLJJI).onSuccess(bitmap);
            return;
        }
        long currentTimeMillis2 = System.currentTimeMillis();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append('[');
        LIZ2.append(this.LJLIL.hashCode());
        LIZ2.append("](");
        LIZ2.append(this.LJLILLLLZI.hashCode());
        LIZ2.append(") fetch null time: ");
        LIZ2.append(currentTimeMillis2 - this.LJLJI);
        C221018lt.LIZ("AvatarUnionImpl", X1D.LIZIZ(LIZ2));
        ((C73578SuE) this.LJLJJI).onError(new C57747MlT(this.LJLIL));
    }

    @Override // X.InterfaceC78660Uu0
    public final void onFailed(Throwable th) {
        long currentTimeMillis = System.currentTimeMillis();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append('[');
        LIZ.append(this.LJLIL.hashCode());
        LIZ.append("](");
        LIZ.append(this.LJLILLLLZI.hashCode());
        LIZ.append(") fetch failed time: ");
        LIZ.append(currentTimeMillis - this.LJLJI);
        C221018lt.LIZ("AvatarUnionImpl", X1D.LIZIZ(LIZ));
        ((C73578SuE) this.LJLJJI).onError(new C57747MlT(this.LJLIL));
    }

    public C57746MlS(C86192XsC c86192XsC, UrlModel urlModel, long j, C73578SuE c73578SuE) {
        this.LJLIL = c86192XsC;
        this.LJLILLLLZI = urlModel;
        this.LJLJI = j;
        this.LJLJJI = c73578SuE;
    }
}
