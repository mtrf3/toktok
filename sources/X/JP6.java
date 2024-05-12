package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.cs.core.model.ClickSearchViewModel;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.topfeed.TopVideoHolderVM;

/* loaded from: classes9.dex */
public final class JP6 extends AbstractC65781Prl implements InterfaceC88472Yns<JP4, C76800UCe> {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ Aweme LJLILLLLZI;
    public final /* synthetic */ C49045JMr LJLJI;
    public final /* synthetic */ TopVideoHolderVM LJLJJI;
    public final /* synthetic */ ClickSearchViewModel LJLJJL;
    public final /* synthetic */ String LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JP6(int i, Aweme aweme, C49045JMr c49045JMr, TopVideoHolderVM topVideoHolderVM, ClickSearchViewModel clickSearchViewModel, String str) {
        super(1);
        this.LJLIL = i;
        this.LJLILLLLZI = aweme;
        this.LJLJI = c49045JMr;
        this.LJLJJI = topVideoHolderVM;
        this.LJLJJL = clickSearchViewModel;
        this.LJLJJLL = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0031, code lost:
    
        if (kotlin.jvm.internal.o.LJ(r1, r0) == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x009b, code lost:
    
        if (r7 != null) goto L11;
     */
    @Override // X.InterfaceC88472Yns
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C76800UCe invoke(X.JP4 r7) {
        /*
            r6 = this;
            X.JP4 r7 = (X.JP4) r7
            r4 = 0
            if (r7 == 0) goto L9a
            X.Jw8<com.ss.android.ugc.aweme.search.pages.result.core.repo.ClickSearchResponse> r0 = r7.LIZLLL
            if (r0 == 0) goto L9a
            T r0 = r0.LIZIZ
            com.ss.android.ugc.aweme.search.pages.result.core.repo.ClickSearchResponse r0 = (com.ss.android.ugc.aweme.search.pages.result.core.repo.ClickSearchResponse) r0
            if (r0 == 0) goto L9a
            java.util.List<com.ss.android.ugc.aweme.search.pages.result.core.repo.ClickSearchWord> r0 = r0.wordsList
            if (r0 == 0) goto L9a
            int r3 = r0.size()
        L17:
            int r1 = r7.LIZ
            int r0 = r6.LJLIL
            if (r1 != r0) goto L1e
            r4 = 1
        L1e:
            r2 = 0
            if (r4 == 0) goto L33
            if (r7 == 0) goto L98
            java.lang.String r1 = r7.LIZIZ
        L25:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r6.LJLILLLLZI
            if (r0 == 0) goto L96
            java.lang.String r0 = r0.getAid()
        L2d:
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 != 0) goto L3e
        L33:
            X.JMr r0 = r6.LJLJI
            r0.LJLJL = r2
            com.ss.android.ugc.aweme.search.pages.result.topsearch.topfeed.TopVideoHolderVM r0 = r6.LJLJJI
            com.bytedance.ies.sdk.widgets.NextLiveData<X.JP8> r0 = r0.LJLJLLL
            r0.postValue(r2)
        L3e:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r6.LJLILLLLZI
            boolean r0 = r0.isAd()
            if (r0 == 0) goto L49
        L46:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L49:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r6.LJLILLLLZI
            boolean r0 = X.C49111JPf.LIZIZ(r0)
            if (r0 == 0) goto L52
            goto L46
        L52:
            if (r7 == 0) goto L7f
            if (r3 <= 0) goto L7f
            int r1 = r7.LIZ
            int r0 = r6.LJLIL
            if (r1 != r0) goto L7f
            java.lang.String r1 = r7.LIZIZ
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r6.LJLILLLLZI
            if (r0 == 0) goto L7d
            java.lang.String r0 = r0.getAid()
        L66:
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 == 0) goto L7f
            X.JMr r0 = r6.LJLJI
            r0.LJLJL = r2
            com.ss.android.ugc.aweme.search.pages.result.topsearch.topfeed.TopVideoHolderVM r0 = r6.LJLJJI
            com.bytedance.ies.sdk.widgets.NextLiveData<X.JP8> r1 = r0.LJLJLLL
            X.JP8 r0 = new X.JP8
            r0.<init>(r7)
            r1.postValue(r0)
            goto L46
        L7d:
            r0 = r2
            goto L66
        L7f:
            com.ss.android.ugc.aweme.search.pages.result.topsearch.cs.core.model.ClickSearchViewModel r0 = r6.LJLJJL
            r0.lv0(r2)
            X.JMr r2 = r6.LJLJI
            X.JNi r0 = new X.JNi
            com.ss.android.ugc.aweme.search.pages.result.topsearch.cs.core.model.ClickSearchViewModel r1 = r6.LJLJJL
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r6.LJLILLLLZI
            java.lang.String r4 = r6.LJLJJLL
            int r5 = r6.LJLIL
            r0.<init>(r1, r2, r3, r4, r5)
            r2.LJLJL = r0
            goto L46
        L96:
            r0 = r2
            goto L2d
        L98:
            r1 = r2
            goto L25
        L9a:
            r3 = 0
            if (r7 == 0) goto L1e
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: X.JP6.invoke(java.lang.Object):java.lang.Object");
    }
}
