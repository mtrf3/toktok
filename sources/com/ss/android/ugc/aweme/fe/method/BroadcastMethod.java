package com.ss.android.ugc.aweme.fe.method;

import X.C16880lQ;
import X.C173066qk;
import X.C2U8;
import X.C38049EwX;
import X.C45804HyK;
import X.C56642Ke;
import X.C59231NMl;
import X.C59576NZs;
import X.FCG;
import X.FCH;
import X.HG3;
import X.InterfaceC36488ETs;
import X.InterfaceC40516FvE;
import X.RBX;
import X.Z8A;
import X.Z9N;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.text.TextUtils;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.ss.android.ugc.aweme.commercialize.anchor.service.GetLeadsAnchorService;
import com.ss.android.ugc.aweme.commercialize.ba.impl.service.BASwitchToPAorBAServiceImpl;
import com.ss.android.ugc.aweme.commercialize.live.service.CommercializeLiveServiceImpl;
import com.ss.android.ugc.aweme.commercialize.tcm.service.TcmServiceImpl;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.profile.ProfileServiceImpl;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.governance.eventbus.IEvent;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public class BroadcastMethod extends BaseCommonJavaMethod {
    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public BroadcastMethod(C38049EwX c38049EwX) {
        super(c38049EwX);
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, InterfaceC36488ETs interfaceC36488ETs) {
        try {
            Context context = this.mContextRef.get();
            while (true) {
                if (context != null) {
                    Activity LJIJJ = C45804HyK.LJIJJ(context);
                    if (LJIJJ == null) {
                        if (!(context instanceof ContextWrapper)) {
                            break;
                        } else {
                            context = ((ContextWrapper) context).getBaseContext();
                        }
                    } else {
                        context = LJIJJ;
                        break;
                    }
                } else {
                    context = null;
                    break;
                }
            }
            LIZIZ(context, jSONObject, this.LJLILLLLZI, null);
            interfaceC36488ETs.onSuccess("");
        } catch (JSONException e) {
            interfaceC36488ETs.LIZ(-1, "");
            C16880lQ.LLLLIIL(e);
        }
    }

    public static void LIZIZ(Context context, JSONObject jSONObject, C38049EwX c38049EwX, InterfaceC40516FvE interfaceC40516FvE) {
        JSONObject optJSONObject;
        JSONObject optJSONObject2;
        JSONObject optJSONObject3;
        JSONObject optJSONObject4;
        C2U8.LIZ(new C56642Ke(jSONObject));
        C2U8.LIZ(new C59231NMl(jSONObject));
        C2U8.LIZ(new C59576NZs(jSONObject));
        HG3.LJIIJJI().notifyFromRnAndH5(jSONObject);
        Z9N.LIZIZ.LJJII(jSONObject);
        FCH.LIZIZ.getClass();
        FCG.LIZ("notification", jSONObject);
        if (TextUtils.equals(JSONObjectProtectorUtils.getString(jSONObject, "eventName"), "activity_view")) {
            Z8A z8a = Z8A.LIZIZ;
            z8a.updateFirstTimeInCouponKeva(JSONObjectProtectorUtils.getJSONObject(jSONObject, "data"));
            z8a.setShownBubbleInCouponKeva(false);
            z8a.setShownBarInCouponKeva(false);
            z8a.setShownStarInCouponKeva(false);
        }
        if (TextUtils.equals(JSONObjectProtectorUtils.getString(jSONObject, "eventName"), "music_feedback_send_success")) {
            C2U8.LIZ(new IEvent() { // from class: X.7Xa
                @Override // com.ss.android.ugc.governance.eventbus.IEvent
                public final /* synthetic */ IEvent post() {
                    C2U8.LIZ(this);
                    return this;
                }

                @Override // com.ss.android.ugc.governance.eventbus.IEvent
                public final /* synthetic */ IEvent postSticky() {
                    C2U8.LIZIZ(this);
                    return this;
                }
            });
        }
        if (TextUtils.equals(JSONObjectProtectorUtils.getString(jSONObject, "eventName"), "onBcAdBeforeSave") && (optJSONObject4 = jSONObject.optJSONObject("data")) != null) {
            AVExternalServiceImpl.LIZ().commerceToolsService().handleReceptionByEvent(optJSONObject4, context);
        }
        if (TextUtils.equals(JSONObjectProtectorUtils.getString(jSONObject, "eventName"), "onBcAdAfterSave") && (optJSONObject3 = jSONObject.optJSONObject("data")) != null) {
            TcmServiceImpl.LJIJI().LIZIZ(optJSONObject3);
        }
        if (TextUtils.equals(jSONObject.optString("eventName"), "appeal_status_change") && (optJSONObject2 = jSONObject.optJSONObject("data")) != null) {
            TcmServiceImpl.LJIJI().LJIILLIIL(optJSONObject2);
        }
        if (TextUtils.equals(jSONObject.optString("eventName"), "bc_pop_music_alert")) {
            TcmServiceImpl.LJIJI().LJIIIZ(context, c38049EwX, interfaceC40516FvE);
        }
        C173066qk.LIZ(jSONObject);
        if (TextUtils.equals(JSONObjectProtectorUtils.getString(jSONObject, "eventName"), "userBlockSuccess")) {
            C2U8.LIZ(new IEvent() { // from class: X.36k
                @Override // com.ss.android.ugc.governance.eventbus.IEvent
                public final /* synthetic */ IEvent post() {
                    C2U8.LIZ(this);
                    return this;
                }

                @Override // com.ss.android.ugc.governance.eventbus.IEvent
                public final /* synthetic */ IEvent postSticky() {
                    C2U8.LIZIZ(this);
                    return this;
                }
            });
        }
        if (TextUtils.equals(JSONObjectProtectorUtils.getString(jSONObject, "eventName"), "_dou_ad_create_tcm_order")) {
            User curUser = ((RBX) HG3.LJIILL()).getCurUser();
            ProfileServiceImpl.LIZ().queryUser(ProfileServiceImpl.LIZ().userUrl(curUser.getSecUid(), curUser.getUid(), curUser.getUniqueId(), 0), true, "");
        }
        if (TextUtils.equals(JSONObjectProtectorUtils.getString(jSONObject, "eventName"), "live-link-pin") || TextUtils.equals(JSONObjectProtectorUtils.getString(jSONObject, "eventName"), "live-link-card")) {
            CommercializeLiveServiceImpl.LJJIIJZLJL().LJIILJJIL(jSONObject);
        }
        if (TextUtils.equals(JSONObjectProtectorUtils.getString(jSONObject, "eventName"), "leadsGenStatusChangeNotification")) {
            GetLeadsAnchorService.LIZLLL().LIZJ(jSONObject);
        }
        if (TextUtils.equals(JSONObjectProtectorUtils.getString(jSONObject, "eventName"), "enterGetLeadsPageNotification")) {
            GetLeadsAnchorService.LIZLLL().LIZIZ(jSONObject);
        }
        if (TextUtils.equals(JSONObjectProtectorUtils.getString(jSONObject, "eventName"), "closeLeadForm")) {
            GetLeadsAnchorService.LIZLLL().LIZ(5);
        }
        if (TextUtils.equals(JSONObjectProtectorUtils.getString(jSONObject, "eventName"), "BALiveLeadsGenEvent")) {
            CommercializeLiveServiceImpl.LJJIIJZLJL().LIZ(jSONObject);
        }
        if (TextUtils.equals(jSONObject.optString("eventName"), "feelgood-submit-result") && (optJSONObject = jSONObject.optJSONObject("data")) != null) {
            BASwitchToPAorBAServiceImpl.LIZLLL().LIZJ(optJSONObject);
        }
    }
}
