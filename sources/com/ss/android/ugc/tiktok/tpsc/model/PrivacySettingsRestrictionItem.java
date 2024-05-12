package com.ss.android.ugc.tiktok.tpsc.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.b0;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class PrivacySettingsRestrictionItem implements Serializable {

    @InterfaceC65349Pkn("default_value")
    public final int defaultValue;

    @InterfaceC65349Pkn("res_type")
    public final int resType;

    @InterfaceC65349Pkn("show_type")
    public final int showType;

    @InterfaceC65349Pkn("tips_type")
    public final int tipsType;

    @InterfaceC65349Pkn("values")
    public final List<PrivacySettingsRestrictionOption> values;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public PrivacySettingsRestrictionItem() {
        /*
            r8 = this;
            r1 = 0
            r3 = 0
            r6 = 31
            r0 = r8
            r2 = r1
            r4 = r1
            r5 = r1
            r7 = r3
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.tiktok.tpsc.model.PrivacySettingsRestrictionItem.<init>():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PrivacySettingsRestrictionItem copy$default(PrivacySettingsRestrictionItem privacySettingsRestrictionItem, int i, int i2, List list, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = privacySettingsRestrictionItem.showType;
        }
        if ((i5 & 2) != 0) {
            i2 = privacySettingsRestrictionItem.resType;
        }
        if ((i5 & 4) != 0) {
            list = privacySettingsRestrictionItem.values;
        }
        if ((i5 & 8) != 0) {
            i3 = privacySettingsRestrictionItem.tipsType;
        }
        if ((i5 & 16) != 0) {
            i4 = privacySettingsRestrictionItem.defaultValue;
        }
        return privacySettingsRestrictionItem.copy(i, i2, list, i3, i4);
    }

    public final PrivacySettingsRestrictionItem copy(int i, int i2, List<PrivacySettingsRestrictionOption> list, int i3, int i4) {
        return new PrivacySettingsRestrictionItem(i, i2, list, i3, i4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PrivacySettingsRestrictionItem)) {
            return false;
        }
        PrivacySettingsRestrictionItem privacySettingsRestrictionItem = (PrivacySettingsRestrictionItem) obj;
        return this.showType == privacySettingsRestrictionItem.showType && this.resType == privacySettingsRestrictionItem.resType && o.LJ(this.values, privacySettingsRestrictionItem.values) && this.tipsType == privacySettingsRestrictionItem.tipsType && this.defaultValue == privacySettingsRestrictionItem.defaultValue;
    }

    public int hashCode() {
        int i = ((this.showType * 31) + this.resType) * 31;
        List<PrivacySettingsRestrictionOption> list = this.values;
        return ((((i + (list == null ? 0 : list.hashCode())) * 31) + this.tipsType) * 31) + this.defaultValue;
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("{'show_type':");
        LIZ.append(this.showType);
        LIZ.append(", 'res_type':");
        LIZ.append(this.resType);
        LIZ.append(", 'values':");
        LIZ.append(this.values);
        LIZ.append(", 'tips_type':");
        return b0.LIZJ(LIZ, this.tipsType, '}', LIZ);
    }

    public final int getDefaultValue() {
        return this.defaultValue;
    }

    public final int getResType() {
        return this.resType;
    }

    public final int getShowType() {
        return this.showType;
    }

    public final int getTipsType() {
        return this.tipsType;
    }

    public final List<PrivacySettingsRestrictionOption> getValues() {
        return this.values;
    }

    public PrivacySettingsRestrictionItem(int i, int i2, List<PrivacySettingsRestrictionOption> list, int i3, int i4) {
        this.showType = i;
        this.resType = i2;
        this.values = list;
        this.tipsType = i3;
        this.defaultValue = i4;
    }

    public /* synthetic */ PrivacySettingsRestrictionItem(int i, int i2, List list, int i3, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? 0 : i, (i5 & 2) != 0 ? 0 : i2, (i5 & 4) != 0 ? null : list, (i5 & 8) == 0 ? i3 : 0, (i5 & 16) != 0 ? 2 : i4);
    }
}
