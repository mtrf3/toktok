package X;

import com.bytedance.ies.sdk.datachannel.DataChannel;

/* renamed from: X.Bcj, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29177Bcj implements InterfaceC78991UzL {
    public final /* synthetic */ DataChannel LJLIL;

    @Override // X.InterfaceC78991UzL
    public final void LIZJ() {
    }

    @Override // X.InterfaceC78991UzL
    public final void LJFF() {
    }

    @Override // X.InterfaceC78991UzL
    public final void LJI() {
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Boolean, O] */
    @Override // X.InterfaceC78991UzL
    public final void onSuccess() {
        DataChannel dataChannel = this.LJLIL;
        if (dataChannel != null) {
            ((C32537Cpp) dataChannel.gv0(C29139Bc7.class)).LIZ = Boolean.TRUE;
        }
        C29156BcO.LIZIZ(this.LJLIL, "code_verify");
    }

    public C29177Bcj(DataChannel dataChannel) {
        this.LJLIL = dataChannel;
    }
}
