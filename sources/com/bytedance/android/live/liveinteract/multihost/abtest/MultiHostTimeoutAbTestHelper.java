package com.bytedance.android.live.liveinteract.multihost.abtest;

import X.C75877TqD;
import X.InterfaceC65349Pkn;
import com.bytedance.android.livesdk.chatroom.model.interact.CohostABTest;
import com.bytedance.android.livesdk.chatroom.model.interact.CohostABTestList;
import com.bytedance.android.livesdk.chatroom.model.interact.CohostABTestSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MtCoHostInviteTimeOutSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MtCoHostReplyTimeOutSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.LiveCoHosTimeoutStrategy;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.LiveCoHosTimeoutStrategyGroup;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes11.dex */
public final class MultiHostTimeoutAbTestHelper {
    public static final long LIZ = MtCoHostInviteTimeOutSetting.INSTANCE.getValue();
    public static final long LIZIZ = MtCoHostReplyTimeOutSetting.INSTANCE.getValue();
    public static final boolean LIZJ;
    public static final int LIZLLL;
    public static final Map<String, Object> LJ;

    /* loaded from: classes11.dex */
    public static final class CoHostABInfoInRoom {

        @InterfaceC65349Pkn("live_cohost_timeout_strategy_group")
        public int cohostTimeoutStrategyGroup;
    }

    static {
        LiveCoHosTimeoutStrategyGroup liveCoHosTimeoutStrategyGroup = LiveCoHosTimeoutStrategyGroup.INSTANCE;
        LIZJ = liveCoHosTimeoutStrategyGroup.isDefaultGroup();
        LIZLLL = liveCoHosTimeoutStrategyGroup.getValue();
        LJ = LiveCoHosTimeoutStrategy.INSTANCE.getValue();
    }

    public static long LIZ(long j, List list) {
        CohostABTestList cohostABTestList;
        List<CohostABTest> list2;
        Double d;
        if (LIZJ || j == 0 || list == null || list.isEmpty()) {
            return LIZIZ;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            CohostABTestSetting cohostABTestSetting = (CohostABTestSetting) it.next();
            if (j == cohostABTestSetting.key && (cohostABTestList = cohostABTestSetting.value) != null && (list2 = cohostABTestList.abTestList) != null) {
                for (CohostABTest cohostABTest : list2) {
                    if (cohostABTest.abTestType == 1 && cohostABTest.group == LIZLLL) {
                        C75877TqD.LJIIZILJ.add(Long.valueOf(j));
                        Object obj = LJ.get("handler_timeout");
                        if ((obj instanceof Double) && (d = (Double) obj) != null) {
                            return (long) d.doubleValue();
                        }
                        return LIZIZ;
                    }
                }
            }
        }
        return LIZIZ;
    }

    public static long LIZIZ(long j, List list) {
        CohostABTestList cohostABTestList;
        List<CohostABTest> list2;
        Double d;
        if (LIZJ || j == 0 || list == null || list.isEmpty()) {
            return LIZIZ;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            CohostABTestSetting cohostABTestSetting = (CohostABTestSetting) it.next();
            if (j == cohostABTestSetting.key && (cohostABTestList = cohostABTestSetting.value) != null && (list2 = cohostABTestList.abTestList) != null) {
                for (CohostABTest cohostABTest : list2) {
                    if (cohostABTest.abTestType == 1 && cohostABTest.group == LIZLLL) {
                        C75877TqD.LJIIZILJ.add(Long.valueOf(j));
                        Object obj = LJ.get("invitee_timeout");
                        if ((obj instanceof Double) && (d = (Double) obj) != null) {
                            return (long) d.doubleValue();
                        }
                        return LIZIZ;
                    }
                }
            }
        }
        return LIZIZ;
    }
}
