package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import kotlin.jvm.internal.AqS174S0100000_8;
import kotlin.jvm.internal.o;

/* renamed from: X.JhK, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49846JhK extends AbstractC49845JhJ {
    public InterfaceC49870Jhi LLF;

    @Override // X.AbstractC51036K1g
    public final boolean isDataEmpty() {
        return false;
    }

    @Override // X.InterfaceC49844JhI
    public final String LIZLLL() {
        C49797JgX c49797JgX = this.LJZL;
        if (c49797JgX != null) {
            return c49797JgX.LIZLLL();
        }
        return null;
    }

    @Override // X.InterfaceC49844JhI
    public final String LJFF() {
        C49797JgX c49797JgX = this.LJZL;
        if (c49797JgX != null) {
            return c49797JgX.LJFF();
        }
        return null;
    }

    @Override // X.AbstractC49845JhJ
    public final void LJJII() {
        InterfaceC49870Jhi interfaceC49870Jhi = this.LLF;
        if (interfaceC49870Jhi != null) {
            interfaceC49870Jhi.release();
        }
    }

    @Override // X.InterfaceC224118qt
    public final List<Aweme> getAwemeList() {
        Object obj;
        HashMap<String, Object> hashMap;
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        C49848JhM LIZ = this.LJLZ.LIZ();
        if (LIZ != null) {
            C49848JhM LJIJI = LIZ.LJIJI();
            while (true) {
                if (LJIJI == null) {
                    break;
                }
                if (LJIJI.LJIJJLI() != null) {
                    LJIJI = LJIJI.LJIJJLI();
                } else {
                    while (LJIJI != null) {
                        C49849JhN c49849JhN = LJIJI.LIZJ;
                        c49849JhN.LJIL();
                        String str = c49849JhN.LJIIIIZZ;
                        C49863Jhb c49863Jhb = LJIJI.LIZIZ.LJFF;
                        String str2 = LJIJI.LIZ;
                        C49864Jhc c49864Jhc = c49863Jhb.LIZ.get(C65352Pkq.LIZ(Aweme.class));
                        if (c49864Jhc != null && (hashMap = c49864Jhc.LIZIZ) != null) {
                            StringBuilder LIZ2 = X1D.LIZ();
                            LIZ2.append(str2);
                            LIZ2.append(str);
                            obj = hashMap.get(X1D.LIZIZ(LIZ2));
                        } else {
                            obj = null;
                        }
                        Aweme aweme = (Aweme) obj;
                        if (aweme != null) {
                            if (!hashSet.contains(aweme.getAid())) {
                                arrayList.add(aweme);
                            }
                            hashSet.add(aweme.getAid());
                        }
                        LJIJI = LJIJI.LJIILLIIL();
                    }
                }
            }
        }
        return arrayList;
    }

    @Override // X.InterfaceC49897Ji9
    public final boolean LIZ() {
        return isHasMore();
    }

    @Override // X.InterfaceC49844JhI
    public final int LJ(String innerSearchId) {
        o.LJIIIZ(innerSearchId, "innerSearchId");
        C49797JgX c49797JgX = this.LJZL;
        if (c49797JgX != null) {
            return c49797JgX.LJ(innerSearchId);
        }
        return 0;
    }

    @Override // X.AbstractC51036K1g
    public final void loadMoreList(Object... params) {
        o.LJIIIZ(params, "params");
        InterfaceC49870Jhi interfaceC49870Jhi = this.LLF;
        if (interfaceC49870Jhi != null) {
            interfaceC49870Jhi.LIZIZ(this.LJLZ, new AqS174S0100000_8(this, 101), new AqS174S0100000_8(this, 102));
        }
    }

    @Override // X.AbstractC49845JhJ
    public final boolean LJIJJLI(int i, Aweme aweme) {
        QZV LIZIZ = this.LJLZ.LIZIZ();
        if (LIZIZ != null) {
            int i2 = C49875Jhn.LLILL;
            for (int i3 = 0; i3 < i2; i3++) {
                LIZIZ = LIZIZ.LJIILLIIL();
                if (LIZIZ != null) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C49846JhK(C49841JhF c49841JhF, AbstractC65590Pog abstractC65590Pog, C49847JhL streamRoot) {
        super(c49841JhF, abstractC65590Pog, streamRoot);
        o.LJIIIZ(streamRoot, "streamRoot");
        LJIJJ(this.LJLLLLLL);
    }

    /* JADX WARN: Code restructure failed: missing block: B:319:0x030a, code lost:
    
        if (r0 == true) goto L206;
     */
    /* JADX WARN: Code restructure failed: missing block: B:320:0x030c, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:323:0x0315, code lost:
    
        if (r18.isAd() == r1) goto L206;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x034e A[EDGE_INSN: B:254:0x034e->B:255:0x034e BREAK  A[LOOP:10: B:232:0x02f4->B:235:0x02fa], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x03b7  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x03a1  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x00ea A[EDGE_INSN: B:96:0x00ea->B:97:0x00ea BREAK  A[LOOP:1: B:78:0x00d9->B:81:0x00df], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x00ee  */
    @Override // X.AbstractC49845JhJ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed> LJJIFFI(com.ss.android.ugc.aweme.feed.model.Aweme r18, X.C49825Jgz r19, int r20) {
        /*
            Method dump skipped, instructions count: 1063
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C49846JhK.LJJIFFI(com.ss.android.ugc.aweme.feed.model.Aweme, X.Jgz, int):java.util.List");
    }
}
