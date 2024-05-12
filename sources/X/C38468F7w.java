package X;

import com.bytedance.crash.AttachUserData;
import com.bytedance.crash.CrashType;

/* renamed from: X.F7w, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38468F7w implements AttachUserData {
    public final /* synthetic */ F80 LIZ;

    public C38468F7w(F80 f80) {
        this.LIZ = f80;
    }

    @Override // com.bytedance.crash.AttachUserData
    public final java.util.Map<? extends String, ? extends String> getUserData(CrashType crashType) {
        String str = (String) this.LIZ.LIZ.getValue();
        if (str == null) {
            str = "";
        }
        return E2C.LIZJ("live_sdk_version", str);
    }
}
