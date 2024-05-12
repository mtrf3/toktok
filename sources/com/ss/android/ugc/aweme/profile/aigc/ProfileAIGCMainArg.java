package com.ss.android.ugc.aweme.profile.aigc;

import X.A6U;
import X.C72121SSf;
import X.X1D;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.router.annotation.IRouteArg;
import com.bytedance.router.arg.RouteParser;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class ProfileAIGCMainArg implements IRouteArg {
    public static final Parcelable.Creator<ProfileAIGCMainArg> CREATOR = new A6U();
    public final String aigcEntrance;
    public final String aigcStatus;
    public final C72121SSf avatarResult;
    public final String enterFrom;
    public final String enterMethod;
    public final Boolean introPageWithNavBar;

    /* JADX WARN: Multi-variable type inference failed */
    public ProfileAIGCMainArg() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 63, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ProfileAIGCMainArg(String str) {
        this(str, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 62, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ProfileAIGCMainArg(String str, String str2) {
        this(str, str2, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 60, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ProfileAIGCMainArg(String str, String str2, Boolean bool) {
        this(str, str2, bool, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 56, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ProfileAIGCMainArg(String str, String str2, Boolean bool, String str3) {
        this(str, str2, bool, str3, null, 0 == true ? 1 : 0, 48, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ProfileAIGCMainArg(String str, String str2, Boolean bool, String str3, String str4) {
        this(str, str2, bool, str3, str4, null, 32, 0 == true ? 1 : 0);
    }

    public static ProfileAIGCMainArg __fromBundle(Bundle bundle) {
        int i;
        String str;
        String str2;
        Boolean bool;
        String str3;
        String str4;
        C72121SSf c72121SSf = null;
        if (bundle == null) {
            return null;
        }
        if (bundle.containsKey("aigc_entrance")) {
            str = (String) RouteParser.INSTANCE.parse(bundle.get("aigc_entrance"), String.class);
            i = 0;
        } else {
            i = 1;
            str = null;
        }
        if (bundle.containsKey("aigc_status")) {
            str2 = (String) RouteParser.INSTANCE.parse(bundle.get("aigc_status"), String.class);
        } else {
            i += 2;
            str2 = null;
        }
        if (bundle.containsKey("intro_page_nav_bar")) {
            bool = (Boolean) RouteParser.INSTANCE.parse(bundle.get("intro_page_nav_bar"), Boolean.class);
        } else {
            i += 4;
            bool = null;
        }
        if (bundle.containsKey("enter_from")) {
            str3 = (String) RouteParser.INSTANCE.parse(bundle.get("enter_from"), String.class);
        } else {
            i += 8;
            str3 = null;
        }
        if (bundle.containsKey("enter_method")) {
            str4 = (String) RouteParser.INSTANCE.parse(bundle.get("enter_method"), String.class);
        } else {
            i += 16;
            str4 = null;
        }
        if (bundle.containsKey("avatar_result")) {
            c72121SSf = (C72121SSf) RouteParser.INSTANCE.parse(bundle.get("avatar_result"), C72121SSf.class);
        } else {
            i += 32;
        }
        return new ProfileAIGCMainArg(str, str2, bool, str3, str4, c72121SSf, i, null);
    }

    public static /* synthetic */ ProfileAIGCMainArg copy$default(ProfileAIGCMainArg profileAIGCMainArg, String str, String str2, Boolean bool, String str3, String str4, C72121SSf c72121SSf, int i, Object obj) {
        if ((i & 1) != 0) {
            str = profileAIGCMainArg.aigcEntrance;
        }
        if ((i & 2) != 0) {
            str2 = profileAIGCMainArg.aigcStatus;
        }
        if ((i & 4) != 0) {
            bool = profileAIGCMainArg.introPageWithNavBar;
        }
        if ((i & 8) != 0) {
            str3 = profileAIGCMainArg.enterFrom;
        }
        if ((i & 16) != 0) {
            str4 = profileAIGCMainArg.enterMethod;
        }
        if ((i & 32) != 0) {
            c72121SSf = profileAIGCMainArg.avatarResult;
        }
        return profileAIGCMainArg.copy(str, str2, bool, str3, str4, c72121SSf);
    }

    public final ProfileAIGCMainArg copy(String str, String str2, Boolean bool, String str3, String str4, C72121SSf c72121SSf) {
        return new ProfileAIGCMainArg(str, str2, bool, str3, str4, c72121SSf);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProfileAIGCMainArg)) {
            return false;
        }
        ProfileAIGCMainArg profileAIGCMainArg = (ProfileAIGCMainArg) obj;
        return o.LJ(this.aigcEntrance, profileAIGCMainArg.aigcEntrance) && o.LJ(this.aigcStatus, profileAIGCMainArg.aigcStatus) && o.LJ(this.introPageWithNavBar, profileAIGCMainArg.introPageWithNavBar) && o.LJ(this.enterFrom, profileAIGCMainArg.enterFrom) && o.LJ(this.enterMethod, profileAIGCMainArg.enterMethod) && o.LJ(this.avatarResult, profileAIGCMainArg.avatarResult);
    }

    public int hashCode() {
        String str = this.aigcEntrance;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.aigcStatus;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.introPageWithNavBar;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str3 = this.enterFrom;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.enterMethod;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        C72121SSf c72121SSf = this.avatarResult;
        return hashCode5 + (c72121SSf != null ? c72121SSf.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ProfileAIGCMainArg(aigcEntrance=");
        LIZ.append(this.aigcEntrance);
        LIZ.append(", aigcStatus=");
        LIZ.append(this.aigcStatus);
        LIZ.append(", introPageWithNavBar=");
        LIZ.append(this.introPageWithNavBar);
        LIZ.append(", enterFrom=");
        LIZ.append(this.enterFrom);
        LIZ.append(", enterMethod=");
        LIZ.append(this.enterMethod);
        LIZ.append(", avatarResult=");
        LIZ.append(this.avatarResult);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        int i2;
        o.LJIIIZ(out, "out");
        out.writeString(this.aigcEntrance);
        out.writeString(this.aigcStatus);
        Boolean bool = this.introPageWithNavBar;
        if (bool == null) {
            i2 = 0;
        } else {
            out.writeInt(1);
            i2 = bool.booleanValue();
        }
        out.writeInt(i2);
        out.writeString(this.enterFrom);
        out.writeString(this.enterMethod);
        out.writeSerializable(this.avatarResult);
    }

    public final String getAigcEntrance() {
        return this.aigcEntrance;
    }

    public final String getAigcStatus() {
        return this.aigcStatus;
    }

    public final C72121SSf getAvatarResult() {
        return this.avatarResult;
    }

    public final String getEnterFrom() {
        return this.enterFrom;
    }

    public final String getEnterMethod() {
        return this.enterMethod;
    }

    public final Boolean getIntroPageWithNavBar() {
        return this.introPageWithNavBar;
    }

    public ProfileAIGCMainArg(String str, String str2, Boolean bool, String str3, String str4, C72121SSf c72121SSf) {
        this.aigcEntrance = str;
        this.aigcStatus = str2;
        this.introPageWithNavBar = bool;
        this.enterFrom = str3;
        this.enterMethod = str4;
        this.avatarResult = c72121SSf;
    }

    public /* synthetic */ ProfileAIGCMainArg(String str, String str2, Boolean bool, String str3, String str4, C72121SSf c72121SSf, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : bool, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) == 0 ? c72121SSf : null);
    }
}
