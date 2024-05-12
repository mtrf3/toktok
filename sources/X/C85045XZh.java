package X;

import android.media.MediaPlayer;

/* renamed from: X.XZh, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85045XZh implements MediaPlayer.OnCompletionListener {
    public final /* synthetic */ TextureViewSurfaceTextureListenerC85043XZf LJLIL;

    public C85045XZh(TextureViewSurfaceTextureListenerC85043XZf textureViewSurfaceTextureListenerC85043XZf) {
        this.LJLIL = textureViewSurfaceTextureListenerC85043XZf;
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer) {
        this.LJLIL.LJLIL.LLII();
    }
}
