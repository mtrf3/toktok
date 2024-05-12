package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.ugc.aweme.notice.api.bean.NicknameStoreData;
import com.ss.android.ugc.aweme.notice.api.bean.NoticeCount;
import com.ss.android.ugc.aweme.notice.api.bean.NoticeList;
import com.ss.android.ugc.aweme.notice.api.bean.ProfileTabStoreData;
import com.ss.android.ugc.aweme.notification.redpoint.MultiUserNoticeApi;
import com.ss.android.ugc.aweme.notification.redpoint.MultiUserNoticeCountResponse;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.o;

/* renamed from: X.LSv, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54301LSv {
    public static C54301LSv LJ;
    public final HashMap<Long, Integer> LIZ = new HashMap<>();
    public int LIZIZ = -1;
    public int LIZJ = -1;
    public String LIZLLL = null;

    public static C54301LSv LIZJ() {
        if (LJ == null) {
            synchronized (C54301LSv.class) {
                if (LJ == null) {
                    LJ = new C54301LSv();
                }
            }
        }
        return LJ;
    }

    public final int LIZ(String str) {
        if (str.equals(this.LIZLLL)) {
            return this.LIZIZ;
        }
        C221018lt.LJFF("MultiUserManager", C16880lQ.LLLZ("currentID=%s, this.currentUID=%s", new Object[]{str, this.LIZLLL}));
        return -1;
    }

    public final int LIZIZ(String str) {
        if (str.equals(this.LIZLLL)) {
            return this.LIZJ;
        }
        C221018lt.LJFF("MultiUserManager", C16880lQ.LLLZ("currentID=%s, this.currentUID=%s", new Object[]{str, this.LIZLLL}));
        return -1;
    }

    public final void LIZLLL(final String str, List list) {
        if (AV1.LJIIJJI() || C79004UzY.LJJIFFI(list)) {
            return;
        }
        MultiUserNoticeApi.LIZ.getMultiUserNoticeCount(TextUtils.join(",", list), C35363DuJ.LIZ()).LJ(new C10I() { // from class: X.LSu
            /* JADX WARN: Type inference failed for: r2v10, types: [boolean] */
            /* JADX WARN: Type inference failed for: r2v11 */
            /* JADX WARN: Type inference failed for: r2v9 */
            @Override // X.C10I
            public final Object then(C10K c10k) {
                MultiUserNoticeCountResponse multiUserNoticeCountResponse;
                int i;
                char c;
                ?? r2;
                int i2;
                EnumC54302LSw enumC54302LSw;
                C54301LSv c54301LSv = C54301LSv.this;
                String str2 = str;
                c54301LSv.getClass();
                if (c10k == null || !c10k.LJIILIIL() || (multiUserNoticeCountResponse = (MultiUserNoticeCountResponse) c10k.LJIIJJI()) == null || C79004UzY.LJJIFFI(multiUserNoticeCountResponse.noticeLists)) {
                    return null;
                }
                if (!C54305LSz.LIZJ()) {
                    String logID = multiUserNoticeCountResponse.extra.logid;
                    o.LJIIIZ(logID, "logID");
                    long currentTimeMillis = System.currentTimeMillis();
                    AVR avr = AVO.LIZ;
                    if (avr == null) {
                        AVO.LIZIZ = new HashMap<>();
                        AVO.LIZ = new AVR(logID, currentTimeMillis);
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append("updateCurrentAccountUserDMTrackData, logID=");
                        LIZ.append(logID);
                        LIZ.append(", serverTime=");
                        LIZ.append(currentTimeMillis);
                        C221018lt.LJFF("AccountSwitchDMTrack", X1D.LIZIZ(LIZ));
                    } else {
                        avr.LIZ = logID;
                        avr.LIZIZ = currentTimeMillis;
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append("updateCurrentAccountUserDMTrackData, logID=");
                        LIZ2.append(logID);
                        LIZ2.append(", serverTime=");
                        LIZ2.append(currentTimeMillis);
                        C221018lt.LJFF("AccountSwitchDMTrack", X1D.LIZIZ(LIZ2));
                    }
                    c54301LSv.LIZ.clear();
                    c54301LSv.LIZIZ = 0;
                    c54301LSv.LIZJ = 0;
                    int i3 = 0;
                    for (NoticeList noticeList : multiUserNoticeCountResponse.noticeLists) {
                        if (noticeList.getItems() != null) {
                            i2 = 0;
                            for (NoticeCount noticeCount : noticeList.getItems()) {
                                Integer showType = noticeCount.getShowType();
                                if (!C53405Kxd.LIZLLL()) {
                                    if (showType == null || showType.intValue() >= EnumC54302LSw.values().length) {
                                        enumC54302LSw = EnumC54302LSw.ShowDefault;
                                    } else {
                                        enumC54302LSw = EnumC54302LSw.values()[showType.intValue()];
                                    }
                                    if (enumC54302LSw == EnumC54302LSw.ShowNum) {
                                        i2 += noticeCount.getCount();
                                    }
                                }
                            }
                        } else {
                            i2 = 0;
                        }
                        Locale locale = Locale.ENGLISH;
                        C221018lt.LJFF("MultiUserManager", C16880lQ.LLLZI(locale, "uid: %d, sumCount without dm: %d", new Object[]{noticeList.getUserId(), Integer.valueOf(i2)}));
                        int dmCount = (int) (noticeList.getDmCount() + i2);
                        C221018lt.LJFF("MultiUserManager", C16880lQ.LLLZI(locale, "uid: %d, sumCount with dm: %d", new Object[]{noticeList.getUserId(), Integer.valueOf(dmCount)}));
                        if (noticeList.getUserId() != null) {
                            c54301LSv.LIZ.put(noticeList.getUserId(), Integer.valueOf(dmCount));
                            String userID = noticeList.getUserId().toString();
                            long dmCount2 = noticeList.getDmCount();
                            o.LJIIIZ(userID, "userID");
                            HashMap<String, Long> hashMap = AVO.LIZIZ;
                            if (hashMap != null) {
                                hashMap.put(userID, Long.valueOf(dmCount2));
                                StringBuilder LIZ3 = X1D.LIZ();
                                LIZ3.append("updateCurrentAccountUserDMTrackData, userID=");
                                LIZ3.append(userID);
                                LIZ3.append(", dmUnreadCount=");
                                LIZ3.append(dmCount2);
                                C221018lt.LJFF("AccountSwitchDMTrack", X1D.LIZIZ(LIZ3));
                            }
                            if (CastLongProtector.parseLong(((RBX) HG3.LJIILL()).getCurUserId()) != noticeList.getUserId().longValue()) {
                                i3 += dmCount;
                            }
                            if (str2.equals("cold_start") && TextUtils.equals(((RBX) HG3.LJIILL()).getCurUserId(), noticeList.getUserId().toString())) {
                                LT7.LIZ.LIZ(noticeList);
                            }
                        }
                    }
                    c54301LSv.LIZIZ = i3;
                    Locale locale2 = Locale.ENGLISH;
                    C221018lt.LIZ("MultiUserManager", C16880lQ.LLLZI(locale2, "allOtherCount: %d", new Object[]{Integer.valueOf(i3)}));
                    int i4 = -1;
                    if (C54305LSz.LIZIZ()) {
                        int i5 = c54301LSv.LIZIZ;
                        NicknameStoreData LIZ4 = C54261LRh.LIZ();
                        if (LIZ4 == null) {
                            r2 = 0;
                            C54261LRh.LIZLLL(new NicknameStoreData(false, i5));
                        } else {
                            r2 = 0;
                            i4 = LIZ4.totalCount;
                            LIZ4.totalCount = i5;
                            C54261LRh.LIZLLL(LIZ4);
                        }
                        c54301LSv.LIZJ = i4;
                        if (i4 < c54301LSv.LIZIZ) {
                            C54261LRh.LJ(r2);
                        }
                        Object[] objArr = new Object[1];
                        objArr[r2] = Integer.valueOf(c54301LSv.LIZJ);
                        C221018lt.LJFF("MultiUserManager", C16880lQ.LLLZI(locale2, "lastAllOtherMultiUserNoticeCount: %d", objArr));
                    } else if (C54305LSz.LJ() || C54305LSz.LIZLLL()) {
                        int i6 = c54301LSv.LIZIZ;
                        ProfileTabStoreData LIZIZ = C54261LRh.LIZIZ();
                        if (LIZIZ == null) {
                            c = 0;
                            C54261LRh.LJFF(new ProfileTabStoreData(false, i6));
                        } else {
                            c = 0;
                            i4 = LIZIZ.totalCount;
                            LIZIZ.totalCount = i6;
                            C54261LRh.LJFF(LIZIZ);
                        }
                        c54301LSv.LIZJ = i4;
                        Object[] objArr2 = new Object[1];
                        objArr2[c] = Integer.valueOf(i4);
                        C221018lt.LJFF("MultiUserManager", C16880lQ.LLLZI(locale2, "lastAllOtherMultiUserNoticeCount: %d", objArr2));
                    }
                    c54301LSv.LIZLLL = ((RBX) HG3.LJIILL()).getCurUserId();
                    C2U8.LIZIZ(new AV5());
                    return null;
                }
                c54301LSv.LIZ.clear();
                for (NoticeList noticeList2 : multiUserNoticeCountResponse.noticeLists) {
                    if (noticeList2.getItems() != null) {
                        i = 0;
                        for (NoticeCount noticeCount2 : noticeList2.getItems()) {
                            int group = noticeCount2.getGroup();
                            if (!C53405Kxd.LIZLLL() && (group == 3 || group == 7 || group == 6 || group == 2 || group == 228)) {
                                i += noticeCount2.getCount();
                            }
                        }
                    } else {
                        i = 0;
                    }
                    if (noticeList2.getUserId() != null) {
                        c54301LSv.LIZ.put(noticeList2.getUserId(), Integer.valueOf(i));
                        if (str2.equals("cold_start") && TextUtils.equals(((RBX) HG3.LJIILL()).getCurUserId(), noticeList2.getUserId().toString())) {
                            LT7.LIZ.LIZ(noticeList2);
                        }
                    }
                }
                return null;
            }
        }, C10K.LJI, null);
    }
}
