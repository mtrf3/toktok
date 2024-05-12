package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.ugc.aweme.creation.base.MentionModel;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.GHm, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C41266GHm implements Parcelable.Creator<MentionModel> {
    @Override // android.os.Parcelable.Creator
    public final MentionModel createFromParcel(Parcel in) {
        o.LJIIIZ(in, "in");
        int readInt = in.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        while (readInt != 0) {
            arrayList.add(in.readParcelable(MentionModel.class.getClassLoader()));
            readInt--;
        }
        return new MentionModel(arrayList);
    }

    @Override // android.os.Parcelable.Creator
    public final MentionModel[] newArray(int i) {
        return new MentionModel[i];
    }
}
