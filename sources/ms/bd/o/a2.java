package ms.bd.o;

import X.C16880lQ;
import X.X1D;
import android.content.Context;
import android.text.TextUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;
import ms.bd.o.b2;

/* loaded from: classes7.dex */
public final class a2 implements b2.a {
    public final long LIZ;
    public final Context LIZIZ;
    public final c0 LIZJ;

    public a2(c0 c0Var, Context context, long j) {
        if (context == null) {
            throw new NullPointerException("context could not be null");
        }
        this.LIZJ = c0Var;
        this.LIZIZ = C16880lQ.LLLLL(context);
        this.LIZ = j;
    }

    @Override // ms.bd.o.b2.a
    public final void LIZ(String str) {
        this.LIZJ.LJFF = str;
        long j = this.LIZ;
        if (j != -1) {
            k.a(33554436, 0, j, str, this.LIZIZ);
        }
    }

    @Override // ms.bd.o.b2.a
    public final void LIZIZ(String str) {
        this.LIZJ.LIZJ = str;
        long j = this.LIZ;
        if (j != -1) {
            k.a(33554434, 0, j, str, this.LIZIZ);
        }
    }

    @Override // ms.bd.o.b2.a
    public final void LIZJ(String str) {
        ((HashMap) this.LIZJ.LJIILIIL).put("ms_settings_android", str);
        long j = this.LIZ;
        if (j != -1) {
            k.a(33554443, 0, j, "ms_settings_android", str);
        }
    }

    @Override // ms.bd.o.b2.a
    public final void LIZLLL(String str) {
        this.LIZJ.LJ = str;
        long j = this.LIZ;
        if (j != -1) {
            k.a(33554435, 0, j, str, this.LIZIZ);
        }
    }

    @Override // ms.bd.o.b2.a
    public final void LJ(String str) {
        if (this.LIZ != -1 && !TextUtils.isEmpty(str)) {
            k.a(33554433, 0, this.LIZ, str, this.LIZIZ);
        }
    }

    @Override // ms.bd.o.b2.a
    public final void LJFF(int i) {
        o2 LIZ = o2.LIZ();
        LIZ.getClass();
        try {
            if (((ReentrantLock) LIZ.LIZIZ).tryLock()) {
                while (LIZ.LIZ.size() > o2.LIZLLL) {
                    LIZ.LIZ.removeFirst();
                }
                LinkedList<String> linkedList = LIZ.LIZ;
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append(System.currentTimeMillis());
                LIZ2.append((String) k.a(16777217, 0, 0L, "359d1d", new byte[]{110}));
                LIZ2.append(i);
                linkedList.add(X1D.LIZIZ(LIZ2));
            }
        } catch (Throwable unused) {
        }
        LIZ.LIZIZ();
    }

    @Override // ms.bd.o.b2.a
    public final void LJI(int i) {
        long j = this.LIZ;
        if (j != -1) {
            k.a(33554441, i, j, null, null);
        }
    }

    @Override // ms.bd.o.b2.a
    public final Map<String, String> frameSign(String str, int i) {
        if (this.LIZ != -1) {
            HashMap hashMap = new HashMap();
            if (str == null || str.length() == 0) {
                return Collections.emptyMap();
            }
            String[] strArr = (String[]) k.a(33554442, i, this.LIZ, str, null);
            if ((strArr instanceof String[]) && strArr.length % 2 == 0) {
                for (int i2 = 0; i2 < strArr.length; i2 += 2) {
                    String str2 = strArr[i2];
                    String str3 = strArr[i2 + 1];
                    if (str2 != null && str3 != null) {
                        hashMap.put(str2, str3);
                    }
                }
            }
            return hashMap;
        }
        return Collections.emptyMap();
    }
}
