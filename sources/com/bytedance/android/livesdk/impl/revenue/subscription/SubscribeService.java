package com.bytedance.android.livesdk.impl.revenue.subscription;

import X.ALE;
import X.ActivityC45651qj;
import X.B83;
import X.BCH;
import X.BDK;
import X.BJM;
import X.BK2;
import X.BTL;
import X.C05170If;
import X.C05630Jz;
import X.C0K2;
import X.C0MB;
import X.C113554cx;
import X.C15380j0;
import X.C16880lQ;
import X.C1B3;
import X.C1EW;
import X.C25570A1u;
import X.C259710f;
import X.C259810g;
import X.C28357BAz;
import X.C28396BCm;
import X.C28477BFp;
import X.C29044Baa;
import X.C29063Bat;
import X.C29306Beo;
import X.C29374Bfu;
import X.C29402BgM;
import X.C29494Bhq;
import X.C29846BnW;
import X.C29894BoI;
import X.C29927Bop;
import X.C30038Bqc;
import X.C30840C8m;
import X.C30841C8n;
import X.C30843C8p;
import X.C30910CBe;
import X.C30911CBf;
import X.C30912CBg;
import X.C30913CBh;
import X.C30914CBi;
import X.C30916CBk;
import X.C30917CBl;
import X.C30918CBm;
import X.C30919CBn;
import X.C30920CBo;
import X.C30922CBq;
import X.C30924CBs;
import X.C30929CBx;
import X.C31058CGw;
import X.C31613Cav;
import X.C32364Cn2;
import X.C32537Cpp;
import X.C34K;
import X.C37724ErI;
import X.C42061kw;
import X.C48459J0d;
import X.C58310MuY;
import X.C60827Nu3;
import X.C60828Nu4;
import X.C72242sW;
import X.C72818Shy;
import X.C75859Tpv;
import X.C76800UCe;
import X.C90;
import X.C91;
import X.CB1;
import X.CB3;
import X.CB5;
import X.CB6;
import X.CBB;
import X.CBE;
import X.CBG;
import X.CBI;
import X.CBM;
import X.CBN;
import X.CBP;
import X.CBU;
import X.CBV;
import X.CBX;
import X.CN1;
import X.COL;
import X.EnumC30204BtI;
import X.EnumC30241Btt;
import X.EnumC30931CBz;
import X.EnumC31509CYf;
import X.InterfaceC30442Bx8;
import X.InterfaceC64592gB;
import X.InterfaceC65784Pro;
import X.Q7L;
import X.Q8U;
import X.UDV;
import X.UFK;
import X.X1D;
import Y.AfS57S0100000_5;
import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Message;
import android.os.SystemClock;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.base.model.user.SubscribeInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.browser.IHybridContainerService;
import com.bytedance.android.live.publicscreen.api.IPublicScreenService;
import com.bytedance.android.livesdk.api.revenue.subscription.ISubscribeService;
import com.bytedance.android.livesdk.api.revenue.subscription.api.SubscribeApi;
import com.bytedance.android.livesdk.chatroom.api.LiveSubOnlyConfig;
import com.bytedance.android.livesdk.chatroom.api.SubPinCard;
import com.bytedance.android.livesdk.dataChannel.CustomPollCardVisibility;
import com.bytedance.android.livesdk.dataChannel.CustomizedPerksCardVisibilityChannel;
import com.bytedance.android.livesdk.dataChannel.LiveEventCardVisibility;
import com.bytedance.android.livesdk.dataChannel.PublicScreenGiftPollStateVisibilityChannel;
import com.bytedance.android.livesdk.dataChannel.PublicScreenNormalPollStateVisibilityChannel;
import com.bytedance.android.livesdk.dataChannel.QuestionCardVisibilityEvent;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.SubGoalCardVisibilityChannel;
import com.bytedance.android.livesdk.dataChannel.SubOnlyLiveAudienceStatusChannel;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.impl.revenue.subscription.emoji.LiveSubscribeEmojiInputDialog;
import com.bytedance.android.livesdk.impl.revenue.subscription.emote.preview.PreviewImageDialogFragment;
import com.bytedance.android.livesdk.impl.revenue.subscription.ui.CustomizedPerksCardWidget;
import com.bytedance.android.livesdk.impl.revenue.subscription.ui.PreviewSubscriptionSettingDialog;
import com.bytedance.android.livesdk.impl.revenue.subscription.ui.SubGoalCardWidget;
import com.bytedance.android.livesdk.impl.revenue.subscription.ui.SubOnlyLiveSettingFragment;
import com.bytedance.android.livesdk.impl.revenue.subscription.ui.SubOnlyVideoListFragment;
import com.bytedance.android.livesdk.impl.revenue.subscription.ui.SubscribeInfoListFragment;
import com.bytedance.android.livesdk.impl.revenue.subscription.ui.SubscriptionMigrationSheetDialog;
import com.bytedance.android.livesdk.impl.revenue.subscription.ui.SubscriptionTrialLiveCardWidget;
import com.bytedance.android.livesdk.impl.revenue.subscription.ui.setting.SubscriptionSettingFragmentNew;
import com.bytedance.android.livesdk.impl.revenue.subscription.ui.vspotlight.SubscriptionSpotlightFragment;
import com.bytedance.android.livesdk.impl.revenue.subscription.widget.LandscapeSubscribeIconWidget;
import com.bytedance.android.livesdk.impl.revenue.subscription.widget.SubscribeIconWidget;
import com.bytedance.android.livesdk.impl.revenue.subscription.widget.SubscribeTimeStickerWidget;
import com.bytedance.android.livesdk.impl.revenue.subscription.widget.SubscriptionWidget;
import com.bytedance.android.livesdk.livesetting.model.LiveSubscribeLynxMap;
import com.bytedance.android.livesdk.livesetting.other.subscribe_enhance.SubscribeEnhanceCapsuleSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveServiceManagerOptSetting;
import com.bytedance.android.livesdk.livesetting.performance.SettingUtilANROptSetting;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveSubCapsuleGovernanceSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveEnableNativeSubPageSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.FollowGuidVoidSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveSubsPrivilegeDetailOptSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveSubscribeLynxUrl;
import com.bytedance.android.livesdk.model.message.CapsuleMessage;
import com.bytedance.android.livesdk.model.message.SubscriptionGuideMessage;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.slot.FrameL2SlotVisibilityChannel;
import com.bytedance.android.livesdk.subscribe.model.GetSubInfoResponse;
import com.bytedance.android.livesdkapi.depend.event.LiveGiftShowPinCardEvent;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AqS136S0200000_5;
import kotlin.jvm.internal.AqS152S0200000_5;
import kotlin.jvm.internal.AqS155S0100000_5;
import kotlin.jvm.internal.AqS67S0400000_7;
import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class SubscribeService implements ISubscribeService, WeakHandler.IHandler {
    public boolean LJLIL;
    public volatile boolean LJLILLLLZI;
    public boolean LJLJI;

    @Override // com.bytedance.android.livesdk.api.revenue.subscription.ISubscribeService
    public final Class<? extends LiveRecyclableWidget> dV() {
        return CustomizedPerksCardWidget.class;
    }

    @Override // com.bytedance.android.livesdk.api.revenue.subscription.ISubscribeService
    public final Class<? extends LiveRecyclableWidget> dl0() {
        return SubGoalCardWidget.class;
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
    }

    @Override // com.bytedance.android.livesdk.api.revenue.subscription.ISubscribeService
    public final Class<? extends LiveRecyclableWidget> pI() {
        return SubscriptionTrialLiveCardWidget.class;
    }

    @Override // com.bytedance.android.livesdk.api.revenue.subscription.ISubscribeService
    public final Class<? extends LiveRecyclableWidget> s80() {
        return SubscribeTimeStickerWidget.class;
    }

    @Override // com.bytedance.android.livesdk.api.revenue.subscription.ISubscribeService
    public final Class<? extends LiveRecyclableWidget> wa() {
        return SubscriptionWidget.class;
    }

    static {
        new CBP();
    }

    public static String LIZLLL() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("subs_btn_click", System.currentTimeMillis());
        String jSONObject2 = jSONObject.toString();
        o.LJIIIIZZ(jSONObject2, "JSONObject().apply {\n   …s())\n        }.toString()");
        return jSONObject2;
    }

    @Override // com.bytedance.android.livesdk.api.revenue.subscription.ISubscribeService
    public final void BM() {
        JSONObject jSONObject = new JSONObject();
        C05630Jz.LJI(jSONObject, "show_entrance", "live_take_page");
        C30929CBx.LJIJ("subscription_broadcast_entrance_show", jSONObject);
    }

    @Override // com.bytedance.android.livesdk.api.revenue.subscription.ISubscribeService
    public final C30924CBs CH() {
        return new C30924CBs();
    }

    @Override // com.bytedance.android.livesdk.api.revenue.subscription.ISubscribeService
    public final void Dr0() {
        User owner;
        JSONObject LIZ;
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        if (room != null && (owner = room.getOwner()) != null) {
            Object LIZIZ = C30922CBq.LIZIZ("subscription_settings");
            if (LIZIZ instanceof JSONObject) {
                JSONObject jSONObject = (JSONObject) LIZIZ;
                if (!jSONObject.optBoolean("has_subscription_history", false)) {
                    jSONObject.put("has_subscription_history", true);
                    if (SettingUtilANROptSetting.enableOpt()) {
                        LIZ = C30922CBq.LJIIJ.LIZIZ("subscription_settings");
                    } else {
                        LIZ = C30922CBq.LIZ();
                    }
                    try {
                        LIZ.put("subscription_settings", LIZIZ);
                    } catch (JSONException unused) {
                    }
                    ((ConcurrentHashMap) C30922CBq.LIZLLL).remove("subscription_settings");
                }
            }
            owner.setSubscribeStatus(true);
        }
    }

    @Override // com.bytedance.android.livesdk.api.revenue.subscription.ISubscribeService
    public final SubscriptionWidget Nt() {
        return new SubscriptionWidget();
    }

    @Override // com.bytedance.android.livesdk.api.revenue.subscription.ISubscribeService
    public final void Rl0() {
        SubscribeInfo subscribeInfo;
        String str;
        LiveSubsPrivilegeDetailOptSetting liveSubsPrivilegeDetailOptSetting = LiveSubsPrivilegeDetailOptSetting.INSTANCE;
        if (!liveSubsPrivilegeDetailOptSetting.getValue().enablePreloadReuse) {
            return;
        }
        int i = 0;
        C0K2.LJII(0, "ttlive_subscription_perf_privilege_preloadreuse", C113554cx.LJJLIIIJLLLLLLLZ(new LinkedHashMap()));
        String user_subscribe_entry = LiveSubscribeLynxUrl.INSTANCE.getValue().getUser_subscribe_entry();
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        if (room == null) {
            return;
        }
        if (C29306Beo.LJIJJLI(liveSubsPrivilegeDetailOptSetting.getValue().preloadSchema) && (str = liveSubsPrivilegeDetailOptSetting.getValue().preloadSchema) != null) {
            user_subscribe_entry = str;
        }
        C32364Cn2 c32364Cn2 = new C32364Cn2(user_subscribe_entry);
        String LIZJ = ((C29374Bfu) B83.LIZ().LIZIZ()).LIZJ(room.getOwnerUserId());
        c32364Cn2.LIZJ("anchor_id", LIZJ);
        c32364Cn2.LIZJ("sec_another_user_id", LIZJ);
        c32364Cn2.LIZJ("sec_anchor_id", LIZJ);
        c32364Cn2.LIZIZ(room.getId(), "room_id");
        c32364Cn2.LIZJ("enter_from_merge", BJM.LJFF());
        c32364Cn2.LIZJ("enter_method", BJM.LJIIIIZZ());
        c32364Cn2.LIZJ("request_id", BJM.LJIILIIL());
        c32364Cn2.LIZJ("video_id", BJM.LJIJ());
        User owner = room.getOwner();
        if (owner != null && (subscribeInfo = owner.getSubscribeInfo()) != null && subscribeInfo.isSubscribed()) {
            i = 1;
        }
        c32364Cn2.LIZ(i, "is_subscribe");
        c32364Cn2.LIZJ("target_handler", "webcast");
        long elapsedRealtime = SystemClock.elapsedRealtime();
        C60827Nu3 c60827Nu3 = C58310MuY.LIZIZ;
        String uri = UriProtector.parse(c32364Cn2.LIZLLL()).toString();
        o.LJIIIIZZ(uri, "parse(builder.build()).toString()");
        C60827Nu3.LJIIJ(c60827Nu3, uri, "live_subs_privilege_detail_bid", null, new CBV(elapsedRealtime), false, 32);
    }

    @Override // com.bytedance.android.livesdk.api.revenue.subscription.ISubscribeService
    public final SubscriptionSpotlightFragment c2() {
        return new SubscriptionSpotlightFragment();
    }

    @Override // com.bytedance.android.livesdk.api.revenue.subscription.ISubscribeService
    public final void initPublicScreenConfiguration() {
        if (this.LJLILLLLZI) {
            return;
        }
        this.LJLILLLLZI = true;
        IPublicScreenService iPublicScreenService = (IPublicScreenService) CN1.LIZ(IPublicScreenService.class);
        iPublicScreenService.Yj0(new CB1());
        iPublicScreenService.Dv(10, new CBB());
    }

    @Override // com.bytedance.android.livesdk.api.revenue.subscription.ISubscribeService
    public final void kU() {
        JSONObject jSONObject = new JSONObject();
        C05630Jz.LJI(jSONObject, "show_entrance", "live_take_page");
        C30929CBx.LJIJ("subscription_broadcast_entrance_hide", jSONObject);
    }

    @Override // com.bytedance.android.livesdk.api.revenue.subscription.ISubscribeService
    public final void nI() {
        LiveSubsPrivilegeDetailOptSetting liveSubsPrivilegeDetailOptSetting = LiveSubsPrivilegeDetailOptSetting.INSTANCE;
        if (!liveSubsPrivilegeDetailOptSetting.getValue().enablePreloadReuse) {
            return;
        }
        C60827Nu3 c60827Nu3 = C58310MuY.LIZIZ;
        ALE ale = new ALE();
        ale.LJIIIZ = true;
        ale.LJIIJ = 1;
        ale.LIZ = "live_subs_privilege_detail_bid";
        ale.LJIILIIL = liveSubsPrivilegeDetailOptSetting.getValue().preloadAllowList;
        ale.LJIIL = CBX.LJLIL;
        ale.LIZIZ(CB5.LJLIL);
        ale.LJIILL = liveSubsPrivilegeDetailOptSetting.getValue().ignoreFailedPreload;
        c60827Nu3.getClass();
        Boolean bool = Boolean.FALSE;
        C60827Nu3.LJIIJJI(ale, bool);
        C60828Nu4 c60828Nu4 = C37724ErI.LIZIZ;
        C25570A1u c25570A1u = new C25570A1u();
        c25570A1u.LIZ = true;
        c25570A1u.LIZJ = 1;
        c25570A1u.LIZLLL = "live_subs_privilege_detail_bid";
        c25570A1u.LJII = liveSubsPrivilegeDetailOptSetting.getValue().reuseAllowList;
        c25570A1u.LJI = null;
        CB6 cb6 = CB6.LJLIL;
        o.LJIIJ(cb6, "<set-?>");
        c25570A1u.LJFF = cb6;
        c60828Nu4.getClass();
        C60828Nu4.LJ(c25570A1u, bool);
    }

    @Override // com.bytedance.android.livesdk.api.revenue.subscription.ISubscribeService
    public final void xg0() {
        C58310MuY.LIZIZ.getClass();
        C60827Nu3.LJIIL("live_subs_privilege_detail_bid");
        C37724ErI.LIZIZ.getClass();
        C60828Nu4.LJFF("live_subs_privilege_detail_bid");
    }

    @Override // X.InterfaceC06390Mx
    public final void onInit() {
        if (LiveServiceManagerOptSetting.enable()) {
            return;
        }
        this.LJLILLLLZI = true;
        IPublicScreenService iPublicScreenService = (IPublicScreenService) CN1.LIZ(IPublicScreenService.class);
        iPublicScreenService.Yj0(new CB1());
        iPublicScreenService.Dv(10, new CBB());
    }

    @Override // com.bytedance.android.livesdk.api.revenue.subscription.ISubscribeService
    public final C31058CGw DP() {
        return C31058CGw.LIZ;
    }

    @Override // com.bytedance.android.livesdk.api.revenue.subscription.ISubscribeService
    public final void Rv() {
    }

    @Override // com.bytedance.android.livesdk.api.revenue.subscription.ISubscribeService
    public final boolean bv() {
        return this.LJLIL;
    }

    @Override // com.bytedance.android.livesdk.api.revenue.subscription.ISubscribeService
    public final void cI() {
    }

    @Override // com.bytedance.android.livesdk.api.revenue.subscription.ISubscribeService
    public final GetSubInfoResponse ze0() {
        return C30840C8m.LIZ;
    }

    @Override // com.bytedance.android.livesdk.api.revenue.subscription.ISubscribeService
    public final void H8(UDV udv) {
        PreviewImageDialogFragment previewImageDialogFragment = new PreviewImageDialogFragment();
        ((ArrayList) previewImageDialogFragment.LJLIL).clear();
        ((ArrayList) previewImageDialogFragment.LJLIL).addAll(udv.LIZIZ);
        previewImageDialogFragment.LJLILLLLZI = udv;
        FragmentManager fragmentManager = udv.LIZ;
        if (fragmentManager != null) {
            previewImageDialogFragment.show(fragmentManager, "PreviewImageDialogFragment");
        }
    }

    @Override // com.bytedance.android.livesdk.api.revenue.subscription.ISubscribeService
    public final SubscribeInfoListFragment O3(Context context) {
        o.LJIIIZ(context, "context");
        SubscribeInfoListFragment subscribeInfoListFragment = new SubscribeInfoListFragment();
        Bundle bundle = new Bundle();
        bundle.putString("enter_from", "");
        subscribeInfoListFragment.setArguments(bundle);
        return subscribeInfoListFragment;
    }

    @Override // com.bytedance.android.livesdk.api.revenue.subscription.ISubscribeService
    public final Class<? extends LiveRecyclableWidget> Qh0(boolean z) {
        if (z) {
            return SubscribeIconWidget.class;
        }
        return LandscapeSubscribeIconWidget.class;
    }

    @Override // com.bytedance.android.livesdk.api.revenue.subscription.ISubscribeService
    public final C30841C8n X60(String str) {
        return new C30841C8n(str);
    }

    @Override // com.bytedance.android.livesdk.api.revenue.subscription.ISubscribeService
    public final void XG(DataChannel dataChannel) {
        EnumC30204BtI.SUBSCRIPTION_IN_MORE_DIALOG.load(dataChannel, new C30038Bqc());
    }

    @Override // com.bytedance.android.livesdk.api.revenue.subscription.ISubscribeService
    public final LiveSubscribeEmojiInputDialog ak0(Activity activity) {
        FragmentManager supportFragmentManager = ((ActivityC45651qj) activity).getSupportFragmentManager();
        o.LJIIIIZZ(supportFragmentManager, "activity as FragmentActi…y).supportFragmentManager");
        Bundle bundle = new Bundle();
        LiveSubscribeEmojiInputDialog liveSubscribeEmojiInputDialog = new LiveSubscribeEmojiInputDialog();
        liveSubscribeEmojiInputDialog.setArguments(bundle);
        liveSubscribeEmojiInputDialog.show(supportFragmentManager, "LiveSubscribeEmojiInputDialogFragment");
        return liveSubscribeEmojiInputDialog;
    }

    @Override // com.bytedance.android.livesdk.api.revenue.subscription.ISubscribeService
    public final void cH(DataChannel dataChannel) {
        EnumC30204BtI.ANCHOR_SUBSCRIPTION.load(dataChannel, new BK2());
    }

    @Override // com.bytedance.android.livesdk.api.revenue.subscription.ISubscribeService
    public final void dq(DataChannel dataChannel) {
        if (dataChannel != null) {
            UFK ufk = UFK.LJLIL;
            DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
            dataChannelGlobal.getClass();
            dataChannelGlobal.jv0(ufk);
            IMessageManager iMessageManager = (IMessageManager) dataChannel.kv0(C29927Bop.class);
            if (iMessageManager != null) {
                iMessageManager.removeMessageListener(ufk);
            }
            UFK.LJLILLLLZI.LIZIZ();
            UFK.LJLJI.LIZIZ();
            C72818Shy.LJII("subscription_pin_card_request", ufk);
            C72818Shy.LJII("subscription_unpin_card_request", ufk);
            C72818Shy.LJII("subscription_pin_card_close", ufk);
        }
    }

    @Override // com.bytedance.android.livesdk.api.revenue.subscription.ISubscribeService
    public final void dw(DataChannel dataChannel) {
        Room room = (Room) dataChannel.kv0(RoomChannel.class);
        String LJIILJJIL = C15380j0.LJIILJJIL(R.string.m07);
        o.LJIIIIZZ(LJIILJJIL, "getString(R.string.pm_jp…c_livePage_capsule_title)");
        String LJIILJJIL2 = C15380j0.LJIILJJIL(R.string.m06);
        o.LJIIIIZZ(LJIILJJIL2, "getString(R.string.pm_jp…sic_livePage_capsule_btn)");
        C29846BnW c29846BnW = new C29846BnW(LIZ(null, LJIILJJIL, "pm_jpSubLiveMusic_livePage_capsule_btn", LJIILJJIL2, "live_sub_only_use_music"), Integer.valueOf(R.drawable.d5h), new AqS152S0200000_5(room, dataChannel, 11));
        COL col = new COL();
        CBE cbe = CBE.MUSIC;
        o.LJIIIZ(cbe, "<set-?>");
        col.LIZIZ = cbe;
        c29846BnW.LJJIFFI = col;
        if (room != null) {
            ((IPublicScreenService) CN1.LIZ(IPublicScreenService.class)).GL(room.getId(), c29846BnW);
        }
    }

    @Override // com.bytedance.android.livesdk.api.revenue.subscription.ISubscribeService
    public final void onLocaleChanged(Locale locale) {
        C259810g c259810g = C259710f.LIZ;
        C42061kw c42061kw = new C42061kw();
        c259810g.getClass();
        C259810g.LJIIIIZZ(R.drawable.c86, c42061kw);
    }

    @Override // com.bytedance.android.livesdk.api.revenue.subscription.ISubscribeService
    public final SubscriptionSettingFragmentNew pa(String enterFrom) {
        o.LJIIIZ(enterFrom, "enterFrom");
        SubscriptionSettingFragmentNew subscriptionSettingFragmentNew = new SubscriptionSettingFragmentNew();
        Bundle bundle = new Bundle();
        bundle.putString("arg_enter_from", enterFrom);
        subscriptionSettingFragmentNew.setArguments(bundle);
        subscriptionSettingFragmentNew.LJLIL = enterFrom;
        return subscriptionSettingFragmentNew;
    }

    @Override // com.bytedance.android.livesdk.api.revenue.subscription.ISubscribeService
    public final void z00(DataChannel dataChannel) {
        C48459J0d<Boolean> c48459J0d = InterfaceC30442Bx8.S2;
        Boolean userHasSeenSheet = c48459J0d.LIZJ();
        o.LJIIIIZZ(userHasSeenSheet, "userHasSeenSheet");
        if (userHasSeenSheet.booleanValue()) {
            C28357BAz.LIZ(dataChannel, "anchor_more");
            return;
        }
        c48459J0d.LIZ(Boolean.TRUE);
        FragmentManager fragmentManager = (FragmentManager) dataChannel.kv0(C29494Bhq.class);
        if (fragmentManager == null) {
            return;
        }
        SubscriptionMigrationSheetDialog subscriptionMigrationSheetDialog = new SubscriptionMigrationSheetDialog();
        subscriptionMigrationSheetDialog.LJLJI = "anchor_more";
        subscriptionMigrationSheetDialog.show(fragmentManager, "SubscriptionMigrationSheetDialog");
    }

    @Override // com.bytedance.android.livesdk.api.revenue.subscription.ISubscribeService
    public final void EP(DataChannel dataChannel, String enterFrom) {
        int i;
        o.LJIIIZ(enterFrom, "enterFrom");
        SubscriptionSpotlightFragment subscriptionSpotlightFragment = new SubscriptionSpotlightFragment();
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = (InterfaceC65784Pro) dataChannel.kv0(C75859Tpv.class);
        if (interfaceC65784Pro == null) {
            interfaceC65784Pro = CBU.LJLIL;
        }
        o.LJIIIZ(interfaceC65784Pro, "<set-?>");
        subscriptionSpotlightFragment.LJLJJI = interfaceC65784Pro;
        FragmentManager fragmentManager = (FragmentManager) dataChannel.kv0(C29494Bhq.class);
        if (fragmentManager != null) {
            C1B3 c1b3 = new C1B3(fragmentManager);
            Integer num = (Integer) dataChannel.kv0(BDK.class);
            if (num != null) {
                i = num.intValue();
            } else {
                i = 0;
            }
            subscriptionSpotlightFragment.LJLIL = enterFrom;
            c1b3.LJIIIIZZ(i, 1, subscriptionSpotlightFragment, "SubscriptionHighlightFragment");
            c1b3.LJ("SubscriptionHighlightFragment");
            c1b3.LJIILJJIL();
        }
    }

    @Override // com.bytedance.android.livesdk.api.revenue.subscription.ISubscribeService
    public final SubOnlyLiveSettingFragment F6(String enterFrom, GetSubInfoResponse getSubInfoResponse) {
        o.LJIIIZ(enterFrom, "enterFrom");
        SubOnlyLiveSettingFragment subOnlyLiveSettingFragment = new SubOnlyLiveSettingFragment();
        subOnlyLiveSettingFragment.LJLLJ = enterFrom;
        subOnlyLiveSettingFragment.LJLLL = getSubInfoResponse;
        return subOnlyLiveSettingFragment;
    }

    @Override // com.bytedance.android.livesdk.api.revenue.subscription.ISubscribeService
    public final void Pv(DataChannel dataChannel, LiveSubOnlyConfig liveSubOnlyConfig) {
        o.LJIIIZ(dataChannel, "dataChannel");
        C28477BFp.LIZ(dataChannel, "anchor_close_live_popup", liveSubOnlyConfig, false);
    }

    @Override // com.bytedance.android.livesdk.api.revenue.subscription.ISubscribeService
    public final void Xo(String str, AqS67S0400000_7 aqS67S0400000_7) {
        C30929CBx.LJIIJJI(C1EW.LIZ(((SubscribeApi) Q7L.LIZIZ(SubscribeApi.class)).getSubscribeInfo(true, ((C29374Bfu) B83.LIZ().LIZIZ()).LIZIZ.getSecUid(), true, str)), EnumC30931CBz.SUBINFO, str, C30843C8p.LJLIL).LJJJJZI(new AfS57S0100000_5(aqS67S0400000_7, 380));
    }

    @Override // com.bytedance.android.livesdk.api.revenue.subscription.ISubscribeService
    public final void wr0(DataChannel dataChannel, String str) {
        o.LJIIIZ(dataChannel, "dataChannel");
        C29402BgM.LIZ(dataChannel, str);
    }

    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Integer, O] */
    @Override // com.bytedance.android.livesdk.api.revenue.subscription.ISubscribeService
    public final void CF(Context context, Room room, DataChannel dataChannel) {
        int i;
        Boolean bool;
        CBE cbe;
        o.LJIIIZ(context, "context");
        if (this.LJLJI || dataChannel == null || room == null || C29306Beo.LJJ((Boolean) dataChannel.kv0(UserIsAnchorChannel.class))) {
            return;
        }
        C34K c34k = new C34K();
        boolean value = SubscribeEnhanceCapsuleSetting.INSTANCE.getValue();
        boolean isAnchorHasSubQualification = room.getOwner().isAnchorHasSubQualification();
        boolean isSubscribed = room.getOwner().isSubscribed();
        Integer num = (Integer) dataChannel.kv0(BCH.class);
        if (num != null) {
            i = num.intValue();
        } else {
            i = 0;
        }
        if (isAnchorHasSubQualification && !isSubscribed && i > 0) {
            if (i == 1) {
                String str = (String) dataChannel.kv0(C28396BCm.class);
                if (str == null) {
                    str = "";
                }
                LJ(dataChannel, room, CBE.SUBSCRIBE, str, false);
                ((C32537Cpp) dataChannel.gv0(BCH.class)).LIZ = 2;
                ((C32537Cpp) dataChannel.gv0(C28396BCm.class)).LIZ = "";
                return;
            }
            return;
        }
        Calendar calendar = Calendar.getInstance();
        String LIZIZ = Q8U.LIZIZ(new Object[]{Integer.valueOf(calendar.get(1)), Integer.valueOf(calendar.get(2) + 1), Integer.valueOf(calendar.get(5)), Long.valueOf(room.getOwnerUserId())}, 4, "%s_%s_%s_%s", "format(format, *args)");
        C48459J0d<Map<String, Boolean>> c48459J0d = InterfaceC30442Bx8.l;
        if (!c48459J0d.LIZJ().containsKey(LIZIZ) && isAnchorHasSubQualification && value) {
            if (!isSubscribed) {
                C90 c90 = (C90) dataChannel.kv0(C91.class);
                if (c90 != null) {
                    bool = Boolean.valueOf(c90.LIZ);
                } else {
                    bool = null;
                }
                if (C29306Beo.LJJIFFI(bool)) {
                    cbe = CBE.SUPPORT;
                } else {
                    cbe = CBE.SUBSCRIBE;
                }
                LJ(dataChannel, room, cbe, null, true);
                Map<String, Boolean> LIZJ = c48459J0d.LIZJ();
                o.LJIIIIZZ(LIZJ, "LAST_SHOW_SUBSCRIPTION_GUIDE.value");
                LIZJ.put(LIZIZ, Boolean.TRUE);
                return;
            }
            C34K c34k2 = new C34K();
            C72242sW c72242sW = new C72242sW();
            this.LJLJI = true;
            C1EW.LIZ(((SubscribeApi) Q7L.LIZIZ(SubscribeApi.class)).getUserInfo(room.getOwner().getSecUid())).LJJJLIIL(new CBI(c34k, c72242sW, c34k2, this, dataChannel, room, LIZIZ), new InterfaceC64592gB() { // from class: X.9Dl
                @Override // X.InterfaceC64592gB
                public final /* bridge */ /* synthetic */ void accept(Object obj) {
                }
            });
        }
    }

    @Override // com.bytedance.android.livesdk.api.revenue.subscription.ISubscribeService
    public final void Ee(Context context, Room roomInfo, String showEntrance) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(roomInfo, "roomInfo");
        o.LJIIIZ(showEntrance, "showEntrance");
        ui0(context, roomInfo, showEntrance, null);
    }

    @Override // com.bytedance.android.livesdk.api.revenue.subscription.ISubscribeService
    public final void Vu0(Context context, String str, Map extras) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(extras, "extras");
        if (str == null || ujb.o.LJJJJJL(str)) {
            return;
        }
        C32364Cn2 c32364Cn2 = new C32364Cn2(str);
        for (Map.Entry entry : extras.entrySet()) {
            c32364Cn2.LIZJ((String) entry.getKey(), (String) entry.getValue());
        }
        Uri parse = UriProtector.parse(c32364Cn2.LIZLLL());
        o.LJIIIIZZ(parse, "parse(builder.build())");
        ((IActionHandlerService) CN1.LIZ(IActionHandlerService.class)).handle(context, parse);
    }

    @Override // com.bytedance.android.livesdk.api.revenue.subscription.ISubscribeService
    public final PreviewSubscriptionSettingDialog Xr0(int i, String str, String str2) {
        PreviewSubscriptionSettingDialog previewSubscriptionSettingDialog = new PreviewSubscriptionSettingDialog();
        previewSubscriptionSettingDialog.LJLIL = i;
        o.LJI(str);
        previewSubscriptionSettingDialog.LJLILLLLZI = str;
        previewSubscriptionSettingDialog.LJLJI = str2;
        return previewSubscriptionSettingDialog;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x006d, code lost:
    
        if (r0.isSubscribed() == true) goto L11;
     */
    @Override // com.bytedance.android.livesdk.api.revenue.subscription.ISubscribeService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Yl(android.content.Context r5, com.bytedance.android.livesdkapi.depend.model.live.Room r6, java.lang.String r7) {
        /*
            r4 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.o.LJIIIZ(r5, r0)
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            if (r0 == 0) goto Lc
            return
        Lc:
            X.Cn2 r2 = new X.Cn2
            r2.<init>(r7)
            X.B83 r0 = X.B83.LIZ()
            X.BgP r3 = r0.LIZIZ()
            long r0 = r6.getOwnerUserId()
            X.Bfu r3 = (X.C29374Bfu) r3
            java.lang.String r1 = r3.LIZJ(r0)
            java.lang.String r0 = "anchor_id"
            r2.LIZJ(r0, r1)
            java.lang.String r3 = "room_id"
            long r0 = r6.getId()
            r2.LIZIZ(r0, r3)
            java.lang.String r1 = X.BJM.LJFF()
            java.lang.String r0 = "enter_from_merge"
            r2.LIZJ(r0, r1)
            java.lang.String r1 = X.BJM.LJIIIIZZ()
            java.lang.String r0 = "enter_method"
            r2.LIZJ(r0, r1)
            java.lang.String r1 = "show_entrance"
            java.lang.String r0 = "webapp"
            r2.LIZJ(r1, r0)
            java.lang.String r1 = X.BJM.LJIILIIL()
            java.lang.String r0 = "request_id"
            r2.LIZJ(r0, r1)
            java.lang.String r1 = X.BJM.LJIJ()
            java.lang.String r0 = "video_id"
            r2.LIZJ(r0, r1)
            com.bytedance.android.live.base.model.user.User r0 = r6.getOwner()
            if (r0 == 0) goto L8d
            com.bytedance.android.live.base.model.user.SubscribeInfo r0 = r0.getSubscribeInfo()
            if (r0 == 0) goto L8d
            boolean r0 = r0.isSubscribed()
            r1 = 1
            if (r0 != r1) goto L8d
        L6f:
            java.lang.String r0 = "is_subscribe"
            r2.LIZ(r1, r0)
            java.lang.String r0 = r2.LIZLLL()
            android.net.Uri r1 = com.bytedance.mt.protector.impl.UriProtector.parse(r0)
            java.lang.String r0 = "parse(builder.build())"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            java.lang.Class<com.bytedance.android.live.actionhandler.IActionHandlerService> r0 = com.bytedance.android.live.actionhandler.IActionHandlerService.class
            X.0Mx r0 = X.CN1.LIZ(r0)
            com.bytedance.android.live.actionhandler.IActionHandlerService r0 = (com.bytedance.android.live.actionhandler.IActionHandlerService) r0
            r0.handle(r5, r1)
            return
        L8d:
            r1 = 0
            goto L6f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.impl.revenue.subscription.SubscribeService.Yl(android.content.Context, com.bytedance.android.livesdkapi.depend.model.live.Room, java.lang.String):void");
    }

    @Override // com.bytedance.android.livesdk.api.revenue.subscription.ISubscribeService
    public final void hB(Context context, LifecycleOwner lifecycleOwner, DataChannel dataChannel) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        o.LJIIIZ(dataChannel, "dataChannel");
        EnumC30241Btt.load$default(EnumC30241Btt.AUDIENCE_SUBSCRIPTION, dataChannel, new C29894BoI(), null, 4, null);
    }

    @Override // com.bytedance.android.livesdk.api.revenue.subscription.ISubscribeService
    public final void pc0(Room room, DataChannel dataChannel, LifecycleOwner lifecycleOwner) {
        SubPinCard subPinCard;
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        if (dataChannel != null) {
            UFK ufk = UFK.LJLIL;
            IMessageManager iMessageManager = (IMessageManager) dataChannel.kv0(C29927Bop.class);
            if (iMessageManager != null) {
                iMessageManager.addMessageListener(EnumC31509CYf.SUB_PIN_EVENT_MESSAGE.getIntType(), ufk);
            }
            dataChannel.lv0(lifecycleOwner, FrameL2SlotVisibilityChannel.class, C30912CBg.LJLIL);
            dataChannel.lv0(lifecycleOwner, QuestionCardVisibilityEvent.class, C30913CBh.LJLIL);
            dataChannel.lv0(lifecycleOwner, LiveEventCardVisibility.class, C30914CBi.LJLIL);
            dataChannel.lv0(lifecycleOwner, PublicScreenNormalPollStateVisibilityChannel.class, C30916CBk.LJLIL);
            dataChannel.lv0(lifecycleOwner, PublicScreenGiftPollStateVisibilityChannel.class, C30917CBl.LJLIL);
            dataChannel.lv0(lifecycleOwner, CustomPollCardVisibility.class, C30918CBm.LJLIL);
            dataChannel.lv0(lifecycleOwner, SubOnlyLiveAudienceStatusChannel.class, C30911CBf.LJLIL);
            dataChannel.lv0(lifecycleOwner, CustomizedPerksCardVisibilityChannel.class, C30919CBn.LJLIL);
            dataChannel.lv0(lifecycleOwner, SubGoalCardVisibilityChannel.class, C30920CBo.LJLIL);
            DataChannelGlobal.LJLJJI.nv0(ufk, lifecycleOwner, LiveGiftShowPinCardEvent.class, C30910CBe.LJLIL);
            C0MB<Integer> c0mb = UFK.LJLJI;
            c0mb.LJI(1, 0);
            c0mb.LJI(2, 0);
            if (room != null && (subPinCard = room.subPinCard) != null) {
                UFK.LIZ(subPinCard, null, new AqS155S0100000_5(room, 445), 2);
            }
            C72818Shy.LIZLLL("subscription_pin_card_request", ufk);
            C72818Shy.LIZLLL("subscription_unpin_card_request", ufk);
            C72818Shy.LIZLLL("subscription_pin_card_close", ufk);
        }
    }

    @Override // com.bytedance.android.livesdk.api.revenue.subscription.ISubscribeService
    public final SubOnlyVideoListFragment T5(long j, String secUserId, String enterFrom, boolean z) {
        o.LJIIIZ(secUserId, "secUserId");
        o.LJIIIZ(enterFrom, "enterFrom");
        SubOnlyVideoListFragment subOnlyVideoListFragment = new SubOnlyVideoListFragment();
        Bundle bundle = new Bundle();
        bundle.putBoolean("is_author", z);
        bundle.putLong("user_id", j);
        bundle.putString("sec_user_id", secUserId);
        bundle.putString("enter_from", enterFrom);
        subOnlyVideoListFragment.setArguments(bundle);
        return subOnlyVideoListFragment;
    }

    @Override // com.bytedance.android.livesdk.api.revenue.subscription.ISubscribeService
    public final void kg0(Context context, Room roomInfo, String showEntrance, String str) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(roomInfo, "roomInfo");
        o.LJIIIZ(showEntrance, "showEntrance");
        dc(context, roomInfo, showEntrance, null, str);
    }

    @Override // com.bytedance.android.livesdk.api.revenue.subscription.ISubscribeService
    public final void ui0(Context context, Room roomInfo, String showEntrance, Map<String, String> map) {
        boolean z;
        String user_subscribe_state_five_split;
        SubscribeInfo subscribeInfo;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(roomInfo, "roomInfo");
        o.LJIIIZ(showEntrance, "showEntrance");
        LiveSubscribeLynxMap value = LiveSubscribeLynxUrl.INSTANCE.getValue();
        Boolean bool = (Boolean) DataChannelGlobal.LJLJJI.mv0(C29063Bat.class);
        int i = 1;
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            z = true;
        }
        if (z) {
            user_subscribe_state_five_split = value.getUser_subscribe_state();
        } else {
            user_subscribe_state_five_split = value.getUser_subscribe_state_five_split();
        }
        C32364Cn2 c32364Cn2 = new C32364Cn2(user_subscribe_state_five_split);
        String LIZJ = ((C29374Bfu) B83.LIZ().LIZIZ()).LIZJ(roomInfo.getOwnerUserId());
        c32364Cn2.LIZJ("anchor_id", LIZJ);
        c32364Cn2.LIZIZ(roomInfo.getId(), "room_id");
        c32364Cn2.LIZJ("sec_another_user_id", LIZJ);
        c32364Cn2.LIZJ("sec_anchor_id", LIZJ);
        c32364Cn2.LIZJ("enter_from_merge", BJM.LJFF());
        c32364Cn2.LIZJ("enter_method", BJM.LJIIIIZZ());
        c32364Cn2.LIZJ("show_entrance", showEntrance);
        c32364Cn2.LIZJ("request_id", BJM.LJIILIIL());
        c32364Cn2.LIZJ("video_id", BJM.LJIJ());
        User owner = roomInfo.getOwner();
        if (owner == null || (subscribeInfo = owner.getSubscribeInfo()) == null || !subscribeInfo.isSubscribed()) {
            i = 0;
        }
        c32364Cn2.LIZ(i, "is_subscribe");
        c32364Cn2.LIZJ("subs_perf_tracker", LIZLLL());
        if (map != null) {
            for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
                c32364Cn2.LIZJ((String) entry.getKey(), (String) entry.getValue());
            }
        }
        Uri parse = UriProtector.parse(c32364Cn2.LIZLLL());
        o.LJIIIIZZ(parse, "parse(builder.build())");
        ((IActionHandlerService) CN1.LIZ(IActionHandlerService.class)).handle(context, parse);
    }

    public final CapsuleMessage LIZ(String str, String str2, String str3, String str4, String str5) {
        CapsuleMessage capsuleMessage = new CapsuleMessage();
        capsuleMessage.isLocalInsertMsg = true;
        capsuleMessage.capsuleType = 10;
        capsuleMessage.scene = str5;
        capsuleMessage.schema = "";
        Text text = new Text();
        text.key = str;
        text.defaultPattern = str2;
        capsuleMessage.desc = text;
        Text text2 = new Text();
        text2.key = str3;
        text2.defaultPattern = str4;
        capsuleMessage.buttonText = text2;
        return capsuleMessage;
    }

    public final void LJ(DataChannel dataChannel, Room room, CBE cbe, String str, boolean z) {
        String LJIILJJIL;
        String str2;
        if (C29306Beo.LJIIJ(dataChannel)) {
            return;
        }
        LiveSubCapsuleGovernanceSetting liveSubCapsuleGovernanceSetting = LiveSubCapsuleGovernanceSetting.INSTANCE;
        if (liveSubCapsuleGovernanceSetting.subCapsuleRollOff() && z) {
            return;
        }
        int[] iArr = CBG.LIZ;
        int i = iArr[cbe.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    LJIILJJIL = "";
                } else {
                    LJIILJJIL = C15380j0.LJIILJJIL(R.string.lqv);
                    o.LJIIIIZZ(LJIILJJIL, "getString(R.string.pm_goal_reminder)");
                }
            } else {
                String LJIILJJIL2 = C15380j0.LJIILJJIL(R.string.oin);
                o.LJIIIIZZ(LJIILJJIL2, "getString(R.string.pm_subto)");
                LJIILJJIL = ujb.o.LJJJJZ(LJIILJJIL2, "{username}", "%s", false);
            }
        } else {
            LJIILJJIL = C15380j0.LJIILJJIL(R.string.oep);
            o.LJIIIIZZ(LJIILJJIL, "getString(R.string.pm_subcapsule_expire)");
        }
        if (liveSubCapsuleGovernanceSetting.subCapsuleOpt(false)) {
            String buttonText = C15380j0.LJIILJJIL(R.string.oeq);
            int i2 = iArr[cbe.ordinal()];
            if (i2 != 1) {
                str2 = "sub_capsule_mock";
                if (i2 != 2) {
                    if (i2 == 3) {
                        buttonText = C15380j0.LJIILJJIL(R.string.lqw);
                        str2 = "sub_goal_capsule_mock";
                    }
                } else {
                    buttonText = C15380j0.LJIILJJIL(R.string.oeq);
                }
            } else {
                buttonText = C15380j0.LJIILJJIL(R.string.oes);
                str2 = "extend_sub_capsule_mock";
            }
            String LIZ = C05170If.LIZ(room.getOwner());
            if (LIZ.length() > 8) {
                StringBuilder LIZ2 = X1D.LIZ();
                String substring = LIZ.substring(0, 7);
                o.LJIIIIZZ(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                LIZ2.append(substring);
                LIZ2.append("...");
                LIZ = X1D.LIZIZ(LIZ2);
            }
            String LLLZ = C16880lQ.LLLZ(LJIILJJIL, Arrays.copyOf(new Object[]{LIZ}, 1));
            o.LJIIIIZZ(LLLZ, "format(format, *args)");
            o.LJIIIIZZ(buttonText, "buttonText");
            C29846BnW c29846BnW = new C29846BnW(LIZ(null, LLLZ, null, buttonText, str2), Integer.valueOf(R.drawable.d5h), null);
            COL col = new COL();
            col.LIZIZ = cbe;
            col.LIZ = str;
            c29846BnW.LJJIFFI = col;
            ((IPublicScreenService) CN1.LIZ(IPublicScreenService.class)).GL(room.getId(), c29846BnW);
            return;
        }
        IMessageManager iMessageManager = (IMessageManager) dataChannel.kv0(C29927Bop.class);
        SubscriptionGuideMessage subscriptionGuideMessage = new SubscriptionGuideMessage();
        subscriptionGuideMessage.LJLJI = true;
        subscriptionGuideMessage.LJLILLLLZI = cbe;
        CommonMessageData commonMessageData = new CommonMessageData();
        commonMessageData.roomId = room.getId();
        commonMessageData.showMsg = true;
        subscriptionGuideMessage.baseMessage = commonMessageData;
        subscriptionGuideMessage.LJLJJI = str;
        subscriptionGuideMessage.LJLIL = Q8U.LIZIZ(new Object[]{C05170If.LIZ(room.getOwner())}, 1, LJIILJJIL, "format(format, *args)");
        if (iMessageManager == null) {
            return;
        }
        iMessageManager.insertMessage(subscriptionGuideMessage, true);
    }

    @Override // com.bytedance.android.livesdk.api.revenue.subscription.ISubscribeService
    public final void Re(FragmentManager fragmentManager, String str, String str2, boolean z, BTL btl) {
        C31613Cav.LIZ(str, str2, false, z, btl).show(fragmentManager, "");
    }

    @Override // com.bytedance.android.livesdk.api.revenue.subscription.ISubscribeService
    public final void Ze(Context context, boolean z, String str, String str2, String str3) {
        CB3 cb3;
        o.LJIIIZ(context, "context");
        if (o.LJ(str, "popup")) {
            cb3 = CB3.POPUP;
        } else {
            cb3 = CB3.FULL_PAGE;
        }
        CBN.LIZIZ(context, z, cb3, str2, str3);
    }

    @Override // com.bytedance.android.livesdk.api.revenue.subscription.ISubscribeService
    public final void dc(Context context, Room roomInfo, String showEntrance, Map<String, String> map, String str) {
        boolean z;
        String user_subscribe_entry;
        SubscribeInfo subscribeInfo;
        CBM cbm;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(roomInfo, "roomInfo");
        o.LJIIIZ(showEntrance, "showEntrance");
        SubscribeInfo subscribeInfo2 = roomInfo.getOwner().getSubscribeInfo();
        int i = 0;
        if (subscribeInfo2 != null) {
            z = subscribeInfo2.isInGracePeriod();
        } else {
            z = false;
        }
        if (!z && LiveEnableNativeSubPageSetting.INSTANCE.isEnabled()) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (map != null) {
                for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            linkedHashMap.put("subs_perf_tracker", LIZLLL());
            linkedHashMap.put("emote_id", str);
            if (FollowGuidVoidSetting.INSTANCE.getValue() > 0) {
                cbm = new CBM(this);
            } else {
                cbm = null;
            }
            CBN.LIZ(context, roomInfo, showEntrance, linkedHashMap, cbm, null, null);
            return;
        }
        LiveSubscribeLynxMap value = LiveSubscribeLynxUrl.INSTANCE.getValue();
        if (z) {
            user_subscribe_entry = value.getUser_grace_period();
        } else {
            user_subscribe_entry = value.getUser_subscribe_entry();
        }
        C32364Cn2 c32364Cn2 = new C32364Cn2(user_subscribe_entry);
        String LIZJ = ((C29374Bfu) B83.LIZ().LIZIZ()).LIZJ(roomInfo.getOwnerUserId());
        c32364Cn2.LIZJ("anchor_id", LIZJ);
        c32364Cn2.LIZJ("sec_another_user_id", LIZJ);
        c32364Cn2.LIZJ("sec_anchor_id", LIZJ);
        c32364Cn2.LIZIZ(roomInfo.getId(), "room_id");
        c32364Cn2.LIZJ("enter_from_merge", BJM.LJFF());
        c32364Cn2.LIZJ("enter_method", BJM.LJIIIIZZ());
        c32364Cn2.LIZJ("show_entrance", showEntrance);
        c32364Cn2.LIZJ("request_id", BJM.LJIILIIL());
        c32364Cn2.LIZJ("video_id", BJM.LJIJ());
        User owner = roomInfo.getOwner();
        if (owner != null && (subscribeInfo = owner.getSubscribeInfo()) != null && subscribeInfo.isSubscribed()) {
            i = 1;
        }
        c32364Cn2.LIZ(i, "is_subscribe");
        c32364Cn2.LIZJ("subs_perf_tracker", LIZLLL());
        c32364Cn2.LIZJ("emote_id", str);
        if (map != null) {
            for (Map.Entry entry2 : ((LinkedHashMap) map).entrySet()) {
                c32364Cn2.LIZJ((String) entry2.getKey(), (String) entry2.getValue());
            }
        }
        Uri parse = UriProtector.parse(c32364Cn2.LIZLLL());
        o.LJIIIIZZ(parse, "parse(builder.build())");
        IHybridContainerService iHybridContainerService = (IHybridContainerService) CN1.LIZ(IHybridContainerService.class);
        String uri = parse.toString();
        o.LJIIIIZZ(uri, "uri.toString()");
        iHybridContainerService.Vs0(context, uri, new AqS136S0200000_5(c32364Cn2, this, 9));
    }

    @Override // com.bytedance.android.livesdk.api.revenue.subscription.ISubscribeService
    public final void Up(Context context, Room roomInfo, String str, String str2, Map<String, String> map, String str3) {
        SubscribeInfo subscribeInfo;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(roomInfo, "roomInfo");
        int i = 0;
        if (str == null || ujb.o.LJJJJJL(str)) {
            return;
        }
        C32364Cn2 c32364Cn2 = new C32364Cn2(str);
        String LIZJ = ((C29374Bfu) B83.LIZ().LIZIZ()).LIZJ(roomInfo.getOwnerUserId());
        c32364Cn2.LIZJ("anchor_id", LIZJ);
        c32364Cn2.LIZJ("sec_anchor_id", LIZJ);
        c32364Cn2.LIZJ("sec_another_user_id", LIZJ);
        c32364Cn2.LIZIZ(roomInfo.getId(), "room_id");
        c32364Cn2.LIZJ("enter_from_merge", BJM.LJFF());
        c32364Cn2.LIZJ("enter_method", BJM.LJIIIIZZ());
        c32364Cn2.LIZJ("show_entrance", str2);
        c32364Cn2.LIZJ("request_id", BJM.LJIILIIL());
        c32364Cn2.LIZJ("video_id", BJM.LJIJ());
        User owner = roomInfo.getOwner();
        if (owner != null && (subscribeInfo = owner.getSubscribeInfo()) != null && subscribeInfo.isSubscribed()) {
            i = 1;
        }
        c32364Cn2.LIZ(i, "is_subscribe");
        if (str3 != null) {
            c32364Cn2.LIZJ("emote_id", str3);
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (value == null) {
                value = "";
            }
            c32364Cn2.LIZJ(key, value);
        }
        Uri parse = UriProtector.parse(c32364Cn2.LIZLLL());
        o.LJIIIIZZ(parse, "parse(builder.build())");
        ((IActionHandlerService) CN1.LIZ(IActionHandlerService.class)).handle(context, parse);
    }
}
