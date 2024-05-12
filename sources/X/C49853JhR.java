package X;

import androidx.lifecycle.Lifecycle;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.ISearchCardProtocol;
import com.ss.android.ugc.aweme.search.pages.core.ui.activity.SearchResultActivity;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import kotlin.jvm.internal.o;

/* renamed from: X.JhR, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49853JhR extends AbstractC65781Prl implements InterfaceC88472Yns<C49854JhS, C76800UCe> {
    public final /* synthetic */ SearchMixFeed LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;
    public final /* synthetic */ boolean LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C49853JhR(SearchMixFeed searchMixFeed, boolean z, boolean z2, boolean z3) {
        super(1);
        this.LJLIL = searchMixFeed;
        this.LJLILLLLZI = z;
        this.LJLJI = z2;
        this.LJLJJI = z3;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C49854JhS c49854JhS) {
        Lifecycle lifecycle;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        AbstractC49300JWm config;
        C49854JhS LIZLLL;
        C49854JhS config2 = c49854JhS;
        o.LJIIIZ(config2, "$this$config");
        SearchMixFeed searchMixFeed = this.LJLIL;
        EnumC46469ILp searchCardContainerType = EnumC46469ILp.GENERAL_SEARCH;
        SearchResultActivity LJ = C50989Jzl.LJ();
        if (LJ != null) {
            lifecycle = LJ.getLifecycle();
        } else {
            lifecycle = null;
        }
        o.LJIIIZ(searchMixFeed, "<this>");
        o.LJIIIZ(searchCardContainerType, "searchCardContainerType");
        ISearchCardProtocol LJJJJI = C44729Hgz.LJJJJI(searchMixFeed, searchCardContainerType, lifecycle);
        int i = 0;
        if (LJJJJI != null && (config = LJJJJI.getConfig()) != null && (LIZLLL = config.LIZLLL()) != null) {
            z = LIZLLL.LIZ;
        } else {
            z = false;
        }
        if (z || this.LJLIL.getFeedType() == 65280 || this.LJLIL.getFeedType() == 36) {
            z2 = true;
        } else {
            z2 = false;
        }
        config2.LIZ = z2;
        if (this.LJLILLLLZI || this.LJLJI) {
            z3 = true;
        } else {
            z3 = false;
        }
        config2.LIZIZ = z3;
        boolean z6 = this.LJLJJI;
        config2.LJIIIIZZ = !z6;
        if (!z6 && !this.LJLJI) {
            z4 = true;
        } else {
            z4 = false;
        }
        config2.LJII = z4;
        if (this.LJLIL.getFeedType() == 65280) {
            z5 = true;
        } else {
            z5 = false;
        }
        config2.LJIIIZ = z5;
        boolean z7 = this.LJLJJI;
        config2.LJFF = z7;
        config2.LJI = z7;
        if (!z7 && !this.LJLJI) {
            i = 1;
        }
        config2.LIZLLL = i;
        config2.LJIIJ = z7;
        return C76800UCe.LIZ;
    }
}
