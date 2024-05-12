package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.now.NowPostInfo;
import com.ss.android.ugc.feed.platform.panel.earphone.EarphonePlayerControl;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.7NV, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7NV extends AbstractC65781Prl implements InterfaceC88472Yns<JSONObject, C76800UCe> {
    public final /* synthetic */ C181847Bs LJLIL;
    public final /* synthetic */ InterfaceC194547kI LJLILLLLZI;
    public final /* synthetic */ long LJLJI;
    public final /* synthetic */ int LJLJJI;
    public final /* synthetic */ Integer LJLJJL;
    public final /* synthetic */ InterfaceC88472Yns<JSONObject, C76800UCe> LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7NV(int i, long j, InterfaceC194547kI interfaceC194547kI, C181847Bs c181847Bs, Integer num, InterfaceC88472Yns interfaceC88472Yns) {
        super(1);
        this.LJLIL = c181847Bs;
        this.LJLILLLLZI = interfaceC194547kI;
        this.LJLJI = j;
        this.LJLJJI = i;
        this.LJLJJL = num;
        this.LJLJJLL = interfaceC88472Yns;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(JSONObject jSONObject) {
        String str;
        String str2;
        String desc;
        int i;
        JSONObject sendEventTrackingAsync = jSONObject;
        o.LJIIIZ(sendEventTrackingAsync, "$this$sendEventTrackingAsync");
        sendEventTrackingAsync.put("earphone_status", EarphonePlayerControl.LJII().LIZJ() ? 1 : 0);
        sendEventTrackingAsync.put("enter_from", C7MK.LIZLLL(this.LJLIL.LJLILLLLZI, this.LJLILLLLZI));
        sendEventTrackingAsync.put("group_id", this.LJLILLLLZI.getAweme().getAid());
        sendEventTrackingAsync.put("author_id", this.LJLILLLLZI.getAweme().getAuthorUid());
        sendEventTrackingAsync.put("follow_status", this.LJLILLLLZI.getAweme().getFollowStatus());
        NowPostInfo nowPostInfo = this.LJLILLLLZI.getAweme().nowPostInfo;
        if (nowPostInfo == null || (str = nowPostInfo.getNowMediaType()) == null) {
            str = "post";
        }
        sendEventTrackingAsync.put("now_type", str);
        sendEventTrackingAsync.put("duration", this.LJLJI);
        sendEventTrackingAsync.put("enter_position", C7MK.LJ(this.LJLIL.LJLJJI, this.LJLILLLLZI));
        sendEventTrackingAsync.put("is_now_clear", this.LJLJJI);
        sendEventTrackingAsync.put("has_small_window", C78847Ux1.LJJIJIL(this.LJLILLLLZI));
        sendEventTrackingAsync.put("is_original", C78847Ux1.LJJJJ(this.LJLILLLLZI.getAweme()));
        if (this.LJLILLLLZI.LLLLIIIILLL()) {
            Integer num = this.LJLJJL;
            if (num != null) {
                i = num.intValue();
            } else {
                i = 0;
            }
            sendEventTrackingAsync.put("now_aggregate_rank", i + 1);
        }
        if (C185167Om.LIZIZ() == 0 || (desc = this.LJLILLLLZI.getAweme().getDesc()) == null || desc.length() == 0) {
            str2 = CardStruct.IStatusCode.DEFAULT;
        } else {
            str2 = "1";
        }
        sendEventTrackingAsync.put("caption_flag", str2);
        sendEventTrackingAsync.put("is_new_page", this.LJLIL.LJLIL.LIZIZ());
        if (o.LJ(this.LJLIL.LJLIL, C194147je.LIZ)) {
            sendEventTrackingAsync.put("previous_page", this.LJLIL.LJLJJL);
            sendEventTrackingAsync.put("now_tab_enter_method", this.LJLIL.LJLJJLL);
        }
        InterfaceC88472Yns<JSONObject, C76800UCe> interfaceC88472Yns = this.LJLJJLL;
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke(sendEventTrackingAsync);
        }
        return C76800UCe.LIZ;
    }
}
