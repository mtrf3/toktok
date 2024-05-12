package X;

import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: X.Iko, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47514Iko extends C78891Uxj {
    public final C32151Nz LIZJ = new C32151Nz();

    @Override // X.C78891Uxj, X.InterfaceC78893Uxl
    public final void LIZ(View view, int i, int i2, int i3, int i4) {
        this.LIZJ.getClass();
        if (!C32151Nz.LJLJI) {
            try {
                Class cls = Integer.TYPE;
                Method declaredMethod = View.class.getDeclaredMethod("setLeftTopRightBottom", cls, cls, cls, cls);
                C32151Nz.LJLILLLLZI = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            C32151Nz.LJLJI = true;
        }
        Method method = C32151Nz.LJLILLLLZI;
        if (method != null) {
            try {
                C32151Nz.LJIIJ(view, method, new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)});
            } catch (IllegalAccessException unused2) {
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e.getCause());
            }
        }
    }
}
