package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.compliance.privacy.sdk.ui.CommentFilterConfig;
import kotlin.jvm.internal.o;

/* renamed from: X.SOr, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72029SOr implements Parcelable.Creator<CommentFilterConfig> {
    @Override // android.os.Parcelable.Creator
    public final CommentFilterConfig createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        parcel.readInt();
        return new CommentFilterConfig();
    }

    @Override // android.os.Parcelable.Creator
    public final CommentFilterConfig[] newArray(int i) {
        return new CommentFilterConfig[i];
    }
}
