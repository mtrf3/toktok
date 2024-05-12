package X;

import com.bytedance.crash.AttachUserData;
import com.bytedance.crash.CrashType;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;

/* loaded from: classes7.dex */
public class FIO implements AttachUserData {
    @Override // com.bytedance.crash.AttachUserData
    public final java.util.Map<? extends String, ? extends String> getUserData(CrashType crashType) {
        if (crashType == CrashType.ANR || crashType == CrashType.JAVA || crashType == CrashType.LAUNCH || crashType == CrashType.CUSTOM_JAVA || crashType == CrashType.NATIVE || crashType == CrashType.OOM) {
            return C03660Ck.LIZJ("ab_vids", GsonProtectorUtils.toJson(C75792yF.LIZIZ(), FHR.LIZ()));
        }
        return null;
    }
}
