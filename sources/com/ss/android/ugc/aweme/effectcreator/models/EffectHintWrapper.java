package com.ss.android.ugc.aweme.effectcreator.models;

import X.C36441ERx;
import X.F9E;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class EffectHintWrapper extends F9E implements Parcelable {
    public static final Parcelable.Creator<EffectHintWrapper> CREATOR = new C36441ERx();
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
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.hintKey);
        out.writeString(this.effectKey);
        out.writeString(this.hint);
        out.writeString(this.hintIcon);
        out.writeString(this.hintFile);
        out.writeInt(this.hintFileFormat);
    }

    public EffectHintWrapper(String hintKey, String effectKey, String hint, String hintIcon, String hintFile, int i) {
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
