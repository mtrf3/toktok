package com.bytedance.android.livesdk.watch;

import X.ActivityC45651qj;
import X.B3X;
import X.B48;
import X.B4J;
import X.B4K;
import X.B4N;
import X.B51;
import X.B5S;
import X.B88;
import X.B9N;
import X.BN1;
import X.BT1;
import X.BT6;
import X.BT7;
import X.BT8;
import X.BT9;
import X.BTA;
import X.BTB;
import X.BTF;
import X.BTH;
import X.BZI;
import X.BZM;
import X.C03880Dg;
import X.C0NB;
import X.C16880lQ;
import X.C17N;
import X.C1B3;
import X.C1B6;
import X.C20760rg;
import X.C20780ri;
import X.C20880rs;
import X.C20910rv;
import X.C20990s3;
import X.C28151B3b;
import X.C28202B5a;
import X.C28253B6z;
import X.C28267B7n;
import X.C28701BOf;
import X.C28787BRn;
import X.C28823BSx;
import X.C29044Baa;
import X.C29051Bah;
import X.C29137Bc5;
import X.C29294Bec;
import X.C29306Beo;
import X.C29927Bop;
import X.C30081BrJ;
import X.C30149BsP;
import X.C30326BvG;
import X.C31014CFe;
import X.C38995FSd;
import X.C47071t1;
import X.C48459J0d;
import X.C59414NTm;
import X.C59902Ws;
import X.C65300Pk0;
import X.C71151RwB;
import X.C73943T0h;
import X.C74838TYs;
import X.C76800UCe;
import X.C87854Ydu;
import X.C87855Ydv;
import X.CN1;
import X.CR6;
import X.EnumC31509CYf;
import X.InterfaceC28161B3l;
import X.InterfaceC30442Bx8;
import X.InterfaceC65784Pro;
import X.ORZ;
import X.OSZ;
import X.RunnableC20770rh;
import X.X1D;
import Y.ARunnableS0S0001000_5;
import Y.ARunnableS7S0201000_4;
import Y.IDcS170S0100000_5;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.MotionEvent;
import android.view.ViewGroup;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.ICommentService;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.hashtag.IHashTagService;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.publicscreen.api.IPublicScreenHolderWidget;
import com.bytedance.android.live.publicscreen.api.IPublicScreenService;
import com.bytedance.android.live.slot.ISlotService;
import com.bytedance.android.live.toolbar.IToolbarService;
import com.bytedance.android.live.userinfowidget.IUserInfoWidgetService;
import com.bytedance.android.livesdk.LiveRoomFragment;
import com.bytedance.android.livesdk.callback.IHostLongPressCallback;
import com.bytedance.android.livesdk.chatroom.ui.LivePlayFragment;
import com.bytedance.android.livesdk.chatroom.viewmodule.CloseWidget;
import com.bytedance.android.livesdk.chatroom.viewmodule.LiveDrawerEntranceWidget;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dislike.LiveLongPressDialog;
import com.bytedance.android.livesdk.drawerfeed.LiveDrawerDialogV3;
import com.bytedance.android.livesdk.drawerfeed.LiveNonPersonalizedDialog;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicPerformanceReportOptSetting;
import com.bytedance.android.livesdk.livesetting.performance.EnableLiveRecycleWidgetView;
import com.bytedance.android.livesdk.livesetting.performance.EnableReinitLifecycleRegistry;
import com.bytedance.android.livesdk.livesetting.performance.LiveEnablePublicScreenP0;
import com.bytedance.android.livesdk.livesetting.performance.LiveEnableRecycleP0Widget;
import com.bytedance.android.livesdk.livesetting.performance.LiveP0WidgetsBlockList;
import com.bytedance.android.livesdk.livesetting.performance.LiveRecycleWidgetSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveUltimateInflateSwitchSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveWatchScrollFpsOptSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveDrawerDrawOptSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveQuizClosingStayDialogCountSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveQuizSlidingStayDialogCountSetting;
import com.bytedance.android.livesdk.model.RoomAuthStatus;
import com.bytedance.android.livesdk.model.message.RoomVerifyMessage;
import com.bytedance.android.livesdk.pip.PipSwitchDialog;
import com.bytedance.android.livesdk.pip.ShareSettingsDialog;
import com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.message.BaseMessage;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.sdk.widgets.IRecyclableWidget;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.bytedance.ies.sdk.widgets.LiveWidgetProvider;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.o;
import org.json.JSONObject;
import ujb.s;

/* loaded from: classes6.dex */
public class WatchLiveService implements IWatchLiveService, OnMessageListener {
    public int LJLIL;
    public final LongSparseArray<DataChannel> LJLILLLLZI = new LongSparseArray<>();
    public final LongSparseArray<LifecycleOwner> LJLJI = new LongSparseArray<>();
    public final LongSparseArray<Integer> LJLJJI = new LongSparseArray<>();
    public final LongSparseArray<ArrayList<BT8>> LJLJJL = new LongSparseArray<>();
    public C29294Bec LJLJJLL;

    @Override // com.bytedance.android.livesdk.watch.IWatchLiveService
    public final void P70() {
    }

    @Override // com.bytedance.android.livesdk.watch.IWatchLiveService
    public final int k30() {
        try {
            boolean LJ = C20990s3.LIZIZ().LJ();
            boolean isEnable = C20990s3.LIZIZ().isEnable();
            if (!LJ || !isEnable) {
                return 0;
            }
            int LIZIZ = C20990s3.LIZIZ().LIZIZ();
            if (LIZIZ < 0) {
                return 0;
            }
            return LIZIZ;
        } catch (Exception e) {
            C0NB.LJII(e);
            return 0;
        }
    }

    @Override // X.InterfaceC06390Mx
    public final /* synthetic */ void onInit() {
    }

    @Override // com.bytedance.android.livesdk.watch.IWatchLiveService
    public final B3X w() {
        return C28151B3b.LIZ();
    }

    @Override // com.bytedance.android.livesdk.watch.IWatchLiveService
    public final void Oj0() {
        BTH.LJLIL.getClass();
        ViewGroup viewGroup = BTH.LJLJL;
        if (viewGroup != null) {
            BTH.LJLLILLLL = (SystemClock.elapsedRealtime() - BTH.LJLLJ) + BTH.LJLLILLLL;
            BTH.LJLLJ = 0L;
            C29306Beo.LJI(viewGroup);
            LivePlayFragment livePlayFragment = BTH.LJLLLLLL;
            if (livePlayFragment != null) {
                livePlayFragment.vm("internal window video play", true);
            }
        }
    }

    @Override // com.bytedance.android.livesdk.watch.IWatchLiveService
    public final List<Class<? extends IRecyclableWidget>> RK() {
        Class<? extends IPublicScreenHolderWidget> pq;
        ArrayList arrayList = new ArrayList();
        arrayList.add(((ISlotService) CN1.LIZ(ISlotService.class)).getFrameL3SlotWidget());
        Class<? extends LiveRecyclableWidget> ma0 = ((IUserInfoWidgetService) CN1.LIZ(IUserInfoWidgetService.class)).ma0();
        if (ma0 != null) {
            arrayList.add(ma0);
        }
        Class<? extends LiveRecyclableWidget> XC = ((ICommentService) CN1.LIZ(ICommentService.class)).XC();
        if (XC != null) {
            arrayList.add(XC);
        }
        Class<? extends LiveRecyclableWidget> jm0 = ((IHashTagService) CN1.LIZ(IHashTagService.class)).jm0();
        if (jm0 != null) {
            arrayList.add(jm0);
        }
        Class<? extends LiveRecyclableWidget> zN = ((IToolbarService) CN1.LIZ(IToolbarService.class)).zN(true);
        if (zN != null) {
            arrayList.add(zN);
        }
        if (LiveEnablePublicScreenP0.INSTANCE.isEnable() && (pq = ((IPublicScreenService) CN1.LIZ(IPublicScreenService.class)).pq(true)) != null) {
            arrayList.add(pq);
        }
        arrayList.add(LiveDrawerEntranceWidget.class);
        arrayList.add(CloseWidget.class);
        for (String str : LiveP0WidgetsBlockList.INSTANCE.getBlocklist()) {
            Iterator it = arrayList.iterator();
            o.LJIIIIZZ(it, "result.iterator()");
            while (it.hasNext()) {
                if (s.LJJJLZIJ(C16880lQ.LJLLJ((Class) it.next()), str, false)) {
                    it.remove();
                }
            }
        }
        return arrayList;
    }

    @Override // com.bytedance.android.livesdk.watch.IWatchLiveService
    public final void U() {
        if (BN1.LIZIZ) {
            return;
        }
        int intValue = ((Number) new OSZ(Integer.valueOf(R.layout.d4t), "ttlive_fragment_live_room_surface").getFirst()).intValue();
        if (!C20760rg.LIZJ.containsKey(Integer.valueOf(intValue))) {
            C38995FSd.LIZLLL().submit(new RunnableC20770rh(1, intValue, 1));
        }
        BN1.LIZIZ = true;
    }

    @Override // com.bytedance.android.livesdk.watch.IWatchLiveService
    public final LiveNonPersonalizedDialog f20() {
        return new LiveNonPersonalizedDialog();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.android.livesdk.watch.IWatchLiveService
    public final Map<String, String> jM() {
        long j;
        JSONObject LIZIZ;
        String str;
        HashMap hashMap = new HashMap();
        BTA bta = (BTA) DataChannelGlobal.LJLJJI.mv0(C29051Bah.class);
        if (bta != null && (LIZIZ = bta.LIZIZ()) != null) {
            String str2 = "";
            hashMap.put("stream_fps", LIZIZ.optString("push_client_fps:", ""));
            String LLLZ = C16880lQ.LLLZ("%.2f", Arrays.copyOf(new Object[]{Double.valueOf(LIZIZ.optDouble("render_fps:", -1.0d))}, 1));
            o.LJIIIIZZ(LLLZ, "format(format, *args)");
            hashMap.put("render_fps", LLLZ);
            String optString = LIZIZ.optString("width:");
            String optString2 = LIZIZ.optString("height:");
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(optString);
            LIZ.append('*');
            LIZ.append(optString2);
            hashMap.put("stream_resolution", X1D.LIZIZ(LIZ));
            hashMap.put("decode_type", LIZIZ.optString("HardDecode:", ""));
            Map<String, String> map = C31014CFe.LIZLLL;
            Object obj = ((LinkedHashMap) map).get("effect_effect_id");
            if (obj == null) {
                obj = "";
            }
            hashMap.put("live_last_effect_id", obj);
            if (LinkMicPerformanceReportOptSetting.INSTANCE.useOpt()) {
                str = "effect_resource_id";
            } else {
                str = "effect_id";
            }
            Object obj2 = ((LinkedHashMap) map).get(str);
            if (obj2 != 0) {
                str2 = obj2;
            }
            hashMap.put("live_last_resource_id", str2);
        }
        long j2 = 0;
        if (B48.LIZ > 0) {
            j = SystemClock.elapsedRealtime() - B48.LIZ;
        } else {
            j = 0;
        }
        hashMap.put("live_room_watch_duration", C17N.LJIJ(j));
        if (B48.LIZIZ > 0) {
            j2 = SystemClock.elapsedRealtime() - B48.LIZIZ;
        }
        hashMap.put("live_activity_watch_duration", C17N.LJIJ(j2));
        return hashMap;
    }

    @Override // com.bytedance.android.livesdk.watch.IWatchLiveService
    public final List<B51> rR() {
        ArrayList arrayList = new ArrayList();
        Iterator it = ((ArrayList) BT6.LIZ).iterator();
        while (it.hasNext()) {
            arrayList.add(((BT9) it.next()).LIZ());
        }
        return arrayList;
    }

    @Override // com.bytedance.android.livesdk.watch.IWatchLiveService
    public final String zK() {
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        IInteractService iInteractService = (IInteractService) CN1.LIZ(IInteractService.class);
        if (room != null && room.roomLayout == 2) {
            return "video_anchor_order";
        }
        if (iInteractService.mT()) {
            return "video_anchor_pk";
        }
        if (iInteractService.OB()) {
            return "video_anchor_connect";
        }
        if (C74838TYs.LJ().LJIIL) {
            return "video_anchor_guest_connect";
        }
        return "normal_video_live";
    }

    @Override // com.bytedance.android.livesdk.watch.IWatchLiveService
    public final void af() {
        C73943T0h.LIZ().LIZIZ(new B88());
    }

    @Override // com.bytedance.android.livesdk.watch.IWatchLiveService
    public final boolean Kd() {
        return C28253B6z.LIZ;
    }

    @Override // com.bytedance.android.livesdk.watch.IWatchLiveService
    public final void Pb0() {
        BTH.LJIIIIZZ();
    }

    @Override // com.bytedance.android.livesdk.watch.IWatchLiveService
    public final int Yy() {
        return B4J.LIZJ;
    }

    @Override // com.bytedance.android.livesdk.watch.IWatchLiveService
    public final int ZY() {
        return this.LJLIL;
    }

    @Override // com.bytedance.android.livesdk.watch.IWatchLiveService
    public final void h60() {
        BN1.LIZIZ();
    }

    @Override // com.bytedance.android.livesdk.watch.IWatchLiveService
    public final C29294Bec l4() {
        return this.LJLJJLL;
    }

    @Override // com.bytedance.android.livesdk.watch.IWatchLiveService
    public final C87854Ydu CU(DataChannel dataChannel) {
        o.LJIIIZ(dataChannel, "dataChannel");
        return new C87854Ydu(dataChannel);
    }

    @Override // com.bytedance.android.livesdk.watch.IWatchLiveService
    public final void E8(long j) {
        ((ArrayList) LivePlayFragment.A).add(Long.valueOf(j));
    }

    @Override // com.bytedance.android.livesdk.watch.IWatchLiveService
    public final void F2(Map map) {
        C38995FSd.LIZIZ().submit(new ARunnableS7S0201000_4(this, map, 5));
    }

    @Override // com.bytedance.android.livesdk.watch.IWatchLiveService
    public final C87855Ydv F60(DataChannel dataChannel) {
        o.LJIIIZ(dataChannel, "dataChannel");
        return new C87855Ydv(dataChannel);
    }

    @Override // com.bytedance.android.livesdk.watch.IWatchLiveService
    public final void JI(int i) {
        this.LJLIL = i;
    }

    @Override // com.bytedance.android.livesdk.watch.IWatchLiveService
    public final boolean JM(String str) {
        BZM LIZLLL = B4J.LIZLLL(str);
        if (LIZLLL != null) {
            return LIZLLL.getIsClearScreen();
        }
        return false;
    }

    @Override // com.bytedance.android.livesdk.watch.IWatchLiveService
    public final void Kc0(Activity activity) {
        if (activity instanceof ActivityC45651qj) {
            ShareSettingsDialog shareSettingsDialog = new ShareSettingsDialog();
            FragmentManager supportFragmentManager = ((ActivityC45651qj) activity).getSupportFragmentManager();
            o.LJIIIIZZ(supportFragmentManager, "activity.supportFragmentManager");
            shareSettingsDialog.show(supportFragmentManager, ShareSettingsDialog.LJLJL);
        }
    }

    @Override // com.bytedance.android.livesdk.watch.IWatchLiveService
    public final void Lj0(C71151RwB provider) {
        o.LJIIIZ(provider, "provider");
        ArrayList arrayList = (ArrayList) BT6.LIZ;
        if (!arrayList.contains(provider)) {
            arrayList.add(provider);
        }
    }

    @Override // com.bytedance.android.livesdk.watch.IWatchLiveService
    public final boolean Rb(Long l) {
        DataChannel dataChannel;
        Room room;
        if (l == null || (dataChannel = this.LJLILLLLZI.get(l.longValue())) == null || (room = (Room) dataChannel.kv0(RoomChannel.class)) == null) {
            return false;
        }
        return room.isQuizRoom();
    }

    @Override // com.bytedance.android.livesdk.watch.IWatchLiveService
    public final void S1(Context context) {
        o.LJIIIZ(context, "context");
        BN1.LIZ(context);
        ((IToolbarService) CN1.LIZ(IToolbarService.class)).kb();
        if (LiveUltimateInflateSwitchSetting.INSTANCE.getValue()) {
            C20780ri.LIZLLL(R.layout.dp1, context);
        } else {
            C20910rv.LJIILIIL(C20910rv.LIZ, R.layout.dp1, C20880rs.LIZ("ttlive_widget_interaction_close"), null, false, 24);
        }
        if (!LiveDrawerDrawOptSetting.INSTANCE.isOpt()) {
            C20910rv.LJIILIIL(C20910rv.LIZ, R.layout.amo, C20880rs.LIZ("dialog_live_drawer_feed_v3"), null, false, 24);
        } else {
            C20910rv.LJIILIIL(C20910rv.LIZ, R.layout.amp, C20880rs.LIZ("dialog_live_drawer_feed_v3_draw_opt"), null, false, 24);
        }
        if (LiveWatchScrollFpsOptSetting.INSTANCE.enable("fanclub")) {
            ((IFansClubService) CN1.LIZ(IFansClubService.class)).dn0();
        }
    }

    @Override // com.bytedance.android.livesdk.watch.IWatchLiveService
    public final void W5(String str) {
        Map<String, InterfaceC28161B3l> map;
        if (!TextUtils.isEmpty(str) && (map = B4J.LIZ) != null) {
            ((HashMap) map).remove(str);
        }
    }

    @Override // com.bytedance.android.livesdk.watch.IWatchLiveService
    public final boolean ba(String str) {
        BZM LIZLLL = B4J.LIZLLL(str);
        if (LIZLLL != null) {
            return LIZLLL.getIsKeyboardOpen();
        }
        return false;
    }

    @Override // com.bytedance.android.livesdk.watch.IWatchLiveService
    public final void dP(C59414NTm c59414NTm) {
        B4N LIZIZ = B4N.LIZIZ();
        ((CopyOnWriteArrayList) LIZIZ.LIZ).add(c59414NTm);
        if (LIZIZ.LIZIZ) {
            LIZIZ.LIZLLL(c59414NTm);
        }
    }

    @Override // com.bytedance.android.livesdk.watch.IWatchLiveService
    public final boolean n20(Long l) {
        DataChannel dataChannel;
        Room room;
        if (l == null || (dataChannel = this.LJLILLLLZI.get(l.longValue())) == null || (room = (Room) dataChannel.kv0(RoomChannel.class)) == null) {
            return false;
        }
        return C29137Bc5.LIZIZ(room);
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0038  */
    @Override // com.bytedance.android.livesdk.watch.IWatchLiveService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void nT(android.content.Context r7) {
        /*
            r6 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.o.LJIIIZ(r7, r0)
            X.C30081BrJ.LIZ()
            java.lang.Class<com.bytedance.android.livesdk.watch.IWatchLiveService> r0 = com.bytedance.android.livesdk.watch.IWatchLiveService.class
            X.0Mx r0 = X.CN1.LIZ(r0)
            com.bytedance.android.livesdk.watch.IWatchLiveService r0 = (com.bytedance.android.livesdk.watch.IWatchLiveService) r0
            java.util.List r5 = r0.RK()
            X.Vuc r4 = new X.Vuc
            android.content.MutableContextWrapper r2 = new android.content.MutableContextWrapper
            X.10g r0 = X.C259710f.LIZ
            int r1 = r0.LJFF(r7)
            android.view.ContextThemeWrapper r0 = new android.view.ContextThemeWrapper
            r0.<init>(r7, r1)
            r2.<init>(r0)
            r4.<init>(r2)
            android.widget.FrameLayout r3 = new android.widget.FrameLayout
            r3.<init>(r7)
            java.util.Iterator r2 = r5.iterator()
        L32:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L55
            java.lang.Object r1 = r2.next()
            java.lang.Class r1 = (java.lang.Class) r1
            java.lang.Class<com.bytedance.android.live.hashtag.IHashTagService> r0 = com.bytedance.android.live.hashtag.IHashTagService.class
            X.0Mx r0 = X.CN1.LIZ(r0)
            com.bytedance.android.live.hashtag.IHashTagService r0 = (com.bytedance.android.live.hashtag.IHashTagService) r0
            java.lang.Class r0 = r0.jm0()
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 == 0) goto L51
            goto L32
        L51:
            X.C30081BrJ.LIZIZ(r4, r1, r3)     // Catch: java.lang.Exception -> L32
            goto L32
        L55:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.watch.WatchLiveService.nT(android.content.Context):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        BaseMessage baseMessage;
        CommonMessageData commonMessageData;
        long j;
        DataChannel dataChannel;
        Room room;
        if (!(iMessage instanceof CR6) || (baseMessage = (BaseMessage) iMessage) == null || (commonMessageData = baseMessage.baseMessage) == null || (dataChannel = this.LJLILLLLZI.get((j = commonMessageData.roomId))) == null || (room = (Room) dataChannel.kv0(RoomChannel.class)) == null || !(iMessage instanceof RoomVerifyMessage)) {
            return;
        }
        int i = ((RoomVerifyMessage) iMessage).verifyAction;
        if (i == 38) {
            RoomAuthStatus roomAuthStatus = room.getRoomAuthStatus();
            if (roomAuthStatus != null) {
                roomAuthStatus.setExploreEnabled(true);
            }
            ArrayList<BT8> arrayList = this.LJLJJL.get(j);
            if (arrayList == null) {
                return;
            }
            Iterator<BT8> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().LLLFZ(true);
            }
            return;
        }
        if (i != 39) {
            return;
        }
        RoomAuthStatus roomAuthStatus2 = room.getRoomAuthStatus();
        if (roomAuthStatus2 != null) {
            roomAuthStatus2.setExploreEnabled(false);
        }
        ArrayList<BT8> arrayList2 = this.LJLJJL.get(j);
        if (arrayList2 == null) {
            return;
        }
        Iterator<BT8> it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            it2.next().LLLFZ(false);
        }
    }

    @Override // com.bytedance.android.livesdk.watch.IWatchLiveService
    public final void pb(String path) {
        o.LJIIIZ(path, "path");
        C73943T0h.LIZ().LIZIZ(new C28701BOf(path));
    }

    @Override // com.bytedance.android.livesdk.watch.IWatchLiveService
    public final LiveRoomFragment w0(EnterRoomConfig config) {
        boolean z;
        o.LJIIIZ(config, "config");
        C30326BvG.LIZ.post(new ARunnableS0S0001000_5(0, 2), null);
        C30081BrJ.LIZ();
        LiveRoomFragment liveRoomFragment = new LiveRoomFragment();
        if ("homepage_hot".equals(config.mRoomsData.enterFromMerge) && "live_cell".equals(config.mRoomsData.enterMethod)) {
            z = true;
        } else {
            z = false;
        }
        liveRoomFragment.LLD = z;
        C28202B5a.LIZ().LJI(liveRoomFragment);
        LiveWidgetProvider.getInstance().isValid = LiveRecycleWidgetSetting.INSTANCE.getValue();
        LiveWidgetProvider.getInstance().isRecycleWidgetContentView = EnableLiveRecycleWidgetView.INSTANCE.getValue();
        LiveWidgetProvider.getInstance().isDestoryReInit = EnableReinitLifecycleRegistry.INSTANCE.getValue();
        LiveWidgetProvider.getInstance().isEnablePriorityPreload = LiveEnableRecycleP0Widget.INSTANCE.getEnable();
        B5S.LIZ = false;
        B5S.LIZJ = false;
        return liveRoomFragment;
    }

    @Override // com.bytedance.android.livesdk.watch.IWatchLiveService
    public final boolean w9(String str) {
        B4K LIZJ = B4J.LIZJ(str);
        if (LIZJ != null) {
            return LIZJ.dg();
        }
        return false;
    }

    @Override // com.bytedance.android.livesdk.watch.IWatchLiveService
    public final boolean we(Long l) {
        Room room;
        RoomAuthStatus roomAuthStatus;
        if (l == null) {
            return false;
        }
        l.longValue();
        DataChannel dataChannel = this.LJLILLLLZI.get(l.longValue());
        if (dataChannel != null && (room = (Room) dataChannel.kv0(RoomChannel.class)) != null && (roomAuthStatus = room.getRoomAuthStatus()) != null && !roomAuthStatus.isExploreEnabled()) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.android.livesdk.watch.IWatchLiveService
    public final void F4(String str, InterfaceC28161B3l drawerActivity) {
        o.LJIIIZ(drawerActivity, "drawerActivity");
        if (B4J.LIZ == null) {
            B4J.LIZ = new HashMap();
        }
        if (!TextUtils.isEmpty(str)) {
            ((HashMap) B4J.LIZ).put(str, drawerActivity);
        }
    }

    @Override // com.bytedance.android.livesdk.watch.IWatchLiveService
    public final List IU(DataChannel dataChannel, LiveMode liveMode) {
        o.LJIIIZ(dataChannel, "dataChannel");
        o.LJIIIZ(liveMode, "liveMode");
        ArrayList arrayList = new ArrayList();
        if (C30149BsP.LIZ()) {
            BZI LIZ = C28787BRn.LIZ("livesdk_live_user_adaptive_screen_show");
            LIZ.LJIILLIIL(dataChannel);
            LIZ.LJJIIJZLJL();
            arrayList.add(new B9N(dataChannel));
        }
        return arrayList;
    }

    @Override // com.bytedance.android.livesdk.watch.IWatchLiveService
    public final void Il0(int i, Long l) {
        if (l != null) {
            l.longValue();
            Integer num = this.LJLJJI.get(l.longValue());
            if (num != null) {
                num.intValue();
                this.LJLJJI.put(l.longValue(), Integer.valueOf(i));
            }
        }
    }

    @Override // com.bytedance.android.livesdk.watch.IWatchLiveService
    public final LiveDrawerDialogV3 JJ(BZM bzm, Bundle bundle) {
        LiveDrawerDialogV3 liveDrawerDialogV3 = new LiveDrawerDialogV3();
        liveDrawerDialogV3.LJLJI = null;
        liveDrawerDialogV3.LJLILLLLZI = bundle;
        liveDrawerDialogV3.LJLIL = bzm;
        return liveDrawerDialogV3;
    }

    @Override // com.bytedance.android.livesdk.watch.IWatchLiveService
    public final void LLFFF(Room room, DataChannel dataChannel) {
        IMessageManager iMessageManager;
        if (room != null) {
            this.LJLILLLLZI.remove(room.getId());
            this.LJLJJI.remove(room.getId());
            this.LJLJI.remove(room.getId());
            this.LJLJJL.remove(room.getId());
        }
        if (dataChannel != null && (iMessageManager = (IMessageManager) dataChannel.kv0(C29927Bop.class)) != null) {
            iMessageManager.removeMessageListener(this);
        }
        this.LJLJJLL = null;
    }

    @Override // com.bytedance.android.livesdk.watch.IWatchLiveService
    public final void Zd0(long j, boolean z) {
        C73943T0h.LIZ().LIZIZ(new BTB(j, z));
    }

    @Override // com.bytedance.android.livesdk.watch.IWatchLiveService
    public final void nd0(ActivityC45651qj activityC45651qj, DialogFragment dialogFragment) {
        BTH.LJLIL.LJIIJJI(activityC45651qj, dialogFragment);
    }

    @Override // com.bytedance.android.livesdk.watch.IWatchLiveService
    public final void tM(Long l, BTF btf) {
        if (l != null) {
            l.longValue();
            ArrayList<BT8> arrayList = this.LJLJJL.get(l.longValue());
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                this.LJLJJL.put(l.longValue(), arrayList);
            }
            arrayList.add(btf);
        }
    }

    @Override // com.bytedance.android.livesdk.watch.IWatchLiveService
    public final void vT(MotionEvent motionEvent, String str) {
        C73943T0h.LIZ().LIZIZ(new C59902Ws(motionEvent, str));
    }

    @Override // com.bytedance.android.livesdk.watch.IWatchLiveService
    public final void y10(long j, Activity activity) {
        if (activity instanceof ActivityC45651qj) {
            PipSwitchDialog pipSwitchDialog = new PipSwitchDialog();
            Bundle bundle = new Bundle();
            bundle.putString("enter_from", "live_page");
            bundle.putLong("room_id", j);
            pipSwitchDialog.setArguments(bundle);
            FragmentManager supportFragmentManager = ((ActivityC45651qj) activity).getSupportFragmentManager();
            o.LJIIIIZZ(supportFragmentManager, "activity.supportFragmentManager");
            pipSwitchDialog.show(supportFragmentManager, PipSwitchDialog.LJLILLLLZI);
        }
    }

    public static void LIZ(LifecycleOwner lifecycleOwner, Context context, InterfaceC65784Pro interfaceC65784Pro) {
        C47071t1 c47071t1 = new C47071t1(context);
        c47071t1.LIZIZ = lifecycleOwner;
        c47071t1.LJIILLIIL(R.string.os0);
        c47071t1.LJFF(R.string.orz);
        c47071t1.LJIIJJI(R.string.ory);
        c47071t1.LJIIIZ(R.string.orx, new IDcS170S0100000_5(interfaceC65784Pro, 16));
        c47071t1.LJIILL = false;
        c47071t1.LJIILJJIL = false;
        LiveDialog LIZ = c47071t1.LIZ();
        if (new C03880Dg(2).LIZJ(300000, "com/bytedance/android/live/design/app/LiveDialog", "show", LIZ, new Object[0], "void", new C65300Pk0(false, "()V", "5088687353047824877")).LIZ) {
            return;
        }
        LIZ.show();
    }

    @Override // com.bytedance.android.livesdk.watch.IWatchLiveService
    public final void LLZZLLIL(Room room, DataChannel dataChannel, LifecycleOwner lifecycleOwner) {
        IMessageManager iMessageManager;
        if (room != null) {
            this.LJLILLLLZI.put(room.getId(), dataChannel);
            this.LJLJJI.put(room.getId(), 0);
            this.LJLJI.put(room.getId(), lifecycleOwner);
        }
        if (dataChannel != null && (iMessageManager = (IMessageManager) dataChannel.kv0(C29927Bop.class)) != null) {
            iMessageManager.addMessageListener(EnumC31509CYf.ROOM_VERIFY.getIntType(), this);
        }
        C29294Bec c29294Bec = new C29294Bec();
        this.LJLJJLL = c29294Bec;
        c29294Bec.LIZ = dataChannel;
    }

    @Override // com.bytedance.android.livesdk.watch.IWatchLiveService
    public final boolean M(String str, String str2, boolean z) {
        if (ORZ.LJLJJI(str, (ArrayList) C28823BSx.LIZ.getValue()) || ((z && TextUtils.equals("homepage_follow", str)) || (o.LJ("follow_widget", str) && o.LJ("live_merge", str2)))) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.android.livesdk.watch.IWatchLiveService
    public final boolean d10(Context context, Long l, C28267B7n c28267B7n) {
        LifecycleOwner lifecycleOwner;
        int i;
        if (l != null) {
            l.longValue();
            if (Rb(l)) {
                Integer num = this.LJLJJI.get(l.longValue());
                if (num != null && num.intValue() == 1 && (lifecycleOwner = this.LJLJI.get(l.longValue())) != null && context != null) {
                    C48459J0d<Long> c48459J0d = InterfaceC30442Bx8.d1;
                    Long timestamp = c48459J0d.LIZJ();
                    long currentTimeMillis = System.currentTimeMillis();
                    o.LJIIIIZZ(timestamp, "timestamp");
                    if (((int) (timestamp.longValue() / 86400000)) == ((int) (currentTimeMillis / 86400000))) {
                        Integer LIZJ = InterfaceC30442Bx8.o1.LIZJ();
                        o.LJIIIIZZ(LIZJ, "LIVE_SLIDING_STAY_DIALOG_SHOW_COUNT.value");
                        i = LIZJ.intValue();
                    } else {
                        i = 0;
                    }
                    if (i < LiveQuizSlidingStayDialogCountSetting.INSTANCE.getValue()) {
                        LIZ(lifecycleOwner, context, c28267B7n);
                        c48459J0d.LIZ(Long.valueOf(currentTimeMillis));
                        InterfaceC30442Bx8.o1.LIZ(Integer.valueOf(i + 1));
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // com.bytedance.android.livesdk.watch.IWatchLiveService
    public final boolean hU(Context context, Long l, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        LifecycleOwner lifecycleOwner;
        int i;
        if (l != null) {
            l.longValue();
            if (Rb(l)) {
                Integer num = this.LJLJJI.get(l.longValue());
                if (num != null && num.intValue() == 1 && (lifecycleOwner = this.LJLJI.get(l.longValue())) != null && context != null) {
                    C48459J0d<Long> c48459J0d = InterfaceC30442Bx8.b1;
                    Long timestamp = c48459J0d.LIZJ();
                    long currentTimeMillis = System.currentTimeMillis();
                    o.LJIIIIZZ(timestamp, "timestamp");
                    if (((int) (timestamp.longValue() / 86400000)) == ((int) (currentTimeMillis / 86400000))) {
                        Integer LIZJ = InterfaceC30442Bx8.c1.LIZJ();
                        o.LJIIIIZZ(LIZJ, "LIVE_CLOSING_STAY_DIALOG_SHOW_COUNT.value");
                        i = LIZJ.intValue();
                    } else {
                        i = 0;
                    }
                    if (i < LiveQuizClosingStayDialogCountSetting.INSTANCE.getValue()) {
                        LIZ(lifecycleOwner, context, interfaceC65784Pro);
                        c48459J0d.LIZ(Long.valueOf(currentTimeMillis));
                        InterfaceC30442Bx8.c1.LIZ(Integer.valueOf(i + 1));
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // com.bytedance.android.livesdk.watch.IWatchLiveService
    public final B4K r6(ActivityC45651qj activity, BZM container, int i) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(container, "container");
        if (B4J.LIZJ(B4J.LIZ(activity)) == null) {
            FragmentManager supportFragmentManager = activity.getSupportFragmentManager();
            C1B3 LIZ = C1B6.LIZ(supportFragmentManager, supportFragmentManager);
            LiveDrawerDialogV3 JJ = ((IWatchLiveService) CN1.LIZ(IWatchLiveService.class)).JJ(container, new Bundle());
            if (JJ != null) {
                Fragment LJJJIL = supportFragmentManager.LJJJIL("LiveDrawerHelper_drawer_fragment");
                if (LJJJIL != null) {
                    LIZ.LJJI(LJJJIL);
                    LIZ.LJIIJ(JJ, "LiveDrawerHelper_drawer_fragment", i);
                    LIZ.LJI();
                    return JJ;
                }
                LIZ.LJIIIIZZ(i, 1, JJ, "LiveDrawerHelper_drawer_fragment");
                LIZ.LJI();
                return JJ;
            }
        }
        return null;
    }

    @Override // com.bytedance.android.livesdk.watch.IWatchLiveService
    public final void FU(Room room, String str, String str2, String str3) {
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        C28823BSx.LIZIZ(room, str, str2, BT1.LONG_PRESS, str3);
    }

    @Override // com.bytedance.android.livesdk.watch.IWatchLiveService
    public final void Gi(Room room, String str, String str2, String str3) {
        String str4 = str;
        String str5 = "";
        if (str4 == null) {
            str4 = "";
        }
        if (str2 != null) {
            str5 = str2;
        }
        C28823BSx.LIZ(room, str4, str5, BT1.SHARING_PANEL, str3, false, 0, false);
    }

    @Override // com.bytedance.android.livesdk.watch.IWatchLiveService
    public final void Wk(float f, float f2, float f3, float f4) {
        C73943T0h.LIZ().LIZIZ(new BT7(f, f2, f3, f4));
    }

    @Override // com.bytedance.android.livesdk.watch.IWatchLiveService
    public final void pn(Room room, String str, String str2, String str3) {
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        C28823BSx.LIZIZ(room, str, str2, BT1.SHARING_PANEL, str3);
    }

    @Override // com.bytedance.android.livesdk.watch.IWatchLiveService
    public final LiveLongPressDialog km0(IHostLongPressCallback iHostLongPressCallback, Context context, Room room, String str, String str2, String str3) {
        if (context == null || room == null || !(context instanceof ActivityC45651qj)) {
            return null;
        }
        LiveLongPressDialog liveLongPressDialog = new LiveLongPressDialog();
        liveLongPressDialog.LJLIL = !M(str, str2, false);
        liveLongPressDialog.LJLJJI = str;
        liveLongPressDialog.LJLJJL = str2;
        liveLongPressDialog.LJLJJLL = str3;
        liveLongPressDialog.LJLJI = room;
        liveLongPressDialog.LJLILLLLZI = iHostLongPressCallback;
        FragmentManager supportFragmentManager = ((ActivityC45651qj) context).getSupportFragmentManager();
        o.LJIIIIZZ(supportFragmentManager, "context.supportFragmentManager");
        liveLongPressDialog.show(supportFragmentManager, "LiveLongPressDialog");
        return liveLongPressDialog;
    }
}
