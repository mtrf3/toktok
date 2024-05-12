package X;

import com.bytedance.ies.bullet.service.popup.BulletPopUpFragment;
import org.json.JSONObject;

/* renamed from: X.Npp, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60565Npp implements F22 {
    public final Object LJLIL;

    @Override // X.F22
    public final String getName() {
        return "notification";
    }

    @Override // X.F22
    public final Object getParams() {
        return this.LJLIL;
    }

    public C60565Npp(BulletPopUpFragment bulletPopUpFragment) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("containerID", bulletPopUpFragment.wl());
        jSONObject.put("data", jSONObject2);
        jSONObject.put("eventName", "onClosePanel");
        this.LJLIL = jSONObject;
    }
}
