package com.bytedance.android.livesdk.broadcast.interaction.toolbar;

import X.BJM;
import X.BRZ;
import X.BZI;
import X.C01R;
import X.C05590Jv;
import X.C15380j0;
import X.C199097rd;
import X.C25280yy;
import X.C28289B8j;
import X.C28507BGt;
import X.C28509BGv;
import X.C28787BRn;
import X.C31239CNv;
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
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.browser.IBrowserService;
import com.bytedance.android.live.browser.IHybridContainerService;
import com.bytedance.android.live.toolbar.DismissToolbarPopEvent;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.dataChannel.CppSeeDetailsClickEvent;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.broadcast.BroadcastLiveCenterUrl;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveCenterLayoutStyleSetting;
import com.bytedance.android.livesdk.model.RoomAuthStatus;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.UriProtector;
import com.google.android.play.core.appupdate.u;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class ToolbarButtonMoreDialog extends LiveDialogFragment implements InterfaceC72822Si2 {
    public final List<EnumC30204BtI> LJLIL;
    public final DataChannel LJLILLLLZI;
    public final InterfaceC25300z0 LJLJI;
    public SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS LJLJJI;
    public ValueAnimator LJLJJL;
    public long LJLJJLL;
    public final Map<Integer, View> LJLJL;

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJL).clear();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJL;
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
        C28507BGt c28507BGt = new C28507BGt(R.layout.cyy);
        c28507BGt.LIZIZ = 2;
        c28507BGt.LIZJ = R.style.ab4;
        c28507BGt.LJII = 80;
        c28507BGt.LJIIJJI = 50;
        return c28507BGt;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        DataChannel dataChannel = this.LJLILLLLZI;
        dataChannel.lv0(this, DismissToolbarPopEvent.class, new AqS171S0100000_5(this, 131));
        dataChannel.lv0(this, CppSeeDetailsClickEvent.class, new AqS171S0100000_5(this, 132));
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialog) {
        o.LJIIIZ(dialog, "dialog");
        super.onDismiss(dialog);
        EnumC30206BtK.POPUP.release(this.dataChannel);
        InterfaceC25300z0 interfaceC25300z0 = this.LJLJI;
        if (interfaceC25300z0 != null) {
            ((C31239CNv) interfaceC25300z0).LIZJ();
        }
        if (LiveCenterLayoutStyleSetting.INSTANCE.enableNewStyle()) {
            long currentTimeMillis = System.currentTimeMillis();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("room_id", String.valueOf(BJM.LJIILJJIL()));
            C01R.LIZIZ(currentTimeMillis, new C78528Urs(jSONObject), "live_anchor_center_mask_will_disappear");
            BZI LIZ = C28787BRn.LIZ("livesdk_live_center_leave");
            LIZ.LJIILLIIL(this.dataChannel);
            LIZ.LJIJJ("click_more", "enter_type");
            C28289B8j.LIZJ(SystemClock.elapsedRealtime(), this.LJLJJLL, LIZ, "duration");
        }
        C72818Shy.LJII("anchor_center_request_room_info", this);
        C72818Shy.LJII("anchor_center_receive_flash_card", this);
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = this.LJLJJI;
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
        ViewGroup.LayoutParams layoutParams = _$_findCachedViewById(R.id.ip_).getLayoutParams();
        InterfaceC78280Uns interfaceC78280Uns = c199097rd.LJLILLLLZI;
        if (interfaceC78280Uns != null) {
            f = u.LJJIJIIJI(interfaceC78280Uns, "height", 160);
        } else {
            f = 160.0f;
        }
        ValueAnimator ofInt = ObjectAnimator.ofInt(layoutParams.height, C15380j0.LIZ(f));
        this.LJLJJL = ofInt;
        if (ofInt != null) {
            ofInt.addUpdateListener(new AUListenerS97S0200000_5(layoutParams, this, 4));
        }
        ValueAnimator valueAnimator = this.LJLJJL;
        if (valueAnimator != null && (duration = valueAnimator.setDuration(300L)) != null) {
            duration.start();
        }
    }

    public ToolbarButtonMoreDialog(DataChannel dataChannel, List foldList) {
        o.LJIIIZ(foldList, "foldList");
        this.LJLJL = new LinkedHashMap();
        this.LJLIL = foldList;
        this.LJLILLLLZI = dataChannel;
        this.LJLJI = ((IBrowserService) CN1.LIZ(IBrowserService.class)).kF();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        DataChannel dataChannel;
        Room room;
        LiveMode streamType;
        Long l;
        Long l2;
        Boolean bool;
        Room room2;
        RoomAuthStatus roomAuthStatus;
        Room room3;
        User owner;
        Room room4;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        EnumC30206BtK enumC30206BtK = EnumC30206BtK.POPUP;
        DataChannel dataChannel2 = this.LJLILLLLZI;
        ViewGroup viewGroup = (ViewGroup) _$_findCachedViewById(R.id.lcv);
        if (viewGroup == null) {
            return;
        }
        enumC30206BtK.createHolder(dataChannel2, viewGroup, this.LJLIL, EnumC30226Bte.ICON_TITLE_HORIZONTAL);
        if (LiveCenterLayoutStyleSetting.INSTANCE.enableNewStyle() && (dataChannel = this.dataChannel) != null && (room = (Room) dataChannel.kv0(RoomChannel.class)) != null && (streamType = room.getStreamType()) != null && C28509BGv.LJI(streamType)) {
            _$_findCachedViewById(R.id.ip_).setVisibility(0);
            Uri.Builder buildUpon = UriProtector.parse(BroadcastLiveCenterUrl.INSTANCE.getValue()).buildUpon();
            DataChannel dataChannel3 = this.dataChannel;
            if (dataChannel3 != null && (room4 = (Room) dataChannel3.kv0(RoomChannel.class)) != null) {
                l = Long.valueOf(room4.getId());
            } else {
                l = null;
            }
            Uri.Builder appendQueryParameter = buildUpon.appendQueryParameter("room_id", String.valueOf(l));
            DataChannel dataChannel4 = this.dataChannel;
            if (dataChannel4 != null && (room3 = (Room) dataChannel4.kv0(RoomChannel.class)) != null && (owner = room3.getOwner()) != null) {
                l2 = Long.valueOf(owner.getId());
            } else {
                l2 = null;
            }
            Uri.Builder appendQueryParameter2 = appendQueryParameter.appendQueryParameter("anchor_id", String.valueOf(l2));
            DataChannel dataChannel5 = this.dataChannel;
            if (dataChannel5 != null && (room2 = (Room) dataChannel5.kv0(RoomChannel.class)) != null && (roomAuthStatus = room2.getRoomAuthStatus()) != null) {
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
                    this.LJLJJI = C05590Jv.LIZ((IHybridContainerService) LIZ, context, uri, null, 60);
                    ((ViewGroup) _$_findCachedViewById(R.id.ip_)).addView(this.LJLJJI, -1, -1);
                }
            } else {
                InterfaceC25300z0 interfaceC25300z0 = this.LJLJI;
                if (interfaceC25300z0 != null) {
                    String uri2 = build.toString();
                    ViewGroup realtime_performance_lynx_container = (ViewGroup) _$_findCachedViewById(R.id.ip_);
                    o.LJIIIIZZ(realtime_performance_lynx_container, "realtime_performance_lynx_container");
                    C25280yy.LIZ(interfaceC25300z0, uri2, realtime_performance_lynx_container, new BRZ());
                }
            }
            long currentTimeMillis = System.currentTimeMillis();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("room_id", String.valueOf(BJM.LJIILJJIL()));
            C01R.LIZIZ(currentTimeMillis, new C78528Urs(jSONObject), "live_anchor_center_mask_will_appear");
            BZI LIZ2 = C28787BRn.LIZ("livesdk_live_center_show");
            LIZ2.LJIILLIIL(this.LJLILLLLZI);
            LIZ2.LJIJJ("click_more", "enter_type");
            LIZ2.LJJIIJZLJL();
            this.LJLJJLL = SystemClock.elapsedRealtime();
        }
        C72818Shy.LIZLLL("anchor_center_request_room_info", this);
        C72818Shy.LIZLLL("anchor_center_receive_flash_card", this);
    }
}
