package X;

import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.3F3, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3F3 extends AbstractC65781Prl implements InterfaceC88472Yns<JSONObject, C76800UCe> {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ long LJLILLLLZI;
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ long LJLJJI;
    public final /* synthetic */ long LJLJJL;
    public final /* synthetic */ long LJLJJLL;
    public final /* synthetic */ int LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3F3(long j, int i, long j2, int i2, String str, long j3, long j4) {
        super(1);
        this.LJLIL = str;
        this.LJLILLLLZI = j;
        this.LJLJI = i;
        this.LJLJJI = j2;
        this.LJLJJL = j3;
        this.LJLJJLL = j4;
        this.LJLJL = i2;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(JSONObject jSONObject) {
        Object LIZ;
        JSONObject sendEventTrackingAsync = jSONObject;
        o.LJIIIZ(sendEventTrackingAsync, "$this$sendEventTrackingAsync");
        String str = this.LJLIL;
        long j = this.LJLILLLLZI;
        int i = this.LJLJI;
        long j2 = this.LJLJJI;
        long j3 = this.LJLJJL;
        long j4 = this.LJLJJLL;
        int i2 = this.LJLJL;
        try {
            sendEventTrackingAsync.put("enter_from", str);
            sendEventTrackingAsync.put("total_duration", j);
            sendEventTrackingAsync.put("displayed_item_cnt", i);
            sendEventTrackingAsync.put("request_trigger_duration", j2);
            sendEventTrackingAsync.put("request_duration", j3);
            sendEventTrackingAsync.put("response_handle_duration", j4);
            LIZ = sendEventTrackingAsync.put("story_exp_group", i2);
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        C3C5.m10exceptionOrNullimpl(LIZ);
        return C76800UCe.LIZ;
    }
}
