package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.editSticker.model.CreateAwemeCoverInfo;
import com.ss.android.ugc.aweme.editSticker.model.CreateAwemeCoverTextAttr;
import kotlin.jvm.internal.o;

/* renamed from: X.GaY, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C41782GaY implements Parcelable.Creator<CreateAwemeCoverInfo> {
    @Override // android.os.Parcelable.Creator
    public final CreateAwemeCoverInfo createFromParcel(Parcel in) {
        o.LJIIIZ(in, "in");
        return new CreateAwemeCoverInfo(in.readInt(), in.readInt(), CreateAwemeCoverTextAttr.CREATOR.createFromParcel(in));
    }

    @Override // android.os.Parcelable.Creator
    public final CreateAwemeCoverInfo[] newArray(int i) {
        return new CreateAwemeCoverInfo[i];
    }
}
