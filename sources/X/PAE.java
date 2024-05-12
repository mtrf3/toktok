package X;

import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class PAE {
    public final long LIZ;
    public final long LIZIZ;
    public final byte[] LIZJ;

    public final String toString() {
        try {
            return new JSONObject(new String(this.LIZJ)).toString();
        } catch (Exception unused) {
            return "";
        }
    }

    public PAE(long j, long j2, byte[] bArr) {
        this.LIZJ = bArr;
        this.LIZ = j2;
        this.LIZIZ = j;
    }
}
