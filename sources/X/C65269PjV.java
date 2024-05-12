package X;

import com.twitter.sdk.android.core.TwitterSession;
import com.twitter.sdk.android.core.internal.scribe.EventNamespace;

/* renamed from: X.PjV, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65269PjV implements InterfaceC65282Pji<TwitterSession> {
    public final C65281Pjh LIZ = new C65281Pjh();
    public final C65200PiO LIZIZ = C65284Pjk.LIZ;

    public final void LIZ() {
        if (this.LIZIZ == null) {
            return;
        }
        new C65201PiP();
        this.LIZIZ.LIZIZ(new EventNamespace("android", "credentials", "", "", "", "impression"));
    }
}
