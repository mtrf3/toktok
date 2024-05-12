package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Lf9, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54807Lf9<T1, T2> implements InterfaceC73786Sxa {
    public C54807Lf9(AbstractC54806Lf8<SUBSCRIBE_DATA, OUTPUT_DATA> abstractC54806Lf8) {
    }

    @Override // X.InterfaceC73786Sxa
    public final boolean test(Object obj, Object obj2) {
        C54789Ler t1 = (C54789Ler) obj;
        C54789Ler t2 = (C54789Ler) obj2;
        o.LJIIIZ(t1, "t1");
        o.LJIIIZ(t2, "t2");
        TBW[] tbwArr = t2.LIZLLL;
        if (tbwArr == null) {
            return false;
        }
        for (TBW tbw : tbwArr) {
            if (tbw != null && o.LJ(tbw.get(t2.LIZIZ), tbw.get(t1.LIZIZ))) {
                return true;
            }
        }
        return false;
    }
}
