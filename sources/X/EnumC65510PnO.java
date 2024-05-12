package X;

import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.Map;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.PnO, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class EnumC65510PnO {
    public static final C65508PnM LJLIL;
    public static final C65511PnP LJLILLLLZI;
    public static final EnumC65510PnO LJLJI;
    public static final /* synthetic */ EnumC65510PnO[] LJLJJI;

    public EnumC65510PnO() {
        throw null;
    }

    public abstract Type LIZJ(Type type);

    public abstract Type LJFF(Type type);

    static {
        EnumC65510PnO enumC65510PnO = new EnumC65510PnO() { // from class: X.PnL
            @Override // X.EnumC65510PnO
            public final Type LIZJ(Type type) {
                return new C65496PnA(type);
            }

            @Override // X.EnumC65510PnO
            public final Type LJFF(Type type) {
                type.getClass();
                if (type instanceof Class) {
                    Class cls = (Class) type;
                    if (cls.isArray()) {
                        return new C65496PnA(cls.getComponentType());
                    }
                    return type;
                }
                return type;
            }
        };
        C65508PnM c65508PnM = new C65508PnM();
        LJLIL = c65508PnM;
        C65511PnP c65511PnP = new C65511PnP();
        LJLILLLLZI = c65511PnP;
        C65509PnN c65509PnN = new C65509PnN();
        LJLJJI = new EnumC65510PnO[]{enumC65510PnO, c65508PnM, c65511PnP, c65509PnN};
        if (AnnotatedElement.class.isAssignableFrom(TypeVariable.class)) {
            if (new AbstractC65512PnQ<Map.Entry<String, int[][]>>() { // from class: X.PnR
            }.LIZ().toString().contains("java.util.Map.java.util.Map")) {
                LJLJI = c65511PnP;
                return;
            } else {
                LJLJI = c65509PnN;
                return;
            }
        }
        if (new AbstractC65512PnQ<int[]>() { // from class: X.PnS
        }.LIZ() instanceof Class) {
            LJLJI = c65508PnM;
        } else {
            LJLJI = enumC65510PnO;
        }
    }

    public static EnumC65510PnO[] values() {
        return (EnumC65510PnO[]) LJLJJI.clone();
    }

    public static EnumC65510PnO valueOf(String str) {
        return (EnumC65510PnO) V0N.LJJJ(EnumC65510PnO.class, str);
    }

    public String LIZLLL(Type type) {
        if (type instanceof Class) {
            return ((Class) type).getName();
        }
        return type.toString();
    }

    public final AbstractC65590Pog<Type> LJ(Type[] typeArr) {
        C65587Pod builder = AbstractC65590Pog.builder();
        for (Type type : typeArr) {
            builder.LIZIZ(LJFF(type));
        }
        return builder.LJ();
    }

    public EnumC65510PnO(String str, int i) {
    }
}
