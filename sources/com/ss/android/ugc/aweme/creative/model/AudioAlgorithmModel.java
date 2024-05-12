package com.ss.android.ugc.aweme.creative.model;

import X.InterfaceC65349Pkn;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.AudioAlgorithmModel;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class AudioAlgorithmModel implements Parcelable {
    public static final Parcelable.Creator<AudioAlgorithmModel> CREATOR = new Parcelable.Creator<AudioAlgorithmModel>() { // from class: X.6jU
        @Override // android.os.Parcelable.Creator
        public final AudioAlgorithmModel createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            boolean z5;
            boolean z6;
            boolean z7;
            o.LJIIIZ(parcel, "parcel");
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            if (parcel.readInt() != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (parcel.readInt() != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (parcel.readInt() != 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (parcel.readInt() != 0) {
                z5 = true;
            } else {
                z5 = false;
            }
            float readFloat = parcel.readFloat();
            float readFloat2 = parcel.readFloat();
            float readFloat3 = parcel.readFloat();
            float readFloat4 = parcel.readFloat();
            if (parcel.readInt() != 0) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (parcel.readInt() != 0) {
                z7 = true;
            } else {
                z7 = false;
            }
            return new AudioAlgorithmModel(z, z2, z3, z4, z5, readFloat, readFloat2, readFloat3, readFloat4, z6, z7);
        }

        @Override // android.os.Parcelable.Creator
        public final AudioAlgorithmModel[] newArray(int i) {
            return new AudioAlgorithmModel[i];
        }
    };

    @InterfaceC65349Pkn("edit_volume_level_end")
    public float editVolumeEnd;

    @InterfaceC65349Pkn("edit_volume_level_start")
    public float editVolumeStart;

    @InterfaceC65349Pkn("is_aec_on")
    public boolean isAECOn;

    @InterfaceC65349Pkn("is_denoise_on")
    public boolean isDenoiseOn;

    @InterfaceC65349Pkn("is_loudness_check_on")
    public boolean isLoudnessCheckOn;

    @InterfaceC65349Pkn("is_loudness_on")
    public boolean isLoudnessOn;

    @InterfaceC65349Pkn("is_mic_enabled")
    public boolean isMicEnabled;

    @InterfaceC65349Pkn("record_is_mic_on")
    public boolean isMicOn;

    @InterfaceC65349Pkn("is_ta_on")
    public boolean isTAOn;

    @InterfaceC65349Pkn("shoot_volume_level_end")
    public float shootVolumeEnd;

    @InterfaceC65349Pkn("shoot_volume_level_start")
    public float shootVolumeStart;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AudioAlgorithmModel() {
        /*
            r14 = this;
            r1 = 0
            r6 = 0
            r12 = 2047(0x7ff, float:2.868E-42)
            r13 = 0
            r0 = r14
            r2 = r1
            r3 = r1
            r4 = r1
            r5 = r1
            r7 = r6
            r8 = r6
            r9 = r6
            r10 = r1
            r11 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.creative.model.AudioAlgorithmModel.<init>():void");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeInt(this.isAECOn ? 1 : 0);
        out.writeInt(this.isTAOn ? 1 : 0);
        out.writeInt(this.isLoudnessOn ? 1 : 0);
        out.writeInt(this.isLoudnessCheckOn ? 1 : 0);
        out.writeInt(this.isDenoiseOn ? 1 : 0);
        out.writeFloat(this.editVolumeStart);
        out.writeFloat(this.editVolumeEnd);
        out.writeFloat(this.shootVolumeStart);
        out.writeFloat(this.shootVolumeEnd);
        out.writeInt(this.isMicOn ? 1 : 0);
        out.writeInt(this.isMicEnabled ? 1 : 0);
    }

    public AudioAlgorithmModel(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, float f, float f2, float f3, float f4, boolean z6, boolean z7) {
        this.isAECOn = z;
        this.isTAOn = z2;
        this.isLoudnessOn = z3;
        this.isLoudnessCheckOn = z4;
        this.isDenoiseOn = z5;
        this.editVolumeStart = f;
        this.editVolumeEnd = f2;
        this.shootVolumeStart = f3;
        this.shootVolumeEnd = f4;
        this.isMicOn = z6;
        this.isMicEnabled = z7;
    }

    public /* synthetic */ AudioAlgorithmModel(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, float f, float f2, float f3, float f4, boolean z6, boolean z7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3, (i & 8) != 0 ? false : z4, (i & 16) != 0 ? false : z5, (i & 32) != 0 ? -1.0f : f, (i & 64) != 0 ? -1.0f : f2, (i & 128) != 0 ? -1.0f : f3, (i & 256) == 0 ? f4 : -1.0f, (i & 512) != 0 ? false : z6, (i & 1024) == 0 ? z7 : false);
    }
}
