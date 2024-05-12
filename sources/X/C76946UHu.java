package X;

import android.content.Context;
import java.util.HashMap;

/* renamed from: X.UHu, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76946UHu implements InterfaceC76948UHw {
    public final java.util.Map<String, InterfaceC76948UHw> LIZ;
    public final C76947UHv LIZIZ;

    public C76946UHu() {
        HashMap hashMap = new HashMap();
        this.LIZ = hashMap;
        C76947UHv c76947UHv = new C76947UHv();
        this.LIZIZ = c76947UHv;
        hashMap.put("android.permission.CAMERA", c76947UHv);
        hashMap.put("android.permission.RECORD_AUDIO", c76947UHv);
    }

    @Override // X.InterfaceC76948UHw
    public final boolean LIZ(Context context, String str) {
        if (((HashMap) this.LIZ).containsKey(str)) {
            return ((InterfaceC76948UHw) ((HashMap) this.LIZ).get(str)).LIZ(context, str);
        }
        return this.LIZIZ.LIZ(context, str);
    }
}
