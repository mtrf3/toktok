package X;

import com.ss.ugc.android.davinciresource.jni.HTTP_TYPE;
import com.ss.ugc.android.davinciresource.jni.HttpClientCallbackAction;
import com.ss.ugc.android.davinciresource.jni.HttpClientCallbackDelegate;
import com.ss.ugc.android.davinciresource.jni.MapStringString;
import com.ss.ugc.android.davinciresource.jni.MsgExtParam;
import com.ss.ugc.android.davinciresource.jni.SWIGTYPE_p_void;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class X6K<V> implements Callable {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ X6R LJLILLLLZI;
    public final /* synthetic */ HTTP_TYPE LJLJI;
    public final /* synthetic */ long LJLJJI;
    public final /* synthetic */ MapStringString LJLJJL;
    public final /* synthetic */ MapStringString LJLJJLL;
    public final /* synthetic */ String LJLJL;
    public final /* synthetic */ byte[] LJLJLJ;
    public final /* synthetic */ SWIGTYPE_p_void LJLJLLL;
    public final /* synthetic */ HttpClientCallbackDelegate LJLL;

    public X6K(String str, X6R x6r, HTTP_TYPE http_type, long j, MapStringString mapStringString, MapStringString mapStringString2, String str2, byte[] bArr, SWIGTYPE_p_void sWIGTYPE_p_void, HttpClientCallbackDelegate httpClientCallbackDelegate) {
        this.LJLIL = str;
        this.LJLILLLLZI = x6r;
        this.LJLJI = http_type;
        this.LJLJJI = j;
        this.LJLJJL = mapStringString;
        this.LJLJJLL = mapStringString2;
        this.LJLJL = str2;
        this.LJLJLJ = bArr;
        this.LJLJLLL = sWIGTYPE_p_void;
        this.LJLL = httpClientCallbackDelegate;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        try {
            this.LJLILLLLZI.request(this.LJLIL, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL, this.LJLJLJ, this.LJLJLLL, this.LJLL);
            return Boolean.TRUE;
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
            o.LJIIIIZZ(bytes, "this as java.lang.String).getBytes(charset)");
            this.LJLL.onCallback(this.LJLJLLL, HttpClientCallbackAction.FAIL, bytes, bytes.length, msgExtParam);
            return C76800UCe.LIZ;
        }
    }
}
