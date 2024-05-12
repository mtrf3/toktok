package X;

import com.bytedance.ies.actionai.jni.ActionAIHttpClientCallbackAction;
import com.bytedance.ies.actionai.jni.ActionAIHttpClientCallbackDelegate;
import com.bytedance.ies.actionai.jni.ActionAIHttpType;
import com.bytedance.ies.actionai.jni.ActionAILoggerListener;
import com.bytedance.ies.actionai.jni.LogLevel;
import com.bytedance.ies.actionai.jni.MsgExtParam;
import com.bytedance.ies.actionai.jni.SWIGTYPE_p_void;

/* loaded from: classes16.dex */
public final class YTR implements InterfaceC36334ENu {
    public final /* synthetic */ ActionAIHttpType LIZ;
    public final /* synthetic */ long LIZIZ;
    public final /* synthetic */ String LIZJ;
    public final /* synthetic */ ActionAIHttpClientCallbackDelegate LIZLLL;
    public final /* synthetic */ SWIGTYPE_p_void LJ;

    @Override // X.InterfaceC36334ENu
    public final void LIZ(byte[] bArr) {
        long length;
        MsgExtParam msgExtParam = new MsgExtParam();
        msgExtParam.setEHttpType(this.LIZ);
        msgExtParam.setUiReqId(this.LIZIZ);
        ActionAILoggerListener actionAILoggerListener = C83377Wnt.LIZLLL;
        if (actionAILoggerListener != null) {
            LogLevel logLevel = LogLevel.LEVEL_INFO;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("request ");
            LIZ.append((Object) this.LIZJ);
            LIZ.append(" onSuccess!");
            actionAILoggerListener.onLog(logLevel, X1D.LIZIZ(LIZ));
        }
        ActionAIHttpClientCallbackDelegate actionAIHttpClientCallbackDelegate = this.LIZLLL;
        if (actionAIHttpClientCallbackDelegate == null) {
            return;
        }
        SWIGTYPE_p_void sWIGTYPE_p_void = this.LJ;
        ActionAIHttpClientCallbackAction actionAIHttpClientCallbackAction = ActionAIHttpClientCallbackAction.SUCCESS;
        if (bArr == null) {
            length = 0;
        } else {
            length = bArr.length;
        }
        actionAIHttpClientCallbackDelegate.onCallback(sWIGTYPE_p_void, actionAIHttpClientCallbackAction, bArr, length, msgExtParam);
    }

    @Override // X.InterfaceC36334ENu
    public final void LIZIZ(int i, Throwable th) {
        String message;
        MsgExtParam msgExtParam = new MsgExtParam();
        ActionAIHttpType actionAIHttpType = this.LIZ;
        if (actionAIHttpType == null) {
            actionAIHttpType = ActionAIHttpType.HTTP_GET;
        }
        msgExtParam.setEHttpType(actionAIHttpType);
        msgExtParam.setUiReqId(this.LIZIZ);
        msgExtParam.setErrorCode(i);
        if (th == null || (message = th.getMessage()) == null) {
            message = "Network Failed";
        }
        msgExtParam.setErrorMsg(message);
        ActionAILoggerListener actionAILoggerListener = C83377Wnt.LIZLLL;
        if (actionAILoggerListener != null) {
            actionAILoggerListener.onLog(LogLevel.LEVEL_ERROR, "request " + ((Object) this.LIZJ) + " onFail! errorCode: " + i + ", " + th);
        }
        ActionAIHttpClientCallbackDelegate actionAIHttpClientCallbackDelegate = this.LIZLLL;
        if (actionAIHttpClientCallbackDelegate == null) {
            return;
        }
        actionAIHttpClientCallbackDelegate.onCallback(this.LJ, ActionAIHttpClientCallbackAction.FAIL, new byte[0], 0L, msgExtParam);
    }

    public YTR(ActionAIHttpType actionAIHttpType, long j, String str, ActionAIHttpClientCallbackDelegate actionAIHttpClientCallbackDelegate, SWIGTYPE_p_void sWIGTYPE_p_void) {
        this.LIZ = actionAIHttpType;
        this.LIZIZ = j;
        this.LIZJ = str;
        this.LIZLLL = actionAIHttpClientCallbackDelegate;
        this.LJ = sWIGTYPE_p_void;
    }
}
