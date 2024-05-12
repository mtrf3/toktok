package X;

import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.7mu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C196167mu extends AbstractC65781Prl implements InterfaceC88472Yns<JSONObject, C76800UCe> {
    public final /* synthetic */ long LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ int LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C196167mu(int i, int i2, long j, String str) {
        super(1);
        this.LJLIL = j;
        this.LJLILLLLZI = str;
        this.LJLJI = i;
        this.LJLJJI = i2;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(JSONObject jSONObject) {
        JSONObject sendEventTracking = jSONObject;
        o.LJIIIZ(sendEventTracking, "$this$sendEventTracking");
        sendEventTracking.put("duration", this.LJLIL);
        sendEventTracking.put("enter_from", C196157mt.LIZ);
        sendEventTracking.put("now_type", this.LJLILLLLZI);
        sendEventTracking.put("has_small_window", this.LJLJI);
        sendEventTracking.put("is_now_clear", this.LJLJJI);
        return C76800UCe.LIZ;
    }
}
