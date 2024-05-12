package X;

import org.json.JSONObject;

/* renamed from: X.QUu, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67092QUu {
    public static final /* synthetic */ InterfaceC74236TBo[] LIZ;
    public static final C62822Ol8 LIZIZ;

    static {
        TBR tbr = new TBR(C65352Pkq.LIZIZ(C67092QUu.class, "sync-sdk_release"), "CALLBACK_EXECUTORS", "getCALLBACK_EXECUTORS()Ljava/util/concurrent/ExecutorService;");
        C65352Pkq.LIZ.getClass();
        LIZ = new InterfaceC74236TBo[]{tbr};
        LIZIZ = C221108m2.LIZIZ(QV3.INSTANCE);
    }

    public static final JSONObject LIZ(QV2 qv2) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("sync_id", qv2.LIZ);
        jSONObject.put("cursor", qv2.LIZLLL);
        jSONObject.put("business", qv2.LJI);
        return jSONObject;
    }
}
