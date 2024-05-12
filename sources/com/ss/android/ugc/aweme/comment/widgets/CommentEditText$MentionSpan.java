package com.ss.android.ugc.aweme.comment.widgets;

import X.C224798rz;
import Y.IDCreatorS48S0000000_3;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.style.ForegroundColorSpan;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public class CommentEditText$MentionSpan extends ForegroundColorSpan {
    public String awemeId;
    public String secId;
    public TextExtraStruct struct;
    public String text;
    public int type;
    public String uid;
    public static final C224798rz Companion = new Object() { // from class: X.8rz
    };
    public static final Parcelable.Creator<CommentEditText$MentionSpan> CREATOR = new IDCreatorS48S0000000_3(1);

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        String str = this.uid;
        int i5 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i6 = i * 31;
        String str2 = this.text;
        if (str2 != null) {
            i2 = str2.hashCode();
        } else {
            i2 = 0;
        }
        int i7 = (((i6 + i2) * 31) + this.type) * 31;
        TextExtraStruct textExtraStruct = this.struct;
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
        int i9 = (i8 + i4) * 31;
        String str4 = this.secId;
        if (str4 != null) {
            i5 = str4.hashCode();
        }
        return i9 + i5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommentEditText$MentionSpan(Parcel parcel) {
        super(parcel);
        o.LJIIIZ(parcel, "parcel");
        this.secId = "";
        this.awemeId = "";
        String readString = parcel.readString();
        this.uid = readString;
        TextExtraStruct textExtraStruct = this.struct;
        if (textExtraStruct != null) {
            textExtraStruct.setUserId(readString);
        }
        this.text = parcel.readString();
        this.type = parcel.readInt();
        this.struct = (TextExtraStruct) parcel.readParcelable(TextExtraStruct.class.getClassLoader());
        String readString2 = parcel.readString();
        this.secId = readString2;
        TextExtraStruct textExtraStruct2 = this.struct;
        if (textExtraStruct2 == null) {
            return;
        }
        textExtraStruct2.setSecUid(readString2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !o.LJ(getClass(), obj.getClass())) {
            return false;
        }
        CommentEditText$MentionSpan commentEditText$MentionSpan = (CommentEditText$MentionSpan) obj;
        if (this.type != commentEditText$MentionSpan.type) {
            return false;
        }
        String str = this.uid;
        if (str == null ? commentEditText$MentionSpan.uid != null : !o.LJ(str, commentEditText$MentionSpan.uid)) {
            return false;
        }
        String str2 = this.text;
        if (str2 == null ? commentEditText$MentionSpan.text != null : !o.LJ(str2, commentEditText$MentionSpan.text)) {
            return false;
        }
        TextExtraStruct textExtraStruct = this.struct;
        if (textExtraStruct == null ? commentEditText$MentionSpan.struct != null : !o.LJ(textExtraStruct, commentEditText$MentionSpan.struct)) {
            return false;
        }
        String str3 = this.awemeId;
        if (str3 == null ? commentEditText$MentionSpan.awemeId != null : !o.LJ(str3, commentEditText$MentionSpan.awemeId)) {
            return false;
        }
        String str4 = this.secId;
        String str5 = commentEditText$MentionSpan.secId;
        if (str4 != null) {
            return o.LJ(str4, str5);
        }
        if (str5 == null) {
            return true;
        }
        return false;
    }

    @Override // android.text.style.ForegroundColorSpan, android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        o.LJIIIZ(dest, "dest");
        dest.writeString(this.uid);
        dest.writeString(this.text);
        dest.writeInt(this.type);
        dest.writeParcelable(this.struct, i);
        dest.writeString(this.secId);
    }

    public CommentEditText$MentionSpan(int i, int i2, String str, String str2, String str3) {
        super(i);
        this.secId = "";
        this.awemeId = "";
        this.uid = str2;
        TextExtraStruct textExtraStruct = this.struct;
        if (textExtraStruct != null) {
            textExtraStruct.setUserId(str2);
        }
        this.text = str;
        this.type = i2;
        this.secId = str3;
        TextExtraStruct textExtraStruct2 = this.struct;
        if (textExtraStruct2 != null) {
            textExtraStruct2.setSecUid(str3);
        }
        TextExtraStruct textExtraStruct3 = new TextExtraStruct();
        this.struct = textExtraStruct3;
        textExtraStruct3.setUserId(str2);
        TextExtraStruct textExtraStruct4 = this.struct;
        if (textExtraStruct4 != null) {
            textExtraStruct4.setType(i2);
        }
        TextExtraStruct textExtraStruct5 = this.struct;
        if (textExtraStruct5 == null) {
            return;
        }
        textExtraStruct5.setSecUid(str3);
    }
}
