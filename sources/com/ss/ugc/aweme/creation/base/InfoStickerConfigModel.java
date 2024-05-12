package com.ss.ugc.aweme.creation.base;

import X.C36477ETh;
import X.InterfaceC65349Pkn;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public class InfoStickerConfigModel implements Parcelable, Serializable {
    public static final Parcelable.Creator<InfoStickerConfigModel> CREATOR = new C36477ETh();

    @InterfaceC65349Pkn("effect_identifier")
    public String effectIdentifier;

    /* JADX WARN: Multi-variable type inference failed */
    public InfoStickerConfigModel() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        o.LJIIIZ(parcel, "parcel");
        parcel.writeString(this.effectIdentifier);
    }

    public final String getEffectIdentifier() {
        return this.effectIdentifier;
    }

    public InfoStickerConfigModel(String effectIdentifier) {
        o.LJIIIZ(effectIdentifier, "effectIdentifier");
        this.effectIdentifier = effectIdentifier;
    }

    public final void setEffectIdentifier(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.effectIdentifier = str;
    }

    public /* synthetic */ InfoStickerConfigModel(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str);
    }
}
