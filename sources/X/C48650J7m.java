package X;

import android.media.AudioManager;
import com.ss.android.ugc.aweme.feed.background.BackgroundAudioBrowserService;

/* renamed from: X.J7m, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48650J7m implements AudioManager.OnAudioFocusChangeListener {
    public final /* synthetic */ BackgroundAudioBrowserService LJLIL;

    public C48650J7m(BackgroundAudioBrowserService backgroundAudioBrowserService) {
        this.LJLIL = backgroundAudioBrowserService;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i) {
        if (i != -3 && i != -2) {
            if (i != -1) {
                if (i == 2 || i == 3) {
                    this.LJLIL.LJLILLLLZI.LJI(null);
                }
            } else {
                this.LJLIL.LJLILLLLZI.LIZIZ(new C48651J7n("PAUSE_FROM_LOSS_FOCUS"));
            }
        } else if (C84763XOl.LJIIJJI) {
            this.LJLIL.LJLILLLLZI.LIZIZ(new C48651J7n("PAUSE_FROM_LOSS_FOCUS_TRANSIENT"));
        }
        if (this.LJLIL.LJLILLLLZI.LIZJ()) {
            this.LJLIL.LIZ();
        }
    }
}
