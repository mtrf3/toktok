package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Qse, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68384Qse extends AbstractC68391Qsl {
    public C68384Qse() {
        ((ArrayList) this.LIZ).add(EnumC68385Qsf.FOR_IN);
        ((ArrayList) this.LIZ).add(EnumC68385Qsf.FOR_IN_CONST);
        ((ArrayList) this.LIZ).add(EnumC68385Qsf.FOR_IN_LET);
        ((ArrayList) this.LIZ).add(EnumC68385Qsf.FOR_LET);
        ((ArrayList) this.LIZ).add(EnumC68385Qsf.FOR_OF);
        ((ArrayList) this.LIZ).add(EnumC68385Qsf.FOR_OF_CONST);
        ((ArrayList) this.LIZ).add(EnumC68385Qsf.FOR_OF_LET);
        ((ArrayList) this.LIZ).add(EnumC68385Qsf.WHILE);
    }

    public static InterfaceC68379QsZ LIZJ(InterfaceC68405Qsz interfaceC68405Qsz, Iterator it, InterfaceC68379QsZ interfaceC68379QsZ) {
        if (it != null) {
            while (it.hasNext()) {
                InterfaceC68379QsZ LIZJ = interfaceC68405Qsz.LIZ((InterfaceC68379QsZ) it.next()).LIZJ((C68375QsV) interfaceC68379QsZ);
                if (LIZJ instanceof C68381Qsb) {
                    C68381Qsb c68381Qsb = (C68381Qsb) LIZJ;
                    if ("break".equals(c68381Qsb.LJLILLLLZI)) {
                        return InterfaceC68379QsZ.LJIIJ;
                    }
                    if ("return".equals(c68381Qsb.LJLILLLLZI)) {
                        return c68381Qsb;
                    }
                }
            }
        }
        return InterfaceC68379QsZ.LJIIJ;
    }

    public static InterfaceC68379QsZ LIZLLL(InterfaceC68405Qsz interfaceC68405Qsz, InterfaceC68379QsZ interfaceC68379QsZ, InterfaceC68379QsZ interfaceC68379QsZ2) {
        if (interfaceC68379QsZ instanceof Iterable) {
            return LIZJ(interfaceC68405Qsz, ((Iterable) interfaceC68379QsZ).iterator(), interfaceC68379QsZ2);
        }
        throw new IllegalArgumentException("Non-iterable type in for...of loop.");
    }

    @Override // X.AbstractC68391Qsl
    public final InterfaceC68379QsZ LIZ(String str, C68377QsX c68377QsX, List list) {
        int ordinal = C68368QsO.LJ(str).ordinal();
        if (ordinal != 65) {
            switch (ordinal) {
                case 26:
                    if (E2C.LIZIZ(EnumC68385Qsf.FOR_IN, 3, list, list, 0) instanceof C68376QsW) {
                        String LJII = ((InterfaceC68379QsZ) ListProtector.get(list, 0)).LJII();
                        InterfaceC68379QsZ LIZIZ = c68377QsX.LIZIZ((InterfaceC68379QsZ) ListProtector.get(list, 1));
                        return LIZJ(new C68394Qso(c68377QsX, LJII), LIZIZ.LJIIJ(), c68377QsX.LIZIZ((InterfaceC68379QsZ) ListProtector.get(list, 2)));
                    }
                    throw new IllegalArgumentException("Variable name in FOR_IN must be a string");
                case 27:
                    if (E2C.LIZIZ(EnumC68385Qsf.FOR_IN_CONST, 3, list, list, 0) instanceof C68376QsW) {
                        String LJII2 = ((InterfaceC68379QsZ) ListProtector.get(list, 0)).LJII();
                        InterfaceC68379QsZ LIZIZ2 = c68377QsX.LIZIZ((InterfaceC68379QsZ) ListProtector.get(list, 1));
                        return LIZJ(new C1FC(c68377QsX, LJII2), LIZIZ2.LJIIJ(), c68377QsX.LIZIZ((InterfaceC68379QsZ) ListProtector.get(list, 2)));
                    }
                    throw new IllegalArgumentException("Variable name in FOR_IN_CONST must be a string");
                case 28:
                    if (E2C.LIZIZ(EnumC68385Qsf.FOR_IN_LET, 3, list, list, 0) instanceof C68376QsW) {
                        String LJII3 = ((InterfaceC68379QsZ) ListProtector.get(list, 0)).LJII();
                        InterfaceC68379QsZ LIZIZ3 = c68377QsX.LIZIZ((InterfaceC68379QsZ) ListProtector.get(list, 1));
                        return LIZJ(new C68395Qsp(c68377QsX, LJII3), LIZIZ3.LJIIJ(), c68377QsX.LIZIZ((InterfaceC68379QsZ) ListProtector.get(list, 2)));
                    }
                    throw new IllegalArgumentException("Variable name in FOR_IN_LET must be a string");
                case 29:
                    InterfaceC68379QsZ LIZIZ4 = c68377QsX.LIZIZ((InterfaceC68379QsZ) E2C.LIZIZ(EnumC68385Qsf.FOR_LET, 4, list, list, 0));
                    if (LIZIZ4 instanceof C68375QsV) {
                        C68375QsV c68375QsV = (C68375QsV) LIZIZ4;
                        InterfaceC68379QsZ interfaceC68379QsZ = (InterfaceC68379QsZ) ListProtector.get(list, 1);
                        InterfaceC68379QsZ interfaceC68379QsZ2 = (InterfaceC68379QsZ) ListProtector.get(list, 2);
                        InterfaceC68379QsZ LIZIZ5 = c68377QsX.LIZIZ((InterfaceC68379QsZ) ListProtector.get(list, 3));
                        C68377QsX LIZ = c68377QsX.LIZ();
                        for (int i = 0; i < c68375QsV.LJIILLIIL(); i++) {
                            String LJII4 = c68375QsV.LJIIZILJ(i).LJII();
                            LIZ.LJFF(LJII4, c68377QsX.LIZLLL(LJII4));
                        }
                        while (c68377QsX.LIZIZ(interfaceC68379QsZ).LIZJ().booleanValue()) {
                            InterfaceC68379QsZ LIZJ = c68377QsX.LIZJ((C68375QsV) LIZIZ5);
                            if (LIZJ instanceof C68381Qsb) {
                                C68381Qsb c68381Qsb = (C68381Qsb) LIZJ;
                                if ("break".equals(c68381Qsb.LJLILLLLZI)) {
                                    return InterfaceC68379QsZ.LJIIJ;
                                }
                                if ("return".equals(c68381Qsb.LJLILLLLZI)) {
                                    return c68381Qsb;
                                }
                            }
                            C68377QsX LIZ2 = c68377QsX.LIZ();
                            for (int i2 = 0; i2 < c68375QsV.LJIILLIIL(); i2++) {
                                String LJII5 = c68375QsV.LJIIZILJ(i2).LJII();
                                LIZ2.LJFF(LJII5, LIZ.LIZLLL(LJII5));
                            }
                            LIZ2.LIZIZ(interfaceC68379QsZ2);
                            LIZ = LIZ2;
                        }
                        return InterfaceC68379QsZ.LJIIJ;
                    }
                    throw new IllegalArgumentException("Initializer variables in FOR_LET must be an ArrayList");
                case 30:
                    if (E2C.LIZIZ(EnumC68385Qsf.FOR_OF, 3, list, list, 0) instanceof C68376QsW) {
                        String LJII6 = ((InterfaceC68379QsZ) ListProtector.get(list, 0)).LJII();
                        return LIZLLL(new C68394Qso(c68377QsX, LJII6), c68377QsX.LIZIZ((InterfaceC68379QsZ) ListProtector.get(list, 1)), c68377QsX.LIZIZ((InterfaceC68379QsZ) ListProtector.get(list, 2)));
                    }
                    throw new IllegalArgumentException("Variable name in FOR_OF must be a string");
                case 31:
                    if (E2C.LIZIZ(EnumC68385Qsf.FOR_OF_CONST, 3, list, list, 0) instanceof C68376QsW) {
                        String LJII7 = ((InterfaceC68379QsZ) ListProtector.get(list, 0)).LJII();
                        return LIZLLL(new C1FC(c68377QsX, LJII7), c68377QsX.LIZIZ((InterfaceC68379QsZ) ListProtector.get(list, 1)), c68377QsX.LIZIZ((InterfaceC68379QsZ) ListProtector.get(list, 2)));
                    }
                    throw new IllegalArgumentException("Variable name in FOR_OF_CONST must be a string");
                case 32:
                    if (E2C.LIZIZ(EnumC68385Qsf.FOR_OF_LET, 3, list, list, 0) instanceof C68376QsW) {
                        String LJII8 = ((InterfaceC68379QsZ) ListProtector.get(list, 0)).LJII();
                        return LIZLLL(new C68395Qsp(c68377QsX, LJII8), c68377QsX.LIZIZ((InterfaceC68379QsZ) ListProtector.get(list, 1)), c68377QsX.LIZIZ((InterfaceC68379QsZ) ListProtector.get(list, 2)));
                    }
                    throw new IllegalArgumentException("Variable name in FOR_OF_LET must be a string");
                default:
                    LIZIZ(str);
                    throw null;
            }
        }
        InterfaceC68379QsZ interfaceC68379QsZ3 = (InterfaceC68379QsZ) E2C.LIZIZ(EnumC68385Qsf.WHILE, 4, list, list, 0);
        InterfaceC68379QsZ interfaceC68379QsZ4 = (InterfaceC68379QsZ) ListProtector.get(list, 1);
        InterfaceC68379QsZ interfaceC68379QsZ5 = (InterfaceC68379QsZ) ListProtector.get(list, 2);
        InterfaceC68379QsZ LIZIZ6 = c68377QsX.LIZIZ((InterfaceC68379QsZ) ListProtector.get(list, 3));
        if (c68377QsX.LIZIZ(interfaceC68379QsZ5).LIZJ().booleanValue()) {
            InterfaceC68379QsZ LIZJ2 = c68377QsX.LIZJ((C68375QsV) LIZIZ6);
            if (LIZJ2 instanceof C68381Qsb) {
                C68381Qsb c68381Qsb2 = (C68381Qsb) LIZJ2;
                if ("break".equals(c68381Qsb2.LJLILLLLZI)) {
                    return InterfaceC68379QsZ.LJIIJ;
                }
                if ("return".equals(c68381Qsb2.LJLILLLLZI)) {
                    return c68381Qsb2;
                }
            }
        }
        while (c68377QsX.LIZIZ(interfaceC68379QsZ3).LIZJ().booleanValue()) {
            InterfaceC68379QsZ LIZJ3 = c68377QsX.LIZJ((C68375QsV) LIZIZ6);
            if (LIZJ3 instanceof C68381Qsb) {
                C68381Qsb c68381Qsb3 = (C68381Qsb) LIZJ3;
                if ("break".equals(c68381Qsb3.LJLILLLLZI)) {
                    return InterfaceC68379QsZ.LJIIJ;
                }
                if ("return".equals(c68381Qsb3.LJLILLLLZI)) {
                    return c68381Qsb3;
                }
            }
            c68377QsX.LIZIZ(interfaceC68379QsZ4);
        }
        return InterfaceC68379QsZ.LJIIJ;
    }
}
