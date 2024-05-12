package com.ss.android.ugc.aweme.creative.model;

import X.HBA;
import X.HBI;
import X.InterfaceC65349Pkn;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class MicDataModel implements Parcelable {

    @InterfaceC65349Pkn("edit_default_volume")
    public float editDefaultVolume;

    @InterfaceC65349Pkn("edit_volume_change_mark")
    public boolean editVolumeChangeMark;

    @InterfaceC65349Pkn("enable_microphone_with_bgm")
    public boolean enableMicWithBgm;

    @InterfaceC65349Pkn("is_use_audio_graph")
    public boolean isUseAudioGraphWithBgm;

    @InterfaceC65349Pkn("mic_state_before_retake")
    public int micStateBeforeRetake;

    @InterfaceC65349Pkn("record_original_sound_with_bgm")
    public boolean recordOriginalSoundWithBGM;
    public static final HBI Companion = new HBI();
    public static final Parcelable.Creator<MicDataModel> CREATOR = new HBA();

    /* JADX WARN: Multi-variable type inference failed */
    public MicDataModel() {
        this(0.0f, false, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 63, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeFloat(this.editDefaultVolume);
        out.writeInt(this.editVolumeChangeMark ? 1 : 0);
        out.writeInt(this.recordOriginalSoundWithBGM ? 1 : 0);
        out.writeInt(this.enableMicWithBgm ? 1 : 0);
        out.writeInt(this.isUseAudioGraphWithBgm ? 1 : 0);
        out.writeInt(this.micStateBeforeRetake);
    }

    public MicDataModel(float f, boolean z, boolean z2, boolean z3, boolean z4, int i) {
        this.editDefaultVolume = f;
        this.editVolumeChangeMark = z;
        this.recordOriginalSoundWithBGM = z2;
        this.enableMicWithBgm = z3;
        this.isUseAudioGraphWithBgm = z4;
        this.micStateBeforeRetake = i;
    }

    public /* synthetic */ MicDataModel(float f, boolean z, boolean z2, boolean z3, boolean z4, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? -1.0f : f, (i2 & 2) != 0 ? false : z, (i2 & 4) != 0 ? false : z2, (i2 & 8) != 0 ? false : z3, (i2 & 16) == 0 ? z4 : false, (i2 & 32) != 0 ? -1 : i);
    }
}
