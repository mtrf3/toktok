package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.filter.StrArray;
import com.ss.android.ugc.aweme.shortvideo.RecordContext;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public class HBX implements Parcelable.Creator<RecordContext> {
    @Override // android.os.Parcelable.Creator
    public final RecordContext createFromParcel(Parcel in) {
        o.LJIIIZ(in, "in");
        return new RecordContext((StrArray) in.readParcelable(RecordContext.class.getClassLoader()), (StrArray) in.readParcelable(RecordContext.class.getClassLoader()), (StrArray) in.readParcelable(RecordContext.class.getClassLoader()), (StrArray) in.readParcelable(RecordContext.class.getClassLoader()), (StrArray) in.readParcelable(RecordContext.class.getClassLoader()), (StrArray) in.readParcelable(RecordContext.class.getClassLoader()), (StrArray) in.readParcelable(RecordContext.class.getClassLoader()), (StrArray) in.readParcelable(RecordContext.class.getClassLoader()));
    }

    @Override // android.os.Parcelable.Creator
    public final RecordContext[] newArray(int i) {
        return new RecordContext[i];
    }
}
