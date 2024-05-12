package X;

import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class PBJ {
    public final byte[] LIZ;

    public final String toString() {
        try {
            return new JSONObject(new String(this.LIZ)).toString();
        } catch (Exception unused) {
            return "";
        }
    }

    public PBJ(byte[] bArr) {
        this.LIZ = bArr;
    }
}
