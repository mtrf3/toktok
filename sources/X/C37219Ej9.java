package X;

import android.os.Handler;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.retrofit2.mime.TypedOutput;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.Ej9, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37219Ej9 {
    public static final C5H3 LIZ;
    public static final C5H3 LIZIZ;
    public static final C5H3 LIZJ;
    public static final java.util.Map<String, Long> LIZLLL;
    public static long LJ;
    public static int LJFF;
    public static final C62822Ol8 LJI;
    public static final RunnableC37218Ej8 LJII;

    static {
        EnumC221088m0 enumC221088m0 = EnumC221088m0.NONE;
        LIZ = C221108m2.LIZ(enumC221088m0, C37223EjD.LJLIL);
        LIZIZ = C221108m2.LIZ(enumC221088m0, C37222EjC.LJLIL);
        LIZJ = C221108m2.LIZ(enumC221088m0, C37220EjA.LJLIL);
        LIZLLL = new LinkedHashMap();
        LJI = C221108m2.LIZIZ(C37221EjB.LJLIL);
        LJII = RunnableC37218Ej8.LJLIL;
    }

    public static int LIZIZ() {
        return ((Number) LIZ.getValue()).intValue();
    }

    public static void LIZLLL() {
        LJ = System.currentTimeMillis();
        ((Handler) LJI.getValue()).postDelayed(LJII, ((Number) LIZIZ.getValue()).longValue());
    }

    public static boolean LIZ(Request request) {
        if (LIZIZ() != 0) {
            if (!ORY.LJJIJIIJIL(request.getPath(), (Object[]) LIZJ.getValue())) {
                boolean z = false;
                if (o.LJ("GET", request.getMethod())) {
                    return false;
                }
                if (!o.LJ("POST", request.getMethod())) {
                    return true;
                }
                String mimeType = request.getBody().mimeType();
                o.LJIIIIZZ(mimeType, "mimeType");
                if (s.LJJJLZIJ(mimeType, "application/x-www-form-urlencoded", false) || s.LJJJLZIJ(mimeType, "application/json", false)) {
                    z = true;
                }
                return !z;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v5, types: [T, java.lang.String] */
    public static void LIZJ(Request request, C64797Pbt c64797Pbt, long j, String str) {
        TypedOutput body;
        String md5Stub;
        for (EJ6 ej6 : c64797Pbt.LIZ.LIZLLL) {
            if (o.LJ("x-tt-logid", ej6.LIZ)) {
                String str2 = ej6.LIZIZ;
                C68322mC c68322mC = new C68322mC();
                c68322mC.element = request.getUrl();
                if (o.LJ(request.getMethod(), "POST") && (body = request.getBody()) != null && (md5Stub = body.md5Stub()) != null) {
                    StringBuilder LIZ2 = X1D.LIZ();
                    c68322mC.element = C025908h.LIZIZ(LIZ2, (String) c68322mC.element, "&postbodymd5=", md5Stub, LIZ2);
                }
                ((Handler) LJI.getValue()).post(new RunnableC37217Ej7(c68322mC, request, j, str2, str));
                return;
            }
        }
    }
}
