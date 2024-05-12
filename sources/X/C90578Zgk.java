package X;

import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaControllerCompat;
import android.support.v4.media.session.PlaybackStateCompat;

/* renamed from: X.Zgk, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90578Zgk extends C01U {
    public final /* synthetic */ DialogC90914ZmA LJLJJI;

    @Override // X.C01U
    public final void LIZJ() {
        DialogC90914ZmA dialogC90914ZmA = this.LJLJJI;
        MediaControllerCompat mediaControllerCompat = dialogC90914ZmA.LLIL;
        if (mediaControllerCompat != null) {
            mediaControllerCompat.LIZJ(dialogC90914ZmA.LLILII);
            this.LJLJJI.LLIL = null;
        }
    }

    public C90578Zgk(DialogC90914ZmA dialogC90914ZmA) {
        this.LJLJJI = dialogC90914ZmA;
    }

    @Override // X.C01U
    public final void LIZ(MediaMetadataCompat mediaMetadataCompat) {
        MediaDescriptionCompat LIZIZ;
        DialogC90914ZmA dialogC90914ZmA = this.LJLJJI;
        if (mediaMetadataCompat == null) {
            LIZIZ = null;
        } else {
            LIZIZ = mediaMetadataCompat.LIZIZ();
        }
        dialogC90914ZmA.LLILL = LIZIZ;
        this.LJLJJI.LJJIIJZLJL();
        this.LJLJJI.LJJIIJ(false);
    }

    @Override // X.C01U
    public final void LIZIZ(PlaybackStateCompat playbackStateCompat) {
        DialogC90914ZmA dialogC90914ZmA = this.LJLJJI;
        dialogC90914ZmA.LLILIL = playbackStateCompat;
        dialogC90914ZmA.LJJIIJ(false);
    }
}
