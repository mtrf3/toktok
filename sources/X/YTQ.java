package X;

import com.bytedance.ies.actionai.jni.ActionAIHttpClientCallbackAction;
import com.bytedance.ies.actionai.jni.ActionAIHttpClientCallbackDelegate;
import com.bytedance.ies.actionai.jni.ActionAIHttpType;
import com.bytedance.ies.actionai.jni.ActionAILoggerListener;
import com.bytedance.ies.actionai.jni.LogLevel;
import com.bytedance.ies.actionai.jni.MsgExtParam;
import com.bytedance.ies.actionai.jni.SWIGTYPE_p_void;
import com.bytedance.ies.actionai.jni.UnorderedMapStrStr;
import java.nio.charset.Charset;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class YTQ extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ EZZ LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ ActionAIHttpType LJLJI;
    public final /* synthetic */ long LJLJJI;
    public final /* synthetic */ UnorderedMapStrStr LJLJJL;
    public final /* synthetic */ byte[] LJLJJLL;
    public final /* synthetic */ String LJLJL;
    public final /* synthetic */ SWIGTYPE_p_void LJLJLJ;
    public final /* synthetic */ ActionAIHttpClientCallbackDelegate LJLJLLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public YTQ(EZZ ezz, String str, ActionAIHttpType actionAIHttpType, long j, UnorderedMapStrStr unorderedMapStrStr, byte[] bArr, String str2, SWIGTYPE_p_void sWIGTYPE_p_void, ActionAIHttpClientCallbackDelegate actionAIHttpClientCallbackDelegate) {
        super(0);
        this.LJLIL = ezz;
        this.LJLILLLLZI = str;
        this.LJLJI = actionAIHttpType;
        this.LJLJJI = j;
        this.LJLJJL = unorderedMapStrStr;
        this.LJLJJLL = bArr;
        this.LJLJL = str2;
        this.LJLJLJ = sWIGTYPE_p_void;
        this.LJLJLLL = actionAIHttpClientCallbackDelegate;
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        try {
            this.LJLIL.LIZ(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL, this.LJLJLJ, this.LJLJLLL);
        } catch (Exception e) {
            ActionAILoggerListener actionAILoggerListener = C83377Wnt.LIZLLL;
            if (actionAILoggerListener != null) {
                LogLevel logLevel = LogLevel.LEVEL_ERROR;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("request ");
                LIZ.append((Object) this.LJLILLLLZI);
                LIZ.append(" failed! ");
                LIZ.append(e);
                LIZ.append(", ");
                LIZ.append((Object) e.getMessage());
                actionAILoggerListener.onLog(logLevel, X1D.LIZIZ(LIZ));
            }
            MsgExtParam msgExtParam = new MsgExtParam();
            ActionAIHttpType actionAIHttpType = this.LJLJI;
            if (actionAIHttpType == null) {
                actionAIHttpType = ActionAIHttpType.HTTP_GET;
            }
            msgExtParam.setEHttpType(actionAIHttpType);
            msgExtParam.setUiReqId(this.LJLJJI);
            msgExtParam.setErrorMsg(e.getMessage());
            if (e instanceof C64799Pbv) {
                msgExtParam.setErrorCode(((C64799Pbv) e).getStatusCode());
            } else {
                msgExtParam.setErrorCode(-1);
            }
            String LJIILLIIL = o.LJIILLIIL(e.getMessage(), "Network Failed: ");
            Charset charset = PVC.LIZ;
            if (LJIILLIIL != null) {
                byte[] bytes = LJIILLIIL.getBytes(charset);
                o.LJIIIIZZ(bytes, "(this as java.lang.String).getBytes(charset)");
                ActionAIHttpClientCallbackDelegate actionAIHttpClientCallbackDelegate = this.LJLJLLL;
                if (actionAIHttpClientCallbackDelegate != null) {
                    actionAIHttpClientCallbackDelegate.onCallback(this.LJLJLJ, ActionAIHttpClientCallbackAction.FAIL, bytes, bytes.length, msgExtParam);
                }
            } else {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
        }
        return C76800UCe.LIZ;
    }
}
