package X;

import Y.ARunnableS13S0100100_5;
import Y.ARunnableS2S0100200_5;
import android.content.Context;
import android.os.Handler;
import android.util.LongSparseArray;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.function.IRoomFunctionService;
import com.bytedance.android.live.poll.PollApi;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.RoomUserChannel;
import com.bytedance.android.livesdk.dataChannel.ShowCustomPollToolBarAlert;
import com.bytedance.android.livesdk.dataChannel.ShowInteractionFeatureDialogEvent;
import com.bytedance.android.livesdk.dataChannel.StartPollMessageSEIEvent;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveCustomPollMigrateShortTouchSetting;
import com.bytedance.android.livesdk.model.RoomAuthStatus;
import com.bytedance.android.livesdk.model.UserAttr;
import com.bytedance.android.livesdk.model.message.PollMessage;
import com.bytedance.android.livesdkapi.depend.model.live.AnchorLevelPermission;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.message.LiveMessageSEI;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.google.android.play.core.appupdate.u;
import com.google.gson.Gson;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.C0h, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30627C0h implements InterfaceC04140Eg, InterfaceC72822Si2 {
    public static PollMessage LJLJJLL;
    public static PollMessage LJLJL;
    public static Context LJLJLJ;
    public static boolean LJLJLLL;
    public static long LJLLLL;
    public static boolean LJLZ;
    public static final C30627C0h LJLIL = new C30627C0h();
    public static final LongSparseArray<DataChannel> LJLILLLLZI = new LongSparseArray<>();
    public static final LongSparseArray<OnMessageListener> LJLJI = new LongSparseArray<>();
    public static final LongSparseArray<Integer> LJLJJI = new LongSparseArray<>();
    public static final LongSparseArray<Boolean> LJLJJL = new LongSparseArray<>();
    public static final LongSparseArray<CopyOnWriteArrayList<InterfaceC04100Ec>> LJLL = new LongSparseArray<>();
    public static final LongSparseArray<C04120Ee> LJLLI = new LongSparseArray<>();
    public static final LongSparseArray<C04120Ee> LJLLILLLL = new LongSparseArray<>();
    public static final Handler LJLLJ = new Handler(C16880lQ.LLJJJJ());
    public static final Handler LJLLL = new Handler(C16880lQ.LLJJJJ());
    public static final LongSparseArray<C04120Ee> LJLLLLLL = new LongSparseArray<>();

    public static final void LIZIZ(long j) {
        C04120Ee LIZJ;
        LJLZ = true;
        if (LJII(j) && (LIZJ = LIZJ(j)) != null && LiveCustomPollMigrateShortTouchSetting.enableMigrate()) {
            LJLLJ.postDelayed(new ARunnableS13S0100100_5(j, LIZJ, 0), 200L);
        }
    }

    public static C04120Ee LIZJ(long j) {
        return LJLLI.get(j);
    }

    public static final boolean LJ(long j) {
        Boolean bool = LJLJJL.get(j);
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public static boolean LJFF(DataChannel dataChannel) {
        Boolean bool;
        UserAttr userAttr;
        User user;
        UserAttr userAttr2;
        if (dataChannel != null && (user = (User) dataChannel.kv0(RoomUserChannel.class)) != null && (userAttr2 = user.getUserAttr()) != null) {
            return userAttr2.isAdmin;
        }
        User LIZIZ = C05200Ii.LIZIZ();
        if (LIZIZ != null && (userAttr = LIZIZ.getUserAttr()) != null) {
            bool = Boolean.valueOf(userAttr.isAdmin);
        } else {
            bool = null;
        }
        return C29306Beo.LJJIFFI(bool);
    }

    public static boolean LJI(long j) {
        Integer num = LJLJJI.get(j);
        if (num == null || num.intValue() != 0) {
            return false;
        }
        return true;
    }

    public static boolean LJII(long j) {
        C04120Ee LIZJ = LIZJ(j);
        if (LIZJ != null) {
            long j2 = LIZJ.LIZIZ;
            if (j2 > 0 || j2 == -1) {
                return true;
            }
        }
        return false;
    }

    public static final boolean LJIIZILJ(long j) {
        if (LJLLLLLL.get(j) != null) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC04140Eg
    public final boolean LIZ(long j) {
        RoomAuthStatus roomAuthStatus;
        Long l;
        Long l2;
        Room room;
        LongSparseArray<DataChannel> longSparseArray = LJLILLLLZI;
        DataChannel dataChannel = longSparseArray.get(j);
        if (dataChannel != null && (room = (Room) dataChannel.kv0(RoomChannel.class)) != null) {
            roomAuthStatus = room.getRoomAuthStatus();
        } else {
            roomAuthStatus = null;
        }
        if (C29306Beo.LJIIJ(longSparseArray.get(j))) {
            if (roomAuthStatus == null || (l2 = roomAuthStatus.customizablepoll) == null || l2.longValue() != 1) {
                return false;
            }
        } else if (LJFF(longSparseArray.get(j))) {
            if (roomAuthStatus == null || (l = roomAuthStatus.customizablepoll) == null || l.longValue() != 1) {
                return false;
            }
            AnchorLevelPermission anchorLevelPermission = roomAuthStatus.anchorLevelPermission;
            if (anchorLevelPermission != null && anchorLevelPermission.customizablePoll == 0) {
                return false;
            }
        } else if (!LJ(j) || LiveCustomPollMigrateShortTouchSetting.enableMigrate()) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC72822Si2
    public final void onReceiveJsEvent(C199097rd c199097rd) {
        ActivityC45651qj LIZIZ;
        String LJJIJIL;
        String LJJIJIL2;
        java.util.Map<String, Object> map;
        DataChannel dataChannel;
        if (o.LJ(c199097rd.LJLIL, "custom_poll_start")) {
            long j = LJLLLL;
            if (j != 0) {
                LJLJJL.put(j, Boolean.TRUE);
                InterfaceC78280Uns interfaceC78280Uns = c199097rd.LJLILLLLZI;
                if (interfaceC78280Uns != null) {
                    try {
                        Gson gson = C09650Zl.LIZJ;
                        InterfaceC78280Uns map2 = interfaceC78280Uns.getMap("sei");
                        if (map2 != null) {
                            map = map2.LIZIZ();
                        } else {
                            map = null;
                        }
                        LiveMessageSEI liveMessageSEI = (LiveMessageSEI) gson.LJI(gson.LJIILL(map), LiveMessageSEI.class);
                        if (liveMessageSEI != null && (dataChannel = LJLILLLLZI.get(LJLLLL)) != null) {
                            dataChannel.qv0(StartPollMessageSEIEvent.class, liveMessageSEI);
                            return;
                        }
                        return;
                    } catch (Exception e) {
                        C16880lQ.LLLLIIL(e);
                        return;
                    }
                }
                return;
            }
            return;
        }
        if (o.LJ(c199097rd.LJLIL, "custom_poll_template_page_status")) {
            InterfaceC78280Uns interfaceC78280Uns2 = c199097rd.LJLILLLLZI;
            boolean z = false;
            if (interfaceC78280Uns2 != null) {
                z = u.LJJIIZI(interfaceC78280Uns2, "show", false);
            }
            LJLJLLL = z;
            return;
        }
        if (o.LJ(c199097rd.LJLIL, "custom_poll_open_interact")) {
            DataChannel dataChannel2 = LJLILLLLZI.get(LJLLLL);
            if (dataChannel2 != null) {
                dataChannel2.pv0(ShowInteractionFeatureDialogEvent.class);
                return;
            }
            return;
        }
        if (o.LJ(c199097rd.LJLIL, "custom_poll_open_detailed_panel")) {
            InterfaceC78280Uns interfaceC78280Uns3 = c199097rd.LJLILLLLZI;
            String str = "short_touch";
            if (interfaceC78280Uns3 != null && (LJJIJIL2 = u.LJJIJIL(interfaceC78280Uns3, "enter_from", "short_touch")) != null) {
                str = LJJIJIL2;
            }
            InterfaceC78280Uns interfaceC78280Uns4 = c199097rd.LJLILLLLZI;
            String str2 = "";
            if (interfaceC78280Uns4 != null && (LJJIJIL = u.LJJIJIL(interfaceC78280Uns4, "poll_id", "")) != null) {
                str2 = LJJIJIL;
            }
            Context context = LJLJLJ;
            if (context != null && (LIZIZ = C29306Beo.LIZIZ(context)) != null) {
                ((IRoomFunctionService) CN1.LIZ(IRoomFunctionService.class)).u00(str, LIZIZ, LJLILLLLZI.get(LJLLLL), true, str2);
            }
        }
    }

    public static void LJIIIIZZ(long j, C04120Ee c04120Ee) {
        C04120Ee LIZJ;
        PollMessage pollMessage;
        if (C29306Beo.LJIIJ(LJLILLLLZI.get(j)) && (LIZJ = LIZJ(j)) != null && (pollMessage = LIZJ.LJI) != null) {
            C1EW.LIZ(((PollApi) C1A.LIZJ(PollApi.class)).endCustomPoll(j, pollMessage.pollId, 0)).LJJJLIIL(new InterfaceC64592gB() { // from class: X.9DG
                @Override // X.InterfaceC64592gB
                public final /* bridge */ /* synthetic */ void accept(Object obj) {
                }
            }, new InterfaceC64592gB() { // from class: X.9DH
                @Override // X.InterfaceC64592gB
                public final /* bridge */ /* synthetic */ void accept(Object obj) {
                }
            });
        }
        CopyOnWriteArrayList<InterfaceC04100Ec> copyOnWriteArrayList = LJLL.get(j);
        if (copyOnWriteArrayList != null) {
            Iterator<InterfaceC04100Ec> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                it.next().LJ(c04120Ee);
            }
        }
    }

    public static void LJIIIZ(long j, C04120Ee c04120Ee) {
        CopyOnWriteArrayList<InterfaceC04100Ec> copyOnWriteArrayList;
        if (!C74838TYs.LJ().LJIIL && (copyOnWriteArrayList = LJLL.get(j)) != null) {
            Iterator<InterfaceC04100Ec> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                it.next().LIZLLL(c04120Ee);
            }
        }
    }

    public static void LJIIJ(long j, C04120Ee c04120Ee) {
        CopyOnWriteArrayList<InterfaceC04100Ec> copyOnWriteArrayList;
        DataChannel dataChannel;
        String str;
        LongSparseArray<DataChannel> longSparseArray = LJLILLLLZI;
        if (!C29306Beo.LJIIJ(longSparseArray.get(j)) && !LJFF(longSparseArray.get(j))) {
            long LIZ = C30725C4b.LIZ();
            JSONObject jSONObject = new JSONObject();
            PollMessage pollMessage = c04120Ee.LJI;
            if (pollMessage == null || (str = Long.valueOf(pollMessage.pollId).toString()) == null) {
                str = "";
            }
            jSONObject.put("poll_id", str);
            C01R.LIZIZ(LIZ, new C78528Urs(jSONObject), "custom_poll_start_new_poll");
        }
        if (LiveCustomPollMigrateShortTouchSetting.enableMigrate()) {
            C30637C0r.LIZ(j, c04120Ee);
        } else {
            LongSparseArray<Integer> longSparseArray2 = LJLJJI;
            Integer num = longSparseArray2.get(j);
            if (num == null || num.intValue() != 0) {
                Integer num2 = longSparseArray2.get(j);
                if ((num2 == null || num2.intValue() != 1) && (dataChannel = longSparseArray.get(j)) != null) {
                    dataChannel.pv0(ShowCustomPollToolBarAlert.class);
                }
            } else if (!c04120Ee.LIZLLL && (copyOnWriteArrayList = LJLL.get(j)) != null) {
                Iterator<InterfaceC04100Ec> it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    it.next().LIZIZ(c04120Ee);
                }
            }
        }
        long j2 = c04120Ee.LIZIZ;
        if (j2 != -1) {
            if (j2 > 0) {
                LJLLJ.postDelayed(new ARunnableS2S0100200_5(j, j2, c04120Ee, 0), j2 % 1000);
                return;
            }
            c04120Ee.LIZIZ = 0L;
            c04120Ee.LIZ(EnumC04110Ed.TIME_OUT);
            LJIIIIZZ(j, c04120Ee);
        }
    }

    public static void LJIIJJI(long j, boolean z) {
        C04120Ee LIZJ = LIZJ(j);
        if (LIZJ != null) {
            LIZJ.LJII = z;
            CopyOnWriteArrayList<InterfaceC04100Ec> copyOnWriteArrayList = LJLL.get(j);
            if (copyOnWriteArrayList != null) {
                Iterator<InterfaceC04100Ec> it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    it.next().LIZJ(LIZJ);
                }
            }
        }
    }

    public static void LJIIL(long j, C04120Ee c04120Ee) {
        Long l;
        Long l2;
        PollMessage pollMessage = c04120Ee.LJI;
        if (pollMessage != null) {
            l = Long.valueOf(pollMessage.pollId);
        } else {
            l = null;
        }
        PollMessage pollMessage2 = LJLJJLL;
        if (pollMessage2 != null) {
            l2 = Long.valueOf(pollMessage2.pollId);
        } else {
            l2 = null;
        }
        if (o.LJ(l, l2)) {
            LJLJJLL = null;
            LJLJL = null;
        }
        if (o.LJ(LIZJ(j), c04120Ee)) {
            LJLLJ.removeCallbacksAndMessages(null);
            LJLLL.removeCallbacksAndMessages(null);
            c04120Ee.LJII = LJI(j);
            LJLLI.remove(j);
            CopyOnWriteArrayList<InterfaceC04100Ec> copyOnWriteArrayList = LJLL.get(j);
            if (copyOnWriteArrayList != null) {
                Iterator<InterfaceC04100Ec> it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    it.next().LJFF(c04120Ee);
                }
            }
        }
    }

    public static void LJIILIIL(int i, long j) {
        int intValue;
        LongSparseArray<Integer> longSparseArray = LJLJJI;
        Integer num = longSparseArray.get(j);
        if (num == null) {
            intValue = 1;
        } else {
            intValue = num.intValue();
        }
        longSparseArray.put(j, Integer.valueOf((~i) & intValue));
        if (LJI(j)) {
            LJIIJJI(j, true);
        }
    }

    public static void LJIILJJIL(int i, long j) {
        int intValue;
        LongSparseArray<Integer> longSparseArray = LJLJJI;
        Integer num = longSparseArray.get(j);
        if (num == null) {
            intValue = 1;
        } else {
            intValue = num.intValue();
        }
        longSparseArray.put(j, Integer.valueOf(i | intValue));
        LJIIJJI(j, false);
    }

    public static final void LJIILLIIL(long j, InterfaceC04100Ec pollCallback) {
        o.LJIIIZ(pollCallback, "pollCallback");
        LongSparseArray<CopyOnWriteArrayList<InterfaceC04100Ec>> longSparseArray = LJLL;
        CopyOnWriteArrayList<InterfaceC04100Ec> copyOnWriteArrayList = longSparseArray.get(j);
        if (copyOnWriteArrayList == null) {
            copyOnWriteArrayList = new CopyOnWriteArrayList<>();
            longSparseArray.put(j, copyOnWriteArrayList);
        }
        if (!copyOnWriteArrayList.contains(pollCallback)) {
            copyOnWriteArrayList.add(pollCallback);
            if (LiveCustomPollMigrateShortTouchSetting.enableMigrate()) {
                C30627C0h c30627C0h = LJLIL;
                C04120Ee LIZJ = LIZJ(j);
                if (LIZJ != null) {
                    LIZJ.LJ = c30627C0h.LIZ(j);
                    pollCallback.LIZLLL(LIZJ);
                }
            }
        }
    }

    public static final void LJIJ(long j, InterfaceC04100Ec pollCallback) {
        o.LJIIIZ(pollCallback, "pollCallback");
        CopyOnWriteArrayList<InterfaceC04100Ec> copyOnWriteArrayList = LJLL.get(j);
        if (copyOnWriteArrayList != null) {
            copyOnWriteArrayList.remove(pollCallback);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZLLL(boolean r12, long r13, X.C04120Ee r15) {
        /*
            Method dump skipped, instructions count: 729
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C30627C0h.LIZLLL(boolean, long, X.0Ee):void");
    }

    public static void LJIILL(long j, long j2, C04120Ee c04120Ee) {
        if (j2 > 0) {
            c04120Ee.LIZIZ = j2;
            CopyOnWriteArrayList<InterfaceC04100Ec> copyOnWriteArrayList = LJLL.get(j);
            if (copyOnWriteArrayList != null) {
                Iterator<InterfaceC04100Ec> it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    it.next().LIZ(c04120Ee);
                }
            }
            LJLLJ.postDelayed(new ARunnableS13S0100100_5(j, c04120Ee, 1), 1000L);
            return;
        }
        c04120Ee.LIZIZ = 0L;
        LJIIIIZZ(j, c04120Ee);
    }
}
