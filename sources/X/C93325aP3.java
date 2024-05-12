package X;

import com.bytedance.crash.AttachUserData;
import com.bytedance.crash.CrashType;
import com.bytedance.pitaya.thirdcomponent.crash.CrashExtraInfoCallback;

/* renamed from: X.aP3, reason: case insensitive filesystem */
/* loaded from: classes30.dex */
public final class C93325aP3 implements AttachUserData {
    public final /* synthetic */ CrashExtraInfoCallback LIZ;

    public C93325aP3(CrashExtraInfoCallback crashExtraInfoCallback) {
        this.LIZ = crashExtraInfoCallback;
    }

    @Override // com.bytedance.crash.AttachUserData
    public final java.util.Map<String, String> getUserData(CrashType crashType) {
        return this.LIZ.getCrashExtraInfo();
    }
}
