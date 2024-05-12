package com.ss.android.ugc.aweme.notification.perf;

import X.C16880lQ;
import X.C221018lt;
import X.C53104Ksm;
import X.C56709MNl;
import X.C78685UuP;
import X.InterfaceC65349Pkn;
import X.ORZ;
import X.QD3;
import X.X1D;
import com.ss.android.ugc.aweme.notice.repo.list.bean.FollowNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.FollowPageData;
import com.ss.android.ugc.aweme.notice.repo.list.bean.FollowPageResponse;
import com.ss.android.ugc.aweme.notice.repo.list.bean.FollowRequestData;
import com.ss.android.ugc.aweme.notice.repo.list.bean.GeneralTemplateNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.InboxEntranceCell;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeItems;
import com.ss.android.ugc.aweme.notice.repo.list.uitemplate.NoticeUITemplate;
import com.ss.android.ugc.aweme.notice.repo.list.uitemplate.TitleTemplate;
import com.ss.android.ugc.aweme.profile.model.FollowStatusEvent;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes10.dex */
public final class FollowerPreCacheManager {
    public static C56709MNl LIZIZ;
    public static volatile boolean LIZLLL;
    public static final FollowerPreCacheManager LIZ = new FollowerPreCacheManager();
    public static volatile boolean LIZJ = C53104Ksm.LIZ();

    /* JADX WARN: Code restructure failed: missing block: B:25:0x004d, code lost:
    
        if (kotlin.jvm.internal.o.LJ(r5, r7) == false) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C56709MNl LIZIZ() {
        /*
            java.lang.Class<X.MNl> r8 = X.C56709MNl.class
            monitor-enter(r8)
            boolean r0 = X.C53104Ksm.LIZ()     // Catch: java.lang.Throwable -> L62
            r7 = 0
            if (r0 != 0) goto Lf
            com.ss.android.ugc.aweme.notification.perf.FollowerPreCacheManager.LIZIZ = r7     // Catch: java.lang.Throwable -> L62
        Lc:
            X.MNl r0 = com.ss.android.ugc.aweme.notification.perf.FollowerPreCacheManager.LIZIZ     // Catch: java.lang.Throwable -> L62
            goto L60
        Lf:
            com.ss.android.ugc.aweme.IAccountUserService r0 = X.HG3.LJIILL()     // Catch: java.lang.Throwable -> L62
            X.RBX r0 = (X.RBX) r0     // Catch: java.lang.Throwable -> L62
            java.lang.String r6 = r0.getCurUserId()     // Catch: java.lang.Throwable -> L62
            X.MNs r0 = X.C56716MNs.LIZIZ     // Catch: java.lang.Throwable -> L62
            java.lang.String r5 = r0.LIZ()     // Catch: java.lang.Throwable -> L62
            java.lang.String r0 = "uid"
            kotlin.jvm.internal.o.LJIIIIZZ(r6, r0)     // Catch: java.lang.Throwable -> L62
            java.lang.Long r0 = X.C38350F3i.LJJIZ(r6)     // Catch: java.lang.Throwable -> L62
            r3 = 0
            if (r0 == 0) goto L34
            long r1 = r0.longValue()     // Catch: java.lang.Throwable -> L62
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 > 0) goto L37
        L34:
            com.ss.android.ugc.aweme.notification.perf.FollowerPreCacheManager.LIZIZ = r7     // Catch: java.lang.Throwable -> L62
            goto Lc
        L37:
            X.MNl r0 = com.ss.android.ugc.aweme.notification.perf.FollowerPreCacheManager.LIZIZ     // Catch: java.lang.Throwable -> L62
            if (r0 == 0) goto L5e
            java.lang.String r0 = r0.LIZ     // Catch: java.lang.Throwable -> L62
        L3d:
            boolean r0 = kotlin.jvm.internal.o.LJ(r6, r0)     // Catch: java.lang.Throwable -> L62
            if (r0 == 0) goto L4f
            X.MNl r0 = com.ss.android.ugc.aweme.notification.perf.FollowerPreCacheManager.LIZIZ     // Catch: java.lang.Throwable -> L62
            if (r0 == 0) goto L49
            java.lang.String r7 = r0.LIZIZ     // Catch: java.lang.Throwable -> L62
        L49:
            boolean r0 = kotlin.jvm.internal.o.LJ(r5, r7)     // Catch: java.lang.Throwable -> L62
            if (r0 != 0) goto Lc
        L4f:
            java.lang.String r1 = "FollowerPCManger"
            java.lang.String r0 = "uid or language changed. created new CacheDataHelper"
            X.C221018lt.LJFF(r1, r0)     // Catch: java.lang.Throwable -> L62
            X.MNl r0 = new X.MNl     // Catch: java.lang.Throwable -> L62
            r0.<init>(r6, r5)     // Catch: java.lang.Throwable -> L62
            com.ss.android.ugc.aweme.notification.perf.FollowerPreCacheManager.LIZIZ = r0     // Catch: java.lang.Throwable -> L62
            goto Lc
        L5e:
            r0 = r7
            goto L3d
        L60:
            monitor-exit(r8)
            return r0
        L62:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.notification.perf.FollowerPreCacheManager.LIZIZ():X.MNl");
    }

    public static void LIZJ(List list) {
        Object obj;
        NoticeItems noticePreloadItem;
        User user;
        NoticeUITemplate noticeUITemplate;
        TitleTemplate titleTemplate;
        List<User> list2;
        User user2;
        C56709MNl LIZIZ2 = LIZIZ();
        if (LIZIZ2 != null) {
            synchronized (LIZIZ2) {
                if (list != null) {
                    Iterator it = list.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj = it.next();
                            if (((InboxEntranceCell) obj).isFollower()) {
                                break;
                            }
                        } else {
                            obj = null;
                            break;
                        }
                    }
                    InboxEntranceCell inboxEntranceCell = (InboxEntranceCell) obj;
                    if (inboxEntranceCell != null && (noticePreloadItem = inboxEntranceCell.getNoticePreloadItem()) != null) {
                        ArrayList arrayList = new ArrayList();
                        LIZIZ2.LIZLLL.clear();
                        List<MusNotice> items = noticePreloadItem.getItems();
                        if (items != null) {
                            for (MusNotice musNotice : items) {
                                GeneralTemplateNotice generalTemplateNotice = musNotice.templateNotice;
                                if (generalTemplateNotice != null && (noticeUITemplate = generalTemplateNotice.uiTemplate) != null && (titleTemplate = noticeUITemplate.titleTemplate) != null && (list2 = titleTemplate.fromUsers) != null && (user2 = (User) ORZ.LJLLLL(list2)) != null) {
                                    LIZIZ2.LIZLLL.add(user2);
                                } else {
                                    FollowNotice followNotice = musNotice.followNotice;
                                    if (followNotice != null && (user = followNotice.getUser()) != null) {
                                        LIZIZ2.LIZLLL.add(user);
                                    }
                                }
                                int i = musNotice.type;
                                if (i == 305) {
                                    FollowNotice followNotice2 = musNotice.followNotice;
                                    if (followNotice2 != null) {
                                        User user3 = followNotice2.getUser();
                                        o.LJIIIIZZ(user3, "follow.user");
                                        arrayList.add(new FollowPageData(musNotice.type, null, new FollowRequestData(user3, musNotice.createTime, musNotice.hasRead), musNotice.createTime, musNotice.lastReadTime));
                                    }
                                } else if (i != 0) {
                                    arrayList.add(new FollowPageData(i, musNotice, null, musNotice.createTime, musNotice.lastReadTime));
                                }
                            }
                        }
                        if (!arrayList.isEmpty()) {
                            long j = 0;
                            LIZIZ2.LIZJ = new FollowNoticeData(System.currentTimeMillis(), new FollowPageResponse(noticePreloadItem.getTotal(), noticePreloadItem.getHasMore(), j, noticePreloadItem.getMaxTime(), noticePreloadItem.getMinTime(), j, arrayList, 36, null));
                        }
                    }
                }
            }
        }
    }

    @QD3(threadMode = ThreadMode.BACKGROUND)
    public final void onFollowStatusChangeEvent(FollowStatusEvent event) {
        C56709MNl LIZIZ2;
        CopyOnWriteArrayList<User> copyOnWriteArrayList;
        o.LJIIIZ(event, "event");
        String str = event.status.userId;
        if (C78685UuP.LJJJZ(str) && (LIZIZ2 = LIZIZ()) != null && (copyOnWriteArrayList = LIZIZ2.LIZLLL) != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<User> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                User next = it.next();
                if (o.LJ(next.getUid(), str)) {
                    arrayList.add(next);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                User user = (User) it2.next();
                C221018lt.LJFF("FollowerPCManger", "user follow status change");
                user.setFollowStatus(event.status.followStatus);
            }
        }
    }

    /* loaded from: classes10.dex */
    public static final class FollowNoticeData {

        @InterfaceC65349Pkn("resp")
        public final FollowPageResponse resp;

        @InterfaceC65349Pkn("ts")
        public long timestamp;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FollowNoticeData)) {
                return false;
            }
            FollowNoticeData followNoticeData = (FollowNoticeData) obj;
            return this.timestamp == followNoticeData.timestamp && o.LJ(this.resp, followNoticeData.resp);
        }

        public final int hashCode() {
            return this.resp.hashCode() + (C16880lQ.LLJIJIL(this.timestamp) * 31);
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("FollowNoticeData(timestamp=");
            LIZ.append(this.timestamp);
            LIZ.append(", resp=");
            LIZ.append(this.resp);
            LIZ.append(')');
            return X1D.LIZIZ(LIZ);
        }

        public FollowNoticeData(long j, FollowPageResponse resp) {
            o.LJIIIZ(resp, "resp");
            this.timestamp = j;
            this.resp = resp;
        }
    }

    public static void LIZ(String str, String str2, int i) {
        FollowPageResponse followPageResponse;
        List<FollowPageData> data;
        String str3;
        boolean LJ;
        User user;
        String str4;
        String str5 = str2;
        String str6 = str;
        if ((i & 1) != 0) {
            str6 = null;
        }
        if ((i & 2) != 0) {
            str5 = null;
        }
        C56709MNl LIZIZ2 = LIZIZ();
        if (LIZIZ2 != null) {
            synchronized (LIZIZ2) {
                FollowNoticeData followNoticeData = LIZIZ2.LIZJ;
                if (followNoticeData != null && (followPageResponse = followNoticeData.resp) != null && (data = followPageResponse.getData()) != null) {
                    ArrayList arrayList = new ArrayList();
                    for (FollowPageData followPageData : data) {
                        FollowPageData followPageData2 = followPageData;
                        if (C78685UuP.LJJJZ(str6)) {
                            MusNotice notice = followPageData2.getNotice();
                            if (notice != null) {
                                str4 = notice.nid;
                            } else {
                                str4 = null;
                            }
                            LJ = o.LJ(str4, str6);
                        } else if (C78685UuP.LJJJZ(str5)) {
                            FollowRequestData followRequest = followPageData2.getFollowRequest();
                            if (followRequest != null && (user = followRequest.getUser()) != null) {
                                str3 = user.getUid();
                            } else {
                                str3 = null;
                            }
                            LJ = o.LJ(str3, str5);
                        } else {
                            arrayList.add(followPageData);
                        }
                        if (!LJ) {
                            arrayList.add(followPageData);
                        }
                    }
                    long j = 0;
                    LIZIZ2.LIZJ = new FollowNoticeData(System.currentTimeMillis(), new FollowPageResponse(followPageResponse.getTotal(), followPageResponse.getHasMore(), j, followPageResponse.getNoticeMaxTime(), followPageResponse.getNoticeMinTime(), j, arrayList, 36, null));
                }
            }
        }
    }
}
