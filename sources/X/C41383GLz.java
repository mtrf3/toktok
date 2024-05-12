package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.setting.ui.SettingsNewVersionActivityArgs;
import kotlin.jvm.internal.o;

/* renamed from: X.GLz, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41383GLz implements Parcelable.Creator<SettingsNewVersionActivityArgs> {
    @Override // android.os.Parcelable.Creator
    public final SettingsNewVersionActivityArgs createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        return new SettingsNewVersionActivityArgs(parcel.readString(), parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final SettingsNewVersionActivityArgs[] newArray(int i) {
        return new SettingsNewVersionActivityArgs[i];
    }
}
