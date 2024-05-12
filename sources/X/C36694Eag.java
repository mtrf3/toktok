package X;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;

/* renamed from: X.Eag, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36694Eag<T> implements InterfaceC86003Zc {
    public final /* synthetic */ U8Q LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ float LJLJI;
    public final /* synthetic */ int LJLJJI;
    public final /* synthetic */ Drawable LJLJJL;

    public C36694Eag(U8Q u8q, int i, float f, int i2, Drawable drawable) {
        this.LJLIL = u8q;
        this.LJLILLLLZI = i;
        this.LJLJI = f;
        this.LJLJJI = i2;
        this.LJLJJL = drawable;
    }

    @Override // X.InterfaceC86003Zc
    public final void subscribe(InterfaceC73573Su9<Bitmap> interfaceC73573Su9) {
        Bitmap LJJIZ;
        U8Q u8q = this.LJLIL;
        OSZ osz = new OSZ(Integer.valueOf((int) ((this.LJLILLLLZI * 2) / this.LJLJI)), Integer.valueOf((int) ((this.LJLJJI * 2) / this.LJLJI)));
        u8q.getClass();
        OSZ LIZIZ = U8Q.LIZIZ(osz);
        Drawable drawable = this.LJLJJL;
        if (drawable != null && (LJJIZ = C1DH.LJJIZ(drawable, ((Number) LIZIZ.getFirst()).intValue(), ((Number) LIZIZ.getSecond()).intValue(), Bitmap.Config.ARGB_8888)) != null) {
            interfaceC73573Su9.onNext(LJJIZ);
            interfaceC73573Su9.onComplete();
        } else {
            interfaceC73573Su9.onError(new Throwable("bitmap is null"));
        }
    }
}
