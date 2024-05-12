package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.ui.jedi.SearchJediMixFeedFragment;
import java.util.List;

/* renamed from: X.JfB, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49713JfB implements InterfaceC50390Jq6 {
    public final C49825Jgz LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final List<Aweme> LIZLLL;
    public final /* synthetic */ C49825Jgz LJ;
    public final /* synthetic */ SearchJediMixFeedFragment LJFF;

    @Override // X.InterfaceC50390Jq6
    public final void LIZ() {
        this.LJFF.LLJZ.LJIILL(4);
    }

    @Override // X.InterfaceC50390Jq6
    public final boolean isDataEmpty() {
        return this.LJ.isDataEmpty();
    }

    @Override // X.InterfaceC50390Jq6
    public final int LIZIZ() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC50390Jq6
    public final C49825Jgz LIZJ() {
        return this.LIZ;
    }

    @Override // X.InterfaceC50390Jq6
    public final List<Aweme> LIZLLL() {
        return this.LIZLLL;
    }

    public C49713JfB(C49825Jgz c49825Jgz, int i, C76732zl c76732zl, List<Aweme> list, SearchJediMixFeedFragment searchJediMixFeedFragment) {
        this.LJ = c49825Jgz;
        this.LJFF = searchJediMixFeedFragment;
        this.LIZ = c49825Jgz;
        this.LIZIZ = i;
        this.LIZJ = c76732zl.element;
        this.LIZLLL = ORZ.LLJI(list);
    }
}
