package X;

import com.ss.android.ugc.aweme.effectcreator.services.TiktokGifRepository;
import com.ss.android.ugc.effectmanager.effect.model.ProviderEffectModel;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.effectcreator.services.TiktokGifRepository$trendGifs$2", f = "TiktokGifRepository.kt", l = {170}, m = "invokeSuspend")
/* renamed from: X.amx, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94807amx extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super ProviderEffectModel>, Object> {
    public Object LJLIL;
    public Object LJLILLLLZI;
    public int LJLJI;
    public final /* synthetic */ TiktokGifRepository LJLJJI;
    public final /* synthetic */ String LJLJJL;
    public final /* synthetic */ int LJLJJLL;
    public final /* synthetic */ int LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C94807amx(TiktokGifRepository tiktokGifRepository, String str, int i, int i2, InterfaceC67352kd<? super C94807amx> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJJI = tiktokGifRepository;
        this.LJLJJL = str;
        this.LJLJJLL = i;
        this.LJLJL = i2;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C94807amx(this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLJI;
        if (i != 0) {
            if (i == 1) {
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            TiktokGifRepository tiktokGifRepository = this.LJLJJI;
            String str = this.LJLJJL;
            int i2 = this.LJLJJLL;
            int i3 = this.LJLJL;
            this.LJLIL = tiktokGifRepository;
            this.LJLILLLLZI = str;
            this.LJLJI = 1;
            XKS xks = new XKS(1, C78555UsJ.LJJII(this));
            xks.LJIIL();
            tiktokGifRepository.effectPlatform.LJIIIZ("giphy", str, i2, i3, new C94440ah2(xks));
            obj = xks.LJIIJJI();
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return obj;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super ProviderEffectModel> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
