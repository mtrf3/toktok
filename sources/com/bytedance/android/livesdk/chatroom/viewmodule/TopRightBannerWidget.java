package com.bytedance.android.livesdk.chatroom.viewmodule;

import X.B73;
import X.B83;
import X.BJM;
import X.BZI;
import X.C04510Fr;
import X.C09650Zl;
import X.C10640bM;
import X.C113554cx;
import X.C15380j0;
import X.C15640jQ;
import X.C16880lQ;
import X.C17280m4;
import X.C199097rd;
import X.C1EX;
import X.C28787BRn;
import X.C29374Bfu;
import X.C29383Bg3;
import X.C30147BsN;
import X.C30884CAe;
import X.C38393F4z;
import X.C45243HpH;
import X.C47135Ieh;
import X.C72818Shy;
import X.C73737Swn;
import X.C73793Sxh;
import X.C73806Sxu;
import X.C73933Szx;
import X.C74347TFv;
import X.C78598Ut0;
import X.CA3;
import X.CAC;
import X.CAD;
import X.CAE;
import X.CAK;
import X.CAR;
import X.CN1;
import X.InterfaceC29856Bng;
import X.InterfaceC72822Si2;
import X.InterfaceC78280Uns;
import X.OM1;
import X.OSZ;
import X.SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS;
import Y.ACListenerS40S0200000_5;
import Y.ARunnableS41S0100000_5;
import Y.AfS57S0100000_5;
import android.animation.AnimatorSet;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import au3.IDdS56S0100000_5;
import com.bytedance.android.live.banner.InRoomBannerManager;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.browser.IBrowserService;
import com.bytedance.android.live.liveinteract.api.event.LinkStateForH5Event;
import com.bytedance.android.live.performance.widget.PerformProcessWidget;
import com.bytedance.android.live.room.MicRoomDisableInteractionEvent;
import com.bytedance.android.livesdk.dataChannel.KeyboardStatusChannel;
import com.bytedance.android.livesdk.dataChannel.PreShowKeyboardEvent;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.TopRightBannerDisplayed;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.livesetting.banner.LiveUseBannerAnimationSetting;
import com.bytedance.android.livesdk.livesetting.performance.degrade.LiveBannerDegradeSettings;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveBannerDegradePhoneTransparent;
import com.bytedance.android.livesdk.model.BannerInRoom;
import com.bytedance.android.livesdk.model.message.BannerInRoomCollection;
import com.bytedance.android.livesdk.model.message.InRoomBannerMessage;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.WidgetExtendsKt;
import com.bytedance.lynx.hybrid.webkit.WebKitView;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.j;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.AqS37S0210000_5;
import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class TopRightBannerWidget extends PerformProcessWidget implements CAR, InterfaceC72822Si2 {
    public C30884CAe LJLIL;
    public SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS LJLILLLLZI;
    public LinearLayout LJLJI;
    public WebView LJLJJI;
    public Room LJLJJL;
    public boolean LJLJJLL;
    public ImageView LJLJL;
    public AnimatorSet LJLJLJ;
    public BannerInRoomCollection.BannerInfo LJLJLLL;
    public boolean LJLL;
    public CAC LJLLI;
    public boolean LJLLILLLL;
    public ViewGroup LJLLL;
    public int LJLLJ = 2;
    public boolean LJLLLL = true;

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.dqr;
    }

    @Override // com.bytedance.android.live.performance.widget.PerformProcessWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.performance.widget.PerformProcessWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
        LJZL(false);
        CAC cac = this.LJLLI;
        if (cac != null) {
            cac.detachView();
            LLF();
            AnimatorSet animatorSet = this.LJLJLJ;
            if (animatorSet != null) {
                C16880lQ.LJLJJI(animatorSet);
                animatorSet.end();
            }
            CA3.LIZIZ = -1L;
            C72818Shy.LJII("js_event_banner_ready_live", this);
            return;
        }
        o.LJIJI("mPresenter");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0020, code lost:
    
        if (r1 == null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
    
        if ((r1 instanceof X.AbstractC60811Ntn) == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0026, code lost:
    
        r1 = (X.AbstractC60811Ntn) r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0028, code lost:
    
        if (r1 == null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x001b, code lost:
    
        return (X.CAE) r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0013, code lost:
    
        if (r1 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:
    
        if ((r1 instanceof X.CAE) == false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001c, code lost:
    
        r1 = r1.next();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.CAE LJLZ() {
        /*
            r3 = this;
            X.NtS r0 = r3.LJLILLLLZI
            r2 = 0
            if (r0 == 0) goto L2b
            com.bytedance.hybrid.spark.SparkContext r1 = r0.getSparkContext()
            if (r1 == 0) goto L2b
            java.lang.Class<X.Ntn> r0 = X.AbstractC60811Ntn.class
            java.lang.Object r1 = r1.LIZIZ(r0)
            X.Ntn r1 = (X.AbstractC60811Ntn) r1
            if (r1 == 0) goto L2b
        L15:
            boolean r0 = r1 instanceof X.CAE
            if (r0 == 0) goto L1c
            X.CAE r1 = (X.CAE) r1
            return r1
        L1c:
            java.lang.Object r1 = r1.next()
            if (r1 == 0) goto L2b
            boolean r0 = r1 instanceof X.AbstractC60811Ntn
            if (r0 == 0) goto L2b
            X.Ntn r1 = (X.AbstractC60811Ntn) r1
            if (r1 == 0) goto L2b
            goto L15
        L2b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.viewmodule.TopRightBannerWidget.LJLZ():X.CAE");
    }

    public final void LLF() {
        WebView webView = this.LJLJJI;
        if (webView != null) {
            LinearLayout linearLayout = this.LJLJI;
            if (linearLayout != null) {
                C16880lQ.LJZI(linearLayout, webView);
            } else {
                o.LJIJI("staticContainer");
                throw null;
            }
        }
        C30884CAe c30884CAe = this.LJLIL;
        if (c30884CAe != null) {
            ((IBrowserService) CN1.LIZ(IBrowserService.class)).Lu().LJFF(c30884CAe);
        }
        this.LJLIL = null;
        this.LJLLL = null;
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = this.LJLILLLLZI;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS != null) {
            CAE LJLZ = LJLZ();
            if (LJLZ != null) {
                LJLZ.LJLILLLLZI = null;
            }
            LinearLayout linearLayout2 = this.LJLJI;
            if (linearLayout2 != null) {
                C16880lQ.LJZI(linearLayout2, sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS);
                SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.LJ(sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS);
            } else {
                o.LJIJI("staticContainer");
                throw null;
            }
        }
        this.LJLILLLLZI = null;
    }

    @Override // X.InterfaceC31336CRo
    public final String getLogTag() {
        return TopRightBannerWidget.class.getName();
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void hide() {
        super.hide();
        this.LJLL = true;
    }

    @Override // com.bytedance.android.widget.Widget
    public final void onPause() {
        super.onPause();
        try {
            C30884CAe c30884CAe = this.LJLIL;
            if (c30884CAe != null) {
                c30884CAe.S2(new JSONObject(), "container_disappear");
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("type", "app");
                jSONObject.put("args", new JSONObject().put("foreground", false));
                c30884CAe.S2(jSONObject, "H5_appStateChange");
            }
            SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = this.LJLILLLLZI;
            if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS != null) {
                C78598Ut0.LJIJI(sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS, "container_disappear", new JSONObject());
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("type", "app");
                jSONObject2.put("args", new JSONObject().put("foreground", false));
                C78598Ut0.LJIJI(sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS, "H5_appStateChange", jSONObject2);
            }
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    @Override // com.bytedance.android.widget.Widget
    public final void onResume() {
        super.onResume();
        try {
            C30884CAe c30884CAe = this.LJLIL;
            if (c30884CAe != null) {
                c30884CAe.S2(new JSONObject(), "container_appear");
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("type", "app");
                jSONObject.put("args", new JSONObject().put("foreground", true));
                c30884CAe.S2(jSONObject, "H5_appStateChange");
            }
            SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = this.LJLILLLLZI;
            if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS != null) {
                C78598Ut0.LJIJI(sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS, "container_appear", new JSONObject());
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("type", "app");
                jSONObject2.put("args", new JSONObject().put("foreground", true));
                C78598Ut0.LJIJI(sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS, "H5_appStateChange", jSONObject2);
            }
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void show() {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        View view = getView();
        ViewGroup.LayoutParams layoutParams = null;
        if ((view instanceof ViewGroup) && view != null) {
            layoutParams = view.getLayoutParams();
        }
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null && !LiveBannerDegradePhoneTransparent.INSTANCE.getValue()) {
            marginLayoutParams.setMarginEnd(C15380j0.LIZ(8.0f));
            marginLayoutParams.rightMargin = C15380j0.LIZ(8.0f);
        }
        if (this.LJLJLLL != null) {
            super.show();
        }
    }

    public final void LJZ(BannerInRoomCollection.BannerInfo bannerInfo) {
        boolean z;
        if (bannerInfo == null) {
            return;
        }
        boolean z2 = false;
        if (!this.LJLL) {
            show();
            this.LJLL = false;
        }
        String str = bannerInfo.url;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            List<BannerInRoom> list = bannerInfo.bannerList;
            if (list == null || list.isEmpty()) {
                return;
            }
            LinearLayout linearLayout = this.LJLJI;
            if (linearLayout != null) {
                linearLayout.removeAllViews();
                for (BannerInRoom bannerInRoom : list) {
                    LayoutInflater LLZIL = C16880lQ.LLZIL(this.context);
                    LinearLayout linearLayout2 = this.LJLJI;
                    if (linearLayout2 != null) {
                        View LLLLIILL = C16880lQ.LLLLIILL(LLZIL, R.layout.d9u, linearLayout2, false);
                        C15640jQ.LJFF((ImageView) LLLLIILL.findViewById(R.id.e_q), bannerInRoom.image, 0, new C74347TFv());
                        LJZL(true);
                        LinearLayout linearLayout3 = this.LJLJI;
                        if (linearLayout3 != null) {
                            linearLayout3.setVisibility(0);
                            LinearLayout linearLayout4 = this.LJLJI;
                            if (linearLayout4 != null) {
                                linearLayout4.addView(LLLLIILL);
                                C16880lQ.LJIIJ(new ACListenerS40S0200000_5(bannerInRoom, this, 34), LLLLIILL);
                                LLFF(String.valueOf(bannerInRoom.id), "live_banner_show");
                            } else {
                                o.LJIJI("staticContainer");
                                throw null;
                            }
                        } else {
                            o.LJIJI("staticContainer");
                            throw null;
                        }
                    } else {
                        o.LJIJI("staticContainer");
                        throw null;
                    }
                }
                return;
            }
            o.LJIJI("staticContainer");
            throw null;
        }
        List<BannerInRoom> list2 = bannerInfo.bannerList;
        if (list2 != null) {
            Iterator<BannerInRoom> it = list2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                BannerInRoom next = it.next();
                Long l = next.businessType;
                if (l != null && l.longValue() == 4) {
                    if (next != null) {
                        z2 = true;
                    }
                }
            }
        }
        if (this.LJLJJLL) {
            String str2 = bannerInfo.url;
            o.LJIIIIZZ(str2, "bannerInfo.url");
            LJZI(str2, z2);
        } else {
            C10640bM.LIZIZ(B73.LIZ(), new ARunnableS41S0100000_5(new AqS37S0210000_5(this, bannerInfo, z2, 0), 245), this, LiveBannerDegradeSettings.INSTANCE.delayMillis());
        }
    }

    public final void LJZL(boolean z) {
        boolean z2 = this.LJLLILLLL;
        if (z2 == z) {
            return;
        }
        if (z2) {
            List<String> list = C04510Fr.LIZIZ;
            ArrayList arrayList = (ArrayList) list;
            if (!arrayList.contains("task_banner")) {
                arrayList.add("task_banner");
            }
            C04510Fr.LIZ.put("webview_banner", list.toString());
        } else {
            List<String> list2 = C04510Fr.LIZIZ;
            ((ArrayList) list2).remove("activity_banner");
            C04510Fr.LIZ.put("webview_banner", list2.toString());
        }
        this.LJLLILLLL = z;
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.rv0(TopRightBannerDisplayed.class, Boolean.valueOf(z));
        }
    }

    public final void LLFFF(BannerInRoomCollection.BannerInfo bannerInfo) {
        List<BannerInRoom> list;
        LiveMode liveMode;
        this.LJLJLLL = bannerInfo;
        if (bannerInfo == null || (list = bannerInfo.bannerList) == null || list.isEmpty()) {
            super.hide();
            ImageView imageView = this.LJLJL;
            if (imageView != null) {
                imageView.setVisibility(8);
                LinearLayout linearLayout = this.LJLJI;
                if (linearLayout != null) {
                    linearLayout.setVisibility(8);
                    LinearLayout linearLayout2 = this.LJLJI;
                    if (linearLayout2 != null) {
                        linearLayout2.removeAllViews();
                        return;
                    } else {
                        o.LJIJI("staticContainer");
                        throw null;
                    }
                }
                o.LJIJI("staticContainer");
                throw null;
            }
            o.LJIJI("mAnimateView");
            throw null;
        }
        if (bannerInfo.animationImage != null && LiveUseBannerAnimationSetting.INSTANCE.enable()) {
            Room room = this.LJLJJL;
            if (room != null) {
                liveMode = room.getStreamType();
            } else {
                liveMode = null;
            }
            if (liveMode == LiveMode.VIDEO) {
                ImageView imageView2 = this.LJLJL;
                if (imageView2 != null) {
                    imageView2.setVisibility(0);
                    LinearLayout linearLayout3 = this.LJLJI;
                    if (linearLayout3 != null) {
                        linearLayout3.setVisibility(8);
                        LJZ(bannerInfo);
                        ImageView imageView3 = this.LJLJL;
                        if (imageView3 != null) {
                            C15640jQ.LJFF(imageView3, bannerInfo.animationImage, 0, new IDdS56S0100000_5(this, 1));
                            return;
                        } else {
                            o.LJIJI("mAnimateView");
                            throw null;
                        }
                    }
                    o.LJIJI("staticContainer");
                    throw null;
                }
                o.LJIJI("mAnimateView");
                throw null;
            }
        }
        LJZ(bannerInfo);
    }

    @Override // X.CAR
    public final void Ri0(InRoomBannerMessage message) {
        String str;
        String str2;
        Long l;
        String str3;
        o.LJIIIZ(message, "message");
        JSONObject LJ = C47135Ieh.LJ("type", "refresh", "data", GsonProtectorUtils.toJson(C09650Zl.LIZIZ, (j) message.extra));
        JSONObject jSONObject = new JSONObject();
        JSONObject put = jSONObject.put("enter_from_merge", BJM.LJFF()).put("enter_method", BJM.LJIIIIZZ());
        if (this.LJLJJLL) {
            str = "live_take_detail";
        } else {
            str = "live_detail";
        }
        JSONObject put2 = put.put("event_page", str);
        Room room = this.LJLJJL;
        String str4 = null;
        if (room != null) {
            str2 = C17280m4.LIZ(room);
        } else {
            str2 = null;
        }
        JSONObject put3 = put2.put("room_id", str2);
        Room room2 = this.LJLJJL;
        if (room2 != null) {
            l = Long.valueOf(room2.getOwnerUserId());
        } else {
            l = null;
        }
        JSONObject put4 = put3.put("anchor_id", String.valueOf(l));
        Room room3 = this.LJLJJL;
        if (room3 != null) {
            str3 = room3.getRequestId();
        } else {
            str3 = null;
        }
        JSONObject put5 = put4.put("request_id", str3);
        Room room4 = this.LJLJJL;
        if (room4 != null) {
            str4 = room4.getLog_pb();
        }
        put5.put("log_pb", str4);
        LJ.put("log", jSONObject);
        C30884CAe c30884CAe = this.LJLIL;
        if (c30884CAe != null) {
            c30884CAe.S2(LJ, "H5_roomStatusChange");
        }
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = this.LJLILLLLZI;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS != null) {
            C78598Ut0.LJIJI(sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS, "H5_roomStatusChange", LJ);
        }
    }

    @Override // com.bytedance.android.live.performance.widget.PerformProcessWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
        View findViewById = findViewById(R.id.kea);
        o.LJIIIIZZ(findViewById, "findViewById(R.id.static_container)");
        this.LJLJI = (LinearLayout) findViewById;
        View findViewById2 = findViewById(R.id.exv);
        o.LJIIIIZZ(findViewById2, "findViewById(R.id.iv_animation)");
        this.LJLJL = (ImageView) findViewById2;
    }

    @Override // com.bytedance.android.live.performance.widget.PerformProcessWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        Room room;
        boolean z;
        Long l;
        Long l2;
        Room room2;
        User owner;
        Boolean bool;
        C72818Shy.LIZLLL("js_event_banner_ready_live", this);
        DataChannel dataChannel = this.dataChannel;
        Long l3 = null;
        if (dataChannel != null) {
            room = (Room) dataChannel.kv0(RoomChannel.class);
        } else {
            room = null;
        }
        this.LJLJJL = room;
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null && (bool = (Boolean) dataChannel2.kv0(UserIsAnchorChannel.class)) != null) {
            z = bool.booleanValue();
        } else {
            z = false;
        }
        this.LJLJJLL = z;
        OSZ[] oszArr = new OSZ[5];
        oszArr[0] = new OSZ("user_id", Long.valueOf(((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId()));
        Room room3 = this.LJLJJL;
        if (room3 != null) {
            l = Long.valueOf(room3.getId());
        } else {
            l = null;
        }
        oszArr[1] = new OSZ("room_id", l);
        Room room4 = this.LJLJJL;
        if (room4 != null && (owner = room4.getOwner()) != null) {
            l2 = Long.valueOf(owner.getId());
        } else {
            l2 = null;
        }
        oszArr[2] = new OSZ("anchor_id", l2);
        oszArr[3] = new OSZ("is_anchor", Integer.valueOf(this.LJLJJLL ? 1 : 0));
        oszArr[4] = new OSZ("banner_location_type", 1);
        Map<? extends String, ? extends Object> LJJL = C113554cx.LJJL(oszArr);
        Map<String, Object> map = CA3.LIZ;
        ((LinkedHashMap) map).clear();
        map.putAll(LJJL);
        CAC cac = new CAC(this.LJLJJLL, this.LJLJJL);
        this.LJLLI = cac;
        cac.attachView(this);
        InRoomBannerManager inRoomBannerManager = InRoomBannerManager.LJLIL;
        DataChannel dataChannel3 = this.dataChannel;
        if (dataChannel3 != null && (room2 = (Room) dataChannel3.kv0(RoomChannel.class)) != null) {
            l3 = Long.valueOf(room2.getId());
        }
        inRoomBannerManager.getClass();
        InterfaceC29856Bng interfaceC29856Bng = (InterfaceC29856Bng) InRoomBannerManager.LJLJJL.LJJIFFI(new C1EX(l3)).LIZJ(WidgetExtendsKt.autoDispose(this));
        if (interfaceC29856Bng != null) {
            interfaceC29856Bng.LIZIZ(new AfS57S0100000_5(this, 90));
        }
        DataChannel dataChannel4 = this.dataChannel;
        if (dataChannel4 != null) {
            dataChannel4.lv0(this, KeyboardStatusChannel.class, new AqS171S0100000_5(this, 345));
            dataChannel4.lv0(this, PreShowKeyboardEvent.class, new AqS171S0100000_5(this, 346));
            dataChannel4.lv0(this, LinkStateForH5Event.class, new AqS171S0100000_5(this, 347));
            dataChannel4.lv0(this, MicRoomDisableInteractionEvent.class, new CAD(this));
        }
        C73793Sxh<C29383Bg3> c73793Sxh = ((C29374Bfu) B83.LIZ().LIZIZ()).LJI;
        c73793Sxh.getClass();
        C73933Szx.LJ(this).LIZIZ(new C73806Sxu(new C73737Swn(c73793Sxh), CAK.LJLIL)).LIZIZ(new AfS57S0100000_5(this, 91));
        if (objArr != null) {
            for (Object obj : objArr) {
                if ((obj instanceof C30147BsN) && ((C30147BsN) obj).LIZ > 0) {
                    if (obj != null) {
                        CA3.LIZIZ = ((C30147BsN) obj).LIZ;
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        linkedHashMap.putAll(CA3.LIZ);
                        linkedHashMap.put("duration", Long.valueOf(CA3.LIZIZ(CA3.LIZIZ, elapsedRealtime)));
                        CA3.LJFF(0, "widget_load_finished", linkedHashMap);
                        return;
                    }
                    return;
                }
            }
        }
    }

    @Override // X.InterfaceC72822Si2
    public final void onReceiveJsEvent(C199097rd c199097rd) {
        boolean z;
        String str;
        String str2;
        Object obj;
        Object obj2;
        Map<String, Object> LIZIZ;
        Map<String, Object> LIZIZ2;
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS;
        Object kitView;
        if (!this.LJLJJLL && o.LJ(c199097rd.LJLIL, "js_event_banner_ready_live")) {
            SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS2 = this.LJLILLLLZI;
            if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS2 != null && C78598Ut0.LJII(sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS2)) {
                z = true;
            } else {
                z = false;
            }
            if (z && (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = this.LJLILLLLZI) != null && (kitView = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.getKitView()) != null && (kitView instanceof WebKitView)) {
                ((OM1) kitView).onResume();
            }
            try {
                InterfaceC78280Uns interfaceC78280Uns = c199097rd.LJLILLLLZI;
                if (interfaceC78280Uns != null && (LIZIZ2 = interfaceC78280Uns.LIZIZ()) != null) {
                    obj = LIZIZ2.get("banner_state");
                } else {
                    obj = null;
                }
                str2 = (String) obj;
                if (str2 == null) {
                    str2 = "hide";
                }
                InterfaceC78280Uns interfaceC78280Uns2 = c199097rd.LJLILLLLZI;
                if (interfaceC78280Uns2 != null && (LIZIZ = interfaceC78280Uns2.LIZIZ()) != null) {
                    obj2 = LIZIZ.get("fail_reason");
                } else {
                    obj2 = null;
                }
                str = (String) obj2;
                if (str == null) {
                    str = "empty_value";
                }
            } catch (Exception unused) {
                str = "exception";
                str2 = "hide";
            }
            boolean LJ = o.LJ(str2, "show");
            if (this.LJLLL == null) {
                return;
            }
            int i = -1;
            if (LJ && this.LJLLLL) {
                LinearLayout linearLayout = this.LJLJI;
                if (linearLayout != null) {
                    linearLayout.removeAllViews();
                    LinearLayout linearLayout2 = this.LJLJI;
                    if (linearLayout2 != null) {
                        linearLayout2.addView(this.LJLLL);
                        LinearLayout linearLayout3 = this.LJLJI;
                        if (linearLayout3 != null) {
                            linearLayout3.setVisibility(0);
                            LJZL(true);
                            CA3.LIZJ(this.LJLLJ);
                            SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS3 = this.LJLILLLLZI;
                            if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS3 != null) {
                                i = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS3.getOptimization();
                            }
                            CA3.LIZ(i, "show", null);
                            return;
                        }
                        o.LJIJI("staticContainer");
                        throw null;
                    }
                    o.LJIJI("staticContainer");
                    throw null;
                }
                o.LJIJI("staticContainer");
                throw null;
            }
            LinearLayout linearLayout4 = this.LJLJI;
            if (linearLayout4 != null) {
                linearLayout4.removeAllViews();
                LinearLayout linearLayout5 = this.LJLJI;
                if (linearLayout5 != null) {
                    linearLayout5.setVisibility(8);
                    SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS4 = this.LJLILLLLZI;
                    if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS4 != null) {
                        i = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS4.getOptimization();
                    }
                    CA3.LIZ(i, "hide", str);
                    return;
                }
                o.LJIJI("staticContainer");
                throw null;
            }
            o.LJIJI("staticContainer");
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:73:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0269 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x026a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJZI(java.lang.String r11, boolean r12) {
        /*
            Method dump skipped, instructions count: 774
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.viewmodule.TopRightBannerWidget.LJZI(java.lang.String, boolean):void");
    }

    public final void LL(View view, BannerInRoomCollection.BannerInfo bannerInfo) {
        ArrayList arrayList;
        Long l;
        if (!isViewValid() || view == null) {
            return;
        }
        view.setVisibility(0);
        try {
            JSONObject jSONObject = new JSONObject();
            if (bannerInfo == null) {
                return;
            }
            List<BannerInRoom> list = bannerInfo.bannerList;
            if (list != null) {
                arrayList = new ArrayList();
                for (BannerInRoom bannerInRoom : list) {
                    BannerInRoom bannerInRoom2 = bannerInRoom;
                    if (this.LJLJJLL || (l = bannerInRoom2.businessType) == null || l.longValue() - 3 != 0) {
                        arrayList.add(bannerInRoom);
                    }
                }
            } else {
                arrayList = null;
            }
            jSONObject.put("data", C38393F4z.LJFF(arrayList));
            jSONObject.put("type", "init");
            C30884CAe c30884CAe = this.LJLIL;
            if (c30884CAe != null) {
                c30884CAe.S2(jSONObject, "H5_roomStatusChange");
            }
            SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = this.LJLILLLLZI;
            if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS == null) {
                return;
            }
            C78598Ut0.LJIJI(sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS, "H5_roomStatusChange", jSONObject);
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    public final void LLFF(String str, String str2) {
        String str3;
        HashMap LIZ = C45243HpH.LIZ("banner_id", str, "request_page", "topright");
        BZI LIZ2 = C28787BRn.LIZ(str2);
        LIZ2.LJJIFFI(LIZ);
        LIZ2.LJIILLIIL(this.dataChannel);
        LIZ2.LJIIIZ("live_function");
        if (this.LJLJJLL) {
            str3 = "live_take_detail";
        } else {
            str3 = "live_detail";
        }
        LIZ2.LJIIJJI(str3);
        LIZ2.LJJIIJZLJL();
    }
}
