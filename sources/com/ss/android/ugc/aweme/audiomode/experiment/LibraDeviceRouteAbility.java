package com.ss.android.ugc.aweme.audiomode.experiment;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes9.dex */
public final class LibraDeviceRouteAbility extends F9E {

    @InterfaceC65349Pkn("bluetooth")
    public final int outputDeviceBluetoothHeadset;

    @InterfaceC65349Pkn("speaker")
    public final int outputDeviceBuiltinSpeaker;

    @InterfaceC65349Pkn("others")
    public final int outputDeviceOthers;

    @InterfaceC65349Pkn("usb_headset")
    public final int outputDeviceUsbHeadset;

    @InterfaceC65349Pkn("wired_headset")
    public final int outputDeviceWiredHeadset;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public LibraDeviceRouteAbility() {
        /*
            r8 = this;
            r1 = 0
            r6 = 31
            r7 = 0
            r0 = r8
            r2 = r1
            r3 = r1
            r4 = r1
            r5 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.audiomode.experiment.LibraDeviceRouteAbility.<init>():void");
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.outputDeviceBuiltinSpeaker), Integer.valueOf(this.outputDeviceBluetoothHeadset), Integer.valueOf(this.outputDeviceWiredHeadset), Integer.valueOf(this.outputDeviceUsbHeadset), Integer.valueOf(this.outputDeviceOthers)};
    }

    public final int L(int i) {
        if (i != 0) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            return this.outputDeviceOthers;
                        }
                        return this.outputDeviceUsbHeadset;
                    }
                    return this.outputDeviceWiredHeadset;
                }
                return this.outputDeviceOthers;
            }
            return this.outputDeviceBluetoothHeadset;
        }
        return this.outputDeviceBuiltinSpeaker;
    }

    public LibraDeviceRouteAbility(int i, int i2, int i3, int i4, int i5) {
        this.outputDeviceBuiltinSpeaker = i;
        this.outputDeviceBluetoothHeadset = i2;
        this.outputDeviceWiredHeadset = i3;
        this.outputDeviceUsbHeadset = i4;
        this.outputDeviceOthers = i5;
    }

    public /* synthetic */ LibraDeviceRouteAbility(int i, int i2, int i3, int i4, int i5, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this((i6 & 1) != 0 ? 2 : i, (i6 & 2) != 0 ? 2 : i2, (i6 & 4) != 0 ? 2 : i3, (i6 & 8) != 0 ? 3 : i4, (i6 & 16) != 0 ? 2 : i5);
    }
}
