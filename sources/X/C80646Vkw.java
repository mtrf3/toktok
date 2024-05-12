package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.ugc.aweme.creation.base.PublishConfigModel;
import kotlin.jvm.internal.o;

/* renamed from: X.Vkw, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C80646Vkw implements Parcelable.Creator<PublishConfigModel> {
    @Override // android.os.Parcelable.Creator
    public final PublishConfigModel createFromParcel(Parcel in) {
        o.LJIIIZ(in, "in");
        return new PublishConfigModel(in.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final PublishConfigModel[] newArray(int i) {
        return new PublishConfigModel[i];
    }
}
