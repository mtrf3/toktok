package com.bytedance.effectcreatormobile.ckeapi.api.draft;

import X.C93471aRP;
import X.F9E;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.o;

/* loaded from: classes34.dex */
public final class EffectHint extends F9E implements Parcelable {
    public static final Parcelable.Creator<EffectHint> CREATOR = new C93471aRP();
    public final String effectKey;
    public final String hint;
    public final String hintFile;
    public final int hintFileFormat;
    public final String hintIcon;
    public final String hintKey;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.hintKey, this.effectKey, this.hint, this.hintIcon, this.hintFile, Integer.valueOf(this.hintFileFormat)};
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        o.LJIIIZ(parcel, "parcel");
        parcel.writeString(this.hintKey);
        parcel.writeString(this.effectKey);
        parcel.writeString(this.hint);
        parcel.writeString(this.hintIcon);
        parcel.writeString(this.hintFile);
        parcel.writeInt(this.hintFileFormat);
    }

    public EffectHint(String hintKey, String effectKey, String hint, String hintIcon, String hintFile, int i) {
        o.LJIIIZ(hintKey, "hintKey");
        o.LJIIIZ(effectKey, "effectKey");
        o.LJIIIZ(hint, "hint");
        o.LJIIIZ(hintIcon, "hintIcon");
        o.LJIIIZ(hintFile, "hintFile");
        this.hintKey = hintKey;
        this.effectKey = effectKey;
        this.hint = hint;
        this.hintIcon = hintIcon;
        this.hintFile = hintFile;
        this.hintFileFormat = i;
    }
}
