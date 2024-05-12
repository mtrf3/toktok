package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.effectcreatormobile.draft.DraftConfig;
import com.bytedance.effectcreatormobile.draft.DraftConfigEffect;
import kotlin.jvm.internal.o;

/* renamed from: X.aRk, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public class C93492aRk implements Parcelable.Creator<DraftConfig> {
    @Override // android.os.Parcelable.Creator
    public final DraftConfig createFromParcel(Parcel in) {
        o.LJIIIZ(in, "in");
        return new DraftConfig(DraftConfigEffect.CREATOR.createFromParcel(in), in.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final DraftConfig[] newArray(int i) {
        return new DraftConfig[i];
    }
}
