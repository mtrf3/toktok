package X;

import com.bytedance.crash.AttachUserData;
import com.bytedance.crash.CrashType;
import java.util.HashMap;

/* loaded from: classes7.dex */
public final class EUG implements AttachUserData {
    @Override // com.bytedance.crash.AttachUserData
    public final java.util.Map<? extends String, ? extends String> getUserData(CrashType crashType) {
        HashMap hashMap = new HashMap();
        hashMap.put("abtest/settings", EUF.LIZ());
        return hashMap;
    }
}
