package X;

import java.util.Collection;
import java.util.List;
import java.util.SortedMap;
import kotlin.jvm.internal.AqS153S0200000_6;
import kotlin.jvm.internal.AqS68S0000000_6;
import kotlin.jvm.internal.o;

/* renamed from: X.Ebt, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36769Ebt implements InterfaceC36990EfS {
    public final InterfaceC36771Ebv LIZ;
    public final InterfaceC36736EbM LIZIZ;
    public final InterfaceC36766Ebq LIZJ;
    public final java.util.Map<String, InterfaceC65784Pro<Boolean>> LIZLLL;
    public final List<InterfaceC36772Ebw> LJ;

    @Override // X.InterfaceC36990EfS
    public final List<C36760Ebk> LIZ(String str) {
        System.currentTimeMillis();
        return this.LIZ.LJ(str, this.LIZJ);
    }

    @Override // X.InterfaceC36990EfS
    public final void LIZJ(String url) {
        List<String> list;
        o.LJIIJ(url, "url");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Start prefetch, page scheme: ");
        LIZ.append(url);
        C36762Ebm.LIZJ(X1D.LIZIZ(LIZ));
        List<InterfaceC36772Ebw> list2 = this.LJ;
        if (list2 != null) {
            C115524g8 c115524g8 = new C115524g8(OJ4.LJJJJ(ORZ.LJLIIIL(list2), new AqS68S0000000_6(url, 1)));
            String str = url;
            while (c115524g8.hasNext()) {
                str = ((InterfaceC36772Ebw) c115524g8.next()).convert();
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("Scheme convert to [schema:");
                LIZ2.append(str);
                LIZ2.append("], origin_scheme:");
                LIZ2.append(url);
                C36762Ebm.LIZ(X1D.LIZIZ(LIZ2));
            }
            url = str;
        }
        C36730EbG c36730EbG = new C36730EbG(url);
        OSZ<Collection<C36755Ebf>, SortedMap<String, String>> LIZ3 = this.LIZIZ.LIZ(c36730EbG);
        if (LIZ3 != null) {
            Collection<C36755Ebf> first = LIZ3.getFirst();
            SortedMap<String, String> second = LIZ3.getSecond();
            SortedMap sortedMap = (SortedMap) c36730EbG.LIZJ.getValue();
            this.LIZ.LIZ();
            for (C36755Ebf c36755Ebf : first) {
                if (this.LIZLLL != null && (list = c36755Ebf.LIZJ) != null) {
                    for (String str2 : list) {
                        InterfaceC65784Pro<Boolean> interfaceC65784Pro = this.LIZLLL.get(str2);
                        if (interfaceC65784Pro == null || !interfaceC65784Pro.invoke().booleanValue()) {
                            StringBuilder LIZ4 = X1D.LIZ();
                            LIZ4.append("Condition ");
                            LIZ4.append(str2);
                            LIZ4.append(" returned false, skipping this page.");
                            C36762Ebm.LIZJ(X1D.LIZIZ(LIZ4));
                            break;
                        }
                    }
                }
                this.LIZ.LIZIZ(url, second, sortedMap, c36755Ebf);
            }
            return;
        }
        StringBuilder LIZ5 = X1D.LIZ();
        LIZ5.append("No config found for page ");
        LIZ5.append(url);
        LIZ5.append(", skipping...");
        String message = X1D.LIZIZ(LIZ5);
        o.LJIIJ(message, "message");
        C36762Ebm.LIZ.LIZIZ(message);
    }

    @Override // X.InterfaceC36990EfS
    public final C36760Ebk LIZIZ(C36758Ebi c36758Ebi, InterfaceC36765Ebp listener) {
        o.LJIIJ(listener, "listener");
        long currentTimeMillis = System.currentTimeMillis();
        C36760Ebk LIZLLL = this.LIZ.LIZLLL(c36758Ebi);
        LIZLLL.LIZLLL = currentTimeMillis;
        LIZLLL.LIZIZ = this.LIZJ;
        return LIZLLL;
    }

    @Override // X.InterfaceC36990EfS
    public final C36760Ebk LIZLLL(C36758Ebi c36758Ebi, InterfaceC36765Ebp listener) {
        o.LJIIJ(listener, "listener");
        long currentTimeMillis = System.currentTimeMillis();
        C36760Ebk LJFF = this.LIZ.LJFF(c36758Ebi);
        LJFF.LIZLLL = currentTimeMillis;
        LJFF.LIZIZ = this.LIZJ;
        return LJFF;
    }

    public C36769Ebt(C36756Ebg c36756Ebg, C36735EbL c36735EbL, InterfaceC36766Ebq interfaceC36766Ebq, java.util.Map map, List list) {
        this.LIZ = c36756Ebg;
        this.LIZIZ = c36735EbL;
        this.LIZJ = interfaceC36766Ebq;
        this.LIZLLL = map;
        this.LJ = list;
        c36735EbL.LIZIZ(new AqS153S0200000_6(this, 11));
    }
}
