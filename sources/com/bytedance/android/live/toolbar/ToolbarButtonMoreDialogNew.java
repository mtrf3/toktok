package com.bytedance.android.live.toolbar;

import X.BJM;
import X.BRY;
import X.BZI;
import X.C01R;
import X.C05590Jv;
import X.C15380j0;
import X.C199097rd;
import X.C23010vJ;
import X.C25280yy;
import X.C259910h;
import X.C28289B8j;
import X.C28507BGt;
import X.C28509BGv;
import X.C28787BRn;
import X.C29306Beo;
import X.C44384HbQ;
import X.C47121t6;
import X.C72818Shy;
import X.C78528Urs;
import X.CN1;
import X.EnumC30204BtI;
import X.EnumC30206BtK;
import X.EnumC30226Bte;
import X.InterfaceC06390Mx;
import X.InterfaceC25300z0;
import X.InterfaceC72822Si2;
import X.InterfaceC78280Uns;
import X.SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS;
import Y.AUListenerS97S0200000_5;
import Y.IDCSpanS31S0100000_5;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.browser.IBrowserService;
import com.bytedance.android.live.browser.IHybridContainerService;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.dataChannel.CppSeeDetailsClickEvent;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.broadcast.BroadcastLiveCenterUrl;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveCenterLayoutStyleSetting;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveChatShowDelayForHotLiveSetting;
import com.bytedance.android.livesdk.model.RoomAuthStatus;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.UriProtector;
import com.google.android.play.core.appupdate.u;
import com.zhiliaoapp.musically.R;
import defpackage.i0;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class ToolbarButtonMoreDialogNew extends LiveDialogFragment implements InterfaceC72822Si2 {
    public final List<EnumC30204BtI> LJLIL;
    public final List<EnumC30204BtI> LJLILLLLZI;
    public final DataChannel LJLJI;
    public final InterfaceC25300z0 LJLJJI;
    public SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS LJLJJL;
    public ValueAnimator LJLJJLL;
    public long LJLJL;
    public C47121t6 LJLJLJ;
    public ViewGroup LJLJLLL;
    public LinearLayout LJLL;
    public LinearLayout LJLLI;
    public C47121t6 LJLLILLLL;
    public final Map<Integer, View> LJLLJ;

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLLJ).clear();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLLJ;
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

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C28507BGt createParams() {
        int i;
        if (C44384HbQ.LJJIJIIJI() && !C29306Beo.LJJII(this.LJLJI)) {
            i = R.layout.cz0;
        } else {
            i = R.layout.cyz;
        }
        C28507BGt c28507BGt = new C28507BGt(i);
        c28507BGt.LIZIZ = 2;
        c28507BGt.LIZJ = R.style.ab4;
        c28507BGt.LJII = 80;
        c28507BGt.LJIIJJI = 50;
        return c28507BGt;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        DataChannel dataChannel = this.LJLJI;
        dataChannel.lv0(this, DismissToolbarPopEvent.class, new AqS171S0100000_5(this, 102));
        dataChannel.lv0(this, CppSeeDetailsClickEvent.class, new AqS171S0100000_5(this, 103));
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialog) {
        o.LJIIIZ(dialog, "dialog");
        super.onDismiss(dialog);
        EnumC30206BtK.POPUP.release(this.dataChannel);
        if (LiveCenterLayoutStyleSetting.INSTANCE.enableNewStyle()) {
            long currentTimeMillis = System.currentTimeMillis();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("room_id", String.valueOf(BJM.LJIILJJIL()));
            C01R.LIZIZ(currentTimeMillis, new C78528Urs(jSONObject), "live_anchor_center_mask_will_disappear");
            BZI LIZ = C28787BRn.LIZ("livesdk_live_center_leave");
            LIZ.LJIILLIIL(this.dataChannel);
            LIZ.LJIJJ("click_more", "enter_type");
            C28289B8j.LIZJ(SystemClock.elapsedRealtime(), this.LJLJL, LIZ, "duration");
        }
        C72818Shy.LJII("anchor_center_request_room_info", this);
        C72818Shy.LJII("anchor_center_receive_flash_card", this);
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = this.LJLJJL;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS != null) {
            SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.LJ(sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS);
        }
    }

    @Override // X.InterfaceC72822Si2
    public final void onReceiveJsEvent(C199097rd c199097rd) {
        Boolean bool;
        Room room;
        RoomAuthStatus roomAuthStatus;
        if (o.LJ(c199097rd.LJLIL, "anchor_center_request_room_info")) {
            vl(c199097rd);
            long currentTimeMillis = System.currentTimeMillis();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("room_id", String.valueOf(BJM.LJIILJJIL()));
            DataChannel dataChannel = this.dataChannel;
            if (dataChannel != null && (room = (Room) dataChannel.kv0(RoomChannel.class)) != null && (roomAuthStatus = room.getRoomAuthStatus()) != null) {
                bool = Boolean.valueOf(roomAuthStatus.isEnableGift());
            } else {
                bool = null;
            }
            jSONObject.put("gift_permission", bool);
            C01R.LIZIZ(currentTimeMillis, new C78528Urs(jSONObject), "anchor_center_response_room_info");
        }
        if (o.LJ(c199097rd.LJLIL, "anchor_center_receive_flash_card")) {
            vl(c199097rd);
        }
    }

    public final void vl(C199097rd c199097rd) {
        float f;
        ValueAnimator duration;
        ViewGroup viewGroup = this.LJLJLLL;
        if (viewGroup != null) {
            ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
            InterfaceC78280Uns interfaceC78280Uns = c199097rd.LJLILLLLZI;
            if (interfaceC78280Uns != null) {
                f = u.LJJIJIIJI(interfaceC78280Uns, "height", 160);
            } else {
                f = 160.0f;
            }
            ValueAnimator ofInt = ObjectAnimator.ofInt(layoutParams.height, C15380j0.LIZ(f));
            this.LJLJJLL = ofInt;
            if (ofInt != null) {
                ofInt.addUpdateListener(new AUListenerS97S0200000_5(layoutParams, viewGroup, 3));
            }
            ValueAnimator valueAnimator = this.LJLJJLL;
            if (valueAnimator != null && (duration = valueAnimator.setDuration(300L)) != null) {
                duration.start();
            }
        }
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        DataChannel dataChannel;
        Room room;
        LiveMode streamType;
        Long l;
        Long l2;
        Boolean bool;
        InterfaceC25300z0 interfaceC25300z0;
        Room room2;
        RoomAuthStatus roomAuthStatus;
        Room room3;
        User owner;
        Room room4;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        this.LJLJLJ = (C47121t6) view.findViewById(R.id.gn7);
        this.LJLJLLL = (ViewGroup) view.findViewById(R.id.ip_);
        this.LJLL = (LinearLayout) view.findViewById(R.id.lcw);
        this.LJLLI = (LinearLayout) view.findViewById(R.id.lcx);
        this.LJLLILLLL = (C47121t6) view.findViewById(R.id.ixc);
        C47121t6 c47121t6 = this.LJLJLJ;
        if (c47121t6 != null) {
            c47121t6.setText(C15380j0.LJIIIIZZ(R.plurals.m_, 2, 2));
        }
        EnumC30206BtK enumC30206BtK = EnumC30206BtK.POPUP;
        DataChannel dataChannel2 = this.LJLJI;
        LinearLayout linearLayout = this.LJLL;
        if (linearLayout == null) {
            return;
        }
        List<EnumC30204BtI> list = this.LJLIL;
        EnumC30226Bte enumC30226Bte = EnumC30226Bte.ICON_TITLE_HORIZONTAL_ARROW;
        enumC30206BtK.createHolder(dataChannel2, linearLayout, list, enumC30226Bte);
        DataChannel dataChannel3 = this.LJLJI;
        LinearLayout linearLayout2 = this.LJLLI;
        if (linearLayout2 == null) {
            return;
        }
        enumC30206BtK.createHolder(dataChannel3, linearLayout2, this.LJLILLLLZI, enumC30226Bte);
        if (LiveCenterLayoutStyleSetting.INSTANCE.enableNewStyle() && (dataChannel = this.dataChannel) != null && (room = (Room) dataChannel.kv0(RoomChannel.class)) != null && (streamType = room.getStreamType()) != null && C28509BGv.LJI(streamType)) {
            ViewGroup viewGroup = this.LJLJLLL;
            if (viewGroup != null) {
                viewGroup.setVisibility(0);
            }
            Uri.Builder buildUpon = UriProtector.parse(BroadcastLiveCenterUrl.INSTANCE.getValue()).buildUpon();
            DataChannel dataChannel4 = this.dataChannel;
            if (dataChannel4 != null && (room4 = (Room) dataChannel4.kv0(RoomChannel.class)) != null) {
                l = Long.valueOf(room4.getId());
            } else {
                l = null;
            }
            Uri.Builder appendQueryParameter = buildUpon.appendQueryParameter("room_id", String.valueOf(l));
            DataChannel dataChannel5 = this.dataChannel;
            if (dataChannel5 != null && (room3 = (Room) dataChannel5.kv0(RoomChannel.class)) != null && (owner = room3.getOwner()) != null) {
                l2 = Long.valueOf(owner.getId());
            } else {
                l2 = null;
            }
            Uri.Builder appendQueryParameter2 = appendQueryParameter.appendQueryParameter("anchor_id", String.valueOf(l2));
            DataChannel dataChannel6 = this.dataChannel;
            if (dataChannel6 != null && (room2 = (Room) dataChannel6.kv0(RoomChannel.class)) != null && (roomAuthStatus = room2.getRoomAuthStatus()) != null) {
                bool = Boolean.valueOf(roomAuthStatus.isEnableGift());
            } else {
                bool = null;
            }
            Uri build = appendQueryParameter2.appendQueryParameter("gift_permission", String.valueOf(bool)).appendQueryParameter("is_in_native", "1").build();
            String uri = build.toString();
            o.LJIIIIZZ(uri, "uri.toString()");
            if (((IHostAction) CN1.LIZ(IHostAction.class)).hostInterceptSpark(uri)) {
                Context context = getContext();
                if (context != null) {
                    InterfaceC06390Mx LIZ = CN1.LIZ(IHybridContainerService.class);
                    o.LJIIIIZZ(LIZ, "getService(IHybridContainerService::class.java)");
                    SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS LIZ2 = C05590Jv.LIZ((IHybridContainerService) LIZ, context, uri, null, 60);
                    this.LJLJJL = LIZ2;
                    ViewGroup viewGroup2 = this.LJLJLLL;
                    if (viewGroup2 != null) {
                        viewGroup2.addView(LIZ2, -1, -1);
                    }
                }
            } else {
                ViewGroup viewGroup3 = this.LJLJLLL;
                if (viewGroup3 != null && (interfaceC25300z0 = this.LJLJJI) != null) {
                    C25280yy.LIZ(interfaceC25300z0, build.toString(), viewGroup3, new BRY());
                }
            }
            long currentTimeMillis = System.currentTimeMillis();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("room_id", String.valueOf(BJM.LJIILJJIL()));
            C01R.LIZIZ(currentTimeMillis, new C78528Urs(jSONObject), "live_anchor_center_mask_will_appear");
            BZI LIZ3 = C28787BRn.LIZ("livesdk_live_center_show");
            LIZ3.LJIILLIIL(this.LJLJI);
            LIZ3.LJIJJ("click_more", "enter_type");
            LIZ3.LJJIIJZLJL();
            this.LJLJL = SystemClock.elapsedRealtime();
        }
        C47121t6 c47121t62 = this.LJLLILLLL;
        if (c47121t62 != null) {
            String LJIILJJIL = C15380j0.LJIILJJIL(R.string.t05);
            SpannableString spannableString = new SpannableString(i0.LJFF(LJIILJJIL, C15380j0.LJIILJJIL(R.string.kz_)));
            C23010vJ.LIZJ(getContext(), spannableString, 0, LJIILJJIL.length(), 17, 3, LiveChatShowDelayForHotLiveSetting.DEFAULT);
            C23010vJ.LIZJ(getContext(), spannableString, LJIILJJIL.length(), spannableString.length(), 17, 3, 600);
            spannableString.setSpan(new ForegroundColorSpan(C259910h.LIZIZ(R.attr.ax_, getContext())), 0, spannableString.length(), 17);
            spannableString.setSpan(new IDCSpanS31S0100000_5(this, 14), LJIILJJIL.length(), spannableString.length(), 17);
            c47121t62.setText(spannableString);
            c47121t62.setLinksClickable(true);
            c47121t62.setMovementMethod(LinkMovementMethod.getInstance());
            c47121t62.setHighlightColor(0);
        }
        C72818Shy.LIZLLL("anchor_center_request_room_info", this);
        C72818Shy.LIZLLL("anchor_center_receive_flash_card", this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ToolbarButtonMoreDialogNew(List<? extends EnumC30204BtI> foldListBasicFunctions, List<? extends EnumC30204BtI> foldListLiveSettings, DataChannel dataChannel) {
        o.LJIIIZ(foldListBasicFunctions, "foldListBasicFunctions");
        o.LJIIIZ(foldListLiveSettings, "foldListLiveSettings");
        this.LJLLJ = new LinkedHashMap();
        this.LJLIL = foldListBasicFunctions;
        this.LJLILLLLZI = foldListLiveSettings;
        this.LJLJI = dataChannel;
        this.LJLJJI = ((IBrowserService) CN1.LIZ(IBrowserService.class)).kF();
    }
}
