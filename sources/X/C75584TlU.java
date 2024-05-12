package X;

import com.bytedance.android.live.liveinteract.multihost.biz.link.MultiCoHostWidget;
import com.bytedance.android.live.liveinteract.multihost.biz.link.view.MultiCoHostWindowManager;
import com.bytedance.android.live.liveinteract.multihost.event.MultiCoHostStateChannel;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* renamed from: X.TlU, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75584TlU implements InterfaceC75478Tjm {
    public final /* synthetic */ MultiCoHostWidget LIZ;

    @Override // X.InterfaceC75478Tjm
    public final boolean LIZ() {
        Object obj;
        DataChannel dataChannel = this.LIZ.dataChannel;
        if (dataChannel != null) {
            obj = dataChannel.kv0(MultiCoHostStateChannel.class);
        } else {
            obj = null;
        }
        if (obj == EnumC75620Tm4.Linked) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC75478Tjm
    public final boolean LIZIZ() {
        return this.LIZ.LJLILLLLZI;
    }

    @Override // X.InterfaceC75478Tjm
    public final MultiCoHostWindowManager LIZJ() {
        return this.LIZ.LJZL();
    }

    @Override // X.InterfaceC75478Tjm
    public final boolean LIZLLL() {
        return this.LIZ.isDestroyed;
    }

    public C75584TlU(MultiCoHostWidget multiCoHostWidget) {
        this.LIZ = multiCoHostWidget;
    }
}
