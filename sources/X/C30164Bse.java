package X;

import com.bytedance.android.livesdk.chatroom.ui.AbsAudienceInteractionFragment;

/* renamed from: X.Bse, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final /* synthetic */ class C30164Bse implements InterfaceC30078BrG, InterfaceC48047ItP {
    public final /* synthetic */ Object LJLIL;

    public /* synthetic */ C30164Bse(Object obj) {
        this.LJLIL = obj;
    }

    @Override // X.InterfaceC30078BrG
    public final void LIZJ(InterfaceC29879Bo3 interfaceC29879Bo3) {
        ((AbsAudienceInteractionFragment) this.LJLIL).messageManager.addMessageListener(EnumC31509CYf.LIVE_POLL_MESSAGE.getIntType(), new C30061Bqz(interfaceC29879Bo3, 1));
    }
}
