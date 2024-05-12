package X;

import android.text.TextUtils;
import com.google.android.gms.measurement.internal.zzau;
import com.google.android.gms.measurement.internal.zzaw;
import com.google.android.gms.measurement.internal.zzq;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.QqJ, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class RunnableC68239QqJ implements Runnable {
    public final /* synthetic */ zzaw LJLIL;
    public final /* synthetic */ zzq LJLILLLLZI;
    public final /* synthetic */ BinderC68232QqC LJLJI;

    public RunnableC68239QqJ(BinderC68232QqC binderC68232QqC, zzaw zzawVar, zzq zzqVar) {
        this.LJLJI = binderC68232QqC;
        this.LJLIL = zzawVar;
        this.LJLILLLLZI = zzqVar;
    }

    public final void LIZ() {
        C68340Qrw c68340Qrw;
        java.util.Map LJJIIJZLJL;
        String LJJIIZI;
        zzau zzauVar;
        BinderC68232QqC binderC68232QqC = this.LJLJI;
        zzaw zzawVar = this.LJLIL;
        binderC68232QqC.getClass();
        if ("_cmp".equals(zzawVar.zza) && (zzauVar = zzawVar.zzb) != null && zzauVar.LJJJJL() != 0) {
            String LJJLIIIJ = zzawVar.zzb.LJJLIIIJ("_cis");
            if ("referrer broadcast".equals(LJJLIIIJ) || "referrer API".equals(LJJLIIIJ)) {
                binderC68232QqC.LJLIL.LIZJ().LJIIJJI.LIZIZ(zzawVar.toString(), "Event has been filtered ");
                zzawVar = new zzaw("_cmpx", zzawVar.zzb, zzawVar.zzc, zzawVar.zzd);
            }
        }
        BinderC68232QqC binderC68232QqC2 = this.LJLJI;
        zzq zzqVar = this.LJLILLLLZI;
        C68244QqO c68244QqO = binderC68232QqC2.LJLIL.LIZ;
        C68241QqL.LJJIJIIJI(c68244QqO);
        if (!c68244QqO.LJIJ(zzqVar.zza)) {
            binderC68232QqC2.LLJI(zzawVar, zzqVar);
            return;
        }
        binderC68232QqC2.LJLIL.LIZJ().LJIILIIL.LIZIZ(zzqVar.zza, "EES config found for");
        C68244QqO c68244QqO2 = binderC68232QqC2.LJLIL.LIZ;
        C68241QqL.LJJIJIIJI(c68244QqO2);
        String str = zzqVar.zza;
        if (TextUtils.isEmpty(str) || (c68340Qrw = (C68340Qrw) c68244QqO2.LJIIIZ.LIZIZ(str)) == null) {
            binderC68232QqC2.LJLIL.LIZJ().LJIILIIL.LIZIZ(zzqVar.zza, "EES not loaded for");
            binderC68232QqC2.LLJI(zzawVar, zzqVar);
            return;
        }
        try {
            C68243QqN c68243QqN = binderC68232QqC2.LJLIL.LJI;
            C68241QqL.LJJIJIIJI(c68243QqN);
            LJJIIJZLJL = c68243QqN.LJJIIJZLJL(true, zzawVar.zzb.LJJJJZI());
            LJJIIZI = C78540Us4.LJJIIZI(zzawVar.zza, C68107QoB.LIZJ, C68107QoB.LIZ);
            if (LJJIIZI == null) {
                LJJIIZI = zzawVar.zza;
            }
        } catch (C68319Qrb unused) {
            binderC68232QqC2.LJLIL.LIZJ().LJFF.LIZJ(zzqVar.zzb, zzawVar.zza, "EES error. appId, eventName");
        }
        if (c68340Qrw.LIZIZ(new C68276Qqu(zzawVar.zzd, LJJIIZI, LJJIIJZLJL))) {
            C68284Qr2 c68284Qr2 = c68340Qrw.LIZJ;
            if (!c68284Qr2.LIZIZ.equals(c68284Qr2.LIZ)) {
                binderC68232QqC2.LJLIL.LIZJ().LJIILIIL.LIZIZ(zzawVar.zza, "EES edited event");
                C68243QqN c68243QqN2 = binderC68232QqC2.LJLIL.LJI;
                C68241QqL.LJJIJIIJI(c68243QqN2);
                binderC68232QqC2.LLJI(c68243QqN2.LJIL(c68340Qrw.LIZJ.LIZIZ), zzqVar);
            } else {
                binderC68232QqC2.LLJI(zzawVar, zzqVar);
            }
            if (!(!((ArrayList) c68340Qrw.LIZJ.LIZJ).isEmpty())) {
                return;
            }
            Iterator it = ((ArrayList) c68340Qrw.LIZJ.LIZJ).iterator();
            while (it.hasNext()) {
                C68276Qqu c68276Qqu = (C68276Qqu) it.next();
                binderC68232QqC2.LJLIL.LIZJ().LJIILIIL.LIZIZ(c68276Qqu.LIZ, "EES logging created event");
                C68243QqN c68243QqN3 = binderC68232QqC2.LJLIL.LJI;
                C68241QqL.LJJIJIIJI(c68243QqN3);
                binderC68232QqC2.LLJI(c68243QqN3.LJIL(c68276Qqu), zzqVar);
            }
            return;
        }
        binderC68232QqC2.LJLIL.LIZJ().LJIILIIL.LIZIZ(zzawVar.zza, "EES was not applied to event");
        binderC68232QqC2.LLJI(zzawVar, zzqVar);
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
}
