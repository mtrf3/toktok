package com.ss.android.ugc.tiktok.tpsc.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.b0;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class PrivacySettingsRestrictionOption implements Serializable {

    @InterfaceC65349Pkn("res_type")
    public final int resType;

    @InterfaceC65349Pkn("show_type")
    public final int showType;

    @InterfaceC65349Pkn("value")
    public final int value;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public PrivacySettingsRestrictionOption() {
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
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.tiktok.tpsc.model.PrivacySettingsRestrictionOption.<init>():void");
    }

    public static /* synthetic */ PrivacySettingsRestrictionOption copy$default(PrivacySettingsRestrictionOption privacySettingsRestrictionOption, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = privacySettingsRestrictionOption.value;
        }
        if ((i4 & 2) != 0) {
            i2 = privacySettingsRestrictionOption.showType;
        }
        if ((i4 & 4) != 0) {
            i3 = privacySettingsRestrictionOption.resType;
        }
        return privacySettingsRestrictionOption.copy(i, i2, i3);
    }

    public final PrivacySettingsRestrictionOption copy(int i, int i2, int i3) {
        return new PrivacySettingsRestrictionOption(i, i2, i3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PrivacySettingsRestrictionOption)) {
            return false;
        }
        PrivacySettingsRestrictionOption privacySettingsRestrictionOption = (PrivacySettingsRestrictionOption) obj;
        return this.value == privacySettingsRestrictionOption.value && this.showType == privacySettingsRestrictionOption.showType && this.resType == privacySettingsRestrictionOption.resType;
    }

    public int hashCode() {
        return (((this.value * 31) + this.showType) * 31) + this.resType;
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("{'value':");
        LIZ.append(this.value);
        LIZ.append(", 'show_type':");
        LIZ.append(this.showType);
        LIZ.append(", 'res_type':");
        return b0.LIZJ(LIZ, this.resType, '}', LIZ);
    }

    public final int getResType() {
        return this.resType;
    }

    public final int getShowType() {
        return this.showType;
    }

    public final int getValue() {
        return this.value;
    }

    public PrivacySettingsRestrictionOption(int i, int i2, int i3) {
        this.value = i;
        this.showType = i2;
        this.resType = i3;
    }

    public /* synthetic */ PrivacySettingsRestrictionOption(int i, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? 0 : i2, (i4 & 4) != 0 ? 0 : i3);
    }
}
