package X;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes12.dex */
public final class PHE {
    public java.util.Map<String, PHI> LIZ;
    public java.util.Map<String, PHI> LIZIZ;
    public final int LIZJ = Math.min(3, 25);
    public int LIZLLL = 0;

    public final synchronized void LIZ(long j, String str, String str2) {
        if (this.LIZIZ == null) {
            this.LIZIZ = new HashMap();
        }
        if (((HashMap) this.LIZIZ).containsKey(str)) {
            PHI phi = (PHI) ((HashMap) this.LIZIZ).get(str);
            phi.LJLJJI++;
            phi.LJLJJL = System.currentTimeMillis();
            int i = phi.LJLJJI;
            if (i > this.LIZLLL) {
                this.LIZLLL = i;
            }
        } else {
            java.util.Map<String, PHI> map = this.LIZ;
            if (map != null) {
                long j2 = Long.MAX_VALUE;
                String str3 = null;
                if (((HashMap) map).containsKey(str)) {
                    PHI phi2 = (PHI) ((HashMap) this.LIZ).get(str);
                    int i2 = phi2.LJLJJI;
                    phi2.LJLJJI = i2 + 1;
                    phi2.LJLJJL = System.currentTimeMillis();
                    if (i2 > this.LIZJ) {
                        ((HashMap) this.LIZ).remove(str);
                        if (((HashMap) this.LIZIZ).size() >= 20) {
                            long currentTimeMillis = ((System.currentTimeMillis() - 0) / 2) + 0;
                            for (Map.Entry entry : ((HashMap) this.LIZIZ).entrySet()) {
                                if (((PHI) entry.getValue()).LJLJJL < currentTimeMillis && ((PHI) entry.getValue()).LJLJJI < j2) {
                                    j2 = ((PHI) entry.getValue()).LJLJJI;
                                    str3 = ((PHI) entry.getValue()).LJLIL;
                                }
                            }
                            if (str3 != null) {
                                ((HashMap) this.LIZIZ).remove(str3);
                            }
                        }
                        ((HashMap) this.LIZIZ).put(str, phi2);
                    }
                } else {
                    if (((HashMap) this.LIZ).size() >= 50) {
                        for (Map.Entry entry2 : ((HashMap) this.LIZ).entrySet()) {
                            if (((PHI) entry2.getValue()).LJLJJL < j2) {
                                j2 = ((PHI) entry2.getValue()).LJLJJL;
                                str3 = ((PHI) entry2.getValue()).LJLIL;
                            }
                        }
                        if (str3 != null) {
                            ((HashMap) this.LIZ).remove(str3);
                        }
                    }
                    ((HashMap) this.LIZ).put(str, new PHI(str, j, str2));
                }
            } else {
                HashMap hashMap = new HashMap();
                this.LIZ = hashMap;
                hashMap.put(str, new PHI(str, j, str2));
            }
        }
    }
}
