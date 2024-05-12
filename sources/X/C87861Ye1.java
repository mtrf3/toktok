package X;

import com.bytedance.android.livesdk.slot.FrameL2SlotVisibilityChannel;
import com.bytedance.android.livesdk.slot.FrameL3SlotVisibilityChannel;
import com.bytedance.android.livesdk.slot.FrameSlotVisibilityChannel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.AqS166S0100000_16;
import kotlin.jvm.internal.AqS182S0100000_16;

/* renamed from: X.Ye1, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C87861Ye1 extends AbstractC09790Zz {
    public boolean LJ;
    public boolean LJFF;
    public boolean LJI;
    public final C78150Ulm LJII;

    public C87861Ye1() {
        super(0);
        this.LJII = new C78150Ulm(new AqS166S0100000_16(this, 15), 30L);
    }

    @Override // X.AbstractC09790Zz
    public final void LIZIZ() {
        DataChannel dataChannel = this.LIZJ;
        if (dataChannel != null) {
            dataChannel.nv0(FrameL3SlotVisibilityChannel.class, this, new AqS182S0100000_16(this, 17));
        }
        DataChannel dataChannel2 = this.LIZJ;
        if (dataChannel2 != null) {
            dataChannel2.nv0(FrameL2SlotVisibilityChannel.class, this, new AqS182S0100000_16(this, 18));
        }
        DataChannel dataChannel3 = this.LIZJ;
        if (dataChannel3 != null) {
            dataChannel3.nv0(FrameSlotVisibilityChannel.class, this, new AqS182S0100000_16(this, 19));
        }
    }

    public final void LIZJ() {
        if (this.LJ || this.LJFF || this.LJI) {
            LIZ(true);
            this.LJII.LIZJ();
            this.LJII.LIZLLL();
        }
    }
}
