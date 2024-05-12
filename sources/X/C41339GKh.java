package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.publish.AVTextExtraStruct;
import com.ss.android.ugc.aweme.creative.model.publish.CaptionModel;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.GKh, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41339GKh implements Parcelable.Creator<CaptionModel> {
    @Override // android.os.Parcelable.Creator
    public final CaptionModel createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        String readString = parcel.readString();
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        boolean z = false;
        int i = 0;
        while (i != readInt) {
            i = C279117r.LIZIZ(AVTextExtraStruct.CREATOR, parcel, arrayList, i, 1);
        }
        String readString2 = parcel.readString();
        if (parcel.readInt() != 0) {
            z = true;
        }
        return new CaptionModel(readString, arrayList, readString2, z);
    }

    @Override // android.os.Parcelable.Creator
    public final CaptionModel[] newArray(int i) {
        return new CaptionModel[i];
    }
}
