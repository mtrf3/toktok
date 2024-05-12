package com.ss.android.ugc.aweme.views.mention;

import Y.IDCreatorS51S0000000_7;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes8.dex */
public class MentionEditText$MentionSavedState extends View.BaseSavedState {
    public static final Parcelable.Creator<MentionEditText$MentionSavedState> CREATOR = new IDCreatorS51S0000000_7(23);
    public int mSelectionEnd;
    public List<TextExtraStruct> mStructs;
    public String mText;

    public MentionEditText$MentionSavedState(Parcel parcel) {
        super(parcel);
        this.mText = parcel.readString();
        this.mSelectionEnd = parcel.readInt();
        Bundle readBundle = parcel.readBundle(getClass().getClassLoader());
        if (readBundle != null) {
            this.mStructs = readBundle.getParcelableArrayList("text_extra_struct");
        }
    }

    public MentionEditText$MentionSavedState(Parcelable parcelable) {
        super(parcelable);
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.mText);
        parcel.writeInt(this.mSelectionEnd);
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("text_extra_struct", (ArrayList) this.mStructs);
        parcel.writeBundle(bundle);
    }
}
