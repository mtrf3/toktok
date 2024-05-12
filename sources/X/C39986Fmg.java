package X;

import androidx.lifecycle.LifecycleOwner;
import com.bytedance.forest.Forest;
import com.bytedance.forest.model.RequestParams;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import fjb.a;
import kotlin.jvm.internal.o;
import ujb.s;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommercelive.business.hybrid.jsb.impl.EcPlayAudioMethod$loadGeckoAudio$1", f = "EcPlayAudioMethod.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.Fmg, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39986Fmg extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ CompletionBlock<InterfaceC39992Fmm> LJLJJI;
    public final /* synthetic */ String LJLJJL;
    public final /* synthetic */ LifecycleOwner LJLJJLL;
    public final /* synthetic */ boolean LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39986Fmg(String str, String str2, CompletionBlock<InterfaceC39992Fmm> completionBlock, String str3, LifecycleOwner lifecycleOwner, boolean z, InterfaceC67352kd<? super C39986Fmg> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = str;
        this.LJLJI = str2;
        this.LJLJJI = completionBlock;
        this.LJLJJL = str3;
        this.LJLJJLL = lifecycleOwner;
        this.LJLJL = z;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C39986Fmg c39986Fmg = new C39986Fmg(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL, interfaceC67352kd);
        c39986Fmg.LJLIL = obj;
        return c39986Fmg;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        String filePath;
        C141335gf.LIZJ(obj);
        InterfaceC70422pa interfaceC70422pa = (InterfaceC70422pa) this.LJLIL;
        Forest LIZ = C39914FlW.LIZ();
        String str = this.LJLILLLLZI;
        String substring = str.substring(s.LJJLIIIJL(str, this.LJLJI, 0, false, 6));
        o.LJIIIIZZ(substring, "this as java.lang.String).substring(startIndex)");
        RequestParams requestParams = new RequestParams(null, 1, null);
        String str2 = this.LJLJJL;
        requestParams.setAccessKey(C38943FQd.LIZ());
        requestParams.setChannel(str2);
        requestParams.setWaitGeckoUpdate(true);
        requestParams.setBundle(substring);
        try {
            C38515F9r createSyncRequest = LIZ.createSyncRequest("", requestParams);
            if (createSyncRequest != null) {
                C61295O3v LIZ2 = createSyncRequest.LIZ();
                if (LIZ2 != null && (filePath = LIZ2.getFilePath()) != null && filePath.length() != 0 && C1B6.LIZIZ(filePath)) {
                    XKX.LIZLLL(interfaceC70422pa, C36636EZk.LIZ, null, new C39987Fmh(this.LJLJJLL, this.LJLILLLLZI, filePath, this.LJLJL, this.LJLJJI, null), 2);
                    return C76800UCe.LIZ;
                }
            }
        } catch (Throwable unused) {
        }
        CompletionBlock<InterfaceC39992Fmm> completionBlock = this.LJLJJI;
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("cannot find gecko audio file for ");
        LIZ3.append(this.LJLILLLLZI);
        completionBlock.onFailure(0, X1D.LIZIZ(LIZ3), C39991Fml.LIZ(-22, this.LJLILLLLZI));
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
