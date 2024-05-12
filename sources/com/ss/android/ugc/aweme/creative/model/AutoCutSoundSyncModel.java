package com.ss.android.ugc.aweme.creative.model;

import X.GPV;
import X.GXP;
import X.InterfaceC43620HAa;
import X.InterfaceC65349Pkn;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class AutoCutSoundSyncModel implements Parcelable {
    public static final Parcelable.Creator<AutoCutSoundSyncModel> CREATOR = new GXP();

    @GPV
    public String soundSyncNleData;

    @InterfaceC43620HAa
    @InterfaceC65349Pkn("sound_sync_nlemodel_data_path")
    public String soundSyncNleDataPath;

    @InterfaceC65349Pkn("sound_sync_nlemodel_data_version")
    public int soundSyncNleDataVersion;

    /* JADX WARN: Multi-variable type inference failed */
    public AutoCutSoundSyncModel() {
        this(null, 0 == true ? 1 : 0, 0, 7, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.soundSyncNleData);
        out.writeString(this.soundSyncNleDataPath);
        out.writeInt(this.soundSyncNleDataVersion);
    }

    public AutoCutSoundSyncModel(String str, String str2, int i) {
        this.soundSyncNleData = str;
        this.soundSyncNleDataPath = str2;
        this.soundSyncNleDataVersion = i;
    }

    public /* synthetic */ AutoCutSoundSyncModel(String str, String str2, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? null : str2, (i2 & 4) != 0 ? 0 : i);
    }
}
