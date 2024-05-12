package X;

import com.ss.android.ugc.aweme.ecommerce.ug.vsa.repository.bean.VSAProductCardsRequest;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import fjb.a;
import java.util.List;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.ug.vsa.manager.EcUgVSAManager$preloadProductData$1$1", f = "EcUgVSAManager.kt", l = {205}, m = "invokeSuspend")
/* loaded from: classes11.dex */
public final class OL0 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ List<VSAProductCardsRequest.ProductInfo> LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ List<Aweme> LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OL0(String str, List list, List list2, InterfaceC67352kd interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = list;
        this.LJLJJI = str;
        this.LJLJJL = list2;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        OL0 ol0 = new OL0(this.LJLJJI, this.LJLJI, this.LJLJJL, interfaceC67352kd);
        ol0.LJLILLLLZI = obj;
        return ol0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:131:0x01b8, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L106;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            Method dump skipped, instructions count: 498
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.OL0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
