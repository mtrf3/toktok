package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.JgJ, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49783JgJ implements InterfaceC49844JhI {
    public static final HashMap<String, Integer> LJLJLLL = new HashMap<>();
    public final C49841JhF LJLIL;
    public final InterfaceC49778JgE LJLILLLLZI;
    public final List<SearchMixFeed> LJLJI;
    public final InterfaceC49779JgF LJLJJI;
    public C49782JgI LJLJJL;
    public C49782JgI LJLJJLL;
    public C49782JgI LJLJL;
    public final C62822Ol8 LJLJLJ;

    @Override // X.InterfaceC49844JhI
    public final String LIZLLL() {
        String str;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("get in pos id ");
        C49782JgI c49782JgI = this.LJLJJL;
        if (c49782JgI != null) {
            str = c49782JgI.LIZIZ;
        } else {
            str = null;
        }
        LIZ.append(str);
        X1D.LIZIZ(LIZ);
        C49782JgI c49782JgI2 = this.LJLJJL;
        if (c49782JgI2 == null) {
            return null;
        }
        return c49782JgI2.LIZIZ;
    }

    @Override // X.InterfaceC49844JhI
    public final String LJFF() {
        String str;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("get out pos id ");
        C49782JgI c49782JgI = this.LJLJJLL;
        if (c49782JgI != null) {
            str = c49782JgI.LIZIZ;
        } else {
            str = null;
        }
        LIZ.append(str);
        X1D.LIZIZ(LIZ);
        C49782JgI c49782JgI2 = this.LJLJJLL;
        if (c49782JgI2 == null) {
            return null;
        }
        return c49782JgI2.LIZIZ;
    }

    @Override // X.InterfaceC49844JhI
    public final int LJ(String searchId) {
        o.LJIIIZ(searchId, "searchId");
        Integer num = LJLJLLL.get(searchId);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public final void LIZ(Aweme aweme, List<? extends Aweme> list, List<? extends SearchMixFeed> list2) {
        int i;
        InterfaceC49779JgF interfaceC49779JgF;
        boolean z;
        String str;
        String str2;
        if (aweme != null && aweme.getIsSubAweme()) {
            return;
        }
        String str3 = null;
        if (list != null) {
            Iterator<? extends Aweme> it = list.iterator();
            i = 0;
            while (it.hasNext()) {
                String aid = it.next().getAid();
                if (aid != null) {
                    if (aweme != null) {
                        str2 = aweme.getAid();
                    } else {
                        str2 = null;
                    }
                    if (aid.equals(str2)) {
                        break;
                    }
                }
                i++;
            }
        }
        i = -1;
        if ((C49835Jh9.LIZ() || C49834Jh8.LIZ()) && (interfaceC49779JgF = this.LJLJJI) != null) {
            C49841JhF c49841JhF = this.LJLIL;
            String str4 = c49841JhF.LJLILLLLZI;
            if (c49841JhF.LJLJJI == JTL.TRENDING_VIDEO_CARD) {
                z = true;
            } else {
                z = false;
            }
            interfaceC49779JgF.LJII(str4, z, aweme, this.LJLJI, (AbstractC65590Pog) list2, this.LJLILLLLZI);
        }
        if (aweme != null) {
            String aid2 = aweme.getAid();
            if (aid2 != null) {
                ((HashSet) this.LJLJLJ.getValue()).add(aid2);
                C49782JgI c49782JgI = this.LJLJL;
                if (c49782JgI == null || i > c49782JgI.LIZ) {
                    this.LJLJL = new C49782JgI(i, aid2);
                }
            }
            String aid3 = aweme.getAid();
            if (aid3 == null || aid3.length() == 0 || aweme.isAd() || aweme.isPhotoMode()) {
                return;
            }
            java.util.Map<String, String> searchExtraParams = aweme.getSearchExtraParams();
            if (searchExtraParams != null) {
                str3 = searchExtraParams.get("insert_user_created");
            }
            if (o.LJ(str3, "2")) {
                return;
            }
            if (C78949Uyf.LJJIFFI(aweme)) {
                C49782JgI c49782JgI2 = this.LJLJJL;
                if (c49782JgI2 == null || i > c49782JgI2.LIZ) {
                    String aid4 = aweme.getAid();
                    o.LJIIIIZZ(aid4, "curAweme.aid");
                    this.LJLJJL = new C49782JgI(i, aid4);
                }
                java.util.Map<String, String> searchExtraParams2 = aweme.getSearchExtraParams();
                if (searchExtraParams2 == null || (str = searchExtraParams2.get("dual_stream_inner_search_id")) == null) {
                    return;
                }
                HashMap<String, Integer> hashMap = LJLJLLL;
                Integer num = hashMap.get(str);
                if (num == null) {
                    num = 0;
                }
                hashMap.put(str, Integer.valueOf(num.intValue() + 1));
                return;
            }
            C49782JgI c49782JgI3 = this.LJLJJLL;
            if (c49782JgI3 != null && i <= c49782JgI3.LIZ) {
                return;
            }
            String aid5 = aweme.getAid();
            o.LJIIIIZZ(aid5, "curAweme.aid");
            this.LJLJJLL = new C49782JgI(i, aid5);
        }
    }

    public C49783JgJ(C49841JhF c49841JhF, InterfaceC49778JgE interfaceC49778JgE, List list, C49825Jgz c49825Jgz) {
        this.LJLIL = c49841JhF;
        this.LJLILLLLZI = interfaceC49778JgE;
        this.LJLJI = list;
        this.LJLJJI = c49825Jgz;
        C62822Ol8 LIZIZ = C221108m2.LIZIZ(C9CV.LJLIL);
        this.LJLJLJ = LIZIZ;
        ((HashSet) LIZIZ.getValue()).add(c49841JhF.LJLILLLLZI);
    }
}
