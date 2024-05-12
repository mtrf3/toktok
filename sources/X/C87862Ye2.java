package X;

import com.bytedance.android.livesdk.slot.FrameL2SlotVisibilityChannel;
import com.bytedance.android.livesdk.slot.FrameL3SlotVisibilityChannel;
import com.bytedance.android.livesdk.slot.FrameSlotVisibilityChannel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.AqS182S0100000_16;

/* renamed from: X.Ye2, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C87862Ye2 extends AbstractC09790Zz {
    public boolean LJ;
    public boolean LJFF;
    public boolean LJI;

    public C87862Ye2() {
        super(0);
    }

    @Override // X.AbstractC09790Zz
    public final void LIZIZ() {
        DataChannel dataChannel = this.LIZJ;
        if (dataChannel != null) {
            dataChannel.nv0(FrameL3SlotVisibilityChannel.class, this, new AqS182S0100000_16(this, 20));
        }
        DataChannel dataChannel2 = this.LIZJ;
        if (dataChannel2 != null) {
            dataChannel2.nv0(FrameL2SlotVisibilityChannel.class, this, new AqS182S0100000_16(this, 21));
        }
        DataChannel dataChannel3 = this.LIZJ;
        if (dataChannel3 != null) {
            dataChannel3.nv0(FrameSlotVisibilityChannel.class, this, new AqS182S0100000_16(this, 22));
        }
    }

    public final void LIZJ() {
        if (this.LJ || this.LJFF || this.LJI) {
            LIZ(true);
        } else {
            LIZ(false);
        }
    }
}
