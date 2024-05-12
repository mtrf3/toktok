package X;

import Y.ACallableS11S0000100_1;
import android.os.Message;
import android.text.TextUtils;
import android.util.SparseArray;
import com.bytedance.android.livesdk.livesetting.broadcast.LivePreviewNetworkSpeedThresholdSetting;
import com.bytedance.common.wschannel.model.WsChannelMsg;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.notice.api.bean.FollowTabInfoStruct;
import com.ss.android.ugc.aweme.notice.api.bean.NoticeCount;
import com.ss.android.ugc.aweme.notice.api.bean.NoticeCountExtra;
import com.ss.android.ugc.aweme.notice.api.bean.NoticeCountMessage;
import com.ss.android.ugc.aweme.notice.api.bean.NoticeGroupAttrs;
import com.ss.android.ugc.aweme.notice.api.bean.NoticeInboxFilterGroups;
import com.ss.android.ugc.aweme.notice.api.bean.NoticeList;
import com.ss.android.ugc.aweme.notice.api.services.INoticeCountService;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AqS106S0101000_6;
import kotlin.jvm.internal.AqS156S0200000_9;
import kotlin.jvm.internal.AqS39S0210000_9;
import kotlin.jvm.internal.AqS44S0001000_6;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class LVL implements INoticeCountService, InterfaceC54360LVc, InterfaceC67148QWy {
    public static final LVL LJLIL;
    public static long LJLILLLLZI;
    public static final C62822Ol8 LJLJI;
    public static final C62822Ol8 LJLJJI;
    public static final C62822Ol8 LJLJJL;
    public static final C62822Ol8 LJLJJLL;
    public static final C62822Ol8 LJLJL;
    public static final SparseArray<LVR> LJLJLJ;

    static {
        LVL lvl = new LVL();
        LJLIL = lvl;
        LJLJI = C221108m2.LIZIZ(C54250LQw.LJLIL);
        LJLJJI = C221108m2.LIZIZ(LVN.LJLIL);
        LJLJJL = C221108m2.LIZIZ(LVE.LJLIL);
        LJLJJLL = C221108m2.LIZIZ(ENP.LJLIL);
        LJLJL = C221108m2.LIZIZ(LVP.LJLIL);
        LJLJLJ = new SparseArray<>();
        LVT lvt = LVT.LIZIZ;
        ((HashSet) lvt.LIZ).add(new LVO());
        if (C35154Dqw.LIZ()) {
            C67128QWe.LIZIZ.LIZJ(1, 1, lvl);
        } else {
            C67125QWb.LJLL.LIZLLL(EnumC54358LVa.NOTICE, lvl);
        }
    }

    public static ConcurrentHashMap LJJI() {
        return (ConcurrentHashMap) LJLJJI.getValue();
    }

    public static ConcurrentHashMap LJJIII() {
        return (ConcurrentHashMap) LJLJJL.getValue();
    }

    public static ConcurrentHashMap LJJIIJ() {
        return (ConcurrentHashMap) LJLJJLL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeCountService
    public final java.util.Map<Integer, Integer> LJ() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ConcurrentHashMap LJJIII = LJJIII();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry : LJJIII.entrySet()) {
            if (((NoticeGroupAttrs) entry.getValue()).showType == EnumC54302LSw.ShowNum) {
                linkedHashMap2.put(entry.getKey(), entry.getValue());
            }
        }
        java.util.Set keySet = linkedHashMap2.keySet();
        if (keySet != null) {
            ArrayList arrayList = new ArrayList(C32I.LJJL(keySet, 10));
            Iterator it = keySet.iterator();
            while (it.hasNext()) {
                int intValue = ((Number) it.next()).intValue();
                LJLIL.getClass();
                Integer num = (Integer) LJJIIJ().get(Integer.valueOf(intValue));
                if (num == null) {
                    num = 0;
                }
                o.LJIIIIZZ(num, "noticeCountMap[it] ?: 0");
                int intValue2 = num.intValue();
                if (intValue2 > 0) {
                    linkedHashMap.put(Integer.valueOf(intValue), Integer.valueOf(intValue2));
                }
                arrayList.add(C76800UCe.LIZ);
            }
        }
        return linkedHashMap;
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeCountService
    public final void LJIILJJIL() {
        C221018lt.LJFF("NCManager", "clearNoticeCountAll");
        LJJIIJ().clear();
        LJJI().clear();
        LJLILLLLZI = 0L;
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeCountService
    public final int LJIJ() {
        C221018lt.LJFF("NCManager", "getAllOtherMultiUserNoticeCount");
        return C54301LSv.LIZJ().LIZ(HG3.LJIILL().getCurUserId());
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeCountService
    public final int LJIJI() {
        C221018lt.LJFF("NCManager", "getLastAllOtherMultiUserNoticeCount");
        return C54301LSv.LIZJ().LIZIZ(HG3.LJIILL().getCurUserId());
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeCountService
    public final int LIZLLL() {
        Integer num = (Integer) LJJIIJ().get(19999);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeCountService
    public final int LJFF() {
        Integer num = (Integer) LJJIIJ().get(29999);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeCountService
    public final AbstractC73672Svk LIZ(NoticeList noticeList) {
        return AbstractC73672Svk.LJIIJ(new ENN(noticeList));
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeCountService
    public final void LJI(Message message) {
        NoticeList noticeList;
        int i;
        Object obj = message.obj;
        if (!(obj instanceof NoticeList) || (noticeList = (NoticeList) obj) == null) {
            return;
        }
        if (message.what == 2) {
            i = 8;
        } else {
            i = 0;
        }
        MS5.LJI(new AqS106S0101000_6(noticeList, i, 2));
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeCountService
    public final NoticeGroupAttrs LJIIJ(int i) {
        return (NoticeGroupAttrs) LJJIII().get(Integer.valueOf(i));
    }

    @Override // X.InterfaceC54360LVc
    public final void LJIIL(LVZ lvz) {
        NoticeCountMessage noticeCountMessage;
        if (!(lvz instanceof NoticeCountMessage) || (noticeCountMessage = (NoticeCountMessage) lvz) == null) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("receive ");
        LIZ.append(noticeCountMessage.noticeGroup);
        LIZ.append(',');
        LIZ.append(noticeCountMessage.noticeCount);
        LIZ.append(" from web socket");
        C221018lt.LJFF("NCManager", X1D.LIZIZ(LIZ));
        LIZIZ(noticeCountMessage.noticeGroup, noticeCountMessage.noticeCount);
        LJIILLIIL(2, false);
        if (noticeCountMessage.noticeGroup == 100) {
            ((LVS) ServiceManager.get().getService(LVS.class)).LIZIZ();
        }
        LVR lvr = LJLJLJ.get(2);
        if (lvr != null) {
            lvr.LJIIJ(noticeCountMessage);
        }
        if (HG3.LJIIIIZZ().isEnableMultiAccountLogin() && ((RBX) HG3.LJIILL()).allUidList().size() > 1) {
            List<String> allUidList = ((RBX) HG3.LJIILL()).allUidList();
            o.LJIIIIZZ(allUidList, "userService().allUidList()");
            LJII("ws_message_triggered", allUidList);
        }
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeCountService
    public final int LJIILIIL(String uid) {
        Integer num;
        o.LJIIIZ(uid, "uid");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("getMultiUserNoticeCount ");
        LIZ.append(uid);
        C221018lt.LJFF("NCManager", X1D.LIZIZ(LIZ));
        C54301LSv LIZJ = C54301LSv.LIZJ();
        LIZJ.getClass();
        try {
            num = LIZJ.LIZ.get(Long.valueOf(CastLongProtector.parseLong(uid)));
        } catch (NumberFormatException unused) {
        }
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeCountService
    public final int LJIJJ(int i) {
        List list;
        NoticeInboxFilterGroups noticeInboxFilterGroups = (NoticeInboxFilterGroups) LJJI().get(Integer.valueOf(i));
        if (noticeInboxFilterGroups == null || (list = noticeInboxFilterGroups.groups) == null) {
            list = C61878OQg.INSTANCE;
        }
        Iterator it = list.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            int intValue = ((Number) it.next()).intValue();
            LJLIL.getClass();
            Integer num = (Integer) LJJIIJ().get(Integer.valueOf(intValue));
            if (num == null) {
                num = 0;
            }
            o.LJIIIIZZ(num, "noticeCountMap[it] ?: 0");
            i2 += num.intValue();
        }
        return i2;
    }

    @Override // X.InterfaceC67148QWy
    public final void LJIJJLI(WsChannelMsg msg) {
        o.LJIIIZ(msg, "msg");
        Object LIZ = LVT.LIZIZ.LIZ(msg);
        if (LIZ instanceof LVZ) {
            LJIIL((LVZ) LIZ);
        }
    }

    public static int LJJIFFI(int i, EnumC54302LSw enumC54302LSw) {
        NoticeGroupAttrs noticeGroupAttrs = (NoticeGroupAttrs) LJJIII().get(Integer.valueOf(i));
        if (noticeGroupAttrs != null && noticeGroupAttrs.isFromNotice) {
            int i2 = C54304LSy.LIZ[enumC54302LSw.ordinal()];
            if (i2 != 1) {
                if (i2 == 2) {
                    return 30001;
                }
            } else {
                return 30000;
            }
        }
        return -1;
    }

    public static int LJJII(int i, boolean z) {
        List<Integer> LJJIJ;
        NoticeInboxFilterGroups noticeInboxFilterGroups = (NoticeInboxFilterGroups) LJJI().get(Integer.valueOf(C87277YNd.LJIJJLI(i)));
        if (noticeInboxFilterGroups == null || (LJJIJ = noticeInboxFilterGroups.groups) == null || z) {
            LJJIJ = C47261Igj.LJJIJ(Integer.valueOf(i));
        }
        Iterator<Integer> it = LJJIJ.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            int intValue = it.next().intValue();
            LJLIL.getClass();
            Integer num = (Integer) LJJIIJ().get(Integer.valueOf(intValue));
            if (num == null) {
                num = 0;
            }
            o.LJIIIIZZ(num, "noticeCountMap[it] ?: 0");
            i2 += num.intValue();
        }
        return i2;
    }

    public static boolean LJJIIJZLJL(NoticeList noticeList, int i) {
        List<NoticeInboxFilterGroups> groups;
        List<NoticeCount> items;
        int i2;
        int ordinal;
        int ordinal2;
        int i3;
        int i4;
        FollowTabInfoStruct followTabInfoStruct;
        Integer num;
        C221018lt.LJFF("NCManager", "handleNoticeCountData");
        if (noticeList == null || (groups = noticeList.getGroups()) == null || (items = noticeList.getItems()) == null) {
            return false;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("handleNoticeCountData exec start thread=");
        LIZ.append(C16880lQ.LLLLIIIILLL());
        C221018lt.LJFF("NCManager", X1D.LIZIZ(LIZ));
        long currentTimeMillis = System.currentTimeMillis();
        for (NoticeInboxFilterGroups noticeInboxFilterGroups : groups) {
            noticeInboxFilterGroups.LIZ = C87277YNd.LJJIJLIJ(noticeInboxFilterGroups.filterType);
            LVA.LIZ(noticeInboxFilterGroups);
            if (((Boolean) DXQ.LIZIZ.getValue()).booleanValue()) {
                LJLIL.getClass();
                LJJI().put(Integer.valueOf(noticeInboxFilterGroups.filterType), noticeInboxFilterGroups);
            } else {
                LJLIL.getClass();
                LJJI().put(Integer.valueOf(noticeInboxFilterGroups.LIZ), noticeInboxFilterGroups);
            }
        }
        C221018lt.LJFF("NCManager", "handleNoticeCount");
        if (i != 2) {
            if (i != 8) {
                i2 = 100;
            } else {
                i2 = 301;
            }
        } else {
            i2 = 201;
        }
        C54262LRi c54262LRi = new C54262LRi(i2, 0);
        LJJIIJ().put(29999, 0);
        LJJIIJ().put(19999, 0);
        LJJIIJ().put(30000, 0);
        for (NoticeCount noticeCount : items) {
            LJLIL.getClass();
            NoticeCountExtra extra = noticeCount.getExtra();
            if (extra != null && (followTabInfoStruct = extra.followTabInfo) != null && (num = followTabInfoStruct.level) != null) {
                int intValue = num.intValue();
                int group = noticeCount.getGroup();
                C2U8.LIZ(new C36307EMt(group, intValue, followTabInfoStruct.followeeInfo));
                String str = followTabInfoStruct.prioritizedItemId;
                if (str != null) {
                    StringBuilder sb = new StringBuilder();
                    int length = str.length();
                    for (int i5 = 0; i5 < length; i5++) {
                        char charAt = str.charAt(i5);
                        if (group == 39) {
                            sb.append(charAt);
                        }
                    }
                    String sb2 = sb.toString();
                    o.LJIIIIZZ(sb2, "filterTo(StringBuilder(), predicate).toString()");
                    C2U8.LIZ(new LMP(sb2));
                }
            }
            LVG[] values = LVG.values();
            Integer clearOccasion = noticeCount.getClearOccasion();
            if (clearOccasion != null) {
                ordinal = clearOccasion.intValue();
            } else {
                ordinal = LVG.Normal.ordinal();
            }
            LVG lvg = values[ordinal];
            EnumC54302LSw[] values2 = EnumC54302LSw.values();
            Integer showType = noticeCount.getShowType();
            if (showType != null) {
                ordinal2 = showType.intValue();
            } else {
                ordinal2 = EnumC54302LSw.ShowDefault.ordinal();
            }
            EnumC54302LSw enumC54302LSw = values2[ordinal2];
            LJLIL.getClass();
            LJJIII().put(Integer.valueOf(noticeCount.getGroup()), new NoticeGroupAttrs(lvg, enumC54302LSw, noticeCount.getAliveDuration(), false, 8, null));
            int group2 = noticeCount.getGroup();
            int count = noticeCount.getCount();
            LJJIIJ().put(Integer.valueOf(group2), Integer.valueOf(count));
            if ((group2 != 214 && group2 != 210) || !C54311LTf.LJFF()) {
                int i6 = C54304LSy.LIZ[enumC54302LSw.ordinal()];
                if (i6 != 1) {
                    if (i6 == 2) {
                        i3 = 19999;
                    }
                } else {
                    i3 = 29999;
                }
                ConcurrentHashMap LJJIIJ = LJJIIJ();
                Integer valueOf = Integer.valueOf(i3);
                Integer num2 = (Integer) LJJIIJ().get(Integer.valueOf(i3));
                if (num2 != null) {
                    i4 = num2.intValue() + count;
                } else {
                    i4 = count;
                }
                LJJIIJ.put(valueOf, Integer.valueOf(i4));
                int LJJIFFI = LJJIFFI(group2, enumC54302LSw);
                if (LJJIFFI != -1) {
                    ConcurrentHashMap LJJIIJ2 = LJJIIJ();
                    Integer valueOf2 = Integer.valueOf(LJJIFFI);
                    Integer num3 = (Integer) LJJIIJ().get(Integer.valueOf(LJJIFFI));
                    if (num3 != null) {
                        count += num3.intValue();
                    }
                    LJJIIJ2.put(valueOf2, Integer.valueOf(count));
                }
            }
            if (noticeCount.getCount() > 0) {
                c54262LRi.LIZLLL(noticeCount.getGroup(), noticeCount.getCount());
            }
        }
        Integer num4 = (Integer) LJJIIJ().get(99);
        if (num4 == null) {
            num4 = -1;
        }
        int intValue2 = num4.intValue();
        if (intValue2 >= 0) {
            c54262LRi.LIZLLL(99, intValue2);
            ConcurrentHashMap LJJIIJ3 = LJJIIJ();
            Integer num5 = (Integer) LJJIIJ().get(29999);
            if (num5 != null) {
                intValue2 += num5.intValue();
            }
            LJJIIJ3.put(29999, Integer.valueOf(intValue2));
        }
        Integer num6 = (Integer) LJJIIJ().get(101);
        if (num6 == null) {
            num6 = -1;
        }
        int intValue3 = num6.intValue();
        if (intValue3 >= 0) {
            c54262LRi.LIZLLL(101, intValue3);
            ConcurrentHashMap LJJIIJ4 = LJJIIJ();
            Integer num7 = (Integer) LJJIIJ().get(19999);
            if (num7 != null) {
                intValue3 += num7.intValue();
            }
            LJJIIJ4.put(19999, Integer.valueOf(intValue3));
        }
        Integer num8 = (Integer) LJJIIJ().get(29999);
        if (num8 != null) {
            c54262LRi.LIZLLL(29999, num8.intValue());
        }
        Integer num9 = (Integer) LJJIIJ().get(19999);
        if (num9 != null) {
            c54262LRi.LIZLLL(19999, num9.intValue());
        }
        Integer num10 = (Integer) LJJIIJ().get(30000);
        if (num10 != null) {
            c54262LRi.LIZLLL(30000, num10.intValue());
        }
        c54262LRi.postSticky();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("handleNoticeCount end ");
        LIZ2.append(c54262LRi);
        C221018lt.LJFF("NCManager", X1D.LIZIZ(LIZ2));
        C10K.LIZJ(new ACallableS11S0000100_1(System.currentTimeMillis() - currentTimeMillis, 1));
        C221018lt.LJFF("NCManager", "handleNoticeCountData exec end");
        return true;
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeCountService
    public final void LIZIZ(int i, int i2) {
        int i3;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setNoticeCount ");
        LIZ.append(i);
        LIZ.append(' ');
        LIZ.append(i2);
        C221018lt.LJFF("NCManager", X1D.LIZIZ(LIZ));
        if (i2 < 0) {
            i2 = 0;
        }
        Integer num = (Integer) LJJIIJ().get(Integer.valueOf(i));
        if (num == null) {
            if (i2 == 0) {
                LJJIIJ().put(Integer.valueOf(i), Integer.valueOf(i2));
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("setNoticeCount ");
                LIZ2.append(i);
                LIZ2.append(" init break");
                C221018lt.LJFF("NCManager", X1D.LIZIZ(LIZ2));
                if (i != 99 && i != 101) {
                    i3 = 1;
                } else {
                    i3 = 3;
                }
                C54262LRi c54262LRi = new C54262LRi(i3);
                c54262LRi.LIZLLL(i, i2);
                c54262LRi.post();
                return;
            }
            num = 0;
        }
        if (num.intValue() == i2) {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("setNoticeCount ");
            LIZ3.append(i);
            LIZ3.append(" same break");
            C221018lt.LJFF("NCManager", X1D.LIZIZ(LIZ3));
            return;
        }
        MS5.LJI(new LS0(i, i2));
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeCountService
    public final int LIZJ(int i, EnumC54302LSw showType) {
        List list;
        EnumC54302LSw enumC54302LSw;
        o.LJIIIZ(showType, "showType");
        NoticeInboxFilterGroups noticeInboxFilterGroups = (NoticeInboxFilterGroups) LJJI().get(Integer.valueOf(i));
        if (noticeInboxFilterGroups == null || (list = noticeInboxFilterGroups.groups) == null) {
            list = C61878OQg.INSTANCE;
        }
        Iterator it = list.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            int intValue = ((Number) it.next()).intValue();
            LJLIL.getClass();
            NoticeGroupAttrs noticeGroupAttrs = (NoticeGroupAttrs) LJJIII().get(Integer.valueOf(intValue));
            if (noticeGroupAttrs != null) {
                enumC54302LSw = noticeGroupAttrs.showType;
            } else {
                enumC54302LSw = null;
            }
            if (enumC54302LSw == showType) {
                Integer num = (Integer) LJJIIJ().get(Integer.valueOf(intValue));
                if (num == null) {
                    num = 0;
                }
                o.LJIIIIZZ(num, "noticeCountMap[it] ?: 0");
                i2 += num.intValue();
            }
        }
        return i2;
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeCountService
    public final void LJII(String str, List list) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("fetchMultiUserNoticeCount ");
        LIZ.append(list);
        LIZ.append(' ');
        LIZ.append(str);
        C221018lt.LJFF("NCManager", X1D.LIZIZ(LIZ));
        C54301LSv.LIZJ().LIZLLL(str, list);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeCountService
    public final void LJIILLIIL(int i, boolean z) {
        C62822Ol8 c62822Ol8 = LJLJL;
        if (!((IAccountUserService) c62822Ol8.getValue()).isLogin() || TextUtils.isEmpty(((IAccountUserService) c62822Ol8.getValue()).getCurUserId()) || ((IAccountUserService) c62822Ol8.getValue()).isChildrenMode()) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (z && currentTimeMillis < LJLILLLLZI + LivePreviewNetworkSpeedThresholdSetting.DEFAULT) {
            return;
        }
        LJLILLLLZI = currentTimeMillis;
        C221018lt.LJFF("NCManager", "fetchNoticeCount");
        if (DXT.LIZ() && (i == 10 || i == 5 || i == 11)) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("tricky send im changed event source = ");
            LIZ.append(i);
            C221018lt.LJFF("NCManager", X1D.LIZIZ(LIZ));
            C54262LRi c54262LRi = new C54262LRi(3);
            Integer num = (Integer) LJJIIJ().get(99);
            if (num != null) {
                c54262LRi.LIZLLL(99, num.intValue());
                LJLIL.getClass();
                Integer num2 = (Integer) LJJIIJ().get(29999);
                if (num2 == null) {
                    num2 = 0;
                }
                o.LJIIIIZZ(num2, "noticeCountMap[NOTIFICAT…_SHOW_NUM_COUNT_SUM] ?: 0");
                c54262LRi.LIZLLL(29999, num2.intValue());
            }
            Integer num3 = (Integer) LJJIIJ().get(101);
            if (num3 != null) {
                c54262LRi.LIZLLL(101, num3.intValue());
                LJLIL.getClass();
                Integer num4 = (Integer) LJJIIJ().get(19999);
                if (num4 == null) {
                    num4 = 0;
                }
                o.LJIIIIZZ(num4, "noticeCountMap[NOTIFICAT…_SHOW_DOT_COUNT_SUM] ?: 0");
                c54262LRi.LIZLLL(19999, num4.intValue());
            }
            c54262LRi.postSticky();
        }
        MS5.LIZ(new AqS44S0001000_6(i, 0));
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeCountService
    public final int LJIIZILJ(boolean z, int[] groupTypeArray) {
        o.LJIIIZ(groupTypeArray, "groupTypeArray");
        int i = 0;
        for (int i2 : groupTypeArray) {
            LJLIL.getClass();
            i += LJJII(i2, z);
        }
        return i;
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeCountService
    public final void LJIL(LVG lvg, int[] iArr) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("clearNoticeCountByFilterType ");
        LIZ.append(iArr);
        LIZ.append(' ');
        LIZ.append(lvg);
        C221018lt.LJFF("NCManager", X1D.LIZIZ(LIZ));
        MS5.LJI(new AqS156S0200000_9(lvg, iArr, 55));
    }

    public static void LJJ(int i, LVG lvg, C54262LRi c54262LRi) {
        NoticeGroupAttrs noticeGroupAttrs;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("clearNoticeCountInner ");
        LIZ.append(i);
        LIZ.append(' ');
        LIZ.append(lvg);
        C221018lt.LJFF("NCManager", X1D.LIZIZ(LIZ));
        Integer num = (Integer) LJJIIJ().get(Integer.valueOf(i));
        if (num == null) {
            num = 0;
        }
        if (num.intValue() == 0) {
            return;
        }
        if (lvg != null && ((noticeGroupAttrs = (NoticeGroupAttrs) LJJIII().get(Integer.valueOf(i))) == null || noticeGroupAttrs.clearOccasion != lvg)) {
            return;
        }
        LJJIIZ(i, 0, c54262LRi);
        LJJIIJ().remove(Integer.valueOf(i));
        MLS.LIZ(i);
        c54262LRi.LIZLLL(i, 0);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("clearNoticeCountInner end ");
        LIZ2.append(c54262LRi);
        C221018lt.LJFF("NCManager", X1D.LIZIZ(LIZ2));
    }

    public static void LJJIIZ(int i, int i2, C54262LRi c54262LRi) {
        NoticeGroupAttrs noticeGroupAttrs;
        EnumC54302LSw enumC54302LSw;
        int i3;
        int i4;
        Integer num = (Integer) LJJIIJ().get(Integer.valueOf(i));
        if (num != null) {
            i2 -= num.intValue();
        }
        if (i2 == 0 || (noticeGroupAttrs = (NoticeGroupAttrs) LJJIII().get(Integer.valueOf(i))) == null || (enumC54302LSw = noticeGroupAttrs.showType) == null) {
            return;
        }
        if ((i == 214 || i == 210) && C54311LTf.LJFF()) {
            return;
        }
        int i5 = C54304LSy.LIZ[enumC54302LSw.ordinal()];
        if (i5 != 1) {
            if (i5 != 2) {
                return;
            } else {
                i3 = 19999;
            }
        } else {
            i3 = 29999;
        }
        Integer num2 = (Integer) LJJIIJ().get(Integer.valueOf(i3));
        if (num2 != null) {
            i4 = num2.intValue() + i2;
        } else {
            i4 = i2;
        }
        LJJIIJ().put(Integer.valueOf(i3), Integer.valueOf(i4));
        c54262LRi.LIZLLL(i3, i4);
        int LJJIFFI = LJJIFFI(i, enumC54302LSw);
        if (LJJIFFI == -1) {
            return;
        }
        Integer num3 = (Integer) LJJIIJ().get(Integer.valueOf(LJJIFFI));
        if (num3 != null) {
            i2 += num3.intValue();
        }
        LJJIIJ().put(Integer.valueOf(LJJIFFI), Integer.valueOf(i2));
        c54262LRi.LIZLLL(i3, i2);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeCountService
    public final int LJIIIIZZ(int i, EnumC54302LSw showType, boolean z) {
        List<Integer> LJJIJ;
        EnumC54302LSw enumC54302LSw;
        o.LJIIIZ(showType, "showType");
        NoticeInboxFilterGroups noticeInboxFilterGroups = (NoticeInboxFilterGroups) LJJI().get(Integer.valueOf(C87277YNd.LJIJJLI(i)));
        if (noticeInboxFilterGroups == null || (LJJIJ = noticeInboxFilterGroups.groups) == null || z) {
            LJJIJ = C47261Igj.LJJIJ(Integer.valueOf(i));
        }
        ArrayList arrayList = new ArrayList();
        for (Integer num : LJJIJ) {
            int intValue = num.intValue();
            LJLIL.getClass();
            NoticeGroupAttrs noticeGroupAttrs = (NoticeGroupAttrs) LJJIII().get(Integer.valueOf(intValue));
            if (noticeGroupAttrs != null) {
                enumC54302LSw = noticeGroupAttrs.showType;
            } else {
                enumC54302LSw = null;
            }
            if (enumC54302LSw == showType) {
                arrayList.add(num);
            }
        }
        Iterator it = arrayList.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            int intValue2 = ((Number) it.next()).intValue();
            LJLIL.getClass();
            Integer num2 = (Integer) LJJIIJ().get(Integer.valueOf(intValue2));
            if (num2 == null) {
                num2 = 0;
            }
            o.LJIIIIZZ(num2, "noticeCountMap[it] ?: 0");
            i2 += num2.intValue();
        }
        return i2;
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeCountService
    public final void LJIIIZ(int i, LVG lvg, boolean z) {
        List<Integer> LJJIJ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("clearNoticeCountSynchronously ");
        LIZ.append(i);
        LIZ.append(' ');
        LIZ.append(lvg);
        LIZ.append(' ');
        LIZ.append(z);
        C221018lt.LJFF("NCManager", X1D.LIZIZ(LIZ));
        NoticeInboxFilterGroups noticeInboxFilterGroups = (NoticeInboxFilterGroups) LJJI().get(Integer.valueOf(C87277YNd.LJIJJLI(i)));
        if (noticeInboxFilterGroups == null || (LJJIJ = noticeInboxFilterGroups.groups) == null || z) {
            LJJIJ = C47261Igj.LJJIJ(Integer.valueOf(i));
        }
        C54262LRi c54262LRi = new C54262LRi(1);
        Iterator<Integer> it = LJJIJ.iterator();
        while (it.hasNext()) {
            int intValue = it.next().intValue();
            LJLIL.getClass();
            LJJ(intValue, lvg, c54262LRi);
        }
        c54262LRi.post();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("clearNoticeCountSynchronously end ");
        LIZ2.append(c54262LRi);
        C221018lt.LJFF("NCManager", X1D.LIZIZ(LIZ2));
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeCountService
    public final void LJIIJJI(LVG lvg, boolean z, int[] iArr) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("clearNoticeCount ");
        LIZ.append(iArr);
        LIZ.append(' ');
        LIZ.append(lvg);
        LIZ.append(' ');
        LIZ.append(z);
        C221018lt.LJFF("NCManager", X1D.LIZIZ(LIZ));
        MS5.LJI(new AqS39S0210000_9(lvg, z, iArr, 0));
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0064, code lost:
    
        if (r1 != false) goto L22;
     */
    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeCountService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJIILL(X.LVG r12, boolean r13, int[] r14) {
        /*
            r11 = this;
            int r5 = r14.length
            r10 = 0
            r4 = 0
        L3:
            if (r4 >= r5) goto Lc4
            r9 = r14[r4]
            X.LVL r0 = X.LVL.LJLIL
            r0.getClass()
            r8 = 1
            if (r13 != 0) goto L66
            java.util.concurrent.ConcurrentHashMap r1 = LJJI()
            int r0 = X.C87277YNd.LJIJJLI(r9)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object r0 = r1.get(r0)
            com.ss.android.ugc.aweme.notice.api.bean.NoticeInboxFilterGroups r0 = (com.ss.android.ugc.aweme.notice.api.bean.NoticeInboxFilterGroups) r0
            if (r0 == 0) goto L66
            java.util.List<java.lang.Integer> r1 = r0.groups
            if (r1 == 0) goto L66
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r7 = r1.iterator()
        L30:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L60
            java.lang.Object r6 = r7.next()
            r1 = r6
            java.lang.Number r1 = (java.lang.Number) r1
            int r3 = r1.intValue()
            if (r12 == 0) goto L5c
            X.LVL r1 = X.LVL.LJLIL
            r1.getClass()
            java.util.concurrent.ConcurrentHashMap r2 = LJJIII()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            java.lang.Object r1 = r2.get(r1)
            com.ss.android.ugc.aweme.notice.api.bean.NoticeGroupAttrs r1 = (com.ss.android.ugc.aweme.notice.api.bean.NoticeGroupAttrs) r1
            if (r1 == 0) goto L30
            X.LVG r1 = r1.clearOccasion
            if (r12 != r1) goto L30
        L5c:
            r0.add(r6)
            goto L30
        L60:
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L84
        L66:
            if (r12 == 0) goto L7c
            java.util.concurrent.ConcurrentHashMap r1 = LJJIII()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r9)
            java.lang.Object r0 = r1.get(r0)
            com.ss.android.ugc.aweme.notice.api.bean.NoticeGroupAttrs r0 = (com.ss.android.ugc.aweme.notice.api.bean.NoticeGroupAttrs) r0
            if (r0 == 0) goto Lbd
            X.LVG r0 = r0.clearOccasion
            if (r12 != r0) goto Lbd
        L7c:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r9)
            java.util.List r0 = X.C47261Igj.LJJIJ(r0)
        L84:
            java.util.Iterator r3 = r0.iterator()
        L88:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto Lc0
            java.lang.Object r0 = r3.next()
            java.lang.Number r0 = (java.lang.Number) r0
            int r2 = r0.intValue()
            X.LVL r0 = X.LVL.LJLIL
            r0.getClass()
            java.util.concurrent.ConcurrentHashMap r1 = LJJIIJ()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            java.lang.Object r1 = r1.get(r0)
            java.lang.Integer r1 = (java.lang.Integer) r1
            if (r1 != 0) goto Lb1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r10)
        Lb1:
            java.lang.String r0 = "noticeCountMap[type] ?: 0"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            int r0 = r1.intValue()
            if (r0 <= 0) goto L88
            return r8
        Lbd:
            X.OQg r0 = X.C61878OQg.INSTANCE
            goto L84
        Lc0:
            int r4 = r4 + 1
            goto L3
        Lc4:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LVL.LJIILL(X.LVG, boolean, int[]):boolean");
    }
}
