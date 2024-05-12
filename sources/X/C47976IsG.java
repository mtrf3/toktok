package X;

import android.media.AudioManager;
import kotlin.jvm.internal.o;

/* renamed from: X.IsG, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47976IsG extends AbstractC65781Prl implements InterfaceC65784Pro<AudioManager> {
    public static final C47976IsG INSTANCE = new C47976IsG();

    public C47976IsG() {
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
