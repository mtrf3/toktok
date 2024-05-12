package X;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

/* renamed from: X.EdO, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C36862EdO implements GenericArrayType {
    public final Type LJLIL;

    @Override // java.lang.reflect.GenericArrayType
    public final Type getGenericComponentType() {
        return this.LJLIL;
    }

    public C36862EdO(Type type) {
        this.LJLIL = type;
    }
}
