package X;

import com.bytedance.ies.sdk.datachannel.DataChannel;

/* renamed from: X.BYl, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final /* synthetic */ class C28967BYl extends TBS implements InterfaceC65784Pro<C76800UCe> {
    public C28967BYl(Object obj) {
        super(0, obj, C28968BYm.class, "logToolTipShow", "logToolTipShow()V", 0);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Boolean, O] */
    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        C28968BYm c28968BYm = (C28968BYm) this.receiver;
        c28968BYm.getClass();
        BZI LIZ = C28787BRn.LIZ("livesdk_anchor_poll_bubble_show");
        LIZ.LJIILLIIL(c28968BYm.LJLIL);
        LIZ.LJJIIJZLJL();
        InterfaceC30442Bx8.LJJJJJ.LIZ(Boolean.FALSE);
        DataChannel dataChannel = c28968BYm.LJLIL;
        if (dataChannel != null) {
            ((C32537Cpp) dataChannel.gv0(C28899BVv.class)).LIZ = Boolean.TRUE;
        }
        return C76800UCe.LIZ;
    }
}
