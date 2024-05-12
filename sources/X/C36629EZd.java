package X;

import com.bytedance.ies.nle.editor_jni.MsgExtParam;
import com.bytedance.ies.nle.editor_jni.NLEHttpClientCallbackAction;
import com.bytedance.ies.nle.editor_jni.NLEHttpClientCallbackDelegate;
import com.bytedance.ies.nle.editor_jni.NLEHttpType;
import com.bytedance.ies.nle.editor_jni.SWIGTYPE_p_void;
import com.bytedance.ies.nle.editor_jni.UnorderedMapStrStr;
import java.nio.charset.Charset;
import kotlin.jvm.internal.o;

/* renamed from: X.EZd, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36629EZd extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ AbstractC36626EZa LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ NLEHttpType LJLJI;
    public final /* synthetic */ long LJLJJI;
    public final /* synthetic */ UnorderedMapStrStr LJLJJL;
    public final /* synthetic */ byte[] LJLJJLL;
    public final /* synthetic */ String LJLJL;
    public final /* synthetic */ SWIGTYPE_p_void LJLJLJ;
    public final /* synthetic */ NLEHttpClientCallbackDelegate LJLJLLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C36629EZd(AbstractC36626EZa abstractC36626EZa, String str, NLEHttpType nLEHttpType, long j, UnorderedMapStrStr unorderedMapStrStr, byte[] bArr, String str2, SWIGTYPE_p_void sWIGTYPE_p_void, NLEHttpClientCallbackDelegate nLEHttpClientCallbackDelegate) {
        super(0);
        this.LJLIL = abstractC36626EZa;
        this.LJLILLLLZI = str;
        this.LJLJI = nLEHttpType;
        this.LJLJJI = j;
        this.LJLJJL = unorderedMapStrStr;
        this.LJLJJLL = bArr;
        this.LJLJL = str2;
        this.LJLJLJ = sWIGTYPE_p_void;
        this.LJLJLLL = nLEHttpClientCallbackDelegate;
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        try {
            this.LJLIL.LIZ(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL, this.LJLJLJ, this.LJLJLLL);
        } catch (Exception e) {
            MsgExtParam msgExtParam = new MsgExtParam();
            NLEHttpType nLEHttpType = this.LJLJI;
            if (nLEHttpType == null) {
                nLEHttpType = NLEHttpType.HTTP_GET;
            }
            msgExtParam.setEHttpType(nLEHttpType);
            msgExtParam.setUiReqId(this.LJLJJI);
            msgExtParam.setErrorCode(-1);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Network Failed: ");
            LIZ.append(e.getMessage());
            String LIZIZ = X1D.LIZIZ(LIZ);
            Charset charset = PVC.LIZ;
            if (LIZIZ != null) {
                byte[] bytes = LIZIZ.getBytes(charset);
                o.LJIIIIZZ(bytes, "(this as java.lang.String).getBytes(charset)");
                NLEHttpClientCallbackDelegate nLEHttpClientCallbackDelegate = this.LJLJLLL;
                if (nLEHttpClientCallbackDelegate != null) {
                    nLEHttpClientCallbackDelegate.onCallback(this.LJLJLJ, NLEHttpClientCallbackAction.FAIL, bytes, bytes.length, msgExtParam);
                }
            } else {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
        }
        return C76800UCe.LIZ;
    }
}
