package com.ss.android.ugc.aweme.creative.model;

import X.C41055G9j;
import X.GPV;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class EditPostCheckResult implements Parcelable, Serializable {
    public static final Parcelable.Creator<EditPostCheckResult> CREATOR = new C41055G9j();

    @GPV
    public final boolean isAtFriendEdited;

    @GPV
    public boolean isCoverEdited;

    @GPV
    public final boolean isHashtagEdited;

    @GPV
    public final boolean isHeadingChanged;

    @GPV
    public final boolean isMentionVideoEdited;

    @GPV
    public final boolean isTitleChanged;

    @GPV
    public final EditPostPoiChangeType poiChangedType;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeInt(this.isTitleChanged ? 1 : 0);
        out.writeInt(this.isHashtagEdited ? 1 : 0);
        out.writeInt(this.isAtFriendEdited ? 1 : 0);
        out.writeInt(this.isMentionVideoEdited ? 1 : 0);
        out.writeInt(this.isCoverEdited ? 1 : 0);
        this.poiChangedType.writeToParcel(out, i);
        out.writeInt(this.isHeadingChanged ? 1 : 0);
    }

    public final EditPostPoiChangeType getPoiChangedType() {
        return this.poiChangedType;
    }

    public final boolean isAtFriendEdited() {
        return this.isAtFriendEdited;
    }

    public final boolean isCoverEdited() {
        return this.isCoverEdited;
    }

    public final boolean isHashtagEdited() {
        return this.isHashtagEdited;
    }

    public final boolean isHeadingChanged() {
        return this.isHeadingChanged;
    }

    public final boolean isMentionVideoEdited() {
        return this.isMentionVideoEdited;
    }

    public final boolean isTitleChanged() {
        return this.isTitleChanged;
    }

    public final void setCoverEdited(boolean z) {
        this.isCoverEdited = z;
    }

    public EditPostCheckResult(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, EditPostPoiChangeType poiChangedType, boolean z6) {
        o.LJIIIZ(poiChangedType, "poiChangedType");
        this.isTitleChanged = z;
        this.isHashtagEdited = z2;
        this.isAtFriendEdited = z3;
        this.isMentionVideoEdited = z4;
        this.isCoverEdited = z5;
        this.poiChangedType = poiChangedType;
        this.isHeadingChanged = z6;
    }

    public /* synthetic */ EditPostCheckResult(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, EditPostPoiChangeType editPostPoiChangeType, boolean z6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, z2, z3, z4, z5, (i & 32) != 0 ? EditPostPoiChangeType.UNKNOWN : editPostPoiChangeType, z6);
    }
}
