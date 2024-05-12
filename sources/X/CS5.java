package X;

import Y.ARunnableS2S0100200_5;
import Y.AfS57S0100000_5;
import android.os.Handler;
import android.util.LongSparseArray;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.pin.api.PinApi;
import com.bytedance.android.live.usermanage.IUserManageService;
import com.bytedance.android.livesdk.dataChannel.RoomUserChannel;
import com.bytedance.android.livesdk.model.message.ChatMessage;
import com.bytedance.android.livesdk.model.message.GiftMessage;
import com.bytedance.android.livesdk.model.message.LikeMessage;
import com.bytedance.android.livesdk.model.message.MemberMessage;
import com.bytedance.android.livesdk.model.message.PinMessage;
import com.bytedance.android.livesdk.model.message.SocialMessage;
import com.bytedance.android.livesdkapi.depend.model.live.PinInfo;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class CS5 {
    public static final CS5 LIZ = new CS5();
    public static final LongSparseArray<DataChannel> LIZIZ = new LongSparseArray<>();
    public static final LongSparseArray<Integer> LIZJ = new LongSparseArray<>();
    public static final LongSparseArray<CS6> LIZLLL = new LongSparseArray<>();
    public static final LongSparseArray<PinMessage> LJ = new LongSparseArray<>();
    public static final LongSparseArray<CS6> LJFF = new LongSparseArray<>();
    public static final LongSparseArray<List<CSY>> LJI = new LongSparseArray<>();
    public static final LongSparseArray<List<InterfaceC92693kP>> LJII = new LongSparseArray<>();
    public static final LongSparseArray<OnMessageListener> LJIIIIZZ = new LongSparseArray<>();
    public static final Handler LJIIIZ = new Handler(C16880lQ.LLJJJJ());
    public static final C62822Ol8 LJIIJ = C221108m2.LIZIZ(C65382PlK.LJLIL);

    public static CS6 LIZIZ(long j) {
        return LIZLLL.get(j);
    }

    public static boolean LIZJ(Room room) {
        o.LJIIIZ(room, "room");
        PinInfo pinInfo = room.getPinInfo();
        if (pinInfo == null || !pinInfo.pinEnabled || room.isThirdParty || room.isScreenshot || C29137Bc5.LIZIZ(room)) {
            return false;
        }
        return true;
    }

    public static User LIZLLL(CR6 cr6) {
        String str;
        LikeMessage likeMessage;
        GiftMessage giftMessage;
        MemberMessage memberMessage;
        SocialMessage socialMessage;
        ChatMessage chatMessage;
        EnumC31509CYf messageType;
        if (cr6 != null && (messageType = cr6.getMessageType()) != null) {
            str = messageType.getWsMethod();
        } else {
            str = null;
        }
        if (o.LJ(str, EnumC31509CYf.CHAT.getWsMethod())) {
            if (!(cr6 instanceof ChatMessage) || (chatMessage = (ChatMessage) cr6) == null) {
                return null;
            }
            return chatMessage.userInfo;
        }
        if (o.LJ(str, EnumC31509CYf.SOCIAL.getWsMethod())) {
            if (!(cr6 instanceof SocialMessage) || (socialMessage = (SocialMessage) cr6) == null) {
                return null;
            }
            return socialMessage.user;
        }
        if (o.LJ(str, EnumC31509CYf.MEMBER.getWsMethod())) {
            if (!(cr6 instanceof MemberMessage) || (memberMessage = (MemberMessage) cr6) == null) {
                return null;
            }
            return memberMessage.user;
        }
        if (o.LJ(str, EnumC31509CYf.GIFT.getWsMethod())) {
            if (!(cr6 instanceof GiftMessage) || (giftMessage = (GiftMessage) cr6) == null) {
                return null;
            }
            return giftMessage.fromUser;
        }
        if (!o.LJ(str, EnumC31509CYf.LIKE.getWsMethod()) || !(cr6 instanceof LikeMessage) || (likeMessage = (LikeMessage) cr6) == null) {
            return null;
        }
        return likeMessage.user;
    }

    public static void LJI(CS6 cs6) {
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("on pinned + ");
        LIZ2.append(cs6);
        C0NB.LIZLLL(X1D.LIZIZ(LIZ2));
        List<CSY> list = LJI.get(cs6.LIZ);
        if (list != null) {
            Iterator<CSY> it = list.iterator();
            while (it.hasNext()) {
                it.next().CL(cs6);
            }
        }
    }

    public static void LJIIIIZZ(CS6 cs6) {
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("count down + ");
        LIZ2.append(cs6);
        C0NB.LIZLLL(X1D.LIZIZ(LIZ2));
        List<CSY> list = LJI.get(cs6.LIZ);
        if (list != null) {
            Iterator<CSY> it = list.iterator();
            while (it.hasNext()) {
                it.next().yU(cs6);
            }
        }
    }

    public static void LJIIIZ(CS6 cs6) {
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("on unpin + ");
        LIZ2.append(cs6);
        C0NB.LIZLLL(X1D.LIZIZ(LIZ2));
        List<CSY> list = LJI.get(cs6.LIZ);
        if (list != null) {
            Iterator<CSY> it = list.iterator();
            while (it.hasNext()) {
                it.next().lL(cs6);
            }
        }
    }

    public static void LJIIJ(long j) {
        List<CSY> list = LJI.get(j);
        if (list != null) {
            for (CSY csy : list) {
                LIZ.getClass();
                CS6 LIZIZ2 = LIZIZ(j);
                if (LIZIZ2 != null) {
                    boolean z = LIZIZ2.LJ;
                    boolean LJIILLIIL = LJIILLIIL(j, LIZIZ2.LJI);
                    LIZIZ2.LJ = LJIILLIIL;
                    if (z != LJIILLIIL) {
                        csy.iB(LIZIZ2);
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append("permission changed + ");
                        LIZ2.append(LIZIZ2);
                        C0NB.LIZLLL(X1D.LIZIZ(LIZ2));
                    }
                }
            }
        }
    }

    public static void LJIIJJI(CS6 cs6) {
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("pin failed + ");
        LIZ2.append(cs6);
        C0NB.LIZLLL(X1D.LIZIZ(LIZ2));
        List<CSY> list = LJI.get(cs6.LIZ);
        if (list != null) {
            Iterator<CSY> it = list.iterator();
            while (it.hasNext()) {
                it.next().u30(cs6);
            }
        }
    }

    public static void LJIIL(CS6 cs6) {
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("under review + ");
        LIZ2.append(cs6);
        C0NB.LIZLLL(X1D.LIZIZ(LIZ2));
        List<CSY> list = LJI.get(cs6.LIZ);
        if (list != null) {
            Iterator<CSY> it = list.iterator();
            while (it.hasNext()) {
                it.next().UO(cs6);
            }
        }
    }

    public static boolean LJFF(CS6 cs6, CSN csn) {
        if (o.LJ(LIZIZ(cs6.LIZ), cs6)) {
            LJIIIZ.removeCallbacksAndMessages(cs6);
            LJII(cs6, csn, null);
            LIZLLL.remove(cs6.LIZ);
            return true;
        }
        return false;
    }

    public static void LJIILIIL(int i, long j) {
        int intValue;
        LongSparseArray<Integer> longSparseArray = LIZJ;
        Integer num = longSparseArray.get(j);
        if (num == null) {
            intValue = 1;
        } else {
            intValue = num.intValue();
        }
        longSparseArray.put(j, Integer.valueOf((~i) & intValue));
    }

    public static boolean LJIILLIIL(long j, PinMessage pinMessage) {
        DataChannel dataChannel;
        Long l;
        if (pinMessage == null || (dataChannel = LIZIZ.get(j)) == null) {
            return false;
        }
        if (!C29306Beo.LJIIJ(dataChannel)) {
            LIZ.getClass();
            if (!((IUserManageService) CN1.LIZ(IUserManageService.class)).qZ()) {
                if (dataChannel.kv0(RoomUserChannel.class) == null) {
                    return false;
                }
                User user = (User) dataChannel.kv0(RoomUserChannel.class);
                Long l2 = null;
                if (user != null) {
                    l = Long.valueOf(user.getId());
                } else {
                    l = null;
                }
                User user2 = pinMessage.operator;
                if (user2 != null) {
                    l2 = Long.valueOf(user2.getId());
                }
                if (!o.LJ(l, l2)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void LJIIZILJ(long j, PinMessage pinMessage) {
        CS6 LIZIZ2;
        PinMessage pinMessage2;
        long j2;
        if (pinMessage != null && (LIZIZ2 = LIZIZ(j)) != null && (pinMessage2 = LIZIZ2.LJI) != null && pinMessage2.pinId == pinMessage.pinId) {
            LIZ.getClass();
            LJIIIZ(LIZIZ2);
            C65814PsI.LIZ().getClass();
            PinApi pinApi = (PinApi) C65814PsI.LIZJ(PinApi.class);
            CR6 LIZ2 = CS8.LIZ(pinMessage);
            if (LIZ2 != null) {
                j2 = LIZ2.getMessageId();
            } else {
                j2 = 0;
            }
            long messageId = pinMessage.getMessageId();
            String str = pinMessage.method;
            if (str == null) {
                str = "";
            }
            C1EW.LIZ(pinApi.unpin(j, j2, messageId, str)).LJJJLIIL(new AfS57S0100000_5(LIZIZ2, 359), new AfS57S0100000_5(LIZIZ2, 360));
        }
    }

    public static void LIZ(long j, long j2, CS6 cs6) {
        if (j2 > 0) {
            cs6.LJII = j2;
            LJIIIIZZ(cs6);
            C10640bM.LIZIZ(LJIIIZ, new ARunnableS2S0100200_5(j, j2, cs6, 4), cs6, j2 % 1000);
        } else {
            cs6.LJII = 0L;
            LJFF(cs6, CSN.TIME_OUT);
        }
    }

    public static void LJ(CS5 cs5, long j, CS6 cs6) {
        CR6 LIZ2;
        long j2;
        long j3;
        CommonMessageData commonMessageData;
        PinMessage pinMessage;
        PinMessage pinMessage2;
        cs5.getClass();
        cs6.LIZJ = false;
        cs6.LIZLLL = false;
        PinMessage pinMessage3 = cs6.LJI;
        if (pinMessage3 != null) {
            int i = pinMessage3.action;
            CR6 cr6 = null;
            if (i == 1) {
                long j4 = 0;
                if ((pinMessage3.displayDuration > 0 && C31012CFc.LIZIZ() - pinMessage3.pinTime > TimeUnit.SECONDS.toMillis(pinMessage3.displayDuration)) || CS7.LIZ(new C1E5(j)) != null || (LIZ2 = CS8.LIZ(pinMessage3)) == null) {
                    return;
                }
                CS5 cs52 = LIZ;
                cs52.getClass();
                CS6 LIZIZ2 = LIZIZ(j);
                if (LIZIZ2 != null && (pinMessage2 = LIZIZ2.LJI) != null && pinMessage3.pinId == pinMessage2.pinId) {
                    return;
                }
                long j5 = pinMessage3.pinTime;
                CS6 LIZIZ3 = LIZIZ(j);
                if (LIZIZ3 != null && (pinMessage = LIZIZ3.LJI) != null) {
                    j2 = pinMessage.pinTime;
                } else {
                    j2 = 0;
                }
                if (j5 <= j2) {
                    return;
                }
                long j6 = pinMessage3.pinTime;
                LongSparseArray<PinMessage> longSparseArray = LJ;
                PinMessage pinMessage4 = longSparseArray.get(j);
                if (pinMessage4 != null) {
                    j3 = pinMessage4.pinTime;
                } else {
                    j3 = 0;
                }
                if (j6 <= j3 && pinMessage3.pinId == longSparseArray.get(j).pinId) {
                    longSparseArray.remove(j);
                    return;
                }
                LongSparseArray<CS6> longSparseArray2 = LJFF;
                if (!o.LJ(cs6, longSparseArray2.get(j))) {
                    CSN csn = CSN.REPLACE;
                    CS6 cs62 = longSparseArray2.get(j);
                    if (cs62 != null) {
                        cs52.getClass();
                        LJII(cs62, csn, null);
                    }
                    longSparseArray2.remove(j);
                }
                CS6 LIZIZ4 = LIZIZ(j);
                if (LIZIZ4 != null) {
                    LJFF(LIZIZ4, CSN.REPLACE);
                }
                LIZLLL.put(j, cs6);
                Integer num = LIZJ.get(j);
                if (num == null || num.intValue() != 0) {
                    LJIILJJIL(j, 0, CSN.NULL);
                    return;
                }
                long j7 = pinMessage3.displayDuration;
                if (j7 < 0) {
                    j4 = -1;
                } else {
                    TimeUnit timeUnit = TimeUnit.SECONDS;
                    long millis = timeUnit.toMillis(j7) - (C31012CFc.LIZIZ() - pinMessage3.pinTime);
                    long millis2 = timeUnit.toMillis(pinMessage3.displayDuration);
                    if (millis >= 0) {
                        if (millis > millis2) {
                            j4 = millis2;
                        } else {
                            j4 = millis;
                        }
                    }
                }
                cs6.LIZIZ = pinMessage3.operator;
                cs6.LJ = LJIILLIIL(j, pinMessage3);
                CR6 cr62 = cs6.LJFF;
                if (cr62 != null && (commonMessageData = cr62.baseMessage) != null) {
                    commonMessageData.messageId = LIZ2.getMessageId();
                }
                cs6.LJII = j4;
                LJI(cs6);
                if (j4 == -1) {
                    return;
                }
                LIZ(j, j4, cs6);
                return;
            }
            if (i != 2) {
                return;
            }
            CS5 cs53 = LIZ;
            long j8 = cs6.LIZ;
            cs53.getClass();
            if (o.LJ(LIZIZ(j8), cs6)) {
                CS6 LIZIZ5 = LIZIZ(cs6.LIZ);
                if (LIZIZ5 != null) {
                    cr6 = LIZIZ5.LJFF;
                }
                cs6.LJFF = cr6;
            }
            if (LJFF(cs6, CSN.CANCEL)) {
                return;
            }
            LJ.put(j, pinMessage3);
        }
    }

    public static void LJII(CS6 cs6, CSN csn, Object obj) {
        cs6.getClass();
        o.LJIIIZ(csn, "<set-?>");
        cs6.LJIIIIZZ = csn;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("on unpinned + ");
        LIZ2.append(cs6);
        C0NB.LIZLLL(X1D.LIZIZ(LIZ2));
        List<CSY> list = LJI.get(cs6.LIZ);
        if (list != null) {
            Iterator<CSY> it = list.iterator();
            while (it.hasNext()) {
                it.next().Sm(cs6, obj);
            }
        }
    }

    public static void LJIILJJIL(long j, int i, CSN csn) {
        int intValue;
        LongSparseArray<Integer> longSparseArray = LIZJ;
        Integer num = longSparseArray.get(j);
        if (num == null) {
            intValue = 1;
        } else {
            intValue = num.intValue();
        }
        longSparseArray.put(j, Integer.valueOf(i | intValue));
        LJIJ(j, csn, null);
    }

    public static void LJIILL(long j, long j2, CS6 cs6) {
        if (j2 > 0) {
            cs6.LJII = j2;
            LJIIIIZZ(cs6);
            C10640bM.LIZIZ(LJIIIZ, new ARunnableS2S0100200_5(j, j2, cs6, 5), cs6, 1000L);
        } else {
            cs6.LJII = 0L;
            LJFF(cs6, CSN.TIME_OUT);
        }
    }

    public static OSZ LJIJ(long j, CSN reason, Object obj) {
        o.LJIIIZ(reason, "reason");
        LongSparseArray<CS6> longSparseArray = LJFF;
        CS6 cs6 = longSparseArray.get(j);
        CS6 cs62 = null;
        if (cs6 != null) {
            LIZ.getClass();
            LJII(cs6, reason, obj);
        } else {
            cs6 = null;
        }
        longSparseArray.remove(j);
        CS6 LIZIZ2 = LIZIZ(j);
        if (LIZIZ2 != null) {
            DataChannel dataChannel = LIZIZ.get(j);
            if (dataChannel != null && C29306Beo.LJIIJ(dataChannel)) {
                CS5 cs5 = LIZ;
                PinMessage pinMessage = LIZIZ2.LJI;
                cs5.getClass();
                LJIIZILJ(j, pinMessage);
            }
            LIZ.getClass();
            LJFF(LIZIZ2, reason);
            cs62 = LIZIZ2;
        }
        return new OSZ(cs6, cs62);
    }
}
