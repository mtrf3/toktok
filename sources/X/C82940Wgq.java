package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.dependence.beauty.data.BeautyComposerInfo;
import kotlin.jvm.internal.o;

/* renamed from: X.Wgq, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82940Wgq implements Parcelable.Creator<BeautyComposerInfo> {
    @Override // android.os.Parcelable.Creator
    public final BeautyComposerInfo createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        String readString = parcel.readString();
        if (readString == null) {
            readString = "";
        }
        String readString2 = parcel.readString();
        if (readString2 == null) {
            readString2 = "";
        }
        String readString3 = parcel.readString();
        if (readString3 == null) {
            readString3 = "";
        }
        String readString4 = parcel.readString();
        if (readString4 == null) {
            readString4 = "";
        }
        String readString5 = parcel.readString();
        if (readString5 == null) {
            readString5 = "";
        }
        return new BeautyComposerInfo(readString, readString2, readString3, readString4, readString5);
    }

    @Override // android.os.Parcelable.Creator
    public final BeautyComposerInfo[] newArray(int i) {
        return new BeautyComposerInfo[i];
    }
}
