package X;

import android.media.AudioManager;
import com.ss.android.ugc.aweme.audiomode.fullepisodev2.notification.BackgroundAudioService;

/* renamed from: X.XNk, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84736XNk implements AudioManager.OnAudioFocusChangeListener {
    public final /* synthetic */ BackgroundAudioService LJLIL;

    public C84736XNk(BackgroundAudioService backgroundAudioService) {
        this.LJLIL = backgroundAudioService;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i) {
        if (i != -3 && i != -2) {
            if (i != -1) {
                if (i == 2 || i == 3) {
                    this.LJLIL.LJLIL.LIZ(null);
                }
            } else {
                this.LJLIL.LJLIL.LJ(new C84735XNj("PAUSE_FROM_LOSS_FOCUS"));
            }
        } else if (C84763XOl.LJIIJJI) {
            this.LJLIL.LJLIL.LJ(new C84735XNj("PAUSE_FROM_LOSS_FOCUS"));
        }
        this.LJLIL.LIZ();
    }
}
