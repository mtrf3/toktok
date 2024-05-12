package X;

import android.media.MediaPlayer;

/* renamed from: X.XZg, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85044XZg implements MediaPlayer.OnErrorListener {
    public final /* synthetic */ TextureViewSurfaceTextureListenerC85043XZf LJLIL;

    public C85044XZg(TextureViewSurfaceTextureListenerC85043XZf textureViewSurfaceTextureListenerC85043XZf) {
        this.LJLIL = textureViewSurfaceTextureListenerC85043XZf;
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        MediaPlayer mediaPlayer2 = this.LJLIL.LJLIL.LJLIL;
        if (mediaPlayer2 != null) {
            mediaPlayer2.release();
            this.LJLIL.LJLIL.LJLIL = null;
            return false;
        }
        return false;
    }
}
