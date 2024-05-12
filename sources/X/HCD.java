package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.sticker.model.RecordUploadVideoTimeInfo;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public class HCD implements Parcelable.Creator<RecordUploadVideoTimeInfo> {
    @Override // android.os.Parcelable.Creator
    public final RecordUploadVideoTimeInfo createFromParcel(Parcel in) {
        o.LJIIIZ(in, "in");
        return new RecordUploadVideoTimeInfo(in.readLong(), in.readLong());
    }

    @Override // android.os.Parcelable.Creator
    public final RecordUploadVideoTimeInfo[] newArray(int i) {
        return new RecordUploadVideoTimeInfo[i];
    }
}
