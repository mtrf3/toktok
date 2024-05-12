package X;

import android.text.TextUtils;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.IbA, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C46916IbA {
    public static final /* synthetic */ int LIZ = 0;

    static {
        new C46711IUx();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static C47164IfA LIZ(String str) {
        C47164IfA c47164IfA;
        int LJ;
        List<C47160If6> LJIIIIZZ;
        if (!TextUtils.isEmpty(str)) {
            try {
                o.LJI(str);
                JSONObject jSONObject = new JSONObject(str);
                try {
                    if (jSONObject.optInt("enable_video_dash_reconstruct", 0) == 1) {
                        c47164IfA = new C47164IfA();
                        c47164IfA.LJJIIZI(jSONObject);
                    } else {
                        C47163If9 c47163If9 = new C47163If9();
                        c47163If9.LIZJ(new JSONObject(str));
                        c47164IfA = new C47164IfA();
                        c47164IfA.LJJIJIIJI(c47163If9);
                        if (IZ8.LJIIIIZZ() && (LJ = c47163If9.LJ(3)) > 0 && (LJIIIIZZ = c47163If9.LJIIIIZZ()) != null) {
                            for (C47160If6 c47160If6 : LJIIIIZZ) {
                                if (c47160If6 != null) {
                                    int LJIIIIZZ2 = (int) ((c47160If6.LJIIIIZZ(12) * 8.0d) / LJ);
                                    c47160If6.LJIILL = LJIIIIZZ2;
                                    c47160If6.LJJJJZ = LJIIIIZZ2;
                                }
                            }
                        }
                    }
                    return c47164IfA;
                } catch (Throwable unused) {
                    return str;
                }
            } catch (Throwable unused2) {
            }
        }
        return null;
    }
}
