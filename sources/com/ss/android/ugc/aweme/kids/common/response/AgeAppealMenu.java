package com.ss.android.ugc.aweme.kids.common.response;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class AgeAppealMenu {

    @InterfaceC65349Pkn("appeal_date")
    public final String appealDate;

    @InterfaceC65349Pkn("url")
    public final String appealURL;

    @InterfaceC65349Pkn("show_age_appeal_menu")
    public final boolean showAgeAppealMenu;

    @InterfaceC65349Pkn("show_icon")
    public final boolean showIcon;

    public static /* synthetic */ AgeAppealMenu copy$default(AgeAppealMenu ageAppealMenu, boolean z, boolean z2, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = ageAppealMenu.showAgeAppealMenu;
        }
        if ((i & 2) != 0) {
            z2 = ageAppealMenu.showIcon;
        }
        if ((i & 4) != 0) {
            str = ageAppealMenu.appealURL;
        }
        if ((i & 8) != 0) {
            str2 = ageAppealMenu.appealDate;
        }
        return ageAppealMenu.copy(z, z2, str, str2);
    }

    public final AgeAppealMenu copy(boolean z, boolean z2, String str, String str2) {
        return new AgeAppealMenu(z, z2, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AgeAppealMenu)) {
            return false;
        }
        AgeAppealMenu ageAppealMenu = (AgeAppealMenu) obj;
        return this.showAgeAppealMenu == ageAppealMenu.showAgeAppealMenu && this.showIcon == ageAppealMenu.showIcon && o.LJ(this.appealURL, ageAppealMenu.appealURL) && o.LJ(this.appealDate, ageAppealMenu.appealDate);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    public int hashCode() {
        boolean z = this.showAgeAppealMenu;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = ((r0 * 31) + (this.showIcon ? 1 : 0)) * 31;
        String str = this.appealURL;
        int hashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.appealDate;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AgeAppealMenu(showAgeAppealMenu=");
        LIZ.append(this.showAgeAppealMenu);
        LIZ.append(", showIcon=");
        LIZ.append(this.showIcon);
        LIZ.append(", appealURL=");
        LIZ.append(this.appealURL);
        LIZ.append(", appealDate=");
        return q.LIZIZ(LIZ, this.appealDate, ')', LIZ);
    }

    public final String getAppealDate() {
        return this.appealDate;
    }

    public final String getAppealURL() {
        return this.appealURL;
    }

    public final boolean getShowAgeAppealMenu() {
        return this.showAgeAppealMenu;
    }

    public final boolean getShowIcon() {
        return this.showIcon;
    }

    public AgeAppealMenu(boolean z, boolean z2, String str, String str2) {
        this.showAgeAppealMenu = z;
        this.showIcon = z2;
        this.appealURL = str;
        this.appealDate = str2;
    }
}
