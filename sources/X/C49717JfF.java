package X;

import com.ss.android.ugc.aweme.search.pages.common.theme.activitybg.SearchActivityCardBgController;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.topfeed.TopFeedFragment;
import com.ss.android.ugc.aweme.search.player.core.viewmodel.MusicPlayHelper;
import kotlin.jvm.internal.o;

/* renamed from: X.JfF, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49717JfF implements InterfaceC50046JkY {
    public final /* synthetic */ TopFeedFragment LIZ;

    public C49717JfF(TopFeedFragment topFeedFragment) {
        this.LIZ = topFeedFragment;
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
        C49578Jd0 c49578Jd0 = this.LIZ.LLLF;
        if (c49578Jd0 != null) {
            c49578Jd0.LIZIZ(Boolean.valueOf(z));
        }
        if (!z) {
            MusicPlayHelper musicPlayHelper = this.LIZ.LLJLILLLLZIIL;
            if (musicPlayHelper != null) {
                musicPlayHelper.hv0();
            } else {
                o.LJIJI("musicPlayHelper");
                throw null;
            }
        }
        SearchActivityCardBgController searchActivityCardBgController = this.LIZ.LLJLLL;
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
            return;
        }
        o.LJIJI("activityCardBgController");
        throw null;
    }
}
