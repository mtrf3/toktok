package X;

import Y.ARunnableS0S0300200_8;
import Y.ARunnableS12S0101000_8;
import Y.ARunnableS5S1300000_8;
import Y.ARunnableS7S1200000_8;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.ss.android.ugc.aweme.experiment.TrimMemorySettingParam;
import com.ss.android.ugc.aweme.player.sdk.api.OnPlayerPreparedListener;
import com.ss.android.ugc.aweme.player.sdk.api.OnPreRenderListener;
import com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import com.ss.android.ugc.playerkit.radar.SimRadar;
import com.ss.android.ugc.playerkit.simapicommon.model.SimAudioBitrate;
import com.ss.android.ugc.playerkit.simapicommon.reporter.IMonitor;
import defpackage.i0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public class IX5 implements InterfaceC46747IWh {
    public static final AtomicInteger LJJJI = new AtomicInteger(0);
    public static int LJJJIL = 0;
    public final C46673ITl LIZ;
    public IZL LIZIZ;
    public final AtomicReference<IX9> LIZJ;
    public ITZ LIZLLL;
    public IX4 LJ;
    public volatile Surface LJFF;
    public String LJI;
    public String LJII;
    public int LJIIIIZZ;
    public boolean LJIIIZ;
    public boolean LJIIJ;
    public boolean LJIIJJI;
    public boolean LJIIL;
    public int LJIILIIL;
    public int LJIILJJIL;
    public boolean LJIILL;
    public boolean LJIILLIIL;
    public int LJIIZILJ;
    public long LJIJ;
    public long LJIJI;
    public long LJIJJ;
    public final AtomicBoolean LJIJJLI;
    public InterfaceC46832IZo LJIL;
    public InterfaceC46942Iba LJJ;
    public C46543IOl LJJI;
    public final IX8 LJJIFFI;
    public OnUIPlayListener LJJII;
    public OnPreRenderListener LJJIII;
    public OnPlayerPreparedListener LJJIIJ;
    public ITX LJJIIJZLJL;
    public IVM LJJIIZ;
    public ITS LJJIIZI;
    public String LJJIJ;
    public String LJJIJIIJI;
    public long LJJIJIIJIL;
    public boolean LJJIJIL;
    public boolean LJJIJL;
    public boolean LJJIJLIJ;
    public final ITF LJJIL;
    public final ARunnableS12S0101000_8 LJJIZ;
    public boolean LJJJ;

    public IX5() {
        throw null;
    }

    public final IX9 LJIIJJI() {
        Object value = IZ8.LLLIZZ.getValue();
        o.LJIIIIZZ(value, "<get-COLD_BOOT_VIDEO_PLAYER_LOCK_DEGRADE>(...)");
        if (!((Boolean) value).booleanValue() || IZA.LIZLLL) {
            return this.LIZJ.get();
        }
        return this.LIZIZ;
    }

    public void LJIIZILJ(int i) {
    }

    public void LJIJ(boolean z) {
    }

    @Override // X.InterfaceC46747IWh
    public final void LJJJLIIL() {
    }

    @Override // X.InterfaceC46747IWh
    public final void LJJJLZIJ(int i) {
    }

    @Override // X.InterfaceC46747IWh
    public final void LJJJZ() {
    }

    @Override // X.InterfaceC46747IWh
    public final void LJJLI() {
        this.LJIIZILJ = 0;
        if (IXB.LIZ) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("SimplifyPlayerImpl, clearStatus, mStatus:");
            LIZ.append(this.LJIIZILJ);
            LIZ.append(", prepareOnly:");
            LIZ.append(this.LJJIJL);
            IXB.LIZ(X1D.LIZIZ(LIZ));
        }
    }

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
    public final /* synthetic */ void LJLJI(IWT iwt) {
    }

    @Override // X.InterfaceC46747IWh
    public final void LJLJLJ(InterfaceC46754IWo interfaceC46754IWo) {
    }

    @Override // X.InterfaceC46747IWh
    public final void LJLJLLL(int i, int i2) {
    }

    public final IPH LJIIIZ() {
        long j;
        boolean z;
        String str = this.LJI;
        if (str == null) {
            str = "";
        }
        IZL izl = this.LIZIZ;
        if (izl != null) {
            j = izl.LJJJJIZL();
        } else {
            j = -1;
        }
        IX4 ix4 = this.LJ;
        if (ix4 != null && ix4.LLD) {
            z = true;
        } else {
            z = false;
        }
        IPH iph = new IPH(this.LJIIIIZZ, j, str, z);
        iph.LJII = isMute();
        IX4 ix42 = this.LJ;
        if (ix42 != null) {
            IXY LIZJ = ix42.LIZJ();
            if (LIZJ != null) {
                Object obj = LIZJ.LIZ;
                if (obj instanceof String) {
                    iph.LJIIIZ = Math.max(C30581Hy.LJFF((String) obj), -1);
                }
            }
            IZG izg = this.LJ.LJIJJ;
            if (izg != null) {
                iph.LIZ(izg.getStrategyTokens());
            }
        }
        return iph;
    }

    public final void LJIILJJIL() {
        ITX itx = this.LJJIIJZLJL;
        if (itx != null) {
            C47282Ih4 playerConfig = IUA.LIZ.LIZ().getPlayerConfig(this.LIZLLL, false, ((AbstractC46753IWn) itx).LIZ);
            boolean z = playerConfig.LIZJ;
            if (playerConfig.LIZIZ == ITZ.TT_HARDWARE) {
                z = true;
            }
            IZL izl = new IZL(playerConfig.LIZ, z, playerConfig.LJFF, playerConfig.LJI, playerConfig);
            TrimMemorySettingParam trimMemorySettingParam = (TrimMemorySettingParam) i0.LJ(true, "trim_memory_in_activity_settings", 31744, TrimMemorySettingParam.class, null);
            if (trimMemorySettingParam != null && trimMemorySettingParam.enable) {
                synchronized (C38797FKn.LIZIZ) {
                    Iterator it = ((ArrayList) C38797FKn.LIZ).iterator();
                    while (it.hasNext()) {
                        if (((WeakReference) it.next()).get() == null) {
                            it.remove();
                        }
                    }
                    ((ArrayList) C38797FKn.LIZ).add(new WeakReference(izl));
                }
            }
            this.LIZIZ = izl;
            if (IXB.LIZ) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(", initPlayer, create mPlayer = ");
                LIZ.append(this.LIZIZ);
                LIZ.append(", mSurface = ");
                LIZ.append(this.LJFF);
                IXB.LIZIZ("SimplifyPlayerImpl", X1D.LIZIZ(LIZ));
            }
            this.LIZJ.set(this.LIZIZ);
        }
        this.LIZIZ.LJJLJ(this.LJIL);
        this.LIZIZ.LJJZZIII(this.LJJ);
        this.LIZIZ.LJJZZI(this.LJJI);
        this.LIZIZ.LLD.LJLJJI = new C46662ITa(this);
        this.LIZIZ.LJLLLLLL = new ITG(this);
    }

    public final boolean LJIILLIIL() {
        IX4 ix4 = this.LJ;
        if (ix4 == null) {
            return true;
        }
        if (ix4.LJJJJZI != null) {
            return false;
        }
        IXY ixy = ix4.LJJIJIIJI;
        if (ixy != null) {
            Object obj = ixy.LIZ;
            if ((obj instanceof String) && !TextUtils.isEmpty((String) obj)) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJ() {
        /*
            r9 = this;
            X.IZL r0 = r9.LIZIZ
            if (r0 == 0) goto L59
            X.IX4 r1 = r9.LJ
            if (r1 == 0) goto L59
            boolean r0 = r1.LJLIL
            if (r0 == 0) goto L59
            java.util.List r0 = r1.LIZIZ()
            r3 = 1
            if (r0 == 0) goto Ld3
            X.IX4 r0 = r9.LJ
            java.util.List r0 = r0.LIZIZ()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto Ld3
            X.5H3 r0 = X.IZ8.i0
            java.lang.Object r1 = r0.getValue()
            java.lang.String r0 = "<get-optPlayerSubtitleFormatConversion>(...)"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r0 = r1.booleanValue()
            if (r0 == 0) goto Lc7
            X.IX4 r4 = r9.LJ
            java.util.List r1 = r4.LIZIZ()
            if (r1 == 0) goto L40
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L60
        L40:
            r1 = 0
        L41:
            r4.LJLJJI = r1
            X.IZL r2 = r9.LIZIZ
            X.IX4 r0 = r9.LJ
            int r1 = r0.LJLILLLLZI
            org.json.JSONObject r0 = r0.LJLJJI
            r2.LJLIL(r1, r0)
        L4e:
            X.IX4 r0 = r9.LJ
            boolean r0 = r0.LJLIIL
            if (r0 == 0) goto L5a
            X.IZL r0 = r9.LIZIZ
            r0.LJLJI()
        L59:
            return
        L5a:
            X.IZL r0 = r9.LIZIZ
            r0.LJLI(r3)
            goto L59
        L60:
            org.json.JSONArray r5 = new org.json.JSONArray
            r5.<init>()
            java.util.Iterator r8 = r1.iterator()
        L69:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto Lb6
            java.lang.Object r7 = r8.next()
            X.IQU r7 = (X.IQU) r7
            if (r7 == 0) goto L69
            org.json.JSONObject r6 = new org.json.JSONObject
            r6.<init>()
            java.lang.String r1 = "id"
            int r0 = r7.LIZ     // Catch: org.json.JSONException -> Lae
            r6.put(r1, r0)     // Catch: org.json.JSONException -> Lae
            java.lang.String r1 = "language"
            java.lang.String r0 = r7.LIZIZ     // Catch: org.json.JSONException -> Lae
            r6.put(r1, r0)     // Catch: org.json.JSONException -> Lae
            java.lang.String r2 = "language_id"
            long r0 = r7.LIZJ     // Catch: org.json.JSONException -> Lae
            r6.put(r2, r0)     // Catch: org.json.JSONException -> Lae
            java.lang.String r1 = "url"
            java.lang.Object r0 = r7.LIZLLL     // Catch: org.json.JSONException -> Lae
            r6.put(r1, r0)     // Catch: org.json.JSONException -> Lae
            java.lang.String r2 = "expire"
            long r0 = r7.LJ     // Catch: org.json.JSONException -> Lae
            r6.put(r2, r0)     // Catch: org.json.JSONException -> Lae
            java.lang.String r1 = "format"
            java.lang.String r0 = r7.LJFF     // Catch: org.json.JSONException -> Lae
            r6.put(r1, r0)     // Catch: org.json.JSONException -> Lae
            java.lang.String r1 = "sub_id"
            int r0 = r7.LJI     // Catch: org.json.JSONException -> Lae
            r6.put(r1, r0)     // Catch: org.json.JSONException -> Lae
            goto Lb2
        Lae:
            r0 = move-exception
            X.C16880lQ.LLLLIIL(r0)
        Lb2:
            r5.put(r6)
            goto L69
        Lb6:
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            java.lang.String r0 = "list"
            r1.put(r0, r5)     // Catch: org.json.JSONException -> Lc1
            goto L41
        Lc1:
            r0 = move-exception
            X.C16880lQ.LLLLIIL(r0)
            goto L41
        Lc7:
            X.IX4 r1 = r9.LJ
            java.util.List r0 = r1.LIZIZ()
            java.lang.String r0 = X.IQU.LIZ(r0)
            r1.LJLJI = r0
        Ld3:
            X.IZL r2 = r9.LIZIZ
            X.IX4 r0 = r9.LJ
            int r1 = r0.LJLILLLLZI
            java.lang.String r0 = r0.LJLJI
            r2.LJLIIL(r1, r0)
            goto L4e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.IX5.LJJ():void");
    }

    @Override // X.InterfaceC46747IWh
    public final void LJJL() {
        if (IXB.LIZ) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("SimplifyPlayerImpl, sleep()");
            LIZ.append(LJIIJ());
            IXB.LIZ(X1D.LIZIZ(LIZ));
        }
        this.LJJJ = false;
        IZL izl = this.LIZIZ;
        if (izl != null) {
            String str = this.LJI;
            long LJJJJI = izl.LJJJJI();
            if (str != null) {
                IUH.LIZIZ.put(str, Long.valueOf(LJJJJI));
            }
            pause();
            this.LIZIZ.LJLJJLL();
            this.LJIIZILJ = 6;
            this.LJJIII = null;
            IX4 ix4 = this.LJ;
            if (ix4 != null) {
                ix4.LIZIZ = null;
            }
        }
    }

    @Override // X.InterfaceC46747IWh
    public final void LJJLIL() {
        int i;
        boolean z;
        if (IXB.LIZ) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("SimplifyPlayerImpl, render(), mSurface = ");
            LIZ.append(this.LJFF);
            LIZ.append(", mPlayer = ");
            LIZ.append(this.LIZIZ);
            LIZ.append(" mStatus = ");
            LIZ.append(this.LJIIZILJ);
            LIZ.append(", mPrepareOnly:");
            LIZ.append(this.LJJIJL);
            LIZ.append("isRenderPrepareEnabled:");
            IZL izl = this.LIZIZ;
            if (izl != null && izl.LJLJJI.LJJIJIL) {
                z = true;
            } else {
                z = false;
            }
            LIZ.append(z);
            IXB.LIZ(X1D.LIZIZ(LIZ));
        }
        if (this.LJJIJL) {
            return;
        }
        this.LJIIJJI = true;
        IZL izl2 = this.LIZIZ;
        if (izl2 != null && izl2.LJLJJI.LJJIJIL && (i = this.LJIIZILJ) != 1 && i != 2 && i != 5 && i != 6 && i != 3) {
            LJIJI(this.LJ, this.LJI, true, 0L, false);
        } else if (this.LJIIZILJ == 2) {
            start();
        }
    }

    @Override // X.InterfaceC46747IWh
    public final void LJLJJL() {
        float f;
        Object value = IZ8.h1.getValue();
        o.LJIIIIZZ(value, "<get-optimizeProgressUpdateRunnable>(...)");
        if (((Boolean) value).booleanValue()) {
            this.LJJIFFI.LIZ(this.LJJIZ);
            return;
        }
        long currentPosition = getCurrentPosition();
        long duration = getDuration();
        if (duration == 0) {
            f = 0.0f;
        } else {
            f = (((float) currentPosition) * 100.0f) / ((float) duration);
        }
        String str = this.LJI;
        this.LJJIFFI.LIZ(new IGS(this.LJJII, f, str, currentPosition, duration));
    }

    @Override // X.InterfaceC46747IWh
    public final void LJLLILLLL() {
        if (this.LIZIZ != null) {
            SimRadar.keyScan("SimplifyPlayerImpl", "initDecoder", this);
            this.LIZIZ.LJJIJL();
        }
    }

    @Override // X.InterfaceC46747IWh
    public final String LJLLL() {
        IZL izl = this.LIZIZ;
        if (izl != null) {
            return izl.LJLJL;
        }
        return null;
    }

    @Override // X.InterfaceC46747IWh
    public final boolean LJLZ() {
        IZL izl = this.LIZIZ;
        if (izl != null) {
            return izl.LJLJLJ();
        }
        return false;
    }

    @Override // X.InterfaceC46747IWh
    public final long getCurrentPosition() {
        IZL izl;
        if (this.LJIILLIIL || (izl = this.LIZIZ) == null) {
            return -1L;
        }
        return izl.LJJJJI();
    }

    @Override // X.InterfaceC46747IWh
    public final long getDuration() {
        IZL izl;
        if (this.LJIILLIIL || (izl = this.LIZIZ) == null) {
            return -1L;
        }
        return izl.LJJJJIZL();
    }

    @Override // X.InterfaceC46747IWh
    public final int getWatchedDuration() {
        IZL izl = this.LIZIZ;
        if (izl != null) {
            return izl.LJJJJLL();
        }
        return -1;
    }

    @Override // X.InterfaceC46747IWh
    public final void init() {
        C62822Ol8 c62822Ol8 = DSG.LJIIJJI;
        if (((Boolean) c62822Ol8.getValue()).booleanValue()) {
            C79004UzY.LJJJJJL();
        }
        if (this.LIZIZ == null) {
            LJIILJJIL();
            IZL izl = this.LIZIZ;
            if (izl != null) {
                izl.LJJJJZ();
            }
            this.LJJIJIL = true;
        }
        if (((Boolean) c62822Ol8.getValue()).booleanValue()) {
            C79004UzY.LJJJJJ();
        }
    }

    @Override // X.InterfaceC46747IWh
    public final boolean isLoading() {
        IZL izl = this.LIZIZ;
        if (izl != null) {
            return izl.LJJJJZI();
        }
        return false;
    }

    @Override // X.InterfaceC46747IWh
    public final boolean isPaused() {
        IZL izl = this.LIZIZ;
        if (izl != null) {
            return izl.LJJJLIIL();
        }
        return false;
    }

    @Override // X.InterfaceC46747IWh
    public final boolean isPlaying() {
        IZL izl = this.LIZIZ;
        if (izl != null) {
            return izl.LJJJLL();
        }
        return false;
    }

    @Override // X.InterfaceC46747IWh
    public final void pause() {
        int i;
        if (IXB.LIZ) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("SimplifyPlayerImpl, pause()");
            LIZ.append(LJIIJ());
            IXB.LIZ(X1D.LIZIZ(LIZ));
        }
        this.LJJJ = false;
        IZL izl = this.LIZIZ;
        if (izl != null && (i = this.LJIIZILJ) <= 5 && i != 0) {
            ITZ itz = this.LIZLLL;
            if ((itz != ITZ.Ijk && itz != ITZ.IjkHardware) || izl.LJJJLL()) {
                this.LIZIZ.LJJL();
                OnUIPlayListener onUIPlayListener = this.LJJII;
                if (onUIPlayListener != null && this.LJIIZILJ <= 5) {
                    String str = this.LJI;
                    this.LJJIFFI.LIZ(new IGR(onUIPlayListener, LJIIIZ(), System.currentTimeMillis(), SystemClock.elapsedRealtime(), str));
                }
            }
            if (this.LJIIZILJ == 1 && !this.LJJIJIL) {
                this.LJIIJ = true;
            }
            this.LJIIZILJ = 5;
        }
    }

    @Override // X.InterfaceC46747IWh
    public final void release() {
        if (IXB.LIZ) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("SimplifyPlayerImpl, release()");
            LIZ.append(LJIIJ());
            IXB.LIZ(X1D.LIZIZ(LIZ));
        }
        stop();
        IZL izl = this.LIZIZ;
        if (izl != null) {
            this.LJIILLIIL = true;
            izl.LJJLIIIJILLIZJL();
            this.LJIILLIIL = false;
            this.LJIJJLI.getAndSet(false);
            this.LIZIZ = null;
            this.LIZJ.set(null);
            this.LJIIZILJ = 7;
            this.LJJIJLIJ = false;
            this.LJJIII = null;
            IX4 ix4 = this.LJ;
            if (ix4 != null) {
                ix4.LIZIZ = null;
            }
            AtomicInteger atomicInteger = LJJJI;
            atomicInteger.decrementAndGet();
            C46664ITc.LJIJ.LJIIZILJ = atomicInteger.get();
        }
    }

    @Override // X.InterfaceC46747IWh
    public final void resume() {
        boolean z;
        IZL izl;
        if (IXB.LIZ) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("SimplifyPlayerImpl, resume()");
            LIZ.append(LJIIJ());
            LIZ.append(", isPrepare2Pause =");
            LIZ.append(this.LJIIJ);
            LIZ.append(" mSurfaceChanged = ");
            LIZ.append(this.LJIILL);
            LIZ.append(", mPrepareOnly:");
            LIZ.append(this.LJJIJL);
            IXB.LIZ(X1D.LIZIZ(LIZ));
        }
        if (this.LJJIJL) {
            SimRadar.keyScan("SimplifyPlayerImpl", "resume-prepareOnly", this.LJI);
            return;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("status:");
        LIZ2.append(C76965UIn.LJ(this.LJIIZILJ));
        SimRadar.keyScan("SimplifyPlayerImpl", "resume", X1D.LIZIZ(LIZ2), this.LJI);
        int i = this.LJIIZILJ;
        if (i < 2 || i > 5 || this.LJIIJ) {
            IX4 ix4 = this.LJ;
            String str = this.LJI;
            if (IXN.LIZJ.isCallbackCompletionFix() && ix4 != null) {
                if (!TextUtils.isEmpty(ix4.LJIIIZ)) {
                    Iterator it = ((CopyOnWriteArraySet) ITV.LIZJ.LIZ).iterator();
                    while (it.hasNext()) {
                        ((IUK) it.next()).accept(ix4);
                    }
                    CopyOnWriteArraySet copyOnWriteArraySet = (CopyOnWriteArraySet) ((ConcurrentHashMap) ITV.LIZJ.LIZIZ).get(ix4.LJIIIZ);
                    if (copyOnWriteArraySet != null) {
                        Iterator it2 = copyOnWriteArraySet.iterator();
                        while (it2.hasNext()) {
                            ((IUK) it2.next()).accept(ix4);
                        }
                    }
                }
                if (ix4.LJJIJ && this.LJJII != null) {
                    long currentTimeMillis = System.currentTimeMillis();
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    IPH iph = new IPH(ix4.LJIIIZ);
                    IZG izg = ix4.LJIJJ;
                    if (izg != null) {
                        iph.LIZ(izg.getStrategyTokens());
                    }
                    iph.LJII = isMute();
                    this.LJJIFFI.LIZ(new ARunnableS0S0300200_8(ix4, this, iph, currentTimeMillis, elapsedRealtime, 1));
                }
            }
            LJIJI(ix4, str, true, 0L, false);
            this.LJIIJ = false;
        } else {
            IX4 ix42 = this.LJ;
            if (ix42 != null && ix42.LJJJJJ) {
                z = true;
            } else {
                z = false;
            }
            if (this.LJIILL && (izl = this.LIZIZ) != null && Build.VERSION.SDK_INT < 26 && izl.LLFII.LJLJI && !z) {
                ix42.LJJJJJL = true;
                LJIJI(ix42, this.LJI, true, izl.LJJJJI(), true);
            } else {
                this.LJIIZILJ = 2;
                LJI(IXN.LIZJ.getVideoEffectInfo(this.LJI));
                start();
            }
        }
        this.LJJIFFI.LIZ(new ARunnableS7S1200000_8(LJIIIZ(), this.LJJII, this.LJI, 12));
    }

    @Override // X.InterfaceC46747IWh
    public final void start() {
        IX4 ix4;
        Surface surface;
        IZL izl;
        JSONObject jSONObject;
        if (IXB.LIZ) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("SimplifyPlayerImpl, start()");
            LIZ.append(LJIIJ());
            LIZ.append(", mPrepareOnly:");
            LIZ.append(this.LJJIJL);
            IXB.LIZ(X1D.LIZIZ(LIZ));
        }
        if (!this.LJJIJL && this.LIZIZ != null && this.LJIIZILJ == 2) {
            if ((this.LJFF != null && this.LJFF.isValid()) || ((ix4 = this.LJ) != null && !ix4.LJIILLIIL)) {
                if (IXB.LIZ) {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("SimplifyPlayerImpl, start surface = ");
                    LIZ2.append(this.LJFF);
                    LIZ2.append(", mSimplifyPlayer = ");
                    LIZ2.append(this.LIZIZ);
                    IXB.LIZ(X1D.LIZIZ(LIZ2));
                }
                C46673ITl c46673ITl = this.LIZ;
                Surface surface2 = this.LJFF;
                if (surface2 != null) {
                    c46673ITl.getClass();
                    c46673ITl.LIZIZ = surface2.hashCode();
                }
                if (c46673ITl.LIZ != c46673ITl.LIZIZ && !IZ8.LJIIIZ() && C46763IWx.LIZ.LIZ != null) {
                    C46674ITm c46674ITm = new C46674ITm();
                    c46674ITm.LIZ.put("prepare_hash", Integer.valueOf(c46673ITl.LIZ));
                    c46674ITm.LIZ.put("start_hash", Integer.valueOf(c46673ITl.LIZIZ));
                    synchronized (c46674ITm) {
                        try {
                            jSONObject = new JSONObject(c46674ITm.LIZ);
                        } catch (Exception e) {
                            C16880lQ.LLLLIIL(e);
                            jSONObject = null;
                        }
                    }
                    IMonitor iMonitor = ((C46755IWp) C46763IWx.LIZ.LIZ).LIZ;
                    if (iMonitor != null) {
                        iMonitor.monitorCommonLog("player_surface_diff", jSONObject);
                    }
                }
                Object value = IZ8.W.getValue();
                o.LJIIIIZZ(value, "<get-tryFixDuplicateSetSurface>(...)");
                if (!((Boolean) value).booleanValue() || (izl = this.LIZIZ) == null || izl.LJJJJL() == null || !this.LIZIZ.LJJJJL().isValid() || this.LIZIZ.LJJJJL() != this.LJFF) {
                    this.LIZIZ.LJLJJI(this.LJFF);
                }
                IZL izl2 = this.LIZIZ;
                if (izl2.LJLILLLLZI.indexOfKey(7) >= 0) {
                    izl2.LJLJJL.LJLLLL(210, 0);
                }
                if (IXB.LIZ) {
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append("TTPlayer, start mPlayer = ");
                    LIZ3.append(izl2.LJLJJL);
                    LIZ3.append(", surface = ");
                    if (izl2.LJLLL) {
                        surface = izl2.LJLLJ;
                    } else {
                        surface = izl2.LJLLILLLL;
                    }
                    LIZ3.append(surface);
                    IXB.LIZ(X1D.LIZIZ(LIZ3));
                }
                StringBuilder LIZ4 = X1D.LIZ();
                LIZ4.append("VIDEO@");
                LIZ4.append(izl2.LJLL);
                SimRadar.traceGroup(X1D.LIZIZ(LIZ4)).LIZ("TTPlay-TTStop").LIZJ();
                StringBuilder LIZ5 = X1D.LIZ();
                LIZ5.append("VIDEO@");
                LIZ5.append(izl2.LJLL);
                SimRadar.traceGroup(X1D.LIZIZ(LIZ5)).LIZ("TTPlay-FirstFrame").LIZJ();
                izl2.LLIFFJFJJ.LJIIL();
                izl2.LJLJJL.LJLLLL(100, 1);
                C46882Iac c46882Iac = izl2.LJLJJL;
                c46882Iac.LJJIII = false;
                c46882Iac.LJJLI();
                izl2.LLIFFJFJJ.LJJII();
                this.LJIIZILJ = 3;
                this.LJJJ = false;
                return;
            }
            if (IXB.LIZ) {
                IXB.LIZ("SimplifyPlayerImpl, call start later when surface is available");
            }
            SimRadar.warnScan("SimplifyPlayerImpl", "start", "Surface-Invalid");
            this.LJJJ = true;
        }
    }

    @Override // X.InterfaceC46747IWh
    public final boolean LIZLLL() {
        IX9 LJIIJJI = LJIIJJI();
        if (LJIIJJI != null && LJIIJJI.LIZLLL()) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC46747IWh
    public final C38798FKo LJ() {
        IX9 LJIIJJI = LJIIJJI();
        if (LJIIJJI != null) {
            return LJIIJJI.LJ();
        }
        return null;
    }

    public final String LJIIJ() {
        Object obj;
        String name = C16880lQ.LLLLIIIILLL().getName();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(" ");
        Object obj2 = this.LIZIZ;
        if (obj2 == null) {
            obj2 = "mPlayer = null";
        }
        LIZ.append(obj2);
        LIZ.append(", ");
        if (this.LJFF == null) {
            obj = "mSurface = null";
        } else {
            obj = this.LJFF;
        }
        LIZ.append(obj);
        LIZ.append(", ");
        LIZ.append(C76965UIn.LJ(this.LJIIZILJ));
        LIZ.append(", ");
        String str = this.LJI;
        if (str == null) {
            str = "mSourceId = null";
        }
        LIZ.append(str);
        LIZ.append(", mUrlKey=");
        return C025908h.LIZIZ(LIZ, this.LJJIJ, ", mThreadName = ", name, LIZ);
    }

    @Override // X.InterfaceC46747IWh
    public final void LJJLIIIJL() {
        IX9 LJIIJJI = LJIIJJI();
        if (LJIIJJI != null) {
            LJIIJJI.setLooping(true);
        }
    }

    @Override // X.InterfaceC46747IWh
    public final ITI getVideoInfo() {
        IX9 LJIIJJI = LJIIJJI();
        if (LJIIJJI != null) {
            return LJIIJJI.getVideoInfo();
        }
        return null;
    }

    @Override // X.InterfaceC46747IWh
    public final boolean isMute() {
        IX9 LJIIJJI = LJIIJJI();
        if (LJIIJJI != null && (LJIIJJI.isMute() || LJIIJJI.LJJ() <= 0.0f)) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC46747IWh
    public final void stop() {
        if (DSR.LIZIZ()) {
            C79004UzY.LJJJJJL();
        }
        if (IXB.LIZ) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("SimplifyPlayerImpl, stop()");
            LIZ.append(LJIIJ());
            IXB.LIZ(X1D.LIZIZ(LIZ));
        }
        this.LJJJ = false;
        if (this.LJIIZILJ != 6 && this.LIZIZ != null) {
            pause();
            this.LIZIZ.LJLJL();
            this.LJIIZILJ = 6;
            this.LJJIII = null;
            IX4 ix4 = this.LJ;
            if (ix4 != null) {
                ix4.LIZIZ = null;
            }
        }
        if (DSR.LIZIZ()) {
            C79004UzY.LJJJJJ();
        }
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SimplifyPlayerImpl{");
        LIZ.append(LJIIJ());
        LIZ.append("}");
        return X1D.LIZIZ(LIZ);
    }

    @Override // X.InterfaceC46747IWh
    public final int LJLJJLL() {
        return this.LJIILIIL;
    }

    @Override // X.InterfaceC46747IWh
    public final ITZ getPlayerType() {
        return this.LIZLLL;
    }

    @Override // X.InterfaceC46747IWh
    public final int getState() {
        return this.LJIIZILJ;
    }

    public IX5(ITZ itz) {
        this.LIZ = new C46673ITl();
        this.LJI = "";
        this.LJIJI = -1L;
        this.LJIJJ = -1L;
        this.LJIJJLI = new AtomicBoolean(false);
        this.LJJJ = false;
        this.LJJIFFI = new IX8(C16880lQ.LLJJJJ());
        this.LIZLLL = itz;
        this.LIZJ = new AtomicReference<>(null);
        this.LJJIL = new ITF();
        LJJJI.incrementAndGet();
        this.LJJIZ = new ARunnableS12S0101000_8(3, this, 25);
    }

    @Override // X.InterfaceC46747IWh
    public final void LIZ(String str) {
        IX9 LJIIJJI = LJIIJJI();
        if (LJIIJJI != null) {
            LJIIJJI.LIZ(str);
        }
    }

    @Override // X.InterfaceC46747IWh
    public final float LIZIZ(int i) {
        IX9 LJIIJJI = LJIIJJI();
        if (this.LJIILLIIL || LJIIJJI == null) {
            return -1.0f;
        }
        return LJIIJJI.LIZIZ(i);
    }

    @Override // X.InterfaceC46747IWh
    public final <T> T LIZJ(IU1<T> iu1) {
        IX9 LJIIJJI = LJIIJJI();
        if (this.LJIILLIIL || LJIIJJI == null) {
            return (T) iu1.LIZ();
        }
        return (T) LJIIJJI.LIZJ(iu1);
    }

    @Override // X.InterfaceC46747IWh
    public final void LJFF(float f) {
        if (IXB.LIZ) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("setPlaySpeed mPlayer = ");
            LIZ.append(this.LIZIZ);
            LIZ.append(", playSpeed = ");
            LIZ.append(f);
            IXB.LIZIZ("SimplifyPlayerImpl", X1D.LIZIZ(LIZ));
        }
        IX9 LJIIJJI = LJIIJJI();
        if (LJIIJJI != null) {
            LJIIJJI.LJFF(f);
        }
    }

    @Override // X.InterfaceC46747IWh
    public final void LJI(C74152vb c74152vb) {
        IZL izl = this.LIZIZ;
        if (izl != null) {
            izl.LJI(c74152vb);
        }
    }

    public final String LJIIL(IX4 ix4) {
        IXX ixx;
        IXO ixo = ix4.LJJJJZI;
        if (ixo != null) {
            C46914Ib8 c46914Ib8 = ixo.LIZIZ;
            if (c46914Ib8 != null && c46914Ib8.LJ() != null) {
                return ix4.LJJJJZI.LIZIZ.LJ();
            }
            return ix4.LJJJJZI.LJ;
        }
        if (ix4.LIZJ() == null || (ixx = ix4.LIZJ().LIZLLL) == null || TextUtils.isEmpty(ixx.LJ)) {
            return this.LJII;
        }
        return ixx.LJ;
    }

    @Override // X.InterfaceC46747IWh
    public final void LJJIIJ(float f) {
        IZL izl = this.LIZIZ;
        if (izl != null) {
            izl.LJJLIIIJJIZ(f);
        }
    }

    @Override // X.InterfaceC46747IWh
    public final void LJJJLL(OnUIPlayListener onUIPlayListener) {
        this.LJJII = onUIPlayListener;
    }

    @Override // X.InterfaceC46747IWh
    public final void LJJLIIIIJ(InterfaceC46803IYl interfaceC46803IYl) {
        IZL izl = this.LIZIZ;
        if (izl != null) {
            izl.LJLLI(interfaceC46803IYl);
        }
    }

    @Override // X.InterfaceC46747IWh
    public final void LJJLIIIJILLIZJL(int i) {
        IZL izl = this.LIZIZ;
        if (izl != null) {
            izl.LJLJLLL(i);
        }
    }

    @Override // X.InterfaceC46747IWh
    public final void LJJLIIIJJIZ(InterfaceC46826IZi interfaceC46826IZi) {
        IZL izl = this.LIZIZ;
        if (izl != null) {
            izl.LJLLILLLL(interfaceC46826IZi);
        }
    }

    @Override // X.InterfaceC46747IWh
    public final boolean LJJLIIIJLJLI(OnUIPlayListener onUIPlayListener) {
        OnUIPlayListener onUIPlayListener2 = this.LJJII;
        if (onUIPlayListener2 != null && onUIPlayListener2.equals(onUIPlayListener)) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC46747IWh
    public final void LJJLIIIJLLLLLLLZ(int i) {
        IZL izl = this.LIZIZ;
        if (izl != null) {
            izl.LJLL(i);
        }
    }

    @Override // X.InterfaceC46747IWh
    public final String LJJLIIJ(int i) {
        IZL izl = this.LIZIZ;
        if (izl != null) {
            return izl.LJJJJJL(i);
        }
        return "";
    }

    @Override // X.InterfaceC46747IWh
    public final void LJJLJLI(C46755IWp c46755IWp) {
        C46763IWx.LIZ.LIZ = c46755IWp;
    }

    @Override // X.InterfaceC46747IWh
    public final void LJJLL(InterfaceC46942Iba interfaceC46942Iba) {
        this.LJJ = interfaceC46942Iba;
        IZL izl = this.LIZIZ;
        if (izl != null) {
            izl.LJJZZIII(interfaceC46942Iba);
        }
    }

    @Override // X.InterfaceC46747IWh
    public final void LJJZZI(ITX itx) {
        this.LJJIIJZLJL = itx;
    }

    @Override // X.InterfaceC46747IWh
    public final void LJL(Bundle bundle) {
        IZL izl = this.LIZIZ;
        if (izl != null) {
            izl.LJJJ(bundle);
        }
    }

    @Override // X.InterfaceC46747IWh
    public final void LJLI(boolean z) {
        IZL izl = this.LIZIZ;
        if (izl != null) {
            izl.LJLI(z);
        }
    }

    @Override // X.InterfaceC46747IWh
    public final void LJLIIIL(IX4 ix4) {
        String name;
        if (((Boolean) C7CA.LJIIJJI.getValue()).booleanValue() && (name = C16880lQ.LLLLIIIILLL().getName()) != null && !C72952tf.LIZ.containsKey(name)) {
            Iterator<String> it = C72952tf.LIZIZ.iterator();
            while (it.hasNext()) {
                if (ujb.o.LJJJLIIL(name, it.next(), false)) {
                    C72952tf.LIZ.put(name, Integer.valueOf(Process.myTid()));
                }
            }
        }
        C62822Ol8 c62822Ol8 = DSG.LJ;
        if (((Boolean) c62822Ol8.getValue()).booleanValue()) {
            C79004UzY.LJJJJJL();
        }
        if (ix4 == null) {
            SimRadar.errorScan("SimplifyPlayerImpl", "prepare", new C46690IUc("PrepareData-NULL"), new Object[0]);
            SimRadar.analyzer().getClass();
            IVN.LIZIZ("SF-DataNull1");
        } else {
            this.LJJIIZI = ix4.LJIIJJI;
            this.LJII = ix4.LJJIIJ;
            this.LJIILJJIL = 0;
            LJIJI(ix4, ix4.LJIIIZ, ix4.LJIIJ, 0L, false);
        }
        if (((Boolean) c62822Ol8.getValue()).booleanValue()) {
            C79004UzY.LJJJJJ();
        }
    }

    @Override // X.InterfaceC46747IWh
    public final void LJLIIL(InterfaceC46832IZo interfaceC46832IZo) {
        this.LJIL = interfaceC46832IZo;
        IZL izl = this.LIZIZ;
        if (izl != null) {
            izl.LJJLJ(interfaceC46832IZo);
        }
    }

    @Override // X.InterfaceC46747IWh
    public final void LJLIL(EnumC38817FLh enumC38817FLh) {
        IZL izl = this.LIZIZ;
        if (izl != null) {
            izl.LJJIJIL(enumC38817FLh);
        }
    }

    @Override // X.InterfaceC46747IWh
    public final void LJLILLLLZI(String str) {
        if (!TextUtils.isEmpty(str) && str.equals(this.LJI)) {
            resume();
        }
    }

    @Override // X.InterfaceC46747IWh
    public final void LJLJJI(int i) {
        IZL izl = this.LIZIZ;
        if (izl != null) {
            izl.LJJIJIIJIL(i);
        }
    }

    @Override // X.InterfaceC46747IWh
    public final void LJLLI(C46543IOl c46543IOl) {
        this.LJJI = c46543IOl;
        IZL izl = this.LIZIZ;
        if (izl != null) {
            izl.LJJZZI(c46543IOl);
        }
    }

    @Override // X.InterfaceC46747IWh
    public final void LJLLJ(Surface surface) {
        if (DSR.LIZIZ()) {
            C79004UzY.LJJJJJL();
        }
        if (IXB.LIZ) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("SimplifyPlayerImpl, setSurfaceDirectly(), surface = ");
            LIZ.append(surface);
            LIZ.append(", ");
            LIZ.append(LJIIJ());
            IXB.LIZ(X1D.LIZIZ(LIZ));
        }
        IZL izl = this.LIZIZ;
        if (izl != null) {
            izl.LJLJJI(surface);
        }
        if (DSR.LIZIZ()) {
            C79004UzY.LJJJJJ();
        }
    }

    @Override // X.InterfaceC46747IWh
    public final void LJLLLL(IVL ivl) {
        this.LJJIIZ = ivl;
    }

    @Override // X.InterfaceC46747IWh
    public final void LJLLLLLL(InterfaceC47128Iea interfaceC47128Iea) {
        IZL izl = this.LIZIZ;
        if (izl != null) {
            izl.LJJLIIIJLLLLLLLZ(interfaceC47128Iea);
        }
    }

    @Override // X.InterfaceC46747IWh
    public final void setDisplay(SurfaceHolder surfaceHolder) {
        IZL izl = this.LIZIZ;
        if (izl != null) {
            izl.LJJLIIJ(surfaceHolder);
        }
    }

    @Override // X.InterfaceC46747IWh
    public final void setSurface(Surface surface) {
        boolean z = false;
        if (this.LJJIJIL && surface != null) {
            this.LJIILL = false;
            this.LJJIJIL = false;
        } else {
            if (this.LJFF != surface) {
                z = true;
            }
            this.LJIILL = z;
        }
        this.LJFF = surface;
        if (IXB.LIZ) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("SimplifyPlayerImpl, setSurface surface = ");
            LIZ.append(surface);
            LIZ.append(", ");
            LIZ.append(LJIIJ());
            LIZ.append(", callStartAfterSetSurface = ");
            LIZ.append(this.LJJJ);
            IXB.LIZ(X1D.LIZIZ(LIZ));
        }
        if (this.LJJJ && ((Boolean) IZ8.LLZL.getValue()).booleanValue()) {
            if (IXB.LIZ) {
                IXB.LIZ("SimplifyPlayerImpl, call start when surface is available");
            }
            start();
        }
    }

    public static ITI LJIILIIL(IX9 ix9, ITI iti) {
        Object value = IZ8.LLLZZIL.getValue();
        o.LJIIIIZZ(value, "<get-enableOddOpt>(...)");
        if (((Boolean) value).booleanValue()) {
            return iti;
        }
        return ix9.getVideoInfo();
    }

    public final void LJIIIIZZ(IX4 ix4, boolean z) {
        boolean z2;
        InterfaceC47125IeX<Long, Long> interfaceC47125IeX;
        ITF itf = this.LJJIL;
        itf.LIZ = 0;
        itf.LIZIZ = 0;
        this.LJJIJIIJIL = C16880lQ.LLLLIIIILLL().getId();
        this.LJIIIIZZ = 0;
        this.LJIIJ = false;
        this.LJIIJJI = false;
        this.LJIIL = false;
        this.LJIILIIL = 0;
        this.LJIILL = false;
        this.LJIILLIIL = false;
        this.LJJIJLIJ = false;
        this.LJJJ = false;
        this.LJIJJLI.getAndSet(false);
        this.LJ = ix4;
        this.LJIJ = System.currentTimeMillis();
        if (ix4.LJJJJZI != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.LJIIIZ = z2;
        IZL izl = this.LIZIZ;
        if (izl == null) {
            LJIILJJIL();
            return;
        }
        if (ix4.LJJJJI) {
            return;
        }
        if (ix4.LJJJI) {
            izl.LJJL();
            this.LIZIZ.LJLJL();
            this.LIZIZ.LJJLIIIJILLIZJL();
            this.LIZIZ = null;
            this.LIZJ.set(null);
            LJIILJJIL();
            return;
        }
        boolean z3 = ix4.LJJJJJL;
        this.LJIILLIIL = true;
        izl.LJJLIIIJJI(z3);
        this.LJIILLIIL = false;
        this.LJIJJLI.getAndSet(false);
        this.LJIIZILJ = 0;
        this.LJJIJLIJ = false;
        if (IXB.LIZ) {
            IXB.LIZ("SimplifyPlayerImpl, resetPlayer()");
        }
        if (this.LJ != null) {
            Object value = IZ8.LLLLLLZ.getValue();
            o.LJIIIIZZ(value, "<get-UPDATE_AUDIO_ADDR_WHEN_PLAYER_RESET>(...)");
            if (((Boolean) value).booleanValue()) {
                IX4 ix42 = this.LJ;
                if (ix42.LJJLIL && (interfaceC47125IeX = ix42.LLIIII) != null) {
                    ix42.LJJLJ = interfaceC47125IeX.apply(ix42.LJJLJ);
                }
            }
        }
        if (!z) {
            return;
        }
        this.LIZIZ.LJJJZ();
    }

    @Override // X.InterfaceC46747IWh
    public final void LJJLIIIJ(int i, JSONObject jSONObject) {
        IZL izl = this.LIZIZ;
        if (izl != null) {
            izl.LJJIJIIJI(i, jSONObject);
        }
    }

    @Override // X.InterfaceC46747IWh
    public final void LJJZ(int i, Bundle bundle) {
        IZL izl = this.LIZIZ;
        if (izl != null) {
            izl.LJJJI(i, bundle);
        }
    }

    @Override // X.InterfaceC46747IWh
    public final boolean LJLJL(String str, String str2) {
        String str3;
        String str4 = this.LJI;
        if (str4 != null && str4.equals(str) && (str3 = this.LJJIJ) != null && str3.equals(str2)) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC46747IWh
    public final void LJLL(boolean z, Bundle bundle) {
        IZL izl = this.LIZIZ;
        if (izl != null) {
            izl.LJJIZ(z, bundle);
        }
    }

    @Override // X.InterfaceC46747IWh
    public final void setVolume(float f, float f2) {
        if (this.LIZIZ != null) {
            float adjustedVolume = IXN.LIZJ.getAdjustedVolume();
            if (f == 1.0f && f2 == 1.0f && adjustedVolume > 0.0f) {
                this.LIZIZ.LJLJJL(adjustedVolume, adjustedVolume);
            } else {
                this.LIZIZ.LJLJJL(f, f2);
            }
        }
    }

    public final void LJII(IX4 ix4, java.util.Map<String, Object> map, boolean z) {
        int i;
        int i2;
        if (!z) {
            if (map != null) {
                HashMap hashMap = (HashMap) map;
                hashMap.put("is_play_loop", Boolean.valueOf(ix4.LJIIJJI.isPlayLoop()));
                int i3 = ix4.LJJIL;
                if (i3 > 0) {
                    hashMap.put("loop_start_time_ms", Integer.valueOf(i3));
                }
                int i4 = ix4.LJJIZ;
                if (i4 > 0) {
                    hashMap.put("loop_end_time_ms", Integer.valueOf(i4));
                }
                int i5 = ix4.LJZL;
                if (i5 >= 0 && (i2 = ix4.LL) >= 0 && i2 >= i5) {
                    hashMap.put("play_loop_start_time", Integer.valueOf(i5));
                    hashMap.put("play_loop_end_time", Integer.valueOf(ix4.LL));
                    return;
                }
                return;
            }
            return;
        }
        int i6 = ix4.LJZL;
        if (i6 < 0 || (i = ix4.LL) < 0 || i < i6) {
            return;
        }
        this.LIZIZ.LJJZ(i6, i);
    }

    public static void LJIL(IVM ivm, String str, int i, int i2) {
        if (ivm == null || TextUtils.isEmpty(str) || i2 < 0) {
            return;
        }
        IVL ivl = (IVL) ivm;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (i != 3) {
            if (i != 4) {
                return;
            }
            C46650ISo LJIJ = ivl.LIZ.LJIJ(str);
            LJIJ.LIZJ = i2;
            ivl.LIZ.LJJIFFI(str, LJIJ);
            return;
        }
        C46650ISo LJIJ2 = ivl.LIZ.LJIJ(str);
        LJIJ2.LIZLLL = i2;
        ivl.LIZ.LJJIFFI(str, LJIJ2);
    }

    public final void LJIILL(IX4 ix4, java.util.Map<String, Object> map, long j, boolean z) {
        Long l;
        int longValue;
        int i = ix4.LJJIJLIJ;
        if (i > 0) {
            ((HashMap) map).put("init_start_time_ms", Integer.valueOf(i));
        }
        String str = this.LJI;
        if (str == null || (l = IUH.LIZIZ.get(str)) == null) {
            longValue = 0;
        } else {
            longValue = (int) l.longValue();
        }
        IUH.LIZIZ.clear();
        if (longValue > 0) {
            ((HashMap) map).put("init_start_time_ms", Integer.valueOf(longValue));
        }
        if (z && j > 0) {
            ((HashMap) map).put("init_start_time_ms", Integer.valueOf((int) j));
        }
    }

    public final void LJIJJLI(String str, int i, IXY ixy, IXO ixo) {
        boolean z = true;
        SimRadar.errorScan("SimplifyPlayerImpl", "reportEmptyUrlPlayFailed", new IUM("EmptyUrl"), str);
        SimRadar.analyzer().getClass();
        IVN.LIZIZ("PF-1");
        if (this.LJJII != null) {
            Object value = IZ8.LJLLILLLL.getValue();
            o.LJIIIIZZ(value, "<get-enableEmptyUrlReportFailed>(...)");
            if (((Boolean) value).booleanValue()) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("processUrlData", ixy.toString());
                } catch (Throwable unused) {
                }
                IPG ipg = new IPG(i, -203, -203, jSONObject, str);
                if (ixo == null) {
                    z = false;
                }
                ipg.LIZLLL = z;
                ipg.LJIIIIZZ = LJIILLIIL() ? 1 : 0;
                this.LJJIFFI.LIZ(new ARunnableS5S1300000_8(this.LJJII, ipg, str, LJIIIZ(), 1));
            }
        }
    }

    public final void LJIJI(IX4 ix4, String str, boolean z, long j, boolean z2) {
        IX4 ix42;
        if (ix4 == null) {
            SimRadar.errorScan("SimplifyPlayerImpl", "prepare", new C46690IUc("PrepareData-NULL"), new Object[0]);
            SimRadar.analyzer().getClass();
            IVN.LIZIZ("SF-DataNull2");
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (IXB.LIZ) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("SimplifyPlayerImpl, prepare, mStatus:");
            LIZ.append(this.LJIIZILJ);
            LIZ.append(", prepareOnly:");
            LIZ.append(ix4.LJJ);
            IXB.LIZ(X1D.LIZIZ(LIZ));
        }
        this.LJJJ = false;
        this.LJIJJLI.getAndSet(false);
        this.LJJIII = ix4.LIZIZ;
        this.LJJIIJ = ix4.LIZJ;
        int i = this.LJIIZILJ;
        if (i >= 1 && i < 6 && (ix42 = this.LJ) != null && ix42.LJJ && TextUtils.equals(ix4.LJIIIZ, ix42.LJIIIZ)) {
            IX4 ix43 = this.LJ;
            IXY ixy = ix43.LJJIJIIJI;
            if (ixy != null) {
                ix4.LJJIJIIJI = ixy;
            }
            ix4.LJJJJJ = ix43.LJJJJJ;
            int i2 = ix43.LJLLL;
            if (i2 != 0) {
                ix4.LJLLL = i2;
            }
            this.LJJIL.LIZIZ = C16880lQ.LLLLIIIILLL().getPriority();
            this.LJ = ix4;
            this.LJJIJL = ix4.LJJ;
            IXN ixn = IXN.LIZJ;
            if (ixn.isPrerenderSurfaceSlowSetFix() || ix4.LJJJJ) {
                IXB.LIZIZ("SimplifyPlayerImpl", "fix prerender surface slow : setSurface before start");
                if (this.LJ.LJJI != null) {
                    Object value = IZ8.LLZZZIL.getValue();
                    o.LJIIIIZZ(value, "<get-enableSetSurfaceEarlier>(...)");
                    if (((Boolean) value).booleanValue()) {
                        IZL izl = this.LIZIZ;
                        if (izl != null && izl.LJJJJL() != null && this.LIZIZ.LJJJJL().isValid() && this.LIZIZ.LJJJJL() == this.LJFF) {
                            setSurface(this.LJ.LJJI);
                        } else {
                            LJLLJ(this.LJ.LJJI);
                        }
                    } else {
                        setSurface(this.LJ.LJJI);
                    }
                }
            }
            LJII(ix4, null, true);
            if (this.LJIIZILJ > 1 && !this.LJJIJL) {
                this.LJIIZILJ = 2;
                LJI(ixn.getVideoEffectInfo(this.LJI));
                start();
                return;
            }
            return;
        }
        C5H3 c5h3 = IZ8.G;
        Object value2 = c5h3.getValue();
        o.LJIIIIZZ(value2, "<get-playerFirstFrameDegrade>(...)");
        if (((Number) value2).intValue() > 0) {
            try {
                o.LJIIIIZZ(c5h3.getValue(), "<get-playerFirstFrameDegrade>(...)");
                Thread.sleep(((Number) r0).intValue());
            } catch (InterruptedException e) {
                C16880lQ.LLLLIIL(e);
            }
        }
        ix4.LJLLL = 0;
        this.LJJIJL = ix4.LJJ;
        LJIJJ(ix4, str, z, j, z2);
        LJIL(this.LJJIIZ, str, 4, (int) (SystemClock.elapsedRealtime() - elapsedRealtime));
    }

    public final void LJIJJ(IX4 ix4, String str, boolean z, long j, boolean z2) {
        String str2;
        boolean z3;
        IXS ixs;
        boolean z4;
        boolean z5;
        IXY ixy;
        IXX ixx;
        List arrayList;
        int i;
        if (IXB.LIZ) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("SimplifyPlayerImpl, prepareInternal, id = ");
            LIZ.append(str);
            LIZ.append(", ready2Render = ");
            LIZ.append(z);
            LIZ.append(", position = ");
            V1I.LIZJ(LIZ, j, " fromResume = ", z2);
            LIZ.append(", mSurface = ");
            LIZ.append(this.LJFF);
            LIZ.append(", mPlayer = ");
            LIZ.append(this.LIZIZ);
            IXB.LIZ(X1D.LIZIZ(LIZ));
        }
        IXO ixo = ix4.LJJJJZI;
        if ((ixo == null || !ixo.LIZIZ()) && (ix4.LIZJ() == null || ix4.LIZJ().LIZ == null || ((ix4.LIZJ().LIZ instanceof String) && TextUtils.isEmpty((String) ix4.LIZJ().LIZ)))) {
            LJIJJLI(str, ix4.LJIILIIL, ix4.LJJIJIIJI, ix4.LJJJJZI);
            return;
        }
        String LJIIL = LJIIL(ix4);
        if (this.LJIIZILJ == 1 && LJLJL(str, LJIIL)) {
            if (IXB.LIZ) {
                IXB.LIZ("SimplifyPlayerImpl, prepare sameVideo is prepare will return !");
            }
            if (this.LIZIZ != null && this.LJFF != null && this.LJFF.isValid()) {
                this.LIZIZ.LJLJJI(this.LJFF);
                return;
            }
            return;
        }
        this.LJJIJ = LJIIL;
        LJIIIIZZ(ix4, z2);
        this.LJIIIIZZ = ix4.LJIILIIL;
        if (ix4.LJJJJZI == null && IZ8.LJJIIZ().booleanValue()) {
            if (ix4.LIZJ() != null) {
                this.LJIIIIZZ = ix4.LIZJ().LIZJ;
            }
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("SimplifyPlayerImpl, adjust bytevc1 : ");
            LIZ2.append(ix4.LJIILIIL);
            LIZ2.append(" -> ");
            LIZ2.append(this.LJIIIIZZ);
            IXB.LIZ(X1D.LIZIZ(LIZ2));
        }
        if (str == null) {
            str2 = "";
        } else {
            str2 = str;
        }
        this.LJI = str2;
        this.LJIIJJI = z;
        this.LJIIL = false;
        this.LJIILIIL = 0;
        this.LJIILL = false;
        this.LJJIJLIJ = false;
        if (this.LJJIIZI.isLoop()) {
            this.LIZIZ.setLooping(true);
        }
        if (ix4.LIZJ() != null && !TextUtils.isEmpty(ix4.LIZJ().LJI) && IZ8.LJIIJJI()) {
            this.LJ.LJJLIIIIJ = ix4.LIZJ().LJI;
        }
        IX4 ix42 = this.LJ;
        if (ix42 != null && !TextUtils.isEmpty(ix42.LJJLIIIIJ)) {
            this.LIZIZ.LJJLIL(this.LJ.LJJLIIIIJ);
        }
        try {
            if (this.LJFF != null && this.LJFF.isValid()) {
                this.LIZ.LIZ(this.LJFF);
                this.LIZIZ.LJLJJI(this.LJFF);
            }
        } catch (Throwable unused) {
        }
        try {
            C35660Dz6.LIZ().LIZIZ(this.LJII, "player_prepare_play");
            HashMap hashMap = new HashMap();
            hashMap.put("context", ix4.LJIIIIZZ);
            hashMap.put("meta_info", ix4.LJIJJ);
            hashMap.put("vr", Boolean.valueOf(ix4.LJIIL));
            hashMap.put("playback_ability", Integer.valueOf(IXN.LIZ().getPlaybackAbility()));
            hashMap.put("graph_json", IXN.LIZ().getGraphJson());
            hashMap.put("audio_route", IXN.LIZ().getAudioRoute());
            hashMap.put("enable_sami_sdk_ab", Integer.valueOf(IXN.LIZ().getEnableSAMISDKAB()));
            hashMap.put("music_volume_info", ix4.LJIJJLI);
            hashMap.put("music_volume_target_loudness", Float.valueOf(ix4.LJIL));
            hashMap.put("bytevc1", Boolean.valueOf(SFS.LJIJJLI(this.LJIIIIZZ)));
            hashMap.put("render_type", Integer.valueOf(ix4.LJIIZILJ));
            hashMap.put("async_init", Boolean.valueOf(ix4.LJJIJL));
            if (ix4.LJJJJIZL && IZ8.LJI()) {
                z3 = true;
            } else {
                z3 = false;
            }
            hashMap.put("predemux_only", Boolean.valueOf(z3));
            hashMap.put("enable_alog", Integer.valueOf(ix4.LJIJI));
            hashMap.put("use_texture_render", Boolean.valueOf(ix4.LJJJ));
            hashMap.put("gaussian_params", null);
            hashMap.put("header_support_play_no_surface", Boolean.valueOf(ix4.LLFZ));
            hashMap.put("header_enable_correct_real_clock", Boolean.valueOf(ix4.LJIILL));
            if (!TextUtils.isEmpty(ix4.LLI)) {
                hashMap.put("custom_cache_file_path", ix4.LLI);
            }
            int i2 = ix4.LJJIFFI;
            if (i2 != -1) {
                hashMap.put("header_voice_stream_type", Integer.valueOf(i2));
            }
            LJIILL(ix4, hashMap, j, z2);
            boolean z6 = ix4.LJJJJLL;
            if (z6) {
                hashMap.put("preload_socket_reuse", Boolean.valueOf(z6));
            }
            if (!ix4.LJJJJZ) {
                hashMap.put("header_this_play_use_data_loader", Boolean.FALSE);
            }
            IXO ixo2 = ix4.LJJJJZI;
            if (ixo2 == null || ixo2.LIZ == null || ixo2.LIZ() == null) {
                if (ix4.LIZJ() != null) {
                    hashMap.put("is_open_super_resolution", Boolean.valueOf(ix4.LIZJ().LJIIIIZZ));
                    hashMap.put("async_init_sr", Boolean.valueOf(ix4.LIZJ().LJIIIZ));
                }
            } else {
                hashMap.put("is_open_super_resolution", Boolean.valueOf(ix4.LJJJJZI.LIZ().LJ));
                hashMap.put("async_init_sr", Boolean.valueOf(ix4.LJJJJZI.LIZ().LJFF));
            }
            if (!TextUtils.isEmpty(ix4.LJJJZ)) {
                hashMap.put("sub_tag", ix4.LJJJZ);
            }
            if (ix4.LJJZZI) {
                hashMap.put("skip_start_when_prepare", Boolean.TRUE);
            }
            if (ix4.LIZIZ() != null && !ix4.LIZIZ().isEmpty()) {
                Object value = IZ8.i0.getValue();
                o.LJIIIIZZ(value, "<get-optPlayerSubtitleFormatConversion>(...)");
                if (!((Boolean) value).booleanValue()) {
                    String LIZ3 = IQU.LIZ(ix4.LIZIZ());
                    ix4.LJLJI = LIZ3;
                    if (IXB.LIZ) {
                        IXB.LIZIZ("ProcessSubUrl:", LIZ3);
                    }
                }
            }
            if (ix4.LJLLJ != 0) {
                if (ix4.LIZ() != null && !ix4.LIZ().isEmpty()) {
                    arrayList = C46775IXj.LIZ(ix4.LIZ());
                } else {
                    arrayList = new ArrayList();
                }
                if (ix4.LIZJ() != null && ix4.LIZJ().LIZLLL != null) {
                    i = ix4.LIZJ().LIZLLL.LIZ;
                } else {
                    i = 0;
                }
                int i3 = ix4.LJLLJ;
                if (i3 == 2 || (i3 == 1 && !arrayList.isEmpty())) {
                    arrayList.add(new C46801IYj(1, (String) ix4.LIZJ().LIZ, Integer.valueOf(i), 1, ix4.LJJLIIIJJIZ, ix4.LJJLIIIJL, this.LJJIJ));
                }
                hashMap.put("header_dubbed_audio_info_model", arrayList);
                if (IXB.LIZ && arrayList != null) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        IXB.LIZIZ("ProcessAudioUrl:", ((C46801IYj) it.next()).toString());
                    }
                }
            }
            hashMap.put("header_selected_dubbed_info_audio_model_id", Integer.valueOf(ix4.LJZI));
            hashMap.put("header_video_width", Integer.valueOf(ix4.LJJJLIIL));
            hashMap.put("header_video_height", Integer.valueOf(ix4.LJJJLL));
            hashMap.put("frames_wait", Integer.valueOf(ix4.LJJII));
            hashMap.put("key", this.LJJIJ);
            if (ix4.LLII && !TextUtils.isEmpty(ix4.LJJIIZ)) {
                hashMap.put("header_check_sum", ix4.LJJIIZ);
            }
            hashMap.put("group_id", this.LJI);
            if (!IZ8.LJJIIJZLJL() || !TextUtils.isEmpty(this.LJI)) {
                hashMap.put("key2", this.LJI);
            } else {
                hashMap.put("key2", ix4.LJJIIJ);
            }
            hashMap.put("decoder_type", Integer.valueOf(ix4.LJIJ));
            hashMap.put("set_cookie_token", Boolean.valueOf(ix4.LJJJI));
            hashMap.put("dash_hijack_retry", Boolean.valueOf(ix4.LJJJIL));
            hashMap.put("tag", ix4.LJJJLZIJ);
            if (IXB.LIZ) {
                StringBuilder LIZ4 = X1D.LIZ();
                LIZ4.append("subtag = ");
                LIZ4.append(ix4.LJJJZ);
                LIZ4.append(",tag = ");
                LIZ4.append(ix4.LJJJLZIJ);
                LIZ4.append(",isPrepareOnly = ");
                LIZ4.append(ix4.LJJ);
                LIZ4.append(",lable = ");
                LIZ4.append(ix4.LLFII);
                LIZ4.append(",id = ");
                LIZ4.append(str);
                IXB.LIZIZ("test_wrg:", X1D.LIZIZ(LIZ4));
            }
            hashMap.put("is_cache", Boolean.valueOf(ix4.LIZLLL()));
            IX4 ix43 = this.LJ;
            if (ix43 != null && (ixy = ix43.LJJIJIIJI) != null && (ixx = ixy.LIZLLL) != null) {
                hashMap.put("video_extra", ixx.LJIIIIZZ);
            }
            hashMap.put("network_speed", Integer.valueOf(ix4.LJJL));
            LJII(ix4, hashMap, false);
            hashMap.put("cross_talk_call_link", ix4.LLFFF);
            hashMap.put("prepare_only", Boolean.valueOf(ix4.LJJ));
            hashMap.put("play_speed", Float.valueOf(ix4.LJJLIIIJ));
            Boolean bool = Boolean.FALSE;
            hashMap.put("enable_buffer_preload", bool);
            hashMap.put("buffer_preload_danger", 0);
            hashMap.put("buffer_preload_secure", 0);
            hashMap.put("duration", Integer.valueOf(ix4.LJJLIIIJILLIZJL));
            hashMap.put("volume_loud_peak", ix4.LJJLIIIJL);
            hashMap.put("volume_loud_src", ix4.LJJLIIIJJIZ);
            hashMap.put("volume_loud_target", ix4.LJJLIIIJJI);
            hashMap.put("header_audio_track_content_type", Integer.valueOf(ix4.LJJLIIIJLJLI));
            hashMap.put("disable_render_audio", Boolean.valueOf(ix4.LJJLIL));
            hashMap.put("process_audio_addr", ix4.LJJLJ);
            hashMap.put("voice_trait", ix4.LJJLJLI);
            hashMap.put("header_audio_processor", ix4.LJJLL);
            hashMap.put("header_prepare_only_range_request", Boolean.valueOf(ix4.LJLLLL));
            hashMap.put("header_prepare_need_check_cache_size", Boolean.valueOf(ix4.LJLLLLLL));
            hashMap.put("call_current_playback_time", Boolean.valueOf(ix4.LJLZ));
            if (ix4.LJLI) {
                hashMap.put("cache_duration", Integer.valueOf(ix4.LJLIIIL));
            }
            LJI(IXN.LIZ().getVideoEffectInfo(this.LJI));
            float adjustedVolume = IXN.LIZ().getAdjustedVolume();
            if (adjustedVolume > 0.0f && this.LIZIZ.LJJJJLI() > 0.0f) {
                this.LIZIZ.LJLJJL(adjustedVolume, adjustedVolume);
            }
            if (!ix4.LJLJLLL || !"homepage_hot".equals(ix4.LJJJZ)) {
                hashMap.put("header_enable_file_io_opt", bool);
            } else {
                hashMap.put("header_enable_file_io_opt", Boolean.TRUE);
                hashMap.put("resume_fileio_block_duration_threshold", Integer.valueOf(ix4.LJLLI));
                hashMap.put("mem_cache_video_duration_threshold", Integer.valueOf(ix4.LJLLILLLL));
            }
            List<Surface> list = ix4.LJJZ;
            if (list != null && list.size() > 0) {
                hashMap.put("header_video_merge", 1);
                this.LIZIZ.LJJLJLI(ix4.LJJZ);
            }
            this.LIZIZ.LJJLL(ix4.LJJIIJ);
            this.LIZIZ.LJLILLLLZI(ix4.LJLIL);
            if (ix4.LJLIL) {
                this.LIZIZ.LJLIIIL();
            }
            if (ix4.LIZ() != null && !ix4.LIZ().isEmpty()) {
                this.LIZIZ.LJJLIIIJL();
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (ix4.LIZJ() != null) {
                if (ix4.LIZJ().LIZLLL != null) {
                    hashMap.put("bitrate", Integer.valueOf(ix4.LIZJ().LIZLLL.LIZ));
                    hashMap.put("ratio", Integer.valueOf(ix4.LIZJ().LIZLLL.LIZJ / 10));
                    if (ix4.LIZJ().LIZLLL.LIZLLL == 2) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    hashMap.put("bytevc2", Boolean.valueOf(z5));
                    hashMap.put("hdr", Boolean.valueOf(ix4.LIZJ().LIZLLL.LIZ()));
                    String[] strArr = ix4.LIZJ().LJIJ;
                    if (strArr != null) {
                        hashMap.put("url_data", new IXV(Arrays.asList(strArr), ix4.LJJJJL));
                    }
                }
                hashMap.put("force_hardware_decode", Boolean.valueOf(ix4.LJJLIIJ));
                if (!ix4.LJJLIIIJLLLLLLLZ && !ix4.LIZJ().LJII) {
                    z4 = false;
                    hashMap.put("force_software_decode", Boolean.valueOf(z4));
                    hashMap.put("header_url", (String) ix4.LIZJ().LIZ);
                }
                z4 = true;
                hashMap.put("force_software_decode", Boolean.valueOf(z4));
                hashMap.put("header_url", (String) ix4.LIZJ().LIZ);
            }
            IXO ixo3 = ix4.LJJJJZI;
            if (ixo3 == null) {
                if (ix4.LIZJ() != null && ix4.LIZJ().LIZLLL != null) {
                    hashMap.put("header_resolution", Integer.valueOf(O5Y.LJJIIJ(ix4.LIZJ().LIZLLL.LIZJ, ix4.LIZJ().LIZLLL.LIZIZ)));
                }
                String str3 = (String) ix4.LIZJ().LIZ;
                this.LJJIJIIJI = str3;
                StringBuilder LIZ5 = X1D.LIZ();
                LIZ5.append(" id:");
                LIZ5.append(str);
                LIZ5.append(", playUrl:");
                LIZ5.append(str3);
                IXB.LIZIZ("wbp-test-play-breakdown", X1D.LIZIZ(LIZ5));
                StringBuilder LIZ6 = X1D.LIZ();
                LIZ6.append("prepare mp4, id:");
                LIZ6.append(str);
                LIZ6.append(", playUrl:");
                LIZ6.append(str3);
                IXB.LIZIZ("wbp_preload_all_path", X1D.LIZIZ(LIZ6));
                this.LIZIZ.LJJLI(str3, hashMap);
            } else {
                if (ixo3.LIZ != null) {
                    IXW LIZ7 = ixo3.LIZ();
                    if (LIZ7 != null) {
                        IXO ixo4 = ix4.LJJJJZI;
                        ixo4.LJIIIZ = LIZ7.LIZJ;
                        ixo4.LJIIJ = LIZ7.LIZLLL;
                        SimAudioBitrate simAudioBitrate = LIZ7.LIZIZ;
                        if (simAudioBitrate != null && simAudioBitrate.getAudioMeta() != null) {
                            ix4.LJJJJZI.LJJIFFI = LIZ7.LIZIZ.getAudioMeta().LJIILJJIL;
                        }
                    }
                } else if (ixo3.LIZIZ != null && ixo3.LJIIIZ == null && (ixs = ix4.LJII) != null) {
                    ixo3.LJIIIZ = (EnumC47177IfN) ixs.get();
                }
                EnumC47177IfN enumC47177IfN = ix4.LJJJJZI.LJIIIZ;
                if (enumC47177IfN != null) {
                    hashMap.put("header_resolution", Integer.valueOf(enumC47177IfN.getResolutionInt()));
                }
                StringBuilder LIZ8 = X1D.LIZ();
                LIZ8.append("prepare dash, id:");
                LIZ8.append(str);
                IXB.LIZIZ("wbp_preload_all_path", X1D.LIZIZ(LIZ8));
                hashMap.put("header_dashinfo", ix4.LJJJJZI);
                this.LIZIZ.LJJLIIIJ(ix4.LJJJJZI, hashMap);
            }
            if (this.LJJIJL) {
                this.LJJIL.LIZ = C16880lQ.LLLLIIIILLL().getPriority();
            } else {
                this.LJJIL.LIZIZ = C16880lQ.LLLLIIIILLL().getPriority();
            }
            LJIL(this.LJJIIZ, str, 3, (int) (SystemClock.elapsedRealtime() - elapsedRealtime));
            this.LJIIZILJ = 1;
        } catch (Exception e) {
            StringBuilder LIZIZ = C25620zW.LIZIZ("SIM_PLAYER prepare exception: id:", str, " sourceId ");
            LIZIZ.append(this.LJI);
            LIZIZ.append(" codecType ");
            LIZIZ.append(this.LJIIIIZZ);
            LIZIZ.append(" prepareOnly ");
            LIZIZ.append(this.LJJIJL);
            String LIZIZ2 = X1D.LIZIZ(LIZIZ);
            if (IXB.LIZIZ != null) {
                C78983UzD.LJIJ(e, LIZIZ2);
            }
            IXN.LIZ().getClass();
            if (this.LJJIJL) {
                IX4 ix44 = this.LJ;
                if (ix44 != null) {
                    ix44.LJJ = false;
                }
                this.LJIJ = -1L;
                return;
            }
            if (this.LJJII != null) {
                IPG ipg = new IPG(this.LJIIIIZZ, -123, -123, C1DD.LJ("prepare exception:", e), this.LJI);
                ipg.LIZLLL = this.LJIIIZ;
                ipg.LJIIIIZZ = LJIILLIIL() ? 1 : 0;
                String str4 = this.LJI;
                OnUIPlayListener onUIPlayListener = this.LJJII;
                IPH LJIIIZ = LJIIIZ();
                ITH.LIZ(str4);
                this.LJJIFFI.LIZ(new ARunnableS5S1300000_8(onUIPlayListener, ipg, str4, LJIIIZ, 2));
            }
            this.LJIJ = -1L;
        }
    }
}
