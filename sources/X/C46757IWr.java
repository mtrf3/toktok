package X;

import Y.ARunnableS0S0300200_8;
import android.os.Bundle;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import org.json.JSONObject;

/* renamed from: X.IWr, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C46757IWr implements InterfaceC46747IWh {
    public final InterfaceC46747IWh LIZ;
    public OnUIPlayListener LIZIZ;
    public HandlerThread LIZJ;
    public HandlerC46759IWt LIZLLL;
    public final HandlerC46761IWv LJ = new HandlerC46761IWv(C16880lQ.LLJJJJ());
    public String LJFF;
    public boolean LJI;

    @Override // X.InterfaceC46747IWh
    public final /* synthetic */ void LJJLIIIJJI() {
    }

    @Override // X.InterfaceC46747IWh
    public final /* synthetic */ void LJJLJ(IX4 ix4) {
    }

    @Override // X.InterfaceC46747IWh
    public final /* synthetic */ void LJJZZIII(IWT iwt) {
    }

    @Override // X.InterfaceC46747IWh
    public final /* synthetic */ void LJLIL(EnumC38817FLh enumC38817FLh) {
    }

    @Override // X.InterfaceC46747IWh
    public final /* synthetic */ void LJLJI(IWT iwt) {
    }

    @Override // X.InterfaceC46747IWh
    public final /* synthetic */ void LJLJJI(int i) {
    }

    @Override // X.InterfaceC46747IWh
    public final void LJLJJL() {
    }

    @Override // X.InterfaceC46747IWh
    public final /* synthetic */ void LJLLILLLL() {
    }

    @Override // X.InterfaceC46747IWh
    public final /* synthetic */ void LJLLLL(IVL ivl) {
    }

    @Override // X.InterfaceC46747IWh
    public final /* synthetic */ int getWatchedDuration() {
        return -1;
    }

    @Override // X.InterfaceC46747IWh
    public final boolean LIZLLL() {
        return this.LIZ.LIZLLL();
    }

    @Override // X.InterfaceC46747IWh
    public final C38798FKo LJ() {
        InterfaceC46747IWh interfaceC46747IWh = this.LIZ;
        if (interfaceC46747IWh != null) {
            return interfaceC46747IWh.LJ();
        }
        return null;
    }

    public final void LJII() {
        Looper looper;
        try {
            HandlerThread handlerThread = new HandlerThread("play_thread", 0);
            this.LIZJ = handlerThread;
            handlerThread.start();
        } catch (Exception unused) {
            this.LIZJ = null;
        }
        C46760IWu c46760IWu = new C46760IWu(this);
        HandlerThread handlerThread2 = this.LIZJ;
        if (handlerThread2 == null) {
            looper = C16880lQ.LLJJJJ();
        } else {
            looper = handlerThread2.getLooper();
        }
        this.LIZLLL = new HandlerC46759IWt(c46760IWu, looper, this.LIZ);
    }

    @Override // X.InterfaceC46747IWh
    public final void LJJJLIIL() {
        HandlerC46759IWt handlerC46759IWt = this.LIZLLL;
        if (handlerC46759IWt != null) {
            handlerC46759IWt.LIZIZ = 300;
            this.LIZLLL.sendEmptyMessage(12);
        }
    }

    @Override // X.InterfaceC46747IWh
    public final void LJJJZ() {
        HandlerC46759IWt handlerC46759IWt = this.LIZLLL;
        if (handlerC46759IWt != null) {
            handlerC46759IWt.removeMessages(12);
        }
    }

    @Override // X.InterfaceC46747IWh
    public final void LJJLI() {
        this.LIZ.LJJLI();
    }

    @Override // X.InterfaceC46747IWh
    public final void LJJLIIIJL() {
        this.LIZ.LJJLIIIJL();
    }

    @Override // X.InterfaceC46747IWh
    public final void LJJLIL() {
        if (IXB.LIZ) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("render()");
            LIZ.append(this.LJFF);
            IXB.LIZIZ("SimplifyAsyncPlayer", X1D.LIZIZ(LIZ));
        }
        HandlerC46759IWt handlerC46759IWt = this.LIZLLL;
        if (handlerC46759IWt != null) {
            handlerC46759IWt.sendEmptyMessage(8);
        }
    }

    @Override // X.InterfaceC46747IWh
    public final int LJLJJLL() {
        return this.LIZ.LJLJJLL();
    }

    @Override // X.InterfaceC46747IWh
    public final String LJLLL() {
        return this.LIZ.LJLLL();
    }

    @Override // X.InterfaceC46747IWh
    public final boolean LJLZ() {
        return this.LIZ.LJLZ();
    }

    @Override // X.InterfaceC46747IWh
    public final long getCurrentPosition() {
        return this.LIZ.getCurrentPosition();
    }

    @Override // X.InterfaceC46747IWh
    public final long getDuration() {
        return this.LIZ.getDuration();
    }

    @Override // X.InterfaceC46747IWh
    public final ITZ getPlayerType() {
        return this.LIZ.getPlayerType();
    }

    @Override // X.InterfaceC46747IWh
    public final int getState() {
        return this.LIZ.getState();
    }

    @Override // X.InterfaceC46747IWh
    public final ITI getVideoInfo() {
        InterfaceC46747IWh interfaceC46747IWh = this.LIZ;
        if (interfaceC46747IWh != null) {
            return interfaceC46747IWh.getVideoInfo();
        }
        return null;
    }

    @Override // X.InterfaceC46747IWh
    public final void init() {
        HandlerC46759IWt handlerC46759IWt = this.LIZLLL;
        if (handlerC46759IWt != null) {
            handlerC46759IWt.sendEmptyMessage(16);
        }
    }

    @Override // X.InterfaceC46747IWh
    public final boolean isLoading() {
        return this.LIZ.isLoading();
    }

    @Override // X.InterfaceC46747IWh
    public final boolean isMute() {
        return this.LIZ.isMute();
    }

    @Override // X.InterfaceC46747IWh
    public final boolean isPaused() {
        return this.LIZ.isPaused();
    }

    @Override // X.InterfaceC46747IWh
    public final boolean isPlaying() {
        return this.LIZ.isPlaying();
    }

    @Override // X.InterfaceC46747IWh
    public final void pause() {
        if (IXB.LIZ) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("pause()");
            LIZ.append(this.LJFF);
            IXB.LIZIZ("SimplifyAsyncPlayer", X1D.LIZIZ(LIZ));
        }
        HandlerC46759IWt handlerC46759IWt = this.LIZLLL;
        if (handlerC46759IWt != null) {
            handlerC46759IWt.sendEmptyMessage(5);
        }
    }

    @Override // X.InterfaceC46747IWh
    public final void release() {
        if (IXB.LIZ) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("release()");
            LIZ.append(this.LJFF);
            IXB.LIZIZ("SimplifyAsyncPlayer", X1D.LIZIZ(LIZ));
        }
        HandlerC46759IWt handlerC46759IWt = this.LIZLLL;
        if (handlerC46759IWt != null) {
            handlerC46759IWt.removeCallbacksAndMessages(null);
            this.LIZLLL.sendEmptyMessage(7);
            this.LIZLLL.sendEmptyMessage(10);
            this.LJI = true;
            this.LIZLLL = null;
        }
        if (this.LIZJ != null) {
            this.LIZJ = null;
        }
        this.LJFF = null;
    }

    @Override // X.InterfaceC46747IWh
    public final void resume() {
        if (IXB.LIZ) {
            IXB.LIZIZ("SimplifyAsyncPlayer", "resume()");
        }
        HandlerC46759IWt handlerC46759IWt = this.LIZLLL;
        if (handlerC46759IWt != null) {
            handlerC46759IWt.obtainMessage(4).sendToTarget();
        }
    }

    @Override // X.InterfaceC46747IWh
    public final void start() {
        if (IXB.LIZ) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("start()");
            LIZ.append(this.LJFF);
            IXB.LIZIZ("SimplifyAsyncPlayer", X1D.LIZIZ(LIZ));
        }
        HandlerC46759IWt handlerC46759IWt = this.LIZLLL;
        if (handlerC46759IWt != null) {
            handlerC46759IWt.sendEmptyMessage(3);
        }
    }

    @Override // X.InterfaceC46747IWh
    public final void stop() {
        if (IXB.LIZ) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("stop()");
            LIZ.append(this.LJFF);
            IXB.LIZIZ("SimplifyAsyncPlayer", X1D.LIZIZ(LIZ));
        }
        HandlerC46759IWt handlerC46759IWt = this.LIZLLL;
        if (handlerC46759IWt != null) {
            handlerC46759IWt.sendEmptyMessage(6);
        }
    }

    @Override // X.InterfaceC46747IWh
    public final void LJJL() {
        stop();
    }

    public C46757IWr(IX5 ix5) {
        this.LIZ = ix5;
        LJII();
    }

    @Override // X.InterfaceC46747IWh
    public final void LIZ(String str) {
        this.LIZ.LIZ(str);
    }

    @Override // X.InterfaceC46747IWh
    public final float LIZIZ(int i) {
        return this.LIZ.LIZIZ(i);
    }

    @Override // X.InterfaceC46747IWh
    public final <T> T LIZJ(IU1<T> iu1) {
        return (T) this.LIZ.LIZJ(iu1);
    }

    @Override // X.InterfaceC46747IWh
    public final void LJFF(float f) {
        this.LIZ.LJFF(f);
    }

    @Override // X.InterfaceC46747IWh
    public final void LJI(C74152vb c74152vb) {
        HandlerC46759IWt handlerC46759IWt = this.LIZLLL;
        if (handlerC46759IWt != null) {
            handlerC46759IWt.obtainMessage(17, c74152vb).sendToTarget();
        }
    }

    @Override // X.InterfaceC46747IWh
    public final void LJJIIJ(float f) {
        HandlerC46759IWt handlerC46759IWt = this.LIZLLL;
        if (handlerC46759IWt != null) {
            handlerC46759IWt.obtainMessage(11, Float.valueOf(f)).sendToTarget();
        }
    }

    @Override // X.InterfaceC46747IWh
    public final void LJJJLL(OnUIPlayListener onUIPlayListener) {
        this.LIZIZ = onUIPlayListener;
        this.LIZ.LJJJLL(onUIPlayListener);
    }

    @Override // X.InterfaceC46747IWh
    public final void LJJJLZIJ(int i) {
        HandlerC46759IWt handlerC46759IWt = this.LIZLLL;
        if (handlerC46759IWt != null) {
            if (i > 0) {
                handlerC46759IWt.LIZIZ = i;
            } else {
                handlerC46759IWt.getClass();
            }
            this.LIZLLL.sendEmptyMessage(12);
        }
    }

    @Override // X.InterfaceC46747IWh
    public final void LJJLIIIIJ(InterfaceC46803IYl interfaceC46803IYl) {
        InterfaceC46747IWh interfaceC46747IWh = this.LIZ;
        if (interfaceC46747IWh != null) {
            interfaceC46747IWh.LJJLIIIIJ(interfaceC46803IYl);
        }
    }

    @Override // X.InterfaceC46747IWh
    public final void LJJLIIIJILLIZJL(int i) {
        InterfaceC46747IWh interfaceC46747IWh = this.LIZ;
        if (interfaceC46747IWh != null) {
            interfaceC46747IWh.LJJLIIIJILLIZJL(i);
        }
    }

    @Override // X.InterfaceC46747IWh
    public final void LJJLIIIJJIZ(InterfaceC46826IZi interfaceC46826IZi) {
        InterfaceC46747IWh interfaceC46747IWh = this.LIZ;
        if (interfaceC46747IWh != null) {
            interfaceC46747IWh.LJJLIIIJJIZ(interfaceC46826IZi);
        }
    }

    @Override // X.InterfaceC46747IWh
    public final boolean LJJLIIIJLJLI(OnUIPlayListener onUIPlayListener) {
        OnUIPlayListener onUIPlayListener2 = this.LIZIZ;
        if (onUIPlayListener2 != null && onUIPlayListener2.getWrapperedListener() != null && this.LIZIZ.getWrapperedListener().equals(onUIPlayListener)) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC46747IWh
    public final void LJJLIIIJLLLLLLLZ(int i) {
        InterfaceC46747IWh interfaceC46747IWh = this.LIZ;
        if (interfaceC46747IWh != null) {
            interfaceC46747IWh.LJJLIIIJLLLLLLLZ(i);
        }
    }

    @Override // X.InterfaceC46747IWh
    public final String LJJLIIJ(int i) {
        InterfaceC46747IWh interfaceC46747IWh = this.LIZ;
        if (interfaceC46747IWh != null) {
            return interfaceC46747IWh.LJJLIIJ(i);
        }
        return "";
    }

    @Override // X.InterfaceC46747IWh
    public final void LJJLJLI(C46755IWp c46755IWp) {
        C46763IWx.LIZ.LIZ = c46755IWp;
    }

    @Override // X.InterfaceC46747IWh
    public final void LJJLL(InterfaceC46942Iba interfaceC46942Iba) {
        this.LIZ.LJJLL(interfaceC46942Iba);
    }

    @Override // X.InterfaceC46747IWh
    public final void LJJZZI(ITX itx) {
        this.LIZ.LJJZZI(itx);
    }

    @Override // X.InterfaceC46747IWh
    public final void LJL(Bundle bundle) {
        InterfaceC46747IWh interfaceC46747IWh = this.LIZ;
        if (interfaceC46747IWh != null) {
            interfaceC46747IWh.LJL(bundle);
        }
    }

    @Override // X.InterfaceC46747IWh
    public final void LJLI(boolean z) {
        InterfaceC46747IWh interfaceC46747IWh = this.LIZ;
        if (interfaceC46747IWh != null) {
            interfaceC46747IWh.LJLI(z);
        }
    }

    @Override // X.InterfaceC46747IWh
    public final void LJLIIIL(IX4 ix4) {
        String str;
        if (IXB.LIZ) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("prepare()");
            if (ix4 != null) {
                str = ix4.LJIIIZ;
            } else {
                str = "null";
            }
            LIZ.append(str);
            IXB.LIZIZ("SimplifyAsyncPlayer", X1D.LIZIZ(LIZ));
        }
        if (ix4 == null) {
            return;
        }
        if (IZ8.LJJIJ() == 2) {
            StackTraceElement[] stackTrace = C16880lQ.LLLLIIIILLL().getStackTrace();
            if (stackTrace.length > 0) {
                StringBuilder sb = new StringBuilder();
                for (StackTraceElement stackTraceElement : stackTrace) {
                    sb.append(stackTraceElement.toString());
                    sb.append("\n");
                }
                ix4.LLFFF = sb.toString();
            }
        }
        if (this.LJI) {
            IXB.LIZLLL("SimplifyAsyncPlayer", "mIsLastPlayThreadQuiting when prepare");
            return;
        }
        ix4.LJLJL = 1;
        this.LJFF = ix4.LJIIIZ;
        long currentTimeMillis = System.currentTimeMillis();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (ix4.LJJIJ && this.LIZIZ != null) {
            IPH iph = new IPH(ix4.LJIIIZ);
            iph.LJII = isMute();
            this.LJ.post(new ARunnableS0S0300200_8(this, ix4, iph, currentTimeMillis, elapsedRealtime, 0));
        }
        if (ix4.LJJIIZI) {
            if (this.LIZLLL == null) {
                LJII();
            }
            this.LIZLLL.obtainMessage(1, ix4).sendToTarget();
        }
    }

    @Override // X.InterfaceC46747IWh
    public final void LJLIIL(InterfaceC46832IZo interfaceC46832IZo) {
        this.LIZ.LJLIIL(interfaceC46832IZo);
    }

    @Override // X.InterfaceC46747IWh
    public final void LJLILLLLZI(String str) {
        if (IXB.LIZ) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("resume()");
            LIZ.append(this.LJFF);
            IXB.LIZIZ("SimplifyAsyncPlayer", X1D.LIZIZ(LIZ));
        }
        HandlerC46759IWt handlerC46759IWt = this.LIZLLL;
        if (handlerC46759IWt != null) {
            handlerC46759IWt.obtainMessage(4, str).sendToTarget();
        }
    }

    @Override // X.InterfaceC46747IWh
    public final void LJLJLJ(InterfaceC46754IWo interfaceC46754IWo) {
        this.LIZ.LJLJLJ(interfaceC46754IWo);
    }

    @Override // X.InterfaceC46747IWh
    public final void LJLLI(C46543IOl c46543IOl) {
        this.LIZ.LJLLI(c46543IOl);
    }

    @Override // X.InterfaceC46747IWh
    public final void LJLLJ(Surface surface) {
        if (IXB.LIZ) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("setSurfaceDirectly(), surface = ");
            LIZ.append(surface);
            LIZ.append(", mSimplifyPlayer = ");
            LIZ.append(this.LIZ);
            LIZ.append(", ");
            LIZ.append(this.LJFF);
            IXB.LIZIZ("SimplifyAsyncPlayer", X1D.LIZIZ(LIZ));
        }
        this.LIZ.LJLLJ(surface);
    }

    @Override // X.InterfaceC46747IWh
    public final void LJLLLLLL(InterfaceC47128Iea interfaceC47128Iea) {
        InterfaceC46747IWh interfaceC46747IWh = this.LIZ;
        if (interfaceC46747IWh != null) {
            interfaceC46747IWh.LJLLLLLL(interfaceC47128Iea);
        }
    }

    @Override // X.InterfaceC46747IWh
    public final void setDisplay(SurfaceHolder surfaceHolder) {
        HandlerC46759IWt handlerC46759IWt = this.LIZLLL;
        if (handlerC46759IWt != null) {
            handlerC46759IWt.obtainMessage(14, surfaceHolder).sendToTarget();
        }
    }

    @Override // X.InterfaceC46747IWh
    public final void setSurface(Surface surface) {
        if (IXB.LIZ) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("setSurface(), surface = ");
            LIZ.append(surface);
            LIZ.append(", mSimplifyPlayer = ");
            LIZ.append(this.LIZ);
            LIZ.append(", ");
            LIZ.append(this.LJFF);
            IXB.LIZIZ("SimplifyAsyncPlayer", X1D.LIZIZ(LIZ));
        }
        this.LIZ.setSurface(surface);
    }

    @Override // X.InterfaceC46747IWh
    public final void LJJLIIIJ(int i, JSONObject jSONObject) {
        InterfaceC46747IWh interfaceC46747IWh = this.LIZ;
        if (interfaceC46747IWh != null) {
            interfaceC46747IWh.LJJLIIIJ(i, jSONObject);
        }
    }

    @Override // X.InterfaceC46747IWh
    public final void LJJZ(int i, Bundle bundle) {
        InterfaceC46747IWh interfaceC46747IWh = this.LIZ;
        if (interfaceC46747IWh != null) {
            interfaceC46747IWh.LJJZ(i, bundle);
        }
    }

    @Override // X.InterfaceC46747IWh
    public final boolean LJLJL(String str, String str2) {
        return TextUtils.equals(str, this.LJFF);
    }

    @Override // X.InterfaceC46747IWh
    public final void LJLJLLL(int i, int i2) {
        HandlerC46759IWt handlerC46759IWt = this.LIZLLL;
        if (handlerC46759IWt != null) {
            handlerC46759IWt.obtainMessage(13, new Pair(Integer.valueOf(i), Integer.valueOf(i2))).sendToTarget();
        }
    }

    @Override // X.InterfaceC46747IWh
    public final void LJLL(boolean z, Bundle bundle) {
        InterfaceC46747IWh interfaceC46747IWh = this.LIZ;
        if (interfaceC46747IWh != null) {
            interfaceC46747IWh.LJLL(z, bundle);
        }
    }

    @Override // X.InterfaceC46747IWh
    public final void setVolume(float f, float f2) {
        HandlerC46759IWt handlerC46759IWt = this.LIZLLL;
        if (handlerC46759IWt != null) {
            handlerC46759IWt.obtainMessage(9, new Pair(Float.valueOf(f), Float.valueOf(f2))).sendToTarget();
        }
    }
}
