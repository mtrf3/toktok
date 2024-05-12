package X;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.crash.AttachUserData;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.Npth;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: X.PEw, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64130PEw implements AttachUserData {
    public final /* synthetic */ PF0 LIZ;

    public C64130PEw(C64129PEv c64129PEv) {
        this.LIZ = c64129PEv;
    }

    @Override // com.bytedance.crash.AttachUserData
    public final java.util.Map<? extends String, ? extends String> getUserData(CrashType crashType) {
        ((C64129PEv) this.LIZ).LIZ.getClass();
        HashMap hashMap = new HashMap();
        JSONObject LIZ = C64125PEr.LIZLLL().LIZ();
        Iterator<String> keys = LIZ.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            hashMap.put(next, LIZ.optString(next));
        }
        HashMap hashMap2 = new HashMap();
        String LIZJ = C25500zK.LIZJ(SystemClock.uptimeMillis(), C25500zK.LIZIZ(0L, SystemClock.uptimeMillis()));
        if (!TextUtils.isEmpty(LIZJ)) {
            hashMap.put("evil_method", LIZJ);
            hashMap2.put("with_evil_method", "true");
        } else {
            hashMap2.put("with_evil_method", "false");
        }
        C64125PEr LIZLLL = C64125PEr.LIZLLL();
        SystemClock.uptimeMillis();
        LIZLLL.getClass();
        if (TextUtils.isEmpty(null)) {
            hashMap2.put("with_stack_trace", "false");
            hashMap2.put("with_apm_trace", String.valueOf(C64102PDu.LIZ(2)));
            if (PFS.LIZ != null && C64131PEx.LIZ != null) {
                Npth.addTags(hashMap2);
            }
            return hashMap;
        }
        throw null;
    }
}
