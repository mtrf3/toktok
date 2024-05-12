package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Qsk, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68390Qsk extends AbstractC68391Qsl {
    public C68390Qsk() {
        ((ArrayList) this.LIZ).add(EnumC68385Qsf.AND);
        ((ArrayList) this.LIZ).add(EnumC68385Qsf.NOT);
        ((ArrayList) this.LIZ).add(EnumC68385Qsf.OR);
    }

    @Override // X.AbstractC68391Qsl
    public final InterfaceC68379QsZ LIZ(String str, C68377QsX c68377QsX, List list) {
        int ordinal = C68368QsO.LJ(str).ordinal();
        if (ordinal != 1) {
            if (ordinal != 47) {
                if (ordinal == 50) {
                    InterfaceC68379QsZ LIZIZ = c68377QsX.LIZIZ((InterfaceC68379QsZ) E2C.LIZIZ(EnumC68385Qsf.OR, 2, list, list, 0));
                    if (LIZIZ.LIZJ().booleanValue()) {
                        return LIZIZ;
                    }
                    return c68377QsX.LIZIZ((InterfaceC68379QsZ) ListProtector.get(list, 1));
                }
                LIZIZ(str);
                throw null;
            }
            return new C68365QsL(Boolean.valueOf(!c68377QsX.LIZIZ((InterfaceC68379QsZ) E2C.LIZIZ(EnumC68385Qsf.NOT, 1, list, list, 0)).LIZJ().booleanValue()));
        }
        InterfaceC68379QsZ LIZIZ2 = c68377QsX.LIZIZ((InterfaceC68379QsZ) E2C.LIZIZ(EnumC68385Qsf.AND, 2, list, list, 0));
        if (!LIZIZ2.LIZJ().booleanValue()) {
            return LIZIZ2;
        }
        return c68377QsX.LIZIZ((InterfaceC68379QsZ) ListProtector.get(list, 1));
    }
}
