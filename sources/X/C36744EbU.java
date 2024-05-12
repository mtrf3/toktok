package X;

import java.io.PrintWriter;
import java.io.StringWriter;
import org.json.JSONObject;

/* renamed from: X.EbU, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36744EbU implements W57 {
    public static final C36744EbU LJLILLLLZI = new C36744EbU();
    public int LJLIL = 5;

    public static boolean LIZ(CharSequence charSequence) {
        if (charSequence == null || charSequence.length() == 0) {
            return true;
        }
        return false;
    }

    @Override // X.W57
    public final boolean LJIIIIZZ(int i) {
        if (this.LJLIL <= i) {
            return true;
        }
        return false;
    }

    @Override // X.W57
    public final void LJIIIZ(int i) {
        this.LJLIL = i;
    }

    @Override // X.W57
    public final void LIZJ(String str, String str2) {
        if (!LIZ(str)) {
            LIZ(str2);
        }
    }

    @Override // X.W57
    public final void LJI(String str, Throwable th) {
        LIZIZ(str, "unhandled exception", th);
    }

    @Override // X.W57
    public final void d(String str, String str2) {
        if (!LIZ(str)) {
            LIZ(str2);
        }
    }

    @Override // X.W57
    public final void e(String str, String str2) {
        if (str2 != null) {
            if (str2.contains("init FrescoTTNetFetcher")) {
                C36922EeM.LJ("init FrescoTTNetFetcher " + android.util.Log.getStackTraceString(new Throwable()));
            }
            if (str2.contains("Fresco has already been initialized!")) {
                C36922EeM.LJ("Fresco has already been initialized! " + android.util.Log.getStackTraceString(new Throwable()));
            }
        }
        if (!LIZ(str)) {
            LIZ(str2);
        }
    }

    @Override // X.W57
    public final void v(String str, String str2) {
        if (!LIZ(str)) {
            LIZ(str2);
        }
    }

    @Override // X.W57
    public final void w(String str, String str2) {
        if (!LIZ(str)) {
            LIZ(str2);
        }
    }

    public final void LIZIZ(String str, String str2, Throwable th) {
        if (!LIZ(str) && !LIZ(str2) && th != null && th.getMessage() != null) {
            th.getMessage().getClass();
        }
    }

    @Override // X.W57
    public final void d(String str, String str2, Throwable th) {
        LIZIZ(str, str2, th);
    }

    @Override // X.W57
    public final void e(String str, String str2, Throwable th) {
        LIZIZ(str, str2, th);
        if (str2 != null && str2.contains("Malformed escape pair")) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("ImageEncryptUtils failed:");
            LIZ.append(str2);
            C36922EeM.LJ(X1D.LIZIZ(LIZ));
        }
    }

    @Override // X.W57
    public final void w(String str, String str2, Throwable th) {
        LIZIZ(str, str2, th);
        if (th instanceof IllegalStateException) {
            JSONObject jSONObject = new JSONObject();
            try {
                if (!LIZ(str2)) {
                    jSONObject.put("errorField", str2);
                }
                StringWriter stringWriter = new StringWriter();
                PrintWriter printWriter = new PrintWriter(stringWriter);
                try {
                    th.printStackTrace(printWriter);
                    String stringWriter2 = stringWriter.toString();
                    printWriter.close();
                    jSONObject.put("errorDesc", stringWriter2);
                    jSONObject.put("status", 1);
                    FUA.LIZJ("aweme_image_error_log", jSONObject);
                } catch (Throwable th2) {
                    printWriter.close();
                    throw th2;
                }
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
            }
        }
    }
}
