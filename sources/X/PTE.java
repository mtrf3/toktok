package X;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes12.dex */
public final class PTE {
    public static final PTE LIZIZ = new PTE();
    public final List<PTD> LIZ = new CopyOnWriteArrayList();

    public final PTF LIZ(EnumC65856Psy enumC65856Psy, Throwable th) {
        String trim;
        if (enumC65856Psy != null && th != null && ((CopyOnWriteArrayList) this.LIZ).size() != 0) {
            Iterator it = ((CopyOnWriteArrayList) this.LIZ).iterator();
            while (it.hasNext()) {
                PTD ptd = (PTD) it.next();
                ptd.getClass();
                if (enumC65856Psy.getName().equals(ptd.LIZIZ)) {
                    StackTraceElement[] stackTrace = th.getStackTrace();
                    int i = -1;
                    int i2 = 0;
                    while (i < stackTrace.length && i2 < ptd.LIZ.length) {
                        if (i == -1) {
                            trim = th.toString().trim();
                        } else {
                            trim = stackTrace[i].toString().trim();
                        }
                        i++;
                        if (trim.contains(ptd.LIZ[i2].trim())) {
                            i2++;
                        }
                    }
                    if (i2 == ptd.LIZ.length && ptd.LIZLLL != null) {
                        if ("string".equals(ptd.LIZJ)) {
                            PTC.LIZJ(ptd.LIZJ);
                            return new PTF(ptd.LIZLLL.LJJIFFI());
                        }
                        if ("byte".equals(ptd.LIZJ)) {
                            PTC.LIZJ(ptd.LIZJ);
                            return new PTF(Byte.valueOf(ptd.LIZLLL.LJII()));
                        }
                        if ("short".equals(ptd.LIZJ)) {
                            PTC.LIZJ(ptd.LIZJ);
                            return new PTF(Short.valueOf(ptd.LIZLLL.LJJI()));
                        }
                        if ("int".equals(ptd.LIZJ)) {
                            PTC.LIZJ(ptd.LIZJ);
                            return new PTF(Integer.valueOf(ptd.LIZLLL.LJIILJJIL()));
                        }
                        if ("long".equals(ptd.LIZJ)) {
                            PTC.LIZJ(ptd.LIZJ);
                            return new PTF(Long.valueOf(ptd.LIZLLL.LJIJJLI()));
                        }
                        if ("float".equals(ptd.LIZJ)) {
                            PTC.LIZJ(ptd.LIZJ);
                            return new PTF(Float.valueOf(ptd.LIZLLL.LJIIJ()));
                        }
                        if ("double".equals(ptd.LIZJ)) {
                            PTC.LIZJ(ptd.LIZJ);
                            return new PTF(Double.valueOf(ptd.LIZLLL.LJIIIZ()));
                        }
                        if ("boolean".equals(ptd.LIZJ)) {
                            PTC.LIZJ(ptd.LIZJ);
                            return new PTF(Boolean.valueOf(ptd.LIZLLL.LJFF()));
                        }
                        if ("jsonElement".equals(ptd.LIZJ)) {
                            PTC.LIZJ(ptd.LIZJ);
                            return new PTF(ptd.LIZLLL);
                        }
                        if ("null".equals(ptd.LIZJ)) {
                            PTC.LIZJ(ptd.LIZJ);
                            return new PTF(null);
                        }
                    }
                }
            }
        }
        return null;
    }
}
