package X;

import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* renamed from: X.Gv1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC43051Gv1 implements InterfaceC37286EkE {
    public final AtomicBoolean LIZ = new AtomicBoolean(false);

    @Override // X.InterfaceC37286EkE
    public boolean LIZ() {
        return true;
    }

    public abstract boolean LJFF();

    public String LJI() {
        return "";
    }

    public abstract EnumC42718Gpe LJII();

    public abstract String LJIIIIZZ();

    public abstract long LJIIJJI();

    @Override // X.InterfaceC37286EkE
    public final long LIZIZ() {
        long j = 0;
        try {
            long currentTimeMillis = System.currentTimeMillis();
            j = LJIIJJI();
            C60903NvH.LJIIJJI().LJJIJL().getMonitor().LIZIZ(System.currentTimeMillis() - currentTimeMillis, LJIIIIZZ());
            return j;
        } catch (Exception e) {
            C60903NvH.LJIIJJI().LJJIJL().getMonitor().LJ(e, LJIIIIZZ());
            return j;
        }
    }

    @Override // X.InterfaceC37286EkE
    public final boolean LIZJ() {
        boolean z;
        boolean z2 = false;
        try {
            if (this.LIZ.get()) {
                return false;
            }
            try {
                LJIIL();
                long currentTimeMillis = System.currentTimeMillis();
                z = LJFF();
                try {
                    C60903NvH.LJIIJJI().LJJIJL().getMonitor().LIZJ(System.currentTimeMillis() - currentTimeMillis, LJIIIIZZ());
                    LJIIJ(z);
                    z2 = z;
                } catch (Exception e) {
                    e = e;
                    C60903NvH.LJIIJJI().LJJIJL().getMonitor().LJ(e, LJIIIIZZ());
                    LJIIJ(z);
                    return z2;
                }
            } catch (Exception e2) {
                e = e2;
                z = false;
            } catch (Throwable th) {
                th = th;
                z = false;
                LJIIJ(z);
                throw th;
            }
            return z2;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public void LJIIL() {
        this.LIZ.set(true);
    }

    @Override // X.InterfaceC37286EkE
    public final String LJ() {
        return LJII().toString();
    }

    public void LJIIJ(boolean z) {
        this.LIZ.set(false);
    }

    public final void LJIIIZ(long j, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("clean_size", j);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("key_status", str);
            C09900aA.LJI("disk_auto_clean_monitor", jSONObject2, jSONObject, null);
        } catch (Throwable th) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("monitorClean error:");
            LIZ.append(th.getMessage());
            H7B.LIZIZ("av-storage", X1D.LIZIZ(LIZ));
        }
    }
}
