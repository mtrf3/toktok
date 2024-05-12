package com.ss.android.ugc.aweme.shortvideo.model;

import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class RecordPresetResource implements Parcelable, Serializable {
    public static final Parcelable.Creator<RecordPresetResource> CREATOR = new Creator();
    public Effect effect;
    public String effectId;
    public String musicId;
    public MusicModel musicModel;

    /* loaded from: classes8.dex */
    public static final class Creator implements Parcelable.Creator<RecordPresetResource> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RecordPresetResource createFromParcel(Parcel parcel) {
            o.LJIIIZ(parcel, "parcel");
            return new RecordPresetResource(parcel.readString(), (Effect) parcel.readParcelable(RecordPresetResource.class.getClassLoader()), parcel.readString(), (MusicModel) parcel.readSerializable());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RecordPresetResource[] newArray(int i) {
            return new RecordPresetResource[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RecordPresetResource() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 15, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ RecordPresetResource copy$default(RecordPresetResource recordPresetResource, String str, Effect effect, String str2, MusicModel musicModel, int i, Object obj) {
        if ((i & 1) != 0) {
            str = recordPresetResource.effectId;
        }
        if ((i & 2) != 0) {
            effect = recordPresetResource.effect;
        }
        if ((i & 4) != 0) {
            str2 = recordPresetResource.musicId;
        }
        if ((i & 8) != 0) {
            musicModel = recordPresetResource.musicModel;
        }
        return recordPresetResource.copy(str, effect, str2, musicModel);
    }

    public final RecordPresetResource copy(String str, Effect effect, String str2, MusicModel musicModel) {
        return new RecordPresetResource(str, effect, str2, musicModel);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecordPresetResource)) {
            return false;
        }
        RecordPresetResource recordPresetResource = (RecordPresetResource) obj;
        return o.LJ(this.effectId, recordPresetResource.effectId) && o.LJ(this.effect, recordPresetResource.effect) && o.LJ(this.musicId, recordPresetResource.musicId) && o.LJ(this.musicModel, recordPresetResource.musicModel);
    }

    public int hashCode() {
        String str = this.effectId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Effect effect = this.effect;
        int hashCode2 = (hashCode + (effect == null ? 0 : effect.hashCode())) * 31;
        String str2 = this.musicId;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        MusicModel musicModel = this.musicModel;
        return hashCode3 + (musicModel != null ? musicModel.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.effectId);
        out.writeParcelable(this.effect, i);
        out.writeString(this.musicId);
        out.writeSerializable(this.musicModel);
    }

    public final boolean preSetEffect() {
        Effect effect;
        String effectId;
        String str = this.effectId;
        if ((str == null || str.length() == 0) && ((effect = this.effect) == null || (effectId = effect.getEffectId()) == null || effectId.length() == 0)) {
            return false;
        }
        return true;
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("effectId: ");
        LIZ.append(this.effectId);
        LIZ.append(", musicId: ");
        LIZ.append(this.musicId);
        LIZ.append(", effect: ");
        LIZ.append(this.effect);
        LIZ.append(", musicModel: ");
        LIZ.append(this.musicModel);
        return X1D.LIZIZ(LIZ);
    }

    public final Effect getEffect() {
        return this.effect;
    }

    public final String getEffectId() {
        return this.effectId;
    }

    public final String getMusicId() {
        return this.musicId;
    }

    public final MusicModel getMusicModel() {
        return this.musicModel;
    }

    public final void setEffect(Effect effect) {
        this.effect = effect;
    }

    public final void setEffectId(String str) {
        this.effectId = str;
    }

    public final void setMusicId(String str) {
        this.musicId = str;
    }

    public final void setMusicModel(MusicModel musicModel) {
        this.musicModel = musicModel;
    }

    public RecordPresetResource(String str, Effect effect, String str2, MusicModel musicModel) {
        this.effectId = str;
        this.effect = effect;
        this.musicId = str2;
        this.musicModel = musicModel;
    }

    public /* synthetic */ RecordPresetResource(String str, Effect effect, String str2, MusicModel musicModel, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : effect, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : musicModel);
    }
}
