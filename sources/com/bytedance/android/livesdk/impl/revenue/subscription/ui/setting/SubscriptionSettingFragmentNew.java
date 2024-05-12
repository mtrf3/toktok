package com.bytedance.android.livesdk.impl.revenue.subscription.ui.setting;

import X.AbstractC73672Svk;
import X.ActivityC45651qj;
import X.B83;
import X.BF4;
import X.BJM;
import X.BZI;
import X.C09650Zl;
import X.C10A;
import X.C141335gf;
import X.C15380j0;
import X.C16880lQ;
import X.C1EW;
import X.C23010vJ;
import X.C28467BFf;
import X.C28546BIg;
import X.C28787BRn;
import X.C29306Beo;
import X.C29374Bfu;
import X.C29S;
import X.C30048Bqm;
import X.C30554Byw;
import X.C30843C8p;
import X.C30929CBx;
import X.C30944CCm;
import X.C30953CCv;
import X.C30979CDv;
import X.C30981CDx;
import X.C30988CEe;
import X.C31847Ceh;
import X.C32364Cn2;
import X.C3C5;
import X.C42398GkU;
import X.C47121t6;
import X.C5H3;
import X.C61712OJw;
import X.C61713OJx;
import X.C62705OjF;
import X.C62819Ol5;
import X.C72818Shy;
import X.C73411SrX;
import X.C73943T0h;
import X.C73969T1h;
import X.C76732zl;
import X.C76800UCe;
import X.C78996UzQ;
import X.C79045V0n;
import X.C7H;
import X.C86447XwJ;
import X.C90903hW;
import X.CE0;
import X.CE1;
import X.CEJ;
import X.CEN;
import X.CN1;
import X.EnumC28543BId;
import X.EnumC28545BIf;
import X.EnumC30931CBz;
import X.InterfaceC30442Bx8;
import X.InterfaceC65784Pro;
import X.InterfaceC72822Si2;
import X.Q7L;
import X.ViewOnClickListenerC30047Bql;
import X.X1D;
import Y.ACListenerS25S0100000_5;
import Y.ACListenerS40S0200000_5;
import Y.AfS25S0110000_5;
import Y.AfS57S0100000_5;
import Y.IDCSpanS31S0100000_5;
import Y.IDCSpanS3S0200000_5;
import Y.IDuS317S0100000_5;
import android.content.Context;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.livesdk.api.revenue.subscription.api.SubscribeApi;
import com.bytedance.android.livesdk.api.revenue.subscription.event.SubOnlyVideoDeleteEvent;
import com.bytedance.android.livesdk.chatroom.api.BadgeInfo;
import com.bytedance.android.livesdk.chatroom.api.C2CTransformationPageInfo;
import com.bytedance.android.livesdk.chatroom.api.CommunityIDInfo;
import com.bytedance.android.livesdk.chatroom.api.EmoteInfo;
import com.bytedance.android.livesdk.chatroom.api.NoteInfo;
import com.bytedance.android.livesdk.chatroom.api.SpotlightInfo;
import com.bytedance.android.livesdk.chatroom.api.SpotlightItem;
import com.bytedance.android.livesdk.chatroom.api.SubOnlyVideosBriefInfo;
import com.bytedance.android.livesdk.chatroom.api.TimerDetail;
import com.bytedance.android.livesdk.chatroom.api.ToolsInfo;
import com.bytedance.android.livesdk.dataChannel.PreviewSubOnlyLiveSwitchChannel;
import com.bytedance.android.livesdk.impl.revenue.subscription.SubscriptionPayoutOnboardingAPISetting;
import com.bytedance.android.livesdk.impl.revenue.subscription.ui.spotlight.SpotlightFeatureDisable;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveSubscriptionAnchorUrlSetting;
import com.bytedance.android.livesdk.livesetting.subscription.EnableSubOnlyVideoSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubathonSetting;
import com.bytedance.android.livesdk.livesetting.subscription.SubWaveEnableSetting;
import com.bytedance.android.livesdk.subscribe.model.CustomBenefitEntrance;
import com.bytedance.android.livesdk.subscribe.model.GetSubInfoResponse;
import com.bytedance.android.livesdk.subscribe.model.PayPalBindInfo;
import com.bytedance.android.livesdk.subscribe.model.SubDataItemView;
import com.bytedance.android.livesdk.subscribe.model.SubSettingStatus;
import com.bytedance.android.livesdk.subscribe.model.gift.SubGifInfo;
import com.bytedance.android.livesdk.subscribe.model.goal.SubGoalInfo;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.google.gson.Gson;
import com.zhiliaoapp.musically.R;
import defpackage.i0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AqS155S0100000_5;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.o;
import tikcast.api.wallet.tiktok.PayoutOnboardingDetailResult;
import ujb.s;

/* loaded from: classes6.dex */
public final class SubscriptionSettingFragmentNew extends BaseFragment implements InterfaceC72822Si2 {
    public static final /* synthetic */ int LLIIII = 0;
    public boolean LJLJI;
    public GetSubInfoResponse LJLJJL;
    public String LJLJJLL;
    public boolean LJLJL;
    public boolean LJLL;
    public boolean LJLLI;
    public boolean LJLLILLLL;
    public boolean LJLLJ;
    public boolean LJLLL;
    public boolean LJLLLL;
    public String LJLLLLLL;
    public String LJLZ;
    public boolean LJZ;
    public C73411SrX LJZI;
    public long LJZL;
    public int LL;
    public InterfaceC65784Pro<C76800UCe> LLD;
    public boolean LLF;
    public Boolean LLFF;
    public int LLFFF;
    public C30988CEe LLFII;
    public boolean LLI;
    public boolean LLIFFJFJJ;
    public final Map<Integer, View> LLII = new LinkedHashMap();
    public String LJLIL = "";
    public String LJLILLLLZI = "";
    public final C5H3 LJLJJI = C78996UzQ.LJJIJIIJI(C7H.LJLIL);
    public String LJLJLJ = "";
    public String LJLJLLL = "";
    public final CEJ LLFZ = new CEJ(this);

    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LLII;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null || (findViewById = view2.findViewById(i)) == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final void Al() {
        AbstractC73672Svk<C28467BFf<PayoutOnboardingDetailResult.Data>> periodicPayoutOnboarding;
        SubscribeApi subscribeApi = (SubscribeApi) Q7L.LIZIZ(SubscribeApi.class);
        if (SubscriptionPayoutOnboardingAPISetting.INSTANCE.useNewAPI()) {
            periodicPayoutOnboarding = subscribeApi.getPeriodicPayoutOnboardingNew("SUBSCRIPTION");
        } else {
            periodicPayoutOnboarding = subscribeApi.getPeriodicPayoutOnboarding(6);
        }
        C1EW.LIZ(periodicPayoutOnboarding).LJJJLIIL(new AfS57S0100000_5(this, 117), new AfS57S0100000_5(this, 118));
    }

    public final void Gl() {
        this.LJLLLLLL = "";
        this.LJLZ = "";
        _$_findCachedViewById(R.id.g7b).setVisibility(8);
    }

    public final void Il() {
        int i;
        String valueOf;
        SubOnlyVideosBriefInfo subOnlyVideosBriefInfo;
        if (!EnableSubOnlyVideoSetting.INSTANCE.isEnable()) {
            _$_findCachedViewById(R.id.koy).setVisibility(8);
        }
        GetSubInfoResponse getSubInfoResponse = this.LJLJJL;
        if (getSubInfoResponse != null && (subOnlyVideosBriefInfo = getSubInfoResponse.subOnlyVideosBriefInfo) != null) {
            i = subOnlyVideosBriefInfo.totalCount;
        } else {
            i = 0;
        }
        TextView textView = (TextView) _$_findCachedViewById(R.id.kox);
        if (i > 99) {
            valueOf = "99+";
        } else {
            valueOf = String.valueOf(i);
        }
        textView.setText(valueOf);
        C16880lQ.LJIL((ConstraintLayout) _$_findCachedViewById(R.id.koy), new ACListenerS25S0100000_5(this, 182));
    }

    public final void Ml() {
        Boolean bool;
        BZI LIZ = C28787BRn.LIZ("livesdk_anchor_subscription_customized_price_entrance_show");
        Tl(LIZ);
        LIZ.LJIJJ(this.LJLIL, "show_entrance");
        GetSubInfoResponse getSubInfoResponse = this.LJLJJL;
        if (getSubInfoResponse != null) {
            bool = Boolean.valueOf(getSubInfoResponse.qualification);
        } else {
            bool = null;
        }
        LIZ.LJIJJ(Integer.valueOf(C29306Beo.LJJIFFI(Boolean.valueOf(C29306Beo.LJJIFFI(bool))) ? 1 : 0), "is_opt_in");
        LIZ.LJJIIJZLJL();
    }

    public final void fm() {
        Long l;
        C2CTransformationPageInfo c2CTransformationPageInfo;
        C30554Byw<Boolean> c30554Byw = InterfaceC30442Bx8.a2;
        Boolean LIZ = c30554Byw.LIZ();
        Boolean bool = Boolean.TRUE;
        if (o.LJ(LIZ, bool)) {
            return;
        }
        Context context = getContext();
        String showEntrance = this.LJLIL;
        GetSubInfoResponse getSubInfoResponse = this.LJLJJL;
        Integer num = null;
        if (getSubInfoResponse != null && (c2CTransformationPageInfo = getSubInfoResponse.c2cTransPageInfo) != null) {
            l = Long.valueOf(c2CTransformationPageInfo.c2cDdlDate);
        } else {
            l = null;
        }
        String valueOf = String.valueOf(l);
        GetSubInfoResponse getSubInfoResponse2 = this.LJLJJL;
        if (getSubInfoResponse2 != null) {
            num = Integer.valueOf(getSubInfoResponse2.c2cPeriod);
        }
        String valueOf2 = String.valueOf(num);
        o.LJIIIZ(showEntrance, "showEntrance");
        C32364Cn2 c32364Cn2 = new C32364Cn2(LiveSubscriptionAnchorUrlSetting.payoutUnsupportedNoticePopup());
        c32364Cn2.LIZJ("show_entrance", showEntrance);
        c32364Cn2.LIZJ("c2c_ddl_date", valueOf);
        c32364Cn2.LIZJ("c2c_period", valueOf2);
        c32364Cn2.LIZJ("priority_region", C31847Ceh.LIZIZ());
        c32364Cn2.LIZJ("enter_from_merge", BJM.LJFF());
        c32364Cn2.LIZJ("enter_method", BJM.LJIIIIZZ());
        ((IActionHandlerService) CN1.LIZ(IActionHandlerService.class)).handle(context, UriProtector.parse(c32364Cn2.LIZLLL()));
        c30554Byw.LIZJ(bool);
    }

    public final int hm() {
        String str;
        GetSubInfoResponse getSubInfoResponse = this.LJLJJL;
        if (getSubInfoResponse == null || !getSubInfoResponse.qualification || getSubInfoResponse.c2cTransStatus != 0 || !getSubInfoResponse.c2cTransAvailable || getSubInfoResponse == null || getSubInfoResponse.c2cPeriod != 2) {
            return 0;
        }
        C30554Byw<Boolean> c30554Byw = InterfaceC30442Bx8.Z1;
        Boolean LIZ = c30554Byw.LIZ();
        Boolean bool = Boolean.TRUE;
        C2CTransformationPageInfo c2CTransformationPageInfo = null;
        String str2 = null;
        if (o.LJ(LIZ, bool)) {
            Context context = getContext();
            if (context != null) {
                str = context.getString(R.string.oe0);
            } else {
                str = null;
            }
            this.LJLLLLLL = str;
            Context context2 = getContext();
            if (context2 != null) {
                str2 = context2.getString(R.string.oe1);
            }
            this.LJLZ = str2;
            dm(this.LJLLLLLL, str2, new AqS155S0100000_5(this, 220), CEN.LJLIL);
            return 1;
        }
        this.LJLLL = true;
        Context context3 = getContext();
        String str3 = this.LJLIL;
        Gson gson = C09650Zl.LIZIZ;
        GetSubInfoResponse getSubInfoResponse2 = this.LJLJJL;
        if (getSubInfoResponse2 != null) {
            c2CTransformationPageInfo = getSubInfoResponse2.c2cTransPageInfo;
        }
        String json = GsonProtectorUtils.toJson(gson, c2CTransformationPageInfo);
        o.LJIIIIZZ(json, "get().toJson(subscribeIn…sponse?.c2cTransPageInfo)");
        C31847Ceh.LJI(context3, str3, json);
        c30554Byw.LIZJ(bool);
        return 2;
    }

    public final boolean mm() {
        if (this.LLI) {
            return true;
        }
        Rect rect = new Rect();
        View _$_findCachedViewById = _$_findCachedViewById(R.id.kw6);
        if (_$_findCachedViewById != null) {
            _$_findCachedViewById.getHitRect(rect);
        }
        if (_$_findCachedViewById(R.id.ev0).getLocalVisibleRect(rect)) {
            this.LLI = true;
            BZI LIZ = C28787BRn.LIZ("livesdk_subscribe_privilege_preview_entrance_show");
            Tl(LIZ);
            LIZ.LJIJJ(this.LJLIL, "show_entrance");
            LIZ.LJJIIJZLJL();
            return true;
        }
        return false;
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
        dataChannelGlobal.getClass();
        dataChannelGlobal.jv0(this);
        C72818Shy.LJII("open_native_subscription_settings", this);
        C72818Shy.LJII("close_native_subscription_settings", this);
        C72818Shy.LJII("anchor_subscribe_badge_status_change", this);
        C72818Shy.LJII("anchor_subscribe_emotes_status_change", this);
        C72818Shy.LJII("anchor_subscribe_note_status_change", this);
        C72818Shy.LJII("anchor_subscribe_community_status_change", this);
        C72818Shy.LJII("anchor_subscribe_goals_status_change", this);
        C72818Shy.LJII("anchor_sub_gift_balance_changed", this);
        C72818Shy.LJII("paypal_dialog_btn_click", this);
        C72818Shy.LJII("anchor_subscribe_perks_status_change", this);
        C72818Shy.LJII("anchor_subscribe_c2c_trans_update", this);
        C72818Shy.LJII("payout_onboarding_confirmed", this);
        C72818Shy.LJII("payout_onboarding_not_confirmed", this);
        C72818Shy.LJII("subathon_timer_change", this);
        C72818Shy.LJII("subscription_wave_switch_update", this);
        C73411SrX c73411SrX = this.LJZI;
        if (c73411SrX != null) {
            c73411SrX.dispose();
        }
        CE0.LIZ.clear();
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        C86447XwJ.LIZJ(C16880lQ.LJLLJ(SubscriptionSettingFragmentNew.class));
        if (this.LJLLL) {
            xl(false);
            this.LJLLL = false;
        }
    }

    public static String Dl(Integer num) {
        if (num != null) {
            if (num.intValue() == 1) {
                return "pass";
            }
            if (num.intValue() == 2) {
                return "failed";
            }
            if (num.intValue() == 3) {
                return "under_review";
            }
        }
        return "null";
    }

    public static void vl(C32364Cn2 c32364Cn2) {
        c32364Cn2.LIZJ("sec_anchor_id", ((C29374Bfu) B83.LIZ().LIZIZ()).LIZIZ.getSecUid());
        c32364Cn2.LIZJ("enter_from_merge", BJM.LJFF());
        c32364Cn2.LIZJ("enter_method", BJM.LJIIIIZZ());
        c32364Cn2.LIZJ("request_id", BJM.LJIILIIL());
        c32364Cn2.LIZJ("video_id", BJM.LJIJ());
    }

    public final void Hl(GetSubInfoResponse getSubInfoResponse) {
        Integer num;
        SubGifInfo subGifInfo = getSubInfoResponse.subGiftInfo;
        Boolean bool = null;
        if (subGifInfo != null) {
            num = Integer.valueOf(subGifInfo.subGiftNum);
        } else {
            num = null;
        }
        SubGifInfo subGifInfo2 = getSubInfoResponse.subGiftInfo;
        if (subGifInfo2 != null) {
            bool = Boolean.valueOf(subGifInfo2.showEntrance);
        }
        Boolean bool2 = Boolean.TRUE;
        if (o.LJ(bool, bool2)) {
            _$_findCachedViewById(R.id.euk).setVisibility(0);
        }
        if (getSubInfoResponse.anchorGiftSubAuth && !o.LJ(InterfaceC30442Bx8.W2.LIZ(), bool2)) {
            CE0.LIZ.add(new C30979CDv(new BF4(this), CE1.SUBGIFT));
        }
        if (num != null && num.intValue() >= 0) {
            km(num);
            C16880lQ.LJIL((ConstraintLayout) _$_findCachedViewById(R.id.euk), new ACListenerS40S0200000_5(num, this, 18));
        }
    }

    public final void Jl(GetSubInfoResponse getSubInfoResponse) {
        List arrayList;
        boolean z;
        String str;
        if (SpotlightFeatureDisable.INSTANCE.isDisable()) {
            _$_findCachedViewById(R.id.c1r).setVisibility(8);
            return;
        }
        if (!o.LJ(InterfaceC30442Bx8.LJLILLLLZI.LIZ(), Boolean.TRUE)) {
            CE0.LIZ.add(new C30979CDv(new C30048Bqm(this), CE1.SPOTLIGHT));
        }
        SpotlightInfo spotlightInfo = getSubInfoResponse.spotlightInfo;
        if (spotlightInfo == null || (arrayList = spotlightInfo.itemList) == null) {
            arrayList = new ArrayList();
        }
        Iterator it = arrayList.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            if (((SpotlightItem) it.next()).reviewStatus == 3) {
                if (i != -1) {
                    z = true;
                }
            } else {
                i++;
            }
        }
        z = false;
        int size = arrayList.size();
        if (z) {
            ((ImageView) _$_findCachedViewById(R.id.c1w)).setVisibility(0);
            _$_findCachedViewById(R.id.c1t).setVisibility(8);
            ((TextView) _$_findCachedViewById(R.id.key)).setText(getString(R.string.oap));
        } else {
            ((ImageView) _$_findCachedViewById(R.id.c1w)).setVisibility(8);
            _$_findCachedViewById(R.id.c1t).setVisibility(0);
            ((TextView) _$_findCachedViewById(R.id.c1t)).setText(String.valueOf(size));
            ((TextView) _$_findCachedViewById(R.id.key)).setText(getString(R.string.odj));
        }
        if (size == 0) {
            _$_findCachedViewById(R.id.c1u).setVisibility(0);
        } else {
            _$_findCachedViewById(R.id.c1u).setVisibility(8);
        }
        C76732zl c76732zl = new C76732zl();
        if (size == 0 && o.LJ(InterfaceC30442Bx8.LJLJI.LIZJ(), Boolean.TRUE)) {
            _$_findCachedViewById(R.id.c1x).setVisibility(0);
            _$_findCachedViewById(R.id.c1t).setVisibility(8);
            c76732zl.element = 1;
        } else {
            _$_findCachedViewById(R.id.c1x).setVisibility(8);
            _$_findCachedViewById(R.id.c1t).setVisibility(0);
        }
        BZI LIZ = C28787BRn.LIZ("livesdk_anchor_subscription_highlight_entrance_show");
        Tl(LIZ);
        LIZ.LJIJJ(this.LJLIL, "show_entrance");
        if (z) {
            str = "not_approved";
        } else {
            str = "others";
        }
        LIZ.LJIJJ(str, "status");
        LIZ.LJIJJ(Integer.valueOf(c76732zl.element), "is_red_dot");
        LIZ.LJJIIJZLJL();
        C16880lQ.LJIL((ConstraintLayout) _$_findCachedViewById(R.id.c1r), new ViewOnClickListenerC30047Bql(this, z, c76732zl));
    }

    public final void Kl(GetSubInfoResponse getSubInfoResponse) {
        if (SubWaveEnableSetting.INSTANCE.isEnable()) {
            this.LLF = getSubInfoResponse.enableWaveStatus;
            View _$_findCachedViewById = _$_findCachedViewById(R.id.ev5);
            if (_$_findCachedViewById != null) {
                _$_findCachedViewById.setVisibility(0);
            }
            Ql(this.LLF);
            ConstraintLayout constraintLayout = (ConstraintLayout) _$_findCachedViewById(R.id.ev5);
            if (constraintLayout != null) {
                C16880lQ.LJIL(constraintLayout, new ACListenerS25S0100000_5(this, 183));
            }
            boolean z = this.LLF;
            if (o.LJ(InterfaceC30442Bx8.LJLIL.LIZ(), Boolean.TRUE)) {
                return;
            }
            CE0.LIZ.add(new C30979CDv(new C30944CCm(this, z), CE1.SUBWAVE));
        }
    }

    public final void Ll(TimerDetail timerDetail) {
        GetSubInfoResponse getSubInfoResponse;
        long j;
        int i;
        C73411SrX c73411SrX = this.LJZI;
        if (c73411SrX != null) {
            c73411SrX.dispose();
        }
        if (LiveSubathonSetting.INSTANCE.getValue().getEnableEntrance() && (getSubInfoResponse = this.LJLJJL) != null && getSubInfoResponse.qualification) {
            _$_findCachedViewById(R.id.ev6).setVisibility(0);
            if (!this.LLIFFJFJJ) {
                this.LLIFFJFJJ = true;
                BZI LIZ = C28787BRn.LIZ("livesdk_anchor_subathon_icon_show");
                Tl(LIZ);
                LIZ.LJIJJ(this.LJLIL, "show_entrance");
                C62819Ol5.LJJIFFI(LIZ, timerDetail);
                LIZ.LJJIIJZLJL();
            }
            C16880lQ.LJIL((ConstraintLayout) _$_findCachedViewById(R.id.ev6), new ACListenerS40S0200000_5(timerDetail, this, 19));
            if (timerDetail != null) {
                j = timerDetail.remainingTimeS;
            } else {
                j = 0;
            }
            this.LJZL = j;
            if (timerDetail == null || (i = timerDetail.auditStatus) == 0) {
                ((ImageView) _$_findCachedViewById(R.id.kp4)).setVisibility(8);
                _$_findCachedViewById(R.id.kp6).setVisibility(8);
                _$_findCachedViewById(R.id.kp5).setVisibility(0);
                return;
            }
            if (i == 2) {
                ((ImageView) _$_findCachedViewById(R.id.kp4)).setVisibility(0);
                _$_findCachedViewById(R.id.kp6).setVisibility(8);
                _$_findCachedViewById(R.id.kp5).setVisibility(8);
                return;
            }
            ((ImageView) _$_findCachedViewById(R.id.kp4)).setVisibility(8);
            _$_findCachedViewById(R.id.kp5).setVisibility(8);
            _$_findCachedViewById(R.id.kp6).setVisibility(8);
            int i2 = timerDetail.timerStatus;
            if (i2 == 1 && this.LJZL > 0) {
                _$_findCachedViewById(R.id.kp6).setVisibility(0);
                ((TextView) _$_findCachedViewById(R.id.kp6)).setText(C30953CCv.LIZIZ(this.LJZL));
                this.LJZI = (C73411SrX) AbstractC73672Svk.LJJIJIIJI(1000L, TimeUnit.MILLISECONDS).LJJJ(C73969T1h.LIZIZ()).LJJJJZI(new AfS57S0100000_5(this, 119));
                return;
            } else {
                if (i2 == 3) {
                    return;
                }
                _$_findCachedViewById(R.id.kp6).setVisibility(0);
                ((TextView) _$_findCachedViewById(R.id.kp6)).setText(C30953CCv.LIZIZ(this.LJZL));
                return;
            }
        }
        _$_findCachedViewById(R.id.ev6).setVisibility(8);
    }

    public final void Nl(String str) {
        BZI LIZ = C28787BRn.LIZ("livesdk_anchor_subscription_overview_click");
        Tl(LIZ);
        LIZ.LJIJJ(this.LJLJLLL, "room_id");
        LIZ.LJIJJ(str, "tab");
        LIZ.LJIJJ(this.LJLIL, "show_entrance");
        LIZ.LJJIIJZLJL();
    }

    public final void Ol(String str) {
        BZI LIZ = C28787BRn.LIZ("livesdk_anchor_subscription_overview_show");
        Tl(LIZ);
        LIZ.LJIJJ(this.LJLJLLL, "room_id");
        LIZ.LJIJJ(str, "tab");
        LIZ.LJIJJ(this.LJLIL, "show_entrance");
        LIZ.LJJIIJZLJL();
    }

    public final void Pl(int i) {
        Boolean bool;
        boolean z;
        CommunityIDInfo communityIDInfo;
        BadgeInfo badgeInfo;
        CommunityIDInfo communityIDInfo2;
        EmoteInfo emoteInfo;
        CustomBenefitEntrance customBenefitEntrance;
        ToolsInfo toolsInfo;
        SubGoalInfo subGoalInfo;
        ToolsInfo toolsInfo2;
        NoteInfo noteInfo;
        if (this.LJZ) {
            return;
        }
        boolean z2 = true;
        this.LJZ = true;
        BZI LIZ = C28787BRn.LIZ("livesdk_anchor_subscription_page_show");
        Tl(LIZ);
        Vl(LIZ);
        Wl(LIZ);
        LIZ.LJIJJ(this.LJLIL, "click_position");
        LIZ.LJIJJ(this.LJLIL, "show_entrance");
        LIZ.LJIJJ(Integer.valueOf(C29306Beo.LJJIFFI(Boolean.valueOf(this.LJLLJ)) ? 1 : 0), "is_paypal");
        GetSubInfoResponse getSubInfoResponse = this.LJLJJL;
        if (getSubInfoResponse != null) {
            bool = Boolean.valueOf(getSubInfoResponse.qualification);
        } else {
            bool = null;
        }
        LIZ.LJIJJ(Integer.valueOf(C29306Beo.LJJIFFI(Boolean.valueOf(C29306Beo.LJJIFFI(bool))) ? 1 : 0), "is_opt_in");
        GetSubInfoResponse getSubInfoResponse2 = this.LJLJJL;
        if (getSubInfoResponse2 != null && (communityIDInfo = getSubInfoResponse2.communityIdInfo) != null && (badgeInfo = communityIDInfo.badgeInfo) != null && badgeInfo.currentStatus == 1 && (communityIDInfo2 = getSubInfoResponse2.communityIdInfo) != null && (emoteInfo = communityIDInfo2.emoteInfo) != null && emoteInfo.currentStatus == 1 && (customBenefitEntrance = getSubInfoResponse2.customBenefitEntrance) != null && customBenefitEntrance.lastAuditStatus == 1 && (toolsInfo = getSubInfoResponse2.toolsInfo) != null && (subGoalInfo = toolsInfo.goalInfo) != null && subGoalInfo.auditStatus == 1 && (toolsInfo2 = getSubInfoResponse2.toolsInfo) != null && (noteInfo = toolsInfo2.noteInfo) != null && noteInfo.currentStatus == 1) {
            z = true;
        } else {
            z = false;
        }
        LIZ.LJIJJ(Integer.valueOf(C29306Beo.LJJIFFI(Boolean.valueOf(z)) ? 1 : 0), "is_end");
        LIZ.LJIJJ(Integer.valueOf(C29306Beo.LJJIFFI(Boolean.valueOf(this.LJLLLL)) ? 1 : 0), "is_onboarding");
        LIZ.LJIJJ(Integer.valueOf(i), "is_pay_info");
        GetSubInfoResponse getSubInfoResponse3 = this.LJLJJL;
        if (getSubInfoResponse3 == null || getSubInfoResponse3.c2cPeriod != 2) {
            z2 = false;
        }
        LIZ.LJIJJ(Integer.valueOf(C29306Beo.LJJIFFI(Boolean.valueOf(z2)) ? 1 : 0), "is_transform_period");
        LIZ.LJJIIJZLJL();
    }

    public final void Ql(boolean z) {
        if (z) {
            ((TextView) _$_findCachedViewById(R.id.kpa)).setText(C15380j0.LJIILJJIL(R.string.oj8));
        } else {
            ((TextView) _$_findCachedViewById(R.id.kpa)).setText(C15380j0.LJIILJJIL(R.string.oj7));
        }
        C29306Beo.LJJLJLI(_$_findCachedViewById(R.id.kpa));
        this.LLF = z;
    }

    public final void Rl(String str) {
        Context context = getContext();
        String str2 = this.LJLIL;
        C31847Ceh.LJFF(context, str, "sub_config", str2, str2, this.LJLJLJ, this.LJLJLLL, null, false, null, null, null, 3968);
    }

    public final void Sl(String str) {
        C73943T0h.LIZ().LIZIZ(new C28546BIg(EnumC28543BId.SUB_ONLY_LIVE_PAGE, EnumC28545BIf.OPEN, str, this.LJLJJL));
    }

    public final void Tl(BZI bzi) {
        bzi.LJFF(String.valueOf(((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId()));
    }

    public final void Vl(BZI bzi) {
        Integer num;
        SubSettingStatus subSettingStatus;
        GetSubInfoResponse getSubInfoResponse = this.LJLJJL;
        if (getSubInfoResponse != null && (subSettingStatus = getSubInfoResponse.badgeInfo) != null) {
            num = Integer.valueOf(subSettingStatus.currentStatus);
        } else {
            num = null;
        }
        bzi.LJIJJ(Dl(num), "badge_status");
    }

    public final void Wl(BZI bzi) {
        Integer num;
        SubSettingStatus subSettingStatus;
        GetSubInfoResponse getSubInfoResponse = this.LJLJJL;
        if (getSubInfoResponse != null && (subSettingStatus = getSubInfoResponse.emotesInfo) != null) {
            num = Integer.valueOf(subSettingStatus.currentStatus);
        } else {
            num = null;
        }
        bzi.LJIJJ(Dl(num), "emote_status");
    }

    public final void Yl(GetSubInfoResponse getSubInfoResponse) {
        String str;
        Boolean bool;
        String str2;
        int i;
        boolean z;
        String str3;
        String str4;
        String str5;
        PayPalBindInfo payPalBindInfo = getSubInfoResponse.payPalBindInfo;
        if (payPalBindInfo != null && C29306Beo.LJJIFFI(Boolean.valueOf(payPalBindInfo.needBindPayPal))) {
            PayPalBindInfo payPalBindInfo2 = getSubInfoResponse.payPalBindInfo;
            Boolean bool2 = null;
            if (payPalBindInfo2 == null || (str = payPalBindInfo2.bindNotice) == null || ujb.o.LJJJJJL(str)) {
                return;
            }
            PayPalBindInfo payPalBindInfo3 = getSubInfoResponse.payPalBindInfo;
            if (payPalBindInfo3 != null) {
                bool = Boolean.valueOf(payPalBindInfo3.payPayBounded);
            } else {
                bool = null;
            }
            if (C29306Beo.LJJIFFI(bool) && !InterfaceC30442Bx8.B.LIZJ().booleanValue()) {
                _$_findCachedViewById(R.id.g7b).setVisibility(8);
                this.LJLLJ = false;
                return;
            }
            this.LJLLJ = true;
            _$_findCachedViewById(R.id.g7b).setVisibility(0);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            PayPalBindInfo payPalBindInfo4 = getSubInfoResponse.payPalBindInfo;
            if (payPalBindInfo4 != null) {
                str2 = payPalBindInfo4.bindNotice;
            } else {
                str2 = null;
            }
            spannableStringBuilder.append((CharSequence) str2);
            PayPalBindInfo payPalBindInfo5 = getSubInfoResponse.payPalBindInfo;
            if (payPalBindInfo5 != null && (str5 = payPalBindInfo5.bindNotice) != null) {
                i = str5.length();
            } else {
                i = 0;
            }
            PayPalBindInfo payPalBindInfo6 = getSubInfoResponse.payPalBindInfo;
            if (payPalBindInfo6 != null && (str4 = payPalBindInfo6.bindOptStr) != null) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(' ');
                LIZ.append(str4);
                spannableStringBuilder.append((CharSequence) X1D.LIZIZ(LIZ));
                spannableStringBuilder.setSpan(new IDCSpanS3S0200000_5(this, getSubInfoResponse, 0), i, str4.length() + i + 1, 34);
                spannableStringBuilder.setSpan(new ForegroundColorSpan(C15380j0.LIZIZ(R.color.c0)), i, str4.length() + i + 1, 34);
            }
            ((TextView) _$_findCachedViewById(R.id.m0v)).setMovementMethod(LinkMovementMethod.getInstance());
            ((TextView) _$_findCachedViewById(R.id.m0v)).setHighlightColor(0);
            ((TextView) _$_findCachedViewById(R.id.m0v)).setText(spannableStringBuilder);
            PayPalBindInfo payPalBindInfo7 = getSubInfoResponse.payPalBindInfo;
            if (payPalBindInfo7 != null) {
                z = payPalBindInfo7.payPayBounded;
            } else {
                z = false;
            }
            BZI LIZ2 = C28787BRn.LIZ("livesdk_bind_paypal_page_show");
            Tl(LIZ2);
            LIZ2.LJIJJ(this.LJLIL, "click_position");
            LIZ2.LJIJJ(0, "is_opt_in_end");
            LIZ2.LJIJJ(Integer.valueOf(C29306Beo.LJJIFFI(Boolean.valueOf(z)) ? 1 : 0), "has_paypal_account");
            LIZ2.LJIJJ(this.LJLIL, "popup_entrance");
            GetSubInfoResponse getSubInfoResponse2 = this.LJLJJL;
            if (getSubInfoResponse2 != null) {
                bool2 = Boolean.valueOf(getSubInfoResponse2.qualification);
            }
            if (C29306Beo.LJJIFFI(bool2)) {
                str3 = "pass";
            } else {
                str3 = "under_review";
            }
            LIZ2.LJIJJ(str3, "review_status");
            LIZ2.LJJIIJZLJL();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:223:0x0611, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L305;
     */
    /* JADX WARN: Code restructure failed: missing block: B:330:0x0909, code lost:
    
        if (r4 != null) goto L411;
     */
    /* JADX WARN: Code restructure failed: missing block: B:342:0x0977, code lost:
    
        if (r6 != null) goto L224;
     */
    /* JADX WARN: Code restructure failed: missing block: B:383:0x0381, code lost:
    
        if (r13 != null) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:386:0x03b8, code lost:
    
        if (r13 != null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:388:0x03b2, code lost:
    
        if (r13 == null) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:424:0x0416, code lost:
    
        if (r4 != null) goto L171;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x042f  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x043e  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x044d  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0465  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0479  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0494  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x04a5  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x04b9  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x04c9  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x04de  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0531  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0540  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x054f  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x056a  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x057b  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x05dd  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x062c  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0640  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0668  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0676  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0681  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x06b8  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x06c6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:258:0x06d1  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x06dc  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x07b6  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x07e5  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x07f0  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x07fc  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x0833  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x083c  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x083f  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x0848  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x08ac  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x08dd  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x0998  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x09a3  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x0977  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x0424  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x03a2  */
    /* JADX WARN: Removed duplicated region for block: B:377:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x0381  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01ea  */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Integer, O] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Zl(com.bytedance.android.livesdk.subscribe.model.GetSubInfoResponse r27) {
        /*
            Method dump skipped, instructions count: 2473
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.impl.revenue.subscription.ui.setting.SubscriptionSettingFragmentNew.Zl(com.bytedance.android.livesdk.subscribe.model.GetSubInfoResponse):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x00dc, code lost:
    
        if (r1 == 1) goto L66;
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x009b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void em(tikcast.api.wallet.tiktok.PayoutOnboardingDetailResult.Data r11) {
        /*
            Method dump skipped, instructions count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.impl.revenue.subscription.ui.setting.SubscriptionSettingFragmentNew.em(tikcast.api.wallet.tiktok.PayoutOnboardingDetailResult$Data):void");
    }

    public final void km(Integer num) {
        if (num != null && num.intValue() > 999) {
            ((TextView) _$_findCachedViewById(R.id.i1i)).setText("999+");
        } else {
            ((TextView) _$_findCachedViewById(R.id.i1i)).setText(String.valueOf(num));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0344  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void lm(boolean r22) {
        /*
            Method dump skipped, instructions count: 1057
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.impl.revenue.subscription.ui.setting.SubscriptionSettingFragmentNew.lm(boolean):void");
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        boolean z;
        super.onCreate(bundle);
        String LJLLJ = C16880lQ.LJLLJ(SubscriptionSettingFragmentNew.class);
        Context requireContext = requireContext();
        o.LJIIIIZZ(requireContext, "requireContext()");
        C86447XwJ.LJFF(requireContext, LJLLJ, this.LJLIL);
        Bundle arguments = getArguments();
        String str = "";
        if (arguments != null) {
            String string = arguments.getString("arg_enter_from");
            if (string == null) {
                string = "";
            }
            this.LJLIL = string;
            String string2 = arguments.getString("origin_uri");
            if (string2 == null) {
                string2 = "";
            }
            this.LJLILLLLZI = string2;
            if (arguments.getInt("open_sub_only_setting") == 1) {
                z = true;
            } else {
                z = false;
            }
            this.LJLLILLLL = z;
            this.LLFFF = arguments.getInt("containerId");
        }
        if (this.LJLILLLLZI.length() > 0) {
            Uri parse = UriProtector.parse(this.LJLILLLLZI);
            String queryParameter = UriProtector.getQueryParameter(parse, "anchor_id");
            if (queryParameter == null) {
                queryParameter = String.valueOf(((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId());
            }
            this.LJLJLJ = queryParameter;
            String queryParameter2 = UriProtector.getQueryParameter(parse, "room_id");
            if (queryParameter2 != null) {
                str = queryParameter2;
            }
            this.LJLJLLL = str;
            this.LJLLI = o.LJ(UriProtector.getQueryParameter(parse, "paypal_dialog"), "1");
            this.LJLLLL = o.LJ(UriProtector.getQueryParameter(parse, "from_type"), "on_boarding");
        } else {
            this.LJLJLJ = String.valueOf(((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId());
        }
        xl(false);
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        mo49getActivity();
        o.LJIIIIZZ(onGetLayoutInflater, "getLayoutInflater(\n     …      activity,\n        )");
        return onGetLayoutInflater;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000f. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:158:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0318  */
    @Override // X.InterfaceC72822Si2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onReceiveJsEvent(X.C199097rd r9) {
        /*
            Method dump skipped, instructions count: 872
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.impl.revenue.subscription.ui.setting.SubscriptionSettingFragmentNew.onReceiveJsEvent(X.7rd):void");
    }

    public final void xl(boolean z) {
        AbstractC73672Svk.LJJLL(C30929CBx.LJIIJJI(C1EW.LIZ(((SubscribeApi) Q7L.LIZIZ(SubscribeApi.class)).getSubscribeInfo(true, ((C29374Bfu) B83.LIZ().LIZIZ()).LIZIZ.getSecUid(), true, this.LJLIL)).LJIJJLI(new AfS57S0100000_5(this, 300)).LJIJJ(new AfS57S0100000_5(this, 301)), EnumC30931CBz.SUBINFO, this.LJLIL, C30843C8p.LJLIL), AbstractC73672Svk.LJIIJ(new IDuS317S0100000_5(this, 7)).LJII(new C62705OjF()), C30981CDx.LJLIL).LJJJJZI(new AfS25S0110000_5(this, z, 4));
    }

    public static SpannableStringBuilder wl(long j, String str) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(j);
        LIZ.append('%');
        String LIZIZ = X1D.LIZIZ(LIZ);
        int LJJLIIIJL = s.LJJLIIIJL(str, "%d%%", 0, false, 6);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (LJJLIIIJL >= 0) {
            String substring = str.substring(0, LJJLIIIJL);
            o.LJIIIIZZ(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            String substring2 = str.substring(LJJLIIIJL + 4);
            o.LJIIIIZZ(substring2, "this as java.lang.String).substring(startIndex)");
            spannableStringBuilder.append((CharSequence) substring);
            spannableStringBuilder.append((CharSequence) LIZIZ);
            spannableStringBuilder.append((CharSequence) substring2);
            spannableStringBuilder.setSpan(new ForegroundColorSpan(C15380j0.LIZIZ(R.color.c6)), substring.length(), LIZIZ.length() + substring.length(), 34);
            spannableStringBuilder.setSpan(new RelativeSizeSpan(1.0769231f), substring.length(), LIZIZ.length() + substring.length(), 34);
            C23010vJ.LJFF(spannableStringBuilder, substring.length(), LIZIZ.length() + substring.length(), 34, 600);
        } else {
            spannableStringBuilder.append((CharSequence) str);
        }
        return spannableStringBuilder;
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        C29306Beo.LJJLJLI(_$_findCachedViewById(R.id.aeg));
        C16880lQ.LJIILJJIL((FrameLayout) _$_findCachedViewById(R.id.aeg), new ACListenerS25S0100000_5(this, 184));
        lm(false);
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
        dataChannelGlobal.nv0(this, this, PreviewSubOnlyLiveSwitchChannel.class, new AqS171S0100000_5(this, 402));
        dataChannelGlobal.nv0(this, this, SubOnlyVideoDeleteEvent.class, new AqS171S0100000_5(this, 403));
        C61713OJx LIZIZ = C61712OJw.LIZIZ(this);
        LIZIZ.LIZIZ.LJIIJ(true);
        LIZIZ.LJIIIIZZ(C15380j0.LIZIZ(R.color.zy));
        LIZIZ.LIZJ();
    }

    public static void Xl(SubDataItemView subDataItemView, ImageView imageView, C47121t6 c47121t6) {
        if (subDataItemView == null) {
            imageView.setVisibility(8);
            c47121t6.setVisibility(8);
            return;
        }
        c47121t6.setVisibility(0);
        String str = subDataItemView.value;
        int i = subDataItemView.iconType;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    imageView.setVisibility(8);
                    String str2 = subDataItemView.iconContent;
                    if (str2 != null) {
                        str = i0.LJFF(str2, str);
                    }
                }
            } else {
                imageView.setVisibility(0);
                imageView.setImageResource(R.drawable.ane);
            }
        } else {
            imageView.setVisibility(8);
        }
        c47121t6.setText(str);
    }

    public final void cm(int i, boolean z, InterfaceC65784Pro interfaceC65784Pro) {
        int i2;
        float f;
        if (z) {
            i2 = (~i) & this.LL;
        } else {
            i2 = i | this.LL;
        }
        this.LL = i2;
        if (interfaceC65784Pro != null) {
            this.LLD = interfaceC65784Pro;
        }
        View _$_findCachedViewById = _$_findCachedViewById(R.id.kpt);
        if (this.LL == 0) {
            f = 1.0f;
        } else {
            f = 0.6f;
        }
        _$_findCachedViewById.setAlpha(f);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.d59, viewGroup, false);
        C29S c29s = null;
        if (!(LLLLIILL instanceof View)) {
            LLLLIILL = null;
        }
        if (LLLLIILL != null) {
            try {
                ViewTreeLifecycleOwner.set(LLLLIILL, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(LLLLIILL, this);
                C10A.LIZIZ(LLLLIILL, this);
                ActivityC45651qj mo49getActivity = mo49getActivity();
                if (mo49getActivity instanceof C29S) {
                    c29s = (C29S) mo49getActivity;
                }
                C90903hW.LIZ(c29s);
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
        }
        C3C5.m7constructorimpl(C76800UCe.LIZ);
        return LLLLIILL;
    }

    public final void dm(String str, String str2, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro2) {
        boolean z;
        int i;
        Integer LJI;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z || str2 == null || str2.length() == 0) {
            _$_findCachedViewById(R.id.g7b).setVisibility(8);
            return;
        }
        String LIZIZ = C42398GkU.LIZIZ(str, '\n');
        _$_findCachedViewById(R.id.g7b).setVisibility(0);
        ((TextView) _$_findCachedViewById(R.id.m0v)).setMovementMethod(LinkMovementMethod.getInstance());
        ((TextView) _$_findCachedViewById(R.id.m0v)).setHighlightColor(0);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) LIZIZ);
        int length = LIZIZ.length();
        spannableStringBuilder.append((CharSequence) String.valueOf(str2));
        spannableStringBuilder.setSpan(new IDCSpanS31S0100000_5(interfaceC65784Pro, 2), length, str2.length() + length, 34);
        Context context = getContext();
        if (context != null && (LJI = C79045V0n.LJI(R.attr.bn7, context)) != null) {
            i = LJI.intValue();
        } else {
            i = -65536;
        }
        spannableStringBuilder.setSpan(new ForegroundColorSpan(i), length, str2.length() + length, 34);
        ((TextView) _$_findCachedViewById(R.id.m0v)).setText(spannableStringBuilder);
        interfaceC65784Pro2.invoke();
    }
}
