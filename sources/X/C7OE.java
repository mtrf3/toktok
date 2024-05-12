package X;

import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.7OE, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7OE extends AbstractC65781Prl implements InterfaceC88472Yns<JSONObject, C76800UCe> {
    public final /* synthetic */ InterfaceC194547kI LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ String LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7OE(InterfaceC194547kI interfaceC194547kI, String str, String str2, String str3) {
        super(1);
        this.LJLIL = interfaceC194547kI;
        this.LJLILLLLZI = str;
        this.LJLJI = str2;
        this.LJLJJI = str3;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(JSONObject jSONObject) {
        JSONObject sendEventTracking = jSONObject;
        o.LJIIIZ(sendEventTracking, "$this$sendEventTracking");
        sendEventTracking.put("group_id", this.LJLIL.getAweme().getAid());
        sendEventTracking.put("author_id", this.LJLIL.getAweme().getAuthorUid());
        sendEventTracking.put("action_type", this.LJLILLLLZI);
        sendEventTracking.put("to_position", this.LJLJI);
        sendEventTracking.put("enter_from", this.LJLJJI);
        return C76800UCe.LIZ;
    }
}
