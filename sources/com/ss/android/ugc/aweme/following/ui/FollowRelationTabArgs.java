package com.ss.android.ugc.aweme.following.ui;

import X.C25688A6i;
import X.X1D;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.router.annotation.IRouteArg;
import com.bytedance.router.arg.RouteParser;
import defpackage.q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class FollowRelationTabArgs implements IRouteArg {
    public static final Parcelable.Creator<FollowRelationTabArgs> CREATOR = new C25688A6i();
    public String enterFrom;
    public String followRelationType;
    public String previousPage;
    public String secUid;
    public String uid;

    /* JADX WARN: Multi-variable type inference failed */
    public FollowRelationTabArgs() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 31, 0 == true ? 1 : 0);
    }

    public static FollowRelationTabArgs __fromBundle(Bundle bundle) {
        int i;
        String str;
        String str2;
        String str3;
        String str4;
        String str5 = null;
        if (bundle == null) {
            return null;
        }
        if (bundle.containsKey("uid")) {
            str = (String) RouteParser.INSTANCE.parse(bundle.get("uid"), String.class);
            i = 0;
        } else {
            i = 1;
            str = null;
        }
        if (bundle.containsKey("sec_uid")) {
            str2 = (String) RouteParser.INSTANCE.parse(bundle.get("sec_uid"), String.class);
        } else {
            i += 2;
            str2 = null;
        }
        if (bundle.containsKey("follow_relation_type")) {
            str3 = (String) RouteParser.INSTANCE.parse(bundle.get("follow_relation_type"), String.class);
        } else {
            i += 4;
            str3 = null;
        }
        if (bundle.containsKey("enter_from")) {
            str4 = (String) RouteParser.INSTANCE.parse(bundle.get("enter_from"), String.class);
        } else {
            i += 8;
            str4 = null;
        }
        if (bundle.containsKey("extra_previous_page")) {
            str5 = (String) RouteParser.INSTANCE.parse(bundle.get("extra_previous_page"), String.class);
        } else {
            i += 16;
        }
        return new FollowRelationTabArgs(str, str2, str3, str4, str5, i, null);
    }

    public static /* synthetic */ FollowRelationTabArgs copy$default(FollowRelationTabArgs followRelationTabArgs, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = followRelationTabArgs.uid;
        }
        if ((i & 2) != 0) {
            str2 = followRelationTabArgs.secUid;
        }
        if ((i & 4) != 0) {
            str3 = followRelationTabArgs.followRelationType;
        }
        if ((i & 8) != 0) {
            str4 = followRelationTabArgs.enterFrom;
        }
        if ((i & 16) != 0) {
            str5 = followRelationTabArgs.previousPage;
        }
        return followRelationTabArgs.copy(str, str2, str3, str4, str5);
    }

    public final FollowRelationTabArgs copy(String str, String str2, String str3, String str4, String str5) {
        return new FollowRelationTabArgs(str, str2, str3, str4, str5);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FollowRelationTabArgs)) {
            return false;
        }
        FollowRelationTabArgs followRelationTabArgs = (FollowRelationTabArgs) obj;
        return o.LJ(this.uid, followRelationTabArgs.uid) && o.LJ(this.secUid, followRelationTabArgs.secUid) && o.LJ(this.followRelationType, followRelationTabArgs.followRelationType) && o.LJ(this.enterFrom, followRelationTabArgs.enterFrom) && o.LJ(this.previousPage, followRelationTabArgs.previousPage);
    }

    public int hashCode() {
        String str = this.uid;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.secUid;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.followRelationType;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.enterFrom;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.previousPage;
        return hashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.uid);
        out.writeString(this.secUid);
        out.writeString(this.followRelationType);
        out.writeString(this.enterFrom);
        out.writeString(this.previousPage);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("FollowRelationTabArgs(uid=");
        LIZ.append(this.uid);
        LIZ.append(", secUid=");
        LIZ.append(this.secUid);
        LIZ.append(", followRelationType=");
        LIZ.append(this.followRelationType);
        LIZ.append(", enterFrom=");
        LIZ.append(this.enterFrom);
        LIZ.append(", previousPage=");
        return q.LIZIZ(LIZ, this.previousPage, ')', LIZ);
    }

    public final String getEnterFrom() {
        return this.enterFrom;
    }

    public final String getFollowRelationType() {
        return this.followRelationType;
    }

    public final String getPreviousPage() {
        return this.previousPage;
    }

    public final String getSecUid() {
        return this.secUid;
    }

    public final String getUid() {
        return this.uid;
    }

    public final void setEnterFrom(String str) {
        this.enterFrom = str;
    }

    public final void setFollowRelationType(String str) {
        this.followRelationType = str;
    }

    public final void setPreviousPage(String str) {
        this.previousPage = str;
    }

    public final void setSecUid(String str) {
        this.secUid = str;
    }

    public final void setUid(String str) {
        this.uid = str;
    }

    public FollowRelationTabArgs(String str, String str2, String str3, String str4, String str5) {
        this.uid = str;
        this.secUid = str2;
        this.followRelationType = str3;
        this.enterFrom = str4;
        this.previousPage = str5;
    }

    public /* synthetic */ FollowRelationTabArgs(String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) == 0 ? str5 : null);
    }
}
