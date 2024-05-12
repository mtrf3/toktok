package com.ss.android.ugc.aweme.notification.perf;

import X.C16880lQ;
import X.C47261Igj;
import X.C56681MMj;
import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.notice.repo.list.bean.InboxEntranceCell;
import com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeCombineResponse;
import com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeItems;
import com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeListsResponse;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class ActivitiesPerfCacheManager {
    public static C56681MMj LIZ;

    /* JADX WARN: Code restructure failed: missing block: B:25:0x004d, code lost:
    
        if (kotlin.jvm.internal.o.LJ(r5, r7) == false) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C56681MMj LIZ() {
        /*
            java.lang.Class<X.MMj> r8 = X.C56681MMj.class
            monitor-enter(r8)
            boolean r0 = X.L0H.LIZ()     // Catch: java.lang.Throwable -> L62
            r7 = 0
            if (r0 != 0) goto Lf
            com.ss.android.ugc.aweme.notification.perf.ActivitiesPerfCacheManager.LIZ = r7     // Catch: java.lang.Throwable -> L62
        Lc:
            X.MMj r0 = com.ss.android.ugc.aweme.notification.perf.ActivitiesPerfCacheManager.LIZ     // Catch: java.lang.Throwable -> L62
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
            com.ss.android.ugc.aweme.notification.perf.ActivitiesPerfCacheManager.LIZ = r7     // Catch: java.lang.Throwable -> L62
            goto Lc
        L37:
            X.MMj r0 = com.ss.android.ugc.aweme.notification.perf.ActivitiesPerfCacheManager.LIZ     // Catch: java.lang.Throwable -> L62
            if (r0 == 0) goto L5e
            java.lang.String r0 = r0.LIZ     // Catch: java.lang.Throwable -> L62
        L3d:
            boolean r0 = kotlin.jvm.internal.o.LJ(r6, r0)     // Catch: java.lang.Throwable -> L62
            if (r0 == 0) goto L4f
            X.MMj r0 = com.ss.android.ugc.aweme.notification.perf.ActivitiesPerfCacheManager.LIZ     // Catch: java.lang.Throwable -> L62
            if (r0 == 0) goto L49
            java.lang.String r7 = r0.LIZIZ     // Catch: java.lang.Throwable -> L62
        L49:
            boolean r0 = kotlin.jvm.internal.o.LJ(r5, r7)     // Catch: java.lang.Throwable -> L62
            if (r0 != 0) goto Lc
        L4f:
            java.lang.String r1 = "ActivitiesPerfCacheManager"
            java.lang.String r0 = "uid or language changed. created new DataHolder"
            X.C221018lt.LJFF(r1, r0)     // Catch: java.lang.Throwable -> L62
            X.MMj r0 = new X.MMj     // Catch: java.lang.Throwable -> L62
            r0.<init>(r6, r5)     // Catch: java.lang.Throwable -> L62
            com.ss.android.ugc.aweme.notification.perf.ActivitiesPerfCacheManager.LIZ = r0     // Catch: java.lang.Throwable -> L62
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
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.notification.perf.ActivitiesPerfCacheManager.LIZ():X.MMj");
    }

    public static JanusData LIZIZ() {
        JanusData janusData;
        C56681MMj LIZ2 = LIZ();
        if (LIZ2 != null) {
            synchronized (LIZ2) {
                janusData = LIZ2.LIZJ;
            }
            return janusData;
        }
        return null;
    }

    public static void LIZJ(List list) {
        Object obj;
        NoticeItems noticePreloadItem;
        C56681MMj LIZ2 = LIZ();
        if (LIZ2 != null) {
            synchronized (LIZ2) {
                if (list != null) {
                    Iterator it = list.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj = it.next();
                            if (((InboxEntranceCell) obj).isActivity()) {
                                break;
                            }
                        } else {
                            obj = null;
                            break;
                        }
                    }
                    InboxEntranceCell inboxEntranceCell = (InboxEntranceCell) obj;
                    if (inboxEntranceCell != null && (noticePreloadItem = inboxEntranceCell.getNoticePreloadItem()) != null) {
                        LIZ2.LIZJ(new NoticeListsResponse(C47261Igj.LJJIJ(noticePreloadItem), null, null, null, 14, null), false);
                    }
                }
            }
        }
    }

    /* loaded from: classes10.dex */
    public static final class JanusData {

        @InterfaceC65349Pkn("resp")
        public final NoticeCombineResponse resp;

        @InterfaceC65349Pkn("ts")
        public final long timestamp;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof JanusData)) {
                return false;
            }
            JanusData janusData = (JanusData) obj;
            return this.timestamp == janusData.timestamp && o.LJ(this.resp, janusData.resp);
        }

        public final int hashCode() {
            return this.resp.hashCode() + (C16880lQ.LLJIJIL(this.timestamp) * 31);
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("JanusData(timestamp=");
            LIZ.append(this.timestamp);
            LIZ.append(", resp=");
            LIZ.append(this.resp);
            LIZ.append(')');
            return X1D.LIZIZ(LIZ);
        }

        public JanusData(long j, NoticeCombineResponse resp) {
            o.LJIIIZ(resp, "resp");
            this.timestamp = j;
            this.resp = resp;
        }
    }

    /* loaded from: classes10.dex */
    public static final class NoticeData {

        @InterfaceC65349Pkn("resp")
        public final NoticeListsResponse resp;

        @InterfaceC65349Pkn("ts")
        public final long timestamp;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NoticeData)) {
                return false;
            }
            NoticeData noticeData = (NoticeData) obj;
            return this.timestamp == noticeData.timestamp && o.LJ(this.resp, noticeData.resp);
        }

        public final int hashCode() {
            return this.resp.hashCode() + (C16880lQ.LLJIJIL(this.timestamp) * 31);
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("NoticeData(timestamp=");
            LIZ.append(this.timestamp);
            LIZ.append(", resp=");
            LIZ.append(this.resp);
            LIZ.append(')');
            return X1D.LIZIZ(LIZ);
        }

        public NoticeData(long j, NoticeListsResponse resp) {
            o.LJIIIZ(resp, "resp");
            this.timestamp = j;
            this.resp = resp;
        }
    }
}
