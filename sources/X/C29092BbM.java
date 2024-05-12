package X;

import com.bytedance.android.livesdk.broadcast.video.LiveBroadcastFragment;

/* renamed from: X.BbM, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final /* synthetic */ class C29092BbM extends TBS implements InterfaceC88471Ynr<Boolean, Integer, C76800UCe> {
    public C29092BbM(Object obj) {
        super(2, obj, LiveBroadcastFragment.class, "onFinishBroadcastCancelClick", "onFinishBroadcastCancelClick(ZI)V", 0);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(Boolean bool, Integer num) {
        boolean booleanValue = bool.booleanValue();
        ((LiveBroadcastFragment) this.receiver).km(num.intValue(), booleanValue);
        return C76800UCe.LIZ;
    }
}
