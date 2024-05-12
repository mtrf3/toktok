package com.bytedance.ies.sdk.widgets;

import X.C76800UCe;
import X.InterfaceC65784Pro;
import X.InterfaceC88472Yns;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class LayeredElementConfiguration {
    public static boolean debug;
    public static boolean guidelineIndicatorEnabled;
    public static final LayeredElementConfiguration INSTANCE = new LayeredElementConfiguration();
    public static long animationDuration = 300;
    public static InterfaceC88472Yns<? super Throwable, C76800UCe> sladarReporter = LayeredElementConfiguration$sladarReporter$1.INSTANCE;
    public static InterfaceC65784Pro<Boolean> useAlphaOpt = LayeredElementConfiguration$useAlphaOpt$1.INSTANCE;

    public final long getAnimationDuration() {
        return animationDuration;
    }

    public final boolean getDebug() {
        return debug;
    }

    public final boolean getGuidelineIndicatorEnabled() {
        return guidelineIndicatorEnabled;
    }

    public final InterfaceC88472Yns<Throwable, C76800UCe> getSladarReporter() {
        return sladarReporter;
    }

    public final InterfaceC65784Pro<Boolean> getUseAlphaOpt() {
        return useAlphaOpt;
    }

    public final void setAnimationDuration(long j) {
        animationDuration = j;
    }

    public final void setDebug(boolean z) {
        debug = z;
    }

    public final void setGuidelineIndicatorEnabled(boolean z) {
        guidelineIndicatorEnabled = z;
    }

    public final void setSladarReporter(InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns) {
        o.LJIIIZ(interfaceC88472Yns, "<set-?>");
        sladarReporter = interfaceC88472Yns;
    }

    public final void setUseAlphaOpt(InterfaceC65784Pro<Boolean> interfaceC65784Pro) {
        o.LJIIIZ(interfaceC65784Pro, "<set-?>");
        useAlphaOpt = interfaceC65784Pro;
    }
}
