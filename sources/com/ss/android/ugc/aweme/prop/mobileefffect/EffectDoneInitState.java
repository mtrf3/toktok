package com.ss.android.ugc.aweme.prop.mobileefffect;

import X.C33Q;
import X.C79062V1e;
import X.GJN;
import X.InterfaceC87283bg;
import X.X1D;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class EffectDoneInitState implements C33Q, Parcelable, InterfaceC87283bg {
    public static final Parcelable.Creator<EffectDoneInitState> CREATOR = new GJN();
    public final String author;
    public final Uri editedImage;
    public final String effectName;
    public final UrlModel originalEffectImage;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EffectDoneInitState)) {
            return false;
        }
        EffectDoneInitState effectDoneInitState = (EffectDoneInitState) obj;
        return o.LJ(this.effectName, effectDoneInitState.effectName) && o.LJ(this.author, effectDoneInitState.author) && o.LJ(this.originalEffectImage, effectDoneInitState.originalEffectImage) && o.LJ(this.editedImage, effectDoneInitState.editedImage);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("EffectDoneInitState(effectName=");
        LIZ.append(this.effectName);
        LIZ.append(", author=");
        LIZ.append(this.author);
        LIZ.append(", originalEffectImage=");
        LIZ.append(this.originalEffectImage);
        LIZ.append(", editedImage=");
        LIZ.append(this.editedImage);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.effectName);
        out.writeString(this.author);
        out.writeSerializable(this.originalEffectImage);
        out.writeParcelable(this.editedImage, i);
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.originalEffectImage.hashCode() + C79062V1e.LJ(this.author, this.effectName.hashCode() * 31, 31)) * 31;
        Uri uri = this.editedImage;
        if (uri == null) {
            hashCode = 0;
        } else {
            hashCode = uri.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public EffectDoneInitState(String effectName, String author, UrlModel originalEffectImage, Uri uri) {
        o.LJIIIZ(effectName, "effectName");
        o.LJIIIZ(author, "author");
        o.LJIIIZ(originalEffectImage, "originalEffectImage");
        this.effectName = effectName;
        this.author = author;
        this.originalEffectImage = originalEffectImage;
        this.editedImage = uri;
    }
}
