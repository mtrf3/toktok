package X;

import com.bytedance.crash.AttachUserData;
import com.bytedance.crash.CrashType;
import java.util.HashMap;

/* renamed from: X.BdQ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29220BdQ implements AttachUserData {
    public static String LIZ = "";
    public static int LIZIZ;

    public final String toString() {
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(LIZIZ);
        LIZ2.append(" bytes| thread name =");
        LIZ2.append(LIZ);
        return X1D.LIZIZ(LIZ2);
    }

    @Override // com.bytedance.crash.AttachUserData
    public final java.util.Map<? extends String, ? extends String> getUserData(CrashType crashType) {
        HashMap hashMap = new HashMap();
        hashMap.put("fresco-bitmap-alloc", toString());
        return hashMap;
    }
}
