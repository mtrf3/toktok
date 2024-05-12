package X;

import Y.ARunnableS49S0100000_13;
import android.os.Handler;
import android.os.SystemClock;
import com.bytedance.android.livesdk.chatroom.interact.model.LinkerInfo;
import com.bytedance.android.livesdk.chatroom.interact.model.MGetUserLinkmicStatusResponse;
import com.bytedance.android.livesdk.chatroom.interact.model.RivalExtraInfo;
import com.bytedance.android.livesdk.chatroom.interact.model.UserInfo;
import com.bytedance.android.livesdk.chatroom.model.interact.OptPairInfo;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveCoHostAutoRefreshEnableSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveCoHostRefreshIntervalSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveCoHostRefreshPeriodSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.LiveCoHostCrossRefreshFixSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.TsJ, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76007TsJ {
    public boolean LIZ;
    public MGetUserLinkmicStatusResponse.ResponseData LIZIZ;
    public int LIZLLL;
    public C73411SrX LJ;
    public final long LIZJ = SystemClock.uptimeMillis();
    public InterfaceC76008TsK LJFF = new C75985Trx();
    public final Handler LJI = new Handler(C16880lQ.LLJJJJ());

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v2, types: [X.Trt] */
    /* JADX WARN: Type inference failed for: r10v4 */
    public final void LIZIZ() {
        java.util.Map<Long, MGetUserLinkmicStatusResponse.LinkmicStatus> map;
        MGetUserLinkmicStatusResponse.ResponseData responseData;
        java.util.Map<Long, MGetUserLinkmicStatusResponse.LinkmicStatus> map2;
        OptPairInfo optPairInfo;
        java.util.Map<Long, Room> map3;
        Room room;
        if (!this.LIZ) {
            return;
        }
        MGetUserLinkmicStatusResponse.ResponseData responseData2 = this.LIZIZ;
        if (responseData2 == null || (map = responseData2.linkmicStatusMap) == null || !(!map.isEmpty()) || this.LJFF.LIZLLL() || (responseData = this.LIZIZ) == null || (map2 = responseData.linkmicStatusMap) == null) {
            return;
        }
        this.LIZ = false;
        CJ2 LIZIZ = this.LJFF.LIZIZ();
        int size = LIZIZ.size();
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        for (int i = 0; i < size; i++) {
            C76014TsQ c76014TsQ = LIZIZ.get(i);
            if (LiveCoHostCrossRefreshFixSetting.INSTANCE.isEnable() && (c76014TsQ instanceof C75981Trt)) {
                C75981Trt c75981Trt = (C75981Trt) c76014TsQ;
                long id = c75981Trt.LJLIL.getId();
                MGetUserLinkmicStatusResponse.ResponseData responseData3 = this.LIZIZ;
                if (responseData3 != null && (map3 = responseData3.roomInfo) != null && (room = map3.get(Long.valueOf(id))) != null && room.getLinkMicInfo() != null) {
                    c75981Trt.LJLIL.setLinkMicInfo(room.getLinkMicInfo());
                }
            }
            if ((c76014TsQ instanceof C76035Tsl) || (c76014TsQ instanceof C76033Tsj)) {
                if (c76014TsQ instanceof C75981Trt) {
                    c76014TsQ = (C75981Trt) c76014TsQ;
                } else {
                    c76014TsQ = 0;
                }
                MGetUserLinkmicStatusResponse.LinkmicStatus linkmicStatus = (MGetUserLinkmicStatusResponse.LinkmicStatus) C279417u.LIZ(c76014TsQ.LJLIL, map2);
                if (linkmicStatus != null) {
                    if (LIZ(c76014TsQ, linkmicStatus)) {
                        if (c76014TsQ.LJLJLLL) {
                            z = true;
                            z2 = true;
                        } else {
                            z = true;
                        }
                    }
                    RivalExtraInfo rivalExtraInfo = c76014TsQ.LJLJJI;
                    if (rivalExtraInfo != null) {
                        int i2 = linkmicStatus.blockReason;
                        rivalExtraInfo.detailBlockReason = linkmicStatus.detailBlockReason;
                        rivalExtraInfo.inviteBlockReason = i2;
                        rivalExtraInfo.showPlayType = linkmicStatus.playType;
                        rivalExtraInfo.linkerInfo = linkmicStatus.linkerInfo;
                        rivalExtraInfo.optPairInfo = linkmicStatus.optPairInfo;
                        rivalExtraInfo.reserveInfo = linkmicStatus.reserveInfo;
                    }
                    if (!z3 && C75893TqT.LIZ(c76014TsQ)) {
                        z3 = true;
                    }
                }
            }
            if (c76014TsQ instanceof C76014TsQ) {
                Iterator<Object> it = c76014TsQ.LJLIL.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if (next instanceof C75984Trw) {
                        C75981Trt c75981Trt2 = (C75981Trt) next;
                        MGetUserLinkmicStatusResponse.LinkmicStatus linkmicStatus2 = (MGetUserLinkmicStatusResponse.LinkmicStatus) C279417u.LIZ(c75981Trt2.LJLIL, map2);
                        if (linkmicStatus2 != null) {
                            if (LIZ((C75981Trt) next, linkmicStatus2)) {
                                z = true;
                            }
                            if (c75981Trt2.LJLJLLL) {
                                z2 = true;
                            }
                            RivalExtraInfo rivalExtraInfo2 = c75981Trt2.LJLJJI;
                            if (rivalExtraInfo2 != null) {
                                int i3 = linkmicStatus2.blockReason;
                                rivalExtraInfo2.detailBlockReason = linkmicStatus2.detailBlockReason;
                                rivalExtraInfo2.inviteBlockReason = i3;
                                rivalExtraInfo2.showPlayType = linkmicStatus2.playType;
                                rivalExtraInfo2.linkerInfo = linkmicStatus2.linkerInfo;
                                rivalExtraInfo2.optPairInfo = linkmicStatus2.optPairInfo;
                                rivalExtraInfo2.reserveInfo = linkmicStatus2.reserveInfo;
                            }
                        }
                    }
                }
            }
            if (c76014TsQ instanceof C76013TsP) {
                Iterator<Object> it2 = ((C76013TsP) c76014TsQ).LJLIL.iterator();
                while (it2.hasNext()) {
                    Object next2 = it2.next();
                    if (next2 instanceof C76032Tsi) {
                        C75981Trt c75981Trt3 = (C75981Trt) next2;
                        MGetUserLinkmicStatusResponse.LinkmicStatus linkmicStatus3 = (MGetUserLinkmicStatusResponse.LinkmicStatus) C279417u.LIZ(c75981Trt3.LJLIL, map2);
                        if (linkmicStatus3 != null) {
                            if (LIZ((C75981Trt) next2, linkmicStatus3)) {
                                z = true;
                            }
                            if (c75981Trt3.LJLJLLL) {
                                z2 = true;
                            }
                            RivalExtraInfo rivalExtraInfo3 = c75981Trt3.LJLJJI;
                            if (rivalExtraInfo3 != null) {
                                int i4 = linkmicStatus3.blockReason;
                                rivalExtraInfo3.detailBlockReason = linkmicStatus3.detailBlockReason;
                                rivalExtraInfo3.inviteBlockReason = i4;
                                rivalExtraInfo3.showPlayType = linkmicStatus3.playType;
                                rivalExtraInfo3.linkerInfo = linkmicStatus3.linkerInfo;
                                rivalExtraInfo3.reserveInfo = linkmicStatus3.reserveInfo;
                            }
                        }
                    }
                    if (next2 instanceof C76009TsL) {
                        C75981Trt c75981Trt4 = (C75981Trt) next2;
                        MGetUserLinkmicStatusResponse.LinkmicStatus linkmicStatus4 = (MGetUserLinkmicStatusResponse.LinkmicStatus) C279417u.LIZ(c75981Trt4.LJLIL, map2);
                        if (linkmicStatus4 != null && linkmicStatus4.optPairInfo != null && (optPairInfo = linkmicStatus4.optPairInfo) != null && optPairInfo.mappingId > 0) {
                            if (LIZ((C75981Trt) next2, linkmicStatus4)) {
                                z = true;
                            }
                            if (c75981Trt4.LJLJLLL) {
                                z2 = true;
                            }
                            RivalExtraInfo rivalExtraInfo4 = c75981Trt4.LJLJJI;
                            if (rivalExtraInfo4 != null) {
                                int i5 = linkmicStatus4.blockReason;
                                rivalExtraInfo4.detailBlockReason = linkmicStatus4.detailBlockReason;
                                rivalExtraInfo4.inviteBlockReason = i5;
                                rivalExtraInfo4.showPlayType = linkmicStatus4.playType;
                                rivalExtraInfo4.linkerInfo = linkmicStatus4.linkerInfo;
                                rivalExtraInfo4.optPairInfo = linkmicStatus4.optPairInfo;
                            }
                        }
                    }
                }
            }
        }
        this.LJFF.LIZ(LIZIZ, z, z2);
    }

    public final void LIZLLL() {
        this.LJI.removeCallbacksAndMessages(null);
        C73411SrX c73411SrX = this.LJ;
        if (c73411SrX != null) {
            c73411SrX.dispose();
        }
        this.LJ = null;
        this.LIZ = false;
        this.LIZIZ = null;
    }

    public final void LIZJ() {
        if (SystemClock.uptimeMillis() - this.LIZJ >= LiveCoHostRefreshPeriodSetting.INSTANCE.getValue() * 1000 || this.LIZLLL >= 3 || !LiveCoHostAutoRefreshEnableSetting.INSTANCE.getValue()) {
            return;
        }
        this.LJI.removeCallbacksAndMessages(null);
        this.LJI.postDelayed(new ARunnableS49S0100000_13(this, 193), LiveCoHostRefreshIntervalSetting.INSTANCE.getValue() * 1000);
    }

    public static boolean LIZ(C75981Trt c75981Trt, MGetUserLinkmicStatusResponse.LinkmicStatus linkmicStatus) {
        RivalExtraInfo rivalExtraInfo;
        LinkerInfo linkerInfo;
        ArrayList arrayList;
        List<UserInfo> list;
        LinkerInfo linkerInfo2;
        List<UserInfo> list2;
        RivalExtraInfo rivalExtraInfo2 = c75981Trt.LJLJJI;
        if (rivalExtraInfo2 == null || rivalExtraInfo2.inviteBlockReason != linkmicStatus.blockReason || !o.LJ(rivalExtraInfo2.reserveInfo, linkmicStatus.reserveInfo) || (rivalExtraInfo = c75981Trt.LJLJJI) == null || rivalExtraInfo.showPlayType != linkmicStatus.playType) {
            return true;
        }
        ArrayList arrayList2 = null;
        if (rivalExtraInfo != null) {
            linkerInfo = rivalExtraInfo.linkerInfo;
        } else {
            linkerInfo = null;
        }
        if (o.LJ(linkerInfo, linkmicStatus.linkerInfo)) {
            return false;
        }
        RivalExtraInfo rivalExtraInfo3 = c75981Trt.LJLJJI;
        if (rivalExtraInfo3 != null && (linkerInfo2 = rivalExtraInfo3.linkerInfo) != null && (list2 = linkerInfo2.linkedUsers) != null) {
            ArrayList arrayList3 = new ArrayList();
            for (UserInfo userInfo : list2) {
                if (userInfo.user_id != C44432HcC.LJI()) {
                    arrayList3.add(userInfo);
                }
            }
            arrayList = new ArrayList(C32I.LJJL(arrayList3, 10));
            Iterator it = arrayList3.iterator();
            while (it.hasNext()) {
                arrayList.add(Long.valueOf(((UserInfo) it.next()).user_id));
            }
        } else {
            arrayList = null;
        }
        LinkerInfo linkerInfo3 = linkmicStatus.linkerInfo;
        if (linkerInfo3 != null && (list = linkerInfo3.linkedUsers) != null) {
            ArrayList arrayList4 = new ArrayList();
            for (UserInfo userInfo2 : list) {
                if (userInfo2.user_id != C44432HcC.LJI()) {
                    arrayList4.add(userInfo2);
                }
            }
            arrayList2 = new ArrayList(C32I.LJJL(arrayList4, 10));
            Iterator it2 = arrayList4.iterator();
            while (it2.hasNext()) {
                arrayList2.add(Long.valueOf(((UserInfo) it2.next()).user_id));
            }
        }
        if (arrayList == null) {
            if (arrayList2 == null) {
                return false;
            }
        } else {
            if (arrayList2 == null || arrayList.size() != arrayList2.size()) {
                return true;
            }
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (!arrayList2.contains(ListProtector.get(arrayList, i))) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }
}
