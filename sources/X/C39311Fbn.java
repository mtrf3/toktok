package X;

import android.content.Context;
import java.lang.reflect.Method;
import kotlin.jvm.internal.o;

/* renamed from: X.Fbn, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39311Fbn implements InterfaceC39320Fbw {
    public final Context LIZ;

    @Override // X.InterfaceC39320Fbw
    public final boolean LIZIZ() {
        return false;
    }

    public C39311Fbn(Context context) {
        this.LIZ = context;
    }

    @Override // X.InterfaceC39320Fbw
    public final C39316Fbs LIZ(C39316Fbs preInstallResult) {
        String str;
        Method method;
        Object invoke;
        o.LJIIIZ(preInstallResult, "preInstallResult");
        C39319Fbv c39319Fbv = preInstallResult.LIZIZ;
        try {
            str = C16880lQ.LLLLLLZ(this.LIZ.getPackageManager(), this.LIZ.getPackageName(), 0).packageName;
            Class<?> cls = Class.forName("miui.os.MiuiInit");
            Method method2 = cls.getMethod("isPreinstalledPackage", String.class);
            o.LJIIIIZZ(method2, "miui.getMethod(\"isPreins…age\", String::class.java)");
            method = cls.getMethod("isPreinstalledPAIPackage", String.class);
            o.LJIIIIZZ(method, "miui.getMethod(\"isPreins…age\", String::class.java)");
            invoke = method2.invoke(null, str);
        } catch (Exception unused) {
            c39319Fbv.getClass();
            c39319Fbv.LJLIL = "error";
            c39319Fbv.LJLILLLLZI = "error";
        }
        if (invoke != null) {
            c39319Fbv.getClass();
            c39319Fbv.LJLIL = (String) invoke;
            Object invoke2 = method.invoke(null, str);
            if (invoke2 != null) {
                c39319Fbv.LJLILLLLZI = (String) invoke2;
                return preInstallResult;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
    }
}
