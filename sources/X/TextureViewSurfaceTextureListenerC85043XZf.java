package X;

import android.graphics.SurfaceTexture;
import android.media.MediaPlayer;
import android.view.Surface;
import android.view.TextureView;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.i18n.musically.cut.AvatarCutActivity;
import com.zhiliaoapp.musically.R;

/* renamed from: X.XZf, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class TextureViewSurfaceTextureListenerC85043XZf implements TextureView.SurfaceTextureListener {
    public final /* synthetic */ AvatarCutActivity LJLIL;

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public TextureViewSurfaceTextureListenerC85043XZf(AvatarCutActivity avatarCutActivity) {
        this.LJLIL = avatarCutActivity;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        AvatarCutActivity avatarCutActivity = this.LJLIL;
        MediaPlayer mediaPlayer = avatarCutActivity.LJLIL;
        if (mediaPlayer != null) {
            if (mediaPlayer.isPlaying()) {
                avatarCutActivity.LJLIL.stop();
            }
            avatarCutActivity.LJLIL.release();
            avatarCutActivity.LJLIL = null;
            return true;
        }
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        android.net.Uri parse = UriProtector.parse(this.LJLIL.LJLJJI);
        AvatarCutActivity avatarCutActivity = this.LJLIL;
        avatarCutActivity.LJLIL = MediaPlayer.create(avatarCutActivity, parse);
        MediaPlayer mediaPlayer = this.LJLIL.LJLIL;
        if (mediaPlayer == null) {
            C5S1 c5s1 = new C5S1(this.LJLIL);
            c5s1.LIZJ(R.string.jt1);
            c5s1.LJ();
            this.LJLIL.finish();
            return;
        }
        mediaPlayer.setAudioStreamType(3);
        this.LJLIL.LJLIL.setSurface(new Surface(surfaceTexture));
        this.LJLIL.LJLIL.start();
        this.LJLIL.LJLIL.setOnCompletionListener(new C85045XZh(this));
        this.LJLIL.LJLIL.setOnErrorListener(new C85044XZg(this));
    }
}
