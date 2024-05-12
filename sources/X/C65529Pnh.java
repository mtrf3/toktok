package X;

import java.util.Arrays;

/* renamed from: X.Pnh, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C65529Pnh extends AbstractC65539Pnr<Class<?>> {
    @Override // X.AbstractC65539Pnr
    public final Iterable<? extends Class<?>> LIZJ(Class<?> cls) {
        return Arrays.asList(cls.getInterfaces());
    }

    @Override // X.AbstractC65539Pnr
    public final Class LIZLLL(Class<?> cls) {
        return cls;
    }

    @Override // X.AbstractC65539Pnr
    public final Class<?> LJ(Class<?> cls) {
        return cls.getSuperclass();
    }
}
