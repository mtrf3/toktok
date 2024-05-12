package X;

import android.graphics.Region;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.o;

/* renamed from: X.INa, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C46506INa implements InvocationHandler {
    public Region LIZ;
    public Field LIZIZ;
    public Field LIZJ;
    public final C62822Ol8 LIZLLL = C221108m2.LIZIZ(new AqS158S0100000_8(this, 582));

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object proxy, Method method, Object[] args) {
        Object obj;
        Field field;
        o.LJIIIZ(proxy, "proxy");
        o.LJIIIZ(method, "method");
        o.LJIIIZ(args, "args");
        try {
            if (this.LIZIZ == null) {
                Field declaredField = args[0].getClass().getDeclaredField("touchableRegion");
                this.LIZIZ = declaredField;
                if (declaredField != null) {
                    declaredField.setAccessible(true);
                }
            }
            if (this.LIZJ == null) {
                Field declaredField2 = args[0].getClass().getDeclaredField("mTouchableInsets");
                this.LIZJ = declaredField2;
                if (declaredField2 != null) {
                    declaredField2.setAccessible(true);
                }
            }
            if (this.LIZ == null && (field = this.LIZJ) != null) {
                field.set(args[0], 0);
            }
            Region region = this.LIZ;
            if (region != null) {
                Field field2 = this.LIZIZ;
                if (field2 != null) {
                    obj = field2.get(args[0]);
                } else {
                    obj = null;
                }
                o.LJII(obj, "null cannot be cast to non-null type android.graphics.Region");
                ((Region) obj).set(region);
                Field field3 = this.LIZJ;
                if (field3 != null) {
                    field3.set(args[0], 3);
                }
            }
        } catch (Exception e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("OnComputeInternalInsetsListener invoke: ");
            LIZ.append(e);
            C78983UzD.LJIILL(X1D.LIZIZ(LIZ));
        }
        return C76800UCe.LIZ;
    }
}
