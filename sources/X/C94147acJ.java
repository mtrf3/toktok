package X;

import com.bef.effectsdk.message.MessageCenter;
import com.bytedance.ies.effectcreator.swig.EffectCreatorJniJNI;
import com.ugc.effectcreator.effectcore.sdk.CKEffectEditorContext;

/* renamed from: X.acJ, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94147acJ implements MessageCenter.Listener {
    public static final C94147acJ LJLIL = new C94147acJ();

    @Override // com.bef.effectsdk.message.MessageCenter.Listener
    public final void onMessageReceived(int i, int i2, int i3, String str) {
        String str2;
        try {
        } catch (Exception unused) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(" error dispatchEffectMessage: type:");
            LIZ.append(i);
            LIZ.append(", arg1: ");
            LIZ.append(i2);
            LIZ.append(", arg2: ");
            LIZ.append(i3);
            LIZ.append(", arg3: ");
            LIZ.append(str);
            C94034aaU.LIZJ("CKEffectEditorContext", X1D.LIZIZ(LIZ));
        }
        if (CKEffectEditorContext.LIZJ == null) {
            return;
        }
        long j = i;
        if (str != null) {
            str2 = str;
        } else {
            str2 = "";
        }
        EffectCreatorJniJNI.EffectMessageCenter_dispatchEffectMessage(j, i2, i3, str2);
        C93744aVo.LIZIZ(new C94608ajk(i, i2, i3, str), 0L);
    }
}
