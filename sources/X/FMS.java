package X;

import Y.ARunnableS17S0201000_14;
import android.app.Application;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class FMS {
    public static final HashMap<String, Boolean> LJII = new HashMap<>();
    public final java.util.Map<String, FMV> LIZ = new ConcurrentHashMap();
    public final AtomicBoolean LIZIZ = new AtomicBoolean(false);
    public final AtomicBoolean LIZJ = new AtomicBoolean(false);
    public final Queue<FMU> LIZLLL = new LinkedList();
    public final Queue<FMU> LJ = new LinkedList();
    public Application LJFF;
    public FML LJI;

    public final void LIZLLL() {
        LinkedList linkedList;
        if (!this.LIZIZ.get()) {
            return;
        }
        synchronized (this.LIZLLL) {
            linkedList = new LinkedList(this.LIZLLL);
            ((LinkedList) this.LIZLLL).clear();
        }
        long j = 0;
        while (!linkedList.isEmpty()) {
            j += 100;
            FMU fmu = (FMU) linkedList.poll();
            if (((Boolean) C35389Duj.LIZJ.getValue()).booleanValue()) {
                C37179EiV.LJFF.postDelayed(new ARunnableS17S0201000_14(2, this, fmu, 11), j);
            } else {
                LIZJ(fmu);
            }
        }
    }

    public final void LIZ(FML fml) {
        this.LJI = fml;
        Iterator it = ((ConcurrentHashMap) this.LIZ).values().iterator();
        while (it.hasNext()) {
            ((FMV) it.next()).LIZIZ();
        }
    }

    public final void LIZJ(FMU fmu) {
        String str;
        String str2;
        java.util.Map<String, Object> map = fmu.LIZJ;
        if (map != null) {
            C53948LFg LIZIZ = C53946LFe.LIZIZ();
            if (LIZIZ.LJFF) {
                str = "3";
            } else {
                str = "1";
            }
            map.put("pad_interface_orientation", str);
            if (LIZIZ.LJI) {
                if (LIZIZ.LJII) {
                    str2 = "pic_in_pic";
                } else {
                    str2 = "multi_mode";
                }
                map.put("screen_multi_mode", str2);
                map.put("screen_on_multi_win_width_dp", String.valueOf(LIZIZ.LIZIZ()));
                map.put("screen_on_multi_win_height_dp", String.valueOf(LIZIZ.LIZ()));
            }
        }
        if (LJII.get(fmu.LIZ) != null) {
            synchronized (this.LJ) {
                if (!this.LIZJ.get()) {
                    ((LinkedList) this.LJ).offer(fmu);
                    if (((LinkedList) this.LJ).size() > 50) {
                        ((LinkedList) this.LJ).poll();
                    }
                    return;
                }
            }
        } else {
            synchronized (this.LIZLLL) {
                if (!this.LIZIZ.get()) {
                    ((LinkedList) this.LIZLLL).offer(fmu);
                    if (((LinkedList) this.LIZLLL).size() > 50) {
                        ((LinkedList) this.LIZLLL).poll();
                    }
                    return;
                }
            }
        }
        Iterator it = ((ConcurrentHashMap) this.LIZ).values().iterator();
        while (it.hasNext()) {
            ((FMV) it.next()).LIZ(fmu);
        }
    }

    public final void LIZIZ(String str, String str2, String str3, Long l, Long l2, JSONObject jSONObject) {
        HashMap hashMap = new HashMap();
        if (str != null) {
            hashMap.put("category", str);
        }
        if (str3 != null) {
            hashMap.put("label", str3);
        }
        if (l != null) {
            hashMap.put("value", l);
        }
        if (l2 != null) {
            hashMap.put("ext_value", l2);
        }
        if (jSONObject != null) {
            hashMap.put("ext_json", jSONObject);
        }
        LIZJ(new FMU(8, str2, hashMap));
    }
}
