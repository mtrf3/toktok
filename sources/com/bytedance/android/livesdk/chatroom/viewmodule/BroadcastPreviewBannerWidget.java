package com.bytedance.android.livesdk.chatroom.viewmodule;

import X.C0NA;
import X.C199097rd;
import X.C29306Beo;
import X.C38393F4z;
import X.C47135Ieh;
import X.C65232Piu;
import X.C65352Pkq;
import X.C6J;
import X.C72818Shy;
import X.C78598Ut0;
import X.InterfaceC60761Nsz;
import X.InterfaceC72822Si2;
import X.SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS;
import android.widget.FrameLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.broadcast.banner.BannerWidget;
import com.bytedance.android.livesdk.dataChannel.BroadcastPreviewBannerChannel;
import com.bytedance.android.livesdk.dataChannel.RoomCreateInfoChannel;
import com.bytedance.android.livesdk.model.BannerInRoom;
import com.bytedance.android.livesdk.model.message.BannerInRoomCollection;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class BroadcastPreviewBannerWidget extends BannerWidget implements InterfaceC72822Si2 {
    public SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS LJLJLLL;
    public FrameLayout LJLL;
    public BannerInRoomCollection.BannerInfo LJLLI;
    public boolean LJLLILLLL = true;
    public final HashMap<String, Boolean> LJLLJ = new HashMap<>();
    public final HashMap<String, ArrayList<BannerInRoom>> LJLLL = new HashMap<>();
    public ArrayList<BannerInRoom> LJLLLL = new ArrayList<>();
    public final String LJLLLLLL = "custom_banner";

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void LJZI() {
        this.LJLILLLLZI = false;
        FrameLayout frameLayout = this.LJLL;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = this.LJLJLLL;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS != null) {
            SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.LJ(sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS);
        }
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.dnm;
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void onHide() {
        C0NA.LIZIZ(C65352Pkq.LIZ(BroadcastPreviewBannerChannel.class));
        FrameLayout frameLayout = this.LJLL;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = this.LJLJLLL;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS != null) {
            SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.LJ(sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS);
        }
        C6J.LIZIZ = null;
        C72818Shy.LJII("js_event_banner_ready_live", this);
    }

    @Override // com.bytedance.android.live.broadcast.banner.BannerWidget, com.bytedance.android.live.broadcast.preview.PreviewWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.broadcast.banner.BannerWidget, com.bytedance.android.live.broadcast.preview.PreviewWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void show() {
        ArrayList<BannerInRoom> arrayList = this.LJLLL.get(this.LJLJJI);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        this.LJLLLL = arrayList;
        if (C29306Beo.LJJIFFI(Boolean.valueOf(!arrayList.isEmpty()))) {
            super.show();
        }
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void LJZL() {
        super.LJZL();
        this.LJLL = (FrameLayout) findViewById(R.id.k98);
        HashMap<String, Boolean> hashMap = this.LJLLJ;
        LiveMode liveMode = LiveMode.SCREEN_RECORD;
        String str = liveMode.logStreamingType;
        o.LJIIIIZZ(str, "SCREEN_RECORD.logStreamingType");
        Boolean bool = Boolean.FALSE;
        hashMap.put(str, bool);
        HashMap<String, Boolean> hashMap2 = this.LJLLJ;
        LiveMode liveMode2 = LiveMode.VIDEO;
        String str2 = liveMode2.logStreamingType;
        o.LJIIIIZZ(str2, "VIDEO.logStreamingType");
        hashMap2.put(str2, bool);
        HashMap<String, Boolean> hashMap3 = this.LJLLJ;
        LiveMode liveMode3 = LiveMode.THIRD_PARTY;
        String str3 = liveMode3.logStreamingType;
        o.LJIIIIZZ(str3, "THIRD_PARTY.logStreamingType");
        hashMap3.put(str3, bool);
        HashMap<String, Boolean> hashMap4 = this.LJLLJ;
        LiveMode liveMode4 = LiveMode.LIVE_STUDIO;
        String str4 = liveMode4.logStreamingType;
        o.LJIIIIZZ(str4, "LIVE_STUDIO.logStreamingType");
        hashMap4.put(str4, bool);
        HashMap<String, ArrayList<BannerInRoom>> hashMap5 = this.LJLLL;
        String str5 = liveMode.logStreamingType;
        o.LJIIIIZZ(str5, "SCREEN_RECORD.logStreamingType");
        hashMap5.put(str5, new ArrayList<>());
        HashMap<String, ArrayList<BannerInRoom>> hashMap6 = this.LJLLL;
        String str6 = liveMode2.logStreamingType;
        o.LJIIIIZZ(str6, "VIDEO.logStreamingType");
        hashMap6.put(str6, new ArrayList<>());
        HashMap<String, ArrayList<BannerInRoom>> hashMap7 = this.LJLLL;
        String str7 = liveMode3.logStreamingType;
        o.LJIIIIZZ(str7, "THIRD_PARTY.logStreamingType");
        hashMap7.put(str7, new ArrayList<>());
        HashMap<String, ArrayList<BannerInRoom>> hashMap8 = this.LJLLL;
        String str8 = liveMode4.logStreamingType;
        o.LJIIIIZZ(str8, "LIVE_STUDIO.logStreamingType");
        hashMap8.put(str8, new ArrayList<>());
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.ov0(this, RoomCreateInfoChannel.class, new AqS171S0100000_5(this, 636));
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onDestroy() {
        super.onDestroy();
        FrameLayout frameLayout = this.LJLL;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = this.LJLJLLL;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS != null) {
            SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.LJ(sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS);
        }
        C6J.LIZIZ = null;
        C72818Shy.LJII("js_event_banner_ready_live", this);
    }

    @Override // com.bytedance.android.widget.Widget
    public final void onPause() {
        super.onPause();
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = this.LJLJLLL;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS != null) {
            C78598Ut0.LJIJI(sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS, "container_disappear", new JSONObject());
        }
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS2 = this.LJLJLLL;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS2 != null) {
            JSONObject LIZJ = C65232Piu.LIZJ("type", "app");
            LIZJ.put("args", new JSONObject().put("foreground", false));
            C78598Ut0.LJIJI(sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS2, "H5_appStateChange", LIZJ);
        }
    }

    @Override // com.bytedance.android.widget.Widget
    public final void onResume() {
        super.onResume();
        if (!this.LJLLILLLL) {
            SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = this.LJLJLLL;
            if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS != null) {
                C78598Ut0.LJIJI(sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS, "container_appear", new JSONObject());
            }
            SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS2 = this.LJLJLLL;
            if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS2 != null) {
                JSONObject LIZJ = C65232Piu.LIZJ("type", "app");
                LIZJ.put("args", new JSONObject().put("foreground", true));
                C78598Ut0.LJIJI(sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS2, "H5_appStateChange", LIZJ);
            }
        }
        this.LJLLILLLL = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0163  */
    @Override // com.bytedance.android.live.broadcast.banner.BannerWidget, com.bytedance.android.live.broadcast.preview.PreviewWidget
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onShow() {
        /*
            Method dump skipped, instructions count: 591
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.viewmodule.BroadcastPreviewBannerWidget.onShow():void");
    }

    @Override // com.bytedance.android.live.broadcast.banner.BannerWidget
    public final String LL() {
        return this.LJLLLLLL;
    }

    public final void LLFFF(InterfaceC60761Nsz interfaceC60761Nsz) {
        boolean LJ = o.LJ(this.LJLLJ.get(this.LJLJJI), Boolean.FALSE);
        this.LJLLJ.put(this.LJLJJI, Boolean.TRUE);
        JSONObject LJ2 = C47135Ieh.LJ("data", C38393F4z.LJFF(this.LJLLLL), "type", "init");
        LJ2.put("need_report", LJ);
        LJ2.put("live_type", this.LJLJJI);
        interfaceC60761Nsz.LJIIIZ("H5_roomStatusChange", LJ2);
    }

    @Override // X.InterfaceC72822Si2
    public final void onReceiveJsEvent(C199097rd c199097rd) {
        C6J c6j = C6J.LIZ;
        C6J.LIZIZ().LJIIJJI = System.currentTimeMillis();
        c6j.LJI();
    }
}
