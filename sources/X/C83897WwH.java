package X;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;

/* renamed from: X.WwH, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83897WwH extends AbstractC65781Prl implements InterfaceC65784Pro<C83935Wwt> {
    public final /* synthetic */ C83899WwJ LJLIL;
    public final /* synthetic */ java.util.Map LJLILLLLZI;
    public final /* synthetic */ C83824Wv6 LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C83897WwH(C83899WwJ c83899WwJ, C65864Pt6 c65864Pt6, C83824Wv6 c83824Wv6) {
        super(0);
        this.LJLIL = c83899WwJ;
        this.LJLILLLLZI = c65864Pt6;
        this.LJLJI = c83824Wv6;
    }

    @Override // X.InterfaceC65784Pro
    public final C83935Wwt invoke() {
        C83898WwI LIZ = this.LJLIL.LIZ();
        this.LJLJI.getClass();
        LinkedHashMap<InterfaceC83847WvT, InterfaceC88472Yns<Object, C76800UCe>> linkedHashMap = LIZ.LJ;
        if (!linkedHashMap.isEmpty()) {
            List LLJI = ORZ.LLJI(linkedHashMap.values());
            if (!LLJI.isEmpty()) {
                ListIterator listIterator = LLJI.listIterator(LLJI.size());
                while (listIterator.hasPrevious()) {
                    ((InterfaceC88472Yns) listIterator.previous()).invoke(LIZ);
                }
            }
        }
        return LIZ.LJ(null, null, null);
    }
}
