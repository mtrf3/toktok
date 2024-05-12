package com.ss.android.ugc.aweme.story.experiment;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class StoryPhotoMultiRateConfig extends F9E {

    @InterfaceC65349Pkn("rate")
    public final String rate;

    /* JADX WARN: Multi-variable type inference failed */
    public StoryPhotoMultiRateConfig() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.rate};
    }

    public StoryPhotoMultiRateConfig(String rate) {
        o.LJIIIZ(rate, "rate");
        this.rate = rate;
    }

    public /* synthetic */ StoryPhotoMultiRateConfig(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "1080p" : str);
    }
}
