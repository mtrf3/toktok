package X;

import Y.ARunnableS13S0000000_6;
import Y.ARunnableS1S0001000_6;
import android.os.Handler;
import com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import com.ss.android.ugc.playerkit.radar.SimRadar;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class ITE implements Runnable {
    public final /* synthetic */ OnUIPlayListener LJLIL;
    public final /* synthetic */ IPH LJLILLLLZI;
    public final /* synthetic */ long LJLJI;
    public final /* synthetic */ long LJLJJI;
    public final /* synthetic */ String LJLJJL;
    public final /* synthetic */ boolean LJLJJLL;
    public final /* synthetic */ int LJLJL;
    public final /* synthetic */ int LJLJLJ;
    public final /* synthetic */ int LJLJLLL;
    public final /* synthetic */ int LJLL;
    public final /* synthetic */ int LJLLI;
    public final /* synthetic */ boolean LJLLILLLL;
    public final /* synthetic */ boolean LJLLJ;
    public final /* synthetic */ ITG LJLLL;

    public final void LIZ() {
        boolean z;
        boolean z2;
        IZA.LIZLLL = true;
        if (!IZA.LIZJ) {
            IZA.LIZJ = true;
            Object value = IZ8.LLJLIL.getValue();
            o.LJIIIIZZ(value, "<get-CBOF_TASK_START_DELAY>(...)");
            int intValue = ((Number) value).intValue();
            if (intValue > 0) {
                ((Handler) IZA.LIZIZ.getValue()).postDelayed(new ARunnableS1S0001000_6(1, 15), intValue);
            } else {
                ((Handler) IZA.LIZIZ.getValue()).post(new ARunnableS13S0000000_6(52));
            }
        }
        if (this.LJLIL != null) {
            IPH iph = this.LJLILLLLZI;
            long j = this.LJLJI;
            iph.LIZLLL = j;
            iph.LJFF = j;
            iph.LJ = this.LJLJJI;
            if (!IUH.LIZ(this.LJLLL.LIZ.LJ)) {
                this.LJLIL.onRenderReady(this.LJLILLLLZI);
            }
            IX5 ix5 = this.LJLLL.LIZ;
            if (ix5.LIZLLL != ITZ.EXO) {
                IT4 it4 = new IT4(this.LJLJJL, ix5.LJIIIIZZ, ix5.LJJIJLIJ);
                it4.setMute(this.LJLJJLL);
                it4.setHwDecErrReason(this.LJLJL);
                it4.setEngineState(this.LJLJLJ);
                IX4 ix4 = this.LJLLL.LIZ.LJ;
                if (ix4 != null) {
                    it4.setAccertSessionPrepareType(ix4.LJLLL);
                    it4.setPrerenderJavaThreadPriority(this.LJLLL.LIZ.LJJIL.LIZ);
                    it4.setPlayJavaThreadPriority(this.LJLLL.LIZ.LJJIL.LIZIZ);
                    it4.setRecyclerType(this.LJLLL.LIZ.LJ.LJLJJL);
                    it4.setSessionStatus(this.LJLLL.LIZ.LJ.LJLJJLL);
                    it4.setPlayerArchVersion(this.LJLLL.LIZ.LJ.LJLJL);
                    IX4 ix42 = this.LJLLL.LIZ.LJ;
                    it4.subTag = ix42.LJJJZ;
                    it4.actionType = ix42.LLF;
                    IXY LIZJ = ix42.LIZJ();
                    if (LIZJ != null) {
                        Object obj = LIZJ.LIZ;
                        if (obj instanceof String) {
                            it4.setUrlProtocolType(C30581Hy.LJFF((String) obj));
                        }
                    }
                }
                it4.setTid(this.LJLLL.LIZ.LJJIJIIJIL);
                if (this.LJLJLLL != this.LJLL) {
                    z = true;
                } else {
                    z = false;
                }
                it4.setCodecTypeChanged(z);
                if (this.LJLLI == 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                it4.setTextureRender(z2);
                it4.setOnRenderTime(this.LJLJI);
                it4.setCurrentTimeMillis(this.LJLJI);
                it4.setElapsedRealtime(this.LJLJJI);
                it4.setEnablePlayerSdkEventTracking(this.LJLLILLLL);
                it4.hasSetToken = this.LJLLJ;
                it4.setPlayerSessionCnt(IX5.LJJJI.get());
                if (!IUH.LIZ(this.LJLLL.LIZ.LJ)) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("VIDEO@");
                    LIZ.append(this.LJLJJL);
                    SimRadar.traceGroup(X1D.LIZIZ(LIZ)).LIZ("TTPlay-FirstFrame").end();
                    this.LJLIL.onRenderFirstFrame(it4);
                    IVN analyzer = SimRadar.analyzer();
                    String str = this.LJLJJL;
                    analyzer.getClass();
                    C46894Iao LIZ2 = IVN.LIZ(str);
                    if (LIZ2 != null) {
                        LIZ2.LIZ();
                    }
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append("state:");
                    LIZ3.append(C76965UIn.LJ(this.LJLLL.LIZ.LJIIZILJ));
                    SimRadar.keyScan("SimplifyPlayerImpl", "onRenderFirstFrame", X1D.LIZIZ(LIZ3), this.LJLJJL);
                    this.LJLIL.onRenderFirstFrame(this.LJLJJL, it4);
                    C48693J9d.LJLJI = true;
                }
            }
            if (IUH.LIZ(this.LJLLL.LIZ.LJ)) {
                this.LJLIL.onResumePlay(this.LJLJJL, this.LJLILLLLZI);
            }
            IUH.LIZ = false;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }

    public ITE(ITG itg, OnUIPlayListener onUIPlayListener, IPH iph, long j, long j2, String str, boolean z, int i, int i2, int i3, int i4, int i5, boolean z2, boolean z3) {
        this.LJLLL = itg;
        this.LJLIL = onUIPlayListener;
        this.LJLILLLLZI = iph;
        this.LJLJI = j;
        this.LJLJJI = j2;
        this.LJLJJL = str;
        this.LJLJJLL = z;
        this.LJLJL = i;
        this.LJLJLJ = i2;
        this.LJLJLLL = i3;
        this.LJLL = i4;
        this.LJLLI = i5;
        this.LJLLILLLL = z2;
        this.LJLLJ = z3;
    }
}
