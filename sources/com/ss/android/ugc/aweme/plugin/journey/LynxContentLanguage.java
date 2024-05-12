package com.ss.android.ugc.aweme.plugin.journey;

import X.C48339Iy7;
import X.C79062V1e;
import X.InterfaceC65349Pkn;
import X.X1D;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class LynxContentLanguage {

    @InterfaceC65349Pkn("cssColor")
    public final String cssColor;

    @InterfaceC65349Pkn("displayName")
    public final String displayName;

    @InterfaceC65349Pkn("iconUrlString")
    public final String iconUrlString;

    @InterfaceC65349Pkn("languageCode")
    public final String languageCode;

    @InterfaceC65349Pkn("localizedDisplayName")
    public final String localizedDisplayName;

    @InterfaceC65349Pkn("selected")
    public final boolean selected;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LynxContentLanguage)) {
            return false;
        }
        LynxContentLanguage lynxContentLanguage = (LynxContentLanguage) obj;
        return o.LJ(this.localizedDisplayName, lynxContentLanguage.localizedDisplayName) && o.LJ(this.displayName, lynxContentLanguage.displayName) && o.LJ(this.cssColor, lynxContentLanguage.cssColor) && o.LJ(this.iconUrlString, lynxContentLanguage.iconUrlString) && o.LJ(this.languageCode, lynxContentLanguage.languageCode) && this.selected == lynxContentLanguage.selected;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = this.localizedDisplayName.hashCode() * 31;
        String str = this.displayName;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (hashCode3 + hashCode) * 31;
        String str2 = this.cssColor;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        String str3 = this.iconUrlString;
        if (str3 != null) {
            i = str3.hashCode();
        }
        int LJ = C79062V1e.LJ(this.languageCode, (i3 + i) * 31, 31);
        boolean z = this.selected;
        int i4 = z;
        if (z != 0) {
            i4 = 1;
        }
        return LJ + i4;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LynxContentLanguage(localizedDisplayName=");
        LIZ.append(this.localizedDisplayName);
        LIZ.append(", displayName=");
        LIZ.append(this.displayName);
        LIZ.append(", cssColor=");
        LIZ.append(this.cssColor);
        LIZ.append(", iconUrlString=");
        LIZ.append(this.iconUrlString);
        LIZ.append(", languageCode=");
        LIZ.append(this.languageCode);
        LIZ.append(", selected=");
        return C48339Iy7.LIZJ(LIZ, this.selected, ')', LIZ);
    }

    public LynxContentLanguage(String localizedDisplayName, String str, String str2, String str3, String languageCode, boolean z) {
        o.LJIIIZ(localizedDisplayName, "localizedDisplayName");
        o.LJIIIZ(languageCode, "languageCode");
        this.localizedDisplayName = localizedDisplayName;
        this.displayName = str;
        this.cssColor = str2;
        this.iconUrlString = str3;
        this.languageCode = languageCode;
        this.selected = z;
    }

    public /* synthetic */ LynxContentLanguage(String str, String str2, String str3, String str4, String str5, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : str3, (i & 8) == 0 ? str4 : null, str5, z);
    }
}
