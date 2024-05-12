package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Qsi, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68388Qsi extends AbstractC68391Qsl {
    public C68388Qsi() {
        ((ArrayList) this.LIZ).add(EnumC68385Qsf.ADD);
        ((ArrayList) this.LIZ).add(EnumC68385Qsf.DIVIDE);
        ((ArrayList) this.LIZ).add(EnumC68385Qsf.MODULUS);
        ((ArrayList) this.LIZ).add(EnumC68385Qsf.MULTIPLY);
        ((ArrayList) this.LIZ).add(EnumC68385Qsf.NEGATE);
        ((ArrayList) this.LIZ).add(EnumC68385Qsf.POST_DECREMENT);
        ((ArrayList) this.LIZ).add(EnumC68385Qsf.POST_INCREMENT);
        ((ArrayList) this.LIZ).add(EnumC68385Qsf.PRE_DECREMENT);
        ((ArrayList) this.LIZ).add(EnumC68385Qsf.PRE_INCREMENT);
        ((ArrayList) this.LIZ).add(EnumC68385Qsf.SUBTRACT);
    }

    @Override // X.AbstractC68391Qsl
    public final InterfaceC68379QsZ LIZ(String str, C68377QsX c68377QsX, List list) {
        int ordinal = C68368QsO.LJ(str).ordinal();
        if (ordinal != 0) {
            if (ordinal != 21) {
                if (ordinal != 59) {
                    if (ordinal != 52 && ordinal != 53) {
                        if (ordinal != 55 && ordinal != 56) {
                            switch (ordinal) {
                                case 44:
                                    return new C68366QsM(Double.valueOf(c68377QsX.LIZIZ((InterfaceC68379QsZ) E2C.LIZIZ(EnumC68385Qsf.MODULUS, 2, list, list, 0)).LJI().doubleValue() % c68377QsX.LIZIZ((InterfaceC68379QsZ) ListProtector.get(list, 1)).LJI().doubleValue()));
                                case 45:
                                    return new C68366QsM(Double.valueOf(c68377QsX.LIZIZ((InterfaceC68379QsZ) E2C.LIZIZ(EnumC68385Qsf.MULTIPLY, 2, list, list, 0)).LJI().doubleValue() * c68377QsX.LIZIZ((InterfaceC68379QsZ) ListProtector.get(list, 1)).LJI().doubleValue()));
                                case 46:
                                    return new C68366QsM(Double.valueOf(-c68377QsX.LIZIZ((InterfaceC68379QsZ) E2C.LIZIZ(EnumC68385Qsf.NEGATE, 1, list, list, 0)).LJI().doubleValue()));
                                default:
                                    LIZIZ(str);
                                    throw null;
                            }
                        }
                        C68368QsO.LJII(1, str, list);
                        return c68377QsX.LIZIZ((InterfaceC68379QsZ) ListProtector.get(list, 0));
                    }
                    C68368QsO.LJII(2, str, list);
                    InterfaceC68379QsZ LIZIZ = c68377QsX.LIZIZ((InterfaceC68379QsZ) ListProtector.get(list, 0));
                    c68377QsX.LIZIZ((InterfaceC68379QsZ) ListProtector.get(list, 1));
                    return LIZIZ;
                }
                InterfaceC68379QsZ LIZIZ2 = c68377QsX.LIZIZ((InterfaceC68379QsZ) E2C.LIZIZ(EnumC68385Qsf.SUBTRACT, 2, list, list, 0));
                C68366QsM c68366QsM = new C68366QsM(Double.valueOf(-c68377QsX.LIZIZ((InterfaceC68379QsZ) ListProtector.get(list, 1)).LJI().doubleValue()));
                return new C68366QsM(Double.valueOf(c68366QsM.LJLIL.doubleValue() + LIZIZ2.LJI().doubleValue()));
            }
            return new C68366QsM(Double.valueOf(c68377QsX.LIZIZ((InterfaceC68379QsZ) E2C.LIZIZ(EnumC68385Qsf.DIVIDE, 2, list, list, 0)).LJI().doubleValue() / c68377QsX.LIZIZ((InterfaceC68379QsZ) ListProtector.get(list, 1)).LJI().doubleValue()));
        }
        InterfaceC68379QsZ LIZIZ3 = c68377QsX.LIZIZ((InterfaceC68379QsZ) E2C.LIZIZ(EnumC68385Qsf.ADD, 2, list, list, 0));
        InterfaceC68379QsZ LIZIZ4 = c68377QsX.LIZIZ((InterfaceC68379QsZ) ListProtector.get(list, 1));
        if ((LIZIZ3 instanceof InterfaceC68406Qt0) || (LIZIZ3 instanceof C68376QsW) || (LIZIZ4 instanceof InterfaceC68406Qt0) || (LIZIZ4 instanceof C68376QsW)) {
            return new C68376QsW(String.valueOf(LIZIZ3.LJII()).concat(String.valueOf(LIZIZ4.LJII())));
        }
        return new C68366QsM(Double.valueOf(LIZIZ4.LJI().doubleValue() + LIZIZ3.LJI().doubleValue()));
    }
}
