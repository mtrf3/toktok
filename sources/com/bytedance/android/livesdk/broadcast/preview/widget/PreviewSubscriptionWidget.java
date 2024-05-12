package com.bytedance.android.livesdk.broadcast.preview.widget;

import X.B83;
import X.BZI;
import X.C06540Nm;
import X.C15380j0;
import X.C16880lQ;
import X.C199097rd;
import X.C1B3;
import X.C1XY;
import X.C1YG;
import X.C1YH;
import X.C279117r;
import X.C28509BGv;
import X.C28787BRn;
import X.C29306Beo;
import X.C29374Bfu;
import X.C29494Bhq;
import X.C30798C6w;
import X.C30799C6x;
import X.C30800C6y;
import X.C30801C6z;
import X.C31767CdP;
import X.C32364Cn2;
import X.C39927Flj;
import X.C5H3;
import X.C62819Ol5;
import X.C68322mC;
import X.C70;
import X.C71;
import X.C72818Shy;
import X.C75;
import X.C76;
import X.C78;
import X.C78996UzQ;
import X.C7B;
import X.C7C;
import X.C7D;
import X.C7E;
import X.C7F;
import X.C7G;
import X.C7I;
import X.C7N;
import X.CN1;
import X.DialogC31813Ce9;
import X.InterfaceC30442Bx8;
import X.InterfaceC72822Si2;
import X.InterfaceC78280Uns;
import X.JBR;
import X.UFE;
import Y.ARunnableS41S0100000_5;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.LiveModeChannel;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.api.revenue.subscription.event.OpenNewRecordPage;
import com.bytedance.android.livesdk.api.revenue.subscription.event.SubNoteToastEvent;
import com.bytedance.android.livesdk.broadcast.PreviewSourceParamsDataChannel;
import com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget;
import com.bytedance.android.livesdk.dataChannel.IsSubscribeEnable;
import com.bytedance.android.livesdk.livesetting.broadcast.TtliveGameImproveSubscribeSetting;
import com.bytedance.android.livesdk.livesetting.gift.LiveStreamGoalPresetWebLinkSetting;
import com.bytedance.android.livesdk.livesetting.model.LiveSubscribeLynxMap;
import com.bytedance.android.livesdk.livesetting.other.FAQSettings;
import com.bytedance.android.livesdk.livesetting.performance.BuriedFieldReductionSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubCreateToolsEntranceNewSetting;
import com.bytedance.android.livesdk.livesetting.subscription.SubscribeInvitationLynxUrlSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveSubscribeLynxUrl;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.host.IHostSubscription;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.UriProtector;
import com.google.android.play.core.appupdate.u;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AqS155S0100000_5;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class PreviewSubscriptionWidget extends PreviewToolBaseWidget implements InterfaceC72822Si2 {
    public long LJLJL;
    public long LJLJLJ;
    public boolean LJLJLLL;
    public boolean LJLL;
    public boolean LJLLI;
    public final C5H3 LJLJI = C78996UzQ.LJJIJIIJI(C78.LJLIL);
    public final C75 LJLJJI = C7N.LJIL().X60("go_live_page");
    public final int LJLJJL = R.string.oby;
    public final int LJLJJLL = R.drawable.cz5;
    public final C5H3 LJLLILLLL = C78996UzQ.LJJIJIIJI(C7B.LJLIL);
    public final Handler LJLLJ = new Handler(C16880lQ.LLJJJJ());

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget, com.bytedance.android.live.broadcast.preview.PreviewWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final void LLIIIILZ() {
        LiveMode liveMode;
        if (this.LJLJLLL) {
            return;
        }
        this.LJLJLLL = true;
        BZI LIZ = C28787BRn.LIZ("livesdk_subscribe_icon_show");
        LIZ.LJFF(String.valueOf(((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId()));
        LIZ.LJIJJ("anchor", "user_type");
        LIZ.LJIJJ("live_take_page", "show_entrance");
        C62819Ol5.LJJII(LIZ, this.dataChannel, true);
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel == null || (liveMode = (LiveMode) dataChannel.kv0(LiveModeChannel.class)) == null) {
            liveMode = LiveMode.VIDEO;
        }
        LIZ.LJIJJ(C28509BGv.LIZ(liveMode), "live_type");
        LIZ.LJIJJ(Integer.valueOf(C29306Beo.LJJIFFI(Boolean.valueOf(LLFZ())) ? 1 : 0), "have_red_dot");
        if (!BuriedFieldReductionSetting.INSTANCE.isBuriedField(LIZ.LJIILL())) {
            LIZ.LJJIIJZLJL();
            return;
        }
        LIZ.LJJIJ();
        LIZ.LJJIIZ();
        LIZ.LJJIIZI();
    }

    public final boolean LLIIIJ() {
        Object obj;
        if (!User.sSubPermission) {
            if (TtliveGameImproveSubscribeSetting.INSTANCE.shouldImproveSubscribe()) {
                LiveMode liveMode = LiveMode.SCREEN_RECORD;
                DataChannel dataChannel = this.dataChannel;
                if (dataChannel != null) {
                    obj = dataChannel.kv0(LiveModeChannel.class);
                } else {
                    obj = null;
                }
                if (liveMode == obj) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onDestroy() {
        C72818Shy.LJII("anchor_subscribe_invitation_accepted", this);
        C72818Shy.LJII("open_native_subscription_settings", this);
        C72818Shy.LJII("close_native_subscription_settings", this);
        C72818Shy.LJII("anchor_sub_gift_balance_changed", this);
        super.onDestroy();
        C75 c75 = this.LJLJJI;
        if (c75 != null) {
            c75.onDestroy();
        }
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void onHide() {
        C75 c75 = this.LJLJJI;
        if (c75 != null) {
            c75.LIZJ(new C76(this));
        }
        C7N.LJIL().kU();
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void onShow() {
        Boolean LIZJ = InterfaceC30442Bx8.LJJZZI.LIZJ();
        o.LJIIIIZZ(LIZJ, "LIVE_SUBSCRIBE_SHOW_PREVIEW_REDDOT.value");
        if (LIZJ.booleanValue()) {
            LLII();
        }
        this.LJLJLJ = System.currentTimeMillis();
        LLIIIILZ();
        C7N.LJIL().BM();
        C75 c75 = this.LJLJJI;
        if (c75 != null) {
            c75.LIZJ(new C71(this));
        }
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void LJZ() {
        Boolean bool;
        super.LJZ();
        if (LLIIIJ()) {
            show();
        } else {
            hide();
        }
        if (C29306Beo.LJJIIJ(getView())) {
            LLIIIILZ();
            if (TtliveGameImproveSubscribeSetting.INSTANCE.shouldImproveSubscribe() && (bool = (Boolean) this.dataChannel.kv0(IsSubscribeEnable.class)) != null) {
                LLIIIL(bool.booleanValue());
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [android.os.Bundle, T, android.os.BaseBundle] */
    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget, com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void LJZL() {
        String optString;
        JSONObject optJSONObject;
        super.LJZL();
        C72818Shy.LIZLLL("anchor_subscribe_invitation_accepted", this);
        C72818Shy.LIZLLL("open_native_subscription_settings", this);
        C72818Shy.LIZLLL("close_native_subscription_settings", this);
        C72818Shy.LIZLLL("anchor_sub_gift_balance_changed", this);
        C75 c75 = this.LJLJJI;
        if (c75 != null) {
            c75.LIZJ(new C7C());
        }
        if (LLIIIJ()) {
            show();
        } else {
            hide();
        }
        this.dataChannel.ov0(this, IsSubscribeEnable.class, new AqS171S0100000_5(this, 190));
        JSONObject jSONObject = (JSONObject) this.dataChannel.kv0(PreviewSourceParamsDataChannel.class);
        C68322mC c68322mC = new C68322mC();
        if (jSONObject != null) {
            ?? bundle = new Bundle();
            bundle.putInt("open_sub_setting", jSONObject.optInt("open_sub_setting"));
            bundle.putInt("open_sub_only_setting", jSONObject.optInt("open_sub_only_setting"));
            bundle.putString("show_entrance", jSONObject.optString("show_entrance"));
            bundle.putString("code", jSONObject.optString("code"));
            bundle.putString("open_type", jSONObject.optString("open_type"));
            bundle.putString("open_url_key", jSONObject.optString("open_url_key"));
            bundle.putInt("open_sub_invitation", jSONObject.optInt("open_sub_invitation"));
            bundle.putInt("open_subscription", jSONObject.optInt("open_subscription"));
            bundle.putInt("route_subs_settings", jSONObject.optInt("route_subs_settings"));
            bundle.putInt("live_goal_widget", jSONObject.optInt("live_goal_widget"));
            c68322mC.element = bundle;
        }
        Bundle bundle2 = (Bundle) c68322mC.element;
        Context context = this.context;
        C30799C6x c30799C6x = new C30799C6x(context, this.dataChannel, this.LJLJJI);
        if (context != null && bundle2 != null && !bundle2.isEmpty()) {
            for (C7I c7i : c30799C6x.LJFF) {
                if (c7i.LIZ(bundle2)) {
                    if (c7i instanceof C7F) {
                        if (FAQSettings.INSTANCE.getValue()) {
                            C75 c752 = c30799C6x.LIZJ;
                            if (c752 != null) {
                                c752.LIZIZ(c30799C6x.LIZLLL.getAnchor_low_version_popup(), "live_take_page", "live_take_page", "", c30799C6x.LIZ);
                            }
                        } else {
                            String string = bundle2.getString("show_entrance", "live_take_page");
                            o.LJIIIIZZ(string, "subscribeExtra.getString…                        )");
                            c30799C6x.LJI = string;
                            Context context2 = c30799C6x.LIZ;
                            if (context2 != null) {
                                if (c30799C6x.LJ == null) {
                                    C31767CdP c31767CdP = new C31767CdP(context2);
                                    c31767CdP.LIZIZ = C15380j0.LJIILJJIL(R.string.sur);
                                    c30799C6x.LJ = c31767CdP.LIZ();
                                }
                                DialogC31813Ce9 dialogC31813Ce9 = c30799C6x.LJ;
                                if (dialogC31813Ce9 != null) {
                                    C29306Beo.LJJJJIZL(dialogC31813Ce9);
                                }
                                C75 c753 = c30799C6x.LIZJ;
                                if (c753 != null) {
                                    c753.LJ(new C30801C6z(c30799C6x, bundle2));
                                }
                            }
                        }
                    } else if (c7i instanceof C7G) {
                        String string2 = bundle2.getString("show_entrance", "live_take_page");
                        o.LJIIIIZZ(string2, "subscribeExtra.getString…                        )");
                        c30799C6x.LJI = string2;
                        Context context3 = c30799C6x.LIZ;
                        if (context3 != null) {
                            if (c30799C6x.LJ == null) {
                                C31767CdP c31767CdP2 = new C31767CdP(context3);
                                c31767CdP2.LIZIZ = C15380j0.LJIILJJIL(R.string.sur);
                                c30799C6x.LJ = c31767CdP2.LIZ();
                            }
                            DialogC31813Ce9 dialogC31813Ce92 = c30799C6x.LJ;
                            if (dialogC31813Ce92 != null) {
                                C29306Beo.LJJJJIZL(dialogC31813Ce92);
                            }
                            C75 c754 = c30799C6x.LIZJ;
                            if (c754 != null) {
                                c754.LJ(new C70(c30799C6x));
                            }
                        }
                    } else if (c7i instanceof C7E) {
                        c30799C6x.LJII = System.currentTimeMillis();
                        String string3 = bundle2.getString("show_entrance", "live_take_page");
                        o.LJIIIIZZ(string3, "subscribeExtra.getString…                        )");
                        c30799C6x.LJI = string3;
                        String inviteCode = bundle2.getString("code", "");
                        String string4 = bundle2.getString("open_type", "");
                        if (o.LJ(string4, "code")) {
                            o.LJIIIIZZ(inviteCode, "inviteCode");
                            C75 c755 = c30799C6x.LIZJ;
                            if (c755 != null) {
                                c755.LIZ(inviteCode, new C30800C6y(c30799C6x, inviteCode));
                            }
                        } else if (o.LJ(string4, "url_key")) {
                            String openUrlKey = bundle2.getString("open_url_key", "");
                            o.LJIIIIZZ(openUrlKey, "openUrlKey");
                            if (!TextUtils.isEmpty(openUrlKey) && c30799C6x.LIZ != null) {
                                SubscribeInvitationLynxUrlSetting subscribeInvitationLynxUrlSetting = SubscribeInvitationLynxUrlSetting.INSTANCE;
                                if (C39927Flj.LIZLLL(subscribeInvitationLynxUrlSetting.getValue().optString(openUrlKey))) {
                                    optString = subscribeInvitationLynxUrlSetting.getValue().optString(openUrlKey);
                                } else {
                                    LiveSubscribeLynxUrl liveSubscribeLynxUrl = LiveSubscribeLynxUrl.INSTANCE;
                                    if (C39927Flj.LIZLLL(liveSubscribeLynxUrl.getJsonValue().optString(openUrlKey))) {
                                        optString = liveSubscribeLynxUrl.getJsonValue().optString(openUrlKey);
                                    }
                                }
                                if (optString != null) {
                                    C75 c756 = c30799C6x.LIZJ;
                                    if (c756 != null) {
                                        c756.LIZIZ(optString, c30799C6x.LJI, "live_take_page", "", c30799C6x.LIZ);
                                    }
                                    c30799C6x.LIZ(c30799C6x.LJI, optString, true);
                                }
                            }
                        }
                    } else if (c7i instanceof C7D) {
                        String value = LiveStreamGoalPresetWebLinkSetting.INSTANCE.getValue();
                        try {
                            Uri.Builder buildUpon = UriProtector.parse(value).buildUpon();
                            buildUpon.appendQueryParameter("entrance", "message");
                            buildUpon.appendQueryParameter("live_type", LiveMode.VIDEO.logStreamingType);
                            String uri = buildUpon.build().toString();
                            o.LJIIIIZZ(uri, "builder.build().toString()");
                            value = uri;
                        } catch (Exception unused) {
                        }
                        ((IActionHandlerService) CN1.LIZ(IActionHandlerService.class)).handle(c30799C6x.LIZ, value);
                    }
                    DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
                    dataChannelGlobal.nv0(this, this, SubNoteToastEvent.class, new AqS171S0100000_5(this, 191));
                    dataChannelGlobal.nv0(this, this, OpenNewRecordPage.class, new AqS171S0100000_5(this, 192));
                    if (jSONObject == null && jSONObject.optInt("open_sub_gift_panel") == 1 && (optJSONObject = jSONObject.optJSONObject("sub_extra_param")) != null) {
                        String optString2 = optJSONObject.optString("to_anchor_id");
                        String optString3 = optJSONObject.optString("show_entrance");
                        String optString4 = optJSONObject.optString("for_old_version");
                        String optString5 = optJSONObject.optString("user_type");
                        StringBuilder LIZLLL = C06540Nm.LIZLLL(((LiveSubscribeLynxMap) this.LJLLILLLL.getValue()).getUserGiftPanelPage(), "&to_anchor_id=", optString2, "&for_old_version=", optString4);
                        C32364Cn2 c32364Cn2 = new C32364Cn2(JBR.LJFF(LIZLLL, "&user_type=", optString5, LIZLLL));
                        c32364Cn2.LIZJ("show_entrance", optString3);
                        c32364Cn2.LIZJ("container_type", "page");
                        c32364Cn2.LIZJ("event_page", "live_take_page");
                        c32364Cn2.LIZJ("mask_bg_color", "00000000");
                        ((IActionHandlerService) CN1.LIZ(IActionHandlerService.class)).handle(this.context, UriProtector.parse(c32364Cn2.LIZLLL()));
                        return;
                    }
                    return;
                }
            }
        }
        C75 c757 = this.LJLJJI;
        if (c757 != null) {
            c757.LJFF(new AqS171S0100000_5(this, 628));
        }
        DataChannelGlobal dataChannelGlobal2 = DataChannelGlobal.LJLJJI;
        dataChannelGlobal2.nv0(this, this, SubNoteToastEvent.class, new AqS171S0100000_5(this, 191));
        dataChannelGlobal2.nv0(this, this, OpenNewRecordPage.class, new AqS171S0100000_5(this, 192));
        if (jSONObject == null) {
        }
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void show() {
        if (LLIIIJ()) {
            super.show();
        }
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget
    public final int LLFFF() {
        return this.LJLJJLL;
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget
    public final int LLFII() {
        return this.LJLJJL;
    }

    public final void LLIIIL(boolean z) {
        Object obj;
        int i;
        List<String> LIZJ = InterfaceC30442Bx8.Y1.LIZJ();
        if (LIZJ != null && !LIZJ.contains(String.valueOf(((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId())) && z) {
            DataChannel dataChannel = this.dataChannel;
            if (dataChannel != null) {
                obj = dataChannel.kv0(LiveModeChannel.class);
            } else {
                obj = null;
            }
            if (obj == LiveMode.SCREEN_RECORD) {
                if (User.sSubPermission) {
                    i = R.string.mx0;
                } else {
                    i = R.string.mwz;
                }
                C1YG c1yg = new C1YG(this.contentView);
                c1yg.LIZ(i);
                c1yg.LJIIL = new C30798C6w(LIZJ);
                this.LJLLJ.postDelayed(new ARunnableS41S0100000_5(new C1YH(c1yg), 63), 500L);
            }
        }
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget
    public final void onClick(View view) {
        LiveMode liveMode;
        o.LJIIIZ(view, "view");
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.LJLJL < 500) {
            return;
        }
        this.LJLJL = currentTimeMillis;
        InterfaceC30442Bx8.LJJZZI.LIZ(Boolean.FALSE);
        BZI LIZ = C28787BRn.LIZ("livesdk_subscribe_icon_click");
        LIZ.LJFF(String.valueOf(((C29374Bfu) C279117r.LIZJ(LIZ, this.dataChannel)).getCurrentUserId()));
        LIZ.LJIJJ("anchor", "user_type");
        LIZ.LJIJJ("live_take_page", "click_position");
        C62819Ol5.LJJII(LIZ, this.dataChannel, true);
        LIZ.LJIJJ(Integer.valueOf(C29306Beo.LJJIFFI(Boolean.valueOf(LLFZ())) ? 1 : 0), "have_red_dot");
        LIZ.LJIJJ(Integer.valueOf(PreviewToolBaseWidget.LL(getView())), "index");
        UFE.LIZIZ(this.LJLL ? 1 : 0, LIZ, "is_bubble");
        this.LJLL = false;
        LLF();
        C75 c75 = this.LJLJJI;
        if (c75 != null) {
            Context context = this.context;
            o.LJIIIIZZ(context, "context");
            boolean enable = LiveSubCreateToolsEntranceNewSetting.INSTANCE.getEnable();
            DataChannel dataChannel = this.dataChannel;
            if (dataChannel == null || (liveMode = (LiveMode) dataChannel.kv0(LiveModeChannel.class)) == null) {
                liveMode = LiveMode.VIDEO;
            }
            c75.LIZLLL(context, "live_take_page", "live_take_page", enable, C28509BGv.LIZ(liveMode), new AqS155S0100000_5(this, 137));
        }
    }

    @Override // X.InterfaceC72822Si2
    public final void onReceiveJsEvent(C199097rd c199097rd) {
        String str;
        FragmentManager fragmentManager;
        List<Fragment> LJJJJLI;
        Class<?> cls;
        String str2;
        Class<?> cls2;
        String str3 = c199097rd.LJLIL;
        switch (str3.hashCode()) {
            case -1710760782:
                if (!str3.equals("open_native_subscription_settings")) {
                    return;
                }
                InterfaceC78280Uns interfaceC78280Uns = c199097rd.LJLILLLLZI;
                if (interfaceC78280Uns != null) {
                    str2 = u.LJJIJIL(interfaceC78280Uns, "type", "");
                } else {
                    str2 = null;
                }
                boolean z = false;
                if (o.LJ(str2, "popup")) {
                    FragmentManager fragmentManager2 = (FragmentManager) this.dataChannel.kv0(C29494Bhq.class);
                    if (fragmentManager2 == null) {
                        return;
                    }
                    List<Fragment> LJJJJLI2 = fragmentManager2.LJJJJLI();
                    if (LJJJJLI2 != null) {
                        for (Fragment fragment : LJJJJLI2) {
                            Class<?> cls3 = fragment.getClass();
                            Object value = this.LJLJI.getValue();
                            if (value != null) {
                                cls2 = value.getClass();
                            } else {
                                cls2 = null;
                            }
                            if (o.LJ(cls3, cls2)) {
                                if ((fragment instanceof LiveDialogFragment) && !((LiveDialogFragment) fragment).isShowing()) {
                                    C1B3 c1b3 = new C1B3(fragmentManager2);
                                    c1b3.LJIIL(fragment);
                                    c1b3.LJI();
                                }
                                z = true;
                            }
                        }
                        if (z) {
                            return;
                        }
                    }
                    LiveDialogFragment liveDialogFragment = (LiveDialogFragment) this.LJLJI.getValue();
                    if (liveDialogFragment == null) {
                        return;
                    }
                    C1XY.LJJIIJZLJL(liveDialogFragment, fragmentManager2, "PreviewSubscriptionWidget");
                    return;
                }
                IHostSubscription iHostSubscription = (IHostSubscription) CN1.LIZ(IHostSubscription.class);
                if (iHostSubscription == null) {
                    return;
                }
                Context context = this.context;
                o.LJIIIIZZ(context, "context");
                iHostSubscription.G30(context, 0, "creator_tools_page");
                return;
            case 1268793102:
                if (!str3.equals("anchor_subscribe_invitation_accepted")) {
                    return;
                }
                show();
                this.LJLLJ.postDelayed(new ARunnableS41S0100000_5(this, 62), 600L);
                return;
            case 1501615659:
                str3.equals("anchor_sub_gift_balance_changed");
                return;
            case 1514286020:
                if (!str3.equals("close_native_subscription_settings")) {
                    return;
                }
                InterfaceC78280Uns interfaceC78280Uns2 = c199097rd.LJLILLLLZI;
                if (interfaceC78280Uns2 != null) {
                    str = u.LJJIJIL(interfaceC78280Uns2, "type", "");
                } else {
                    str = null;
                }
                if (!o.LJ(str, "popup") || (fragmentManager = (FragmentManager) this.dataChannel.kv0(C29494Bhq.class)) == null || (LJJJJLI = fragmentManager.LJJJJLI()) == null) {
                    return;
                }
                for (Fragment fragment2 : LJJJJLI) {
                    Class<?> cls4 = fragment2.getClass();
                    Object value2 = this.LJLJI.getValue();
                    if (value2 != null) {
                        cls = value2.getClass();
                    } else {
                        cls = null;
                    }
                    if (o.LJ(cls4, cls) && (fragment2 instanceof LiveDialogFragment) && ((LiveDialogFragment) fragment2).isShowing()) {
                        C1B3 c1b32 = new C1B3(fragmentManager);
                        c1b32.LJIIIZ(fragment2);
                        c1b32.LJI();
                    }
                }
                return;
            default:
                return;
        }
    }
}
