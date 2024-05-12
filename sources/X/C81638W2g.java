package X;

import com.bef.effectsdk.message.MessageCenter;

/* renamed from: X.W2g, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81638W2g implements MessageCenter.Listener {
    public final /* synthetic */ AbstractC46244ICy LJLIL;

    public C81638W2g(AbstractC46244ICy abstractC46244ICy) {
        this.LJLIL = abstractC46244ICy;
    }

    @Override // com.bef.effectsdk.message.MessageCenter.Listener
    public final void onMessageReceived(int i, int i2, int i3, String str) {
        this.LJLIL.LJLIIL(i, i2, i3, str);
    }
}
