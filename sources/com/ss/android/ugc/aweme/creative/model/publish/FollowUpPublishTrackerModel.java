package com.ss.android.ugc.aweme.creative.model.publish;

import X.C43556H7o;
import X.InterfaceC65349Pkn;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class FollowUpPublishTrackerModel implements Parcelable {
    public static final Parcelable.Creator<FollowUpPublishTrackerModel> CREATOR = new C43556H7o();

    @InterfaceC65349Pkn("enter_record_from_feed")
    public boolean enterRecordFromFeed;

    @InterfaceC65349Pkn("follow_up_first_item_id")
    public String followUpFirstItemId;

    @InterfaceC65349Pkn("follow_up_item_id_groups")
    public String followUpItemIdGroups;

    /* JADX WARN: Multi-variable type inference failed */
    public FollowUpPublishTrackerModel() {
        this(null, 0 == true ? 1 : 0, false, 7, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.followUpFirstItemId);
        out.writeString(this.followUpItemIdGroups);
        out.writeInt(this.enterRecordFromFeed ? 1 : 0);
    }

    public FollowUpPublishTrackerModel(String str, String str2, boolean z) {
        this.followUpFirstItemId = str;
        this.followUpItemIdGroups = str2;
        this.enterRecordFromFeed = z;
    }

    public /* synthetic */ FollowUpPublishTrackerModel(String str, String str2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? false : z);
    }
}
