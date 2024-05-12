package X;

import com.ss.android.ugc.aweme.search.pages.common.theme.activitybg.SearchActivityCardBgController;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.ui.jedi.SearchJediMixFeedFragment;
import kotlin.jvm.internal.o;

/* renamed from: X.JfE, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49716JfE implements InterfaceC50046JkY {
    public final /* synthetic */ SearchJediMixFeedFragment LIZ;

    public C49716JfE(SearchJediMixFeedFragment searchJediMixFeedFragment) {
        this.LIZ = searchJediMixFeedFragment;
    }

    @Override // X.InterfaceC50046JkY
    public final /* synthetic */ void LIZ() {
    }

    @Override // X.InterfaceC50046JkY
    public final /* synthetic */ void LIZJ() {
    }

    @Override // X.InterfaceC50046JkY
    public final void LIZIZ(boolean z) {
        C50240Jng LIZJ;
        if (z) {
            JQT jqt = this.LIZ.LLLILZ;
            if (jqt != null) {
                jqt.LJJJI(z);
            }
            C49578Jd0 c49578Jd0 = this.LIZ.LLLJ;
            if (c49578Jd0 != null) {
                c49578Jd0.LIZIZ(Boolean.valueOf(z));
            }
            this.LIZ.LJL();
        } else {
            JQT jqt2 = this.LIZ.LLLILZ;
            if (jqt2 != null) {
                jqt2.LJJJI(false);
            }
            C49578Jd0 c49578Jd02 = this.LIZ.LLLJ;
            if (c49578Jd02 != null) {
                c49578Jd02.LIZIZ(Boolean.FALSE);
            }
            this.LIZ.LJJJJL();
        }
        SearchActivityCardBgController searchActivityCardBgController = this.LIZ.LLLILZJ;
        if (searchActivityCardBgController != null) {
            if (z) {
                ActivityC45651qj ctx = searchActivityCardBgController.LJLIL;
                o.LJIIIZ(ctx, "ctx");
                if (o.LJ(C50238Jne.LIZLLL(), "dark")) {
                    LIZJ = C50238Jne.LIZIZ(ctx);
                } else {
                    LIZJ = C50238Jne.LIZJ(ctx);
                }
            } else {
                ActivityC45651qj ctx2 = searchActivityCardBgController.LJLIL;
                o.LJIIIZ(ctx2, "ctx");
                LIZJ = C50238Jne.LIZJ(ctx2);
            }
            searchActivityCardBgController.LJLJJL = LIZJ;
        }
    }
}
