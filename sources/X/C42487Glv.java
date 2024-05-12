package X;

import com.ss.android.ugc.aweme.ad.feed.ibe.CommerceIBEService;
import com.ss.android.ugc.aweme.ad.feed.ibe.ICommerceIBEService;
import com.ss.android.ugc.aweme.commerce.IBEInfo;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ad.feed.ibe.IBEPreloadTask$preloadIBEGecko$1$1$1", f = "IBEPreloadTask.kt", l = {BaseNotice.CREATOR}, m = "invokeSuspend")
/* renamed from: X.Glv, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42487Glv extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ IBEInfo LJLILLLLZI;
    public final /* synthetic */ ETC LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C42487Glv(IBEInfo iBEInfo, ETC etc, InterfaceC67352kd<? super C42487Glv> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = iBEInfo;
        this.LJLJI = etc;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C42487Glv(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i == 1) {
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            ICommerceIBEService LJFF = CommerceIBEService.LJFF();
            IBEInfo iBEInfo = this.LJLILLLLZI;
            C58628Mzg c58628Mzg = new C58628Mzg(this.LJLJI, this.LJLILLLLZI);
            this.LJLIL = 1;
            if (LJFF.LIZ(iBEInfo, c58628Mzg, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
