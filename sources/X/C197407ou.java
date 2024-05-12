package X;

import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.7ou, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C197407ou extends AbstractC65781Prl implements InterfaceC88472Yns<JSONObject, C76800UCe> {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ long LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C197407ou(String str, long j, boolean z) {
        super(1);
        this.LJLIL = str;
        this.LJLILLLLZI = j;
        this.LJLJI = z;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(JSONObject jSONObject) {
        JSONObject sendEventTracking = jSONObject;
        o.LJIIIZ(sendEventTracking, "$this$sendEventTracking");
        sendEventTracking.put("enter_from", this.LJLIL);
        sendEventTracking.put("duration", this.LJLILLLLZI);
        sendEventTracking.put("is_new_page", this.LJLJI ? 1 : 0);
        return C76800UCe.LIZ;
    }
}
