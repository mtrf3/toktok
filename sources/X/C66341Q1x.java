package X;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: X.Q1x, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66341Q1x {
    public final HashMap<Object, Q20> LIZ = new HashMap<>();
    public final HashMap<String, C66323Q1f> LIZIZ = new HashMap<>();
    public final ArrayList<C66342Q1y> LIZJ = new ArrayList<>();
    public final ArrayList<Q25> LIZLLL = new ArrayList<>();
    public final ArrayList<Q1P> LJ = new ArrayList<>();
    public final ArrayList<C66323Q1f> LJFF = new ArrayList<>();

    public final Q20 LIZ(Object obj) {
        Q20 q20 = this.LIZ.get(obj);
        if (q20 == null) {
            Q24 q24 = new Q24(obj);
            this.LIZ.put(obj, q24);
            return q24;
        }
        return q20;
    }

    public final C66342Q1y LIZIZ(String str) {
        Iterator<C66342Q1y> it = this.LIZJ.iterator();
        while (it.hasNext()) {
            C66342Q1y next = it.next();
            if (TextUtils.equals(next.LIZJ, str)) {
                return next;
            }
        }
        C66342Q1y c66342Q1y = new C66342Q1y(str);
        this.LIZJ.add(c66342Q1y);
        return c66342Q1y;
    }
}
