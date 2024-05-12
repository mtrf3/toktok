package com.ss.android.ugc.aweme.addyours.model;

import X.C1FJ;
import X.InterfaceC65349Pkn;
import X.UC7;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.addyours.model.AddYourRecordParam;
import com.ss.android.ugc.aweme.addyours.model.AddYoursStickerStruct;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class AddYourRecordParam implements Parcelable, Serializable {
    public static final Parcelable.Creator<AddYourRecordParam> CREATOR = new Parcelable.Creator<AddYourRecordParam>() { // from class: X.8lT
        @Override // android.os.Parcelable.Creator
        public final AddYourRecordParam createFromParcel(Parcel parcel) {
            AddYoursStickerStruct createFromParcel;
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            o.LJIIIZ(parcel, "parcel");
            Integer num = null;
            if (parcel.readInt() == 0) {
                createFromParcel = null;
            } else {
                createFromParcel = AddYoursStickerStruct.CREATOR.createFromParcel(parcel);
            }
            AddYoursStickerStruct addYoursStickerStruct = createFromParcel;
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            if (parcel.readInt() != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            if (parcel.readInt() != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (parcel.readInt() != 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            String readString5 = parcel.readString();
            String readString6 = parcel.readString();
            if (parcel.readInt() != 0) {
                num = Integer.valueOf(parcel.readInt());
            }
            return new AddYourRecordParam(addYoursStickerStruct, z, z2, readString, readString2, readString3, readString4, z3, z4, readString5, readString6, num);
        }

        @Override // android.os.Parcelable.Creator
        public final AddYourRecordParam[] newArray(int i) {
            return new AddYourRecordParam[i];
        }
    };

    @InterfaceC65349Pkn("addYoursEnterMethod")
    public final String addYoursEnterMethod;

    @InterfaceC65349Pkn("addYoursStickerStruct")
    public AddYoursStickerStruct addYoursStickerStruct;

    @InterfaceC65349Pkn("autoEnterAlbum")
    public final boolean autoEnterAlbum;

    @InterfaceC65349Pkn("autoEnterStickerEdit")
    public final boolean autoEnterStickerEdit;

    @InterfaceC65349Pkn("enterFrom")
    public final String enterFrom;

    @InterfaceC65349Pkn("followStatus")
    public final String followStatus;

    @InterfaceC65349Pkn("from_group_id")
    public final String fromGroupId;

    @InterfaceC65349Pkn("isFollowAY")
    public final boolean isFollowAY;

    @InterfaceC65349Pkn("isFromQA")
    public final boolean isFromQA;

    @InterfaceC65349Pkn("is_operation_set")
    public final Integer isOperationSet;

    @InterfaceC65349Pkn("shootWay")
    public final String shootWay;

    @InterfaceC65349Pkn("topic_id")
    public final String topicId;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AddYourRecordParam() {
        /*
            r15 = this;
            r1 = 0
            r2 = 0
            r13 = 4095(0xfff, float:5.738E-42)
            r0 = r15
            r3 = r2
            r4 = r1
            r5 = r1
            r6 = r1
            r7 = r1
            r8 = r2
            r9 = r2
            r10 = r1
            r11 = r1
            r12 = r1
            r14 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.addyours.model.AddYourRecordParam.<init>():void");
    }

    public static /* synthetic */ AddYourRecordParam copy$default(AddYourRecordParam addYourRecordParam, AddYoursStickerStruct addYoursStickerStruct, boolean z, boolean z2, String str, String str2, String str3, String str4, boolean z3, boolean z4, String str5, String str6, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            addYoursStickerStruct = addYourRecordParam.addYoursStickerStruct;
        }
        if ((i & 2) != 0) {
            z = addYourRecordParam.autoEnterStickerEdit;
        }
        if ((i & 4) != 0) {
            z2 = addYourRecordParam.autoEnterAlbum;
        }
        if ((i & 8) != 0) {
            str = addYourRecordParam.enterFrom;
        }
        if ((i & 16) != 0) {
            str2 = addYourRecordParam.shootWay;
        }
        if ((i & 32) != 0) {
            str3 = addYourRecordParam.addYoursEnterMethod;
        }
        if ((i & 64) != 0) {
            str4 = addYourRecordParam.followStatus;
        }
        if ((i & 128) != 0) {
            z3 = addYourRecordParam.isFollowAY;
        }
        if ((i & 256) != 0) {
            z4 = addYourRecordParam.isFromQA;
        }
        if ((i & 512) != 0) {
            str5 = addYourRecordParam.fromGroupId;
        }
        if ((i & 1024) != 0) {
            str6 = addYourRecordParam.topicId;
        }
        if ((i & 2048) != 0) {
            num = addYourRecordParam.isOperationSet;
        }
        return addYourRecordParam.copy(addYoursStickerStruct, z, z2, str, str2, str3, str4, z3, z4, str5, str6, num);
    }

    public final AddYourRecordParam copy(AddYoursStickerStruct addYoursStickerStruct, boolean z, boolean z2, String str, String str2, String str3, String str4, boolean z3, boolean z4, String str5, String str6, Integer num) {
        return new AddYourRecordParam(addYoursStickerStruct, z, z2, str, str2, str3, str4, z3, z4, str5, str6, num);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddYourRecordParam)) {
            return false;
        }
        AddYourRecordParam addYourRecordParam = (AddYourRecordParam) obj;
        return o.LJ(this.addYoursStickerStruct, addYourRecordParam.addYoursStickerStruct) && this.autoEnterStickerEdit == addYourRecordParam.autoEnterStickerEdit && this.autoEnterAlbum == addYourRecordParam.autoEnterAlbum && o.LJ(this.enterFrom, addYourRecordParam.enterFrom) && o.LJ(this.shootWay, addYourRecordParam.shootWay) && o.LJ(this.addYoursEnterMethod, addYourRecordParam.addYoursEnterMethod) && o.LJ(this.followStatus, addYourRecordParam.followStatus) && this.isFollowAY == addYourRecordParam.isFollowAY && this.isFromQA == addYourRecordParam.isFromQA && o.LJ(this.fromGroupId, addYourRecordParam.fromGroupId) && o.LJ(this.topicId, addYourRecordParam.topicId) && o.LJ(this.isOperationSet, addYourRecordParam.isOperationSet);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        AddYoursStickerStruct addYoursStickerStruct = this.addYoursStickerStruct;
        int hashCode = (addYoursStickerStruct == null ? 0 : addYoursStickerStruct.hashCode()) * 31;
        boolean z = this.autoEnterStickerEdit;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode + i) * 31;
        boolean z2 = this.autoEnterAlbum;
        int i3 = z2;
        if (z2 != 0) {
            i3 = 1;
        }
        int i4 = (i2 + i3) * 31;
        String str = this.enterFrom;
        int hashCode2 = (i4 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.shootWay;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.addYoursEnterMethod;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.followStatus;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        boolean z3 = this.isFollowAY;
        int i5 = z3;
        if (z3 != 0) {
            i5 = 1;
        }
        int i6 = (((hashCode5 + i5) * 31) + (this.isFromQA ? 1 : 0)) * 31;
        String str5 = this.fromGroupId;
        int hashCode6 = (i6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.topicId;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Integer num = this.isOperationSet;
        return hashCode7 + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AddYourRecordParam(addYoursStickerStruct=");
        sb.append(this.addYoursStickerStruct);
        sb.append(", autoEnterStickerEdit=");
        sb.append(this.autoEnterStickerEdit);
        sb.append(", autoEnterAlbum=");
        sb.append(this.autoEnterAlbum);
        sb.append(", enterFrom=");
        sb.append(this.enterFrom);
        sb.append(", shootWay=");
        sb.append(this.shootWay);
        sb.append(", addYoursEnterMethod=");
        sb.append(this.addYoursEnterMethod);
        sb.append(", followStatus=");
        sb.append(this.followStatus);
        sb.append(", isFollowAY=");
        sb.append(this.isFollowAY);
        sb.append(", isFromQA=");
        sb.append(this.isFromQA);
        sb.append(", fromGroupId=");
        sb.append(this.fromGroupId);
        sb.append(", topicId=");
        sb.append(this.topicId);
        sb.append(", isOperationSet=");
        return UC7.LIZ(sb, this.isOperationSet, ')');
    }

    public final String getAddYoursEnterMethod() {
        return this.addYoursEnterMethod;
    }

    public final AddYoursStickerStruct getAddYoursStickerStruct() {
        return this.addYoursStickerStruct;
    }

    public final boolean getAutoEnterAlbum() {
        return this.autoEnterAlbum;
    }

    public final boolean getAutoEnterStickerEdit() {
        return this.autoEnterStickerEdit;
    }

    public final String getEnterFrom() {
        return this.enterFrom;
    }

    public final String getFollowStatus() {
        return this.followStatus;
    }

    public final String getFromGroupId() {
        return this.fromGroupId;
    }

    public final String getShootWay() {
        return this.shootWay;
    }

    public final String getTopicId() {
        return this.topicId;
    }

    public final boolean isFollowAY() {
        return this.isFollowAY;
    }

    public final boolean isFromQA() {
        return this.isFromQA;
    }

    public final Integer isOperationSet() {
        return this.isOperationSet;
    }

    public final void setAddYoursStickerStruct(AddYoursStickerStruct addYoursStickerStruct) {
        this.addYoursStickerStruct = addYoursStickerStruct;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        AddYoursStickerStruct addYoursStickerStruct = this.addYoursStickerStruct;
        if (addYoursStickerStruct == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            addYoursStickerStruct.writeToParcel(out, i);
        }
        out.writeInt(this.autoEnterStickerEdit ? 1 : 0);
        out.writeInt(this.autoEnterAlbum ? 1 : 0);
        out.writeString(this.enterFrom);
        out.writeString(this.shootWay);
        out.writeString(this.addYoursEnterMethod);
        out.writeString(this.followStatus);
        out.writeInt(this.isFollowAY ? 1 : 0);
        out.writeInt(this.isFromQA ? 1 : 0);
        out.writeString(this.fromGroupId);
        out.writeString(this.topicId);
        Integer num = this.isOperationSet;
        if (num == null) {
            out.writeInt(0);
        } else {
            C1FJ.LJ(out, 1, num);
        }
    }

    public AddYourRecordParam(AddYoursStickerStruct addYoursStickerStruct, boolean z, boolean z2, String str, String str2, String str3, String str4, boolean z3, boolean z4, String str5, String str6, Integer num) {
        this.addYoursStickerStruct = addYoursStickerStruct;
        this.autoEnterStickerEdit = z;
        this.autoEnterAlbum = z2;
        this.enterFrom = str;
        this.shootWay = str2;
        this.addYoursEnterMethod = str3;
        this.followStatus = str4;
        this.isFollowAY = z3;
        this.isFromQA = z4;
        this.fromGroupId = str5;
        this.topicId = str6;
        this.isOperationSet = num;
    }

    public /* synthetic */ AddYourRecordParam(AddYoursStickerStruct addYoursStickerStruct, boolean z, boolean z2, String str, String str2, String str3, String str4, boolean z3, boolean z4, String str5, String str6, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : addYoursStickerStruct, (i & 2) != 0 ? false : z, (i & 4) != 0 ? false : z2, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? null : str4, (i & 128) != 0 ? true : z3, (i & 256) != 0 ? false : z4, (i & 512) != 0 ? null : str5, (i & 1024) == 0 ? str6 : null, (i & 2048) != 0 ? 0 : num);
    }
}
