package X;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: X.Pkq, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65352Pkq {
    public static final C65351Pkp LIZ;
    public static final InterfaceC65350Pko[] LIZIZ;

    static {
        C65351Pkp c65351Pkp = null;
        try {
            c65351Pkp = (C65351Pkp) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (c65351Pkp == null) {
            c65351Pkp = new C65351Pkp();
        }
        LIZ = c65351Pkp;
        LIZIZ = new InterfaceC65350Pko[0];
    }

    public static C65776Prg LIZ(Class cls) {
        LIZ.getClass();
        return new C65776Prg(cls);
    }

    public static C65338Pkc LIZJ(C65338Pkc c65338Pkc) {
        LIZ.getClass();
        return new C65338Pkc(c65338Pkc.LJLIL, c65338Pkc.LJLILLLLZI, c65338Pkc.LJLJI, c65338Pkc.LJLJJI | 2);
    }

    public static C65338Pkc LIZLLL(Class cls) {
        C65351Pkp c65351Pkp = LIZ;
        C65776Prg LIZ2 = LIZ(cls);
        List emptyList = Collections.emptyList();
        c65351Pkp.getClass();
        return C65351Pkp.LIZIZ(LIZ2, emptyList, true);
    }

    public static C65338Pkc LJI(Class cls) {
        C65351Pkp c65351Pkp = LIZ;
        C65776Prg LIZ2 = LIZ(cls);
        List emptyList = Collections.emptyList();
        c65351Pkp.getClass();
        return C65351Pkp.LIZIZ(LIZ2, emptyList, false);
    }

    public static C65353Pkr LIZIZ(Class cls, String str) {
        LIZ.getClass();
        return new C65353Pkr(cls, str);
    }

    public static C65338Pkc LJ(Class cls, C65337Pkb c65337Pkb) {
        C65351Pkp c65351Pkp = LIZ;
        C65776Prg LIZ2 = LIZ(cls);
        List singletonList = Collections.singletonList(c65337Pkb);
        c65351Pkp.getClass();
        return C65351Pkp.LIZIZ(LIZ2, singletonList, true);
    }

    public static C65338Pkc LJII(Class cls, C65337Pkb c65337Pkb) {
        C65351Pkp c65351Pkp = LIZ;
        C65776Prg LIZ2 = LIZ(cls);
        List singletonList = Collections.singletonList(c65337Pkb);
        c65351Pkp.getClass();
        return C65351Pkp.LIZIZ(LIZ2, singletonList, false);
    }

    public static C65338Pkc LJFF(Class cls, C65337Pkb c65337Pkb, C65337Pkb c65337Pkb2) {
        C65351Pkp c65351Pkp = LIZ;
        C65776Prg LIZ2 = LIZ(cls);
        List asList = Arrays.asList(c65337Pkb, c65337Pkb2);
        c65351Pkp.getClass();
        return C65351Pkp.LIZIZ(LIZ2, asList, true);
    }

    public static C65338Pkc LJIIIIZZ(Class cls, C65337Pkb c65337Pkb, C65337Pkb c65337Pkb2) {
        C65351Pkp c65351Pkp = LIZ;
        C65776Prg LIZ2 = LIZ(cls);
        List asList = Arrays.asList(c65337Pkb, c65337Pkb2);
        c65351Pkp.getClass();
        return C65351Pkp.LIZIZ(LIZ2, asList, false);
    }
}
