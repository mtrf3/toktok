package X;

import com.ss.ugc.android.davinciresource.jni.HTTP_TYPE;
import com.ss.ugc.android.davinciresource.jni.HttpClientCallbackAction;
import com.ss.ugc.android.davinciresource.jni.HttpClientCallbackDelegate;
import com.ss.ugc.android.davinciresource.jni.MapStringString;
import com.ss.ugc.android.davinciresource.jni.MsgExtParam;
import com.ss.ugc.android.davinciresource.jni.SWIGTYPE_p_void;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.bytedance.ies.cutsame.effectfetcher.EffectNetWorker$requestNet$1", f = "EffectNetWorker.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes16.dex */
public final class X6J extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ X6S LJLILLLLZI;
    public final /* synthetic */ HTTP_TYPE LJLJI;
    public final /* synthetic */ long LJLJJI;
    public final /* synthetic */ MapStringString LJLJJL;
    public final /* synthetic */ MapStringString LJLJJLL;
    public final /* synthetic */ String LJLJL;
    public final /* synthetic */ byte[] LJLJLJ;
    public final /* synthetic */ SWIGTYPE_p_void LJLJLLL;
    public final /* synthetic */ HttpClientCallbackDelegate LJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X6J(String str, X6S x6s, HTTP_TYPE http_type, long j, MapStringString mapStringString, MapStringString mapStringString2, String str2, byte[] bArr, SWIGTYPE_p_void sWIGTYPE_p_void, HttpClientCallbackDelegate httpClientCallbackDelegate, InterfaceC67352kd<? super X6J> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = str;
        this.LJLILLLLZI = x6s;
        this.LJLJI = http_type;
        this.LJLJJI = j;
        this.LJLJJL = mapStringString;
        this.LJLJJLL = mapStringString2;
        this.LJLJL = str2;
        this.LJLJLJ = bArr;
        this.LJLJLLL = sWIGTYPE_p_void;
        this.LJLL = httpClientCallbackDelegate;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new X6J(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL, this.LJLJLJ, this.LJLJLLL, this.LJLL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        try {
            this.LJLILLLLZI.request(this.LJLIL, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL, this.LJLJLJ, this.LJLJLLL, this.LJLL);
        } catch (Exception unused) {
            MsgExtParam msgExtParam = new MsgExtParam();
            HTTP_TYPE http_type = this.LJLJI;
            if (http_type == null) {
                http_type = HTTP_TYPE.HTTP_GET;
            }
            msgExtParam.setEHttpType(http_type);
            msgExtParam.setUiReqId(this.LJLJJI);
            msgExtParam.setErrorCode(-1);
            byte[] bytes = "Network Failed".getBytes(PVC.LIZ);
            o.LJIIIIZZ(bytes, "(this as java.lang.String).getBytes(charset)");
            this.LJLL.onCallback(this.LJLJLLL, HttpClientCallbackAction.FAIL, bytes, bytes.length, msgExtParam);
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
