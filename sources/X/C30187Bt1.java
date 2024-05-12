package X;

import com.bytedance.android.livesdk.broadcast.trymode.TryModeBroadcastInteractionFragment;
import com.bytedance.android.livesdk.dataChannel.LivePlayContainerViewHeightChangedEvent;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.o;

/* renamed from: X.Bt1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30187Bt1 implements C54 {
    public final /* synthetic */ TryModeBroadcastInteractionFragment LIZ;

    public C30187Bt1(TryModeBroadcastInteractionFragment tryModeBroadcastInteractionFragment) {
        this.LIZ = tryModeBroadcastInteractionFragment;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Integer, O] */
    @Override // X.C54
    public final void LIZ(int i, int i2) {
        if (i == i2) {
            return;
        }
        DataChannel dataChannel = this.LIZ.LJLLJ;
        if (dataChannel != null) {
            ((C32537Cpp) dataChannel.gv0(C30180Bsu.class)).LIZ = Integer.valueOf(i);
            DataChannel dataChannel2 = this.LIZ.LJLLJ;
            if (dataChannel2 != null) {
                dataChannel2.qv0(LivePlayContainerViewHeightChangedEvent.class, Integer.valueOf(i));
                return;
            } else {
                o.LJIJI("mDataChannel");
                throw null;
            }
        }
        o.LJIJI("mDataChannel");
        throw null;
    }
}
