package defpackage;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes16.dex */
public final class PasskeyFrequencySettingsModel extends F9E {

    @InterfaceC65349Pkn("cool_down")
    public int coolDown;

    @InterfaceC65349Pkn("impressions")
    public int impressions;

    @InterfaceC65349Pkn("time_frame")
    public int timeFrame;

    /* loaded from: classes16.dex */
    public static final class a {
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public PasskeyFrequencySettingsModel() {
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.PasskeyFrequencySettingsModel.<init>():void");
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.coolDown), Integer.valueOf(this.impressions), Integer.valueOf(this.timeFrame)};
    }

    public PasskeyFrequencySettingsModel(int i, int i2, int i3) {
        this.coolDown = i;
        this.impressions = i2;
        this.timeFrame = i3;
    }

    public /* synthetic */ PasskeyFrequencySettingsModel(int i, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? Integer.MAX_VALUE : i, (i4 & 2) != 0 ? -1 : i2, (i4 & 4) != 0 ? -1 : i3);
    }
}
