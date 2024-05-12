package com.ss.android.ugc.aweme.creative.model.magic;

import X.C134935Rh;
import X.InterfaceC65349Pkn;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.magic.CombineEffectPointModel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.io.Serializable;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public class CombineEffectPointModel implements Serializable, Parcelable {

    @InterfaceC65349Pkn("combine_effect_key")
    public String key;

    @InterfaceC65349Pkn("combine_effect_name")
    public String name;

    @InterfaceC65349Pkn("combine_effect_resDir")
    public String resDir;
    public static final C134935Rh Companion = new Object() { // from class: X.5Rh
    };
    public static final Parcelable.Creator<CombineEffectPointModel> CREATOR = new Parcelable.Creator<CombineEffectPointModel>() { // from class: X.5Rg
        @Override // android.os.Parcelable.Creator
        public final CombineEffectPointModel createFromParcel(Parcel parcel) {
            o.LJIIIZ(parcel, "parcel");
            CombineEffectPointModel.Companion.getClass();
            return new CombineEffectPointModel(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final CombineEffectPointModel[] newArray(int i) {
            return new CombineEffectPointModel[i];
        }
    };

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public CombineEffectPointModel() {
        this.key = CardStruct.IStatusCode.DEFAULT;
    }

    public final String getKey() {
        return this.key;
    }

    public final String getName() {
        return this.name;
    }

    public final String getResDir() {
        return this.resDir;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CombineEffectPointModel(Parcel parcel) {
        this();
        o.LJIIIZ(parcel, "parcel");
        String readString = parcel.readString();
        this.key = readString == null ? "" : readString;
        this.resDir = parcel.readString();
        this.name = parcel.readString();
    }

    public final void setKey(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.key = str;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public final void setResDir(String str) {
        this.resDir = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        Companion.getClass();
        out.writeString(getKey());
        out.writeString(getResDir());
        out.writeString(getName());
    }
}
