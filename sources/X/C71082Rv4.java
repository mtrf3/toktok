package X;

import com.ss.android.ugc.aweme.ecommerce.ug.feedeccard.bean.FeedEcCardConfig;
import com.ss.android.ugc.aweme.ecommerce.ug.feedeccard.bean.FeedEcCardData;
import com.ss.android.ugc.aweme.ecommerce.ug.feedeccard.card.container.view.biz.DefaultFeedEcCardBizView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import fjb.a;
import java.util.List;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.ug.feedeccard.card.container.view.biz.DefaultFeedEcCardBizView$tryToTrackProductShow$1", f = "DefaultFeedEcCardBizView.kt", l = {842, 588}, m = "invokeSuspend")
/* renamed from: X.Rv4, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71082Rv4 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public Object LJLIL;
    public FeedEcCardConfig LJLILLLLZI;
    public Object LJLJI;
    public int LJLJJI;
    public final /* synthetic */ DefaultFeedEcCardBizView LJLJJL;
    public final /* synthetic */ C71076Ruy LJLJJLL;
    public final /* synthetic */ List<Object> LJLJL;
    public final /* synthetic */ FeedEcCardData LJLJLJ;
    public final /* synthetic */ Aweme LJLJLLL;
    public final /* synthetic */ FeedEcCardConfig LJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C71082Rv4(DefaultFeedEcCardBizView defaultFeedEcCardBizView, C71076Ruy c71076Ruy, List<? extends Object> list, FeedEcCardData feedEcCardData, Aweme aweme, FeedEcCardConfig feedEcCardConfig, InterfaceC67352kd<? super C71082Rv4> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJJL = defaultFeedEcCardBizView;
        this.LJLJJLL = c71076Ruy;
        this.LJLJL = list;
        this.LJLJLJ = feedEcCardData;
        this.LJLJLLL = aweme;
        this.LJLL = feedEcCardConfig;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C71082Rv4(this.LJLJJL, this.LJLJJLL, this.LJLJL, this.LJLJLJ, this.LJLJLLL, this.LJLL, interfaceC67352kd);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ce A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.util.List] */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            X.NAu r5 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r10.LJLJJI
            r6 = 2
            r4 = 0
            r3 = 1
            if (r0 == 0) goto L67
            if (r0 == r3) goto L89
            if (r0 != r6) goto Ld6
            java.lang.Object r8 = r10.LJLJI
            java.util.List r8 = (java.util.List) r8
            com.ss.android.ugc.aweme.ecommerce.ug.feedeccard.bean.FeedEcCardConfig r1 = r10.LJLILLLLZI
            java.lang.Object r7 = r10.LJLIL
            com.ss.android.ugc.aweme.feed.model.Aweme r7 = (com.ss.android.ugc.aweme.feed.model.Aweme) r7
            X.C141335gf.LIZJ(r11)
        L1a:
            java.util.Iterator r9 = r8.iterator()
            r6 = 0
        L1f:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto Ld3
            java.lang.Object r5 = r9.next()
            int r8 = r6 + 1
            if (r6 < 0) goto Lcf
            com.ss.android.ugc.aweme.ecommerce.ug.common.bean.EcUgProduct r5 = (com.ss.android.ugc.aweme.ecommerce.ug.common.bean.EcUgProduct) r5
            java.lang.String r0 = "product"
            kotlin.jvm.internal.o.LJIIIZ(r5, r0)
            java.lang.String r0 = "aweme"
            kotlin.jvm.internal.o.LJIIIZ(r7, r0)
            java.lang.String r0 = "cardConfig"
            kotlin.jvm.internal.o.LJIIIZ(r1, r0)
            java.util.Map r2 = X.C71065Run.LJIIJ(r6, r5, r7, r1)
            java.lang.String r0 = "tiktokec_product_show"
            X.C76542zS.LIZ(r0, r2)
            java.lang.Integer r2 = r1.getContentType()
            if (r2 != 0) goto L50
        L4e:
            r6 = r8
            goto L1f
        L50:
            int r0 = r2.intValue()
            if (r0 == r3) goto L5d
            int r2 = r2.intValue()
            r0 = 3
            if (r2 != r0) goto L4e
        L5d:
            java.util.Map r2 = X.C71065Run.LJIIIZ(r6, r5, r7, r1)
            java.lang.String r0 = "tiktokec_button_show"
            X.C76542zS.LIZ(r0, r2)
            goto L4e
        L67:
            X.C141335gf.LIZJ(r11)
            com.ss.android.ugc.aweme.ecommerce.ug.feedeccard.card.container.view.biz.DefaultFeedEcCardBizView r2 = r10.LJLJJL
            boolean r0 = r2.LJLJLJ
            if (r0 != 0) goto L99
            r10.LJLIL = r2
            r10.LJLJJI = r3
            X.XKS r1 = new X.XKS
            X.2kd r0 = X.C78555UsJ.LJJII(r10)
            r1.<init>(r3, r0)
            r1.LJIIL()
            r2.LJLJJL = r1
            java.lang.Object r0 = r1.LJIIJJI()
            if (r0 != r5) goto L8c
            return r5
        L89:
            X.C141335gf.LIZJ(r11)
        L8c:
            X.Ruy r0 = r10.LJLJJLL
            java.util.concurrent.CopyOnWriteArrayList<java.lang.String> r1 = r0.LIZIZ
            java.lang.String r0 = "/api/v1/shop/recommend/impression/write"
            r1.add(r0)
            com.ss.android.ugc.aweme.ecommerce.ug.feedeccard.card.container.view.biz.DefaultFeedEcCardBizView r0 = r10.LJLJJL
            r0.LJLJJL = r4
        L99:
            java.util.List<java.lang.Object> r0 = r10.LJLJL
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Iterator r2 = r0.iterator()
        La4:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto Lb8
            java.lang.Object r1 = r2.next()
            boolean r0 = r1 instanceof com.ss.android.ugc.aweme.ecommerce.ug.common.bean.EcUgProduct
            if (r0 == 0) goto La4
            if (r1 == 0) goto La4
            r8.add(r1)
            goto La4
        Lb8:
            com.ss.android.ugc.aweme.ecommerce.ug.feedeccard.bean.FeedEcCardData r2 = r10.LJLJLJ
            com.ss.android.ugc.aweme.feed.model.Aweme r7 = r10.LJLJLLL
            com.ss.android.ugc.aweme.ecommerce.ug.feedeccard.bean.FeedEcCardConfig r1 = r10.LJLL
            X.ED1 r0 = X.ED1.LIZ
            r10.LJLIL = r7
            r10.LJLILLLLZI = r1
            r10.LJLJI = r8
            r10.LJLJJI = r6
            java.lang.Object r0 = r0.LIZ(r2, r8, r10)
            if (r0 != r5) goto L1a
            return r5
        Lcf:
            X.C47261Igj.LJJJJJ()
            throw r4
        Ld3:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        Ld6:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71082Rv4.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
