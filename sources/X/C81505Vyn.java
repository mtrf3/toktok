package X;

import com.bef.effectsdk.message.MessageCenter;

/* renamed from: X.Vyn, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81505Vyn implements MessageCenter.Listener {
    public final /* synthetic */ C81489VyX LJLIL;

    public C81505Vyn(C81489VyX c81489VyX) {
        this.LJLIL = c81489VyX;
    }

    @Override // com.bef.effectsdk.message.MessageCenter.Listener
    public final void onMessageReceived(int i, int i2, int i3, String str) {
        if (i == 20482) {
            this.LJLIL.getUiActions().LJLIL.invoke().cameraComponentModel.duetContext.duetLayoutInfoJson = str;
        }
    }
}
