package X;

import java.util.HashMap;

/* renamed from: X.VOh, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79663VOh extends VNN {
    public String LIZLLL;
    public HashMap<String, Object> LJ;

    @Override // X.VNN
    public final java.util.Map<String, Object> LIZ() {
        HashMap<String, Object> hashMap = this.LJ;
        if (hashMap == null) {
            return null;
        }
        return hashMap;
    }

    @Override // X.VNN
    public final String LIZIZ() {
        String str = this.LIZLLL;
        if (str != null) {
            return str;
        }
        return "params";
    }

    public C79663VOh(int i, String str) {
        super(i, str);
    }
}
