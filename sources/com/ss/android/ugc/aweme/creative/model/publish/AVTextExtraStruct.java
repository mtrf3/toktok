package com.ss.android.ugc.aweme.creative.model.publish;

import X.C07670Rv;
import X.GS4;
import X.InterfaceC65349Pkn;
import Y.IDCreatorS51S0000000_7;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.io.Serializable;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class AVTextExtraStruct implements Parcelable, Serializable, Cloneable {

    @InterfaceC65349Pkn("at_user_type")
    public String atUserType;

    @InterfaceC65349Pkn("aweme_id")
    public String awemeId;
    public String cid;

    @InterfaceC65349Pkn("end")
    public int end;

    @InterfaceC65349Pkn("hashtag_name")
    public String hashTagName;
    public boolean isDuet;

    @InterfaceC65349Pkn("is_preset")
    public boolean isPreset;
    public boolean isTransient;

    @InterfaceC65349Pkn("line_idx")
    public int lineIndex;

    @InterfaceC65349Pkn("sec_uid")
    public String secUid;

    @InterfaceC65349Pkn("start")
    public int start;

    @InterfaceC65349Pkn("sub_type")
    public int subType;

    @InterfaceC65349Pkn("tag_id")
    public String tagId;

    @InterfaceC65349Pkn("type")
    public int type;

    @InterfaceC65349Pkn("user_id")
    public String userId;
    public static final GS4 Companion = new GS4();
    public static final Parcelable.Creator<AVTextExtraStruct> CREATOR = new IDCreatorS51S0000000_7(1);

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public AVTextExtraStruct m107clone() {
        AVTextExtraStruct aVTextExtraStruct = new AVTextExtraStruct();
        aVTextExtraStruct.start = this.start;
        aVTextExtraStruct.end = this.end;
        aVTextExtraStruct.userId = this.userId;
        aVTextExtraStruct.type = this.type;
        aVTextExtraStruct.atUserType = this.atUserType;
        aVTextExtraStruct.hashTagName = this.hashTagName;
        aVTextExtraStruct.awemeId = this.awemeId;
        aVTextExtraStruct.subType = this.subType;
        aVTextExtraStruct.secUid = this.secUid;
        aVTextExtraStruct.lineIndex = this.lineIndex;
        aVTextExtraStruct.isTransient = this.isTransient;
        aVTextExtraStruct.isPreset = this.isPreset;
        return aVTextExtraStruct;
    }

    public int hashCode() {
        int i;
        int i2;
        String str = this.userId;
        int i3 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i4 = ((i * 31) + this.type + this.subType) * 31;
        String str2 = this.atUserType;
        if (str2 != null) {
            i2 = str2.hashCode();
        } else {
            i2 = 0;
        }
        int i5 = (i4 + i2) * 31;
        String str3 = this.hashTagName;
        if (str3 != null) {
            i3 = str3.hashCode();
        }
        return i5 + i3;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AVTextExtraStruct(start=");
        sb.append(this.start);
        sb.append(", end=");
        sb.append(this.end);
        sb.append(", userId=");
        sb.append(this.userId);
        sb.append(", type=");
        sb.append(this.type);
        sb.append(", atUserType=");
        sb.append(this.atUserType);
        sb.append(", hashTagName=");
        sb.append(this.hashTagName);
        sb.append(", awemeId=");
        sb.append(this.awemeId);
        sb.append(", subType=");
        sb.append(this.subType);
        sb.append(", secUid=");
        sb.append(this.secUid);
        sb.append(", lineIndex=");
        sb.append(this.lineIndex);
        sb.append(", isDuet=");
        sb.append(this.isDuet);
        sb.append(", isTransient=");
        sb.append(this.isTransient);
        sb.append(", isPreset=");
        sb.append(this.isPreset);
        sb.append(", tagId=");
        sb.append(this.tagId);
        sb.append(", cid=");
        return C07670Rv.LIZIZ(sb, this.cid, ')');
    }

    public AVTextExtraStruct() {
    }

    public final int getLineIndex() {
        return this.lineIndex;
    }

    public final String getSecUid() {
        return this.secUid;
    }

    public final String getTagId() {
        return this.tagId;
    }

    public final boolean isDuet() {
        return this.isDuet;
    }

    public final boolean isPreset() {
        return this.isPreset;
    }

    public final boolean isTransient() {
        return this.isTransient;
    }

    public AVTextExtraStruct(Parcel in) {
        boolean z;
        boolean z2;
        o.LJIIIZ(in, "in");
        this.start = in.readInt();
        this.end = in.readInt();
        this.userId = in.readString();
        this.type = in.readInt();
        this.atUserType = in.readString();
        this.hashTagName = in.readString();
        this.awemeId = in.readString();
        this.subType = in.readInt();
        this.secUid = in.readString();
        this.lineIndex = in.readInt();
        this.tagId = in.readString();
        if (in.readInt() == 1) {
            z = true;
        } else {
            z = false;
        }
        this.isTransient = z;
        if (in.readInt() == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.isPreset = z2;
        this.isDuet = in.readInt() == 1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AVTextExtraStruct)) {
            return false;
        }
        AVTextExtraStruct aVTextExtraStruct = (AVTextExtraStruct) obj;
        if (this.type != aVTextExtraStruct.type || this.subType != aVTextExtraStruct.subType || !o.LJ(this.userId, aVTextExtraStruct.userId) || !TextUtils.equals(this.hashTagName, aVTextExtraStruct.hashTagName)) {
            return false;
        }
        return o.LJ(this.atUserType, aVTextExtraStruct.atUserType);
    }

    public final void setDuet(boolean z) {
        this.isDuet = z;
    }

    public final void setLineIndex(int i) {
        this.lineIndex = i;
    }

    public final void setPreset(boolean z) {
        this.isPreset = z;
    }

    public final void setSecUid(String str) {
        this.secUid = str;
    }

    public final void setTagId(String str) {
        this.tagId = str;
    }

    public final void setTransient(boolean z) {
        this.isTransient = z;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int i) {
        o.LJIIIZ(dest, "dest");
        dest.writeInt(this.start);
        dest.writeInt(this.end);
        dest.writeString(this.userId);
        dest.writeInt(this.type);
        dest.writeString(this.atUserType);
        dest.writeString(this.hashTagName);
        dest.writeString(this.awemeId);
        dest.writeInt(this.subType);
        dest.writeString(this.secUid);
        dest.writeInt(this.lineIndex);
        dest.writeString(this.tagId);
        dest.writeInt(this.isTransient ? 1 : 0);
        dest.writeInt(this.isPreset ? 1 : 0);
        dest.writeInt(this.isDuet ? 1 : 0);
    }
}
