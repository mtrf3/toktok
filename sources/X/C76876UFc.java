package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Base64;
import java.io.ByteArrayOutputStream;
import kotlin.jvm.internal.o;

/* renamed from: X.UFc, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76876UFc {
    public Long LIZ;
    public Integer LIZIZ;
    public boolean LIZJ;
    public final String LIZLLL;
    public String LJ;
    public Long LJFF;
    public String LJI;
    public Bitmap LJII;

    public C76876UFc() {
        this(null, null, null, false, null, null, null, 255);
    }

    public final Bitmap LIZ() {
        Bitmap bitmap = this.LJII;
        if (bitmap != null && bitmap.isRecycled()) {
            String base64 = this.LJI;
            o.LJIIIZ(base64, "base64");
            byte[] decode = Base64.decode(base64, 0);
            o.LJIIIIZZ(decode, "decode(base64, Base64.DEFAULT)");
            Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length);
            o.LJIIIIZZ(decodeByteArray, "decodeByteArray(decodedS…g, 0, decodedString.size)");
            this.LJII = decodeByteArray;
        }
        return this.LJII;
    }

    public final void LIZIZ(Bitmap bitmap) {
        if (bitmap == null) {
            return;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("");
        LIZ.append(Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0));
        this.LJI = X1D.LIZIZ(LIZ);
        this.LJII = bitmap;
    }

    public C76876UFc(Long l, Bitmap bitmap, Integer num, boolean z, String str, String str2, Long l2, int i) {
        l = (i & 1) != 0 ? null : l;
        bitmap = (i & 2) != 0 ? null : bitmap;
        num = (i & 4) != 0 ? null : num;
        z = (i & 8) != 0 ? false : z;
        str = (i & 16) != 0 ? null : str;
        str2 = (i & 32) != 0 ? null : str2;
        l2 = (i & 64) != 0 ? null : l2;
        String base64 = (i & 128) != 0 ? "" : null;
        o.LJIIIZ(base64, "base64");
        this.LIZ = l;
        this.LIZIZ = num;
        this.LIZJ = z;
        this.LIZLLL = str;
        this.LJ = str2;
        this.LJFF = l2;
        this.LJI = base64;
        LIZIZ(bitmap);
    }
}
