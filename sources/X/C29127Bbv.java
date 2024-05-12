package X;

import com.bytedance.crash.AttachUserData;
import com.bytedance.crash.CrashType;
import java.util.HashMap;

/* renamed from: X.Bbv, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29127Bbv implements AttachUserData {
    public static String LIZ = "";
    public static String LIZIZ = "";

    @Override // com.bytedance.crash.AttachUserData
    public final java.util.Map<? extends String, ? extends String> getUserData(CrashType crashType) {
        HashMap hashMap = new HashMap();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(LIZ);
        LIZ2.append(":");
        LIZ2.append(LIZIZ);
        hashMap.put("RecylerViewHolder", X1D.LIZIZ(LIZ2));
        return hashMap;
    }
}
