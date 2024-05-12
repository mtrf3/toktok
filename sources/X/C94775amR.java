package X;

import com.bytedance.effectcreatormobile.resource.ep.impl.DefaultResourceProvider;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.bytedance.effectcreatormobile.resource.ep.impl.DefaultResourceProvider$onFetchPanelSuccess$2", f = "DefaultResourceProvider.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.amR, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94775amR extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ DefaultResourceProvider LJLIL;
    public final /* synthetic */ EffectChannelResponse LJLILLLLZI;
    public final /* synthetic */ AbstractC94465ahR LJLJI;
    public final /* synthetic */ InterfaceC93663aUV LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C94775amR(DefaultResourceProvider defaultResourceProvider, EffectChannelResponse effectChannelResponse, AbstractC94465ahR abstractC94465ahR, InterfaceC93663aUV interfaceC93663aUV, InterfaceC67352kd interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = defaultResourceProvider;
        this.LJLILLLLZI = effectChannelResponse;
        this.LJLJI = abstractC94465ahR;
        this.LJLJJI = interfaceC93663aUV;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> completion) {
        o.LJIIIZ(completion, "completion");
        return new C94775amR(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, completion);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        DefaultResourceProvider defaultResourceProvider = this.LJLIL;
        defaultResourceProvider.addAll(defaultResourceProvider.effectCache, this.LJLILLLLZI.getAllCategoryEffects());
        this.LJLJJI.onSuccess(this.LJLJI.LJFF(this.LJLILLLLZI));
        return C76800UCe.LIZ;
    }
}
