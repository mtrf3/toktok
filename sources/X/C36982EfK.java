package X;

import android.content.Context;
import com.bytedance.mt.protector.impl.UriProtector;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.o;

/* renamed from: X.EfK, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36982EfK {
    public static AbstractC36987EfP LIZIZ;
    public static Executor LIZJ;
    public static OSJ<String, Long, ? extends C36754Ebe> LIZLLL;
    public static C37000Efc LJ;
    public static Runnable LJFF;
    public static final C36982EfK LJII = new C36982EfK();
    public static final java.util.Map<String, InterfaceC37002Efe> LIZ = new LinkedHashMap();
    public static final C36983EfL LJI = new C36983EfL();

    public static InterfaceC37002Efe LIZIZ(String str) {
        String LJIJJ;
        InterfaceC37002Efe interfaceC37002Efe;
        try {
            android.net.Uri parse = UriProtector.parse(str);
            o.LJFF(parse, "Uri.parse(url)");
            LJIJJ = C79043V0l.LJIJJ(parse, "prefetch_business");
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
        if (LJIJJ != null && (interfaceC37002Efe = (InterfaceC37002Efe) ((LinkedHashMap) LIZ).get(LJIJJ)) != null) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("Get Processor: ");
            LIZ2.append(interfaceC37002Efe);
            LIZ2.append(" For Url: ");
            LIZ2.append(str);
            System.out.println((Object) X1D.LIZIZ(LIZ2));
            return interfaceC37002Efe;
        }
        C3C5.m7constructorimpl(null);
        return LIZIZ;
    }

    public static AbstractC36987EfP LIZ(Context context, File file, java.util.Map map) {
        C36607EYh c36607EYh = C36607EYh.LJLIL;
        C36984EfM c36984EfM = new C36984EfM();
        c36984EfM.LJII = false;
        Executor executor = LIZJ;
        if (executor != null) {
            c36984EfM.LIZIZ = executor;
            c36984EfM.LIZ = new C36817Ecf(context, "spark_prefetch_store");
            c36984EfM.LIZJ = c36607EYh;
            c36984EfM.LIZLLL = new C36941Eef(file, map);
            return c36984EfM.LIZ();
        }
        o.LJIIZILJ();
        throw null;
    }
}
