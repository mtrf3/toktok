package com.ss.android.ugc.aweme.relation.monitor;

import X.C07670Rv;
import X.C16880lQ;
import X.C1JX;
import X.C221108m2;
import X.C5H3;
import X.C62822Ol8;
import X.EnumC221088m0;
import X.InterfaceC65349Pkn;
import X.V0S;
import X.V0T;
import X.V0U;
import X.V0V;
import X.V0W;
import X.V0X;
import X.V0Y;
import X.X1D;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes14.dex */
public final class MonitorSamplingConfig {
    public static final MonitorSamplingConfig LIZ = new MonitorSamplingConfig();
    public static final ConfigValue LIZIZ;
    public static final C62822Ol8 LIZJ;
    public static final C62822Ol8 LIZLLL;
    public static final C5H3 LJ;
    public static final C5H3 LJFF;
    public static final C5H3 LJI;
    public static final C5H3 LJII;
    public static final C5H3 LJIIIIZZ;

    /* loaded from: classes14.dex */
    public static final class ConfigValue {

        @InterfaceC65349Pkn("relation_image_value")
        public final double imageValue;

        @InterfaceC65349Pkn("rec_user_popup_value")
        public final double recUserPopup;

        @InterfaceC65349Pkn("rec_user_refresh_value")
        public final double recUserRefresh;

        @InterfaceC65349Pkn("rec_user_scene_value")
        public final double recUserScene;

        @InterfaceC65349Pkn("relation_page_value")
        public final double relationPage;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public ConfigValue() {
            /*
                r13 = this;
                r1 = 0
                r11 = 31
                r12 = 0
                r0 = r13
                r3 = r1
                r5 = r1
                r7 = r1
                r9 = r1
                r0.<init>(r1, r3, r5, r7, r9, r11, r12)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.relation.monitor.MonitorSamplingConfig.ConfigValue.<init>():void");
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ConfigValue)) {
                return false;
            }
            ConfigValue configValue = (ConfigValue) obj;
            return Double.compare(this.recUserPopup, configValue.recUserPopup) == 0 && Double.compare(this.recUserScene, configValue.recUserScene) == 0 && Double.compare(this.imageValue, configValue.imageValue) == 0 && Double.compare(this.recUserRefresh, configValue.recUserRefresh) == 0 && Double.compare(this.relationPage, configValue.relationPage) == 0;
        }

        public final int hashCode() {
            return C16880lQ.LLJI(this.relationPage) + C1JX.LIZIZ(this.recUserRefresh, C1JX.LIZIZ(this.imageValue, C1JX.LIZIZ(this.recUserScene, C16880lQ.LLJI(this.recUserPopup) * 31, 31), 31), 31);
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("ConfigValue(recUserPopup=");
            LIZ.append(this.recUserPopup);
            LIZ.append(", recUserScene=");
            LIZ.append(this.recUserScene);
            LIZ.append(", imageValue=");
            LIZ.append(this.imageValue);
            LIZ.append(", recUserRefresh=");
            LIZ.append(this.recUserRefresh);
            LIZ.append(", relationPage=");
            return C07670Rv.LIZ(LIZ, this.relationPage, ')', LIZ);
        }

        public ConfigValue(double d, double d2, double d3, double d4, double d5) {
            this.recUserPopup = d;
            this.recUserScene = d2;
            this.imageValue = d3;
            this.recUserRefresh = d4;
            this.relationPage = d5;
        }

        public /* synthetic */ ConfigValue(double d, double d2, double d3, double d4, double d5, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX : d, (i & 2) != 0 ? LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX : d2, (i & 4) != 0 ? LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX : d3, (i & 8) != 0 ? LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX : d4, (i & 16) == 0 ? d5 : LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX);
        }
    }

    static {
        double d = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
        LIZIZ = new ConfigValue(d, d, d, d, d, 31, null);
        LIZJ = C221108m2.LIZIZ(V0Y.LJLIL);
        LIZLLL = C221108m2.LIZIZ(V0S.LJLIL);
        EnumC221088m0 enumC221088m0 = EnumC221088m0.NONE;
        LJ = C221108m2.LIZ(enumC221088m0, V0U.LJLIL);
        LJFF = C221108m2.LIZ(enumC221088m0, V0X.LJLIL);
        LJI = C221108m2.LIZ(enumC221088m0, V0T.LJLIL);
        LJII = C221108m2.LIZ(enumC221088m0, V0V.LJLIL);
        LJIIIIZZ = C221108m2.LIZ(enumC221088m0, V0W.LJLIL);
    }

    public static ConfigValue LIZ() {
        return (ConfigValue) LIZJ.getValue();
    }

    public static double LIZIZ() {
        return ((Number) LIZLLL.getValue()).doubleValue();
    }
}
