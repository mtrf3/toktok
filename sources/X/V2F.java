package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.im.message.template.component.IconTypeComponent;
import com.ss.android.ugc.aweme.im.message.template.component.ImageComponent;
import com.ss.android.ugc.aweme.im.message.template.component.ResolutionComponent;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class V2F implements Parcelable.Creator<ImageComponent> {
    @Override // android.os.Parcelable.Creator
    public final ImageComponent createFromParcel(Parcel parcel) {
        ResolutionComponent createFromParcel;
        o.LJIIIZ(parcel, "parcel");
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        if (parcel.readInt() == 0) {
            createFromParcel = null;
        } else {
            createFromParcel = ResolutionComponent.CREATOR.createFromParcel(parcel);
        }
        return new ImageComponent(createStringArrayList, readString, readString2, createFromParcel, parcel.readString(), IconTypeComponent.CREATOR.createFromParcel(parcel));
    }

    @Override // android.os.Parcelable.Creator
    public final ImageComponent[] newArray(int i) {
        return new ImageComponent[i];
    }
}
