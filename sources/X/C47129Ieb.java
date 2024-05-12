package X;

import com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import java.lang.reflect.Method;

/* renamed from: X.Ieb, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47129Ieb {
    public boolean LIZ;
    public OnUIPlayListener LIZIZ;
    public OnUIPlayListener LIZJ;
    public int LIZLLL = 1;
    public final C62822Ol8 LJ = C221108m2.LIZIZ(C46750IWk.LJLIL);

    public static Object LIZ(OnUIPlayListener onUIPlayListener, Method method, Object[] objArr) {
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(110000, "java/lang/reflect/Method", "invoke", method, new Object[]{onUIPlayListener, objArr}, "java.lang.Object", new C65300Pk0(true, "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "6527782493778987893"));
        return LIZJ.LIZ ? LIZJ.LIZIZ : method.invoke(onUIPlayListener, objArr);
    }
}
