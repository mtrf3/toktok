package com.ss.android.ugc.aweme.poi;

import X.F9E;
import X.InterfaceC65349Pkn;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes16.dex */
public final class GuitarBundle extends F9E {

    @InterfaceC65349Pkn("latitude")
    public double latitude;

    @InterfaceC65349Pkn("longitude")
    public double longitude;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public GuitarBundle() {
        /*
            r7 = this;
            r1 = 0
            r5 = 3
            r6 = 0
            r0 = r7
            r3 = r1
            r0.<init>(r1, r3, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.GuitarBundle.<init>():void");
    }

    public static /* synthetic */ GuitarBundle copy$default(GuitarBundle guitarBundle, double d, double d2, int i, Object obj) {
        if ((i & 1) != 0) {
            d = guitarBundle.latitude;
        }
        if ((i & 2) != 0) {
            d2 = guitarBundle.longitude;
        }
        return guitarBundle.copy(d, d2);
    }

    public final GuitarBundle copy(double d, double d2) {
        return new GuitarBundle(d, d2);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Double.valueOf(this.latitude), Double.valueOf(this.longitude)};
    }

    public final double getLatitude() {
        return this.latitude;
    }

    public final double getLongitude() {
        return this.longitude;
    }

    public final void setLatitude(double d) {
        this.latitude = d;
    }

    public final void setLongitude(double d) {
        this.longitude = d;
    }

    public GuitarBundle(double d, double d2) {
        this.latitude = d;
        this.longitude = d2;
    }

    public /* synthetic */ GuitarBundle(double d, double d2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX : d, (i & 2) != 0 ? LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX : d2);
    }
}
