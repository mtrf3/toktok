package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.ugc.aweme.creation.base.EditConfigModel;
import com.ss.ugc.aweme.creation.base.StickerConfigModel;
import kotlin.jvm.internal.o;

/* renamed from: X.X5y, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public class C84282X5y implements Parcelable.Creator<EditConfigModel> {
    @Override // android.os.Parcelable.Creator
    public final EditConfigModel createFromParcel(Parcel in) {
        o.LJIIIZ(in, "in");
        return new EditConfigModel((StickerConfigModel) in.readParcelable(EditConfigModel.class.getClassLoader()));
    }

    @Override // android.os.Parcelable.Creator
    public final EditConfigModel[] newArray(int i) {
        return new EditConfigModel[i];
    }
}
