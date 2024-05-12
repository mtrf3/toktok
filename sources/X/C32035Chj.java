package X;

import android.graphics.Bitmap;
import android.util.Base64;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* renamed from: X.Chj, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32035Chj {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 2, insn: 0x0027: MOVE (r3 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]) (LINE:33554471), block:B:42:0x0027 */
    public static String LIZ(Bitmap bitmap, Bitmap.CompressFormat compressFormat) {
        ByteArrayOutputStream byteArrayOutputStream;
        ByteArrayOutputStream byteArrayOutputStream2;
        String encodeToString;
        ByteArrayOutputStream byteArrayOutputStream3 = null;
        ByteArrayOutputStream byteArrayOutputStream4 = null;
        r3 = 0;
        String str = 0;
        try {
            if (bitmap != null) {
                try {
                    byteArrayOutputStream2 = new ByteArrayOutputStream();
                    try {
                        bitmap.compress(compressFormat, 100, byteArrayOutputStream2);
                        byteArrayOutputStream2.flush();
                        byteArrayOutputStream2.close();
                        encodeToString = Base64.encodeToString(byteArrayOutputStream2.toByteArray(), 2);
                        str = byteArrayOutputStream2;
                        byteArrayOutputStream4 = str;
                    } catch (IOException e) {
                        e = e;
                        C16880lQ.LLLLIIL(e);
                        if (byteArrayOutputStream2 != null) {
                            try {
                                byteArrayOutputStream2.flush();
                                byteArrayOutputStream2.close();
                                return str;
                            } catch (IOException e2) {
                                C16880lQ.LLLLIIL(e2);
                                return str;
                            }
                        }
                        return str;
                    }
                } catch (IOException e3) {
                    e = e3;
                    byteArrayOutputStream2 = null;
                } catch (Throwable th) {
                    th = th;
                    if (byteArrayOutputStream3 != null) {
                        try {
                            byteArrayOutputStream3.flush();
                            byteArrayOutputStream3.close();
                        } catch (IOException e4) {
                            C16880lQ.LLLLIIL(e4);
                        }
                    }
                    throw th;
                }
            } else {
                encodeToString = null;
            }
            if (byteArrayOutputStream4 != null) {
                try {
                    byteArrayOutputStream4.flush();
                    byteArrayOutputStream4.close();
                } catch (IOException e5) {
                    C16880lQ.LLLLIIL(e5);
                }
            }
            return encodeToString;
        } catch (Throwable th2) {
            th = th2;
            byteArrayOutputStream3 = byteArrayOutputStream;
        }
    }
}
