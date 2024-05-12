package X;

import java.lang.reflect.InvocationTargetException;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* renamed from: X.0Sz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C07970Sz {
    public static final C0T1 LIZ;

    static {
        C0T1 c79004UzY;
        try {
            c79004UzY = new C1M7((WebViewProviderFactoryBoundaryInterface) EMD.LIZ(WebViewProviderFactoryBoundaryInterface.class, C0T0.LIZ()));
        } catch (ClassNotFoundException unused) {
            c79004UzY = new C79004UzY();
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (NoSuchMethodException e2) {
            throw new RuntimeException(e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
        LIZ = c79004UzY;
    }
}
