package X;

import com.ss.ttlivestreamer.livestreamv2.core.LiveCore;
import java.nio.ByteBuffer;

/* renamed from: X.U9s, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76736U9s implements LiveCore.RtcExtraDataListener {
    public final /* synthetic */ U7U LIZ;

    @Override // com.ss.ttlivestreamer.livestreamv2.core.LiveCore.RtcExtraDataListener
    public final void onRtcData(String str, ByteBuffer byteBuffer) {
    }

    public C76736U9s(U7U u7u) {
        this.LIZ = u7u;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.core.LiveCore.RtcExtraDataListener
    public final void onRtcData(String str, String str2) {
        U9F u9f = this.LIZ.LJFF;
        if (u9f != null) {
            u9f.LJIJI(str, str2);
        }
    }
}
