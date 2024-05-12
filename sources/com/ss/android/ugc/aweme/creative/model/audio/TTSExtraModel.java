package com.ss.android.ugc.aweme.creative.model.audio;

import X.InterfaceC65349Pkn;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.audio.TTSExtraModel;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class TTSExtraModel implements Parcelable {
    public static final Parcelable.Creator<TTSExtraModel> CREATOR = new Parcelable.Creator<TTSExtraModel>() { // from class: X.5cV
        @Override // android.os.Parcelable.Creator
        public final TTSExtraModel createFromParcel(Parcel parcel) {
            o.LJIIIZ(parcel, "parcel");
            return new TTSExtraModel(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final TTSExtraModel[] newArray(int i) {
            return new TTSExtraModel[i];
        }
    };

    @InterfaceC65349Pkn("effect_id")
    public String effectId;

    @InterfaceC65349Pkn("extra")
    public String extra;

    @InterfaceC65349Pkn("speaker_id")
    public String speakerId;

    /* JADX WARN: Multi-variable type inference failed */
    public TTSExtraModel() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.speakerId);
        out.writeString(this.effectId);
        out.writeString(this.extra);
    }

    public TTSExtraModel(String str, String str2, String str3) {
        this.speakerId = str;
        this.effectId = str2;
        this.extra = str3;
    }

    public /* synthetic */ TTSExtraModel(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }
}
