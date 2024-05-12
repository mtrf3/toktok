package X;

import android.graphics.Bitmap;

/* renamed from: X.Vs5, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81089Vs5 extends AbstractC85293Wj {
    public final /* synthetic */ C81078Vru LJLIL;
    public final /* synthetic */ C81075Vrr LJLILLLLZI;
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ C73305Spp LJLJJI;
    public final /* synthetic */ android.net.Uri LJLJJL;

    @Override // X.InterfaceC78660Uu0
    public final void LIZIZ(Bitmap bitmap) {
        this.LJLIL.setImageBitmap(bitmap);
        this.LJLILLLLZI.LJJIII(this.LJLIL, this.LJLJI, this.LJLJJI, true, null);
    }

    @Override // X.InterfaceC78660Uu0
    public final void onFailed(Throwable th) {
        this.LJLILLLLZI.LJJIII(this.LJLIL, this.LJLJI, this.LJLJJI, false, this.LJLJJL);
    }

    public C81089Vs5(int i, android.net.Uri uri, C73305Spp c73305Spp, C81078Vru c81078Vru, C81075Vrr c81075Vrr) {
        this.LJLIL = c81078Vru;
        this.LJLILLLLZI = c81075Vrr;
        this.LJLJI = i;
        this.LJLJJI = c73305Spp;
        this.LJLJJL = uri;
    }
}
