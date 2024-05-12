package X;

import android.content.Context;
import com.zhiliaoapp.musically.R;
import java.io.File;
import java.lang.reflect.Method;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.0F3, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0F3 {
    public Object LIZ;

    public static Object LIZ(Method method, Object[] objArr) {
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(110000, "java/lang/reflect/Method", "invoke", method, new Object[]{null, objArr}, "java.lang.Object", new C65300Pk0(true, "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "6951029524549631535"));
        return LIZJ.LIZ ? LIZJ.LIZIZ : method.invoke(null, objArr);
    }

    public final Object LIZIZ() {
        try {
            return LIZ(Class.forName("p83.a").getMethod("getAdvertisingIdInfo", Context.class), new Object[]{(Context) this.LIZ});
        } catch (Exception unused) {
            C65265PjR.LIZIZ().getClass();
            return null;
        }
    }

    public C0F3() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String LJIILJJIL = C15380j0.LJIILJJIL(R.string.l36);
        o.LJIIIIZZ(LJIILJJIL, "getString(R.string.pm_ex…eUS_oldUserBannerV1_desc)");
        linkedHashMap.put(1, LJIILJJIL);
        String LJIILJJIL2 = C15380j0.LJIILJJIL(R.string.l31);
        o.LJIIIIZZ(LJIILJJIL2, "getString(R.string.pm_ex…eUS_newUserBannerV1_desc)");
        linkedHashMap.put(2, LJIILJJIL2);
        this.LIZ = linkedHashMap;
    }

    public /* synthetic */ C0F3(String str) {
        String LJIIL = C1PH.LJIIL(str);
        this.LIZ = LJIIL != null ? LJIIL : str;
    }

    public /* synthetic */ C0F3(Context context) {
        this.LIZ = C16880lQ.LLLLL(context);
    }

    public /* synthetic */ C0F3(String str, String str2) {
        String LJIIL = C1PH.LJIIL(str);
        if (LJIIL != null) {
            this.LIZ = new File(LJIIL, str2).getPath();
        } else {
            this.LIZ = new File(str, str2).getPath();
        }
    }
}
