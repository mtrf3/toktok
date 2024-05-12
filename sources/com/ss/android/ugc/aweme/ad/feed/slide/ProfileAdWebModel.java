package com.ss.android.ugc.aweme.ad.feed.slide;

import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes11.dex */
public final class ProfileAdWebModel {

    @InterfaceC65349Pkn("left_slide_lynx_page_preload_progress_percentage")
    public final int preloadLynxProcess;

    @InterfaceC65349Pkn("left_slide_webpage_preload_progress_percentage")
    public final int preloadWebProcess;

    @InterfaceC65349Pkn("left_slide_lynx_page_track_progress_percentage")
    public final int trackLynxProcess;

    @InterfaceC65349Pkn("left_slide_webpage_track_progress_percentage")
    public final int trackWebProcess;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ProfileAdWebModel() {
        /*
            r7 = this;
            r1 = 0
            r5 = 15
            r6 = 0
            r0 = r7
            r2 = r1
            r3 = r1
            r4 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ad.feed.slide.ProfileAdWebModel.<init>():void");
    }

    public ProfileAdWebModel(int i, int i2, int i3, int i4) {
        this.trackWebProcess = i;
        this.preloadWebProcess = i2;
        this.trackLynxProcess = i3;
        this.preloadLynxProcess = i4;
    }

    public /* synthetic */ ProfileAdWebModel(int i, int i2, int i3, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? 100 : i, (i5 & 2) != 0 ? 100 : i2, (i5 & 4) != 0 ? 100 : i3, (i5 & 8) != 0 ? 100 : i4);
    }
}
