package X;

import android.os.IBinder;
import java.lang.reflect.Method;

/* renamed from: X.262, reason: invalid class name */
/* loaded from: classes.dex */
public final class AnonymousClass262 extends AbstractC43881ns<C35771an> implements InterfaceC20100qc {
    @Override // X.InterfaceC20100qc
    public final String LIZ() {
        return "android.os.IPowerManager";
    }

    public final void LJIIIIZZ(Object[] objArr) {
        Object obj;
        AbstractC24300xO abstractC24300xO;
        synchronized (this) {
            this.LJ++;
            if (this.LJ == 1) {
                this.LJII = System.currentTimeMillis();
            }
        }
        if (!C14570hh.LIZ.LJLLI || objArr.length > 6 || objArr.length < 4 || (obj = objArr[0]) == null || !(obj instanceof IBinder)) {
            return;
        }
        int hashCode = obj.hashCode();
        if (!this.LIZLLL.containsKey(Integer.valueOf(hashCode))) {
            C35771an c35771an = new C35771an();
            Object obj2 = objArr[1];
            if (obj2 != null && (obj2 instanceof Integer)) {
                c35771an.LJ = ((Integer) obj2).intValue();
                Object obj3 = objArr[2];
                if (obj3 != null && (obj3 instanceof String)) {
                    c35771an.LJFF = (String) obj3;
                    c35771an.LIZIZ = -1L;
                    abstractC24300xO = c35771an;
                } else {
                    return;
                }
            } else {
                return;
            }
        } else {
            AbstractC24300xO abstractC24300xO2 = (AbstractC24300xO) this.LIZLLL.get(Integer.valueOf(hashCode));
            abstractC24300xO = abstractC24300xO2;
            if (abstractC24300xO2 == null) {
                return;
            }
        }
        abstractC24300xO.LIZLLL = C16880lQ.LLLLIIIILLL().getStackTrace();
        abstractC24300xO.LIZJ = C16880lQ.LLLLIIIILLL().getName();
        abstractC24300xO.LIZ = System.currentTimeMillis();
        this.LIZLLL.put(Integer.valueOf(hashCode), abstractC24300xO);
    }

    public final void LJIIIZ(Object[] objArr) {
        Object obj;
        synchronized (this) {
            this.LJ--;
            if (this.LJ == 0) {
                F9U.LIZ.LIZJ(new RunnableC23130vV(this, this.LIZJ, System.currentTimeMillis() - this.LJII));
                this.LJII = -1L;
            }
        }
        if (C14570hh.LIZ.LJLLI && objArr.length == 2 && (obj = objArr[0]) != null && (obj instanceof IBinder)) {
            int hashCode = obj.hashCode();
            AbstractC24300xO abstractC24300xO = (AbstractC24300xO) this.LIZLLL.get(Integer.valueOf(hashCode));
            if (abstractC24300xO != null) {
                abstractC24300xO.LIZIZ = System.currentTimeMillis();
                this.LIZLLL.put(Integer.valueOf(hashCode), abstractC24300xO);
            }
        }
    }

    @Override // X.InterfaceC23150vX
    public final void LIZJ(C21270sV c21270sV, IRT irt) {
        if (this.LIZ.equals(irt.LIZLLL)) {
            if (irt.LIZIZ) {
                c21270sV.LJ += irt.LJI;
            } else {
                c21270sV.LJIIIZ += irt.LJI;
            }
        }
    }

    @Override // X.InterfaceC20100qc
    public final synchronized void LJ(Method method, Object[] objArr) {
        try {
            String name = method.getName();
            if ("acquireWakeLock".equals(name)) {
                LJIIIIZZ(objArr);
            } else if ("releaseWakeLock".equals(name)) {
                LJIIIZ(objArr);
            }
        } catch (Exception unused) {
        }
    }
}
