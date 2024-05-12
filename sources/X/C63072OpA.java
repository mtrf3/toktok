package X;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.OpA, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63072OpA extends AbstractC85293Wj {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ int LJLILLLLZI;

    @Override // X.InterfaceC78660Uu0
    public final void onFailed(Throwable th) {
    }

    @Override // X.InterfaceC78660Uu0
    public final void LIZIZ(Bitmap bitmap) {
        if (bitmap == null) {
            return;
        }
        LinkedHashMap<String, Bitmap> linkedHashMap = C63069Op7.LIZLLL;
        String hashtag = this.LJLIL;
        o.LJIIIIZZ(hashtag, "hashtag");
        int i = this.LJLILLLLZI;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Matrix matrix = new Matrix();
        matrix.postScale(i / width, i / height);
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, true);
        o.LJIIIIZZ(createBitmap, "createBitmap(bitmap, 0, …th, height, matrix, true)");
        linkedHashMap.put(hashtag, createBitmap);
    }

    public C63072OpA(String str, int i) {
        this.LJLIL = str;
        this.LJLILLLLZI = i;
    }
}
