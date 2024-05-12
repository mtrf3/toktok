package X;

import com.bytedance.android.livesdk.broadcast.PreviewBlockInfoChannel;
import com.bytedance.android.livesdk.broadcast.ShakeBlockTipEvent;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* renamed from: X.BWk, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28914BWk implements InterfaceC28918BWo {
    @Override // X.InterfaceC28918BWo
    public final boolean LIZ() {
        return true;
    }

    @Override // X.InterfaceC28918BWo
    public final int getErrorCode() {
        return 100;
    }

    @Override // X.InterfaceC28918BWo
    public final Object LIZIZ(BIK bik, AbstractC65782Prm abstractC65782Prm) {
        DataChannel dataChannel = bik.LIZIZ;
        if (dataChannel != null && dataChannel.kv0(PreviewBlockInfoChannel.class) != null) {
            bik.LIZIZ.qv0(ShakeBlockTipEvent.class, BUW.NORMAL_BLOCK);
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }
}
