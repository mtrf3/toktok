package X;

import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;

/* renamed from: X.Bcl, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29179Bcl implements InterfaceC78992UzM {
    public final /* synthetic */ DataChannel LIZ;

    @Override // X.InterfaceC78992UzM
    public final void onCancel() {
    }

    @Override // X.InterfaceC78992UzM
    public final void onFailed() {
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Boolean, O] */
    @Override // X.InterfaceC78992UzM
    public final void onSuccess() {
        ((C32537Cpp) DataChannelGlobal.LJLJJI.gv0(C29029BaL.class)).LIZ = Boolean.TRUE;
        C29156BcO.LIZIZ(this.LIZ, "bind_phone");
    }

    public C29179Bcl(DataChannel dataChannel) {
        this.LIZ = dataChannel;
    }
}
