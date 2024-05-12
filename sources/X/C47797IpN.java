package X;

import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: X.IpN, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47797IpN {
    public int LIZ;
    public int LIZIZ;
    public int LIZJ;
    public int LIZLLL;
    public final ArrayList<String> LJ = new ArrayList<>();

    public final void LIZ(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("w", Integer.valueOf(i));
        hashMap.put("h", Integer.valueOf(i2));
        hashMap.put("t", Long.valueOf(System.currentTimeMillis()));
        try {
            C77117UOj.LIZJ(new JSONObject(hashMap).toString(), this.LJ);
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
        this.LIZ = 0;
        this.LIZIZ = 0;
    }
}
