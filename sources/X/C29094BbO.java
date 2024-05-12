package X;

import com.bytedance.android.livesdk.broadcast.voicechat.VoiceChatBroadcastFragment;

/* renamed from: X.BbO, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final /* synthetic */ class C29094BbO extends TBS implements InterfaceC88471Ynr<Boolean, Integer, C76800UCe> {
    public C29094BbO(Object obj) {
        super(2, obj, VoiceChatBroadcastFragment.class, "onFinishBroadcastCancelClick", "onFinishBroadcastCancelClick(ZI)V", 0);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(Boolean bool, Integer num) {
        boolean booleanValue = bool.booleanValue();
        ((VoiceChatBroadcastFragment) this.receiver).cm(num.intValue(), booleanValue);
        return C76800UCe.LIZ;
    }
}
