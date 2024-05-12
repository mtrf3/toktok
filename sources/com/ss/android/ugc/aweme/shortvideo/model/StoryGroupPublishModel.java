package com.ss.android.ugc.aweme.shortvideo.model;

import X.F9E;
import X.InterfaceC65349Pkn;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class StoryGroupPublishModel extends F9E implements Parcelable {
    public static final Parcelable.Creator<StoryGroupPublishModel> CREATOR = new Creator();

    @InterfaceC65349Pkn("childCount")
    public final int childCount;

    @InterfaceC65349Pkn("childIndex")
    public final int childIndex;

    @InterfaceC65349Pkn("groupId")
    public final String groupId;

    @InterfaceC65349Pkn("scheduleCount")
    public final int scheduleCount;

    @InterfaceC65349Pkn("scheduleIndex")
    public final int scheduleIndex;

    /* loaded from: classes8.dex */
    public static final class Creator implements Parcelable.Creator<StoryGroupPublishModel> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final StoryGroupPublishModel createFromParcel(Parcel parcel) {
            o.LJIIIZ(parcel, "parcel");
            return new StoryGroupPublishModel(parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final StoryGroupPublishModel[] newArray(int i) {
            return new StoryGroupPublishModel[i];
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public StoryGroupPublishModel() {
        /*
            r8 = this;
            r1 = 0
            r2 = 0
            r6 = 31
            r0 = r8
            r3 = r2
            r4 = r2
            r5 = r2
            r7 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.model.StoryGroupPublishModel.<init>():void");
    }

    public static /* synthetic */ StoryGroupPublishModel copy$default(StoryGroupPublishModel storyGroupPublishModel, String str, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            str = storyGroupPublishModel.groupId;
        }
        if ((i5 & 2) != 0) {
            i = storyGroupPublishModel.childCount;
        }
        if ((i5 & 4) != 0) {
            i2 = storyGroupPublishModel.childIndex;
        }
        if ((i5 & 8) != 0) {
            i3 = storyGroupPublishModel.scheduleCount;
        }
        if ((i5 & 16) != 0) {
            i4 = storyGroupPublishModel.scheduleIndex;
        }
        return storyGroupPublishModel.copy(str, i, i2, i3, i4);
    }

    public final StoryGroupPublishModel copy(String groupId, int i, int i2, int i3, int i4) {
        o.LJIIIZ(groupId, "groupId");
        return new StoryGroupPublishModel(groupId, i, i2, i3, i4);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.groupId, Integer.valueOf(this.childCount), Integer.valueOf(this.childIndex), Integer.valueOf(this.scheduleCount), Integer.valueOf(this.scheduleIndex)};
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.groupId);
        out.writeInt(this.childCount);
        out.writeInt(this.childIndex);
        out.writeInt(this.scheduleCount);
        out.writeInt(this.scheduleIndex);
    }

    public StoryGroupPublishModel(String groupId, int i, int i2, int i3, int i4) {
        o.LJIIIZ(groupId, "groupId");
        this.groupId = groupId;
        this.childCount = i;
        this.childIndex = i2;
        this.scheduleCount = i3;
        this.scheduleIndex = i4;
    }

    public /* synthetic */ StoryGroupPublishModel(String str, int i, int i2, int i3, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? "" : str, (i5 & 2) != 0 ? 1 : i, (i5 & 4) != 0 ? 0 : i2, (i5 & 8) == 0 ? i3 : 1, (i5 & 16) == 0 ? i4 : 0);
    }
}
