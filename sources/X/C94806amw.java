package X;

import com.ss.android.ugc.aweme.effectcreator.services.TiktokGifRepository;
import com.ss.android.ugc.effectmanager.effect.model.ProviderEffectModel;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.effectcreator.services.TiktokGifRepository$searchGifs$2", f = "TiktokGifRepository.kt", l = {170}, m = "invokeSuspend")
/* renamed from: X.amw, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94806amw extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super ProviderEffectModel>, Object> {
    public Object LJLIL;
    public Object LJLILLLLZI;
    public Object LJLJI;
    public int LJLJJI;
    public final /* synthetic */ TiktokGifRepository LJLJJL;
    public final /* synthetic */ String LJLJJLL;
    public final /* synthetic */ String LJLJL;
    public final /* synthetic */ int LJLJLJ;
    public final /* synthetic */ int LJLJLLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C94806amw(TiktokGifRepository tiktokGifRepository, String str, String str2, int i, int i2, InterfaceC67352kd<? super C94806amw> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJJL = tiktokGifRepository;
        this.LJLJJLL = str;
        this.LJLJL = str2;
        this.LJLJLJ = i;
        this.LJLJLLL = i2;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C94806amw(this.LJLJJL, this.LJLJJLL, this.LJLJL, this.LJLJLJ, this.LJLJLLL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLJJI;
        if (i != 0) {
            if (i == 1) {
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            TiktokGifRepository tiktokGifRepository = this.LJLJJL;
            String str = this.LJLJJLL;
            String str2 = this.LJLJL;
            int i2 = this.LJLJLJ;
            int i3 = this.LJLJLLL;
            this.LJLIL = tiktokGifRepository;
            this.LJLILLLLZI = str;
            this.LJLJI = str2;
            this.LJLJJI = 1;
            XKS xks = new XKS(1, C78555UsJ.LJJII(this));
            xks.LJIIL();
            tiktokGifRepository.effectPlatform.LJJIIJ(str, "giphy", i2, i3, false, str2, new C94439ah1(xks));
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
