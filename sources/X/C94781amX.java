package X;

import com.bytedance.effectcreatormobile.resource.ep.impl.GifRepositoryImpl;
import com.ss.android.ugc.effectmanager.effect.model.ProviderEffectModel;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.bytedance.effectcreatormobile.resource.ep.impl.GifRepositoryImpl$searchGifs$2", f = "GifRepositoryImpl.kt", l = {165}, m = "invokeSuspend")
/* renamed from: X.amX, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94781amX extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super ProviderEffectModel>, Object> {
    public Object LJLIL;
    public int LJLILLLLZI;
    public final /* synthetic */ GifRepositoryImpl LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ int LJLJJL;
    public final /* synthetic */ int LJLJJLL;
    public final /* synthetic */ String LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C94781amX(GifRepositoryImpl gifRepositoryImpl, String str, int i, int i2, String str2, InterfaceC67352kd interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = gifRepositoryImpl;
        this.LJLJJI = str;
        this.LJLJJL = i;
        this.LJLJJLL = i2;
        this.LJLJL = str2;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> completion) {
        o.LJIIIZ(completion, "completion");
        return new C94781amX(this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL, completion);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super ProviderEffectModel> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLILLLLZI;
        if (i != 0) {
            if (i == 1) {
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            this.LJLIL = this;
            this.LJLILLLLZI = 1;
            XKS xks = new XKS(1, C78555UsJ.LJJII(this));
            xks.LJIIL();
            this.LJLJI.effectManager.searchProviderEffect(this.LJLJJI, "giphy", this.LJLJJL, this.LJLJJLL, false, this.LJLJL, new C94430ags(xks));
            obj = xks.LJIIJJI();
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return obj;
    }
}
