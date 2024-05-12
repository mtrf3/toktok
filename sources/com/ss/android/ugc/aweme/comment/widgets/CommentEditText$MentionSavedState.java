package com.ss.android.ugc.aweme.comment.widgets;

import X.HMH;
import Y.IDCreatorS51S0000000_7;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class CommentEditText$MentionSavedState extends View.BaseSavedState {
    public List<EmojiStruct> emojis;
    public int selectionEnd;
    public List<? extends TextExtraStruct> structs;
    public String text;
    public static final HMH Companion = new HMH();
    public static final Parcelable.Creator<CommentEditText$MentionSavedState> CREATOR = new IDCreatorS51S0000000_7(0);

    public CommentEditText$MentionSavedState(Parcel parcel) {
        super(parcel);
        this.text = parcel.readString();
        this.selectionEnd = parcel.readInt();
        Bundle readBundle = parcel.readBundle(CommentEditText$MentionSavedState.class.getClassLoader());
        if (readBundle != null) {
            this.structs = readBundle.getParcelableArrayList("text_extra_struct");
            this.emojis = readBundle.getParcelableArrayList("emoji_span");
        }
    }

    public CommentEditText$MentionSavedState(Parcelable parcelable) {
        super(parcelable);
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        super.writeToParcel(out, i);
        out.writeString(this.text);
        out.writeInt(this.selectionEnd);
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("text_extra_struct", (ArrayList) this.structs);
        bundle.putParcelableArrayList("emoji_span", (ArrayList) this.emojis);
        out.writeBundle(bundle);
    }
}
