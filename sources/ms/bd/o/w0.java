package ms.bd.o;

import android.hardware.SensorManager;
import java.math.BigDecimal;
import java.util.ArrayList;
import ms.bd.o.b;
import org.json.JSONArray;

/* loaded from: classes7.dex */
public final class w0 extends b.a {
    @Override // ms.bd.o.b.a
    public final Object LIZIZ(long j, int i, String str, Object obj) {
        JSONArray jSONArray;
        BigDecimal scale;
        e2 LIZ = e2.LIZ(a.LIZIZ.LIZ);
        synchronized (LIZ) {
            if (n2.LIZ() == 1) {
                synchronized (LIZ) {
                    try {
                        SensorManager sensorManager = LIZ.LJLIL;
                        if (sensorManager != null && (LIZ.LJLILLLLZI != 0 || e2.LIZLLL(LIZ.LJLIL, LIZ, e2.LIZJ(sensorManager)))) {
                            LIZ.LJLILLLLZI++;
                        }
                    } catch (Exception unused) {
                    }
                    try {
                        try {
                        } catch (Exception unused2) {
                            jSONArray = new JSONArray();
                            jSONArray.put(new BigDecimal(LIZ.LJLJJI[0]).setScale(2, 4));
                            jSONArray.put(new BigDecimal(LIZ.LJLJJI[1]).setScale(2, 4));
                            scale = new BigDecimal(LIZ.LJLJJI[2]).setScale(2, 4);
                        }
                        synchronized (LIZ) {
                            int i2 = 0;
                            while (LIZ.LJLJI == 0 && i2 < 10) {
                                i2++;
                                LIZ.wait(1000L);
                            }
                            jSONArray = new JSONArray();
                            jSONArray.put(new BigDecimal(LIZ.LJLJJI[0]).setScale(2, 4));
                            jSONArray.put(new BigDecimal(LIZ.LJLJJI[1]).setScale(2, 4));
                            scale = new BigDecimal(LIZ.LJLJJI[2]).setScale(2, 4);
                            jSONArray.put(scale);
                            LIZ.LIZIZ();
                            LIZ.LJLJI = 0;
                            ((ArrayList) LIZ.LJLJJL).add(jSONArray);
                            try {
                                int size = ((ArrayList) LIZ.LJLJJL).size();
                                if (size > 100) {
                                    ArrayList arrayList = new ArrayList(((ArrayList) LIZ.LJLJJL).subList(size - 50, size));
                                    ((ArrayList) LIZ.LJLJJL).clear();
                                    LIZ.LJLJJL = arrayList;
                                }
                            } catch (Throwable unused3) {
                            }
                        }
                    } catch (Throwable th) {
                        JSONArray jSONArray2 = new JSONArray();
                        jSONArray2.put(new BigDecimal(LIZ.LJLJJI[0]).setScale(2, 4));
                        jSONArray2.put(new BigDecimal(LIZ.LJLJJI[1]).setScale(2, 4));
                        jSONArray2.put(new BigDecimal(LIZ.LJLJJI[2]).setScale(2, 4));
                        LIZ.LIZIZ();
                        LIZ.LJLJI = 0;
                        throw th;
                    }
                }
            }
        }
        return null;
    }
}
