package X;

import java.lang.reflect.ParameterizedType;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Pn4, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class EnumC65490Pn4 {
    public static final EnumC65490Pn4 LJLIL;
    public static final /* synthetic */ EnumC65490Pn4[] LJLILLLLZI = {new EnumC65490Pn4() { // from class: X.Pn6
        @Override // X.EnumC65490Pn4
        public final Class<?> LIZJ(Class<?> cls) {
            return cls.getEnclosingClass();
        }
    }, new EnumC65490Pn4() { // from class: X.Pn5
        @Override // X.EnumC65490Pn4
        public final Class<?> LIZJ(Class<?> cls) {
            if (cls.isLocalClass()) {
                return null;
            }
            return cls.getEnclosingClass();
        }
    }};

    /* JADX INFO: Fake field, exist only in values array */
    EnumC65490Pn4 EF2;

    public EnumC65490Pn4() {
        throw null;
    }

    public abstract Class<?> LIZJ(Class<?> cls);

    static {
        new C65494Pn8<String>() { // from class: X.Pn7
        };
        ParameterizedType parameterizedType = (ParameterizedType) C65493Pn7.class.getGenericSuperclass();
        for (EnumC65490Pn4 enumC65490Pn4 : values()) {
            if (enumC65490Pn4.LIZJ(C65494Pn8.class) == parameterizedType.getOwnerType()) {
                LJLIL = enumC65490Pn4;
                return;
            }
        }
        throw new AssertionError();
    }

    public static EnumC65490Pn4[] values() {
        return (EnumC65490Pn4[]) LJLILLLLZI.clone();
    }

    public static EnumC65490Pn4 valueOf(String str) {
        return (EnumC65490Pn4) V0N.LJJJ(EnumC65490Pn4.class, str);
    }

    public EnumC65490Pn4(String str, int i) {
    }
}
