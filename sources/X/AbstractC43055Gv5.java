package X;

import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* renamed from: X.Gv5, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC43055Gv5 implements InterfaceC37286EkE {
    public final AtomicBoolean LIZ = new AtomicBoolean(false);

    @Override // X.InterfaceC37286EkE
    public boolean LIZ() {
        return !(this instanceof C66581QBd);
    }

    @Override // X.InterfaceC37286EkE
    public File LIZLLL() {
        return null;
    }

    public abstract boolean LJFF();

    public abstract String LJI();

    public abstract long LJIIIIZZ();

    @Override // X.InterfaceC37286EkE
    public final boolean LIZJ() {
        if (this.LIZ.get()) {
            return false;
        }
        try {
            this.LIZ.set(true);
            System.currentTimeMillis();
            boolean LJFF = LJFF();
            System.currentTimeMillis();
            return LJFF;
        } catch (Exception unused) {
            return false;
        } finally {
            this.LIZ.set(false);
        }
    }

    @Override // X.InterfaceC37286EkE
    public final long LIZIZ() {
        try {
            System.currentTimeMillis();
            long LJIIIIZZ = LJIIIIZZ();
            try {
                System.currentTimeMillis();
                return LJIIIIZZ;
            } catch (Exception unused) {
                return LJIIIIZZ;
            }
        } catch (Exception unused2) {
            return 0L;
        }
    }

    @Override // X.InterfaceC37286EkE
    public final String LJ() {
        return LJI();
    }

    public final void LJII(long j, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("clean_size", j);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("key_status", str);
            C09900aA.LJI("disk_auto_clean_monitor", jSONObject2, jSONObject, null);
        } catch (Throwable unused) {
        }
    }
}
