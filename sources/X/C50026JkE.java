package X;

import com.ss.android.ugc.aweme.search.pages.result.core.repo.SearchApiNew;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMix;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.JkE, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50026JkE extends AbstractCallableC49927Jid {
    public final C50031JkJ LJLJI;
    public final /* synthetic */ C49823Jgx LJLJJI;

    @Override // X.AbstractCallableC49927Jid
    public final Object LIZIZ() {
        String str;
        int i;
        int i2;
        int i3;
        LinkedHashMap<String, Integer> linkedHashMap;
        ActivityC45651qj activityC45651qj;
        if (C26015AIx.LIZLLL()) {
            str = C50560Jsq.LIZJ();
        } else {
            str = null;
        }
        SearchApiNew.RealApi LIZ = SearchApiNew.LIZ();
        C50031JkJ c50031JkJ = this.LJLJI;
        String str2 = c50031JkJ.LIZ;
        long j = c50031JkJ.LJIIIIZZ;
        int i4 = c50031JkJ.LJIIIZ;
        String str3 = c50031JkJ.LIZLLL;
        String str4 = c50031JkJ.LIZJ;
        int i5 = c50031JkJ.LJ;
        String str5 = c50031JkJ.LJI;
        String str6 = c50031JkJ.LJII;
        int i6 = c50031JkJ.LJFF;
        C50287JoR c50287JoR = this.LJLJJI.LJLIL;
        if (c50287JoR != null && !c50287JoR.isDefaultOption()) {
            i = 1;
        } else {
            i = 0;
        }
        C50287JoR c50287JoR2 = this.LJLJJI.LJLIL;
        if (c50287JoR2 != null) {
            i2 = c50287JoR2.getSortType();
        } else {
            i2 = 0;
        }
        C50287JoR c50287JoR3 = this.LJLJJI.LJLIL;
        if (c50287JoR3 != null) {
            i3 = c50287JoR3.getFilterBy();
        } else {
            i3 = 0;
        }
        C50031JkJ c50031JkJ2 = this.LJLJI;
        String str7 = c50031JkJ2.LJIIJ;
        String str8 = c50031JkJ2.LJIIL;
        String str9 = c50031JkJ2.LJIILIIL;
        String str10 = c50031JkJ2.LJIJI;
        C50287JoR c50287JoR4 = c50031JkJ2.LJIIJJI;
        if (c50287JoR4 == null || (linkedHashMap = c50287JoR4.activityToFieldMap()) == null) {
            linkedHashMap = new LinkedHashMap<>();
        }
        WeakReference<ActivityC45651qj> weakReference = this.LJLJJI.LJLJJL;
        if (weakReference != null) {
            activityC45651qj = weakReference.get();
        } else {
            activityC45651qj = null;
        }
        String LIZ2 = C50589JtJ.LIZ(activityC45651qj, this.LJLJJI.LJLJJI);
        C50031JkJ c50031JkJ3 = this.LJLJI;
        SearchMix searchMix = LIZ.searchFeedList(str2, j, i4, str3, str4, i5, str5, str6, i6, i, i2, i3, str7, str8, str9, str10, linkedHashMap, LIZ2, str, c50031JkJ3.LJJIIZ, c50031JkJ3.LJJIIZI, c50031JkJ3.LJJIJ, c50031JkJ3.LJJIJIIJI).get();
        o.LJIIIIZZ(searchMix, "api().searchFeedList(\n  …emIds\n            ).get()");
        return searchMix;
    }

    public C50026JkE(C49823Jgx c49823Jgx, C50031JkJ c50031JkJ) {
        this.LJLJJI = c49823Jgx;
        this.LJLJI = c50031JkJ;
    }
}
