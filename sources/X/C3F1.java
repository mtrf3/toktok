package X;

import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.3F1, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3F1 extends AbstractC65781Prl implements InterfaceC88472Yns<JSONObject, C76800UCe> {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ long LJLJI;
    public final /* synthetic */ int LJLJJI;
    public final /* synthetic */ int LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3F1(int i, int i2, int i3, long j, String str) {
        super(1);
        this.LJLIL = str;
        this.LJLILLLLZI = i;
        this.LJLJI = j;
        this.LJLJJI = i2;
        this.LJLJJL = i3;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(JSONObject jSONObject) {
        Object LIZ;
        JSONObject sendEventTrackingAsync = jSONObject;
        o.LJIIIZ(sendEventTrackingAsync, "$this$sendEventTrackingAsync");
        String str = this.LJLIL;
        int i = this.LJLILLLLZI;
        long j = this.LJLJI;
        int i2 = this.LJLJJI;
        int i3 = this.LJLJJL;
        try {
            sendEventTrackingAsync.put("enter_from", str);
            sendEventTrackingAsync.put("is_success", i);
            sendEventTrackingAsync.put("duration", j);
            sendEventTrackingAsync.put("request_type", i2);
            LIZ = sendEventTrackingAsync.put("fetched_story_cnt", i3);
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        C3C5.m10exceptionOrNullimpl(LIZ);
        return C76800UCe.LIZ;
    }
}
