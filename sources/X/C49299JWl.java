package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.ui.jedi.SearchJediMixFeedFragment;
import kotlin.jvm.internal.o;

/* renamed from: X.JWl, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49299JWl implements InterfaceC49293JWf {
    public final /* synthetic */ SearchJediMixFeedFragment LIZ;

    public C49299JWl(SearchJediMixFeedFragment searchJediMixFeedFragment) {
        this.LIZ = searchJediMixFeedFragment;
    }

    @Override // X.InterfaceC49293JWf
    public final C49298JWk LIZ(int i) {
        return this.LIZ.Rn(i);
    }

    @Override // X.InterfaceC49293JWf
    public final void LIZIZ(C49298JWk result, C50420Jqa event, Aweme awemeScrollTo) {
        o.LJIIIZ(result, "result");
        o.LJIIIZ(event, "event");
        o.LJIIIZ(awemeScrollTo, "awemeScrollTo");
        this.LIZ.Wn(result.LIZ, event, awemeScrollTo, result.LIZIZ);
    }
}
