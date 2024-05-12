package X;

import com.bytedance.ies.actionai.jni.ActionAIErrorCode;
import com.bytedance.ies.actionai.jni.ServerErrorInfo;
import com.bytedance.ies.actionai.jni.SessionInitCallback;

/* renamed from: X.WoT, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83413WoT extends SessionInitCallback {
    public final /* synthetic */ InterfaceC73573Su9<String> LIZ;

    public C83413WoT(C73433Srt c73433Srt) {
        this.LIZ = c73433Srt;
    }

    @Override // com.bytedance.ies.actionai.jni.SessionInitCallback
    public final void onSuccess(String str) {
        if (str != null) {
            this.LIZ.onNext(str);
        } else {
            this.LIZ.onError(new RuntimeException("init session fail: session_id is empty"));
        }
    }

    @Override // com.bytedance.ies.actionai.jni.SessionInitCallback
    public final void onFail(ActionAIErrorCode actionAIErrorCode, String str, ServerErrorInfo serverErrorInfo) {
        InterfaceC73573Su9<String> interfaceC73573Su9 = this.LIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("init session fail, error_code: ");
        LIZ.append(actionAIErrorCode);
        LIZ.append(" error_msg: ");
        LIZ.append(str);
        interfaceC73573Su9.onError(new RuntimeException(X1D.LIZIZ(LIZ)));
    }
}
