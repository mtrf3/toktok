package X;

import android.os.SystemClock;
import android.text.TextUtils;
import com.ss.android.ugc.playerkit.model.LoadControlConfig;
import com.ss.android.ugc.playerkit.session.Session;
import com.ss.ttm.player.LoadControl;
import java.lang.ref.WeakReference;
import java.util.LinkedList;
import java.util.Queue;
import kotlin.jvm.internal.o;

/* renamed from: X.Igv, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47273Igv extends LoadControl {
    public int LJIIIZ;
    public int LJIIJ;
    public boolean LJIIJJI;
    public boolean LJIIL;
    public boolean LJIILIIL;
    public int LJIILL;
    public boolean LJIILLIIL;
    public int LJIIZILJ;
    public int LJIJ;
    public int LJIJI;
    public int LJIJJ;
    public int LJIJJLI;
    public int LJJIII;
    public final LoadControlConfig LJJIIJ;
    public Queue<Long> LJJIIJZLJL;
    public int LJJIIZ;
    public WeakReference<InterfaceC46804IYm> LJJIIZI;
    public boolean LJJIJ;
    public boolean LJJIJIIJI;
    public int LIZJ = -1;
    public int LIZLLL = 200;
    public int LJ = 1000;
    public int LJFF = 5000;
    public float LJI = 9.0f;
    public int LJII = 200;
    public int LJIIIIZZ = 100;
    public long LJIILJJIL = -1;
    public long LJIL = -1;
    public long LJJ = -1;
    public double LJJI = -1.0d;
    public long LJJIFFI = -1;
    public long LJJII = -1;

    public final void LIZJ() {
        this.LJIIIZ = 0;
        this.LJIIJJI = false;
        this.LJIIL = false;
        this.LJIILIIL = false;
        this.LJIILJJIL = -1L;
        this.LJIIZILJ = 0;
        this.LJIILLIIL = false;
        this.LJIIJ = 0;
        this.LJJIIJZLJL = new LinkedList();
        this.LJIL = -1L;
        this.LJJ = -1L;
        this.LJJI = -1.0d;
        this.LJJIFFI = -1L;
        this.LJJII = -1L;
        this.LJJIII = 0;
        this.LJJIJ = false;
    }

    public final double LIZIZ() {
        LoadControlConfig loadControlConfig = this.LJJIIJ;
        if (loadControlConfig != null) {
            double pow = Math.pow(this.LJJIIZ / 1000.0d, loadControlConfig.videoDurationParamB) * loadControlConfig.videoDurationParamA;
            LoadControlConfig loadControlConfig2 = this.LJJIIJ;
            return (((-1.0d) / (pow + loadControlConfig2.videoDurationParamC)) + loadControlConfig2.videoDurationParamD) * 1000.0d;
        }
        return this.LJ;
    }

    public C47273Igv() {
        Object value = IZ8.LJJJJIZL.getValue();
        o.LJIIIIZZ(value, "<get-PLAYER_LOAD_CONTROL_CONFIG>(...)");
        this.LJJIIJ = (LoadControlConfig) value;
        this.LJJIIJZLJL = new LinkedList();
    }

    @Override // com.ss.ttm.player.LoadControl
    public final int onCodecStackSelected(int i) {
        if (i != 1) {
            if (i != 2) {
                return 0;
            }
            return this.LJIJI;
        }
        return this.LJIJ;
    }

    @Override // com.ss.ttm.player.LoadControl
    public final int onFilterStackSelected(int i) {
        if (i != 2) {
            return 0;
        }
        return this.LJIJJ;
    }

    @Override // com.ss.ttm.player.LoadControl
    public final int onTrackSelected(int i) {
        if (this.LJIILLIIL) {
            return this.LJIIZILJ;
        }
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00eb, code lost:
    
        if (r12 > r1) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00ed, code lost:
    
        r11.LJIILIIL = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0102, code lost:
    
        if (r11.LJIILIIL != false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0104, code lost:
    
        r11.LJIILIIL = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:?, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:?, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00fa, code lost:
    
        if (r12 > r0) goto L44;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZLLL(long r12, boolean r14) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47273Igv.LIZLLL(long, boolean):boolean");
    }

    @Override // com.ss.ttm.player.LoadControl
    public final boolean shouldStartPlayback(long j, float f, boolean z) {
        Session LJ;
        int i;
        LoadControlConfig loadControlConfig;
        LoadControlConfig loadControlConfig2 = this.LJJIIJ;
        if (loadControlConfig2 == null || !loadControlConfig2.enable) {
            return LIZLLL(j, z);
        }
        if (loadControlConfig2.enableStrategyOld()) {
            if (this.LJJIJ && (loadControlConfig = this.LJJIIJ) != null && loadControlConfig.enableAdjustAfterSeek) {
                if (j >= loadControlConfig.minBufferThresholdAfterSeek) {
                    return true;
                }
            } else if (z) {
                if (j != 0 || this.LJJ == -1) {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    if (this.LJJ == -1 && this.LJIL == -1) {
                        this.LJJ = elapsedRealtime;
                        this.LJIL = j;
                    }
                    long j2 = this.LJJIFFI;
                    if (j2 != -1) {
                        if (this.LJJII != -1 && j >= j2) {
                            this.LJJI = ((j - j2) * 1.0d) / (elapsedRealtime - r0);
                            LoadControlConfig loadControlConfig3 = this.LJJIIJ;
                            double d = loadControlConfig3.speedThreshold * f;
                            if (loadControlConfig3.enableStrategyOld() && this.LJJIIJ.enableLatestSpeedParam && this.LJJI > d) {
                                this.LJJIII++;
                            }
                        }
                    }
                    LoadControlConfig loadControlConfig4 = this.LJJIIJ;
                    if (loadControlConfig4 != null && this.LJJIII > loadControlConfig4.latestSpeedFilterCnt && (!loadControlConfig4.enableMinBufferThreshold || j >= LIZIZ())) {
                        this.LJIL = -1L;
                        this.LJJ = -1L;
                        this.LJJI = -1.0d;
                        this.LJJIFFI = -1L;
                        this.LJJII = -1L;
                        this.LJJIII = 0;
                        return true;
                    }
                    this.LJJIFFI = j;
                    this.LJJII = elapsedRealtime;
                }
            } else {
                LoadControlConfig loadControlConfig5 = this.LJJIIJ;
                if (loadControlConfig5 == null || !loadControlConfig5.enableAdjustWhenNotRebuffering) {
                    if (this.LJIIJJI) {
                        i = this.LIZLLL;
                    } else {
                        i = this.LJ;
                    }
                    if (j >= i) {
                        return true;
                    }
                } else if (j >= LIZIZ()) {
                    return true;
                }
            }
            return false;
        }
        if (this.LJJIIJ.enableStrategySeal()) {
            if (z) {
                this.LJJIIJ.getClass();
            } else {
                InterfaceC46804IYm interfaceC46804IYm = this.LJJIIZI.get();
                if (interfaceC46804IYm != null) {
                    String sourceId = interfaceC46804IYm.getSourceId();
                    if (!TextUtils.isEmpty(sourceId) && (LJ = C46664ITc.LJIJ.LJ(sourceId)) != null && LJ.urlModel != null && this.LJJIIJ.validCacheSize > 0) {
                        IUA.LIZ.LIZ().isCacheAboveOrComplete(LJ.urlModel, this.LJJIIJ.validCacheSize);
                    }
                    this.LJJIIJ.getClass();
                }
            }
            return LIZLLL(j, z);
        }
        return LIZLLL(j, z);
    }
}
