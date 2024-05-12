package com.ss.android.ugc.aweme.ecommerce.ab;

import X.F9E;
import X.InterfaceC65349Pkn;

/* loaded from: classes13.dex */
public final class EComImageConfig extends F9E {

    @InterfaceC65349Pkn("low_image_size")
    public final int lowImageSize;

    @InterfaceC65349Pkn("middle_image_size")
    public final int middleImageSize;

    @InterfaceC65349Pkn("preload_duration")
    public final int preloadDuration;

    @InterfaceC65349Pkn("preload_size")
    public final int preloadSize;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.preloadDuration), Integer.valueOf(this.lowImageSize), Integer.valueOf(this.middleImageSize), Integer.valueOf(this.preloadSize)};
    }

    public EComImageConfig(int i, int i2, int i3, int i4) {
        this.preloadDuration = i;
        this.lowImageSize = i2;
        this.middleImageSize = i3;
        this.preloadSize = i4;
    }
}
