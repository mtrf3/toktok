package com.ss.android.ugc.aweme.deeplink;

import X.C41377GLt;
import X.C41378GLu;
import X.X1D;
import android.app.Activity;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.router.annotation.IRouteArg;
import com.bytedance.router.arg.RouteArgExtension;
import com.bytedance.router.arg.RouteParser;
import defpackage.q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class UpdateTipsArgs implements IRouteArg {
    public String urlToGo;
    public String versionRequire;
    public static final C41378GLu Companion = new C41378GLu();
    public static final Parcelable.Creator<UpdateTipsArgs> CREATOR = new C41377GLt();

    /* JADX WARN: Multi-variable type inference failed */
    public UpdateTipsArgs() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static UpdateTipsArgs __fromBundle(Bundle bundle) {
        int i;
        String str;
        String str2;
        DefaultConstructorMarker defaultConstructorMarker = null;
        if (bundle == null) {
            return null;
        }
        if (bundle.containsKey("debug_url")) {
            str = (String) RouteParser.INSTANCE.parse(bundle.get("debug_url"), String.class);
            i = 0;
        } else {
            i = 1;
            str = null;
        }
        if (bundle.containsKey("version_required")) {
            str2 = (String) RouteParser.INSTANCE.parse(bundle.get("version_required"), String.class);
        } else {
            i += 2;
            str2 = null;
        }
        return new UpdateTipsArgs(str, str2, i, defaultConstructorMarker);
    }

    public static /* synthetic */ UpdateTipsArgs copy$default(UpdateTipsArgs updateTipsArgs, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = updateTipsArgs.urlToGo;
        }
        if ((i & 2) != 0) {
            str2 = updateTipsArgs.versionRequire;
        }
        return updateTipsArgs.copy(str, str2);
    }

    public final UpdateTipsArgs copy(String str, String str2) {
        return new UpdateTipsArgs(str, str2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UpdateTipsArgs)) {
            return false;
        }
        UpdateTipsArgs updateTipsArgs = (UpdateTipsArgs) obj;
        return o.LJ(this.urlToGo, updateTipsArgs.urlToGo) && o.LJ(this.versionRequire, updateTipsArgs.versionRequire);
    }

    public int hashCode() {
        String str = this.urlToGo;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.versionRequire;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.urlToGo);
        out.writeString(this.versionRequire);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("UpdateTipsArgs(urlToGo=");
        LIZ.append(this.urlToGo);
        LIZ.append(", versionRequire=");
        return q.LIZIZ(LIZ, this.versionRequire, ')', LIZ);
    }

    public final String getUrlToGo() {
        return this.urlToGo;
    }

    public final String getVersionRequire() {
        return this.versionRequire;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final UpdateTipsArgs getOrNew(Activity activity) {
        Companion.getClass();
        o.LJIIIZ(activity, "activity");
        UpdateTipsArgs updateTipsArgs = (UpdateTipsArgs) RouteArgExtension.INSTANCE.navArg(activity).getValue();
        if (updateTipsArgs == null) {
            return new UpdateTipsArgs(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }
        return updateTipsArgs;
    }

    public final void setUrlToGo(String str) {
        this.urlToGo = str;
    }

    public final void setVersionRequire(String str) {
        this.versionRequire = str;
    }

    public UpdateTipsArgs(String str, String str2) {
        this.urlToGo = str;
        this.versionRequire = str2;
    }

    public /* synthetic */ UpdateTipsArgs(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
    }
}
