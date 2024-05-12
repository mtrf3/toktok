package X;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Build;
import android.os.SystemClock;
import com.bytedance.common.utility.reflect.Reflect;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.1nt, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C43891nt extends AbstractC35391aB<C35761am> implements InterfaceC20100qc {
    public int[] LJ;
    public int LJFF;
    public final List<Long> LJI;
    public int LJII;
    public final Object LJIIIIZZ;
    public final List<Long> LJIIIZ;

    @Override // X.InterfaceC20100qc
    public final String LIZ() {
        return "android.app.IAlarmManager";
    }

    @Override // X.InterfaceC23150vX
    public final void LIZIZ() {
        this.LIZJ = true;
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (this.LJIIIIZZ) {
            ((ArrayList) this.LJI).add(Long.valueOf(currentTimeMillis));
        }
    }

    @Override // X.InterfaceC23150vX
    public final void LJI() {
        this.LIZJ = false;
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (this.LJIIIIZZ) {
            ((ArrayList) this.LJI).add(Long.valueOf(currentTimeMillis));
        }
    }

    public C43891nt() {
        super("alarm");
        this.LJI = new ArrayList();
        this.LJIIIIZZ = new Object();
        this.LJIIIZ = new ArrayList();
    }

    public final void LJIIIIZZ(Object[] objArr) {
        long j;
        String str;
        C35761am c35761am = new C35761am();
        boolean z = false;
        int i = 0;
        int i2 = -1;
        for (Object obj : objArr) {
            if ((obj instanceof Integer) && !z) {
                c35761am.LJ = ((Integer) obj).intValue();
                z = true;
            } else if (obj instanceof Long) {
                if (i == 0) {
                    long longValue = ((Long) obj).longValue();
                    c35761am.LIZ = longValue;
                    int i3 = c35761am.LJ;
                    if (i3 != 1 && i3 != 0) {
                        longValue = (System.currentTimeMillis() + longValue) - SystemClock.elapsedRealtime();
                    }
                    c35761am.LIZ = longValue;
                } else if (i == 2) {
                    c35761am.LJFF = ((Long) obj).longValue();
                }
                i++;
            } else if (obj instanceof PendingIntent) {
                PendingIntent pendingIntent = (PendingIntent) obj;
                if (Build.VERSION.SDK_INT <= 23 && pendingIntent != null) {
                    str = ((Intent) Reflect.on(pendingIntent).call("getIntent").get()).toString();
                } else {
                    str = "";
                }
                c35761am.LJI = str;
                i2 = pendingIntent.hashCode();
            }
        }
        if (i2 != -1) {
            if (c35761am.LJFF == 0) {
                j = c35761am.LIZ;
            } else {
                j = -1;
            }
            c35761am.LIZIZ = j;
            if (C14570hh.LIZ.LJLLI) {
                c35761am.LIZJ = C16880lQ.LLLLIIIILLL().getName();
                c35761am.LIZLLL = C16880lQ.LLLLIIIILLL().getStackTrace();
            }
            this.LIZLLL.put(Integer.valueOf(i2), c35761am);
        }
    }

    @Override // X.InterfaceC23150vX
    public final void LIZJ(C21270sV c21270sV, IRT irt) {
        if (!this.LIZ.equals(irt.LIZLLL)) {
            return;
        }
        if (!irt.LIZIZ) {
            c21270sV.LJIIJ += irt.LJI;
        } else {
            c21270sV.LJFF += irt.LJI;
        }
    }

    @Override // X.InterfaceC20100qc
    public final void LJ(Method method, Object[] objArr) {
        int i;
        try {
            String name = method.getName();
            if ("set".equals(name)) {
                LJIIIIZZ(objArr);
                return;
            }
            if ("remove".equals(name)) {
                Object obj = objArr[0];
                if (obj != null && (obj instanceof PendingIntent)) {
                    i = obj.hashCode();
                } else {
                    i = -1;
                }
                C35761am c35761am = (C35761am) this.LIZLLL.get(Integer.valueOf(i));
                if (c35761am != null && c35761am.LJFF > 0) {
                    c35761am.LIZIZ = System.currentTimeMillis();
                    this.LIZLLL.put(Integer.valueOf(i), c35761am);
                }
            }
        } catch (Exception unused) {
        }
    }

    @Override // X.AbstractC35391aB
    public final void LJII(long j, long j2) {
        int i = 0;
        this.LJFF = 0;
        this.LJ = new int[2];
        ((ArrayList) this.LJIIIZ).add(Long.valueOf(j));
        synchronized (this.LJIIIIZZ) {
            ((ArrayList) this.LJIIIZ).addAll(this.LJI);
            ((ArrayList) this.LJI).clear();
        }
        ((ArrayList) this.LJIIIZ).add(Long.valueOf(j2));
        this.LJII = 1;
        while (this.LJII < ((ArrayList) this.LJIIIZ).size()) {
            super.LJII(((Long) ListProtector.get(this.LJIIIZ, this.LJII - 1)).longValue(), ((Long) ListProtector.get(this.LJIIIZ, this.LJII)).longValue());
            this.LJII++;
        }
        int[] iArr = this.LJ;
        if (iArr[0] + iArr[1] != 0) {
            int size = ((ArrayList) this.LJIIIZ).size();
            long currentTimeMillis = System.currentTimeMillis();
            if (!this.LIZJ ? size % 2 != 1 : size % 2 != 0) {
                C21260sU c21260sU = C21250sT.LIZ;
                c21260sU.LIZJ(new IRT(currentTimeMillis, iArr[0], this.LIZ, true));
                c21260sU.LIZJ(new IRT(currentTimeMillis, iArr[1], this.LIZ, false));
            } else {
                C21260sU c21260sU2 = C21250sT.LIZ;
                c21260sU2.LIZJ(new IRT(currentTimeMillis, iArr[0], this.LIZ, false));
                c21260sU2.LIZJ(new IRT(currentTimeMillis, iArr[1], this.LIZ, true));
            }
        }
        ((ArrayList) this.LJIIIZ).clear();
        long currentTimeMillis2 = System.currentTimeMillis();
        int[] iArr2 = this.LJ;
        double d = iArr2[0] + iArr2[1];
        double d2 = currentTimeMillis2 - this.LIZIZ;
        double d3 = (d / d2) * 60000.0d * 10.0d;
        double d4 = (this.LJFF / d2) * 60000.0d * 10.0d;
        if (d3 >= MPE.LJLJJL) {
            i = 49;
        }
        if (d4 >= MPE.LJLJJLL) {
            i |= 50;
        }
        if (i == 0) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("issue_type", i).put("wake_up_count", d3).put("normal_count", d4);
            ConcurrentHashMap<Integer, T> concurrentHashMap = this.LIZLLL;
            if (concurrentHashMap != 0 && concurrentHashMap.size() > 0) {
                JSONArray jSONArray = new JSONArray();
                Iterator it = this.LIZLLL.values().iterator();
                while (it.hasNext()) {
                    jSONArray.put(((C35761am) it.next()).LIZIZ());
                }
                jSONObject.put("detail", jSONArray);
            }
            PED.LIZ(jSONObject);
            C64089PDh.LJIIJ().LIZLLL(new PEE("battery_trace", jSONObject));
        } catch (Throwable unused) {
        }
    }

    @Override // X.AbstractC35391aB
    public final void LJFF(C35761am c35761am, long j, long j2) {
        int i;
        C35761am c35761am2 = c35761am;
        long j3 = c35761am2.LJFF;
        if (j3 <= 0) {
            long j4 = c35761am2.LIZ;
            if (j <= j4 && j4 <= j2) {
                i = 1;
            } else {
                return;
            }
        } else {
            long j5 = c35761am2.LIZ;
            if (j5 < j) {
                j5 = (j + j3) - ((j - j5) % j3);
            }
            long j6 = c35761am2.LIZIZ;
            if (j6 <= j2 && j6 > 0) {
                j2 = j6;
            }
            long j7 = j2 - j5;
            if (j7 <= 0) {
                return;
            } else {
                i = ((int) (j7 / j3)) + 1;
            }
        }
        int i2 = c35761am2.LJ;
        if (i2 == 2 || i2 == 0) {
            int[] iArr = this.LJ;
            int i3 = this.LJII % 2;
            iArr[i3] = iArr[i3] + i;
            return;
        }
        this.LJFF += i;
    }
}
