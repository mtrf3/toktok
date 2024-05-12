package X;

import com.ss.android.ugc.aweme.ecommerce.ug.feedeccard.repository.bean.FeedEcCardResponse;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.ug.feedeccard.manager.FeedEcCardManager$fetchFeedEcCardData$1", f = "FeedEcCardManager.kt", l = {298}, m = "invokeSuspend")
/* renamed from: X.ECu, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36048ECu extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ InterfaceC88472Yns<FeedEcCardResponse, C76800UCe> LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C36048ECu(String str, String str2, InterfaceC88472Yns<? super FeedEcCardResponse, C76800UCe> interfaceC88472Yns, InterfaceC67352kd<? super C36048ECu> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = str;
        this.LJLJJI = str2;
        this.LJLJJL = interfaceC88472Yns;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C36048ECu c36048ECu = new C36048ECu(this.LJLJI, this.LJLJJI, this.LJLJJL, interfaceC67352kd);
        c36048ECu.LJLILLLLZI = obj;
        return c36048ECu;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x004c, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L23;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            X.NAu r7 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r8.LJLIL
            r6 = 1
            r5 = 0
            if (r0 == 0) goto L13
            if (r0 != r6) goto Lb
            goto L2e
        Lb:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L13:
            X.C141335gf.LIZJ(r9)
            java.lang.Object r4 = r8.LJLILLLLZI
            java.lang.String r3 = "feed_ec_card"
            X.ECt r2 = new X.ECt     // Catch: java.lang.Throwable -> L4e
            java.lang.String r1 = r8.LJLJI     // Catch: java.lang.Throwable -> L4e
            java.lang.String r0 = r8.LJLJJI     // Catch: java.lang.Throwable -> L4e
            r2.<init>(r1, r0, r5)     // Catch: java.lang.Throwable -> L4e
            r8.LJLILLLLZI = r4     // Catch: java.lang.Throwable -> L4e
            r8.LJLIL = r6     // Catch: java.lang.Throwable -> L4e
            java.lang.Object r9 = X.C36669EaH.LIZLLL(r3, r5, r2, r8)     // Catch: java.lang.Throwable -> L4e
            if (r9 != r7) goto L31
            return r7
        L2e:
            X.C141335gf.LIZJ(r9)     // Catch: java.lang.Throwable -> L4e
        L31:
            X.Pbt r9 = (X.C64797Pbt) r9     // Catch: java.lang.Throwable -> L4e
            if (r9 == 0) goto L4e
            T r1 = r9.LIZIZ
            com.ss.android.ugc.aweme.ecommerce.api.model.Response r1 = (com.ss.android.ugc.aweme.ecommerce.api.model.Response) r1
            if (r1 == 0) goto L4e
            boolean r0 = r1.isCodeOK()
            if (r0 == 0) goto L4e
            T r1 = r1.data
            if (r1 == 0) goto L4e
            X.Yns<com.ss.android.ugc.aweme.ecommerce.ug.feedeccard.repository.bean.FeedEcCardResponse, X.UCe> r0 = r8.LJLJJL
            r0.invoke(r1)
            X.UCe r0 = X.C76800UCe.LIZ
            if (r0 != 0) goto L53
        L4e:
            X.Yns<com.ss.android.ugc.aweme.ecommerce.ug.feedeccard.repository.bean.FeedEcCardResponse, X.UCe> r0 = r8.LJLJJL
            r0.invoke(r5)
        L53:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C36048ECu.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
