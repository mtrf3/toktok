package X;

import android.app.ActivityManager;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;

/* renamed from: X.Qn1, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68035Qn1 {
    public final /* synthetic */ C68110QoE LIZ;

    public C68035Qn1(C68110QoE c68110QoE) {
        this.LIZ = c68110QoE;
    }

    public final void LIZ() {
        this.LIZ.LJFF();
        C67274Qak LJIILLIIL = this.LIZ.LIZ.LJIILLIIL();
        this.LIZ.LIZ.LJIILIIL.getClass();
        if (LJIILLIIL.LJIILLIIL(System.currentTimeMillis())) {
            this.LIZ.LIZ.LJIILLIIL().LJIIJ.LIZ(true);
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (runningAppProcessInfo.importance == 100) {
                this.LIZ.LIZ.LIZJ().LJIILIIL.LIZ("Detected application was in foreground");
                this.LIZ.LIZ.LJIILIIL.getClass();
                LIZJ(System.currentTimeMillis(), false);
            }
        }
    }

    public final void LIZIZ(long j, boolean z) {
        this.LIZ.LJFF();
        this.LIZ.LJIIIZ();
        if (this.LIZ.LIZ.LJIILLIIL().LJIILLIIL(j)) {
            this.LIZ.LIZ.LJIILLIIL().LJIIJ.LIZ(true);
            C68572Qvg.LIZ();
            if (this.LIZ.LIZ.LJI.LJIILJJIL(null, C68555QvP.LJLJJI)) {
                this.LIZ.LIZ.LJIILJJIL().LJIIL();
            }
        }
        this.LIZ.LIZ.LJIILLIIL().LJIILIIL.LIZIZ(j);
        if (this.LIZ.LIZ.LJIILLIIL().LJIIJ.LIZIZ()) {
            LIZJ(j, z);
        }
    }

    public final void LIZJ(long j, boolean z) {
        this.LIZ.LJFF();
        if (!this.LIZ.LIZ.LJII()) {
            return;
        }
        this.LIZ.LIZ.LJIILLIIL().LJIILIIL.LIZIZ(j);
        this.LIZ.LIZ.LJIILIIL.getClass();
        this.LIZ.LIZ.LIZJ().LJIILIIL.LIZIZ(Long.valueOf(SystemClock.elapsedRealtime()), "Session started, time");
        Long valueOf = Long.valueOf(j / 1000);
        this.LIZ.LIZ.LJIJ().LJIJJLI(j, valueOf, "auto", "_sid");
        this.LIZ.LIZ.LJIILLIIL().LJIIJ.LIZ(false);
        Bundle bundle = new Bundle();
        bundle.putLong("_sid", valueOf.longValue());
        if (this.LIZ.LIZ.LJI.LJIILJJIL(null, C68555QvP.LJJJLIIL) && z) {
            bundle.putLong("_aib", 1L);
        }
        this.LIZ.LIZ.LJIJ().LJIILIIL(j, "auto", "_s", bundle);
        ((InterfaceC68069QnZ) C68174QpG.LJLILLLLZI.LJLIL.zza()).zza();
        if (this.LIZ.LIZ.LJI.LJIILJJIL(null, C68555QvP.LJJJZ)) {
            String LIZ = this.LIZ.LIZ.LJIILLIIL().LJIJ.LIZ();
            if (!TextUtils.isEmpty(LIZ)) {
                this.LIZ.LIZ.LJIJ().LJIILIIL(j, "auto", "_ssr", C0H1.LIZ("_ffr", LIZ));
            }
        }
    }
}
