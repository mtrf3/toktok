package X;

import com.bef.effectsdk.message.MessageCenter;
import kotlin.jvm.internal.IDqS423S0100000_42;

/* renamed from: X.aeP, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94277aeP implements MessageCenter.Listener {
    public final /* synthetic */ C68322mC LJLIL;

    public C94277aeP(C68322mC c68322mC) {
        this.LJLIL = c68322mC;
    }

    @Override // com.bef.effectsdk.message.MessageCenter.Listener
    public final void onMessageReceived(int i, int i2, int i3, String str) {
        if (i == 17 && i2 == 3) {
            C93744aVo.LIZIZ(new IDqS423S0100000_42(this, 126), 0L);
        }
    }
}
