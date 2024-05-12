package X;

import android.media.AudioManager;
import android.os.Handler;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.o;

/* renamed from: X.Vam, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80016Vam implements AudioManager.OnAudioFocusChangeListener {
    public final WeakReference<C80015Val> LJLIL;

    public C80016Vam(WeakReference<C80015Val> weakReference) {
        this.LJLIL = weakReference;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i) {
        InterfaceC80022Vas interfaceC80022Vas;
        String str;
        C80015Val c80015Val = this.LJLIL.get();
        if (c80015Val != null) {
            boolean z = true;
            if (i != -2 && i != -1) {
                if (i != 1) {
                    return;
                }
                J7Z.LIZIZ(C80015Val.LJLJL, "AUDIOFOCUS_GAIN, and resume the play");
                C80024Vau c80024Vau = c80015Val.LJLIL;
                if (c80024Vau != null && (interfaceC80022Vas = c80024Vau.LJLJJL) != null) {
                    if (interfaceC80022Vas.LJ() != EnumC79954VZm.PLAYBACK_STATE_PAUSED) {
                        z = false;
                    }
                    C48651J7n LJIJJ = interfaceC80022Vas.LJIJJ();
                    if (LJIJJ != null) {
                        str = LJIJJ.LIZ;
                    } else {
                        str = null;
                    }
                    boolean LJ = o.LJ(str, "PAUSE_FROM_LOSS_FOCUS");
                    if (!z || !LJ) {
                        return;
                    }
                    interfaceC80022Vas.LJI(null);
                    return;
                }
                return;
            }
            if (System.currentTimeMillis() > c80015Val.LJLJJLL) {
                ((Handler) c80015Val.LJLJI.getValue()).sendEmptyMessageDelayed(1, 1000L);
            } else {
                c80015Val.LJIJJLI();
            }
        }
    }
}
