package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.ui.jedi.SearchJediMixFeedFragment;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.search.pages.result.topsearch.core.ui.jedi.SearchJediMixFeedFragment$insertSatisfactionSurvey$1$1", f = "SearchJediMixFeedFragment.kt", l = {2581}, m = "invokeSuspend")
/* renamed from: X.Jf4, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49706Jf4 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ SearchJediMixFeedFragment LJLILLLLZI;
    public final /* synthetic */ Aweme LJLJI;
    public final /* synthetic */ int LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C49706Jf4(SearchJediMixFeedFragment searchJediMixFeedFragment, Aweme aweme, int i, InterfaceC67352kd<? super C49706Jf4> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = searchJediMixFeedFragment;
        this.LJLJI = aweme;
        this.LJLJJI = i;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C49706Jf4(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, interfaceC67352kd);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0099  */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            X.NAu r2 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r1 = r12.LJLIL
            r0 = 1
            if (r1 == 0) goto La0
            if (r1 != r0) goto Lae
            X.C141335gf.LIZJ(r13)
        Lc:
            com.ss.android.ugc.aweme.search.pages.result.topsearch.core.ui.jedi.SearchJediMixFeedFragment r0 = r12.LJLILLLLZI
            X.Jgz r0 = r0.LLLFF
            r2 = 0
            if (r0 == 0) goto L9e
            java.util.List r0 = r0.getItems()
            if (r0 == 0) goto L9e
            com.ss.android.ugc.aweme.feed.model.Aweme r5 = r12.LJLJI
            java.util.Iterator r4 = r0.iterator()
        L1f:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L9c
            java.lang.Object r3 = r4.next()
            r1 = r3
            com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed r1 = (com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed) r1
            boolean r0 = r1.LJIIIIZZ()
            if (r0 == 0) goto L1f
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r1.getAweme()
            if (r0 == 0) goto L1f
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r1.getAweme()
            java.lang.String r1 = r0.getAid()
            java.lang.String r0 = r5.getAid()
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 == 0) goto L1f
        L4a:
            com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed r3 = (com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed) r3
            if (r3 == 0) goto L9e
            int r8 = r3.LJLILLLLZI
        L50:
            com.ss.android.ugc.aweme.search.pages.result.topsearch.core.ui.jedi.SearchJediMixFeedFragment r0 = r12.LJLILLLLZI
            com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility r0 = X.C17N.LJJJJJL(r0)
            X.Jkl r0 = r0.If()
            X.OzC r0 = r0.LIZJ()
            X.Jp0 r0 = (X.C50322Jp0) r0
            X.JpU r3 = new X.JpU
            X.JpT r0 = r0.LJLLLL
            if (r0 == 0) goto L99
            com.ss.android.ugc.aweme.search.pages.result.common.feelgoodsurvey.core.model.FeelgoodSurveyModel r4 = r0.LIZ
            com.ss.android.ugc.aweme.search.pages.result.common.feelgoodsurvey.core.model.CustomText r5 = r0.LIZLLL
        L6a:
            com.ss.android.ugc.aweme.feed.model.Aweme r6 = r12.LJLJI
            com.ss.android.ugc.aweme.search.pages.result.topsearch.core.ui.jedi.SearchJediMixFeedFragment r1 = r12.LJLILLLLZI
            int r0 = r12.LJLJJI
            boolean r7 = r1.An(r0)
            long r9 = java.lang.System.currentTimeMillis()
            r11 = 64
            r3.<init>(r4, r5, r6, r7, r8, r9, r11)
            com.ss.android.ugc.aweme.search.pages.result.topsearch.core.ui.jedi.SearchJediMixFeedFragment r1 = r12.LJLILLLLZI
            com.ss.android.ugc.aweme.search.pages.result.common.feelgoodsurvey.satisfactionsurvey.core.viewmodel.SearchSatisfactionSurveyVM r0 = r1.LLJILLL
            if (r0 == 0) goto L85
            r0.LJLJI = r3
        L85:
            X.Lm3 r1 = X.C55230Lly.LIZJ(r1, r2)
            java.lang.Class<com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AdapterControlAbility> r0 = com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AdapterControlAbility.class
            X.2K0 r1 = X.C55096Ljo.LIZIZ(r1, r0)
            com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AdapterControlAbility r1 = (com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AdapterControlAbility) r1
            int r0 = r12.LJLJJI
            r1.iu(r0, r3)
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L99:
            r4 = r2
            r5 = r2
            goto L6a
        L9c:
            r3 = r2
            goto L4a
        L9e:
            r8 = -1
            goto L50
        La0:
            X.C141335gf.LIZJ(r13)
            r12.LJLIL = r0
            r0 = 500(0x1f4, double:2.47E-321)
            java.lang.Object r0 = X.C1JD.LIZJ(r0, r12)
            if (r0 != r2) goto Lc
            return r2
        Lae:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C49706Jf4.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
