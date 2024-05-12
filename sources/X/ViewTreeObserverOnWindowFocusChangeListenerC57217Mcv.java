package X;

import android.view.ViewTreeObserver;
import com.ss.android.ugc.aweme.feed.assem.music.VideoMusicCoverAssem;

/* renamed from: X.Mcv, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class ViewTreeObserverOnWindowFocusChangeListenerC57217Mcv implements ViewTreeObserver.OnWindowFocusChangeListener {
    public final /* synthetic */ VideoMusicCoverAssem LJLIL;

    public ViewTreeObserverOnWindowFocusChangeListenerC57217Mcv(VideoMusicCoverAssem videoMusicCoverAssem) {
        this.LJLIL = videoMusicCoverAssem;
    }

    @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
    public final void onWindowFocusChanged(boolean z) {
        if (!z) {
            this.LJLIL.z4();
        }
    }
}
