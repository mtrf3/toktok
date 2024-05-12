package X;

import android.text.TextUtils;
import java.util.List;
import java.util.UUID;
import org.json.JSONObject;

/* renamed from: X.1fF, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C38531fF extends AbstractC269213w {
    public int LJIIIZ;
    public final String LJIIJ;
    public final java.util.Map<String, String> LJIIJJI;
    public boolean LJIIL;
    public long LJIILIIL;

    public final String toString() {
        int size;
        String str;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("C2STrackEvent{adid:");
        LIZ.append(this.LIZJ);
        LIZ.append(",non_std_adid:");
        LIZ.append(this.LJ);
        LIZ.append(",usize:");
        List<String> list = this.LJFF;
        if (list == null) {
            size = 0;
        } else {
            size = list.size();
        }
        LIZ.append(size);
        LIZ.append(",key:");
        if (TextUtils.isEmpty(this.LIZIZ)) {
            str = "empty";
        } else {
            str = this.LIZIZ;
        }
        LIZ.append(str);
        LIZ.append(",label:");
        LIZ.append(this.LJIIJ);
        LIZ.append(",create_time:");
        LIZ.append(this.LJIIIIZZ);
        LIZ.append(",retry_when_network_available:");
        LIZ.append(this.LJIIL);
        LIZ.append(",expire_seconds:");
        return C0H1.LIZJ(LIZ, this.LJIILIIL, "}", LIZ);
    }

    public C38531fF(long j, List list, String str, boolean z, long j2, String str2, JSONObject jSONObject) {
        this(UUID.randomUUID().toString(), "c2s", j, list, str, z, j2, str2, jSONObject, 0, null);
    }

    public C38531fF(String str, String str2, long j, List<String> list, String str3, boolean z, long j2, String str4, JSONObject jSONObject, int i, java.util.Map<String, String> map) {
        super(str, str2, j, list, z, j2, str4, jSONObject);
        this.LJIIJ = "";
        this.LJIILIIL = -1L;
        this.LJIIJ = str3;
        this.LJIIIZ = i;
        this.LJIIJJI = map;
    }
}
