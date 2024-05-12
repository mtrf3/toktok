package X;

import android.util.LongSparseArray;
import com.bytedance.android.livesdk.model.LiveEventInfo;
import com.bytedance.android.livesdk.model.message.LiveEventMessage;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.o;
import webcast.data.EventCard;

/* renamed from: X.C0i, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30628C0i implements InterfaceC72822Si2 {
    public static long LJLJLJ;
    public static final C30628C0i LJLIL = new C30628C0i();
    public static final LongSparseArray<DataChannel> LJLILLLLZI = new LongSparseArray<>();
    public static final LongSparseArray<OnMessageListener> LJLJI = new LongSparseArray<>();
    public static final LongSparseArray<Integer> LJLJJI = new LongSparseArray<>();
    public static final LongSparseArray<CopyOnWriteArrayList<InterfaceC17380mE>> LJLJJL = new LongSparseArray<>();
    public static final LongSparseArray<C17390mF> LJLJJLL = new LongSparseArray<>();
    public static final LongSparseArray<C17390mF> LJLJL = new LongSparseArray<>();
    public static final LongSparseArray<C17390mF> LJLJLLL = new LongSparseArray<>();

    public static C17390mF LIZ(long j) {
        return LJLJJLL.get(j);
    }

    @Override // X.InterfaceC72822Si2
    public final void onReceiveJsEvent(C199097rd c199097rd) {
        C17390mF LIZ;
        if (o.LJ(c199097rd.LJLIL, "live_event_pin_card_close") && (LIZ = LIZ(LJLJLJ)) != null) {
            LIZLLL(LIZ.LIZ, LIZ);
        }
    }

    public static void LIZIZ(long j, C17390mF c17390mF) {
        Long l;
        Long l2;
        long j2;
        CopyOnWriteArrayList<InterfaceC17380mE> copyOnWriteArrayList;
        EventCard eventCard;
        CopyOnWriteArrayList<InterfaceC17380mE> copyOnWriteArrayList2;
        LiveEventInfo liveEventInfo;
        LiveEventMessage liveEventMessage;
        EventCard eventCard2;
        LiveEventInfo liveEventInfo2;
        C17390mF LIZ;
        Long l3;
        EventCard eventCard3;
        LiveEventInfo liveEventInfo3;
        EventCard eventCard4;
        LiveEventInfo liveEventInfo4;
        LiveEventMessage liveEventMessage2 = c17390mF.LIZIZ;
        if (liveEventMessage2 != null) {
            int i = liveEventMessage2.actionType;
            LiveEventMessage liveEventMessage3 = null;
            r3 = null;
            r3 = null;
            Long l4 = null;
            if (i != 1) {
                if (i != 2 || (LIZ = LIZ(j)) == null) {
                    return;
                }
                LiveEventMessage liveEventMessage4 = LIZ.LIZIZ;
                if (liveEventMessage4 != null && (eventCard4 = liveEventMessage4.card) != null && (liveEventInfo4 = eventCard4.event) != null) {
                    l3 = liveEventInfo4.eventId;
                } else {
                    l3 = null;
                }
                LiveEventMessage liveEventMessage5 = c17390mF.LIZIZ;
                if (liveEventMessage5 != null && (eventCard3 = liveEventMessage5.card) != null && (liveEventInfo3 = eventCard3.event) != null) {
                    l4 = liveEventInfo3.eventId;
                }
                if (o.LJ(l3, l4) && !LIZJ(LIZ.LIZIZ, liveEventMessage2)) {
                    LIZLLL(j, c17390mF);
                    return;
                }
                LongSparseArray<C17390mF> longSparseArray = LJLJL;
                C17390mF c17390mF2 = longSparseArray.get(j);
                if (c17390mF2 != null) {
                    if (LIZJ(c17390mF2.LIZIZ, liveEventMessage2)) {
                        return;
                    }
                    longSparseArray.put(j, c17390mF);
                    return;
                }
                longSparseArray.put(j, c17390mF);
                return;
            }
            LongSparseArray<C17390mF> longSparseArray2 = LJLJL;
            C17390mF c17390mF3 = longSparseArray2.get(j);
            if (c17390mF3 != null && (liveEventMessage = c17390mF3.LIZIZ) != null && (eventCard2 = liveEventMessage.card) != null && (liveEventInfo2 = eventCard2.event) != null) {
                l = liveEventInfo2.eventId;
            } else {
                l = null;
            }
            EventCard eventCard5 = liveEventMessage2.card;
            if (eventCard5 != null && (liveEventInfo = eventCard5.event) != null) {
                l2 = liveEventInfo.eventId;
            } else {
                l2 = null;
            }
            if (o.LJ(l, l2)) {
                C17390mF c17390mF4 = longSparseArray2.get(j);
                if (c17390mF4 != null) {
                    liveEventMessage3 = c17390mF4.LIZIZ;
                }
                if (!LIZJ(liveEventMessage3, liveEventMessage2)) {
                    longSparseArray2.remove(j);
                    return;
                }
            }
            if (LIZ(j) == null) {
                LJLJJLL.put(j, c17390mF);
                Integer num = LJLJJI.get(j);
                if (num == null || num.intValue() != 0 || (copyOnWriteArrayList2 = LJLJJL.get(j)) == null) {
                    return;
                }
                Iterator<InterfaceC17380mE> it = copyOnWriteArrayList2.iterator();
                while (it.hasNext()) {
                    it.next().LIZIZ(c17390mF);
                }
                return;
            }
            C17390mF LIZ2 = LIZ(j);
            if (LIZ2 == null || o.LJ(LIZ2, c17390mF) || LIZJ(LIZ2.LIZIZ, liveEventMessage2)) {
                return;
            }
            LiveEventMessage liveEventMessage6 = LIZ2.LIZIZ;
            long j3 = 0;
            if (liveEventMessage6 != null && (eventCard = liveEventMessage6.card) != null) {
                j2 = eventCard.cardStartTime;
            } else {
                j2 = 0;
            }
            EventCard eventCard6 = liveEventMessage2.card;
            if (eventCard6 != null) {
                j3 = eventCard6.cardStartTime;
            }
            if (j2 >= j3) {
                return;
            }
            LJLJJLL.put(j, c17390mF);
            Integer num2 = LJLJJI.get(j);
            if (num2 == null || num2.intValue() != 0 || (copyOnWriteArrayList = LJLJJL.get(j)) == null) {
                return;
            }
            Iterator<InterfaceC17380mE> it2 = copyOnWriteArrayList.iterator();
            while (it2.hasNext()) {
                it2.next().LIZ(c17390mF);
            }
        }
    }

    public static boolean LIZJ(LiveEventMessage liveEventMessage, LiveEventMessage liveEventMessage2) {
        long j;
        CommonMessageData commonMessageData;
        long j2 = 0;
        if (liveEventMessage != null && (commonMessageData = liveEventMessage.baseMessage) != null) {
            j = commonMessageData.createTime;
        } else {
            j = 0;
        }
        CommonMessageData commonMessageData2 = liveEventMessage2.baseMessage;
        if (commonMessageData2 != null) {
            j2 = commonMessageData2.createTime;
        }
        if (j >= j2) {
            return true;
        }
        return false;
    }

    public static void LIZLLL(long j, C17390mF c17390mF) {
        LJLJJLL.remove(j);
        CopyOnWriteArrayList<InterfaceC17380mE> copyOnWriteArrayList = LJLJJL.get(j);
        if (copyOnWriteArrayList != null) {
            Iterator<InterfaceC17380mE> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                it.next().LIZJ(c17390mF);
            }
        }
    }

    public static void LJ(long j, boolean z) {
        C17390mF LIZ = LIZ(j);
        if (LIZ != null) {
            C17390mF LIZ2 = C17390mF.LIZ(LIZ, null, z, null, 11);
            CopyOnWriteArrayList<InterfaceC17380mE> copyOnWriteArrayList = LJLJJL.get(j);
            if (copyOnWriteArrayList != null) {
                Iterator<InterfaceC17380mE> it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    it.next().LIZLLL(LIZ2);
                }
            }
        }
    }

    public static void LJFF(int i, long j) {
        int intValue;
        LongSparseArray<Integer> longSparseArray = LJLJJI;
        Integer num = longSparseArray.get(j);
        if (num == null) {
            intValue = 1;
        } else {
            intValue = num.intValue();
        }
        longSparseArray.put(j, Integer.valueOf((~i) & intValue));
        Integer num2 = longSparseArray.get(j);
        if (num2 == null || num2.intValue() != 0) {
            return;
        }
        LJ(j, true);
    }

    public static void LJI(int i, long j) {
        int intValue;
        LongSparseArray<Integer> longSparseArray = LJLJJI;
        Integer num = longSparseArray.get(j);
        if (num == null) {
            intValue = 1;
        } else {
            intValue = num.intValue();
        }
        longSparseArray.put(j, Integer.valueOf(i | intValue));
        LJ(j, false);
    }
}
