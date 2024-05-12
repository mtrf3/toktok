package X;

import android.os.Process;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.IllegalFormatException;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* renamed from: X.13T, reason: invalid class name */
/* loaded from: classes.dex */
public final class C13T {
    public final Object LIZ;

    public /* synthetic */ C13T(String str) {
        int myUid = Process.myUid();
        int myPid = Process.myPid();
        StringBuilder sb = new StringBuilder(39);
        sb.append("UID: [");
        sb.append(myUid);
        sb.append("]  PID: [");
        sb.append(myPid);
        sb.append("] ");
        String valueOf = String.valueOf(sb.toString());
        this.LIZ = str.length() != 0 ? valueOf.concat(str) : new String(valueOf);
    }

    public C13T(int i) {
        if (i != 2) {
            this.LIZ = new HashMap();
        } else {
            this.LIZ = new C66341Q1x();
        }
    }

    public final float LIZLLL(String str, Object obj) {
        if (!((HashMap) this.LIZ).containsKey(obj)) {
            return Float.NaN;
        }
        HashMap hashMap = (HashMap) ((HashMap) this.LIZ).get(obj);
        if (!hashMap.containsKey(str)) {
            return Float.NaN;
        }
        float[] fArr = (float[]) hashMap.get(str);
        if (fArr.length <= 0) {
            return Float.NaN;
        }
        return fArr[0];
    }

    public static List LIZIZ(C66341Q1x c66341Q1x, Q3D q3d, int i) {
        ArrayList arrayList = new ArrayList();
        Q2L q2l = q3d.LIZ;
        if (q2l instanceof Q2E) {
            String str = ((Q2E) q2l).LIZ;
            HashMap<String, FTR<?>> hashMap = FJI.LIZ;
            if (hashMap.containsKey(str)) {
                arrayList.add(c66341Q1x.LIZ(hashMap.get(str).getValue()));
            } else if (Q16.LIZ.containsKey(str)) {
                C66342Q1y LIZIZ = c66341Q1x.LIZIZ(str);
                LIZIZ.LJFF = true;
                arrayList.add(LIZIZ);
            } else {
                arrayList.add(c66341Q1x.LIZIZ(str));
            }
        } else if (q2l instanceof Q2G) {
            arrayList.add(c66341Q1x.LIZ(((Q2G) q2l).LIZ));
        } else {
            if (q2l instanceof Q2H) {
                Q2V q2v = ((Q2H) q2l).LIZ;
                Q3B q3b = (Q3B) ((HashMap) Q31.LIZ).get(q2v.LIZ);
                if (q3b != null) {
                    List<Q20> LIZ = q3b.LIZ(c66341Q1x, q3d, i);
                    Iterator<Q20> it = LIZ.iterator();
                    while (it.hasNext()) {
                        it.next().LJFF(i);
                    }
                    return LIZ;
                }
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("unsupported graph build operator = ");
                LIZ2.append(q2v.LIZ);
                throw new IllegalArgumentException(X1D.LIZIZ(LIZ2));
            }
            if (q2l instanceof Q2D) {
                PQ5 pq5 = ((Q2D) q2l).LIZ;
                Q3B q3b2 = (Q3B) ((HashMap) Q31.LIZIZ).get(pq5.LIZ);
                if (q3b2 != null) {
                    List<Q20> LIZ3 = q3b2.LIZ(c66341Q1x, q3d, i);
                    Iterator<Q20> it2 = LIZ3.iterator();
                    while (it2.hasNext()) {
                        it2.next().LJFF(i);
                    }
                    return LIZ3;
                }
                StringBuilder LIZ4 = X1D.LIZ();
                LIZ4.append("unsupported graph build func = ");
                LIZ4.append(pq5.LIZ);
                throw new IllegalArgumentException(X1D.LIZIZ(LIZ4));
            }
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            ((Q20) it3.next()).LJFF(i);
        }
        return arrayList;
    }

    public final void LIZJ(String str, int i, Object[] objArr) {
        if (android.util.Log.isLoggable("PlayCore", i)) {
            Object obj = this.LIZ;
            if (objArr.length > 0) {
                try {
                    str = C16880lQ.LLLZI(Locale.US, str, objArr);
                } catch (IllegalFormatException unused) {
                    String valueOf = String.valueOf(str);
                    if (valueOf.length() != 0) {
                        "Unable to format ".concat(valueOf);
                    }
                    String join = TextUtils.join(", ", objArr);
                    int length = String.valueOf(str).length();
                    StringBuilder sb = new StringBuilder(length + 3 + String.valueOf(join).length());
                    sb.append(str);
                    sb.append(" [");
                    sb.append(join);
                    sb.append("]");
                    str = sb.toString();
                }
            }
            int length2 = String.valueOf(obj).length();
            new StringBuilder(length2 + 3 + String.valueOf(str).length());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZ(Q3D q3d, int i, String str, Q1P q1p) {
        C66341Q1x c66341Q1x = (C66341Q1x) this.LIZ;
        C66323Q1f c66323Q1f = c66341Q1x.LIZIZ.get(str);
        if (c66323Q1f == null) {
            c66323Q1f = new C66323Q1f(str);
            c66341Q1x.LIZIZ.put(str, c66323Q1f);
        }
        c66323Q1f.LIZIZ = i;
        try {
            ArrayList<Q3D> arrayList = q3d.LIZIZ;
            if (arrayList == null || arrayList.isEmpty()) {
                Q2L q2l = q3d.LIZ;
                if (q2l instanceof Q2G) {
                    T t = ((Q2G) q2l).LIZ;
                    if ((t instanceof Boolean) && ((Boolean) t).booleanValue()) {
                        ((C66341Q1x) this.LIZ).LJFF.add(c66323Q1f);
                        return;
                    }
                    return;
                }
            }
            Iterator it = LIZIZ((C66341Q1x) this.LIZ, q3d, i).iterator();
            while (it.hasNext()) {
                ((Q20) it.next()).LIZ(c66323Q1f);
            }
        } catch (Exception unused) {
            ((C66341Q1x) this.LIZ).LJ.add(q1p);
        }
    }
}
