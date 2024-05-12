package com.ss.android.ugc.aweme.lexical.platform.span;

import Y.IDCreatorS51S0000000_7;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.style.ForegroundColorSpan;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import java.util.Objects;

/* loaded from: classes8.dex */
public class MentionSpan extends ForegroundColorSpan {
    public static final Parcelable.Creator<MentionSpan> CREATOR = new IDCreatorS51S0000000_7(4);
    public String awemeId;
    public String mId;
    public String mSecid;
    public TextExtraStruct mStruct;
    public String mText;
    public int mType;
    public int subType;

    @Override // android.text.style.ForegroundColorSpan, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        String str = this.mId;
        int i5 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i6 = i * 31;
        String str2 = this.mText;
        if (str2 != null) {
            i2 = str2.hashCode();
        } else {
            i2 = 0;
        }
        int i7 = (((i6 + i2) * 31) + this.mType) * 31;
        TextExtraStruct textExtraStruct = this.mStruct;
        if (textExtraStruct != null) {
            i3 = textExtraStruct.hashCode();
        } else {
            i3 = 0;
        }
        int i8 = (i7 + i3) * 31;
        String str3 = this.awemeId;
        if (str3 != null) {
            i4 = str3.hashCode();
        } else {
            i4 = 0;
        }
        int i9 = (((i8 + i4) * 31) + this.subType) * 31;
        String str4 = this.mSecid;
        if (str4 != null) {
            i5 = str4.hashCode();
        }
        return i9 + i5;
    }

    public MentionSpan(Parcel parcel) {
        super(parcel);
        this.awemeId = "";
        this.mId = parcel.readString();
        this.mText = parcel.readString();
        this.mType = parcel.readInt();
        this.mStruct = (TextExtraStruct) parcel.readParcelable(TextExtraStruct.class.getClassLoader());
        this.mSecid = parcel.readString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MentionSpan mentionSpan = (MentionSpan) obj;
        if (this.mType != mentionSpan.mType || this.subType != mentionSpan.subType || !Objects.equals(this.mId, mentionSpan.mId) || !Objects.equals(this.mText, mentionSpan.mText) || !Objects.equals(this.mStruct, mentionSpan.mStruct) || !Objects.equals(this.awemeId, mentionSpan.awemeId)) {
            return false;
        }
        return Objects.equals(this.mSecid, mentionSpan.mSecid);
    }

    @Override // android.text.style.ForegroundColorSpan, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mId);
        parcel.writeString(this.mText);
        parcel.writeInt(this.mType);
        parcel.writeParcelable(this.mStruct, i);
        parcel.writeString(this.mSecid);
    }

    public MentionSpan(String str, String str2, int i, int i2, String str3, String str4) {
        super(i);
        this.awemeId = "";
        this.mId = str2;
        this.mText = str;
        this.mType = i2;
        this.mSecid = str4;
        TextExtraStruct textExtraStruct = new TextExtraStruct();
        this.mStruct = textExtraStruct;
        textExtraStruct.setUserId(str2);
        this.mStruct.setType(i2);
        this.mStruct.setAtUserType(str3);
        this.mStruct.setSecUid(str4);
    }
}
