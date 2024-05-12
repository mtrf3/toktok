package X;

import androidx.lifecycle.LifecycleOwner;
import com.bytedance.forest.Forest;
import com.bytedance.forest.model.RequestParams;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommercelive.business.hybrid.jsb.impl.EcPlayAudioMethod$loadCdnAudio$1", f = "EcPlayAudioMethod.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.Fmj, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39989Fmj extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ CompletionBlock<InterfaceC39992Fmm> LJLJI;
    public final /* synthetic */ LifecycleOwner LJLJJI;
    public final /* synthetic */ boolean LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39989Fmj(String str, CompletionBlock<InterfaceC39992Fmm> completionBlock, LifecycleOwner lifecycleOwner, boolean z, InterfaceC67352kd<? super C39989Fmj> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = str;
        this.LJLJI = completionBlock;
        this.LJLJJI = lifecycleOwner;
        this.LJLJJL = z;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C39989Fmj c39989Fmj = new C39989Fmj(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, interfaceC67352kd);
        c39989Fmj.LJLIL = obj;
        return c39989Fmj;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        String str;
        C38515F9r createSyncRequest;
        C141335gf.LIZJ(obj);
        InterfaceC70422pa interfaceC70422pa = (InterfaceC70422pa) this.LJLIL;
        Forest LIZ = C39914FlW.LIZ();
        RequestParams requestParams = new RequestParams(null, 1, null);
        requestParams.setEnableCDNCache(Boolean.TRUE);
        try {
            createSyncRequest = LIZ.createSyncRequest(this.LJLILLLLZI, requestParams);
        } catch (Throwable unused) {
        }
        if (createSyncRequest != null) {
            C61295O3v LIZ2 = createSyncRequest.LIZ();
            if (LIZ2 != null) {
                str = LIZ2.getFilePath();
                if (str != null || str.length() == 0) {
                    CompletionBlock<InterfaceC39992Fmm> completionBlock = this.LJLJI;
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append("cannot find cdn audio file for ");
                    LIZ3.append(this.LJLILLLLZI);
                    completionBlock.onFailure(0, X1D.LIZIZ(LIZ3), C39991Fml.LIZ(-12, this.LJLILLLLZI));
                    return C76800UCe.LIZ;
                }
                XKX.LIZLLL(interfaceC70422pa, C36636EZk.LIZ, null, new C39988Fmi(this.LJLJJI, this.LJLILLLLZI, str, this.LJLJJL, this.LJLJI, null), 2);
                return C76800UCe.LIZ;
            }
        }
        str = null;
        if (str != null) {
        }
        CompletionBlock<InterfaceC39992Fmm> completionBlock2 = this.LJLJI;
        StringBuilder LIZ32 = X1D.LIZ();
        LIZ32.append("cannot find cdn audio file for ");
        LIZ32.append(this.LJLILLLLZI);
        completionBlock2.onFailure(0, X1D.LIZIZ(LIZ32), C39991Fml.LIZ(-12, this.LJLILLLLZI));
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
