package X;

import com.bytedance.android.live.liveinteract.api.LinkConnectionTypeChangedEvent;
import com.bytedance.android.live.liveinteract.linkroom.widget.LinkControlWidget;

/* renamed from: X.TYu, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C74840TYu {
    public boolean LIZ;
    public final /* synthetic */ LinkControlWidget LIZIZ;

    public C74840TYu(LinkControlWidget linkControlWidget) {
        this.LIZIZ = linkControlWidget;
    }

    public final void LIZ(boolean z) {
        if (this.LIZ == z) {
            return;
        }
        this.LIZ = z;
        this.LIZIZ.dataChannel.pv0(LinkConnectionTypeChangedEvent.class);
    }
}
