package com.ss.android.ugc.aweme.notification.perf;

import X.C16880lQ;
import X.C1DH;
import X.C221108m2;
import X.C38350F3i;
import X.C55895Lwh;
import X.C62822Ol8;
import X.EnumC55898Lwk;
import X.HG3;
import X.INB;
import X.InterfaceC65349Pkn;
import X.InterfaceC65784Pro;
import X.JBR;
import X.L0U;
import X.M4Q;
import X.M4S;
import X.RBX;
import X.X1D;
import com.bytedance.android.livesdk.livesetting.performance.LivePlayEnforceIntervalSetting;
import com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeCombineResponse;
import com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeListsResponse;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class NoticePerfManager {
    public static final NoticePerfManager LIZ = new NoticePerfManager();
    public static WeakReference<Object> LIZIZ;
    public static volatile M4Q LIZJ;
    public static M4S LIZLLL;

    /* loaded from: classes10.dex */
    public static final class OptimizationStrategy {
        public static final MetaData LIZ;
        public static final C62822Ol8 LIZIZ = C221108m2.LIZIZ(C55895Lwh.LJLIL);

        /* loaded from: classes10.dex */
        public static final class MetaData {

            @InterfaceC65349Pkn("boot_lazy_preload_delay")
            public final long bootLazyPreloadDelayMs;

            @InterfaceC65349Pkn("activity_entrance_preload")
            public final boolean enableActivityEntranceUpdatePreload;

            @InterfaceC65349Pkn("boot_lazy_preload")
            public final boolean enableBootLazyPreload;

            @InterfaceC65349Pkn("boot_cache_preload")
            public final boolean enableBootPreload;

            @InterfaceC65349Pkn("click_preload")
            public final boolean enableClickPreload;

            @InterfaceC65349Pkn("load_more_preload")
            public final boolean enableLoadMorePreload;

            @InterfaceC65349Pkn("stable_id")
            public final boolean enableStableId;

            @InterfaceC65349Pkn("unread_post_preload")
            public final boolean enableUnreadPostPreload;

            @InterfaceC65349Pkn("live_abandon_duration")
            public final long liveAbandonDurationMs;

            @InterfaceC65349Pkn("notice_abandon_duration")
            public final long noticeAbandonDurationMs;

            @InterfaceC65349Pkn("preload_req_duration")
            public final long preloadReqDurationMs;

            @InterfaceC65349Pkn("refresh_again_duration")
            public final long refreshAgainDurationMs;

            /* JADX WARN: Illegal instructions before constructor call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public MetaData() {
                /*
                    r20 = this;
                    r1 = 0
                    r8 = 0
                    r18 = 4095(0xfff, float:5.738E-42)
                    r19 = 0
                    r0 = r20
                    r2 = r1
                    r3 = r1
                    r4 = r1
                    r5 = r1
                    r6 = r1
                    r7 = r1
                    r10 = r8
                    r12 = r8
                    r14 = r8
                    r16 = r8
                    r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r10, r12, r14, r16, r18, r19)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.notification.perf.NoticePerfManager.OptimizationStrategy.MetaData.<init>():void");
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof MetaData)) {
                    return false;
                }
                MetaData metaData = (MetaData) obj;
                return this.enableStableId == metaData.enableStableId && this.enableLoadMorePreload == metaData.enableLoadMorePreload && this.enableClickPreload == metaData.enableClickPreload && this.enableBootPreload == metaData.enableBootPreload && this.enableBootLazyPreload == metaData.enableBootLazyPreload && this.enableUnreadPostPreload == metaData.enableUnreadPostPreload && this.enableActivityEntranceUpdatePreload == metaData.enableActivityEntranceUpdatePreload && this.bootLazyPreloadDelayMs == metaData.bootLazyPreloadDelayMs && this.preloadReqDurationMs == metaData.preloadReqDurationMs && this.refreshAgainDurationMs == metaData.refreshAgainDurationMs && this.liveAbandonDurationMs == metaData.liveAbandonDurationMs && this.noticeAbandonDurationMs == metaData.noticeAbandonDurationMs;
            }

            public final String toString() {
                return "MetaData(enableStableId=" + this.enableStableId + ", enableLoadMorePreload=" + this.enableLoadMorePreload + ", enableClickPreload=" + this.enableClickPreload + ", enableBootPreload=" + this.enableBootPreload + ", enableBootLazyPreload=" + this.enableBootLazyPreload + ", enableUnreadPostPreload=" + this.enableUnreadPostPreload + ", enableActivityEntranceUpdatePreload=" + this.enableActivityEntranceUpdatePreload + ", bootLazyPreloadDelayMs=" + this.bootLazyPreloadDelayMs + ", preloadReqDurationMs=" + this.preloadReqDurationMs + ", refreshAgainDurationMs=" + this.refreshAgainDurationMs + ", liveAbandonDurationMs=" + this.liveAbandonDurationMs + ", noticeAbandonDurationMs=" + this.noticeAbandonDurationMs + ')';
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v1, types: [int] */
            /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
            /* JADX WARN: Type inference failed for: r0v2, types: [boolean] */
            /* JADX WARN: Type inference failed for: r0v25 */
            /* JADX WARN: Type inference failed for: r0v26 */
            /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
            /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
            /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
            public final int hashCode() {
                boolean z = this.enableStableId;
                int i = 1;
                ?? r0 = z;
                if (z) {
                    r0 = 1;
                }
                int i2 = r0 * 31;
                ?? r02 = this.enableLoadMorePreload;
                int i3 = r02;
                if (r02 != 0) {
                    i3 = 1;
                }
                int i4 = (i2 + i3) * 31;
                ?? r03 = this.enableClickPreload;
                int i5 = r03;
                if (r03 != 0) {
                    i5 = 1;
                }
                int i6 = (i4 + i5) * 31;
                ?? r04 = this.enableBootPreload;
                int i7 = r04;
                if (r04 != 0) {
                    i7 = 1;
                }
                int i8 = (i6 + i7) * 31;
                ?? r05 = this.enableBootLazyPreload;
                int i9 = r05;
                if (r05 != 0) {
                    i9 = 1;
                }
                int i10 = (i8 + i9) * 31;
                ?? r06 = this.enableUnreadPostPreload;
                int i11 = r06;
                if (r06 != 0) {
                    i11 = 1;
                }
                int i12 = (i10 + i11) * 31;
                if (!this.enableActivityEntranceUpdatePreload) {
                    i = 0;
                }
                return C16880lQ.LLJIJIL(this.noticeAbandonDurationMs) + JBR.LIZJ(this.liveAbandonDurationMs, JBR.LIZJ(this.refreshAgainDurationMs, JBR.LIZJ(this.preloadReqDurationMs, JBR.LIZJ(this.bootLazyPreloadDelayMs, (i12 + i) * 31, 31), 31), 31), 31);
            }

            public MetaData(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, long j, long j2, long j3, long j4, long j5) {
                this.enableStableId = z;
                this.enableLoadMorePreload = z2;
                this.enableClickPreload = z3;
                this.enableBootPreload = z4;
                this.enableBootLazyPreload = z5;
                this.enableUnreadPostPreload = z6;
                this.enableActivityEntranceUpdatePreload = z7;
                this.bootLazyPreloadDelayMs = j;
                this.preloadReqDurationMs = j2;
                this.refreshAgainDurationMs = j3;
                this.liveAbandonDurationMs = j4;
                this.noticeAbandonDurationMs = j5;
            }

            public /* synthetic */ MetaData(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, long j, long j2, long j3, long j4, long j5, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? true : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3, (i & 8) != 0 ? false : z4, (i & 16) != 0 ? false : z5, (i & 32) != 0 ? false : z6, (i & 64) == 0 ? z7 : false, (i & 128) != 0 ? 0L : j, (i & 256) != 0 ? 120000L : j2, (i & 512) != 0 ? LivePlayEnforceIntervalSetting.DEFAULT : j3, (i & 1024) == 0 ? j4 : 120000L, (i & 2048) != 0 ? 43200000L : j5);
            }
        }

        static {
            boolean z = false;
            long j = 0;
            LIZ = new MetaData(z, z, z, z, z, z, z, j, j, j, j, j, 4095, null);
        }

        public static MetaData LIZ() {
            return (MetaData) LIZIZ.getValue();
        }

        public static boolean LIZIZ(EnumC55898Lwk reason) {
            o.LJIIIZ(reason, "reason");
            if ((LIZ().enableClickPreload && reason == EnumC55898Lwk.CLICK_ENTRANCE) || ((LIZ().enableBootPreload && reason == EnumC55898Lwk.BOOT) || ((LIZ().enableBootLazyPreload && reason == EnumC55898Lwk.BOOT_LAZY) || ((LIZ().enableUnreadPostPreload && reason == EnumC55898Lwk.POST_UNREAD) || (LIZ().enableActivityEntranceUpdatePreload && reason == EnumC55898Lwk.ACTIVITY_ENTRANCE_UPDATE))))) {
                return true;
            }
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0016 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0018 A[Catch: all -> 0x0052, TRY_ENTER, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x000b, B:15:0x0018, B:17:0x002f, B:19:0x003c, B:21:0x0040, B:22:0x0042, B:24:0x0039, B:28:0x0048, B:29:0x0037), top: B:3:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.M4S LIZJ() {
        /*
            java.lang.Class<X.M4S> r7 = X.M4S.class
            monitor-enter(r7)
            com.ss.android.ugc.aweme.notification.perf.NoticePerfManager$OptimizationStrategy$MetaData r1 = LIZ()     // Catch: java.lang.Throwable -> L52
            boolean r0 = r1.enableBootPreload     // Catch: java.lang.Throwable -> L52
            if (r0 != 0) goto L12
            boolean r0 = r1.enableActivityEntranceUpdatePreload     // Catch: java.lang.Throwable -> L52
            if (r0 == 0) goto L10
            goto L12
        L10:
            r0 = 0
            goto L13
        L12:
            r0 = 1
        L13:
            r6 = 0
            if (r0 != 0) goto L18
            monitor-exit(r7)
            return r6
        L18:
            com.ss.android.ugc.aweme.IAccountUserService r0 = X.HG3.LJIILL()     // Catch: java.lang.Throwable -> L52
            X.RBX r0 = (X.RBX) r0     // Catch: java.lang.Throwable -> L52
            java.lang.String r5 = r0.getCurUserId()     // Catch: java.lang.Throwable -> L52
            java.lang.String r0 = "uid"
            kotlin.jvm.internal.o.LJIIIIZZ(r5, r0)     // Catch: java.lang.Throwable -> L52
            java.lang.Long r0 = X.C38350F3i.LJJIZ(r5)     // Catch: java.lang.Throwable -> L52
            r3 = 0
            if (r0 == 0) goto L37
            long r1 = r0.longValue()     // Catch: java.lang.Throwable -> L52
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 > 0) goto L3c
        L37:
            com.ss.android.ugc.aweme.notification.perf.NoticePerfManager.LIZLLL = r6     // Catch: java.lang.Throwable -> L52
        L39:
            X.M4S r0 = com.ss.android.ugc.aweme.notification.perf.NoticePerfManager.LIZLLL     // Catch: java.lang.Throwable -> L52
            goto L50
        L3c:
            X.M4S r0 = com.ss.android.ugc.aweme.notification.perf.NoticePerfManager.LIZLLL     // Catch: java.lang.Throwable -> L52
            if (r0 == 0) goto L42
            java.lang.String r6 = r0.LIZ     // Catch: java.lang.Throwable -> L52
        L42:
            boolean r0 = kotlin.jvm.internal.o.LJ(r5, r6)     // Catch: java.lang.Throwable -> L52
            if (r0 != 0) goto L39
            X.M4S r0 = new X.M4S     // Catch: java.lang.Throwable -> L52
            r0.<init>(r5)     // Catch: java.lang.Throwable -> L52
            com.ss.android.ugc.aweme.notification.perf.NoticePerfManager.LIZLLL = r0     // Catch: java.lang.Throwable -> L52
            goto L39
        L50:
            monitor-exit(r7)
            return r0
        L52:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.notification.perf.NoticePerfManager.LIZJ():X.M4S");
    }

    public static OptimizationStrategy.MetaData LIZ() {
        OptimizationStrategy.MetaData LIZ2 = OptimizationStrategy.LIZ();
        o.LJIIIIZZ(LIZ2, "OptimizationStrategy.abValue");
        return LIZ2;
    }

    public final synchronized M4Q LIZIZ(boolean z) {
        long j;
        String str;
        M4Q m4q;
        synchronized (M4Q.class) {
            String uid = ((RBX) HG3.LJIILL()).getCurUserId();
            o.LJIIIIZZ(uid, "uid");
            Long LJJIZ = C38350F3i.LJJIZ(uid);
            if (LJJIZ != null) {
                j = LJJIZ.longValue();
            } else {
                j = 0;
            }
            M4Q m4q2 = null;
            if (j <= 0) {
                LIZJ = null;
            } else {
                M4Q m4q3 = LIZJ;
                if (m4q3 != null) {
                    str = m4q3.LIZ;
                } else {
                    str = null;
                }
                if (!o.LJ(uid, str)) {
                    if (z) {
                        m4q2 = new M4Q(uid, LIZJ());
                    }
                    LIZJ = m4q2;
                }
            }
            m4q = LIZJ;
        }
        return m4q;
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

    public static void LIZLLL(EnumC55898Lwk enumC55898Lwk, InterfaceC65784Pro interfaceC65784Pro) {
        if (INB.LIZ() == 0 && L0U.LIZ() && OptimizationStrategy.LIZIZ(enumC55898Lwk)) {
            WeakReference<Object> weakReference = LIZIZ;
            if ((weakReference == null || weakReference.get() == null) && ((RBX) HG3.LJIILL()).isLogin() && !C1DH.LJIJJLI()) {
                interfaceC65784Pro.invoke();
            }
        }
    }

    public static void LJ(EnumC55898Lwk enumC55898Lwk, InterfaceC65784Pro interfaceC65784Pro) {
        if (INB.LIZ() != 0 && L0U.LIZ() && OptimizationStrategy.LIZIZ(enumC55898Lwk) && ((RBX) HG3.LJIILL()).isLogin() && !C1DH.LJIJJLI()) {
            interfaceC65784Pro.invoke();
        }
    }
}
