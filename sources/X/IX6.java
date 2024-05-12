package X;

import android.os.Bundle;
import android.os.Message;
import android.text.TextUtils;
import android.util.Pair;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import com.ss.android.ugc.playerkit.radar.SimRadar;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public class IX6 implements InterfaceC46747IWh {
    public final IXC LIZ;
    public IX7 LIZIZ;
    public Surface LIZJ;
    public WeakReference<OnUIPlayListener> LIZLLL;
    public InterfaceC46832IZo LJ;
    public InterfaceC46754IWo LJFF;
    public InterfaceC46942Iba LJI;
    public C46543IOl LJII;
    public IVM LJIIIIZZ;

    @Override // X.InterfaceC46747IWh
    public final /* synthetic */ void LJLIL(EnumC38817FLh enumC38817FLh) {
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
    public final boolean LIZLLL() {
        IX7 ix7 = this.LIZIZ;
        if (ix7 != null && ix7.LJFF.LIZLLL()) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC46747IWh
    public final C38798FKo LJ() {
        IXA ixa;
        IX7 ix7 = this.LIZIZ;
        if (ix7 != null && (ixa = ix7.LJFF) != null) {
            return ixa.LJ();
        }
        return null;
    }

    public final String LJII() {
        IX7 ix7 = this.LIZIZ;
        if (ix7 != null) {
            return ix7.LIZ;
        }
        return "null";
    }

    @Override // X.InterfaceC46747IWh
    public final void LJJJLIIL() {
        IX7 ix7 = this.LIZIZ;
        if (ix7 == null || ix7.LJIIIZ || ix7.LJIIIIZZ) {
            return;
        }
        ix7.LJ.LIZ(300);
    }

    @Override // X.InterfaceC46747IWh
    public final void LJJJZ() {
        IX7 ix7 = this.LIZIZ;
        if (ix7 != null) {
            ix7.LJ.removeMessages(12);
        }
    }

    @Override // X.InterfaceC46747IWh
    public final void LJJLI() {
        IX7 ix7 = this.LIZIZ;
        if (ix7 != null) {
            ix7.LJFF.LJJLI();
        }
    }

    @Override // X.InterfaceC46747IWh
    public final void LJJLIIIJJI() {
        IX7 ix7 = this.LIZIZ;
        if (ix7 == null || !ix7.LIZJ()) {
            return;
        }
        release();
    }

    @Override // X.InterfaceC46747IWh
    public final void LJJLIIIJL() {
        IX7 ix7 = this.LIZIZ;
        if (ix7 != null) {
            ix7.LJFF.LJJLIIIJL();
        }
    }

    @Override // X.InterfaceC46747IWh
    public final int LJLJJLL() {
        IX7 ix7 = this.LIZIZ;
        if (ix7 != null) {
            return ix7.LJFF.LJIILIIL;
        }
        return 0;
    }

    @Override // X.InterfaceC46747IWh
    public final String LJLLL() {
        IX7 ix7 = this.LIZIZ;
        if (ix7 != null) {
            return ix7.LJFF.LJLLL();
        }
        return null;
    }

    @Override // X.InterfaceC46747IWh
    public final boolean LJLZ() {
        IX7 ix7 = this.LIZIZ;
        if (ix7 != null && ix7.LJFF.LJLZ()) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC46747IWh
    public final long getCurrentPosition() {
        IX7 ix7 = this.LIZIZ;
        if (ix7 != null) {
            return ix7.LJFF.getCurrentPosition();
        }
        return 0L;
    }

    @Override // X.InterfaceC46747IWh
    public final long getDuration() {
        IX7 ix7 = this.LIZIZ;
        if (ix7 != null) {
            return ix7.LJFF.getDuration();
        }
        return 0L;
    }

    @Override // X.InterfaceC46747IWh
    public final ITZ getPlayerType() {
        IX7 ix7 = this.LIZIZ;
        if (ix7 != null) {
            return ix7.LJFF.LIZLLL;
        }
        return ITZ.TT;
    }

    @Override // X.InterfaceC46747IWh
    public final int getState() {
        IX7 ix7 = this.LIZIZ;
        if (ix7 != null) {
            return ix7.LJFF.LJIIZILJ;
        }
        return 0;
    }

    @Override // X.InterfaceC46747IWh
    public final ITI getVideoInfo() {
        IXA ixa;
        IX7 ix7 = this.LIZIZ;
        if (ix7 != null && (ixa = ix7.LJFF) != null) {
            return ixa.getVideoInfo();
        }
        return null;
    }

    @Override // X.InterfaceC46747IWh
    public final int getWatchedDuration() {
        IX7 ix7 = this.LIZIZ;
        if (ix7 != null) {
            return ix7.LJFF.getWatchedDuration();
        }
        return -1;
    }

    @Override // X.InterfaceC46747IWh
    public final void init() {
        if (IXB.LIZ) {
            IXB.LIZIZ("SimplifyAsyncPlayerV3", "init()");
        }
        IX7 ix7 = this.LIZIZ;
        if (ix7 == null) {
            ix7 = this.LIZ.LIZLLL();
            this.LIZIZ = ix7;
            if (ix7 == null) {
                return;
            }
        }
        InterfaceC46942Iba interfaceC46942Iba = this.LJI;
        if (interfaceC46942Iba != null) {
            ix7.LJFF.LJJLL(interfaceC46942Iba);
        }
        C46543IOl c46543IOl = this.LJII;
        if (c46543IOl != null) {
            ix7.LJFF.LJLLI(c46543IOl);
        }
        ix7.LIZLLL();
    }

    @Override // X.InterfaceC46747IWh
    public final boolean isLoading() {
        IX7 ix7 = this.LIZIZ;
        if (ix7 != null && ix7.LJFF.isLoading()) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC46747IWh
    public final boolean isMute() {
        IX7 ix7 = this.LIZIZ;
        if (ix7 != null && ix7.LJFF.isMute()) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC46747IWh
    public final boolean isPaused() {
        IX7 ix7 = this.LIZIZ;
        if (ix7 != null && ix7.LJFF.isPaused()) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC46747IWh
    public final boolean isPlaying() {
        IX7 ix7 = this.LIZIZ;
        if (ix7 != null && ix7.LJFF.isPlaying()) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC46747IWh
    public final void LJJL() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("sleep()");
        LIZ.append(LJII());
        IXB.LIZIZ("SimplifyAsyncPlayerV3", X1D.LIZIZ(LIZ));
        IX7 ix7 = this.LIZIZ;
        if (ix7 != null) {
            if (IZ8.LIZ()) {
                IXB.LIZJ(android.util.Log.getStackTraceString(new Throwable()));
            }
            ix7.LJ.obtainMessage(19).sendToTarget();
        }
        Object value = IZ8.LJZI.getValue();
        o.LJIIIIZZ(value, "<get-SLEEP_RELEASE_BACKGROUND_SESSION>(...)");
        if (((Boolean) value).booleanValue()) {
            IXB.LIZIZ("SimplifyAsyncPlayerV3", "sleep : release background session");
            this.LIZ.LJIIJ();
        }
    }

    @Override // X.InterfaceC46747IWh
    public final void LJJLIL() {
        if (IZ8.LJJJJLI()) {
            LJIIIIZZ("render");
        }
        if (IXB.LIZ) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("render()");
            LIZ.append(LJII());
            IXB.LIZIZ("SimplifyAsyncPlayerV3", X1D.LIZIZ(LIZ));
        }
        IX7 ix7 = this.LIZIZ;
        if (ix7 != null) {
            ix7.LJ.sendEmptyMessage(8);
        }
    }

    @Override // X.InterfaceC46747IWh
    public final void pause() {
        if (IZ8.LJJJJLI()) {
            LJIIIIZZ("pause");
        }
        if (IXB.LIZ) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("pause()");
            LIZ.append(LJII());
            IXB.LIZIZ("SimplifyAsyncPlayerV3", X1D.LIZIZ(LIZ));
        }
        IX7 ix7 = this.LIZIZ;
        if (ix7 != null) {
            if (IZ8.LIZ()) {
                IXB.LIZJ(android.util.Log.getStackTraceString(new Throwable()));
            }
            ix7.LJ.sendEmptyMessage(5);
        }
    }

    @Override // X.InterfaceC46747IWh
    public final void release() {
        if (IZ8.LJJJJLI()) {
            LJIIIIZZ("release");
        }
        if (IXB.LIZ) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("release()");
            LIZ.append(LJII());
            IXB.LIZIZ("SimplifyAsyncPlayerV3", X1D.LIZIZ(LIZ));
        }
        this.LIZ.release();
        this.LIZIZ = null;
        this.LIZJ = null;
        this.LJ = null;
        this.LJFF = null;
        this.LJI = null;
        this.LJII = null;
    }

    @Override // X.InterfaceC46747IWh
    public final void resume() {
        if (IZ8.LJJJJLI()) {
            LJIIIIZZ("resume()");
        }
        if (IXB.LIZ) {
            IXB.LIZIZ("SimplifyAsyncPlayerV3", "resume()");
        }
        IXC ixc = this.LIZ;
        if (ixc != null) {
            ixc.LJ();
        }
        IX7 ix7 = this.LIZIZ;
        if (ix7 != null) {
            ix7.LJ.obtainMessage(4).sendToTarget();
        }
    }

    @Override // X.InterfaceC46747IWh
    public final void start() {
        if (IZ8.LJJJJLI()) {
            LJIIIIZZ("start");
        }
        if (IXB.LIZ) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("start() key:");
            LIZ.append(LJII());
            IXB.LIZIZ("SimplifyAsyncPlayerV3", X1D.LIZIZ(LIZ));
        }
        IXC ixc = this.LIZ;
        if (ixc != null) {
            ixc.LJ();
        }
        IX7 ix7 = this.LIZIZ;
        if (ix7 != null) {
            ix7.LJ.sendEmptyMessage(3);
        }
    }

    @Override // X.InterfaceC46747IWh
    public final void stop() {
        if (IZ8.LJJJJLI()) {
            LJIIIIZZ("stop");
        }
        if (IXB.LIZ) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("stop()");
            LIZ.append(LJII());
            IXB.LIZIZ("SimplifyAsyncPlayerV3", X1D.LIZIZ(LIZ));
        }
        IX7 ix7 = this.LIZIZ;
        if (ix7 != null) {
            ix7.LJI();
        }
    }

    public static void LJIIIIZZ(String str) {
        IXB.LIZIZ("SimplifyAsyncPlayerV3", str);
        StackTraceElement[] stackTrace = C16880lQ.LLLLIIIILLL().getStackTrace();
        if (stackTrace != null && stackTrace.length > 0) {
            int length = stackTrace.length;
            int i = 0;
            int i2 = 0;
            while (i < length) {
                StackTraceElement stackTraceElement = stackTrace[i];
                int i3 = i2 + 1;
                if (i2 >= 3) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("    ");
                    LIZ.append(stackTraceElement.toString());
                    IXB.LIZIZ("SimplifyAsyncPlayerV3", X1D.LIZIZ(LIZ));
                }
                i++;
                i2 = i3;
            }
        }
    }

    @Override // X.InterfaceC46747IWh
    public final void LIZ(String str) {
        IX7 ix7 = this.LIZIZ;
        if (ix7 != null) {
            ix7.LJFF.LIZ(str);
        }
    }

    @Override // X.InterfaceC46747IWh
    public final float LIZIZ(int i) {
        IX7 ix7 = this.LIZIZ;
        if (ix7 != null) {
            return ix7.LJFF.LIZIZ(i);
        }
        return 0.0f;
    }

    @Override // X.InterfaceC46747IWh
    public final <T> T LIZJ(IU1<T> iu1) {
        IX7 ix7 = this.LIZIZ;
        if (ix7 != null) {
            if (iu1.LIZ) {
                ix7.LJ.sendMessage(ix7.LJ.obtainMessage(255, iu1));
                return (T) iu1.LIZ();
            }
            IXA ixa = ix7.LJFF;
            if (ixa == null) {
                return (T) iu1.LIZ();
            }
            return (T) ixa.LIZJ(iu1);
        }
        return (T) iu1.LIZ();
    }

    @Override // X.InterfaceC46747IWh
    public final void LJFF(float f) {
        IX7 ix7 = this.LIZIZ;
        if (ix7 != null) {
            ix7.LJFF.LJFF(f);
        }
    }

    @Override // X.InterfaceC46747IWh
    public final void LJI(C74152vb c74152vb) {
        IX7 ix7 = this.LIZIZ;
        if (ix7 != null) {
            ix7.LJ.obtainMessage(25, c74152vb).sendToTarget();
        }
    }

    @Override // X.InterfaceC46747IWh
    public final void LJJIIJ(float f) {
        if (IXB.LIZ) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("seekTo() progress:");
            LIZ.append(f);
            LIZ.append(", key:");
            LIZ.append(LJII());
            IXB.LIZIZ("SimplifyAsyncPlayerV3", X1D.LIZIZ(LIZ));
        }
        IX7 ix7 = this.LIZIZ;
        if (ix7 != null) {
            ix7.LJ.obtainMessage(11, Float.valueOf(f)).sendToTarget();
        }
    }

    @Override // X.InterfaceC46747IWh
    public final void LJJJLL(OnUIPlayListener onUIPlayListener) {
        IX7 ix7 = this.LIZIZ;
        if (ix7 != null) {
            ix7.LJIIIIZZ(onUIPlayListener);
        }
        this.LIZLLL = new WeakReference<>(onUIPlayListener);
    }

    @Override // X.InterfaceC46747IWh
    public final void LJJJLZIJ(int i) {
        IX7 ix7 = this.LIZIZ;
        if (ix7 != null) {
            ix7.LJ.LIZ(i);
        }
    }

    @Override // X.InterfaceC46747IWh
    public final void LJJLIIIIJ(InterfaceC46803IYl interfaceC46803IYl) {
        IX7 ix7 = this.LIZIZ;
        if (ix7 != null && ix7.LJFF != null) {
            Message message = new Message();
            message.what = 22;
            message.arg1 = 2;
            message.obj = interfaceC46803IYl;
            ix7.LJ.sendMessage(message);
        }
    }

    @Override // X.InterfaceC46747IWh
    public final void LJJLIIIJILLIZJL(int i) {
        IX7 ix7 = this.LIZIZ;
        if (ix7 != null && ix7.LJFF != null) {
            Message message = new Message();
            message.what = 22;
            message.arg1 = 0;
            message.arg2 = i;
            ix7.LJ.sendMessage(message);
        }
    }

    @Override // X.InterfaceC46747IWh
    public final void LJJLIIIJJIZ(InterfaceC46826IZi interfaceC46826IZi) {
        IX7 ix7 = this.LIZIZ;
        if (ix7 != null && ix7.LJFF != null) {
            Message message = new Message();
            message.what = 18;
            message.arg1 = 2;
            message.obj = interfaceC46826IZi;
            ix7.LJ.sendMessage(message);
        }
    }

    @Override // X.InterfaceC46747IWh
    public final boolean LJJLIIIJLJLI(OnUIPlayListener onUIPlayListener) {
        WeakReference<OnUIPlayListener> weakReference;
        OnUIPlayListener onUIPlayListener2;
        IX7 ix7 = this.LIZIZ;
        if ((ix7 != null && (onUIPlayListener2 = ix7.LJIIJ) != null && onUIPlayListener2.getWrapperedListener() != null && this.LIZIZ.LJIIJ.getWrapperedListener().equals(onUIPlayListener)) || ((weakReference = this.LIZLLL) != null && weakReference.get() != null && this.LIZLLL.get().getWrapperedListener() != null && this.LIZLLL.get().getWrapperedListener().equals(onUIPlayListener))) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC46747IWh
    public final void LJJLIIIJLLLLLLLZ(int i) {
        IX7 ix7 = this.LIZIZ;
        if (ix7 != null && ix7.LJFF != null) {
            Message message = new Message();
            message.what = 18;
            message.arg1 = 0;
            message.arg2 = i;
            ix7.LJ.sendMessage(message);
        }
    }

    @Override // X.InterfaceC46747IWh
    public final String LJJLIIJ(int i) {
        IXA ixa;
        IX7 ix7 = this.LIZIZ;
        if (ix7 != null && (ixa = ix7.LJFF) != null) {
            return ixa.LJJLIIJ(i);
        }
        return "";
    }

    @Override // X.InterfaceC46747IWh
    public final void LJJLJ(IX4 ix4) {
        IXC ixc;
        String str;
        if (IZ8.LJJJJLI()) {
            LJIIIIZZ("nextPrepare");
        }
        if (IXB.LIZ) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("nextPrepare()");
            if (ix4 != null) {
                str = ix4.LJIIIZ;
            } else {
                str = "null";
            }
            LIZ.append(str);
            IXB.LIZIZ("SimplifyAsyncPlayerV3", X1D.LIZIZ(LIZ));
        }
        if (ix4 == null || (ixc = this.LIZ) == null) {
            SimRadar.errorScan("SimplifyAsyncPlayerV3", "nextPrepare", new C46690IUc("PrepareData or PlaySessionManager is null.Prepare next failed."), ix4, this.LIZ);
            SimRadar.analyzer().getClass();
            IVN.LIZIZ("SF-PDataNull1");
        } else if (ix4.LJL) {
            ixc.LJIIIIZZ(ix4, this.LJIIIIZZ);
        } else {
            ixc.LIZJ(ix4, this.LJIIIIZZ);
        }
    }

    @Override // X.InterfaceC46747IWh
    public final void LJJLJLI(C46755IWp c46755IWp) {
        C46763IWx.LIZ.LIZ = c46755IWp;
    }

    @Override // X.InterfaceC46747IWh
    public final void LJJLL(InterfaceC46942Iba interfaceC46942Iba) {
        this.LJI = interfaceC46942Iba;
        IX7 ix7 = this.LIZIZ;
        if (ix7 != null) {
            ix7.LJFF.LJJLL(interfaceC46942Iba);
        }
    }

    @Override // X.InterfaceC46747IWh
    public final void LJJZZI(ITX itx) {
        this.LIZ.LIZ(itx);
        IX7 ix7 = this.LIZIZ;
        if (ix7 != null) {
            ix7.LJFF.LJJIIJZLJL = itx;
        }
    }

    @Override // X.InterfaceC46747IWh
    public final void LJJZZIII(IWT iwt) {
        if (IZ8.LJJJJLI()) {
            LJIIIIZZ("initNextSession");
        }
        SimRadar.keyScan("SimplifyAsyncPlayerV3", "initNextSession", new Object[0]);
        if (IXB.LIZ) {
            IXB.LIZIZ("SimplifyAsyncPlayerV3", "initNextSession()");
        }
        IX7 LJIIIZ = this.LIZ.LJIIIZ();
        if (LJIIIZ != null) {
            LJIIIZ.LJFF.LJJLL(iwt);
            C46543IOl c46543IOl = this.LJII;
            if (c46543IOl != null) {
                LJIIIZ.LJFF.LJLLI(c46543IOl);
            }
            LJIIIZ.LIZLLL();
        }
    }

    @Override // X.InterfaceC46747IWh
    public final void LJL(Bundle bundle) {
        IX7 ix7 = this.LIZIZ;
        if (ix7 != null && ix7.LJFF != null) {
            Message message = new Message();
            message.what = 27;
            message.obj = bundle;
            ix7.LJ.sendMessage(message);
        }
    }

    @Override // X.InterfaceC46747IWh
    public final void LJLI(boolean z) {
        IX7 ix7 = this.LIZIZ;
        if (ix7 != null && ix7.LJFF != null) {
            Message message = new Message();
            message.what = 18;
            message.arg1 = 1;
            message.arg2 = z ? 1 : 0;
            ix7.LJ.sendMessage(message);
        }
    }

    @Override // X.InterfaceC46747IWh
    public final void LJLIIIL(IX4 ix4) {
        OnUIPlayListener onUIPlayListener;
        String str;
        if (IZ8.LJJJJLI()) {
            LJIIIIZZ("prepare");
        }
        if (IXB.LIZ) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("prepare() ");
            if (ix4 != null) {
                str = ix4.LJIIIZ;
            } else {
                str = "null";
            }
            LIZ.append(str);
            IXB.LIZIZ("SimplifyAsyncPlayerV3", X1D.LIZIZ(LIZ));
        }
        if (ix4 == null || this.LIZ == null) {
            SimRadar.errorScan("SimplifyAsyncPlayerV3", "prepare", new C46690IUc("PrepareData or PlaySessionManager is null. Prepare failed."), ix4, this.LIZ);
            SimRadar.analyzer().getClass();
            IVN.LIZIZ("SF-DataNull3");
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
        ix4.LJLJL = 3;
        WeakReference<OnUIPlayListener> weakReference = this.LIZLLL;
        if (weakReference != null) {
            onUIPlayListener = weakReference.get();
        } else {
            onUIPlayListener = null;
        }
        if (IXN.LIZJ.isPrerenderSurfaceSlowSetFix() || ix4.LJJJJ) {
            IXB.LIZIZ("SimplifyAsyncPlayerV3", "fix prerender surface slow : fill surface before startSession");
            ix4.LJJI = this.LIZJ;
        }
        this.LIZ.LJFF(ix4, onUIPlayListener, this.LJIIIIZZ);
        IX7 LIZIZ = this.LIZ.LIZIZ();
        this.LIZIZ = LIZIZ;
        if (LIZIZ != null) {
            C46543IOl c46543IOl = this.LJII;
            if (c46543IOl != null) {
                LIZIZ.LJFF.LJLLI(c46543IOl);
            }
            Surface surface = this.LIZJ;
            if (surface != null) {
                LIZIZ.LJIIJ(surface);
                this.LIZJ = null;
            }
            InterfaceC46832IZo interfaceC46832IZo = this.LJ;
            if (interfaceC46832IZo != null) {
                LIZIZ.LJFF.LJLIIL(interfaceC46832IZo);
            }
            if (this.LJFF != null) {
                LIZIZ.LJFF.getClass();
            }
        }
    }

    @Override // X.InterfaceC46747IWh
    public final void LJLIIL(InterfaceC46832IZo interfaceC46832IZo) {
        this.LJ = interfaceC46832IZo;
        IX7 ix7 = this.LIZIZ;
        if (ix7 != null) {
            ix7.LJFF.LJLIIL(interfaceC46832IZo);
        }
    }

    @Override // X.InterfaceC46747IWh
    public final void LJLILLLLZI(String str) {
        if (IZ8.LJJJJLI()) {
            LJIIIIZZ("resume(1)");
        }
        if (IXB.LIZ) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("resume()");
            LIZ.append(str);
            IXB.LIZIZ("SimplifyAsyncPlayerV3", X1D.LIZIZ(LIZ));
        }
        IXC ixc = this.LIZ;
        if (ixc != null) {
            ixc.LJ();
        }
        IX7 ix7 = this.LIZIZ;
        if (ix7 != null) {
            ix7.LJ.obtainMessage(4, str).sendToTarget();
        }
    }

    @Override // X.InterfaceC46747IWh
    public final void LJLJI(IWT iwt) {
        if (IZ8.LJJJJLI()) {
            LJIIIIZZ("preCreateAheadSession");
        }
        this.LIZ.LJII(iwt);
    }

    @Override // X.InterfaceC46747IWh
    public final void LJLJLJ(InterfaceC46754IWo interfaceC46754IWo) {
        this.LJFF = interfaceC46754IWo;
        IX7 ix7 = this.LIZIZ;
        if (ix7 != null) {
            ix7.LJFF.getClass();
        }
    }

    @Override // X.InterfaceC46747IWh
    public final void LJLLI(C46543IOl c46543IOl) {
        this.LJII = c46543IOl;
        IX7 ix7 = this.LIZIZ;
        if (ix7 != null) {
            ix7.LJFF.LJLLI(c46543IOl);
        }
    }

    @Override // X.InterfaceC46747IWh
    public final void LJLLJ(Surface surface) {
        if (IZ8.LJJJJLI()) {
            LJIIIIZZ("setSurfaceDirectly");
        }
        if (IXB.LIZ) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("setSurfaceDirectly(), surface = ");
            LIZ.append(surface);
            LIZ.append(", mCurrentPlaySession = ");
            LIZ.append(this.LIZIZ);
            LIZ.append(", ");
            LIZ.append(LJII());
            IXB.LIZIZ("SimplifyAsyncPlayerV3", X1D.LIZIZ(LIZ));
        }
        IX7 ix7 = this.LIZIZ;
        if (ix7 != null) {
            ix7.LJFF.LJLLJ(surface);
            ix7.LJ.obtainMessage(15, surface).sendToTarget();
        }
    }

    @Override // X.InterfaceC46747IWh
    public final void LJLLLL(IVL ivl) {
        this.LJIIIIZZ = ivl;
    }

    @Override // X.InterfaceC46747IWh
    public final void LJLLLLLL(InterfaceC47128Iea interfaceC47128Iea) {
        IX7 ix7 = this.LIZIZ;
        if (ix7 != null && ix7.LJFF != null) {
            Message message = new Message();
            message.what = 26;
            message.obj = interfaceC47128Iea;
            ix7.LJ.sendMessage(message);
        }
    }

    @Override // X.InterfaceC46747IWh
    public final void setDisplay(SurfaceHolder surfaceHolder) {
        if (IZ8.LJJJJLI()) {
            LJIIIIZZ("setDisplay");
        }
        IX7 ix7 = this.LIZIZ;
        if (ix7 != null) {
            ix7.LJ.obtainMessage(14, surfaceHolder).sendToTarget();
        }
    }

    @Override // X.InterfaceC46747IWh
    public final void setSurface(Surface surface) {
        if (IZ8.LJJJJLI()) {
            LJIIIIZZ("setSurface");
        }
        if (IXB.LIZ) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("setSurface(), surface = ");
            LIZ.append(surface);
            LIZ.append(", mCurrentPlaySession = ");
            LIZ.append(this.LIZIZ);
            LIZ.append(", ");
            LIZ.append(LJII());
            IXB.LIZIZ("SimplifyAsyncPlayerV3", X1D.LIZIZ(LIZ));
        }
        this.LIZJ = surface;
        IX7 ix7 = this.LIZIZ;
        if (ix7 != null) {
            ix7.LJIIJ(surface);
        }
    }

    public IX6(ITZ itz, C46999IcV c46999IcV) {
        IXC c46998IcU;
        Object value = IZ8.LLFF.getValue();
        o.LJIIIIZZ(value, "<get-PLAYER_SESSION_MANAGER_V3_ENABLE>(...)");
        if (((Boolean) value).booleanValue()) {
            c46998IcU = new C47006Icc(itz, c46999IcV);
        } else {
            c46998IcU = new C46998IcU(itz, c46999IcV);
        }
        this.LIZ = c46998IcU;
    }

    @Override // X.InterfaceC46747IWh
    public final void LJJLIIIJ(int i, JSONObject jSONObject) {
        IX7 ix7 = this.LIZIZ;
        if (ix7 != null && ix7.LJFF != null) {
            Message message = new Message();
            message.what = 18;
            message.arg1 = 3;
            message.arg2 = i;
            message.obj = jSONObject;
            ix7.LJ.sendMessage(message);
        }
    }

    @Override // X.InterfaceC46747IWh
    public final void LJJZ(int i, Bundle bundle) {
        IX7 ix7 = this.LIZIZ;
        if (ix7 != null && ix7.LJFF != null) {
            Message message = new Message();
            message.what = 24;
            bundle.putInt("texture_layout_param", i);
            message.obj = bundle;
            ix7.LJ.sendMessage(message);
        }
    }

    @Override // X.InterfaceC46747IWh
    public final boolean LJLJL(String str, String str2) {
        IX7 ix7 = this.LIZIZ;
        if (ix7 != null && TextUtils.equals(str, ix7.LIZ)) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC46747IWh
    public final void LJLJLLL(int i, int i2) {
        IX7 ix7 = this.LIZIZ;
        if (ix7 != null) {
            ix7.LJ.obtainMessage(13, new Pair(Integer.valueOf(i), Integer.valueOf(i2))).sendToTarget();
        }
    }

    @Override // X.InterfaceC46747IWh
    public final void LJLL(boolean z, Bundle bundle) {
        IX7 ix7 = this.LIZIZ;
        if (ix7 != null && ix7.LJFF != null) {
            Message message = new Message();
            message.what = 23;
            bundle.putBoolean("crop_param_open", z);
            message.obj = bundle;
            ix7.LJ.sendMessage(message);
        }
    }

    @Override // X.InterfaceC46747IWh
    public final void setVolume(float f, float f2) {
        if (IXB.LIZ) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("setVolume() leftVolume:");
            LIZ.append(f);
            LIZ.append(", rightVolume:");
            LIZ.append(f2);
            LIZ.append(", key:");
            LIZ.append(LJII());
            IXB.LIZIZ("SimplifyAsyncPlayerV3", X1D.LIZIZ(LIZ));
        }
        IXC ixc = this.LIZ;
        if (ixc != null) {
            if (f <= 0.0f && f2 <= 0.0f) {
                ixc.setMute(true);
            } else {
                ixc.setMute(false);
            }
        }
        IX7 ix7 = this.LIZIZ;
        if (ix7 != null) {
            ix7.LJIIJJI(f, f2);
        }
    }
}
