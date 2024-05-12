package com.ss.android.ugc.aweme.web.experiment;

import X.C221108m2;
import X.C62822Ol8;
import X.C87537YXd;
import X.C87538YXe;
import X.C87539YXf;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes17.dex */
public final class CommerceWebCrossToSparkExt {
    public static final CommerceWebCrossToSparkModel LIZ;
    public static final C62822Ol8 LIZIZ = C221108m2.LIZIZ(C87537YXd.LJLIL);
    public static final C62822Ol8 LIZJ = C221108m2.LIZIZ(C87538YXe.LJLIL);
    public static final C62822Ol8 LIZLLL = C221108m2.LIZIZ(C87539YXf.LJLIL);

    static {
        boolean z = false;
        LIZ = new CommerceWebCrossToSparkModel(z, z, z, 7, null);
    }

    public static final boolean LIZ() {
        return ((Boolean) LIZIZ.getValue()).booleanValue();
    }

    public static final boolean LIZIZ() {
        return ((Boolean) LIZJ.getValue()).booleanValue();
    }

    public static final boolean LIZJ() {
        return ((Boolean) LIZLLL.getValue()).booleanValue();
    }

    /* loaded from: classes17.dex */
    public static final class CommerceWebCrossToSparkModel {

        @InterfaceC65349Pkn("full_screen")
        public final boolean fullScreen;

        @InterfaceC65349Pkn("nine_screen")
        public final boolean niniScreen;

        @InterfaceC65349Pkn("shake_egg")
        public final boolean shakeEgg;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public CommerceWebCrossToSparkModel() {
            /*
                r6 = this;
                r1 = 0
                r4 = 7
                r5 = 0
                r0 = r6
                r2 = r1
                r3 = r1
                r0.<init>(r1, r2, r3, r4, r5)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.web.experiment.CommerceWebCrossToSparkExt.CommerceWebCrossToSparkModel.<init>():void");
        }

        public CommerceWebCrossToSparkModel(boolean z, boolean z2, boolean z3) {
            this.fullScreen = z;
            this.niniScreen = z2;
            this.shakeEgg = z3;
        }

        public /* synthetic */ CommerceWebCrossToSparkModel(boolean z, boolean z2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3);
        }
    }
}
