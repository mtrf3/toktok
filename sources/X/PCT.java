package X;

import com.bytedance.services.slardar.config.IConfigManager;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class PCT {
    public static volatile PCT LJII;
    public volatile boolean LIZ;
    public List<PCW> LIZIZ;
    public volatile JSONObject LIZJ;
    public volatile boolean LIZLLL;
    public PCS LJ;
    public IConfigManager LJFF;
    public PCV LJI;

    public final synchronized void LIZIZ() {
        if (this.LIZ) {
            return;
        }
        this.LIZ = true;
        if (PC5.LJJIIZ()) {
            this.LJ = new PCS(this);
            C64071PCp.LIZ(PD6.LIGHT_WEIGHT).LIZJ(this.LJ);
        }
        IConfigManager iConfigManager = (IConfigManager) C171096nZ.LIZ(IConfigManager.class);
        this.LJFF = iConfigManager;
        iConfigManager.registerConfigListener(new PCU(this));
    }

    public static PCT LIZ() {
        if (LJII == null) {
            synchronized (PCT.class) {
                if (LJII == null) {
                    LJII = new PCT();
                }
            }
        }
        return LJII;
    }

    public final void LIZJ(PCW pcw) {
        if (this.LIZIZ == null) {
            this.LIZIZ = new CopyOnWriteArrayList();
        }
        if (!((CopyOnWriteArrayList) this.LIZIZ).contains(pcw)) {
            ((CopyOnWriteArrayList) this.LIZIZ).add(pcw);
        }
        if (this.LIZLLL) {
            pcw.LIZ(this.LIZJ);
        }
    }

    public final void LIZLLL(JSONObject jSONObject, boolean z) {
        if (C64055PBz.LIZIZ(jSONObject)) {
            return;
        }
        this.LIZJ = jSONObject;
        this.LIZLLL = true;
        List<PCW> list = this.LIZIZ;
        if (list != null) {
            Iterator it = ((CopyOnWriteArrayList) list).iterator();
            while (it.hasNext()) {
                try {
                    ((PCW) it.next()).LIZ(jSONObject);
                } catch (Throwable unused) {
                }
            }
        }
    }
}
