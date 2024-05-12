package X;

import java.util.HashMap;

/* loaded from: classes9.dex */
public final class IRV {
    public String LIZJ;
    public int LIZ = -1;
    public int LIZIZ = -1;
    public final HashMap<String, Object> LIZLLL = new HashMap<>();

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("VideoResponseInfo(isSuccess=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", status=");
        LIZ.append(this.LIZ);
        LIZ.append(", customMap=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", callback=");
        LIZ.append((Object) null);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZ(HashMap hashMap) {
        if (hashMap == null) {
            return;
        }
        for (Object obj : hashMap.keySet()) {
            Object obj2 = hashMap.get(obj);
            if (obj2 != null) {
                this.LIZLLL.put(obj, obj2);
            }
        }
    }
}
