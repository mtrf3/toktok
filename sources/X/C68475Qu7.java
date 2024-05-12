package X;

import java.util.List;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.Qu7, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68475Qu7<T> implements InterfaceC86003Zc {
    public final /* synthetic */ C68474Qu6 LJLIL;
    public final /* synthetic */ String LJLILLLLZI;

    public C68475Qu7(C68474Qu6 c68474Qu6, String str) {
        this.LJLIL = c68474Qu6;
        this.LJLILLLLZI = str;
    }

    @Override // X.InterfaceC86003Zc
    public final void subscribe(InterfaceC73573Su9<Integer> interfaceC73573Su9) {
        long LIZJ;
        int index;
        EnumC68477Qu9 enumC68477Qu9;
        long j;
        Integer LJJIL;
        Long LJJIZ;
        C68474Qu6 c68474Qu6 = this.LJLIL;
        String id = this.LJLILLLLZI;
        c68474Qu6.getClass();
        o.LJIIIZ(id, "id");
        int i = 0;
        List LJLJJL = s.LJLJJL(id, new String[]{"_"}, 0, 6);
        String str = (String) ORZ.LJLLLLLL(2, LJLJJL);
        if (str != null && (LJJIZ = C38350F3i.LJJIZ(str)) != null) {
            LIZJ = LJJIZ.longValue();
        } else {
            LIZJ = C67257QaT.LIZJ(0);
        }
        String str2 = (String) ORZ.LJLLLLLL(3, LJLJJL);
        if (str2 != null && (LJJIL = C38350F3i.LJJIL(str2)) != null) {
            index = LJJIL.intValue();
        } else {
            index = EnumC68477Qu9.CURRENT.getIndex();
        }
        EnumC68477Qu9[] values = EnumC68477Qu9.values();
        int length = values.length;
        while (true) {
            if (i < length) {
                enumC68477Qu9 = values[i];
                if (enumC68477Qu9.getIndex() == index) {
                    break;
                } else {
                    i++;
                }
            } else {
                enumC68477Qu9 = EnumC68477Qu9.CURRENT;
                break;
            }
        }
        long LIZIZ = C67257QaT.LIZIZ(LIZJ, enumC68477Qu9);
        long currentTimeMillis = System.currentTimeMillis();
        if (C52260KfA.LIZ) {
            j = C52260KfA.LIZIZ;
        } else {
            j = 900000;
        }
        long j2 = currentTimeMillis + j;
        C68476Qu8 c68476Qu8 = new C68476Qu8(C68472Qu4.LIZ(2, index, LIZJ), 2, LIZJ, index, j2 - LIZIZ, j2, 1410);
        c68474Qu6.LJI().LJI(C123074sJ.LIZ);
        c68474Qu6.LJI().LJII(2);
        c68476Qu8.L("To insert:");
        c68474Qu6.LJI().LJFF(c68476Qu8);
        C68468Qu0.LIZ(2);
        C68468Qu0.LIZJ(c68476Qu8);
        interfaceC73573Su9.onNext(2);
    }
}
