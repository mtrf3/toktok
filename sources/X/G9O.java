package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.edit.TTStoryUploadModel;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class G9O implements Parcelable.Creator<TTStoryUploadModel> {
    @Override // android.os.Parcelable.Creator
    public final TTStoryUploadModel createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        return new TTStoryUploadModel(parcel.readInt(), parcel.readInt(), parcel.readInt());
    }

    @Override // android.os.Parcelable.Creator
    public final TTStoryUploadModel[] newArray(int i) {
        return new TTStoryUploadModel[i];
    }
}
