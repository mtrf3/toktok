package X;

import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: X.IpY, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47808IpY implements InterfaceC47635Iml {
    public final ArrayList<String> LIZ = new ArrayList<>();
    public final C47634Imk LIZIZ;
    public volatile long LIZJ;

    public C47808IpY(C47634Imk c47634Imk) {
        this.LIZIZ = c47634Imk;
    }

    @Override // X.InterfaceC47635Iml
    public final void LIZ(boolean z, boolean z2) {
        this.LIZJ = System.currentTimeMillis();
        HashMap hashMap = new HashMap();
        hashMap.put("t", Long.valueOf(System.currentTimeMillis()));
        hashMap.put("bt", Integer.valueOf(z2 ? 1 : 0));
        hashMap.put("con", Integer.valueOf(z ? 1 : 0));
        this.LIZ.add(new JSONObject(hashMap).toString());
    }
}
