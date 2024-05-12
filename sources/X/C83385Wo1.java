package X;

import com.bytedance.ies.actionai.jni.MessageCallback;
import com.bytedance.ies.actionai.jni.MessageCode;
import com.bytedance.ies.actionai.jni.MessageResponse;

/* renamed from: X.Wo1, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83385Wo1 extends MessageCallback {
    public final MessageCallback LIZ;

    public C83385Wo1(C83375Wnr c83375Wnr) {
        this.LIZ = c83375Wnr;
    }

    @Override // com.bytedance.ies.actionai.jni.MessageCallback
    public final void onNotify(MessageCode messageCode, MessageResponse messageResponse) {
        if (messageCode == MessageCode.SUCCESS) {
            C83412WoS.LIZ(true);
        } else {
            C83412WoS.LIZ(false);
        }
        this.LIZ.onNotify(messageCode, messageResponse);
    }
}
