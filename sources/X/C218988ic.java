package X;

import com.ss.android.ugc.aweme.addyours.model.UserInvitee;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.8ic, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C218988ic extends AbstractC65781Prl implements InterfaceC88472Yns<JSONObject, C76800UCe> {
    public final /* synthetic */ boolean LJLIL;
    public final /* synthetic */ C218978ib LJLILLLLZI;
    public final /* synthetic */ List<UserInvitee> LJLJI;
    public final /* synthetic */ List<Integer> LJLJJI;
    public final /* synthetic */ List<String> LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C218988ic(boolean z, C218978ib c218978ib, List<UserInvitee> list, List<Integer> list2, List<String> list3) {
        super(1);
        this.LJLIL = z;
        this.LJLILLLLZI = c218978ib;
        this.LJLJI = list;
        this.LJLJJI = list2;
        this.LJLJJL = list3;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(JSONObject jSONObject) {
        JSONObject sendEventTrackingAsync = jSONObject;
        o.LJIIIZ(sendEventTrackingAsync, "$this$sendEventTrackingAsync");
        sendEventTrackingAsync.put("is_success", this.LJLIL ? 1 : 0);
        sendEventTrackingAsync.put("enter_from", this.LJLILLLLZI.LIZ().get("enter_from"));
        sendEventTrackingAsync.put("enter_method", this.LJLILLLLZI.LIZ().get("enter_method"));
        sendEventTrackingAsync.put("add_yours_id", this.LJLILLLLZI.LIZ().get("topic_id"));
        sendEventTrackingAsync.put("invitee_cnt", this.LJLJI.size());
        sendEventTrackingAsync.put("add_yours_title", this.LJLILLLLZI.LIZ().get("extra_topic_title"));
        sendEventTrackingAsync.put("follow_status", ORZ.LLD(this.LJLJJI, ",", null, null, null, 62));
        sendEventTrackingAsync.put("invitee_uid", ORZ.LLD(this.LJLJJL, ",", null, null, null, 62));
        return C76800UCe.LIZ;
    }
}
