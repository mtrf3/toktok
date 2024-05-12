package com.ss.android.ugc.aweme.comment.widgets;

import X.C1FJ;
import X.InterfaceC65349Pkn;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import com.ss.android.ugc.aweme.comment.widgets.CommentEmojiSpan;
import defpackage.s0;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class CommentEmojiSpan extends CharacterStyle implements Parcelable, Serializable {
    public static final Parcelable.Creator<CommentEmojiSpan> CREATOR = new Parcelable.Creator<CommentEmojiSpan>() { // from class: X.76N
        @Override // android.os.Parcelable.Creator
        public final CommentEmojiSpan createFromParcel(Parcel parcel) {
            Integer valueOf;
            o.LJIIIZ(parcel, "parcel");
            String readString = parcel.readString();
            Integer num = null;
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Integer.valueOf(parcel.readInt());
            }
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            if (parcel.readInt() != 0) {
                num = Integer.valueOf(parcel.readInt());
            }
            return new CommentEmojiSpan(readString, valueOf, readString2, readString3, num);
        }

        @Override // android.os.Parcelable.Creator
        public final CommentEmojiSpan[] newArray(int i) {
            return new CommentEmojiSpan[i];
        }
    };

    @InterfaceC65349Pkn("emoji_id")
    public final String emojiId;

    @InterfaceC65349Pkn("emoji_num")
    public final Integer emojiNum;

    @InterfaceC65349Pkn("emoji_score")
    public final Integer emojiScore;

    @InterfaceC65349Pkn("emoji_source")
    public final String emojiSource;

    @InterfaceC65349Pkn("emoji_strategy_type")
    public final String emojiStrategyType;

    public static /* synthetic */ CommentEmojiSpan copy$default(CommentEmojiSpan commentEmojiSpan, String str, Integer num, String str2, String str3, Integer num2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = commentEmojiSpan.emojiId;
        }
        if ((i & 2) != 0) {
            num = commentEmojiSpan.emojiScore;
        }
        if ((i & 4) != 0) {
            str2 = commentEmojiSpan.emojiStrategyType;
        }
        if ((i & 8) != 0) {
            str3 = commentEmojiSpan.emojiSource;
        }
        if ((i & 16) != 0) {
            num2 = commentEmojiSpan.emojiNum;
        }
        return commentEmojiSpan.copy(str, num, str2, str3, num2);
    }

    public final CommentEmojiSpan copy(String emojiId, Integer num, String str, String str2, Integer num2) {
        o.LJIIIZ(emojiId, "emojiId");
        return new CommentEmojiSpan(emojiId, num, str, str2, num2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommentEmojiSpan)) {
            return false;
        }
        CommentEmojiSpan commentEmojiSpan = (CommentEmojiSpan) obj;
        return o.LJ(this.emojiId, commentEmojiSpan.emojiId) && o.LJ(this.emojiScore, commentEmojiSpan.emojiScore) && o.LJ(this.emojiStrategyType, commentEmojiSpan.emojiStrategyType) && o.LJ(this.emojiSource, commentEmojiSpan.emojiSource) && o.LJ(this.emojiNum, commentEmojiSpan.emojiNum);
    }

    public int hashCode() {
        int hashCode = this.emojiId.hashCode() * 31;
        Integer num = this.emojiScore;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.emojiStrategyType;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.emojiSource;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num2 = this.emojiNum;
        return hashCode4 + (num2 != null ? num2.hashCode() : 0);
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CommentEmojiSpan(emojiId=");
        LIZ.append(this.emojiId);
        LIZ.append(", emojiScore=");
        LIZ.append(this.emojiScore);
        LIZ.append(", emojiStrategyType=");
        LIZ.append(this.emojiStrategyType);
        LIZ.append(", emojiSource=");
        LIZ.append(this.emojiSource);
        LIZ.append(", emojiNum=");
        return s0.LIZJ(LIZ, this.emojiNum, ')', LIZ);
    }

    public final String getEmojiId() {
        return this.emojiId;
    }

    public final Integer getEmojiNum() {
        return this.emojiNum;
    }

    public final Integer getEmojiScore() {
        return this.emojiScore;
    }

    public final String getEmojiSource() {
        return this.emojiSource;
    }

    public final String getEmojiStrategyType() {
        return this.emojiStrategyType;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.emojiId);
        Integer num = this.emojiScore;
        if (num == null) {
            out.writeInt(0);
        } else {
            C1FJ.LJ(out, 1, num);
        }
        out.writeString(this.emojiStrategyType);
        out.writeString(this.emojiSource);
        Integer num2 = this.emojiNum;
        if (num2 == null) {
            out.writeInt(0);
        } else {
            C1FJ.LJ(out, 1, num2);
        }
    }

    public CommentEmojiSpan(String emojiId, Integer num, String str, String str2, Integer num2) {
        o.LJIIIZ(emojiId, "emojiId");
        this.emojiId = emojiId;
        this.emojiScore = num;
        this.emojiStrategyType = str;
        this.emojiSource = str2;
        this.emojiNum = num2;
    }

    public /* synthetic */ CommentEmojiSpan(String str, Integer num, String str2, String str3, Integer num2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? 0 : num, (i & 4) != 0 ? "" : str2, (i & 8) == 0 ? str3 : "", (i & 16) != 0 ? 1 : num2);
    }
}
