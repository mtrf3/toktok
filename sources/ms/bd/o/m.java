package ms.bd.o;

import ms.bd.o.b;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public abstract class m extends b.a {
    public static m LIZ;

    @Override // ms.bd.o.b.a
    public final Object LIZ(int i, int i2, long j, String str, Object obj) {
        if (i == 131073) {
            if (str == null || !LJ(str)) {
                return null;
            }
            return k.a(16777217, 0, 0L, "ca7fc2", new byte[]{93, 72});
        }
        if (i == 131074) {
            String[] strArr = (String[]) obj;
            if (str != null && strArr != null && strArr.length != 0) {
                LIZLLL(str, new JSONObject(strArr[0]), new JSONObject(strArr[1]), new JSONObject(strArr[2]));
            }
        }
        return null;
    }

    public abstract void LIZJ(long j, long j2, String str, String str2, int i);

    public abstract void LIZLLL(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3);

    public abstract boolean LJ(String str);

    public abstract void LJFF(long j, long j2, String str, String str2, int i);

    /* loaded from: classes7.dex */
    public static class a {
        public long LIZ;
        public String LIZIZ;

        public final void LIZ(int i, String str) {
            m mVar;
            synchronized (m.class) {
                mVar = m.LIZ;
            }
            if (mVar == null) {
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            long j = this.LIZ;
            mVar.LIZJ(currentTimeMillis - j, j, this.LIZIZ, str, i);
        }

        public final void LIZIZ(String str, int i) {
            m mVar;
            synchronized (m.class) {
                mVar = m.LIZ;
            }
            if (mVar == null) {
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            long j = this.LIZ;
            mVar.LJFF(currentTimeMillis - j, j, this.LIZIZ, str, i);
        }
    }
}
