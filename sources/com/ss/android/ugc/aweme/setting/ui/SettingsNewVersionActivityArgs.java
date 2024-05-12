package com.ss.android.ugc.aweme.setting.ui;

import X.C41383GLz;
import X.X1D;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.router.annotation.IRouteArg;
import com.bytedance.router.arg.RouteParser;
import defpackage.q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class SettingsNewVersionActivityArgs implements IRouteArg {
    public final String enterFrom;
    public final String enterMethod;
    public static final Parcelable.Creator<SettingsNewVersionActivityArgs> CREATOR = new C41383GLz();
    public static final int $stable = 8;

    /* JADX WARN: Multi-variable type inference failed */
    public SettingsNewVersionActivityArgs() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static SettingsNewVersionActivityArgs __fromBundle(Bundle bundle) {
        int i;
        String str;
        String str2;
        DefaultConstructorMarker defaultConstructorMarker = null;
        if (bundle == null) {
            return null;
        }
        if (bundle.containsKey("enter_from")) {
            str = (String) RouteParser.INSTANCE.parse(bundle.get("enter_from"), String.class);
            i = 0;
        } else {
            i = 1;
            str = null;
        }
        if (bundle.containsKey("enter_method")) {
            str2 = (String) RouteParser.INSTANCE.parse(bundle.get("enter_method"), String.class);
        } else {
            i += 2;
            str2 = null;
        }
        return new SettingsNewVersionActivityArgs(str, str2, i, defaultConstructorMarker);
    }

    public static /* synthetic */ SettingsNewVersionActivityArgs copy$default(SettingsNewVersionActivityArgs settingsNewVersionActivityArgs, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = settingsNewVersionActivityArgs.enterFrom;
        }
        if ((i & 2) != 0) {
            str2 = settingsNewVersionActivityArgs.enterMethod;
        }
        return settingsNewVersionActivityArgs.copy(str, str2);
    }

    public final SettingsNewVersionActivityArgs copy(String str, String str2) {
        return new SettingsNewVersionActivityArgs(str, str2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SettingsNewVersionActivityArgs)) {
            return false;
        }
        SettingsNewVersionActivityArgs settingsNewVersionActivityArgs = (SettingsNewVersionActivityArgs) obj;
        return o.LJ(this.enterFrom, settingsNewVersionActivityArgs.enterFrom) && o.LJ(this.enterMethod, settingsNewVersionActivityArgs.enterMethod);
    }

    public int hashCode() {
        String str = this.enterFrom;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.enterMethod;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.enterFrom);
        out.writeString(this.enterMethod);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SettingsNewVersionActivityArgs(enterFrom=");
        LIZ.append(this.enterFrom);
        LIZ.append(", enterMethod=");
        return q.LIZIZ(LIZ, this.enterMethod, ')', LIZ);
    }

    public final String getEnterFrom() {
        return this.enterFrom;
    }

    public final String getEnterMethod() {
        return this.enterMethod;
    }

    public SettingsNewVersionActivityArgs(String str, String str2) {
        this.enterFrom = str;
        this.enterMethod = str2;
    }

    public /* synthetic */ SettingsNewVersionActivityArgs(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
    }
}
