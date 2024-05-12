package X;

import android.graphics.Bitmap;
import com.facebook.imagepipeline.common.ImageDecodeOptionsBuilder;
import com.zhiliaoapp.musically.R;

/* loaded from: classes9.dex */
public final class KS8 implements KS7 {
    public final /* synthetic */ AnonymousClass745 LJLIL;

    @Override // X.KS7
    public final void onSuccess() {
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [X.W5O, REQUEST] */
    @Override // X.KS7
    public final void onFail() {
        this.LJLIL.LJLLLL.getHierarchy().LJIILJJIL(InterfaceC78716Uuu.LJJLIIIJ);
        C62846OlW c62846OlW = this.LJLIL.LJLLLL;
        C81705W4v LIZJ = W5I.LIZJ();
        LIZJ.LJIIL = this.LJLIL.LJLLLL.getController();
        W5P LIZJ2 = W5P.LIZJ(R.drawable.y4);
        ImageDecodeOptionsBuilder imageDecodeOptionsBuilder = new ImageDecodeOptionsBuilder();
        imageDecodeOptionsBuilder.setBitmapConfig(Bitmap.Config.ARGB_8888);
        imageDecodeOptionsBuilder.getClass();
        LIZJ2.LJ = new C81810W8w(imageDecodeOptionsBuilder);
        LIZJ.LIZLLL = LIZJ2.LIZ();
        c62846OlW.setController(LIZJ.LIZ());
    }

    public KS8(AnonymousClass745 anonymousClass745) {
        this.LJLIL = anonymousClass745;
    }
}
