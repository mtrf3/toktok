package com.ss.android.ugc.aweme.websocket.api.ab;

import X.C1NE;
import X.C221108m2;
import X.C47959Irz;
import X.C62822Ol8;
import X.C86884Y8a;
import X.C86885Y8b;
import X.C86886Y8c;
import X.C86887Y8d;
import X.C86888Y8e;
import X.C86889Y8f;
import X.C86890Y8g;
import X.C86891Y8h;
import X.InterfaceC65349Pkn;
import X.JBR;
import X.L28;
import X.X1D;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class WsMonitorConfigExp {
    public static final MetaData LIZ;
    public static final C62822Ol8 LIZIZ = C221108m2.LIZIZ(L28.LJLIL);
    public static final C62822Ol8 LIZJ = C221108m2.LIZIZ(C86886Y8c.LJLIL);
    public static final C62822Ol8 LIZLLL = C221108m2.LIZIZ(C86887Y8d.LJLIL);
    public static final C62822Ol8 LJ = C221108m2.LIZIZ(C86889Y8f.LJLIL);
    public static final C62822Ol8 LJFF = C221108m2.LIZIZ(C86888Y8e.LJLIL);
    public static final C62822Ol8 LJI = C221108m2.LIZIZ(C86890Y8g.LJLIL);
    public static final C62822Ol8 LJII = C221108m2.LIZIZ(C86885Y8b.LJLIL);
    public static final C62822Ol8 LJIIIIZZ = C221108m2.LIZIZ(C86891Y8h.LJLIL);
    public static final C62822Ol8 LJIIIZ = C221108m2.LIZIZ(C86884Y8a.LJLIL);

    /* loaded from: classes16.dex */
    public static final class MetaData {

        @InterfaceC65349Pkn("monitor_enabled")
        public final boolean monitorEnabled;

        @InterfaceC65349Pkn("online_rate_background_loop_enabled")
        public final boolean onlineRateBackgroundLoopEnabled;

        @InterfaceC65349Pkn("online_rate_enabled")
        public final boolean onlineRateEnabled;

        @InterfaceC65349Pkn("online_rate_foreground_loop_enabled")
        public final boolean onlineRateForegroundLoopEnabled;

        @InterfaceC65349Pkn("online_rate_loop_seconds")
        public final long onlineRateLoopSeconds;

        @InterfaceC65349Pkn("online_rate_sample_rate")
        public final float onlineRateSampleRate;

        @InterfaceC65349Pkn("online_rate_scene_enable")
        public final boolean onlineRateSceneEnabled;

        @InterfaceC65349Pkn("online_rate_scene_white_list")
        public final List<Integer> onlineRateSceneWhiteList;

        /* JADX WARN: Illegal instructions before constructor call */
        /* JADX WARN: Multi-variable type inference failed */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public MetaData() {
            /*
                r12 = this;
                r1 = 0
                r5 = 0
                r7 = 0
                r9 = 0
                r10 = 255(0xff, float:3.57E-43)
                r0 = r12
                r2 = r1
                r3 = r1
                r4 = r1
                r8 = r1
                r11 = r9
                r0.<init>(r1, r2, r3, r4, r5, r7, r8, r9, r10, r11)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.websocket.api.ab.WsMonitorConfigExp.MetaData.<init>():void");
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MetaData)) {
                return false;
            }
            MetaData metaData = (MetaData) obj;
            return this.monitorEnabled == metaData.monitorEnabled && this.onlineRateEnabled == metaData.onlineRateEnabled && this.onlineRateForegroundLoopEnabled == metaData.onlineRateForegroundLoopEnabled && this.onlineRateBackgroundLoopEnabled == metaData.onlineRateBackgroundLoopEnabled && this.onlineRateLoopSeconds == metaData.onlineRateLoopSeconds && Float.compare(this.onlineRateSampleRate, metaData.onlineRateSampleRate) == 0 && this.onlineRateSceneEnabled == metaData.onlineRateSceneEnabled && o.LJ(this.onlineRateSceneWhiteList, metaData.onlineRateSceneWhiteList);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [int] */
        /* JADX WARN: Type inference failed for: r0v18 */
        /* JADX WARN: Type inference failed for: r0v19 */
        /* JADX WARN: Type inference failed for: r0v2, types: [boolean] */
        /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
        /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
        public final int hashCode() {
            int hashCode;
            boolean z = this.monitorEnabled;
            int i = 1;
            ?? r0 = z;
            if (z) {
                r0 = 1;
            }
            int i2 = r0 * 31;
            ?? r02 = this.onlineRateEnabled;
            int i3 = r02;
            if (r02 != 0) {
                i3 = 1;
            }
            int i4 = (i2 + i3) * 31;
            ?? r03 = this.onlineRateForegroundLoopEnabled;
            int i5 = r03;
            if (r03 != 0) {
                i5 = 1;
            }
            int i6 = (i4 + i5) * 31;
            ?? r04 = this.onlineRateBackgroundLoopEnabled;
            int i7 = r04;
            if (r04 != 0) {
                i7 = 1;
            }
            int LIZIZ = C47959Irz.LIZIZ(this.onlineRateSampleRate, JBR.LIZJ(this.onlineRateLoopSeconds, (i6 + i7) * 31, 31), 31);
            if (!this.onlineRateSceneEnabled) {
                i = 0;
            }
            int i8 = (LIZIZ + i) * 31;
            List<Integer> list = this.onlineRateSceneWhiteList;
            if (list == null) {
                hashCode = 0;
            } else {
                hashCode = list.hashCode();
            }
            return i8 + hashCode;
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("MetaData(monitorEnabled=");
            LIZ.append(this.monitorEnabled);
            LIZ.append(", onlineRateEnabled=");
            LIZ.append(this.onlineRateEnabled);
            LIZ.append(", onlineRateForegroundLoopEnabled=");
            LIZ.append(this.onlineRateForegroundLoopEnabled);
            LIZ.append(", onlineRateBackgroundLoopEnabled=");
            LIZ.append(this.onlineRateBackgroundLoopEnabled);
            LIZ.append(", onlineRateLoopSeconds=");
            LIZ.append(this.onlineRateLoopSeconds);
            LIZ.append(", onlineRateSampleRate=");
            LIZ.append(this.onlineRateSampleRate);
            LIZ.append(", onlineRateSceneEnabled=");
            LIZ.append(this.onlineRateSceneEnabled);
            LIZ.append(", onlineRateSceneWhiteList=");
            return C1NE.LIZIZ(LIZ, this.onlineRateSceneWhiteList, ')', LIZ);
        }

        public MetaData(boolean z, boolean z2, boolean z3, boolean z4, long j, float f, boolean z5, List<Integer> list) {
            this.monitorEnabled = z;
            this.onlineRateEnabled = z2;
            this.onlineRateForegroundLoopEnabled = z3;
            this.onlineRateBackgroundLoopEnabled = z4;
            this.onlineRateLoopSeconds = j;
            this.onlineRateSampleRate = f;
            this.onlineRateSceneEnabled = z5;
            this.onlineRateSceneWhiteList = list;
        }

        public /* synthetic */ MetaData(boolean z, boolean z2, boolean z3, boolean z4, long j, float f, boolean z5, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? true : z3, (i & 8) != 0 ? false : z4, (i & 16) != 0 ? 300L : j, (i & 32) != 0 ? 1.0f : f, (i & 64) == 0 ? z5 : false, (i & 128) != 0 ? null : list);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        boolean z = false;
        LIZ = new MetaData(z, z, z, z, 0L, 0.0f, z, null, 255, 0 == true ? 1 : 0);
    }

    public static float LIZ() {
        return ((Number) LJII.getValue()).floatValue();
    }

    public static boolean LIZIZ() {
        return ((Boolean) LJIIIIZZ.getValue()).booleanValue();
    }

    public static MetaData LIZJ() {
        return (MetaData) LIZIZ.getValue();
    }

    public static boolean LIZLLL() {
        return ((Boolean) LJFF.getValue()).booleanValue();
    }

    public static boolean LJ() {
        return ((Boolean) LJ.getValue()).booleanValue();
    }

    public static boolean LJFF() {
        return ((Boolean) LIZLLL.getValue()).booleanValue();
    }
}
