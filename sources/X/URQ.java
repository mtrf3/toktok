package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.relation.auth.dialogcenter.RelationFreqControlData;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class URQ implements Parcelable.Creator<RelationFreqControlData> {
    @Override // android.os.Parcelable.Creator
    public final RelationFreqControlData createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        return new RelationFreqControlData(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readLong());
    }

    @Override // android.os.Parcelable.Creator
    public final RelationFreqControlData[] newArray(int i) {
        return new RelationFreqControlData[i];
    }
}
