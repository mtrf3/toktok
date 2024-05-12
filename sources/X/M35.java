package X;

import android.graphics.Bitmap;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class M35 {
    public final java.util.Map<String, Bitmap> LIZ = new LinkedHashMap();
    public final java.util.Set<String> LIZIZ = new LinkedHashSet();
    public final Object LIZJ = new Object();
    public List<C191707fi> LIZLLL;
    public boolean LJ;
    public M36<C191707fi> LJFF;

    public final void LIZ(List<C191707fi> list) {
        o.LJIIIZ(list, "list");
        synchronized (this.LIZJ) {
            this.LIZLLL = list;
            ((LinkedHashMap) this.LIZ).clear();
            this.LIZIZ.clear();
            this.LJ = false;
            Iterator<C191707fi> it = list.iterator();
            while (it.hasNext()) {
                String str = it.next().LIZ;
                if (C78685UuP.LJJJZ(str)) {
                    this.LIZIZ.add(str);
                }
            }
        }
    }

    public final void LIZIZ(Bitmap bitmap, String poiId) {
        Collection<C191707fi> data;
        C191707fi c191707fi;
        o.LJIIIZ(poiId, "poiId");
        o.LJIIIZ(bitmap, "bitmap");
        synchronized (this.LIZJ) {
            if (this.LJ) {
                M36<C191707fi> m36 = this.LJFF;
                if (m36 != null && (data = m36.getData()) != null) {
                    Iterator<C191707fi> it = data.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            c191707fi = it.next();
                            C191707fi c191707fi2 = c191707fi;
                            if (o.LJ(c191707fi2.LIZ, poiId) && c191707fi2.LIZIZ == null) {
                                break;
                            }
                        } else {
                            c191707fi = null;
                            break;
                        }
                    }
                    C191707fi c191707fi3 = c191707fi;
                    if (c191707fi3 != null) {
                        C191707fi LIZLLL = C191707fi.LIZLLL(c191707fi3, bitmap, false, 125);
                        M36<C191707fi> m362 = this.LJFF;
                        if (m362 != null) {
                            m362.LIZJ(c191707fi3, LIZLLL);
                        }
                        M36<C191707fi> m363 = this.LJFF;
                        if (m363 != null) {
                            m363.LJIIIIZZ();
                        }
                    }
                }
            } else if (this.LIZIZ.contains(poiId)) {
                this.LIZ.put(poiId, bitmap);
            }
        }
    }
}
