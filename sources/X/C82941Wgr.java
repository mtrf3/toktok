package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.asve.recorder.effect.composer.ComposerInfo;
import kotlin.jvm.internal.o;

/* renamed from: X.Wgr, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82941Wgr implements Parcelable.Creator<ComposerInfo> {
    @Override // android.os.Parcelable.Creator
    public final ComposerInfo createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        String readString = parcel.readString();
        o.LJI(readString);
        String readString2 = parcel.readString();
        o.LJI(readString2);
        String readString3 = parcel.readString();
        o.LJI(readString3);
        return new ComposerInfo(readString, readString2, readString3, 8);
    }

    @Override // android.os.Parcelable.Creator
    public final ComposerInfo[] newArray(int i) {
        return new ComposerInfo[i];
    }
}
