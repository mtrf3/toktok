package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import kotlin.jvm.internal.o;

/* renamed from: X.Sjh, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72925Sjh<T1, T2, R> implements RTU {
    public final /* synthetic */ U8Q LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ int LJLJI;

    public C72925Sjh(U8Q u8q, int i, int i2) {
        this.LJLIL = u8q;
        this.LJLILLLLZI = i;
        this.LJLJI = i2;
    }

    @Override // X.RTU
    public final Object apply(Object obj, Object obj2) {
        Bitmap bgBitmap = (Bitmap) obj;
        Bitmap avatarBitmap = (Bitmap) obj2;
        o.LJIIIZ(bgBitmap, "bgBitmap");
        o.LJIIIZ(avatarBitmap, "avatarBitmap");
        this.LJLIL.getClass();
        int width = bgBitmap.getWidth();
        int height = bgBitmap.getHeight();
        int width2 = avatarBitmap.getWidth();
        int height2 = avatarBitmap.getHeight();
        Bitmap bitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmap);
        StringBuilder LIZJ = C06460Ne.LIZJ("bgWidth = ", width, " bgHeight = ", height, " fWidth = ");
        LIZJ.append(width2);
        LIZJ.append(" fHeight = ");
        LIZJ.append(height2);
        C0NB.LIZIZ("def_mask", X1D.LIZIZ(LIZJ));
        canvas.drawBitmap(bgBitmap, 0.0f, 0.0f, (Paint) null);
        canvas.drawBitmap(avatarBitmap, (width - width2) / 2.0f, (height - height2) / 2.0f, (Paint) null);
        canvas.save();
        canvas.restore();
        o.LJIIIIZZ(bitmap, "bitmap");
        U8Q u8q = this.LJLIL;
        int i = this.LJLILLLLZI;
        int i2 = this.LJLJI;
        u8q.getClass();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("bitmap_");
        LIZ.append(i);
        LIZ.append('_');
        LIZ.append(i2);
        u8q.LIZLLL.put(X1D.LIZIZ(LIZ), bitmap);
        return bitmap;
    }
}
