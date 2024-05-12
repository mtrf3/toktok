package X;

import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class PGX extends PEG {
    public final long LIZIZ;
    public final long LIZJ;
    public final long LIZLLL;
    public final long LJ;
    public final boolean LJFF;
    public final long LJI;
    public final long LJII;
    public final long LJIIIIZZ;
    public final long LJIIIZ;
    public final long LJIIJ;
    public final long LJIIJJI;
    public final double LJIIL;
    public final boolean LJIILIIL;
    public final boolean LJIILJJIL;
    public java.util.Map<Object, Object> LJIILL;

    @Override // X.InterfaceC64036PBg
    public final boolean LIZJ() {
        return false;
    }

    @Override // X.PEG
    public final String LJII() {
        return "memory";
    }

    @Override // X.InterfaceC64036PBg
    public final boolean isValid() {
        return true;
    }

    @Override // X.PEG
    public final JSONObject LJ() {
        boolean z;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(WM7.SCENE_SERVICE, PGQ.LIZ().LJ());
            jSONObject.put("process_name", PC5.LJIJJ());
            if (!this.LJFF) {
                z = true;
            } else {
                z = false;
            }
            jSONObject.put("is_front", z);
            jSONObject.put("is_main_process", PC5.LJJIIZ());
            return jSONObject;
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // X.PEG
    public final JSONObject LJFF() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("gc_count", this.LIZIZ);
            jSONObject.put("gc_time", this.LIZJ);
            jSONObject.put("block_gc_count", this.LIZLLL);
            jSONObject.put("block_gc_time", this.LJ);
            if (this.LJFF) {
                jSONObject.put("dalvik_pss_background", this.LJIIIZ);
                jSONObject.put("native_pss_background", this.LJI);
                jSONObject.put("total_pss_background", this.LJII);
                jSONObject.put("java_heap_background", this.LJIIIIZZ);
                jSONObject.put("java_heap_background_used_rate", this.LJIIL);
                jSONObject.put("vm_size_background", this.LJIIJJI);
                jSONObject.put("graphics_background", this.LJIIJ);
            } else {
                jSONObject.put("dalvik_pss_foreground", this.LJIIIZ);
                jSONObject.put("native_pss_foreground", this.LJI);
                jSONObject.put("total_pss_foreground", this.LJII);
                jSONObject.put("java_heap_foreground", this.LJIIIIZZ);
                jSONObject.put("java_heap_foreground_used_rate", this.LJIIL);
                jSONObject.put("vm_size_foreground", this.LJIIJJI);
                jSONObject.put("graphics_foreground", this.LJIIJ);
            }
            if (this.LJIILIIL) {
                jSONObject.put("reach_top_java", 1);
            }
            try {
                java.util.Map<Object, Object> map = this.LJIILL;
                if (map != null) {
                    for (Map.Entry<Object, Object> entry : map.entrySet()) {
                        jSONObject.put((String) entry.getKey(), CastLongProtector.parseLong((String) entry.getValue()));
                    }
                }
            } catch (Exception unused) {
            }
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
        return jSONObject;
    }

    public final PGY LJIIIIZZ() {
        PGY pgy = new PGY();
        pgy.LIZ = this.LIZIZ;
        pgy.LIZIZ = this.LIZJ;
        pgy.LIZJ = this.LIZLLL;
        pgy.LIZLLL = this.LJ;
        pgy.LJ = this.LJFF;
        pgy.LJFF = this.LJI;
        pgy.LJI = this.LJII;
        pgy.LJII = this.LJIIIIZZ;
        pgy.LJIIIIZZ = this.LJIIIZ;
        pgy.LJIIIZ = this.LJIIJ;
        pgy.LJIIJ = this.LJIIJJI;
        pgy.LJIIJJI = this.LJIILIIL;
        return pgy;
    }

    @Override // X.PEG
    public final JSONObject LJI() {
        JSONObject LIZIZ = PGQ.LIZ().LIZIZ();
        if (this.LJIILJJIL) {
            try {
                C64055PBz.LIZ(LIZIZ, PGQ.LIZ().LIZLLL());
            } catch (Exception unused) {
            }
        }
        PGT pgt = (PGT) PGH.LIZ(PGT.class);
        if (pgt != null) {
            try {
                C64055PBz.LIZ(LIZIZ, pgt.LIZJ());
            } catch (Exception unused2) {
            }
        }
        return LIZIZ;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MemoryPerfMonitorable{gcCount=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", gcTime=");
        LIZ.append(this.LIZJ);
        LIZ.append(", blockingGcCount=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", blockingGcTime=");
        LIZ.append(this.LJ);
        LIZ.append(", background=");
        LIZ.append(this.LJFF);
        LIZ.append(", nativePss=");
        LIZ.append(this.LJI);
        LIZ.append(", totalPss=");
        LIZ.append(this.LJII);
        LIZ.append(", javaUsedMemory=");
        LIZ.append(this.LJIIIIZZ);
        LIZ.append(", dalvikUsedSize=");
        LIZ.append(this.LJIIIZ);
        LIZ.append(", graphics=");
        LIZ.append(this.LJIIJ);
        LIZ.append(", vmSize=");
        LIZ.append(this.LJIIJJI);
        LIZ.append(", javaUsedMemoryRate=");
        LIZ.append(this.LJIIL);
        LIZ.append(", isMemoryReachTop=");
        return C48339Iy7.LIZJ(LIZ, this.LJIILIIL, '}', LIZ);
    }

    public PGX(long j, long j2, long j3, long j4, boolean z, long j5, long j6, long j7, long j8, long j9, long j10, double d, boolean z2, boolean z3) {
        this.LIZIZ = j;
        this.LIZJ = j2;
        this.LIZLLL = j3;
        this.LJ = j4;
        this.LJFF = z;
        this.LJI = j5;
        this.LJII = j6;
        this.LJIIIIZZ = j7;
        this.LJIIIZ = j8;
        this.LJIIJ = j9;
        this.LJIIJJI = j10;
        this.LJIIL = d;
        this.LJIILIIL = z2;
        this.LJIILJJIL = z3;
    }
}
