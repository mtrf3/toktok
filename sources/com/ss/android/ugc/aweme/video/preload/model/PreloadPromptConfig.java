package com.ss.android.ugc.aweme.video.preload.model;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class PreloadPromptConfig extends F9E {

    @InterfaceC65349Pkn("fix_miss_callback_click")
    public final boolean fixClickPlayMissCallback;

    @InterfaceC65349Pkn("fix_miss_callback_splash_feed_ad")
    public final boolean fixSplashFeedAdMissCallback;

    @InterfaceC65349Pkn("add_callback_when_play_complete")
    public final boolean preloadWhenPlayComplete;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public PreloadPromptConfig() {
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
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.video.preload.model.PreloadPromptConfig.<init>():void");
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.fixSplashFeedAdMissCallback), Boolean.valueOf(this.fixClickPlayMissCallback), Boolean.valueOf(this.preloadWhenPlayComplete)};
    }

    public PreloadPromptConfig(boolean z, boolean z2, boolean z3) {
        this.fixSplashFeedAdMissCallback = z;
        this.fixClickPlayMissCallback = z2;
        this.preloadWhenPlayComplete = z3;
    }

    public /* synthetic */ PreloadPromptConfig(boolean z, boolean z2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3);
    }
}
