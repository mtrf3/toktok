package X;

import android.media.AudioManager;

/* loaded from: classes9.dex */
public final class JFA extends AbstractC65781Prl implements InterfaceC65784Pro<AudioManager> {
    public static final JFA INSTANCE = new JFA();

    public JFA() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // X.InterfaceC65784Pro
    public final AudioManager invoke() {
        return (AudioManager) C16880lQ.LLILL(EF7.LIZIZ(), "audio");
    }
}
