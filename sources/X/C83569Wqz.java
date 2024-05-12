package X;

import com.bef.effectsdk.message.MessageCenter;
import com.bytedance.ies.effecteditor.swig.EffectEditorJniJNI;

/* renamed from: X.Wqz, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83569Wqz implements MessageCenter.Listener {
    @Override // com.bef.effectsdk.message.MessageCenter.Listener
    public final void onMessageReceived(int i, int i2, int i3, String str) {
        long j = i;
        if (str == null) {
            str = "";
        }
        EffectEditorJniJNI.EffectMessageCenter_dispatchEffectMessage(j, i2, i3, str);
    }
}
