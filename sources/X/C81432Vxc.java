package X;

import android.media.AudioManager;
import kotlin.jvm.internal.o;

/* renamed from: X.Vxc, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81432Vxc extends AbstractC65781Prl implements InterfaceC65784Pro<AudioManager> {
    public static final C81432Vxc INSTANCE = new C81432Vxc();

    public C81432Vxc() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // X.InterfaceC65784Pro
    public final AudioManager invoke() {
        Object LLIZ = C16880lQ.LLIZ("audio", C60903NvH.LJ);
        o.LJII(LLIZ, "null cannot be cast to non-null type android.media.AudioManager");
        return (AudioManager) LLIZ;
    }
}
