package X;

import com.bytedance.effectcreatormobile.resource.ep.impl.GifRepositoryImpl;
import com.ss.android.ugc.effectmanager.effect.model.ProviderEffect;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.bytedance.effectcreatormobile.resource.ep.impl.GifRepositoryImpl$downloadGif$2", f = "GifRepositoryImpl.kt", l = {165}, m = "invokeSuspend")
/* renamed from: X.amU, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94778amU extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super ProviderEffect>, Object> {
    public Object LJLIL;
    public int LJLILLLLZI;
    public final /* synthetic */ GifRepositoryImpl LJLJI;
    public final /* synthetic */ ProviderEffect LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C94778amU(GifRepositoryImpl gifRepositoryImpl, ProviderEffect providerEffect, InterfaceC67352kd interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = gifRepositoryImpl;
        this.LJLJJI = providerEffect;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> completion) {
        o.LJIIIZ(completion, "completion");
        return new C94778amU(this.LJLJI, this.LJLJJI, completion);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super ProviderEffect> interfaceC67352kd) {
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
            this.LJLJI.effectManager.downloadProviderEffect(this.LJLJJI, new C94427agp(xks));
            obj = xks.LJIIJJI();
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return obj;
    }
}
