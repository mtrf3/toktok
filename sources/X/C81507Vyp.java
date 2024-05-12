package X;

import com.bef.effectsdk.message.MessageCenter;

/* renamed from: X.Vyp, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81507Vyp implements MessageCenter.Listener {
    public final /* synthetic */ C81544VzQ LJLIL;

    public C81507Vyp(C81544VzQ c81544VzQ) {
        this.LJLIL = c81544VzQ;
    }

    @Override // com.bef.effectsdk.message.MessageCenter.Listener
    public final void onMessageReceived(int i, int i2, int i3, String str) {
        if (i == 20482) {
            this.LJLIL.LLJJ().cameraComponentModel.duetContext.duetLayoutInfoJson = str;
        }
    }
}
