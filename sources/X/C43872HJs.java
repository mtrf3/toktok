package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.asve.recorder.RecorderConcatResult;
import kotlin.jvm.internal.o;

/* renamed from: X.HJs, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43872HJs implements Parcelable.Creator<RecorderConcatResult> {
    @Override // android.os.Parcelable.Creator
    public final RecorderConcatResult createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        int readInt = parcel.readInt();
        String readString = parcel.readString();
        o.LJI(readString);
        String readString2 = parcel.readString();
        o.LJI(readString2);
        return new RecorderConcatResult(readInt, readString, readString2);
    }

    @Override // android.os.Parcelable.Creator
    public final RecorderConcatResult[] newArray(int i) {
        return new RecorderConcatResult[i];
    }
}
