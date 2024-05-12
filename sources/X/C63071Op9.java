package X;

import Y.ARunnableS4S0301000_3;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import com.ss.android.ugc.aweme.model.TextExtraStruct;

/* renamed from: X.Op9, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63071Op9<T> implements InterfaceC41846Gba {
    public final /* synthetic */ C201577vd LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ TextExtraStruct LJLJI;
    public final /* synthetic */ int LJLJJI = 0;

    public C63071Op9(C201577vd c201577vd, String str, TextExtraStruct textExtraStruct) {
        this.LJLIL = c201577vd;
        this.LJLILLLLZI = str;
        this.LJLJI = textExtraStruct;
    }

    @Override // X.InterfaceC41846Gba
    public final void accept(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        if (bitmap != null && !bitmap.isRecycled()) {
            BitmapDrawable bitmapDrawable = new BitmapDrawable(bitmap);
            bitmapDrawable.setBounds(0, 0, (int) this.LJLIL.getTextSize(), (int) this.LJLIL.getTextSize());
            T59 t59 = new T59(bitmapDrawable);
            C201577vd c201577vd = this.LJLIL;
            c201577vd.post(new ARunnableS4S0301000_3(this.LJLJJI, c201577vd, this.LJLJI, t59, 0));
            C63069Op7.LIZLLL(this.LJLILLLLZI, this.LJLJI.getHashTagName());
        }
    }
}
