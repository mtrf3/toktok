package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.publish.privacy.PermissionConfigure;
import com.ss.android.ugc.aweme.publish.privacy.PostBtnConfigure;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class G9K implements Parcelable.Creator<PermissionConfigure> {
    @Override // android.os.Parcelable.Creator
    public final PermissionConfigure createFromParcel(Parcel parcel) {
        boolean z;
        PostBtnConfigure createFromParcel;
        o.LJIIIZ(parcel, "parcel");
        int readInt = parcel.readInt();
        int readInt2 = parcel.readInt();
        if (parcel.readInt() != 0) {
            z = true;
        } else {
            z = false;
        }
        VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) parcel.readParcelable(PermissionConfigure.class.getClassLoader());
        if (parcel.readInt() == 0) {
            createFromParcel = null;
        } else {
            createFromParcel = PostBtnConfigure.CREATOR.createFromParcel(parcel);
        }
        return new PermissionConfigure(readInt, readInt2, z, videoPublishEditModel, createFromParcel, parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final PermissionConfigure[] newArray(int i) {
        return new PermissionConfigure[i];
    }
}
