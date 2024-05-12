package X;

import androidx.lifecycle.LifecycleOwner;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommercelive.business.hybrid.jsb.impl.EcPlayAudioMethod$loadGeckoAudio$1$1", f = "EcPlayAudioMethod.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.Fmh, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39987Fmh extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ LifecycleOwner LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ boolean LJLJJI;
    public final /* synthetic */ CompletionBlock<InterfaceC39992Fmm> LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39987Fmh(LifecycleOwner lifecycleOwner, String str, String str2, boolean z, CompletionBlock<InterfaceC39992Fmm> completionBlock, InterfaceC67352kd<? super C39987Fmh> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = lifecycleOwner;
        this.LJLILLLLZI = str;
        this.LJLJI = str2;
        this.LJLJJI = z;
        this.LJLJJL = completionBlock;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C39987Fmh(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        try {
            C39990Fmk.LIZ(this.LJLIL).LIZ(this.LJLILLLLZI, this.LJLJI, this.LJLJJI);
            this.LJLJJL.onSuccess(C39991Fml.LIZ(1, this.LJLILLLLZI), "");
        } catch (Throwable unused) {
            CompletionBlock<InterfaceC39992Fmm> completionBlock = this.LJLJJL;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("cannot play gecko audio file for ");
            LIZ.append(this.LJLILLLLZI);
            completionBlock.onFailure(0, X1D.LIZIZ(LIZ), C39991Fml.LIZ(-22, this.LJLILLLLZI));
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
