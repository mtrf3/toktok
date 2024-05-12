package X;

import Y.ARunnableS27S0200000_8;
import Y.ARunnableS2S1110000_8;
import Y.ARunnableS3S1201000_8;
import Y.ARunnableS5S1300000_8;
import Y.ARunnableS7S1200000_8;
import Y.ARunnableS8S0201000_5;
import Y.ARunnableS9S1100000_8;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.player.sdk.api.OnPlayerPreparedListener;
import com.ss.android.ugc.aweme.player.sdk.api.OnPreRenderListener;
import com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import com.ss.android.ugc.playerkit.radar.SimRadar;
import java.util.ArrayList;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class ITG implements InterfaceC46823IZf {
    public final /* synthetic */ IX5 LIZ;

    /* JADX WARN: Code restructure failed: missing block: B:135:0x0236, code lost:
    
        if (r2 != null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0230, code lost:
    
        if (r2 != null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x022b, code lost:
    
        if (r2 != null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0226, code lost:
    
        if (r2 != null) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:131:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0135  */
    @Override // X.InterfaceC46823IZf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJ() {
        /*
            Method dump skipped, instructions count: 898
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ITG.LJ():void");
    }

    @Override // X.InterfaceC46823IZf
    public final void LJFF() {
        SimRadar.keyScan("SimplifyPlayerImpl", "onReadyForDisplay", this.LIZ.LJI);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SimplifyPlayerImpl, onReadyForDisplay, sourceId:");
        LIZ.append(this.LIZ.LJI);
        IXB.LIZ(X1D.LIZIZ(LIZ));
        IX5 ix5 = this.LIZ;
        if (ix5.LJJIJL) {
            ix5.LJJIJLIJ = true;
        }
        String str = ix5.LJI;
        OnPreRenderListener onPreRenderListener = ix5.LJJIII;
        ix5.LJJIII = null;
        IX4 ix4 = ix5.LJ;
        if (ix4 != null) {
            ix4.LIZIZ = null;
        }
        ix5.LJJIFFI.LIZ(new ARunnableS9S1100000_8(onPreRenderListener, str, 4));
    }

    @Override // X.InterfaceC46823IZf
    public final void LJII() {
        if (IXB.LIZ) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("SimplifyPlayerImpl, onRenderFromResume mUIPlayListener:");
            LIZ.append(this.LIZ.LJJII);
            IXB.LIZ(X1D.LIZIZ(LIZ));
        }
        IX5 ix5 = this.LIZ;
        OnUIPlayListener onUIPlayListener = ix5.LJJII;
        if (onUIPlayListener != null) {
            ix5.LJJIFFI.LIZ(new ARunnableS27S0200000_8(this, onUIPlayListener, 47));
        }
    }

    @Override // X.InterfaceC46823IZf
    public final void LIZIZ() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("VIDEO@");
        LIZ.append(this.LIZ.LJI);
        SimRadar.traceGroup(X1D.LIZIZ(LIZ)).LIZIZ("onPlaying");
        IX5 player = this.LIZ;
        o.LJIIIZ(player, "player");
        ITU.LIZ = player;
        IX5 ix5 = this.LIZ;
        String str = ix5.LJI;
        OnUIPlayListener onUIPlayListener = ix5.LJJII;
        IPH LJIIIZ = ix5.LJIIIZ();
        ITH.LIZ(str);
        this.LIZ.LJJIFFI.LIZ(new ARunnableS7S1200000_8(LJIIIZ, onUIPlayListener, str, 5));
    }

    @Override // X.InterfaceC46823IZf
    public final void LIZLLL() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("VIDEO@");
        LIZ.append(this.LIZ.LJI);
        SimRadar.traceGroup(X1D.LIZIZ(LIZ)).LIZIZ("onPlayPause");
        IX5 player = this.LIZ;
        o.LJIIIZ(player, "player");
        if (o.LJ(ITU.LIZ, player)) {
            ITU.LIZ = null;
        }
        IX5 ix5 = this.LIZ;
        String str = ix5.LJI;
        ix5.LJJIFFI.LIZ(new ARunnableS9S1100000_8(ix5.LJJII, str, 3));
    }

    @Override // X.InterfaceC46823IZf
    public final void LJIIIIZZ() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("VIDEO@");
        LIZ.append(this.LIZ.LJI);
        SimRadar.traceGroup(X1D.LIZIZ(LIZ)).LIZIZ("onCompleteLoaded");
        IX5 ix5 = this.LIZ;
        String str = ix5.LJI;
        ix5.LJJIFFI.LIZ(new ARunnableS7S1200000_8(this, ix5.LJJII, str, 4));
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0100 A[Catch: Exception -> 0x01c0, TryCatch #0 {Exception -> 0x01c0, blocks: (B:6:0x003c, B:10:0x0058, B:14:0x00c1, B:16:0x00ee, B:18:0x00fa, B:20:0x0100, B:21:0x010e, B:23:0x0123, B:26:0x0136, B:27:0x013c, B:29:0x0140, B:30:0x0142, B:32:0x014b, B:33:0x0151, B:35:0x0156, B:36:0x0158, B:38:0x0161, B:39:0x0167, B:41:0x016b, B:42:0x016d, B:45:0x017f, B:46:0x0185, B:48:0x0189, B:49:0x018b, B:51:0x0194, B:52:0x019a, B:54:0x019e, B:55:0x01a0, B:57:0x01a9, B:58:0x01af, B:60:0x01b3, B:61:0x01b5, B:84:0x00bd, B:86:0x004a, B:88:0x0050), top: B:5:0x003c }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0123 A[Catch: Exception -> 0x01c0, TRY_LEAVE, TryCatch #0 {Exception -> 0x01c0, blocks: (B:6:0x003c, B:10:0x0058, B:14:0x00c1, B:16:0x00ee, B:18:0x00fa, B:20:0x0100, B:21:0x010e, B:23:0x0123, B:26:0x0136, B:27:0x013c, B:29:0x0140, B:30:0x0142, B:32:0x014b, B:33:0x0151, B:35:0x0156, B:36:0x0158, B:38:0x0161, B:39:0x0167, B:41:0x016b, B:42:0x016d, B:45:0x017f, B:46:0x0185, B:48:0x0189, B:49:0x018b, B:51:0x0194, B:52:0x019a, B:54:0x019e, B:55:0x01a0, B:57:0x01a9, B:58:0x01af, B:60:0x01b3, B:61:0x01b5, B:84:0x00bd, B:86:0x004a, B:88:0x0050), top: B:5:0x003c }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01fc  */
    @Override // X.InterfaceC46823IZf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIILIIL() {
        /*
            Method dump skipped, instructions count: 569
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ITG.LJIILIIL():void");
    }

    @Override // X.InterfaceC46823IZf
    public final void onCompletion() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("VIDEO@");
        LIZ.append(this.LIZ.LJI);
        SimRadar.traceGroup(X1D.LIZIZ(LIZ)).LIZIZ("onPlayCompleted");
        IX5 ix5 = this.LIZ;
        OnUIPlayListener onUIPlayListener = ix5.LJJII;
        if (onUIPlayListener != null) {
            String str = ix5.LJI;
            if (ix5.LJIILIIL == 0) {
                this.LIZ.LJJIFFI.LIZ(new ARunnableS7S1200000_8(ix5.LJIIIZ(), onUIPlayListener, str, 2));
            }
            IX5 ix52 = this.LIZ;
            ix52.LJIILIIL++;
            ix52.LJJIFFI.LIZ(new ARunnableS7S1200000_8(this, onUIPlayListener, str, 3));
        }
    }

    @Override // X.InterfaceC46823IZf
    public final void onPrepare() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("VIDEO@");
        LIZ.append(this.LIZ.LJI);
        SimRadar.traceGroup(X1D.LIZIZ(LIZ)).LIZIZ("onPrepare");
        this.LIZ.LJJ();
        IX5 ix5 = this.LIZ;
        String str = ix5.LJI;
        ix5.LJJIFFI.LIZ(new ARunnableS7S1200000_8(this, ix5.LJJII, str, 6));
    }

    @Override // X.InterfaceC46823IZf
    public final void onPrepared() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("VIDEO@");
        LIZ.append(this.LIZ.LJI);
        SimRadar.traceGroup(X1D.LIZIZ(LIZ)).LIZIZ("onPrepared");
        if (IXB.LIZ) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("SimplifyPlayerImpl, onPrepared(), surface = ");
            LIZ2.append(this.LIZ.LJFF);
            LIZ2.append(", mPlayer = ");
            LIZ2.append(this.LIZ.LIZIZ);
            LIZ2.append(" mStatus = ");
            LIZ2.append(this.LIZ.LJIIZILJ);
            LIZ2.append(", mPrepareOnly:");
            LIZ2.append(this.LIZ.LJJIJL);
            IXB.LIZ(X1D.LIZIZ(LIZ2));
        }
        boolean z = this.LIZ.LJIJJLI.get();
        Object value = IZ8.T0.getValue();
        o.LJIIIIZZ(value, "<get-fixToSetCurrentSurface>(...)");
        if (((Boolean) value).booleanValue() && z) {
            IXB.LIZ("SimplifyPlayerImplonPrepared(), isReleasing return");
            return;
        }
        IX5 ix5 = this.LIZ;
        String str = ix5.LJI;
        OnPlayerPreparedListener onPlayerPreparedListener = ix5.LJJIIJ;
        ix5.LJJIIJ = null;
        IX4 ix4 = ix5.LJ;
        if (ix4 != null) {
            ix4.LIZJ = null;
        }
        ix5.LJJIFFI.LIZ(new ARunnableS8S0201000_5(1, onPlayerPreparedListener, str, 11));
        IX5 ix52 = this.LIZ;
        ix52.LJIIJ = false;
        int i = ix52.LJIIZILJ;
        if (i == 1) {
            if (ix52.LJJIIJZLJL != null) {
                ix52.LJJ();
                this.LIZ.LJJIIJZLJL.getClass();
            }
            IX5 ix53 = this.LIZ;
            ix53.LJIIZILJ = 2;
            ix53.LJIIL = true;
            if (ix53.LJIIJJI) {
                ix53.LJIJI = System.currentTimeMillis();
                IX5 ix54 = this.LIZ;
                if (!ix54.LJJIJL) {
                    ix54.start();
                }
            }
        } else if (i == 5) {
            ix52.pause();
        }
        IX5 ix55 = this.LIZ;
        String str2 = ix55.LJI;
        ix55.LJJIFFI.LIZ(new ARunnableS7S1200000_8(this, ix55.LJJII, str2, 8));
    }

    public ITG(IX5 ix5) {
        this.LIZ = ix5;
    }

    @Override // X.InterfaceC46823IZf
    public final void LJIIJ(boolean z) {
        IX5 ix5 = this.LIZ;
        String str = ix5.LJI;
        ix5.LJJIFFI.LIZ(new ARunnableS2S1110000_8(ix5.LJJII, str, z, 0));
    }

    @Override // X.InterfaceC46823IZf
    public final void LJIIJJI(long j) {
        IX5 ix5 = this.LIZ;
        String str = ix5.LJI;
        ix5.LJJIFFI.LIZ(new RunnableC46325IGb(ix5.LJJII, j, str));
    }

    @Override // X.InterfaceC46823IZf
    public final void LJIILL(float f) {
        IX5 ix5 = this.LIZ;
        ix5.LJJIFFI.LIZ(new IGY(ix5.LJJII, ix5.LJI, f));
    }

    @Override // X.InterfaceC46823IZf
    public final void onBuffering(boolean z) {
        ITK itk;
        ITT itt;
        IZL izl;
        if (z) {
            SimRadar.traceGroup("SimBuffer").LIZ("buffer").LIZLLL();
        } else {
            SimRadar.traceGroup("SimBuffer").LIZ("buffer").LJ();
        }
        IX5 ix5 = this.LIZ;
        String str = ix5.LJI;
        if (z) {
            if (ix5.LJJII != null && (((izl = ix5.LIZIZ) != null && izl.LJJJJI() != 0) || this.LIZ.LJIIL)) {
                IX5 ix52 = this.LIZ;
                this.LIZ.LJJIFFI.LIZ(new ARunnableS7S1200000_8(ix52.LJIIIZ(), ix52.LJJII, str, 9));
            }
            C46664ITc.LJIJ.LJIILLIIL(System.currentTimeMillis(), str);
            return;
        }
        if (ix5.LJIIL) {
            ix5.LJIJJ = SystemClock.elapsedRealtime();
        }
        IX5 ix53 = this.LIZ;
        ix53.LJIIL = false;
        this.LIZ.LJJIFFI.LIZ(new ARunnableS7S1200000_8(ix53.LJIIIZ(), ix53.LJJII, str, 10));
        C46664ITc c46664ITc = C46664ITc.LJIJ;
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (c46664ITc) {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            if (((ArrayList) c46664ITc.LJIILLIIL).size() <= 0 || (itk = (ITK) ListProtector.get(c46664ITc.LJIILLIIL, 0)) == null || !TextUtils.equals(itk.LIZ, str)) {
                itk = new ITK(str);
                ListProtector.add(c46664ITc.LJIILLIIL, 0, itk);
            }
            if (((ArrayList) itk.LIZIZ).size() > 0 && (itt = (ITT) ListProtector.get(itk.LIZIZ, 0)) != null && itt.LIZ == 0) {
                itt.LIZ = currentTimeMillis;
            }
        }
    }

    @Override // X.InterfaceC46823IZf
    public final void LJI(float f, int i) {
        IX5 ix5 = this.LIZ;
        String str = ix5.LJI;
        ix5.LJJIFFI.LIZ(new IF8(ix5.LJJII, str, i, f));
    }

    @Override // X.InterfaceC46823IZf
    public final void LJIIL(int i, JSONObject jSONObject) {
        IX5 ix5 = this.LIZ;
        ix5.LJJIFFI.LIZ(new ARunnableS3S1201000_8(ix5.LJJII, ix5.LJI, i, jSONObject, 2));
    }

    @Override // X.InterfaceC46823IZf
    public final void LJIILJJIL(EnumC47177IfN enumC47177IfN, int i) {
        IX5 ix5 = this.LIZ;
        String str = ix5.LJI;
        ix5.LJJIFFI.LIZ(new ARunnableS3S1201000_8(ix5.LJJII, str, i, enumC47177IfN, 1));
    }

    @Override // X.InterfaceC46823IZf
    public final void LJIILLIIL(int i, long j) {
        IX5 ix5 = this.LIZ;
        String str = ix5.LJI;
        ix5.LJJIFFI.LIZ(new RunnableC46326IGc(ix5.LJJII, j, str, i));
    }

    @Override // X.InterfaceC46823IZf
    public final void LIZJ(int i, int i2, String str) {
        IX5 ix5 = this.LIZ;
        OnUIPlayListener onUIPlayListener = ix5.LJJII;
        String str2 = ix5.LJI;
        ix5.LJJIFFI.LIZ(new ARunnableS7S1200000_8(new ITW(), onUIPlayListener, str2, 7));
    }

    @Override // X.InterfaceC46823IZf
    public final void LJIIIZ(int i, int i2, Object obj, java.util.Map map) {
        boolean z;
        int i3;
        boolean z2;
        IZL izl;
        IX5 ix5 = this.LIZ;
        if (ix5.LJJIJL) {
            IX4 ix4 = ix5.LJ;
            if (ix4 != null) {
                ix4.LJJ = false;
                return;
            }
            return;
        }
        ITZ itz = ix5.LIZLLL;
        ITZ itz2 = ITZ.Ijk;
        if ((itz == itz2 || ((izl = ix5.LIZIZ) != null && izl.LLFII.LJLJI)) && i == -10000 && (i2 == -1000 || i2 == -2000)) {
            z = true;
        } else {
            z = false;
            C35660Dz6.LIZIZ.LIZIZ(ix5.LJII, "player_on_failed");
            IX5 ix52 = this.LIZ;
            IPG ipg = new IPG(ix52.LJIIIIZZ, i, i2, obj, ix52.LJI);
            ipg.LJIIJ = map;
            C46673ITl c46673ITl = ix52.LIZ;
            if (c46673ITl.LIZ != c46673ITl.LIZIZ) {
                z2 = true;
            } else {
                z2 = false;
            }
            ipg.LJII = z2;
            ipg.LIZLLL = ix52.LJIIIZ;
            ipg.LJIIIIZZ = ix52.LJIILLIIL() ? 1 : 0;
            ipg.LJIIIZ = IX5.LJJJI.get();
            IX5 ix53 = this.LIZ;
            this.LIZ.LJJIFFI.LIZ(new ARunnableS5S1300000_8(ix53.LJJII, ipg, ix53.LJI, ix53.LJIIIZ(), 3));
        }
        IZL izl2 = this.LIZ.LIZIZ;
        if (izl2 != null) {
            izl2.LJLJJI(null);
            this.LIZ.LIZIZ.LJJLIIIJILLIZJL();
            IX5 ix54 = this.LIZ;
            ix54.LIZIZ = null;
            ix54.LIZJ.set(null);
            this.LIZ.LJIIZILJ = 0;
        }
        IX5 ix55 = this.LIZ;
        ix55.LJIJ = -1L;
        ix55.LJIJI = -1L;
        if (z && (i3 = ix55.LJIILJJIL) < 10) {
            ix55.LJIILJJIL = i3 + 1;
            C35660Dz6.LIZIZ.LIZIZ(ix55.LJII, "player_try_play");
            IX5 ix56 = this.LIZ;
            ix56.LIZLLL = itz2;
            ix56.LJIJI(ix56.LJ, ix56.LJI, ix56.LJIIJJI, 0L, false);
            IX5 ix57 = this.LIZ;
            OnUIPlayListener onUIPlayListener = ix57.LJJII;
            if (onUIPlayListener != null) {
                String str = ix57.LJI;
                IPG ipg2 = new IPG(ix57.LJIIIIZZ, i, i2, obj, str);
                ipg2.LIZLLL = ix57.LJIIIZ;
                ix57.LJJIFFI.LIZ(new ARunnableS7S1200000_8(ipg2, onUIPlayListener, str, 11));
            }
        }
    }

    @Override // X.InterfaceC46823IZf
    public final void onFrameAboutToBeRendered(int i, long j, long j2, java.util.Map<Integer, String> map) {
        IX5 ix5 = this.LIZ;
        OnUIPlayListener onUIPlayListener = ix5.LJJII;
        if (onUIPlayListener != null) {
            ix5.LJJIFFI.LIZ(new IGX(onUIPlayListener, i, j, j2, map));
        }
    }
}
