package X;

import android.media.AudioManager;
import java.lang.ref.WeakReference;

/* renamed from: X.Zop, reason: case insensitive filesystem */
/* loaded from: classes22.dex */
public final class C91079Zop implements AudioManager.OnAudioFocusChangeListener {
    public final WeakReference<C91481ZvJ> LJLIL;
    public final /* synthetic */ C91481ZvJ LJLILLLLZI;

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i) {
        C91481ZvJ c91481ZvJ = this.LJLIL.get();
        if (c91481ZvJ == null) {
            return;
        }
        C91605ZxJ LJIIL = c91481ZvJ.LJIIL();
        if (i != -2 && i != -1) {
            if (i != 1) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("onAudioFocusChange(): -> ");
                LIZ.append(i);
                X1D.LIZIZ(LIZ);
                return;
            }
            if (!LJIIL.LJIJI().isPauseState() || !this.LJLILLLLZI.LJLJJI) {
                return;
            }
            LJIIL.LJJ(new C91299ZsN("RESUME_FROM_GAIN_FOCUS"));
            this.LJLILLLLZI.LJLJJI = false;
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        C91481ZvJ c91481ZvJ2 = this.LJLILLLLZI;
        if (currentTimeMillis - c91481ZvJ2.LJLJJL >= 1000) {
            boolean startPlaying = LJIIL.LJIJI().startPlaying();
            if (startPlaying) {
                LJIIL.LJIL(new C91299ZsN("PAUSE_FROM_LOSS_FOCUS"));
                this.LJLILLLLZI.LJLJJI = true;
            }
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onAudioFocusChange(): -> AudioManager.AUDIOFOCUS_LOSSstartPlaying ");
            LIZ2.append(startPlaying);
            LIZ2.append(" mAudioFocusLossBarrier:  ");
            LIZ2.append(this.LJLILLLLZI.LJLJJL);
            LIZ2.append("hashCode");
            LIZ2.append(hashCode());
            X1D.LIZIZ(LIZ2);
            return;
        }
        c91481ZvJ2.LJIILJJIL();
    }

    public C91079Zop(C91481ZvJ c91481ZvJ, WeakReference<C91481ZvJ> weakReference) {
        this.LJLILLLLZI = c91481ZvJ;
        this.LJLIL = weakReference;
    }
}
