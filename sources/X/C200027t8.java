package X;

import android.media.AudioManager;

/* renamed from: X.7t8, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C200027t8 extends AbstractC65781Prl implements InterfaceC65784Pro<AudioManager> {
    public static final C200027t8 INSTANCE = new C200027t8();

    public C200027t8() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // X.InterfaceC65784Pro
    public final AudioManager invoke() {
        Object LLIZ = C16880lQ.LLIZ("audio", FKM.LIZ());
        if (LLIZ instanceof AudioManager) {
            return (AudioManager) LLIZ;
        }
        return null;
    }
}
