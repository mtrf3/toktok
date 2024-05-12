package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.effectcreatormobile.draft.DraftConfigModels;
import kotlin.jvm.internal.o;

/* renamed from: X.aRm, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public class C93494aRm implements Parcelable.Creator<DraftConfigModels> {
    @Override // android.os.Parcelable.Creator
    public final DraftConfigModels createFromParcel(Parcel in) {
        o.LJIIIZ(in, "in");
        return new DraftConfigModels(in.createStringArrayList());
    }

    @Override // android.os.Parcelable.Creator
    public final DraftConfigModels[] newArray(int i) {
        return new DraftConfigModels[i];
    }
}
