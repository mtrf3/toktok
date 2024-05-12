package X;

import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS174S0100000_8;
import kotlin.jvm.internal.o;

/* renamed from: X.JhO, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49850JhO {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(C49847JhL streamRoot, List list, EnumC49859JhX action) {
        HashMap<String, Object> hashMap;
        HashMap<String, Object> hashMap2;
        C49849JhN c49849JhN;
        C49849JhN LJJ;
        o.LJIIIZ(streamRoot, "streamRoot");
        o.LJIIIZ(action, "action");
        System.currentTimeMillis();
        AqS174S0100000_8 aqS174S0100000_8 = new AqS174S0100000_8(list, (List<? extends SearchMixFeed>) 168);
        int i = C49860JhY.LIZ[action.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return;
                }
                C49867Jhf c49867Jhf = new C49867Jhf(streamRoot);
                aqS174S0100000_8.invoke(c49867Jhf);
                Iterator<InterfaceC88472Yns<C49851JhP, C76800UCe>> it = c49867Jhf.LIZIZ.iterator();
                while (it.hasNext()) {
                    InterfaceC88472Yns<C49851JhP, C76800UCe> next = it.next();
                    C49847JhL c49847JhL = c49867Jhf.LIZJ;
                    C49851JhP c49851JhP = new C49851JhP(c49847JhL.LJI, c49847JhL, next);
                    C49848JhM LIZIZ = c49867Jhf.LIZJ.LIZIZ();
                    if (LIZIZ != null && (c49849JhN = LIZIZ.LIZJ) != null && (LJJ = c49849JhN.LJJ()) != null) {
                        LJJ.LJIJI(new C49849JhN(c49851JhP.LIZIZ, c49851JhP.LJFF, c49851JhP, false));
                    }
                }
                if (!C49856JhU.LIZ) {
                    return;
                }
                C49852JhQ.LIZIZ(streamRoot, "append inner stream");
                return;
            }
            C49855JhT c49855JhT = new C49855JhT(streamRoot);
            aqS174S0100000_8.invoke(c49855JhT);
            c49855JhT.LIZ();
            return;
        }
        C49847JhL c49847JhL2 = new C49847JhL(0);
        C49855JhT c49855JhT2 = new C49855JhT(c49847JhL2);
        aqS174S0100000_8.invoke(c49855JhT2);
        c49855JhT2.LIZ();
        for (C49849JhN c49849JhN2 = c49847JhL2.LIZ; c49849JhN2 != null; c49849JhN2 = c49849JhN2.LIZLLL) {
            c49849JhN2.LIZ = streamRoot;
        }
        streamRoot.LIZJ = c49847JhL2.LIZJ;
        streamRoot.LIZLLL = c49847JhL2.LIZLLL;
        streamRoot.LJ = c49847JhL2.LJ;
        streamRoot.LIZ = c49847JhL2.LIZ;
        streamRoot.LIZIZ = c49847JhL2.LIZIZ;
        for (Map.Entry<InterfaceC65350Pko<?>, C49864Jhc> entry : c49847JhL2.LJFF.LIZ.entrySet()) {
            InterfaceC65350Pko<?> key = entry.getKey();
            if (streamRoot.LJFF.LIZ.get(key) == null) {
                streamRoot.LJFF.LIZ.put(key, entry.getValue());
            } else {
                for (Map.Entry<String, Object> entry2 : entry.getValue().LIZIZ.entrySet()) {
                    C49864Jhc c49864Jhc = streamRoot.LJFF.LIZ.get(key);
                    if (c49864Jhc != null && (hashMap2 = c49864Jhc.LIZIZ) != null) {
                        hashMap2.put(entry2.getKey(), entry2.getValue());
                    }
                }
                for (Map.Entry<String, Object> entry3 : entry.getValue().LIZ.entrySet()) {
                    C49864Jhc c49864Jhc2 = streamRoot.LJFF.LIZ.get(key);
                    if (c49864Jhc2 != null && (hashMap = c49864Jhc2.LIZIZ) != null) {
                        hashMap.put(entry3.getKey(), entry3.getValue());
                    }
                }
            }
        }
        C49863Jhb c49863Jhb = streamRoot.LJFF;
        o.LJIIIZ(c49863Jhb, "<set-?>");
        c49847JhL2.LJFF = c49863Jhb;
        C49854JhS c49854JhS = streamRoot.LJI;
        o.LJIIIZ(c49854JhS, "<set-?>");
        c49847JhL2.LJI = c49854JhS;
        if (!C49856JhU.LIZ) {
            return;
        }
        C49852JhQ.LIZ(streamRoot, "merge stream");
    }
}
