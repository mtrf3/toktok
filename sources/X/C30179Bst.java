package X;

import com.bytedance.android.livesdk.dataChannel.LivePlayContainerViewHeightChangedEvent;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.o;

/* renamed from: X.Bst, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30179Bst implements C54 {
    public final /* synthetic */ C30087BrP LIZ;

    public C30179Bst(C30087BrP c30087BrP) {
        this.LIZ = c30087BrP;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Integer, O] */
    @Override // X.C54
    public final void LIZ(int i, int i2) {
        if (i == i2) {
            return;
        }
        DataChannel dataChannel = this.LIZ.LJLLI;
        if (dataChannel != null) {
            ((C32537Cpp) dataChannel.gv0(C30180Bsu.class)).LIZ = Integer.valueOf(i);
            DataChannel dataChannel2 = this.LIZ.LJLLI;
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
