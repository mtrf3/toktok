package com.ss.android.ugc.aweme.creative.model;

import X.C43559H7r;
import X.F9E;
import X.InterfaceC65349Pkn;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class CreativePublishPermissionModel extends F9E implements Parcelable {
    public static final Parcelable.Creator<CreativePublishPermissionModel> CREATOR = new C43559H7r();

    @InterfaceC65349Pkn("add_story_allowed")
    public boolean add2StoryAllowed;

    public CreativePublishPermissionModel() {
        this(false, 1, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.add2StoryAllowed)};
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeInt(this.add2StoryAllowed ? 1 : 0);
    }

    public CreativePublishPermissionModel(boolean z) {
        this.add2StoryAllowed = z;
    }

    public /* synthetic */ CreativePublishPermissionModel(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z);
    }
}
