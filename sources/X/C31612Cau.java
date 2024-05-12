package X;

import com.bytedance.android.live.liveinteract.api.event.LinkStateForH5Event;
import com.bytedance.android.live.liveinteract.linkroom.widget.LinkControlWidget;

/* renamed from: X.Cau, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31612Cau {
    public boolean LIZ;
    public final /* synthetic */ LinkControlWidget LIZIZ;

    public C31612Cau(LinkControlWidget linkControlWidget) {
        this.LIZIZ = linkControlWidget;
    }

    public final void LIZ(boolean z) {
        if (this.LIZ == z) {
            return;
        }
        this.LIZ = z;
        C0RN.LIZLLL("multi-guest state: ", z, "LinkControlWidget");
        if (z) {
            this.LIZIZ.dataChannel.qv0(LinkStateForH5Event.class, new C30898CAs("multi_guest"));
            C31611Cat.LIZ = "multi_guest";
        } else {
            this.LIZIZ.dataChannel.qv0(LinkStateForH5Event.class, new C30898CAs("normal"));
            C31611Cat.LIZ = "normal";
        }
    }
}
