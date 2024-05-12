package X;

import com.bytedance.android.livesdk.chatroom.ui.AbsAudienceInteractionFragment;

/* renamed from: X.Wsf, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final /* synthetic */ class C83673Wsf implements InterfaceC30078BrG, QBG, InterfaceC54346LUo, InterfaceC83705WtB {
    public final /* synthetic */ Object LJLIL;

    @Override // X.InterfaceC83705WtB
    public final void LIZ(InterfaceC83704WtA interfaceC83704WtA) {
        ((C83621Wrp) this.LJLIL).O("lens_taint_scene_detect", "TaintSceneDetectModel", interfaceC83704WtA);
    }

    @Override // X.QBG
    public final C15070iV LIZIZ() {
        return (C15070iV) this.LJLIL;
    }

    @Override // X.InterfaceC54346LUo
    public final Object execute() {
        ((C67380QcS) this.LJLIL).LJIIIIZZ.LIZ();
        return null;
    }

    public /* synthetic */ C83673Wsf(Object obj) {
        this.LJLIL = obj;
    }

    @Override // X.InterfaceC30078BrG
    public final void LIZJ(InterfaceC29879Bo3 interfaceC29879Bo3) {
        ((AbsAudienceInteractionFragment) this.LJLIL).messageManager.addMessageListener(EnumC31509CYf.LIVE_POLL_MESSAGE.getIntType(), new C30063Br1(interfaceC29879Bo3));
    }
}
