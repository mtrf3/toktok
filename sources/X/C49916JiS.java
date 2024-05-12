package X;

import Y.ACallableS111S0100000_8;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.ss.android.ugc.aweme.search.pages.result.core.repo.SearchApiNew;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeedList;
import java.util.HashSet;
import kotlin.jvm.internal.o;

/* renamed from: X.JiS, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49916JiS<T> implements InterfaceC86003Zc {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ C10K<SearchMixFeedList> LJLILLLLZI;
    public final /* synthetic */ C50031JkJ LJLJI;
    public final /* synthetic */ int LJLJJI = 10;
    public final /* synthetic */ C50637Ju5 LJLJJL;

    public C49916JiS(int i, C10K c10k, C50031JkJ c50031JkJ, C50637Ju5 c50637Ju5) {
        this.LJLIL = i;
        this.LJLILLLLZI = c10k;
        this.LJLJI = c50031JkJ;
        this.LJLJJL = c50637Ju5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC86003Zc
    public final void subscribe(InterfaceC73573Su9<SearchMixFeedList> interfaceC73573Su9) {
        String str;
        String str2;
        C50287JoR c50287JoR;
        InterfaceC49833Jh7 interfaceC49833Jh7;
        int i;
        Integer num;
        C49915JiR c49915JiR;
        HashSet<String> hashSet;
        C10K<SearchMixFeedList> c10k;
        if (AV1.LJIIJJI() && !interfaceC73573Su9.isDisposed()) {
            interfaceC73573Su9.onError(new RuntimeException("Under ChildrenMode"));
        }
        Object obj = null;
        try {
            if (this.LJLIL != 0 && (c10k = this.LJLILLLLZI) != null) {
                c10k.LJIJI();
                SearchMixFeedList LJIIJJI = this.LJLILLLLZI.LJIIJJI();
                if (LJIIJJI != null) {
                    LJIIJJI.LJLJI = true;
                    interfaceC73573Su9.onNext(LJIIJJI);
                    return;
                }
            }
            C49929Jif c49929Jif = new C49929Jif();
            C50031JkJ searchRequestParam = this.LJLJI;
            o.LJIIIZ(searchRequestParam, "searchRequestParam");
            c49929Jif.LIZ.LLF = searchRequestParam;
            String enterFrom = this.LJLJI.LJIIJ;
            o.LJIIIZ(enterFrom, "enterFrom");
            C49915JiR c49915JiR2 = c49929Jif.LIZ;
            c49915JiR2.LJLLLLLL = enterFrom;
            C50031JkJ c50031JkJ = this.LJLJI;
            c49915JiR2.LJLIL = c50031JkJ.LJIIZILJ;
            String keyword = c50031JkJ.LIZ;
            o.LJIIIZ(keyword, "keyword");
            C49915JiR c49915JiR3 = c49929Jif.LIZ;
            c49915JiR3.LJLILLLLZI = keyword;
            c49915JiR3.LJLJI = this.LJLIL;
            c49915JiR3.LJLJJI = this.LJLJJI;
            C50031JkJ c50031JkJ2 = this.LJLJI;
            c49915JiR3.LJLJJL = c50031JkJ2.LIZIZ;
            String str3 = c50031JkJ2.LIZJ;
            if (str3 == null) {
                str3 = "";
            }
            c49915JiR3.LJLL = str3;
            String str4 = c50031JkJ2.LJI;
            if (str4 == null) {
                str4 = "";
            }
            c49915JiR3.LJLJJLL = str4;
            c49915JiR3.LJLJL = c50031JkJ2.LJII;
            c49915JiR3.LJLJLJ = c50031JkJ2.LJFF;
            c49915JiR3.LJLLI = c50031JkJ2.LJ;
            SearchResultParam searchResultParam = c50031JkJ2.LJIIZILJ;
            if (searchResultParam != null) {
                str = searchResultParam.getSugUserId();
            } else {
                str = null;
            }
            c49929Jif.LIZ.LJZ = str;
            SearchResultParam searchResultParam2 = this.LJLJI.LJIIZILJ;
            if (searchResultParam2 != null) {
                str2 = searchResultParam2.getIsRichSug();
            } else {
                str2 = null;
            }
            c49929Jif.LIZ.LL = str2;
            SearchResultParam searchResultParam3 = this.LJLJI.LJIIZILJ;
            if (searchResultParam3 != null) {
                c50287JoR = searchResultParam3.getFilterOption();
            } else {
                c50287JoR = null;
            }
            c49929Jif.LIZ(c50287JoR);
            C49915JiR c49915JiR4 = c49929Jif.LIZ;
            c49915JiR4.LJLZ = "";
            c49915JiR4.LLFF = this.LJLJI.LJIJI;
            InterfaceC50639Ju7 interfaceC50639Ju7 = (InterfaceC50639Ju7) C50641Ju9.LIZ().get(OBS.class);
            if (interfaceC50639Ju7 != null) {
                interfaceC49833Jh7 = interfaceC50639Ju7.getData();
            } else {
                interfaceC49833Jh7 = null;
            }
            if (!(interfaceC49833Jh7 instanceof C50741Jvl)) {
                interfaceC49833Jh7 = null;
            }
            C50741Jvl c50741Jvl = (C50741Jvl) interfaceC49833Jh7;
            if (c50741Jvl != null && (hashSet = c50741Jvl.LJLIL) != null && (!hashSet.isEmpty())) {
                i = 1;
            } else {
                i = 0;
            }
            c49929Jif.LIZ.LLFFF = i;
            c49929Jif.LIZ.LLFII = this.LJLJJL.LIZ(this.LJLJI.LIZ) ? 1 : 0;
            SearchResultParam searchResultParam4 = this.LJLJI.LJIIZILJ;
            if (searchResultParam4 != null) {
                num = Integer.valueOf(searchResultParam4.getGeneralSearchSortType());
            } else {
                num = null;
            }
            c49915JiR = c49929Jif.LIZ;
            c49915JiR.LLI = num;
        } catch (Throwable th) {
            th = th;
        }
        try {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(this.LJLIL);
            LIZ.append('_');
            LIZ.append(this.LJLJI.LIZ);
            LIZ.append('_');
            LIZ.append(this.LJLJI.LJI);
            String LIZIZ = X1D.LIZIZ(LIZ);
            java.util.Set<String> set = SearchApiNew.LIZJ;
            if (set.contains(LIZIZ)) {
                C10K.LIZJ(new ACallableS111S0100000_8(c49915JiR, 14));
            } else {
                set.add(LIZIZ);
            }
            c49915JiR = c49915JiR;
            if (this.LJLIL == 0) {
                OSZ LIZJ = C49924Jia.LIZJ(c49915JiR);
                c49915JiR = c49915JiR;
                if (LIZJ != null) {
                    obj = LIZJ.getSecond();
                    c49915JiR = LIZJ.getFirst();
                }
            }
            C10K<SearchMixFeedList> c10k2 = (C10K) obj;
            if (c10k2 == null) {
                o.LJI(c49915JiR);
                c10k2 = c49915JiR.LIZIZ();
            }
            c10k2.LJIJI();
            C49491Jbb.LJIIIZ.compareAndSet(1, 2);
            if (c10k2.LJIILJJIL()) {
                interfaceC73573Su9.onError(c10k2.LJIIJ());
            } else if (c10k2.LJIIL()) {
                o.LJI(c49915JiR);
                c49915JiR.LIZ(0, "");
            } else {
                SearchMixFeedList LJIIJJI2 = c10k2.LJIIJJI();
                LJIIJJI2.LJLJI = false;
                interfaceC73573Su9.onNext(LJIIJJI2);
            }
            if (!interfaceC73573Su9.isDisposed()) {
                interfaceC73573Su9.onComplete();
            }
        } catch (Throwable th2) {
            th = th2;
            obj = c49915JiR;
            if (!interfaceC73573Su9.isDisposed()) {
                interfaceC73573Su9.onError(th);
                return;
            }
            C49915JiR c49915JiR5 = (C49915JiR) obj;
            if (c49915JiR5 == null) {
                return;
            }
            c49915JiR5.LIZ(0, "");
        }
    }
}
