package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.o;

/* renamed from: X.aJS, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92978aJS extends AbstractC65781Prl implements InterfaceC88471Ynr<InterfaceC536028m, C23360vs, InterfaceC273515n> {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ InterfaceC88471Ynr<InterfaceC24520xk, Integer, C76800UCe> LJLILLLLZI;
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ InterfaceC88471Ynr<InterfaceC24520xk, Integer, C76800UCe> LJLJJI;
    public final /* synthetic */ InterfaceC88471Ynr<InterfaceC24520xk, Integer, C76800UCe> LJLJJL;
    public final /* synthetic */ int LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C92978aJS(int i, InterfaceC88471Ynr<? super InterfaceC24520xk, ? super Integer, C76800UCe> interfaceC88471Ynr, int i2, InterfaceC88471Ynr<? super InterfaceC24520xk, ? super Integer, C76800UCe> interfaceC88471Ynr2, InterfaceC88471Ynr<? super InterfaceC24520xk, ? super Integer, C76800UCe> interfaceC88471Ynr3, int i3) {
        super(2);
        this.LJLIL = i;
        this.LJLILLLLZI = interfaceC88471Ynr;
        this.LJLJI = i2;
        this.LJLJJI = interfaceC88471Ynr2;
        this.LJLJJL = interfaceC88471Ynr3;
        this.LJLJJLL = i3;
    }

    @Override // X.InterfaceC88471Ynr
    public final InterfaceC273515n invoke(InterfaceC536028m interfaceC536028m, C23360vs c23360vs) {
        int i;
        InterfaceC273515n LJJLIL;
        InterfaceC536028m SubcomposeLayout = interfaceC536028m;
        long j = c23360vs.LIZ;
        o.LJIIIZ(SubcomposeLayout, "$this$SubcomposeLayout");
        int i2 = this.LJLIL;
        if (i2 >= 0 && i2 < C23360vs.LJII(j)) {
            List<InterfaceC39071g7> LJJJJL = SubcomposeLayout.LJJJJL("trailingContent", this.LJLILLLLZI);
            ArrayList arrayList = new ArrayList(C32I.LJJL(LJJJJL, 10));
            Iterator<InterfaceC39071g7> it = LJJJJL.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().LJJJIL(j));
            }
            if (!arrayList.isEmpty()) {
                Iterator it2 = arrayList.iterator();
                if (it2.hasNext()) {
                    i = ((AbstractC39201gK) it2.next()).LJLIL;
                    while (it2.hasNext()) {
                        int i3 = ((AbstractC39201gK) it2.next()).LJLIL;
                        if (i < i3) {
                            i = i3;
                        }
                    }
                } else {
                    throw new NoSuchElementException();
                }
            } else {
                i = 0;
            }
            long LIZ = C23360vs.LIZ(j, 0, (C23360vs.LJII(j) - i) - this.LJLJI, 0, 0, 13);
            List<InterfaceC39071g7> LJJJJL2 = SubcomposeLayout.LJJJJL("mainContent", this.LJLJJI);
            ArrayList arrayList2 = new ArrayList(C32I.LJJL(LJJJJL2, 10));
            Iterator<InterfaceC39071g7> it3 = LJJJJL2.iterator();
            while (it3.hasNext()) {
                arrayList2.add(it3.next().LJJJIL(LIZ));
            }
            List<InterfaceC39071g7> LJJJJL3 = SubcomposeLayout.LJJJJL("subContent", this.LJLJJL);
            int i4 = this.LJLIL;
            ArrayList arrayList3 = new ArrayList(C32I.LJJL(LJJJJL3, 10));
            Iterator<InterfaceC39071g7> it4 = LJJJJL3.iterator();
            while (it4.hasNext()) {
                arrayList3.add(it4.next().LJJJIL(C23360vs.LIZ(LIZ, 0, C23360vs.LJII(LIZ) - i4, 0, 0, 13)));
            }
            Iterator it5 = arrayList2.iterator();
            int i5 = 0;
            while (it5.hasNext()) {
                i5 += ((AbstractC39201gK) it5.next()).LJLILLLLZI;
            }
            Iterator it6 = arrayList3.iterator();
            int i6 = 0;
            while (it6.hasNext()) {
                i6 += ((AbstractC39201gK) it6.next()).LJLILLLLZI;
            }
            arrayList2.size();
            arrayList3.size();
            LJJLIL = SubcomposeLayout.LJJLIL(C23360vs.LJII(j), i5 + i6, C113554cx.LJJJLIIL(), new C92977aJR(arrayList2, arrayList3, j, i, arrayList, this.LJLJJLL, this.LJLIL));
            return LJJLIL;
        }
        throw new IllegalArgumentException("subItemOffsetX is not suitable");
    }
}
