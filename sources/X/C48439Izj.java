package X;

import android.content.Context;
import android.os.Build;
import android.view.Surface;
import com.bytedance.mt.protector.impl.UriProtector;
import com.lynx.tasm.base.LLog;
import com.ss.android.ugc.aweme.live.alphaplayer.model.VideoInfo;
import com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer;
import com.ss.ttm.player.u;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* renamed from: X.Izj, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48439Izj extends AbsPlayer<C48439Izj> {
    public final Context LIZ;
    public C48438Izi LIZIZ;
    public C79012Uzg LIZJ;
    public final C48440Izk LIZLLL;
    public final C48454Izy LJ;
    public final C48443Izn LJFF;
    public final C48446Izq LJI;

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public final void initMediaPlayer() {
        u.LJFF(2, 1);
        u.LJFF(1, 1);
        u.LJFF(11, 1);
        Context context = this.LIZ;
        C48438Izi c48438Izi = new C48438Izi();
        synchronized (C48438Izi.class) {
            if (u.LJ()) {
                try {
                    Class<?> cls = Class.forName("com.ss.ttm.player.TTPlayerClient");
                    Method declaredMethod = cls.getDeclaredMethod("create", InterfaceC47775Ip1.class, Context.class);
                    declaredMethod.setAccessible(true);
                    c48438Izi.LIZ = (AbstractC48434Ize) declaredMethod.invoke(cls, c48438Izi, context);
                } catch (Throwable th) {
                    th.toString();
                }
                if (c48438Izi.LIZ == null) {
                    try {
                        Class<?> cls2 = Class.forName("com.ss.ttmplayer.player.TTPlayerClient");
                        Method declaredMethod2 = cls2.getDeclaredMethod("create", InterfaceC47775Ip1.class, Context.class);
                        declaredMethod2.setAccessible(true);
                        c48438Izi.LIZ = (AbstractC48434Ize) declaredMethod2.invoke(cls2, c48438Izi, context);
                    } catch (Throwable th2) {
                        th2.toString();
                    }
                }
            }
            if (c48438Izi.LIZ == null) {
                c48438Izi.LIZ = C48408IzE.LJJJJL(c48438Izi);
            }
        }
        this.LIZIZ = c48438Izi;
        c48438Izi.LJ(36, 1);
        if (Build.VERSION.SDK_INT > 23) {
            if (this.LIZJ == null) {
                this.LIZJ = new C79012Uzg();
            }
            this.LIZJ.getClass();
            ArrayList arrayList = new ArrayList();
            arrayList.add("vivo X9");
            arrayList.add("VCE-AL00");
            arrayList.add("vivo Y79");
            arrayList.add("vivo X9s Plus");
            C19U.LIZLLL(arrayList, "OD1050", "vivo X21", "vivo X9s Plus L", "HUAWEI CAZ-AL10");
            C19U.LIZLLL(arrayList, "OPPO R9sk", "OPPO R11", "vivo X21A", "OPPO R9s");
            if (!arrayList.contains(Build.MODEL)) {
                this.LIZIZ.LJ(59, 1);
            }
        }
        this.LIZIZ.LJIIZILJ(this.LIZLLL);
        this.LIZIZ.LJIILJJIL(this.LJ);
        this.LIZIZ.LJIJJLI(this.LJFF);
        this.LIZIZ.LJIL(this.LJI);
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public final int getCurrentPosition() {
        C48438Izi c48438Izi = this.LIZIZ;
        if (c48438Izi == null) {
            LLog.LIZLLL(4, "x-alpha-video", "player is null when getCurrentPosition");
            return -1;
        }
        return c48438Izi.getCurrentPosition();
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public final String getPlayerSimpleName() {
        return C16880lQ.LJLLJ(C48439Izj.class);
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public final VideoInfo getVideoInfo() {
        return new VideoInfo(this.LIZIZ.getVideoWidth(), this.LIZIZ.getVideoHeight(), this.LIZIZ.getDuration());
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
        LLog.LIZLLL(2, "x-alpha-video", X1D.LIZIZ(LIZ));
        this.LIZIZ.pause();
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public final void prepareAsync() {
        super.prepareAsync();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("prepareAsync() called with player : [");
        LIZ.append(this.LIZIZ);
        LIZ.append("]");
        LLog.LIZLLL(2, "x-alpha-video", X1D.LIZIZ(LIZ));
        this.LIZIZ.prepareAsync();
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public final void release() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("release() called with player : [");
        LIZ.append(this.LIZIZ);
        LIZ.append("]");
        LLog.LIZLLL(2, "x-alpha-video", X1D.LIZIZ(LIZ));
        this.LIZIZ.release();
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public final void reset() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("reset() called with player : [");
        LIZ.append(this.LIZIZ);
        LIZ.append("]");
        LLog.LIZLLL(2, "x-alpha-video", X1D.LIZIZ(LIZ));
        this.LIZIZ.reset();
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public final void start() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("start() called with player : [");
        LIZ.append(this.LIZIZ);
        LIZ.append("]");
        LLog.LIZLLL(2, "x-alpha-video", X1D.LIZIZ(LIZ));
        this.LIZIZ.start();
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public final void stop() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("stop() called with player : [");
        LIZ.append(this.LIZIZ);
        LIZ.append("]");
        LLog.LIZLLL(2, "x-alpha-video", X1D.LIZIZ(LIZ));
        this.LIZIZ.stop();
    }

    public C48439Izj(Context context) {
        super(context);
        this.LIZLLL = new C48440Izk(this);
        this.LJ = new C48454Izy(this);
        this.LJFF = new C48443Izn(this);
        this.LJI = new C48446Izq(this);
        this.LIZ = context;
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public final void seekTo(int i) {
        super.seekTo(i);
        C48438Izi c48438Izi = this.LIZIZ;
        if (c48438Izi != null) {
            c48438Izi.seekTo(i);
        }
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public final void setDataSource(String str) {
        super.setDataSource(str);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setDataSource() called with player : [");
        LIZ.append(this.LIZIZ);
        LIZ.append("]");
        LLog.LIZLLL(2, "x-alpha-video", X1D.LIZIZ(LIZ));
        if (this.LIZIZ.isPlaying()) {
            this.LIZIZ.stop();
        }
        this.LIZIZ.reset();
        this.LIZIZ.LJIIIZ(this.LIZ, UriProtector.parse(str));
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public final void setLooping(boolean z) {
        StringBuilder LJI = JBR.LJI("setLooping(", z, ") called with player : [");
        LJI.append(this.LIZIZ);
        LJI.append("]");
        LLog.LIZLLL(2, "x-alpha-video", X1D.LIZIZ(LJI));
        this.LIZIZ.setLooping(z);
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public final void setScreenOnWhilePlaying(boolean z) {
        super.setScreenOnWhilePlaying(z);
        StringBuilder LJI = JBR.LJI("setScreenOnWhilePlaying(", z, ") called with player : [");
        LJI.append(this.LIZIZ);
        LJI.append("]");
        LLog.LIZLLL(2, "x-alpha-video", X1D.LIZIZ(LJI));
        this.LIZIZ.LJIIIIZZ();
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public final void setSurface(Surface surface) {
        this.LIZIZ.setSurface(surface);
    }
}
