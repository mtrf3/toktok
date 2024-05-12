package X;

import android.content.Context;
import android.view.Surface;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.live.alphaplayer.model.VideoInfo;
import com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer;
import com.ss.ttm.player.u;
import java.lang.reflect.Method;

/* renamed from: X.Izh, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48437Izh extends AbsPlayer<C48437Izh> {
    public final Context LIZ;
    public C48435Izf LIZIZ;
    public boolean LIZJ;
    public final C48441Izl LIZLLL;
    public final C48453Izx LJ;
    public final C48444Izo LJFF;
    public final C48447Izr LJI;

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public final String getPlayerSimpleName() {
        return "TTGiftPlayerImpl";
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public final int getCurrentPosition() {
        return this.LIZIZ.getCurrentPosition();
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public final VideoInfo getVideoInfo() {
        return new VideoInfo(this.LIZIZ.getVideoWidth(), this.LIZIZ.getVideoHeight(), this.LIZIZ.getDuration());
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public final void initMediaPlayer() {
        C32444CoK.LIZ("Alpha-TTPlayer", "initMediaPlayer() called");
        u.LJFF(2, 0);
        u.LJFF(1, 1);
        u.LJFF(11, 1);
        Context context = this.LIZ;
        C48435Izf c48435Izf = new C48435Izf();
        synchronized (C48435Izf.class) {
            if (u.LJ()) {
                try {
                    Class<?> cls = Class.forName("com.ss.ttm.player.TTPlayerClient");
                    Method declaredMethod = cls.getDeclaredMethod("create", InterfaceC47775Ip1.class, Context.class);
                    declaredMethod.setAccessible(true);
                    c48435Izf.LIZ = (AbstractC48434Ize) declaredMethod.invoke(cls, c48435Izf, context);
                } catch (Throwable th) {
                    th.toString();
                }
                if (c48435Izf.LIZ == null) {
                    try {
                        Class<?> cls2 = Class.forName("com.ss.ttmplayer.player.TTPlayerClient");
                        Method declaredMethod2 = cls2.getDeclaredMethod("create", InterfaceC47775Ip1.class, Context.class);
                        declaredMethod2.setAccessible(true);
                        c48435Izf.LIZ = (AbstractC48434Ize) declaredMethod2.invoke(cls2, c48435Izf, context);
                    } catch (Throwable th2) {
                        th2.toString();
                    }
                }
            }
            if (c48435Izf.LIZ == null) {
                c48435Izf.LIZ = C48408IzE.LJJJJL(c48435Izf);
            }
        }
        this.LIZIZ = c48435Izf;
        c48435Izf.LJ(36, 1);
        this.LIZIZ.LJIIZILJ(this.LIZLLL);
        this.LIZIZ.LJIILJJIL(this.LJ);
        this.LIZIZ.LJIJJLI(this.LJFF);
        this.LIZIZ.LJIL(this.LJI);
        this.LIZIZ.LJ(59, 1);
        boolean z = this.LIZJ;
        if (z) {
            this.LIZIZ.LJIIJ(z);
        }
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public final boolean isPlaying() {
        return this.LIZIZ.isPlaying();
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public final void pause() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("pause() called with player : [");
        LIZ.append(this.LIZIZ);
        LIZ.append("]");
        C32444CoK.LIZ("Alpha-TTPlayer", X1D.LIZIZ(LIZ));
        this.LIZIZ.pause();
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public final void prepareAsync() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("prepareAsync() called with player : [");
        LIZ.append(this.LIZIZ);
        LIZ.append("]");
        C32444CoK.LIZ("Alpha-TTPlayer", X1D.LIZIZ(LIZ));
        this.LIZIZ.LJIIJ(this.LIZJ);
        super.prepareAsync();
        this.LIZIZ.prepareAsync();
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public final void release() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("release() called with player : [");
        LIZ.append(this.LIZIZ);
        LIZ.append("]");
        C32444CoK.LIZ("Alpha-TTPlayer", X1D.LIZIZ(LIZ));
        this.LIZIZ.release();
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public final void reset() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("reset() called with player : [");
        LIZ.append(this.LIZIZ);
        LIZ.append("]");
        C32444CoK.LIZ("Alpha-TTPlayer", X1D.LIZIZ(LIZ));
        this.LIZIZ.reset();
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public final void start() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("start() called with player : [");
        LIZ.append(this.LIZIZ);
        LIZ.append("]");
        C32444CoK.LIZ("Alpha-TTPlayer", X1D.LIZIZ(LIZ));
        this.LIZIZ.start();
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public final void stop() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("stop() called with player : [");
        LIZ.append(this.LIZIZ);
        LIZ.append("]");
        C32444CoK.LIZ("Alpha-TTPlayer", X1D.LIZIZ(LIZ));
        this.LIZIZ.stop();
    }

    public C48437Izh(Context context) {
        super(context);
        this.LIZLLL = new C48441Izl(this);
        this.LJ = new C48453Izx(this);
        this.LJFF = new C48444Izo(this);
        this.LJI = new C48447Izr(this);
        this.LIZ = context;
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public final void setDataSource(String str) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setDataSource() called with player : [");
        LIZ.append(this.LIZIZ);
        LIZ.append("]");
        C32444CoK.LIZ("Alpha-TTPlayer", X1D.LIZIZ(LIZ));
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
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setSurface() called with player : [");
        LIZ.append(this.LIZIZ);
        LIZ.append("]");
        C32444CoK.LIZ("Alpha-TTPlayer", X1D.LIZIZ(LIZ));
        this.LIZIZ.setSurface(surface);
    }
}
