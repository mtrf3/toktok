package X;

import android.content.Context;
import android.view.Surface;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.live.alphaplayer.model.VideoInfo;
import com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer;
import java.lang.reflect.Method;

/* renamed from: X.Ip4, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C47778Ip4 extends AbsPlayer<C47778Ip4> {
    public final Context LIZ;
    public InterfaceC47775Ip1 LIZIZ;
    public final C48442Izm LIZJ;
    public final C48455Izz LIZLLL;
    public final C48445Izp LJ;
    public final C48448Izs LJFF;

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public final int getCurrentPosition() {
        return this.LIZIZ.getCurrentPosition();
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public final String getPlayerSimpleName() {
        return C16880lQ.LJLLJ(InterfaceC47775Ip1.class);
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public final VideoInfo getVideoInfo() {
        return new VideoInfo(this.LIZIZ.getVideoWidth(), this.LIZIZ.getVideoHeight(), this.LIZIZ.getDuration());
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public final void initMediaPlayer() {
        try {
            Class<?> cls = Class.forName("com.ss.ttm.player.u");
            Method method = cls.getMethod("setValue", Integer.TYPE, Boolean.TYPE);
            int intValue = ((Integer) cls.getField("KEY_IS_IPTTPLAYER_ON").get(0)).intValue();
            int intValue2 = ((Integer) cls.getField("KEY_IS_TTPLAYER_ON").get(0)).intValue();
            int intValue3 = ((Integer) cls.getField("KEY_IS_FORBID_CREATED_OS_PLAYER").get(0)).intValue();
            Boolean bool = Boolean.TRUE;
            method.invoke("", Integer.valueOf(intValue), bool);
            method.invoke("", Integer.valueOf(intValue2), bool);
            method.invoke("", Integer.valueOf(intValue3), bool);
            Object invoke = Class.forName("com.ss.ttm.player.s").getMethod("create", Context.class).invoke("", this.LIZ);
            if (invoke instanceof InterfaceC47775Ip1) {
                InterfaceC47775Ip1 interfaceC47775Ip1 = (InterfaceC47775Ip1) invoke;
                if (interfaceC47775Ip1 != null && !interfaceC47775Ip1.LJI()) {
                    this.LIZIZ = interfaceC47775Ip1;
                    interfaceC47775Ip1.LJ(36, 1);
                    this.LIZIZ.LJIIZILJ(this.LIZJ);
                    this.LIZIZ.LJIILJJIL(this.LIZLLL);
                    this.LIZIZ.LJIJJLI(this.LJ);
                    this.LIZIZ.LJIL(this.LJFF);
                    return;
                }
            }
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
        throw new Exception("create ttplayer failure");
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public final boolean isPlaying() {
        return this.LIZIZ.isPlaying();
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public final void pause() {
        this.LIZIZ.pause();
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public final void release() {
        this.LIZIZ.release();
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public final void reset() {
        this.LIZIZ.reset();
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public final void start() {
        this.LIZIZ.start();
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public final void stop() {
        this.LIZIZ.stop();
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public final void prepareAsync() {
        super.prepareAsync();
        this.LIZIZ.prepareAsync();
    }

    public C47778Ip4(Context context) {
        super(context);
        this.LIZJ = new C48442Izm(this);
        this.LIZLLL = new C48455Izz(this);
        this.LJ = new C48445Izp(this);
        this.LJFF = new C48448Izs(this);
        this.LIZ = context;
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public final void seekTo(int i) {
        this.LIZIZ.seekTo(i);
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public final void setDataSource(String str) {
        super.setDataSource(str);
        if (this.LIZIZ.isPlaying()) {
            this.LIZIZ.stop();
        }
        this.LIZIZ.reset();
        this.LIZIZ.LJIIIZ(this.LIZ, UriProtector.parse(str));
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public final void setLooping(boolean z) {
        this.LIZIZ.setLooping(z);
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public final void setScreenOnWhilePlaying(boolean z) {
        super.setScreenOnWhilePlaying(z);
        this.LIZIZ.LJIIIIZZ();
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public final void setSurface(Surface surface) {
        this.LIZIZ.setSurface(surface);
    }
}
