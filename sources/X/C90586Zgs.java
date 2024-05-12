package X;

import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaControllerCompat;

/* renamed from: X.Zgs, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90586Zgs extends C01U {
    public final /* synthetic */ DialogC90863ZlL LJLJJI;

    @Override // X.C01U
    public final void LIZJ() {
        DialogC90863ZlL dialogC90863ZlL = this.LJLJJI;
        MediaControllerCompat mediaControllerCompat = dialogC90863ZlL.LLIIIJ;
        if (mediaControllerCompat != null) {
            mediaControllerCompat.LIZJ(dialogC90863ZlL.LLIIIL);
            this.LJLJJI.LLIIIJ = null;
        }
    }

    public C90586Zgs(DialogC90863ZlL dialogC90863ZlL) {
        this.LJLJJI = dialogC90863ZlL;
    }

    @Override // X.C01U
    public final void LIZ(MediaMetadataCompat mediaMetadataCompat) {
        MediaDescriptionCompat LIZIZ;
        DialogC90863ZlL dialogC90863ZlL = this.LJLJJI;
        if (mediaMetadataCompat == null) {
            LIZIZ = null;
        } else {
            LIZIZ = mediaMetadataCompat.LIZIZ();
        }
        dialogC90863ZlL.LLIIIZ = LIZIZ;
        this.LJLJJI.LJIJJLI();
        this.LJLJJI.LJJIFFI();
    }
}
