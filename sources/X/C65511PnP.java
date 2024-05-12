package X;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Type;

/* renamed from: X.PnP, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public enum C65511PnP extends EnumC65510PnO {
    public C65511PnP() {
        super("JAVA8", 2);
    }

    @Override // X.EnumC65510PnO
    public final Type LIZJ(Type type) {
        return EnumC65510PnO.LJLIL.LIZJ(type);
    }

    @Override // X.EnumC65510PnO
    public final String LIZLLL(Type type) {
        try {
            return (String) Type.class.getMethod("getTypeName", new Class[0]).invoke(type, new Object[0]);
        } catch (IllegalAccessException e) {
            e = e;
            throw new RuntimeException(e);
        } catch (NoSuchMethodException unused) {
            throw new AssertionError("Type.getTypeName should be available in Java 8");
        } catch (InvocationTargetException e2) {
            e = e2;
            throw new RuntimeException(e);
        }
    }

    @Override // X.EnumC65510PnO
    public final Type LJFF(Type type) {
        type.getClass();
        return type;
    }
}
