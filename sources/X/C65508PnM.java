package X;

import java.lang.reflect.Array;
import java.lang.reflect.Type;

/* renamed from: X.PnM, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public enum C65508PnM extends EnumC65510PnO {
    public C65508PnM() {
        super("JAVA7", 1);
    }

    @Override // X.EnumC65510PnO
    public final Type LIZJ(Type type) {
        if (type instanceof Class) {
            return Array.newInstance((Class<?>) type, 0).getClass();
        }
        return new C65496PnA(type);
    }

    @Override // X.EnumC65510PnO
    public final Type LJFF(Type type) {
        type.getClass();
        return type;
    }
}
