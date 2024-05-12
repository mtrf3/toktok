package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.ISearchCardProtocol;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Jf5, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49707Jf5 implements InterfaceC49758Jfu, InterfaceC49779JgF {
    public final JYN LJLIL;
    public int LJLILLLLZI;
    public boolean LJLJI;
    public final C5H3 LJLJJI;
    public final C5H3 LJLJJL;
    public final C5H3 LJLJJLL;
    public final C5H3 LJLJL;
    public int LJLJLJ;
    public final C5H3 LJLJLLL;
    public final C5H3 LJLL;
    public final C5H3 LJLLI;
    public boolean LJLLILLLL;

    /* JADX WARN: Code restructure failed: missing block: B:7:0x001e, code lost:
    
        if (r1 == true) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIJJI() {
        /*
            r8 = this;
            r5 = 0
            r3 = 0
            r2 = 0
        L3:
            java.util.List r0 = r8.LJIIIIZZ()
            int r0 = r0.size()
            if (r3 >= r0) goto L94
            java.util.List r0 = r8.LJIIIIZZ()
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r0, r3)
            com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed r0 = (com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed) r0
            if (r0 == 0) goto L92
            boolean r1 = r0.LJIIIIZZ()
            r0 = 1
            if (r1 != r0) goto L92
        L20:
            r4 = 0
            if (r0 != 0) goto L67
            java.util.List r0 = r8.LJIIIIZZ()
            java.lang.Object r7 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r0, r3)
            com.ss.android.ugc.aweme.search.arch.v2.protocol.card.model.SearchMixFeedBase r7 = (com.ss.android.ugc.aweme.search.arch.v2.protocol.card.model.SearchMixFeedBase) r7
            if (r7 == 0) goto L60
            X.ILp r6 = X.EnumC46469ILp.GENERAL_SEARCH
            com.ss.android.ugc.aweme.search.pages.core.ui.activity.SearchResultActivity r0 = X.C50989Jzl.LJ()
            if (r0 == 0) goto L65
            androidx.lifecycle.Lifecycle r1 = r0.getLifecycle()
        L3b:
            java.lang.String r0 = "searchCardContainerType"
            kotlin.jvm.internal.o.LJIIIZ(r6, r0)
            com.ss.android.ugc.aweme.search.arch.v2.protocol.card.ISearchCardProtocol r0 = X.C44729Hgz.LJJJJI(r7, r6, r1)
            if (r0 == 0) goto L63
            X.JWm r0 = r0.getConfig()
            if (r0 == 0) goto L63
            X.JhS r0 = r0.LIZLLL()
            if (r0 == 0) goto L63
            boolean r0 = r0.LJIIIIZZ
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
        L58:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 != 0) goto L67
        L60:
            int r3 = r3 + 1
            goto L3
        L63:
            r1 = r4
            goto L58
        L65:
            r1 = r4
            goto L3b
        L67:
            if (r2 > r3) goto L76
            java.util.List r0 = r8.LJIIIIZZ()
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r0, r2)
            if (r0 == 0) goto L76
            int r2 = r2 + 1
            goto L67
        L76:
            if (r2 <= r3) goto L79
            goto L60
        L79:
            java.util.List r1 = r8.LJIIIIZZ()
            java.util.List r0 = r8.LJIIIIZZ()
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r0, r3)
            com.bytedance.mt.protector.impl.collections.ListProtector.set(r1, r2, r0)
            java.util.List r0 = r8.LJIIIIZZ()
            com.bytedance.mt.protector.impl.collections.ListProtector.set(r0, r3, r4)
            int r2 = r2 + 1
            goto L60
        L92:
            r0 = 0
            goto L20
        L94:
            java.util.List r0 = r8.LJIIIIZZ()
            int r0 = r0.size()
            if (r2 >= r0) goto Lab
            java.util.List r0 = r8.LJIIIIZZ()
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r0, r2)
            if (r0 == 0) goto Lab
            int r2 = r2 + 1
            goto L94
        Lab:
            if (r2 != 0) goto Lae
            return
        Lae:
            int r0 = r8.LJLILLLLZI
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            X.C49389JZx.LIZ(r0)
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "after removal: new size = "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = " total_size = "
            r1.append(r0)
            r1.append(r3)
            X.X1D.LIZIZ(r1)
            X.JYN r4 = r8.LJLIL
            java.util.LinkedList r3 = new java.util.LinkedList
            java.util.List r0 = r8.LJIIIIZZ()
            java.util.List r0 = r0.subList(r5, r2)
            r3.<init>(r0)
            int r2 = r8.LJLILLLLZI
            boolean r1 = r8.LJLJI
            X.JYN r0 = r8.LJLIL
            X.K1g r0 = (X.AbstractC51036K1g) r0
            boolean r0 = r0.isHasMore()
            X.C49389JZx.LIZIZ(r3, r2, r1, r0)
            X.JgT r4 = (X.AbstractC49793JgT) r4
            r4.LJIJJ(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C49707Jf5.LJIIJJI():void");
    }

    public final java.util.Map<String, Boolean> LJ() {
        return (java.util.Map) this.LJLJL.getValue();
    }

    public final java.util.Map<String, List<SearchMixFeed>> LJFF() {
        return (java.util.Map) this.LJLJJLL.getValue();
    }

    public final java.util.Set<String> LJI() {
        return (java.util.Set) this.LJLJJI.getValue();
    }

    public final List<SearchMixFeed> LJIIIIZZ() {
        return (List) this.LJLJJL.getValue();
    }

    public final Aweme LJIIIZ() {
        Object obj;
        boolean z;
        ISearchCardProtocol LJJJJIZL;
        AbstractC49300JWm config;
        C49854JhS LIZLLL;
        List items = ((AbstractC51036K1g) this.LJLIL).getItems();
        if (items == null) {
            return null;
        }
        Iterator it = items.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                SearchMixFeed searchMixFeed = (SearchMixFeed) obj;
                if (searchMixFeed.getFeedType() == 65280) {
                    z = true;
                } else {
                    z = false;
                }
                if ((z & (!C49111JPf.LIZJ(searchMixFeed))) || ((LJJJJIZL = C44729Hgz.LJJJJIZL(searchMixFeed, EnumC46469ILp.GENERAL_SEARCH)) != null && (config = LJJJJIZL.getConfig()) != null && (LIZLLL = config.LIZLLL()) != null && LIZLLL.LJII)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        SearchMixFeed searchMixFeed2 = (SearchMixFeed) obj;
        if (searchMixFeed2 == null) {
            return null;
        }
        return V16.LJIJI(searchMixFeed2);
    }

    public final java.util.Set<String> LJIIJ() {
        return (java.util.Set) this.LJLLI.getValue();
    }

    public final void LJIIL() {
        boolean z;
        boolean z2;
        Aweme aweme;
        String aid;
        List<SearchMixFeed> LJIIIIZZ = LJIIIIZZ();
        if (LJIIIIZZ == null || LJIIIIZZ.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        java.util.Set<String> LJI = LJI();
        if (LJI == null || LJI.isEmpty()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z | z2) {
            return;
        }
        for (String str : LJI()) {
            if (str.length() != 0 && (!C49835Jh9.LIZIZ() || !((java.util.Set) this.LJLL.getValue()).contains(str))) {
                int size = LJIIIIZZ().size();
                for (int i = 0; i < size; i++) {
                    AbstractC49325JXl abstractC49325JXl = (AbstractC49325JXl) ListProtector.get(LJIIIIZZ(), i);
                    if (abstractC49325JXl != null && (aweme = abstractC49325JXl.getAweme()) != null && (aid = aweme.getAid()) != null && aid.equals(str)) {
                        ListProtector.set(LJIIIIZZ(), i, null);
                        if (C49835Jh9.LIZ()) {
                            LJFF().remove(str);
                            LJ().remove(str);
                        }
                    }
                }
            }
        }
        LJIIJJI();
    }

    public final void LJIILIIL() {
        boolean z;
        boolean z2;
        Aweme aweme;
        String aid;
        List<SearchMixFeed> LJIIIIZZ = LJIIIIZZ();
        if (LJIIIIZZ == null || LJIIIIZZ.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        java.util.Set<String> LJIIJ = LJIIJ();
        if (LJIIJ == null || LJIIJ.isEmpty()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z | z2) {
            return;
        }
        for (String str : LJIIJ()) {
            if (str.length() != 0) {
                int size = LJIIIIZZ().size();
                for (int i = 0; i < size; i++) {
                    AbstractC49325JXl abstractC49325JXl = (AbstractC49325JXl) ListProtector.get(LJIIIIZZ(), i);
                    if (abstractC49325JXl != null && (aweme = abstractC49325JXl.getAweme()) != null && (aid = aweme.getAid()) != null && aid.equals(str)) {
                        ListProtector.set(LJIIIIZZ(), i, null);
                        if (C49835Jh9.LIZ()) {
                            LJFF().remove(str);
                            LJ().remove(str);
                        }
                    }
                }
            }
        }
        LJIIJJI();
    }

    public final void LIZ(String str) {
        if (C49835Jh9.LIZIZ() && C78685UuP.LJJJZ(str)) {
            ((java.util.Set) this.LJLL.getValue()).add(str);
        }
    }

    public static int LIZJ(String str, List list) {
        String aid;
        if (list != null) {
            Iterator it = ((ArrayList) list).iterator();
            int i = 0;
            while (it.hasNext()) {
                Aweme aweme = (Aweme) it.next();
                if (aweme != null && (aid = aweme.getAid()) != null && aid.equals(str)) {
                    return i;
                }
                i++;
            }
        }
        return -1;
    }

    @Override // X.InterfaceC49758Jfu
    public final List<SearchMixFeed> LIZIZ(String str, boolean z) {
        String LIZLLL;
        SearchMixFeed searchMixFeed = null;
        if (!C49835Jh9.LIZ() || C2060386t.LIZ(str)) {
            return null;
        }
        if ((z && C49835Jh9.LIZIZ()) || (LIZLLL = LIZLLL(str, ((AbstractC51036K1g) this.LJLIL).getItems(), z)) == null) {
            return null;
        }
        boolean LJ = o.LJ(LJ().get(LIZLLL), Boolean.TRUE);
        List<SearchMixFeed> list = LJFF().get(LIZLLL);
        if (list == null) {
            return null;
        }
        Iterator<SearchMixFeed> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            SearchMixFeed next = it.next();
            if (next.LJII()) {
                searchMixFeed = next;
                break;
            }
        }
        SearchMixFeed searchMixFeed2 = searchMixFeed;
        if (searchMixFeed2 != null) {
            searchMixFeed2.LJLJJL = LJ;
        }
        return list;
    }

    public final void LJIILJJIL(String str, List<? extends SearchMixFeed> list) {
        int i;
        int i2;
        Object obj;
        boolean z = true;
        if (str == null || str.length() == 0) {
            return;
        }
        List<SearchMixFeed> list2 = LJFF().get(str);
        if (list2 != null) {
            i = list2.size();
        } else {
            i = 0;
        }
        if (list != null) {
            i2 = list.size();
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(list);
            LJFF().put(str, arrayList);
            java.util.Map<String, Boolean> LJ = LJ();
            Iterator it = arrayList.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (((SearchMixFeed) obj).LJII()) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            SearchMixFeed searchMixFeed = (SearchMixFeed) obj;
            if (searchMixFeed == null || !searchMixFeed.LJLJI) {
                z = false;
            }
            LJ.put(str, Boolean.valueOf(z));
        } else {
            i2 = 0;
            LJFF().remove(str);
            LJ().remove(str);
        }
        this.LJLJLJ = (i2 - i) + this.LJLJLJ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJIILL(Aweme aweme, String str) {
        String aid;
        if (aweme == null || (aid = aweme.getAid()) == null || aid.length() == 0 || str == null || str.length() == 0 || o.LJ(str, aid) || !C78949Uyf.LJJIFFI(aweme)) {
            return;
        }
        java.util.Map map = (java.util.Map) this.LJLJLLL.getValue();
        Object obj = ((java.util.Map) this.LJLJLLL.getValue()).get(str);
        if (obj != 0) {
            str = obj;
        }
        map.put(aid, str);
    }

    public C49707Jf5(JYN itemsProvider, int i, boolean z) {
        o.LJIIIZ(itemsProvider, "itemsProvider");
        this.LJLIL = itemsProvider;
        this.LJLILLLLZI = i;
        this.LJLJI = z;
        EnumC221088m0 enumC221088m0 = EnumC221088m0.NONE;
        this.LJLJJI = C221108m2.LIZ(enumC221088m0, C49741Jfd.LJLIL);
        this.LJLJJL = C221108m2.LIZ(enumC221088m0, C49742Jfe.LJLIL);
        this.LJLJJLL = C221108m2.LIZ(enumC221088m0, C49732JfU.LJLIL);
        this.LJLJL = C221108m2.LIZ(enumC221088m0, C49733JfV.LJLIL);
        this.LJLJLLL = C221108m2.LIZ(enumC221088m0, C49744Jfg.LJLIL);
        this.LJLL = C221108m2.LIZ(enumC221088m0, C49745Jfh.LJLIL);
        this.LJLLI = C221108m2.LIZ(enumC221088m0, C49743Jff.LJLIL);
    }

    public static String LIZLLL(String str, List list, boolean z) {
        Object obj;
        Aweme aweme;
        String aid;
        String aid2;
        if (!z || C2060386t.LIZ(str) || list == null || list.isEmpty()) {
            return str;
        }
        Iterator it = list.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                SearchMixFeed searchMixFeed = (SearchMixFeed) obj;
                Aweme LJIJI = V16.LJIJI(searchMixFeed);
                if (LJIJI != null && (aid2 = LJIJI.getAid()) != null && aid2.equals(str) && C49111JPf.LIZJ(searchMixFeed)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        AbstractC49325JXl abstractC49325JXl = (AbstractC49325JXl) obj;
        if (abstractC49325JXl != null && (aweme = abstractC49325JXl.getAweme()) != null && (aid = aweme.getAid()) != null) {
            return aid;
        }
        return "hotspot";
    }

    /* JADX WARN: Code restructure failed: missing block: B:239:0x0361, code lost:
    
        if (r9 != null) goto L212;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x00dd, code lost:
    
        if (r2 != null) goto L49;
     */
    @Override // X.InterfaceC49779JgF
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJII(java.lang.String r15, boolean r16, com.ss.android.ugc.aweme.feed.model.Aweme r17, java.util.List r18, X.AbstractC65590Pog r19, X.InterfaceC49778JgE r20) {
        /*
            Method dump skipped, instructions count: 886
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C49707Jf5.LJII(java.lang.String, boolean, com.ss.android.ugc.aweme.feed.model.Aweme, java.util.List, X.Pog, X.JgE):void");
    }
}
