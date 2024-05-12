package com.ss.android.ugc.aweme.edit.audio.enhance;

import X.F9E;
import X.InterfaceC65349Pkn;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.edit.audio.enhance.AudioEnhanceParam;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class AudioEnhanceParam extends F9E implements Parcelable, Serializable {
    public static final Parcelable.Creator<AudioEnhanceParam> CREATOR = new Parcelable.Creator<AudioEnhanceParam>() { // from class: X.5WU
        @Override // android.os.Parcelable.Creator
        public final AudioEnhanceParam createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            boolean z3;
            o.LJIIIZ(parcel, "parcel");
            boolean z4 = false;
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
            }
            return new AudioEnhanceParam(z, z2, z3, z4);
        }

        @Override // android.os.Parcelable.Creator
        public final AudioEnhanceParam[] newArray(int i) {
            return new AudioEnhanceParam[i];
        }
    };

    @InterfaceC65349Pkn("enable_music_enhance")
    public final boolean enableMusicEnhance;

    @InterfaceC65349Pkn("enable_origin_enhance")
    public final boolean enableOriginEnhance;

    @InterfaceC65349Pkn("support_music_enhance")
    public final boolean supportMusicEnhance;

    @InterfaceC65349Pkn("support_origin_enhance")
    public final boolean supportOriginEnhance;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AudioEnhanceParam() {
        /*
            r7 = this;
            r1 = 0
            r5 = 15
            r6 = 0
            r0 = r7
            r2 = r1
            r3 = r1
            r4 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.edit.audio.enhance.AudioEnhanceParam.<init>():void");
    }

    public static /* synthetic */ AudioEnhanceParam copy$default(AudioEnhanceParam audioEnhanceParam, boolean z, boolean z2, boolean z3, boolean z4, int i, Object obj) {
        if ((i & 1) != 0) {
            z = audioEnhanceParam.supportOriginEnhance;
        }
        if ((i & 2) != 0) {
            z2 = audioEnhanceParam.supportMusicEnhance;
        }
        if ((i & 4) != 0) {
            z3 = audioEnhanceParam.enableOriginEnhance;
        }
        if ((i & 8) != 0) {
            z4 = audioEnhanceParam.enableMusicEnhance;
        }
        return audioEnhanceParam.copy(z, z2, z3, z4);
    }

    public final AudioEnhanceParam copy(boolean z, boolean z2, boolean z3, boolean z4) {
        return new AudioEnhanceParam(z, z2, z3, z4);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.supportOriginEnhance), Boolean.valueOf(this.supportMusicEnhance), Boolean.valueOf(this.enableOriginEnhance), Boolean.valueOf(this.enableMusicEnhance)};
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeInt(this.supportOriginEnhance ? 1 : 0);
        out.writeInt(this.supportMusicEnhance ? 1 : 0);
        out.writeInt(this.enableOriginEnhance ? 1 : 0);
        out.writeInt(this.enableMusicEnhance ? 1 : 0);
    }

    public final boolean getEnableMusicEnhance() {
        return this.enableMusicEnhance;
    }

    public final boolean getEnableOriginEnhance() {
        return this.enableOriginEnhance;
    }

    public final boolean getSupportMusicEnhance() {
        return this.supportMusicEnhance;
    }

    public final boolean getSupportOriginEnhance() {
        return this.supportOriginEnhance;
    }

    public AudioEnhanceParam(boolean z, boolean z2, boolean z3, boolean z4) {
        this.supportOriginEnhance = z;
        this.supportMusicEnhance = z2;
        this.enableOriginEnhance = z3;
        this.enableMusicEnhance = z4;
    }

    public /* synthetic */ AudioEnhanceParam(boolean z, boolean z2, boolean z3, boolean z4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3, (i & 8) != 0 ? false : z4);
    }
}
