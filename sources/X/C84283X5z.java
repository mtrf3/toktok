package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.android.ugc.aweme.shortvideo.preview.EditPreviewTO;
import kotlin.jvm.internal.o;

/* renamed from: X.X5z, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public class C84283X5z implements Parcelable.Creator<EditPreviewTO> {
    @Override // android.os.Parcelable.Creator
    public final EditPreviewTO createFromParcel(Parcel in) {
        o.LJIIIZ(in, "in");
        return new EditPreviewTO((FilterBean) in.readParcelable(EditPreviewTO.class.getClassLoader()), in.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final EditPreviewTO[] newArray(int i) {
        return new EditPreviewTO[i];
    }
}
