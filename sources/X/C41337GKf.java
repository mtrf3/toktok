package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.EditCapCutReuseModel;
import kotlin.jvm.internal.o;

/* renamed from: X.GKf, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41337GKf implements Parcelable.Creator<EditCapCutReuseModel.MusicInfo> {
    @Override // android.os.Parcelable.Creator
    public final EditCapCutReuseModel.MusicInfo createFromParcel(Parcel parcel) {
        boolean z;
        o.LJIIIZ(parcel, "parcel");
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        String readString3 = parcel.readString();
        String readString4 = parcel.readString();
        if (parcel.readInt() != 0) {
            z = true;
        } else {
            z = false;
        }
        return new EditCapCutReuseModel.MusicInfo(readString, readString2, readString3, readString4, z);
    }

    @Override // android.os.Parcelable.Creator
    public final EditCapCutReuseModel.MusicInfo[] newArray(int i) {
        return new EditCapCutReuseModel.MusicInfo[i];
    }
}
