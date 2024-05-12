package X;

import Y.AfS54S0200000_5;
import Y.AfS57S0100000_5;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.android.livesdk.api.revenue.subscription.api.SubscribeApi;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveSubscribeLynxUrl;
import com.bytedance.android.livesdk.subscribe.model.GetSubInfoResponse;
import com.bytedance.android.livesdk.subscribe.model.invite.SubAvailable;
import com.google.android.play.core.appupdate.u;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.C8n, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30841C8n implements InterfaceC72822Si2, C75 {
    public final String LJLIL;
    public Boolean LJLILLLLZI;
    public final List<InterfaceC30839C8l> LJLJI;
    public GetSubInfoResponse LJLJJI;
    public InterfaceC88472Yns<? super String, C76800UCe> LJLJJL;
    public boolean LJLJJLL;

    @Override // X.C75
    public final void onDestroy() {
        C72818Shy.LJII("anchor_subscribe_finished_guide", this);
        C72818Shy.LJII("anchor_subscribe_emotes_status_change", this);
        C72818Shy.LJII("anchor_subscribe_badge_status_change", this);
        C72818Shy.LJII("anchor_subscribe_status_submit_event", this);
        C72818Shy.LJII("anchor_subscribe_note_status_change", this);
        C72818Shy.LJII("anchor_sub_gift_balance_changed", this);
        C72818Shy.LJII("anchor_subscribe_c2c_trans_disagree", this);
    }

    public final void LJI() {
        if (TextUtils.isEmpty(((C29374Bfu) B83.LIZ().LIZIZ()).LIZIZ.getSecUid())) {
            return;
        }
        C30929CBx.LJIIJJI(C1EW.LIZ(((SubscribeApi) Q7L.LIZIZ(SubscribeApi.class)).getSubscribeInfo(true, ((C29374Bfu) B83.LIZ().LIZIZ()).LIZIZ.getSecUid(), true, this.LJLIL)), EnumC30931CBz.SUBINFO, this.LJLIL, C30843C8p.LJLIL).LJJJLIIL(new AfS57S0100000_5(this, 330), new AfS57S0100000_5(this, 331));
    }

    public C30841C8n(String str) {
        this.LJLIL = str;
        LJI();
        C72818Shy.LIZLLL("anchor_subscribe_finished_guide", this);
        C72818Shy.LIZLLL("anchor_subscribe_emotes_status_change", this);
        C72818Shy.LIZLLL("anchor_subscribe_badge_status_change", this);
        C72818Shy.LIZLLL("anchor_subscribe_status_submit_event", this);
        C72818Shy.LIZLLL("anchor_subscribe_note_status_change", this);
        C72818Shy.LIZLLL("anchor_sub_gift_balance_changed", this);
        C72818Shy.LIZLLL("anchor_subscribe_c2c_trans_disagree", this);
        this.LJLJI = new CopyOnWriteArrayList();
    }

    @Override // X.C75
    public final void LIZJ(InterfaceC30839C8l interfaceC30839C8l) {
        if (!((CopyOnWriteArrayList) this.LJLJI).contains(interfaceC30839C8l)) {
            ((CopyOnWriteArrayList) this.LJLJI).add(interfaceC30839C8l);
        }
    }

    @Override // X.C75
    public final void LJ(InterfaceC30844C8q interfaceC30844C8q) {
        if (this.LJLILLLLZI != null) {
            interfaceC30844C8q.LIZIZ(this.LJLJJI);
        } else {
            LIZJ(new C30842C8o(interfaceC30844C8q, this));
        }
    }

    @Override // X.C75
    public final void LJFF(AqS171S0100000_5 aqS171S0100000_5) {
        this.LJLJJL = aqS171S0100000_5;
    }

    @Override // X.InterfaceC72822Si2
    public final void onReceiveJsEvent(C199097rd c199097rd) {
        String str;
        String str2;
        InterfaceC78505UrV interfaceC78505UrV;
        String asString;
        String str3 = c199097rd.LJLIL;
        String str4 = "";
        switch (str3.hashCode()) {
            case -1809547272:
                str = "anchor_subscribe_emotes_status_change";
                break;
            case -606560159:
                if (!str3.equals("anchor_subscribe_status_submit_event")) {
                    return;
                }
                InterfaceC78280Uns interfaceC78280Uns = c199097rd.LJLILLLLZI;
                if (interfaceC78280Uns != null && (interfaceC78505UrV = interfaceC78280Uns.get("toast_text")) != null && (asString = interfaceC78505UrV.asString()) != null) {
                    str4 = asString;
                }
                if (TextUtils.isEmpty(str4)) {
                    return;
                }
                C30868C9o.LJI(str4);
                return;
            case -57187985:
                if (!str3.equals("anchor_subscribe_note_status_change")) {
                    return;
                }
                this.LJLJJLL = true;
                LJI();
                return;
            case 900742783:
                if (!str3.equals("anchor_subscribe_c2c_trans_disagree")) {
                    return;
                }
                LJI();
                return;
            case 1501615659:
                if (!str3.equals("anchor_sub_gift_balance_changed")) {
                    return;
                }
                long currentUserId = ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId();
                String LIZJ = ((C29374Bfu) B83.LIZ().LIZIZ()).LIZJ(currentUserId);
                InterfaceC78280Uns interfaceC78280Uns2 = c199097rd.LJLILLLLZI;
                Integer num = null;
                if (interfaceC78280Uns2 != null) {
                    str2 = u.LJJIJIL(interfaceC78280Uns2, "anchorUid", "");
                } else {
                    str2 = null;
                }
                InterfaceC78280Uns interfaceC78280Uns3 = c199097rd.LJLILLLLZI;
                if (interfaceC78280Uns3 != null) {
                    num = Integer.valueOf(u.LJJIJIIJI(interfaceC78280Uns3, "count", 0));
                }
                if (!o.LJ(LIZJ, str2) || LIZJ == null) {
                    return;
                }
                java.util.Map<Long, Integer> LIZJ2 = InterfaceC30442Bx8.K0.LIZJ();
                o.LJIIIIZZ(LIZJ2, "LIVE_SUB_GIFT_COUNT.value");
                LIZJ2.put(Long.valueOf(currentUserId), num);
                return;
            case 1836714626:
                str = "anchor_subscribe_badge_status_change";
                break;
            case 2137959118:
                if (!str3.equals("anchor_subscribe_finished_guide")) {
                    return;
                }
                InterfaceC30442Bx8.LJJZZIII.LIZJ(Boolean.TRUE);
                LJI();
                return;
            default:
                return;
        }
        str3.equals(str);
    }

    @Override // X.C75
    public final void LIZ(String str, C30800C6y c30800C6y) {
        C1EW.LIZ(((SubscribeApi) Q7L.LIZIZ(SubscribeApi.class)).getInvitationState(str)).LJJJLIIL(new AfS54S0200000_5(this, c30800C6y, 70), new AfS57S0100000_5(c30800C6y, 332));
    }

    @Override // X.C75
    public final void LIZIZ(String url, String enterFrom, String str, String liveType, Context context) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(url, "url");
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(liveType, "liveType");
        C31847Ceh.LJFF(context, url, enterFrom, enterFrom, str, null, null, null, false, null, null, liveType, 2016);
    }

    @Override // X.C75
    public final String LIZLLL(Context context, String str, String str2, boolean z, String liveType, InterfaceC65784Pro<C76800UCe> openSettingPage) {
        String anchor_user_guide_page;
        String str3;
        GetSubInfoResponse getSubInfoResponse;
        SubAvailable subAvailable;
        String str4 = str;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(liveType, "liveType");
        o.LJIIIZ(openSettingPage, "openSettingPage");
        Boolean bool = this.LJLILLLLZI;
        if (bool != null) {
            bool.booleanValue();
            if (str4 == null) {
                str4 = "live_take_page";
            }
            boolean z2 = false;
            if (z && (getSubInfoResponse = this.LJLJJI) != null && (subAvailable = getSubInfoResponse.subAvailable) != null && !subAvailable.isSubAvailable) {
                LiveSubscribeLynxUrl liveSubscribeLynxUrl = LiveSubscribeLynxUrl.INSTANCE;
                LIZIZ(liveSubscribeLynxUrl.getValue().getAnchorUserNotAvailablePage(), str4, str2, "", context);
                anchor_user_guide_page = liveSubscribeLynxUrl.getValue().getAnchorUserNotAvailablePage();
            } else {
                GetSubInfoResponse getSubInfoResponse2 = this.LJLJJI;
                if (getSubInfoResponse2 != null && getSubInfoResponse2.hasOptIn) {
                    openSettingPage.invoke();
                    anchor_user_guide_page = "subscribe_settings";
                } else {
                    LiveSubscribeLynxUrl liveSubscribeLynxUrl2 = LiveSubscribeLynxUrl.INSTANCE;
                    LIZIZ(liveSubscribeLynxUrl2.getValue().getAnchor_user_guide_page(), str4, str2, liveType, context);
                    anchor_user_guide_page = liveSubscribeLynxUrl2.getValue().getAnchor_user_guide_page();
                }
            }
            Boolean bool2 = this.LJLILLLLZI;
            JSONObject LIZLLL = FT5.LIZLLL("show_entrance", "live_take_page");
            if (anchor_user_guide_page == null) {
                str3 = "";
            } else {
                str3 = anchor_user_guide_page;
            }
            C05630Jz.LJI(LIZLLL, "to_page", str3);
            if (bool2 != null) {
                z2 = bool2.booleanValue();
            }
            C05630Jz.LJII(LIZLLL, "initialized", z2);
            C05630Jz.LJI(LIZLLL, "enter_from", str4);
            C30929CBx.LJIJ("subscription_broadcast_entrance_click", LIZLLL);
            return anchor_user_guide_page;
        }
        return null;
    }
}
