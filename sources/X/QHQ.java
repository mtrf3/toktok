package X;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class QHQ implements QHZ {
    public final N3D LIZ;
    public final QI4 LIZIZ;

    public QHQ(QI4 qi4, N3D n3d) {
        this.LIZIZ = qi4;
        this.LIZ = n3d;
        QI0.LIZIZ("sampling_config", new QHF(qi4, n3d));
    }

    @Override // X.QHZ
    public final boolean LIZ(QIQ qiq, String str, String str2) {
        java.util.Map<String, List<java.util.Set<String>>> map;
        java.util.Map<String, List<java.util.Map<String, Object>>> map2;
        boolean z = false;
        if (!QIQ.event_v3.equals(qiq) && !QIQ.log_data.equals(qiq)) {
            return false;
        }
        N3D n3d = this.LIZ;
        QI3 qi3 = this.LIZIZ.LJLJI;
        N3H n3h = new N3H(qi3.LJIIIZ, qi3.LIZJ(), this.LIZIZ.LJLJI.LJI());
        this.LIZIZ.LJLJI.getClass();
        n3h.LIZJ = String.valueOf(this.LIZIZ.LJLLI.LIZ);
        Iterator it = ((ArrayList) n3d.LIZJ).iterator();
        while (it.hasNext()) {
            N3C n3c = (N3C) it.next();
            n3c.getClass();
            if (!TextUtils.isEmpty(str)) {
                java.util.Set<String> set = n3c.LIZIZ;
                if (set == null || !set.contains(str)) {
                    if (!TextUtils.isEmpty(str2) && (((map = n3c.LIZJ) != null && map.containsKey(str)) || ((map2 = n3c.LIZLLL) != null && map2.containsKey(str)))) {
                        try {
                            if (n3c.LIZIZ(str, new JSONObject(str2))) {
                            }
                        } catch (Throwable unused) {
                            continue;
                        }
                    }
                }
                z = n3c.LIZJ(n3h);
                if (z) {
                    this.LIZIZ.LJLJI.LIZLLL.LJ(qiq, QIK.f_sampling);
                    this.LIZIZ.LJLJI.LIZLLL.LJIIIIZZ(QIQ.sampling_event, str);
                }
                return z;
            }
        }
        return z;
    }
}
