package com.ss.android.ugc.aweme.notification.perf;

import X.C16880lQ;
import X.C221018lt;
import X.C221108m2;
import X.C39061g6;
import X.C47135Ieh;
import X.C62822Ol8;
import X.HG3;
import X.HandlerC56918MVm;
import X.InterfaceC252619vl;
import X.InterfaceC65349Pkn;
import X.JBR;
import X.MS5;
import X.MWO;
import X.RBX;
import X.X1D;
import com.bytedance.router.SmartRoute;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class NoticeVideoManager implements InterfaceC252619vl {
    public static final Meta LJLIL;
    public static final C62822Ol8 LJLILLLLZI;
    public static HandlerC56918MVm LJLJI;

    /* loaded from: classes10.dex */
    public static final class Meta {

        @InterfaceC65349Pkn("request_alignment_delay")
        public final long alignmentDelay;

        @InterfaceC65349Pkn("expire_duration")
        public final long expireDuration;

        @InterfaceC65349Pkn("enabled")
        public final boolean isEnabled;

        @InterfaceC65349Pkn("preserved_cache_count")
        public final int preservedCacheCount;

        @InterfaceC65349Pkn("rolling_cache_count")
        public final int rollingCacheCount;

        @InterfaceC65349Pkn("trigger_preload_condition")
        public final int triggerPreloadCondition;

        /* JADX WARN: Illegal instructions before constructor call */
        /* JADX WARN: Multi-variable type inference failed */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public Meta() {
            /*
                r11 = this;
                r1 = 0
                r2 = 0
                r9 = 63
                r10 = 0
                r0 = r11
                r4 = r1
                r5 = r1
                r6 = r1
                r7 = r2
                r0.<init>(r1, r2, r4, r5, r6, r7, r9, r10)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.notification.perf.NoticeVideoManager.Meta.<init>():void");
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Meta)) {
                return false;
            }
            Meta meta = (Meta) obj;
            return this.isEnabled == meta.isEnabled && this.expireDuration == meta.expireDuration && this.triggerPreloadCondition == meta.triggerPreloadCondition && this.preservedCacheCount == meta.preservedCacheCount && this.rollingCacheCount == meta.rollingCacheCount && this.alignmentDelay == meta.alignmentDelay;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [int] */
        /* JADX WARN: Type inference failed for: r0v10 */
        /* JADX WARN: Type inference failed for: r0v9 */
        public final int hashCode() {
            boolean z = this.isEnabled;
            ?? r0 = z;
            if (z) {
                r0 = 1;
            }
            return C16880lQ.LLJIJIL(this.alignmentDelay) + ((((((JBR.LIZJ(this.expireDuration, r0 * 31, 31) + this.triggerPreloadCondition) * 31) + this.preservedCacheCount) * 31) + this.rollingCacheCount) * 31);
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Meta(isEnabled=");
            LIZ.append(this.isEnabled);
            LIZ.append(", expireDuration=");
            LIZ.append(this.expireDuration);
            LIZ.append(", triggerPreloadCondition=");
            LIZ.append(this.triggerPreloadCondition);
            LIZ.append(", preservedCacheCount=");
            LIZ.append(this.preservedCacheCount);
            LIZ.append(", rollingCacheCount=");
            LIZ.append(this.rollingCacheCount);
            LIZ.append(", alignmentDelay=");
            return C47135Ieh.LIZIZ(LIZ, this.alignmentDelay, ')', LIZ);
        }

        public Meta(boolean z, long j, int i, int i2, int i3, long j2) {
            this.isEnabled = z;
            this.expireDuration = j;
            this.triggerPreloadCondition = i;
            this.preservedCacheCount = i2;
            this.rollingCacheCount = i3;
            this.alignmentDelay = j2;
        }

        public /* synthetic */ Meta(boolean z, long j, int i, int i2, int i3, long j2, int i4, DefaultConstructorMarker defaultConstructorMarker) {
            this((i4 & 1) != 0 ? false : z, (i4 & 2) != 0 ? 180L : j, (i4 & 4) != 0 ? 2 : i, (i4 & 8) != 0 ? 10 : i2, (i4 & 16) != 0 ? 20 : i3, (i4 & 32) != 0 ? 400L : j2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        NoticeVideoManager noticeVideoManager = new NoticeVideoManager();
        long j = 0;
        LJLIL = new Meta(false, j, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, j, 63, null);
        LJLILLLLZI = C221108m2.LIZIZ(MWO.LJLIL);
        ((RBX) HG3.LJIILL()).addUserChangeListener(noticeVideoManager);
    }

    public static Meta LIZIZ() {
        return (Meta) LJLILLLLZI.getValue();
    }

    public static final void LJ() {
        HandlerC56918MVm handlerC56918MVm = LJLJI;
        if (handlerC56918MVm != null) {
            MS5.LJI(new AqS159S0100000_9(handlerC56918MVm, 405));
        }
        LJLJI = null;
    }

    public static final HandlerC56918MVm LIZ() {
        String str = null;
        if (!LIZIZ().isEnabled) {
            return null;
        }
        String uid = ((RBX) HG3.LJIILL()).getCurUserId();
        if (uid == null || uid.length() == 0) {
            LJ();
        } else {
            HandlerC56918MVm handlerC56918MVm = LJLJI;
            if (handlerC56918MVm != null) {
                str = handlerC56918MVm.LJLIL;
            }
            if (!o.LJ(str, uid)) {
                LJ();
                o.LJIIIIZZ(uid, "uid");
                LJLJI = new HandlerC56918MVm(uid);
            }
        }
        return LJLJI;
    }

    public static void LIZJ(SmartRoute smartRoute, String url) {
        o.LJIIIZ(url, "url");
        if (LIZIZ().isEnabled && ujb.o.LJJJLIIL(url, "aweme://aweme/detail/", false)) {
            smartRoute.withParam("video_from", "from_notification_page");
        }
    }

    public static void LIZLLL(C39061g6 c39061g6, String url) {
        o.LJIIIZ(url, "url");
        if (LIZIZ().isEnabled && ujb.o.LJJJLIIL(url, "aweme://aweme/detail/", false)) {
            c39061g6.LIZIZ("video_from", "from_notification_page");
        }
    }

    @Override // X.InterfaceC252619vl
    public final void t0(int i, User user, User user2) {
        String str;
        String str2;
        String str3;
        HandlerC56918MVm handlerC56918MVm = LJLJI;
        String str4 = null;
        if (handlerC56918MVm != null) {
            str = handlerC56918MVm.LJLIL;
        } else {
            str = null;
        }
        if (user2 != null) {
            str2 = user2.getUid();
        } else {
            str2 = null;
        }
        if (!o.LJ(str, str2)) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("user changed:");
            HandlerC56918MVm handlerC56918MVm2 = LJLJI;
            if (handlerC56918MVm2 != null) {
                str3 = handlerC56918MVm2.LJLIL;
            } else {
                str3 = null;
            }
            LIZ.append(str3);
            LIZ.append(", ");
            if (user2 != null) {
                str4 = user2.getUid();
            }
            LIZ.append(str4);
            C221018lt.LIZIZ("NoticeVideoManager", X1D.LIZIZ(LIZ));
            LJ();
        }
    }
}
