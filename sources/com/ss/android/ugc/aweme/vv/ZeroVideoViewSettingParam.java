package com.ss.android.ugc.aweme.vv;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class ZeroVideoViewSettingParam extends F9E {

    @InterfaceC65349Pkn("enable")
    public final boolean enable;

    /* renamed from: switch, reason: not valid java name */
    @InterfaceC65349Pkn("switch_enable")
    public final boolean f33switch;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ZeroVideoViewSettingParam() {
        /*
            r3 = this;
            r2 = 3
            r1 = 0
            r0 = 0
            r3.<init>(r0, r0, r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.vv.ZeroVideoViewSettingParam.<init>():void");
    }

    public static /* synthetic */ ZeroVideoViewSettingParam copy$default(ZeroVideoViewSettingParam zeroVideoViewSettingParam, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = zeroVideoViewSettingParam.enable;
        }
        if ((i & 2) != 0) {
            z2 = zeroVideoViewSettingParam.f33switch;
        }
        return zeroVideoViewSettingParam.copy(z, z2);
    }

    public final ZeroVideoViewSettingParam copy(boolean z, boolean z2) {
        return new ZeroVideoViewSettingParam(z, z2);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.enable), Boolean.valueOf(this.f33switch)};
    }

    public final boolean getEnable() {
        return this.enable;
    }

    public final boolean getSwitch() {
        return this.f33switch;
    }

    public ZeroVideoViewSettingParam(boolean z, boolean z2) {
        this.enable = z;
        this.f33switch = z2;
    }

    public /* synthetic */ ZeroVideoViewSettingParam(boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? true : z2);
    }
}
