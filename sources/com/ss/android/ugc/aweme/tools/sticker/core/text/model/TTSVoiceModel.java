package com.ss.android.ugc.aweme.tools.sticker.core.text.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TTSVoiceModel;
import defpackage.q;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class TTSVoiceModel implements Serializable, Parcelable {
    public static final Parcelable.Creator<TTSVoiceModel> CREATOR = new Parcelable.Creator<TTSVoiceModel>() { // from class: X.5Zq
        @Override // android.os.Parcelable.Creator
        public final TTSVoiceModel createFromParcel(Parcel parcel) {
            o.LJIIIZ(parcel, "parcel");
            return new TTSVoiceModel(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final TTSVoiceModel[] newArray(int i) {
            return new TTSVoiceModel[i];
        }
    };

    @InterfaceC65349Pkn("effect_id")
    public final String effectId;

    @InterfaceC65349Pkn("speaker_name")
    public final String speakerName;

    /* JADX WARN: Multi-variable type inference failed */
    public TTSVoiceModel() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ TTSVoiceModel copy$default(TTSVoiceModel tTSVoiceModel, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = tTSVoiceModel.effectId;
        }
        if ((i & 2) != 0) {
            str2 = tTSVoiceModel.speakerName;
        }
        return tTSVoiceModel.copy(str, str2);
    }

    public final TTSVoiceModel copy(String str, String str2) {
        return new TTSVoiceModel(str, str2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TTSVoiceModel)) {
            return false;
        }
        TTSVoiceModel tTSVoiceModel = (TTSVoiceModel) obj;
        return o.LJ(this.effectId, tTSVoiceModel.effectId) && o.LJ(this.speakerName, tTSVoiceModel.speakerName);
    }

    public int hashCode() {
        String str = this.effectId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.speakerName;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.effectId);
        out.writeString(this.speakerName);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TTSVoiceModel(effectId=");
        LIZ.append(this.effectId);
        LIZ.append(", speakerName=");
        return q.LIZIZ(LIZ, this.speakerName, ')', LIZ);
    }

    public final String getEffectId() {
        return this.effectId;
    }

    public final String getSpeakerName() {
        return this.speakerName;
    }

    public TTSVoiceModel(String str, String str2) {
        this.effectId = str;
        this.speakerName = str2;
    }

    public /* synthetic */ TTSVoiceModel(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }
}
