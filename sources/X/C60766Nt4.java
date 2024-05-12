package X;

import Y.ARunnableS29S0200000_10;
import android.graphics.Bitmap;
import android.webkit.PermissionRequest;
import kotlin.jvm.internal.o;

/* renamed from: X.Nt4, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60766Nt4 extends AbstractC60402NnC {
    public final /* synthetic */ C60765Nt3 LJLIL;
    public final /* synthetic */ C60762Nt0 LJLILLLLZI;

    @Override // X.AbstractC60402NnC
    public final Bitmap getDefaultVideoPoster() {
        Bitmap createBitmap = Bitmap.createBitmap(10, 10, Bitmap.Config.ARGB_8888);
        o.LJIIIIZZ(createBitmap, "createBitmap(10, 10, Bitmap.Config.ARGB_8888)");
        return createBitmap;
    }

    @Override // X.AbstractC60536NpM
    public final AbstractC60629Nqr<?> getExtension() {
        return this.LJLIL;
    }

    @Override // X.AbstractC60402NnC
    public final void onPermissionRequest(PermissionRequest request) {
        o.LJIIIZ(request, "request");
        C1DH.LJJIJIIJI(new ARunnableS29S0200000_10(request, this.LJLILLLLZI, 71));
    }

    public C60766Nt4(C60765Nt3 c60765Nt3, C60762Nt0 c60762Nt0) {
        this.LJLIL = c60765Nt3;
        this.LJLILLLLZI = c60762Nt0;
    }
}
