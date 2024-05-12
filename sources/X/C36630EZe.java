package X;

import com.bytedance.ies.nle.editor_jni.MsgExtParam;
import com.bytedance.ies.nle.editor_jni.NLEHttpClientCallbackAction;
import com.bytedance.ies.nle.editor_jni.NLEHttpClientCallbackDelegate;
import com.bytedance.ies.nle.editor_jni.NLEHttpType;
import com.bytedance.ies.nle.editor_jni.SWIGTYPE_p_void;

/* renamed from: X.EZe, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36630EZe {
    public final /* synthetic */ NLEHttpType LIZ;
    public final /* synthetic */ long LIZIZ;
    public final /* synthetic */ NLEHttpClientCallbackDelegate LIZJ;
    public final /* synthetic */ SWIGTYPE_p_void LIZLLL;

    public final void LIZIZ(byte[] bArr) {
        long j;
        MsgExtParam msgExtParam = new MsgExtParam();
        msgExtParam.setEHttpType(this.LIZ);
        msgExtParam.setUiReqId(this.LIZIZ);
        NLEHttpClientCallbackDelegate nLEHttpClientCallbackDelegate = this.LIZJ;
        if (nLEHttpClientCallbackDelegate != null) {
            SWIGTYPE_p_void sWIGTYPE_p_void = this.LIZLLL;
            NLEHttpClientCallbackAction nLEHttpClientCallbackAction = NLEHttpClientCallbackAction.SUCCESS;
            if (bArr != null) {
                j = bArr.length;
            } else {
                j = 0;
            }
            nLEHttpClientCallbackDelegate.onCallback(sWIGTYPE_p_void, nLEHttpClientCallbackAction, bArr, j, msgExtParam);
        }
    }

    public final void LIZ(int i, Throwable th) {
        String str;
        MsgExtParam msgExtParam = new MsgExtParam();
        NLEHttpType nLEHttpType = this.LIZ;
        if (nLEHttpType == null) {
            nLEHttpType = NLEHttpType.HTTP_GET;
        }
        msgExtParam.setEHttpType(nLEHttpType);
        msgExtParam.setUiReqId(this.LIZIZ);
        msgExtParam.setErrorCode(i);
        if (th == null || (str = th.getMessage()) == null) {
            str = "Network Failed";
        }
        msgExtParam.setErrorMsg(str);
        NLEHttpClientCallbackDelegate nLEHttpClientCallbackDelegate = this.LIZJ;
        if (nLEHttpClientCallbackDelegate != null) {
            nLEHttpClientCallbackDelegate.onCallback(this.LIZLLL, NLEHttpClientCallbackAction.FAIL, null, 0L, msgExtParam);
        }
    }

    public C36630EZe(NLEHttpType nLEHttpType, long j, NLEHttpClientCallbackDelegate nLEHttpClientCallbackDelegate, SWIGTYPE_p_void sWIGTYPE_p_void) {
        this.LIZ = nLEHttpType;
        this.LIZIZ = j;
        this.LIZJ = nLEHttpClientCallbackDelegate;
        this.LIZLLL = sWIGTYPE_p_void;
    }
}
