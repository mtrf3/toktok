package X;

import android.text.TextUtils;
import java.util.HashMap;

/* loaded from: classes12.dex */
public final class PA3 implements PA0 {
    public final QH8 LIZ;

    public PA3(QI3 qi3) {
        this.LIZ = qi3.LJFF;
    }

    @Override // X.PA0
    public final String LIZIZ(String str, byte[] bArr) {
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty("application/json; charset=utf-8")) {
            hashMap.put("Content-Type", "application/json; charset=utf-8");
        }
        return post(str, hashMap, bArr);
    }

    @Override // X.PA0
    public final String get(String str, java.util.Map<String, String> map) {
        return this.LIZ.LJI(0, str, (HashMap) map, null, 0).LIZ;
    }

    @Override // X.PA0
    public final byte[] LIZ(String str, java.util.Map map, byte[] bArr) {
        return this.LIZ.LJI(1, str, (HashMap) map, bArr, 1).LIZIZ;
    }

    @Override // X.PA0
    public final String post(String str, java.util.Map map, byte[] bArr) {
        return this.LIZ.LJI(1, str, (HashMap) map, bArr, 0).LIZ;
    }
}
