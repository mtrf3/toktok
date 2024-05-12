package X;

import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.3F2, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3F2 extends AbstractC65781Prl implements InterfaceC88472Yns<JSONObject, C76800UCe> {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ long LJLILLLLZI;
    public final /* synthetic */ String LJLJI = "story";
    public final /* synthetic */ int LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3F2(int i, String str, long j) {
        super(1);
        this.LJLIL = str;
        this.LJLILLLLZI = j;
        this.LJLJJI = i;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(JSONObject jSONObject) {
        Object LIZ;
        JSONObject sendEventTrackingAsync = jSONObject;
        o.LJIIIZ(sendEventTrackingAsync, "$this$sendEventTrackingAsync");
        String str = this.LJLIL;
        long j = this.LJLILLLLZI;
        String str2 = this.LJLJI;
        int i = this.LJLJJI;
        try {
            sendEventTrackingAsync.put("enter_from", str);
            sendEventTrackingAsync.put("duration", j);
            sendEventTrackingAsync.put("skylight_type", str2);
            LIZ = sendEventTrackingAsync.put("story_exp_group", i);
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        C3C5.m10exceptionOrNullimpl(LIZ);
        return C76800UCe.LIZ;
    }
}
