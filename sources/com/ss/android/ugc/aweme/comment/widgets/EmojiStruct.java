package com.ss.android.ugc.aweme.comment.widgets;

import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.comment.widgets.CommentEmojiSpan;
import com.ss.android.ugc.aweme.comment.widgets.EmojiStruct;
import defpackage.b0;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class EmojiStruct implements Parcelable {
    public static final Parcelable.Creator<EmojiStruct> CREATOR = new Parcelable.Creator<EmojiStruct>() { // from class: X.8rx
        @Override // android.os.Parcelable.Creator
        public final EmojiStruct createFromParcel(Parcel parcel) {
            CommentEmojiSpan createFromParcel;
            o.LJIIIZ(parcel, "parcel");
            if (parcel.readInt() == 0) {
                createFromParcel = null;
            } else {
                createFromParcel = CommentEmojiSpan.CREATOR.createFromParcel(parcel);
            }
            return new EmojiStruct(createFromParcel, parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final EmojiStruct[] newArray(int i) {
            return new EmojiStruct[i];
        }
    };
    public final CommentEmojiSpan emojiSpan;
    public final int end;
    public final int start;

    public EmojiStruct() {
        this(null, 0, 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EmojiStruct)) {
            return false;
        }
        EmojiStruct emojiStruct = (EmojiStruct) obj;
        return o.LJ(this.emojiSpan, emojiStruct.emojiSpan) && this.start == emojiStruct.start && this.end == emojiStruct.end;
    }

    public final int hashCode() {
        CommentEmojiSpan commentEmojiSpan = this.emojiSpan;
        return ((((commentEmojiSpan == null ? 0 : commentEmojiSpan.hashCode()) * 31) + this.start) * 31) + this.end;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        CommentEmojiSpan commentEmojiSpan = this.emojiSpan;
        if (commentEmojiSpan == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            commentEmojiSpan.writeToParcel(out, i);
        }
        out.writeInt(this.start);
        out.writeInt(this.end);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("EmojiStruct(emojiSpan=");
        LIZ.append(this.emojiSpan);
        LIZ.append(", start=");
        LIZ.append(this.start);
        LIZ.append(", end=");
        return b0.LIZJ(LIZ, this.end, ')', LIZ);
    }

    public EmojiStruct(CommentEmojiSpan commentEmojiSpan, int i, int i2) {
        this.emojiSpan = commentEmojiSpan;
        this.start = i;
        this.end = i2;
    }
}
