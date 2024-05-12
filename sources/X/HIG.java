package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.ugc.aweme.CreationConfigModel;
import com.ss.ugc.aweme.creation.base.BasicModel;
import com.ss.ugc.aweme.creation.base.EditConfigModel;
import com.ss.ugc.aweme.creation.base.PublishConfigModel;
import com.ss.ugc.aweme.creation.base.RecordConfigModel;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public class HIG implements Parcelable.Creator<CreationConfigModel> {
    @Override // android.os.Parcelable.Creator
    public final CreationConfigModel createFromParcel(Parcel in) {
        o.LJIIIZ(in, "in");
        return new CreationConfigModel(in.readString(), (BasicModel) in.readParcelable(CreationConfigModel.class.getClassLoader()), (PublishConfigModel) in.readParcelable(CreationConfigModel.class.getClassLoader()), (RecordConfigModel) in.readParcelable(CreationConfigModel.class.getClassLoader()), (EditConfigModel) in.readParcelable(CreationConfigModel.class.getClassLoader()));
    }

    @Override // android.os.Parcelable.Creator
    public final CreationConfigModel[] newArray(int i) {
        return new CreationConfigModel[i];
    }
}
