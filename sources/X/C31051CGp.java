package X;

import com.bytedance.android.livesdk.livesetting.message.LiveMtPbRequestsSetting;
import org.json.JSONObject;

/* renamed from: X.CGp, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31051CGp extends AbstractC65781Prl implements InterfaceC65784Pro<JSONObject> {
    public static final C31051CGp LJLIL = new C31051CGp();

    public C31051CGp() {
        super(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [org.json.JSONObject, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    @Override // X.InterfaceC65784Pro
    public final JSONObject invoke() {
        ?? r2;
        try {
            JSONObject jSONObject = new JSONObject(LiveMtPbRequestsSetting.INSTANCE.getValue().getSwitches());
            C3C5.m7constructorimpl(jSONObject);
            r2 = jSONObject;
        } catch (Throwable th) {
            C3C4 LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
            r2 = LIZ;
        }
        JSONObject jSONObject2 = new JSONObject();
        if (C3C5.m12isFailureimpl(r2)) {
            return jSONObject2;
        }
        return r2;
    }
}
