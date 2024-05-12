package com.google.android.gms.maps.model;

import X.C68772Qyu;
import X.QH7;

/* loaded from: classes12.dex */
public final class CustomCap extends Cap {
    public final C68772Qyu bitmapDescriptor;
    public final float refWidth;

    @Override // com.google.android.gms.maps.model.Cap
    public final String toString() {
        return "[CustomCap: bitmapDescriptor=" + String.valueOf(this.bitmapDescriptor) + " refWidth=" + this.refWidth + "]";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomCap(C68772Qyu c68772Qyu, float f) {
        super(3, c68772Qyu, Float.valueOf(f));
        QH7.LJIIIZ(c68772Qyu, "bitmapDescriptor must not be null");
        if (f > 0.0f) {
            this.bitmapDescriptor = c68772Qyu;
            this.refWidth = f;
            return;
        }
        throw new IllegalArgumentException("refWidth must be positive");
    }
}
