package X;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.UUID;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class PA1 implements PA0 {
    public final QI3 LIZ;

    public PA1(QI3 qi3) {
        this.LIZ = qi3;
    }

    @Override // X.PA0
    public final String LIZIZ(String str, byte[] bArr) {
        HashMap hashMap = new HashMap(2);
        if (!TextUtils.isEmpty("application/json; charset=utf-8")) {
            hashMap.put("Content-Type", "application/json; charset=utf-8");
        }
        String LIZJ = LIZJ(str, hashMap, bArr);
        String LIZIZ = this.LIZ.LJFF().LIZIZ(str, bArr);
        LIZLLL(LIZJ, LIZIZ);
        return LIZIZ;
    }

    public final void LIZLLL(String str, String str2) {
        boolean z;
        if (str2 != null && str2.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            try {
                this.LIZ.LJFF.LJIIIIZZ(200, str, null, str2.getBytes("UTF-8"));
            } catch (Throwable unused) {
            }
        } else {
            this.LIZ.LJFF.LJIIIIZZ(-1, str, "BDInstall get response empty", null);
        }
    }

    @Override // X.PA0
    public final String get(String str, java.util.Map<String, String> map) {
        String uuid = UUID.randomUUID().toString();
        this.LIZ.LJFF.LJIIIZ(str, uuid, null, 0, map);
        String str2 = this.LIZ.LJFF().get(str, map);
        LIZLLL(uuid, str2);
        return str2;
    }

    @Override // X.PA0
    public final byte[] LIZ(String str, java.util.Map map, byte[] bArr) {
        String str2;
        String LIZJ = LIZJ(str, map, bArr);
        byte[] LIZ = this.LIZ.LJFF().LIZ(str, map, bArr);
        if (LIZ != null) {
            str2 = new String(LIZ);
        } else {
            str2 = "";
        }
        LIZLLL(LIZJ, str2);
        return LIZ;
    }

    public final String LIZJ(String str, java.util.Map map, byte[] bArr) {
        JSONObject jSONObject;
        String uuid = UUID.randomUUID().toString();
        try {
            jSONObject = new JSONObject(new String(bArr));
        } catch (Throwable unused) {
            jSONObject = null;
        }
        this.LIZ.LJFF.LJIIIZ(str, uuid, jSONObject, 1, map);
        return uuid;
    }

    @Override // X.PA0
    public final String post(String str, java.util.Map map, byte[] bArr) {
        String LIZJ = LIZJ(str, map, bArr);
        String post = this.LIZ.LJFF().post(str, map, bArr);
        LIZLLL(LIZJ, post);
        return post;
    }
}
