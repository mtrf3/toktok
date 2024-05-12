package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicEffectStrategySettingSetting;
import org.json.JSONObject;

/* renamed from: X.MxW, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58494MxW extends AbstractC65781Prl implements InterfaceC65784Pro<JSONObject> {
    public static final C58494MxW LJLIL = new C58494MxW();

    public C58494MxW() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final JSONObject invoke() {
        try {
            return new JSONObject(LinkMicEffectStrategySettingSetting.INSTANCE.getValue());
        } catch (Throwable unused) {
            return null;
        }
    }
}
