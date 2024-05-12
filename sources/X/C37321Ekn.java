package X;

import com.bytedance.ies.actionai.jni.ActionAIErrorCode;
import com.bytedance.ies.actionai.jni.ServerErrorInfo;

/* renamed from: X.Ekn, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37321Ekn extends Exception {
    public ActionAIErrorCode LJLIL;
    public ServerErrorInfo LJLILLLLZI;

    public final ActionAIErrorCode getErrorCode() {
        return this.LJLIL;
    }

    public final ServerErrorInfo getServerErrorInfo() {
        return this.LJLILLLLZI;
    }

    public C37321Ekn(String str) {
        super(str);
    }

    public final void setErrorCode(ActionAIErrorCode actionAIErrorCode) {
        this.LJLIL = actionAIErrorCode;
    }

    public final void setServerErrorInfo(ServerErrorInfo serverErrorInfo) {
        this.LJLILLLLZI = serverErrorInfo;
    }
}
