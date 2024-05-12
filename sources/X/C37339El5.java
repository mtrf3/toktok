package X;

import android.graphics.Bitmap;

/* renamed from: X.El5, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37339El5 implements InterfaceC78660Uu0 {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ long LJLILLLLZI;

    @Override // X.InterfaceC78660Uu0
    public final void onProgress(float f) {
    }

    @Override // X.InterfaceC78660Uu0
    public final void LIZ() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.LJLIL);
        LIZ.append(" onCanceled ");
        H78.LIZIZ("MediaCacheRepository", X1D.LIZIZ(LIZ));
    }

    @Override // X.InterfaceC78660Uu0
    public final void LIZIZ(Bitmap bitmap) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.LJLIL);
        LIZ.append(" not getCachedBitmapAsync (");
        LIZ.append(System.currentTimeMillis() - this.LJLILLLLZI);
        LIZ.append("ms)");
        H78.LIZIZ("MediaCacheRepository", X1D.LIZIZ(LIZ));
        C37335El1.LIZJ(this.LJLILLLLZI, bitmap, this.LJLIL);
    }

    @Override // X.InterfaceC78660Uu0
    public final void onFailed(Throwable th) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.LJLIL);
        LIZ.append(" onFailed ");
        LIZ.append(th);
        H78.LIZIZ("MediaCacheRepository", X1D.LIZIZ(LIZ));
    }

    public C37339El5(String str, long j) {
        this.LJLIL = str;
        this.LJLILLLLZI = j;
    }
}
