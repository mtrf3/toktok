package com.bytedance.android.livesdk.revenue.level.impl.fansclub.viewmodel;

import X.B83;
import X.BJM;
import X.BYG;
import X.BZI;
import X.C09650Zl;
import X.C0DC;
import X.C0NB;
import X.C15380j0;
import X.C16880lQ;
import X.C20880rs;
import X.C20910rv;
import X.C28294B8o;
import X.C28787BRn;
import X.C28992BZk;
import X.C29044Baa;
import X.C29374Bfu;
import X.C29474BhW;
import X.C29494Bhq;
import X.C29739Bln;
import X.C29741Blp;
import X.C29746Blu;
import X.C29750Bly;
import X.C29756Bm4;
import X.C29757Bm5;
import X.C29759Bm7;
import X.C29762BmA;
import X.C29763BmB;
import X.C29764BmC;
import X.C29771BmJ;
import X.C29774BmM;
import X.C29791Bmd;
import X.C32364Cn2;
import X.C32537Cpp;
import X.C48459J0d;
import X.C57562Ns;
import X.C73994T2g;
import X.C78895Uxn;
import X.CN1;
import X.InterfaceC05190Ih;
import X.InterfaceC29405BgP;
import X.InterfaceC29734Bli;
import X.InterfaceC29736Blk;
import X.InterfaceC30442Bx8;
import X.X1D;
import Y.IDCallbackS367S0100000_5;
import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.BadgeStruct;
import com.bytedance.android.live.base.model.user.PrivilegeLogExtra;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.browser.IBrowserService;
import com.bytedance.android.live.browser.IHybridContainerService;
import com.bytedance.android.live.function.IRoomFunctionService;
import com.bytedance.android.live.gift.GiftDialogDismissEvent;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.livesetting.broadcast.HandlerThreadOptSetting;
import com.bytedance.android.livesdk.livesetting.level.FansClubAnchorEntranceSettings;
import com.bytedance.android.livesdk.livesetting.level.FansClubApiRequestEnableSettings;
import com.bytedance.android.livesdk.livesetting.level.FansClubAudienceEntranceSettings;
import com.bytedance.android.livesdk.livesetting.level.FansClubConfig;
import com.bytedance.android.livesdk.livesetting.level.FansClubDynamicConfig;
import com.bytedance.android.livesdk.livesetting.level.FansClubLevelUpEnableSettings;
import com.bytedance.android.livesdk.livesetting.level.FansClubSettings;
import com.bytedance.android.livesdk.livesetting.level.FansEntranceResConfig;
import com.bytedance.android.livesdk.livesetting.level.FansTaskInitialDataExperiment;
import com.bytedance.android.livesdk.livesetting.performance.BuriedFieldReductionSetting;
import com.bytedance.android.livesdk.model.message.FansEventData;
import com.bytedance.android.livesdk.model.message.FansEventMessage;
import com.bytedance.android.livesdk.revenue.level.api.event.FansClubChannel;
import com.bytedance.android.livesdk.revenue.level.api.event.FansClubEvent;
import com.bytedance.android.livesdk.revenue.level.api.event.ShowFansClubToastEvent;
import com.bytedance.android.livesdk.revenue.level.api.fansclub.model.FansClubTaskPageData;
import com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService;
import com.bytedance.android.livesdk.revenue.level.impl.fansclub.FansClubWidget;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.ILiveHostCrossRoomEventHelper;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.bytedance.ies.sdk.widgets.LiveWidgetViewModel;
import com.bytedance.ies.sdk.widgets.widgetloadpriority.RoomRecycleWidget;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import com.zhiliaoapp.musically.R;
import defpackage.i0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.o;
import tikcast.api.privilege.FansGetTaskInfoResponse;
import webcast.data.FansLevelInfo;

/* loaded from: classes6.dex */
public final class FansClubViewModel extends LiveWidgetViewModel implements IFansClubService, OnMessageListener {
    public final String LJLIL = "FansClubViewModel";
    public String LJLILLLLZI = "unknown";
    public final boolean LJLJI = FansClubLevelUpEnableSettings.INSTANCE.getValue();
    public final boolean LJLJJI = FansClubApiRequestEnableSettings.INSTANCE.getValue();
    public final Handler LJLJJL = new Handler(C16880lQ.LLJJJJ(), new IDCallbackS367S0100000_5(this, 5));

    @Override // com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService
    public final void Et0(FansClubViewModel fansClubViewModel) {
    }

    @Override // com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService
    public final LiveDialogFragment b70(String str) {
        return null;
    }

    @Override // com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService
    public final LiveDialogFragment fM() {
        return null;
    }

    @Override // com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService
    public final RoomRecycleWidget mY() {
        return null;
    }

    @Override // com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService
    public final Class<? extends LiveRecyclableWidget> mk() {
        return FansClubWidget.class;
    }

    @Override // X.InterfaceC06390Mx
    public final /* synthetic */ void onInit() {
    }

    @Override // com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService
    public final boolean De() {
        FansClubDynamicConfig fansClubDynamicConfig;
        FansClubConfig fansClubConfig = FansClubSettings.INSTANCE.getFansClubConfig();
        if (fansClubConfig != null && (fansClubDynamicConfig = fansClubConfig.fansClubDynamicConfig) != null) {
            return fansClubDynamicConfig.enableFastFollowByFansLevel;
        }
        return false;
    }

    @Override // com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService
    public final void Q1() {
        this.LJLJJL.removeMessages(1);
        if (HandlerThreadOptSetting.INSTANCE.enable()) {
            Handler LIZ = C29774BmM.LIZ();
            if (LIZ != null) {
                LIZ.removeMessages(0);
                return;
            }
            return;
        }
        C29791Bmd.LIZJ.LIZ.removeMessages(0);
    }

    @Override // com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService
    public final boolean Vb0() {
        return FansClubAudienceEntranceSettings.INSTANCE.getValue();
    }

    @Override // com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService
    public final boolean Wg0() {
        return FansClubAnchorEntranceSettings.INSTANCE.getValue();
    }

    @Override // com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService
    public final void Wi0() {
        ILiveHostCrossRoomEventHelper iLiveHostCrossRoomEventHelper = (ILiveHostCrossRoomEventHelper) CN1.LIZ(ILiveHostCrossRoomEventHelper.class);
        BZI LIZ = C28787BRn.LIZ("livesdk_follow");
        LIZ.LJIIZILJ();
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        if (room != null) {
            LIZ.LJIJJ(Integer.valueOf(((IRoomFunctionService) CN1.LIZ(IRoomFunctionService.class)).u4(room.getId())), "server_heat_level");
            LIZ.LJIJJ(Integer.valueOf(((IRoomFunctionService) CN1.LIZ(IRoomFunctionService.class)).F(room.getId())), "client_heat_level");
        }
        C29474BhW.LIZ(LIZ);
        LIZ.LJIJJ("first_join_fans_club", "click_user_position");
        if (o.LJ("live_detail", BJM.LJFF()) || o.LJ("others_homepage", BJM.LJFF())) {
            LIZ.LJIJJ(iLiveHostCrossRoomEventHelper.getFromRequestId(), "cohost_from_request_id");
            LIZ.LJIJJ(iLiveHostCrossRoomEventHelper.getFromRoomId(), "cohost_from_room_id");
        }
        LIZ.LJJIIJZLJL();
    }

    @Override // com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService
    public final void dn0() {
        C20910rv.LJIILIIL(C20910rv.LIZ, R.layout.d3a, C20880rs.LIZ("ttlive_fans_club_entrance_layout"), null, false, 24);
    }

    @Override // com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService
    public final C29750Bly DZ() {
        DataChannel dataChannel = getDataChannel();
        if (dataChannel != null) {
            return (C29750Bly) dataChannel.kv0(FansClubChannel.class);
        }
        return null;
    }

    @Override // com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService
    public final void Mh() {
        String value = gv0();
        o.LJIIIZ(value, "value");
        C48459J0d<CopyOnWriteArraySet<String>> c48459J0d = InterfaceC30442Bx8.m0;
        CopyOnWriteArraySet<String> LIZJ = c48459J0d.LIZJ();
        if (LIZJ.size() > 100) {
            LIZJ.clear();
        }
        LIZJ.add(value);
        c48459J0d.LIZ(LIZJ);
    }

    @Override // com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService
    public final boolean SD() {
        C29750Bly c29750Bly;
        boolean z;
        Boolean bool;
        DataChannel dataChannel = getDataChannel();
        if (dataChannel != null) {
            c29750Bly = (C29750Bly) dataChannel.kv0(FansClubChannel.class);
        } else {
            c29750Bly = null;
        }
        DataChannel dataChannel2 = getDataChannel();
        if (dataChannel2 != null && (bool = (Boolean) dataChannel2.kv0(UserIsAnchorChannel.class)) != null) {
            z = bool.booleanValue();
        } else {
            z = false;
        }
        if ((c29750Bly != null && c29750Bly.LIZIZ == 0) || z) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService
    public final ArrayList<Double> eT() {
        String key = gv0();
        o.LJIIIZ(key, "key");
        return InterfaceC30442Bx8.n0.LIZJ().get(key);
    }

    @Override // com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService
    public final boolean ge0() {
        String value = gv0();
        o.LJIIIZ(value, "value");
        return InterfaceC30442Bx8.m0.LIZJ().contains(value);
    }

    public final String gv0() {
        Room room;
        DataChannel dataChannel = getDataChannel();
        String str = null;
        if (dataChannel != null && (room = (Room) dataChannel.kv0(RoomChannel.class)) != null) {
            str = Long.valueOf(room.getOwnerUserId()).toString();
        }
        return i0.LJFF(str, C0DC.LIZ());
    }

    public final void kv0() {
        C29750Bly c29750Bly;
        DataChannel dataChannel;
        Room room;
        User.FansClubInfo fansClubInfo;
        boolean z;
        DataChannel dataChannel2 = getDataChannel();
        if (dataChannel2 != null && (c29750Bly = (C29750Bly) dataChannel2.kv0(FansClubChannel.class)) != null && (dataChannel = getDataChannel()) != null && (room = (Room) dataChannel.kv0(RoomChannel.class)) != null) {
            User owner = room.getOwner();
            if (owner != null && (fansClubInfo = owner.fansClubInfo) != null) {
                fansClubInfo.fansCount = c29750Bly.LJII;
                fansClubInfo.fansLevel = c29750Bly.LIZ;
                fansClubInfo.fansScore = c29750Bly.LIZIZ;
                fansClubInfo.badge = c29750Bly.LIZJ;
                if (c29750Bly.LJ == 2) {
                    z = true;
                } else {
                    z = false;
                }
                fansClubInfo.isSleeping = z;
            }
            DataChannel dataChannel3 = getDataChannel();
            if (dataChannel3 != null) {
                dataChannel3.rv0(RoomChannel.class, room);
            }
        }
    }

    @Override // com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService
    public final void ld0() {
        String value = gv0();
        o.LJIIIZ(value, "value");
        C48459J0d<CopyOnWriteArraySet<String>> c48459J0d = InterfaceC30442Bx8.m0;
        CopyOnWriteArraySet<String> LIZJ = c48459J0d.LIZJ();
        LIZJ.remove(value);
        c48459J0d.LIZ(LIZJ);
    }

    @Override // com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService
    public final boolean NP() {
        return C29771BmJ.LJII;
    }

    @Override // com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService
    public final ImageModel Bd(long j) {
        if (!C29771BmJ.LJII || getDataChannel() == null) {
            return null;
        }
        return (ImageModel) ((LinkedHashMap) C29771BmJ.LIZJ).get(Long.valueOf(j));
    }

    @Override // com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService
    public final int Cs(List<BadgeStruct> list) {
        String str;
        int i = -1;
        if (list != null) {
            for (BadgeStruct badgeStruct : list) {
                if (badgeStruct != null && badgeStruct.badgeScene == 10) {
                    try {
                        PrivilegeLogExtra privilegeLogExtra = badgeStruct.logExtra;
                        if (privilegeLogExtra != null && (str = privilegeLogExtra.level) != null) {
                            i = CastIntegerProtector.parseInt(str);
                        } else {
                            i = 0;
                        }
                    } catch (Exception unused) {
                    }
                }
            }
        }
        return i;
    }

    @Override // com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService
    public final void Ij(double d) {
        String key = gv0();
        o.LJIIIZ(key, "key");
        C48459J0d<Map<String, ArrayList<Double>>> c48459J0d = InterfaceC30442Bx8.n0;
        Map<String, ArrayList<Double>> LIZJ = c48459J0d.LIZJ();
        if (LIZJ.size() > 100) {
            LIZJ.clear();
        }
        ArrayList<Double> arrayList = LIZJ.get(key);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            arrayList.add(Double.valueOf(d));
            LIZJ.put(key, arrayList);
        } else if (!arrayList.contains(Double.valueOf(d))) {
            arrayList.add(Double.valueOf(d));
        }
        LIZJ.put(key, arrayList);
        c48459J0d.LIZ(LIZJ);
    }

    @Override // com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService
    public final boolean Mg0(String str) {
        LiveDialogFragment liveDialogFragment;
        FragmentManager fragmentManager;
        DataChannel dataChannel;
        IFansClubService iFansClubService = (IFansClubService) CN1.LIZ(IFansClubService.class);
        if (iFansClubService != null) {
            liveDialogFragment = iFansClubService.b70(str);
        } else {
            liveDialogFragment = null;
        }
        if (o.LJ(str, "gift_banner") && (dataChannel = getDataChannel()) != null) {
            dataChannel.qv0(GiftDialogDismissEvent.class, Boolean.FALSE);
        }
        DataChannel dataChannel2 = getDataChannel();
        if (dataChannel2 == null || (fragmentManager = (FragmentManager) dataChannel2.kv0(C29494Bhq.class)) == null || liveDialogFragment == null || liveDialogFragment.isShowing() || liveDialogFragment.isAdded()) {
            return false;
        }
        liveDialogFragment.showNow(fragmentManager, "fans dialog");
        return true;
    }

    @Override // com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService
    public final void Nr(double d) {
        String key = gv0();
        o.LJIIIZ(key, "key");
        ArrayList<Double> arrayList = InterfaceC30442Bx8.n0.LIZJ().get(key);
        if (arrayList != null) {
            arrayList.remove(Double.valueOf(d));
        }
    }

    @Override // com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService
    public final int Sh0(int i) {
        if (!C29771BmJ.LJII || getDataChannel() == null) {
            return 0;
        }
        Integer num = (Integer) ((LinkedHashMap) C29771BmJ.LIZIZ).get(Integer.valueOf(i));
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    @Override // com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService
    public final C28294B8o hJ(Context context) {
        if (context == null) {
            return null;
        }
        return new C28294B8o(context);
    }

    public final ImageModel iv0(long j) {
        if (!C29771BmJ.LJII || getDataChannel() == null) {
            return null;
        }
        return (ImageModel) ((LinkedHashMap) C29771BmJ.LIZLLL).get(Long.valueOf(j));
    }

    @Override // com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService
    public final void oV(String str) {
        if (str == null) {
            return;
        }
        this.LJLILLLLZI = str;
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        C29750Bly c29750Bly;
        Boolean bool;
        FansEventData.NewFansData newFansData;
        C29750Bly c29750Bly2;
        DataChannel dataChannel;
        C29750Bly c29750Bly3;
        if ((iMessage instanceof FansEventMessage) && this.LJLJI) {
            FansEventMessage fansEventMessage = (FansEventMessage) iMessage;
            int i = fansEventMessage.eventType;
            long j = 0;
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            return;
                        }
                        DataChannel dataChannel2 = getDataChannel();
                        if (dataChannel2 == null || (c29750Bly3 = (C29750Bly) dataChannel2.kv0(FansClubChannel.class)) == null) {
                            c29750Bly3 = new C29750Bly(0L, 0L, null, null, 0, null, "", 0L);
                        }
                        if (c29750Bly3.LIZ > 0) {
                            jv0(fansEventMessage.fansLevelInfo, -1L);
                        }
                        FansLevelInfo fansLevelInfo = fansEventMessage.fansLevelInfo;
                        if (fansLevelInfo == null) {
                            return;
                        }
                        BZI LIZ = C28787BRn.LIZ("livesdk_fans_level_up_message");
                        LIZ.LJIIZILJ();
                        C29474BhW.LIZ(LIZ);
                        LIZ.LJIJJ(String.valueOf(fansLevelInfo.level), "fans_club_level");
                        LIZ.LJJIIJZLJL();
                        return;
                    }
                    C29750Bly jv0 = jv0(fansEventMessage.fansLevelInfo, -1L);
                    if (jv0 == null || (dataChannel = getDataChannel()) == null) {
                        return;
                    }
                    dataChannel.qv0(FansClubEvent.class, new C29764BmC(jv0));
                    return;
                }
                DataChannel dataChannel3 = getDataChannel();
                if (dataChannel3 == null || (c29750Bly2 = (C29750Bly) dataChannel3.kv0(FansClubChannel.class)) == null) {
                    c29750Bly2 = new C29750Bly(0L, 0L, null, null, 0, null, "", 0L);
                }
                if (c29750Bly2.LIZ <= 0 || c29750Bly2.LJ != 1) {
                    return;
                }
                jv0(fansEventMessage.fansLevelInfo, -1L);
                return;
            }
            FansEventData fansEventData = fansEventMessage.data;
            if (fansEventData != null && (newFansData = fansEventData.newFansData) != null) {
                j = newFansData.fansCount;
            }
            if (getDataChannel() == null) {
                return;
            }
            DataChannel dataChannel4 = getDataChannel();
            if (dataChannel4 == null || (c29750Bly = (C29750Bly) dataChannel4.kv0(FansClubChannel.class)) == null) {
                c29750Bly = new C29750Bly(0L, 0L, null, null, 0, null, "", 0L);
            }
            DataChannel dataChannel5 = getDataChannel();
            if (dataChannel5 == null || (bool = (Boolean) dataChannel5.kv0(UserIsAnchorChannel.class)) == null || !bool.booleanValue()) {
                return;
            }
            C29750Bly LIZ2 = C29750Bly.LIZ(c29750Bly, 0L, 0L, null, null, 0, null, j, 127);
            DataChannel dataChannel6 = getDataChannel();
            if (dataChannel6 != null) {
                dataChannel6.rv0(FansClubChannel.class, LIZ2);
            }
            DataChannel dataChannel7 = getDataChannel();
            if (dataChannel7 == null) {
                return;
            }
            dataChannel7.qv0(FansClubEvent.class, new C29741Blp(LIZ2));
        }
    }

    @Override // com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService
    public final C57562Ns sr0(Context context) {
        if (context == null) {
            return null;
        }
        return new C57562Ns(context);
    }

    @Override // com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService
    public final FansEntranceResConfig sx(int i) {
        int i2;
        List<FansEntranceResConfig> list = FansClubSettings.INSTANCE.getFansClubConfig().fansEntranceGeckoConfigList;
        FansEntranceResConfig fansEntranceResConfig = null;
        if (list == null || !(!list.isEmpty())) {
            return null;
        }
        Iterator<FansEntranceResConfig> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            FansEntranceResConfig next = it.next();
            FansEntranceResConfig fansEntranceResConfig2 = next;
            if (fansEntranceResConfig2 != null) {
                i2 = fansEntranceResConfig2.fansGrade;
            } else {
                i2 = 0;
            }
            if (i <= i2) {
                fansEntranceResConfig = next;
                break;
            }
        }
        return fansEntranceResConfig;
    }

    @Override // com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService
    public final C29750Bly yD(User user) {
        User.FansClubInfo fansClubInfo;
        int i;
        if (user == null || (fansClubInfo = user.fansClubInfo) == null) {
            return null;
        }
        long j = fansClubInfo.fansLevel;
        long j2 = fansClubInfo.fansScore;
        ImageModel imageModel = fansClubInfo.badge;
        boolean z = fansClubInfo.isSleeping;
        if (z) {
            i = 2;
        } else {
            i = 1;
        }
        return new C29750Bly(j, j2, imageModel, null, i, null, hv0((int) j, z), fansClubInfo.fansCount);
    }

    public static String hv0(int i, boolean z) {
        if (z) {
            return "#FF767676";
        }
        String str = (String) ((LinkedHashMap) C29771BmJ.LJFF).get(Integer.valueOf(i));
        if (TextUtils.isEmpty(str)) {
            if (i >= 50) {
                str = "#FFB21BCB";
            } else if (i >= 40) {
                str = "#FFD631B1";
            } else if (i > 30) {
                str = "#FFFF4F4F";
            } else if (i > 20) {
                str = "#FFFF6C37";
            } else if (i < 10) {
                str = "#FFFF984D";
            } else {
                str = "#FFFD8E3F";
            }
        } else if (str == null) {
            return "#FFFF984D";
        }
        return str;
    }

    @Override // com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService
    public final boolean As0(int i, int i2) {
        if (i > i2) {
            return false;
        }
        Iterator<Integer> it = C29771BmJ.LJ.iterator();
        int i3 = 0;
        while (it.hasNext()) {
            int intValue = it.next().intValue();
            if (i + 1 <= intValue && intValue <= i2) {
                i3 = intValue;
            }
        }
        if (i3 <= 0) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService
    public final void ED(Context context, String enterFrom) {
        Long l;
        long j;
        FansLevelInfo fansLevelInfo;
        FansGetTaskInfoResponse.Data data;
        FansGetTaskInfoResponse.Data data2;
        Room room;
        o.LJIIIZ(enterFrom, "enterFrom");
        InterfaceC29405BgP LIZIZ = B83.LIZ().LIZIZ();
        if (LIZIZ != null) {
            l = Long.valueOf(((C29374Bfu) LIZIZ).getCurrentUserId());
        } else {
            l = null;
        }
        DataChannel dataChannel = getDataChannel();
        if (dataChannel != null && (room = (Room) dataChannel.kv0(RoomChannel.class)) != null) {
            j = room.getOwnerUserId();
        } else {
            j = 0;
        }
        try {
            IBrowserService iBrowserService = (IBrowserService) CN1.LIZ(IBrowserService.class);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("fe_fans_level_info_");
            LIZ.append(l);
            String str = (String) iBrowserService.Wn(context, X1D.LIZIZ(LIZ));
            if (str == null) {
                str = "";
            }
            Object LJII = C09650Zl.LIZIZ.LJII(str, new C29763BmB().getType());
            o.LJIIIIZZ(LJII, "get().fromJson(feStore, …sLevelInfo?>?>() {}.type)");
            fansLevelInfo = (FansLevelInfo) ((Map) LJII).get(Long.valueOf(j));
        } catch (Throwable unused) {
            fansLevelInfo = null;
        }
        DataChannel dataChannel2 = getDataChannel();
        if (dataChannel2 != null) {
            data = (FansGetTaskInfoResponse.Data) dataChannel2.kv0(BYG.class);
        } else {
            data = null;
        }
        FansClubTaskPageData fansClubTaskPageData = new FansClubTaskPageData(fansLevelInfo, data);
        if (FansTaskInitialDataExperiment.INSTANCE.isGroup1() && (data2 = fansClubTaskPageData.taskInfoData) != null) {
            data2.tasks = null;
        }
        long currentTimeMillis = System.currentTimeMillis();
        String json = GsonProtectorUtils.toJson(C09650Zl.LIZIZ, fansClubTaskPageData);
        C0NB.LIZIZ("cuijinrui", String.valueOf(System.currentTimeMillis() - currentTimeMillis));
        C32364Cn2 c32364Cn2 = new C32364Cn2("aweme://roma_redirect/?");
        c32364Cn2.LIZJ("roma_group_key", "roma_schema_group_fans_level_main");
        c32364Cn2.LIZJ("roma_page_key", "roma_schema_page_user_main");
        c32364Cn2.LIZJ("show_entrance", enterFrom);
        IHybridContainerService iHybridContainerService = (IHybridContainerService) CN1.LIZ(IHybridContainerService.class);
        String LIZLLL = c32364Cn2.LIZLLL();
        o.LJIIIIZZ(LIZLLL, "builder.build()");
        iHybridContainerService.Vs0(context, LIZLLL, new C29762BmA(json));
    }

    @Override // com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService
    public final void gK(BadgeStruct badgeStruct, BadgeStruct badgeStruct2) {
        InterfaceC05190Ih currentUser;
        User user;
        List<BadgeStruct> list;
        if (B83.LIZ().LIZIZ() != null && (currentUser = B83.LIZ().LIZIZ().getCurrentUser()) != null && (currentUser instanceof User) && (user = (User) currentUser) != null) {
            C73994T2g.LJJIJ(8, badgeStruct, user);
            if (badgeStruct2 == null) {
                return;
            }
            List<BadgeStruct> badgeList = user.getBadgeList();
            if (badgeList == null || badgeList.size() == 0) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(badgeStruct2);
                list = arrayList;
            } else {
                int i = -1;
                int i2 = -1;
                for (int i3 = 0; i3 < badgeList.size(); i3++) {
                    if (i2 < 0 && ListProtector.get(badgeList, i3) != null && ((BadgeStruct) ListProtector.get(badgeList, i3)).badgeScene == 10) {
                        i2 = i3;
                    }
                    if (i < 0 && ListProtector.get(badgeList, i3) != null && ((BadgeStruct) ListProtector.get(badgeList, i3)).badgeScene == 8) {
                        i = i3;
                    }
                }
                if (i >= 0) {
                    if (i2 >= 0) {
                        if (i > i2) {
                            ListProtector.set(badgeList, i2, badgeStruct2);
                            ListProtector.add(badgeList, i2, ListProtector.remove(badgeList, i));
                            list = badgeList;
                        } else {
                            ListProtector.remove(badgeList, i2);
                            ListProtector.add(badgeList, Math.min(i + 1, badgeList.size()), badgeStruct2);
                            list = badgeList;
                        }
                    } else {
                        ListProtector.add(badgeList, Math.min(i + 1, badgeList.size()), badgeStruct2);
                        list = badgeList;
                    }
                } else if (i2 >= 0) {
                    ListProtector.set(badgeList, i2, badgeStruct2);
                    list = badgeList;
                } else {
                    badgeList.add(badgeStruct2);
                    list = badgeList;
                }
            }
            user.setBadgeList(list);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final C29750Bly jv0(FansLevelInfo fansLevelInfo, long j) {
        O o;
        C29750Bly c29750Bly;
        int i;
        DataChannel dataChannel;
        if (fansLevelInfo == null || getDataChannel() == null) {
            return null;
        }
        DataChannel dataChannel2 = getDataChannel();
        if (dataChannel2 != null) {
            FansGetTaskInfoResponse.Data data = (FansGetTaskInfoResponse.Data) dataChannel2.kv0(BYG.class);
            o = data;
            if (data != null) {
                data.levelInfo = fansLevelInfo;
                o = data;
            }
        } else {
            o = 0;
        }
        DataChannel dataChannel3 = getDataChannel();
        if (dataChannel3 != null) {
            ((C32537Cpp) dataChannel3.gv0(BYG.class)).LIZ = o;
        }
        DataChannel dataChannel4 = getDataChannel();
        if (dataChannel4 == null || (c29750Bly = (C29750Bly) dataChannel4.kv0(FansClubChannel.class)) == null) {
            c29750Bly = new C29750Bly(0L, 0L, null, null, 0, null, "", 0L);
        }
        long j2 = c29750Bly.LIZIZ;
        long j3 = fansLevelInfo.score;
        if (j2 > j3) {
            return null;
        }
        long j4 = c29750Bly.LJII;
        if (j > 0) {
            j4 = j;
        }
        BadgeStruct badgeStruct = fansLevelInfo.badge;
        if (badgeStruct == null) {
            badgeStruct = c29750Bly.LIZLLL;
        }
        long j5 = fansLevelInfo.level;
        ImageModel iv0 = iv0(j5);
        boolean z = fansLevelInfo.isSleeping;
        if (z) {
            i = 2;
        } else {
            i = 1;
        }
        C29750Bly LIZ = C29750Bly.LIZ(c29750Bly, j5, j3, iv0, badgeStruct, i, hv0((int) fansLevelInfo.level, z), j4, 32);
        DataChannel dataChannel5 = getDataChannel();
        if (dataChannel5 != null) {
            dataChannel5.rv0(FansClubChannel.class, LIZ);
        }
        if (c29750Bly.LJ == 2 && LIZ.LJ == 1) {
            C28992BZk.LJFF(Integer.valueOf((int) c29750Bly.LIZ), Long.valueOf(c29750Bly.LIZIZ), Integer.valueOf(c29750Bly.LJ), Integer.valueOf((int) LIZ.LIZ), Long.valueOf(LIZ.LIZIZ), Integer.valueOf(LIZ.LJ));
            C29750Bly LIZ2 = C29750Bly.LIZ(c29750Bly, 0L, 0L, iv0(c29750Bly.LIZ), null, 1, hv0((int) c29750Bly.LIZ, false), 0L, 171);
            DataChannel dataChannel6 = getDataChannel();
            if (dataChannel6 != null) {
                dataChannel6.qv0(FansClubEvent.class, new C29759Bm7(LIZ2));
            }
            if (o.LJ(this.LJLILLLLZI, "icon")) {
                String toast = C15380j0.LJIILJJIL(R.string.l6y);
                DataChannel dataChannel7 = getDataChannel();
                if (dataChannel7 != null) {
                    o.LJIIIIZZ(toast, "toast");
                    dataChannel7.qv0(ShowFansClubToastEvent.class, toast);
                }
            }
            Message obtainMessage = this.LJLJJL.obtainMessage(1);
            o.LJIIIIZZ(obtainMessage, "handler.obtainMessage(REQUEST_TASK_INFO_MSG)");
            this.LJLJJL.sendMessage(obtainMessage);
        }
        long j6 = c29750Bly.LIZ;
        if (j6 > 0) {
            long j7 = LIZ.LIZIZ - c29750Bly.LIZIZ;
            ImageModel iv02 = iv0(j6);
            String hv0 = hv0((int) c29750Bly.LIZ, false);
            c29750Bly = c29750Bly;
            C29750Bly LIZ3 = C29750Bly.LIZ(c29750Bly, 0L, 0L, iv02, null, 1, hv0, j4, 43);
            if (j7 > 0 && (dataChannel = getDataChannel()) != null) {
                dataChannel.qv0(FansClubEvent.class, new C29757Bm5(LIZ3, j7));
            }
        }
        long j8 = c29750Bly.LIZ;
        if (j8 == 0) {
            long j9 = LIZ.LIZ;
            if (j9 > j8) {
                long j10 = LIZ.LIZIZ - c29750Bly.LIZIZ;
                C29750Bly LIZ4 = C29750Bly.LIZ(c29750Bly, j9, 0L, LIZ.LIZJ, LIZ.LIZLLL, LIZ.LJ, LIZ.LJI, LIZ.LJII, 32);
                DataChannel dataChannel8 = getDataChannel();
                if (dataChannel8 != null) {
                    dataChannel8.qv0(FansClubEvent.class, new C29756Bm4(LIZ4, true));
                }
                DataChannel dataChannel9 = getDataChannel();
                if (dataChannel9 != null) {
                    dataChannel9.qv0(FansClubEvent.class, new C29757Bm5(LIZ4, j10));
                }
            }
        } else if (j8 > 0 && LIZ.LIZ > j8 && LIZ.LJ == 1) {
            C0NB.LJIIIZ(this.LJLIL, "nextLevel: " + LIZ.LIZ + ", currentLevel: " + c29750Bly.LIZ + ", scene: " + c29750Bly.LJ);
            DataChannel dataChannel10 = getDataChannel();
            if (dataChannel10 != null) {
                dataChannel10.qv0(FansClubEvent.class, new C29756Bm4(LIZ, false));
            }
        }
        return LIZ;
    }

    @Override // com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService
    public final void tz(FansLevelInfo fansLevelInfo, long j) {
        if (this.LJLJI) {
            jv0(fansLevelInfo, j);
        }
    }

    @Override // com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService
    public final Map Yd(Room room, DataChannel dataChannel, boolean z) {
        return C29474BhW.LIZIZ(room, dataChannel, z);
    }

    @Override // com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService
    public final void SI(boolean z, String str, String str2, boolean z2, String str3, boolean z3) {
        BZI LIZ = C28787BRn.LIZ("livesdk_fans_club_entrance_show");
        C29474BhW.LIZ(LIZ);
        if (!z) {
            LIZ.LJIJJ(Integer.valueOf(z2 ? 1 : 0), "is_follow");
        }
        LIZ.LJIJJ(str, "content_type");
        LIZ.LJIJJ(str2, "user_type");
        C78895Uxn.LIZIZ(LIZ, str3, "action_type", z3 ? 1 : 0, "is_first_guide");
        if (!BuriedFieldReductionSetting.INSTANCE.isBuriedField(LIZ.LJIILL())) {
            LIZ.LJIIZILJ();
            LIZ.LJJIIJZLJL();
        } else {
            LIZ.LJJIJ();
            LIZ.LJI();
            LIZ.LJJIIZI();
        }
    }

    @Override // com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService
    public final InterfaceC29734Bli ef(boolean z, ViewGroup rootView, ViewGroup viewGroup, InterfaceC29736Blk interfaceC29736Blk, LifecycleOwner lifecycleOwner, DataChannel dataChannel) {
        o.LJIIIZ(rootView, "rootView");
        if (viewGroup == null || lifecycleOwner == null) {
            return null;
        }
        if (z) {
            return new C29739Bln(rootView, viewGroup, interfaceC29736Blk, lifecycleOwner, dataChannel);
        }
        return new C29746Blu(rootView, viewGroup, interfaceC29736Blk, lifecycleOwner, dataChannel);
    }
}
