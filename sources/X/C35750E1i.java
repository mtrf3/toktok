package X;

import java.util.HashMap;

/* renamed from: X.E1i, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35750E1i {
    public HashMap<String, Object> LIZ;

    public final String toString() {
        int i;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("size:");
        HashMap<String, Object> hashMap = this.LIZ;
        if (hashMap != null) {
            i = hashMap.size();
        } else {
            i = 0;
        }
        LIZ.append(i);
        LIZ.append(" params:");
        LIZ.append(this.LIZ);
        return X1D.LIZIZ(LIZ);
    }

    public final Object LIZ(String str) {
        HashMap<String, Object> hashMap = this.LIZ;
        if (hashMap != null) {
            return hashMap.get(str);
        }
        return null;
    }

    public final void LIZIZ(Object obj, String str) {
        HashMap<String, Object> hashMap = this.LIZ;
        if (hashMap != null) {
            hashMap.put(str, obj);
            return;
        }
        HashMap<String, Object> hashMap2 = new HashMap<>();
        hashMap2.put(str, obj);
        this.LIZ = hashMap2;
    }
}
