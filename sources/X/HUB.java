package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.file.CreativePathWorkspaceImpl;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HUB implements Parcelable.Creator<CreativePathWorkspaceImpl> {
    @Override // android.os.Parcelable.Creator
    public final CreativePathWorkspaceImpl createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        return new CreativePathWorkspaceImpl(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final CreativePathWorkspaceImpl[] newArray(int i) {
        return new CreativePathWorkspaceImpl[i];
    }
}
