package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Qsc, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68382Qsc extends AbstractC68391Qsl {
    public C68382Qsc() {
        ((ArrayList) this.LIZ).add(EnumC68385Qsf.APPLY);
        ((ArrayList) this.LIZ).add(EnumC68385Qsf.BLOCK);
        ((ArrayList) this.LIZ).add(EnumC68385Qsf.BREAK);
        ((ArrayList) this.LIZ).add(EnumC68385Qsf.CASE);
        ((ArrayList) this.LIZ).add(EnumC68385Qsf.DEFAULT);
        ((ArrayList) this.LIZ).add(EnumC68385Qsf.CONTINUE);
        ((ArrayList) this.LIZ).add(EnumC68385Qsf.DEFINE_FUNCTION);
        ((ArrayList) this.LIZ).add(EnumC68385Qsf.FN);
        ((ArrayList) this.LIZ).add(EnumC68385Qsf.IF);
        ((ArrayList) this.LIZ).add(EnumC68385Qsf.QUOTE);
        ((ArrayList) this.LIZ).add(EnumC68385Qsf.RETURN);
        ((ArrayList) this.LIZ).add(EnumC68385Qsf.SWITCH);
        ((ArrayList) this.LIZ).add(EnumC68385Qsf.TERNARY);
    }

    public static C68378QsY LIZJ(C68377QsX c68377QsX, List list) {
        C68368QsO.LJIIIIZZ(2, EnumC68385Qsf.FN.name(), list);
        InterfaceC68379QsZ LIZIZ = c68377QsX.LIZIZ((InterfaceC68379QsZ) ListProtector.get(list, 0));
        InterfaceC68379QsZ LIZIZ2 = c68377QsX.LIZIZ((InterfaceC68379QsZ) ListProtector.get(list, 1));
        if (LIZIZ2 instanceof C68375QsV) {
            List LJIL = ((C68375QsV) LIZIZ2).LJIL();
            List arrayList = new ArrayList();
            ArrayList arrayList2 = (ArrayList) list;
            if (arrayList2.size() > 2) {
                arrayList = arrayList2.subList(2, arrayList2.size());
            }
            return new C68378QsY(LIZIZ.LJII(), LJIL, arrayList, c68377QsX);
        }
        throw new IllegalArgumentException(C16880lQ.LLLZ("FN requires an ArrayValue of parameter names found %s", new Object[]{C16880lQ.LJLLILLLL(LIZIZ2.getClass())}));
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x0115, code lost:
    
        if (r1.equals("continue") == false) goto L61;
     */
    @Override // X.AbstractC68391Qsl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.InterfaceC68379QsZ LIZ(java.lang.String r9, X.C68377QsX r10, java.util.List r11) {
        /*
            Method dump skipped, instructions count: 602
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C68382Qsc.LIZ(java.lang.String, X.QsX, java.util.List):X.QsZ");
    }
}
