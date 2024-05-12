package com.ss.android.ugc.aweme.experiment;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public final class VideoSmartCroppingSettingsConfig extends F9E {

    @InterfaceC65349Pkn("adapt_inline_caption")
    public final boolean adapt_inline_caption;

    @InterfaceC65349Pkn("show_area")
    public final boolean show_area;

    @InterfaceC65349Pkn("sticker_percentage")
    public final float sticker_percentage;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public VideoSmartCroppingSettingsConfig() {
        /*
            r6 = this;
            r1 = 0
            r2 = 0
            r4 = 7
            r5 = 0
            r0 = r6
            r3 = r1
            r0.<init>(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.experiment.VideoSmartCroppingSettingsConfig.<init>():void");
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.show_area), Float.valueOf(this.sticker_percentage), Boolean.valueOf(this.adapt_inline_caption)};
    }

    public VideoSmartCroppingSettingsConfig(boolean z, float f, boolean z2) {
        this.show_area = z;
        this.sticker_percentage = f;
        this.adapt_inline_caption = z2;
    }

    public /* synthetic */ VideoSmartCroppingSettingsConfig(boolean z, float f, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? 0.3f : f, (i & 4) != 0 ? false : z2);
    }
}
