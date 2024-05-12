package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Qsj, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68389Qsj extends AbstractC68391Qsl {
    public C68389Qsj() {
        ((ArrayList) this.LIZ).add(EnumC68385Qsf.BITWISE_AND);
        ((ArrayList) this.LIZ).add(EnumC68385Qsf.BITWISE_LEFT_SHIFT);
        ((ArrayList) this.LIZ).add(EnumC68385Qsf.BITWISE_NOT);
        ((ArrayList) this.LIZ).add(EnumC68385Qsf.BITWISE_OR);
        ((ArrayList) this.LIZ).add(EnumC68385Qsf.BITWISE_RIGHT_SHIFT);
        ((ArrayList) this.LIZ).add(EnumC68385Qsf.BITWISE_UNSIGNED_RIGHT_SHIFT);
        ((ArrayList) this.LIZ).add(EnumC68385Qsf.BITWISE_XOR);
    }

    @Override // X.AbstractC68391Qsl
    public final InterfaceC68379QsZ LIZ(String str, C68377QsX c68377QsX, List list) {
        switch (C68368QsO.LJ(str).ordinal()) {
            case 4:
                return new C68366QsM(Double.valueOf(C68368QsO.LIZIZ(c68377QsX.LIZIZ((InterfaceC68379QsZ) E2C.LIZIZ(EnumC68385Qsf.BITWISE_AND, 2, list, list, 0)).LJI().doubleValue()) & C68368QsO.LIZIZ(c68377QsX.LIZIZ((InterfaceC68379QsZ) ListProtector.get(list, 1)).LJI().doubleValue())));
            case 5:
                return new C68366QsM(Double.valueOf(C68368QsO.LIZIZ(c68377QsX.LIZIZ((InterfaceC68379QsZ) E2C.LIZIZ(EnumC68385Qsf.BITWISE_LEFT_SHIFT, 2, list, list, 0)).LJI().doubleValue()) << ((int) (C68368QsO.LIZLLL(c68377QsX.LIZIZ((InterfaceC68379QsZ) ListProtector.get(list, 1)).LJI().doubleValue()) & 31))));
            case 6:
                return new C68366QsM(Double.valueOf(~C68368QsO.LIZIZ(c68377QsX.LIZIZ((InterfaceC68379QsZ) E2C.LIZIZ(EnumC68385Qsf.BITWISE_NOT, 1, list, list, 0)).LJI().doubleValue())));
            case 7:
                return new C68366QsM(Double.valueOf(C68368QsO.LIZIZ(c68377QsX.LIZIZ((InterfaceC68379QsZ) E2C.LIZIZ(EnumC68385Qsf.BITWISE_OR, 2, list, list, 0)).LJI().doubleValue()) | C68368QsO.LIZIZ(c68377QsX.LIZIZ((InterfaceC68379QsZ) ListProtector.get(list, 1)).LJI().doubleValue())));
            case 8:
                return new C68366QsM(Double.valueOf(C68368QsO.LIZIZ(c68377QsX.LIZIZ((InterfaceC68379QsZ) E2C.LIZIZ(EnumC68385Qsf.BITWISE_RIGHT_SHIFT, 2, list, list, 0)).LJI().doubleValue()) >> ((int) (C68368QsO.LIZLLL(c68377QsX.LIZIZ((InterfaceC68379QsZ) ListProtector.get(list, 1)).LJI().doubleValue()) & 31))));
            case 9:
                return new C68366QsM(Double.valueOf(C68368QsO.LIZLLL(c68377QsX.LIZIZ((InterfaceC68379QsZ) E2C.LIZIZ(EnumC68385Qsf.BITWISE_UNSIGNED_RIGHT_SHIFT, 2, list, list, 0)).LJI().doubleValue()) >>> ((int) (C68368QsO.LIZLLL(c68377QsX.LIZIZ((InterfaceC68379QsZ) ListProtector.get(list, 1)).LJI().doubleValue()) & 31))));
            case 10:
                return new C68366QsM(Double.valueOf(C68368QsO.LIZIZ(c68377QsX.LIZIZ((InterfaceC68379QsZ) E2C.LIZIZ(EnumC68385Qsf.BITWISE_XOR, 2, list, list, 0)).LJI().doubleValue()) ^ C68368QsO.LIZIZ(c68377QsX.LIZIZ((InterfaceC68379QsZ) ListProtector.get(list, 1)).LJI().doubleValue())));
            default:
                LIZIZ(str);
                throw null;
        }
    }
}
