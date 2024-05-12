package X;

import com.ss.android.ugc.aweme.addyours.model.UserInvitee;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.8ia, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C218968ia extends AbstractC65781Prl implements InterfaceC88472Yns<JSONObject, C76800UCe> {
    public final /* synthetic */ boolean LJLIL;
    public final /* synthetic */ C218978ib LJLILLLLZI;
    public final /* synthetic */ UserInvitee LJLJI;
    public final /* synthetic */ boolean LJLJJI;
    public final /* synthetic */ String LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C218968ia(boolean z, C218978ib c218978ib, UserInvitee userInvitee, boolean z2, String str) {
        super(1);
        this.LJLIL = z;
        this.LJLILLLLZI = c218978ib;
        this.LJLJI = userInvitee;
        this.LJLJJI = z2;
        this.LJLJJL = str;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(JSONObject jSONObject) {
        String str;
        boolean z;
        JSONObject sendEventTrackingAsync = jSONObject;
        o.LJIIIZ(sendEventTrackingAsync, "$this$sendEventTrackingAsync");
        if (this.LJLIL) {
            str = "select";
        } else {
            str = "cancel";
        }
        sendEventTrackingAsync.put("action_type", str);
        sendEventTrackingAsync.put("enter_from", this.LJLILLLLZI.LIZ().get("enter_from"));
        sendEventTrackingAsync.put("from_user_id", ((RBX) HG3.LJIILL()).getCurUserId());
        sendEventTrackingAsync.put("to_user_id", this.LJLJI.getUid());
        sendEventTrackingAsync.put("has_invited", C48841JEv.LJIJ(Boolean.valueOf(this.LJLJI.getInvited())));
        sendEventTrackingAsync.put("follow_status", C44729Hgz.LJIJ(this.LJLJI.getFollowerStatus(), this.LJLJI.getFollowerStatus()));
        if (this.LJLJJI || o.LJ(this.LJLJJL, "search")) {
            z = true;
        } else {
            z = false;
        }
        sendEventTrackingAsync.put("is_search_result", C48841JEv.LJIJ(Boolean.valueOf(z)));
        return C76800UCe.LIZ;
    }
}
