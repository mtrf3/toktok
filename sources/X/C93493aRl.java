package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.effectcreatormobile.draft.DraftConfigEffect;
import com.bytedance.effectcreatormobile.draft.DraftConfigModels;
import kotlin.jvm.internal.o;

/* renamed from: X.aRl, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public class C93493aRl implements Parcelable.Creator<DraftConfigEffect> {
    @Override // android.os.Parcelable.Creator
    public final DraftConfigEffect createFromParcel(Parcel in) {
        o.LJIIIZ(in, "in");
        return new DraftConfigEffect(DraftConfigModels.CREATOR.createFromParcel(in));
    }

    @Override // android.os.Parcelable.Creator
    public final DraftConfigEffect[] newArray(int i) {
        return new DraftConfigEffect[i];
    }
}
