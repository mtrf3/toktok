package X;

import android.media.AudioManager;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class JD8 extends AbstractC65781Prl implements InterfaceC65784Pro<AudioManager> {
    public static final JD8 INSTANCE = new JD8();

    public JD8() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // X.InterfaceC65784Pro
    public final AudioManager invoke() {
        Object LLILL = C16880lQ.LLILL(EF7.LIZIZ(), "audio");
        o.LJII(LLILL, "null cannot be cast to non-null type android.media.AudioManager");
        return (AudioManager) LLILL;
    }
}
