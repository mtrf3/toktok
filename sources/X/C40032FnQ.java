package X;

import com.bytedance.crash.AttachUserData;
import com.bytedance.crash.CrashType;
import java.util.HashMap;

/* renamed from: X.FnQ, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40032FnQ implements AttachUserData {
    public final /* synthetic */ String LIZ;
    public final /* synthetic */ String LIZIZ;

    public C40032FnQ(String str, String str2) {
        this.LIZ = str;
        this.LIZIZ = str2;
    }

    @Override // com.bytedance.crash.AttachUserData
    public final java.util.Map<String, String> getUserData(CrashType crashType) {
        HashMap hashMap = new HashMap();
        hashMap.put(this.LIZIZ, this.LIZ);
        return hashMap;
    }
}
