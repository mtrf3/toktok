package X;

import android.media.AudioManager;

/* renamed from: X.7oN, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C197077oN extends AbstractC65781Prl implements InterfaceC65784Pro<AudioManager> {
    public static final C197077oN INSTANCE = new C197077oN();

    public C197077oN() {
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
