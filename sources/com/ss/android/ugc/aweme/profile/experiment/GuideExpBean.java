package com.ss.android.ugc.aweme.profile.experiment;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public final class GuideExpBean extends F9E {

    @InterfaceC65349Pkn("enable_starling_guide")
    public final boolean enableGuide;

    @InterfaceC65349Pkn("guide_style")
    public final int guideType;

    /* JADX WARN: Multi-variable type inference failed */
    public GuideExpBean() {
        this(false, 0 == true ? 1 : 0, 3, null);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.enableGuide), Integer.valueOf(this.guideType)};
    }

    public GuideExpBean(boolean z, int i) {
        this.enableGuide = z;
        this.guideType = i;
    }

    public /* synthetic */ GuideExpBean(boolean z, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? 0 : i);
    }
}
