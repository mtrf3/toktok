package X;

import android.content.Context;
import android.text.TextUtils;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/* renamed from: X.Eep, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36951Eep {
    public static volatile String LIZ;
    public static volatile String LIZIZ;
    public static volatile boolean LIZJ;
    public static volatile boolean LIZLLL;
    public static volatile List<String> LJ = new ArrayList();
    public static volatile List<String> LJFF = new ArrayList();
    public static volatile boolean LJI = false;
    public static volatile List<Pattern> LJII = new ArrayList();

    public static String LIZ(Context context) {
        InputStream inputStream;
        try {
            inputStream = context.getAssets().open("ttnet_config.json");
        } catch (Throwable unused) {
            inputStream = null;
        }
        try {
            byte[] bArr = new byte[inputStream.available()];
            inputStream.read(bArr);
            String str = new String(bArr, "UTF-8");
            try {
                inputStream.close();
                return str;
            } catch (IOException e) {
                C16880lQ.LLLLIIL(e);
                return str;
            }
        } catch (Throwable unused2) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e2) {
                    C16880lQ.LLLLIIL(e2);
                }
            }
            return "";
        }
    }

    public static boolean LIZIZ(Context context) {
        String absolutePath = C16880lQ.LLIIJLIL(context).getAbsolutePath();
        if (!TextUtils.isEmpty(absolutePath)) {
            try {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append(absolutePath);
                LIZ2.append("/");
                LIZ2.append("ttnet_boe.flag");
                if (new File(X1D.LIZIZ(LIZ2)).exists()) {
                    return true;
                }
                return false;
            } catch (Throwable unused) {
                return false;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0093 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ee  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LIZJ(android.content.Context r7, java.lang.String r8, java.util.List<X.EJ6> r9) {
        /*
            Method dump skipped, instructions count: 523
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C36951Eep.LIZJ(android.content.Context, java.lang.String, java.util.List):java.lang.String");
    }
}
