package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.composer.model.MusicComposerModel;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import kotlin.jvm.internal.o;

/* renamed from: X.H8k, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43578H8k implements Parcelable.Creator<MusicComposerModel> {
    @Override // android.os.Parcelable.Creator
    public final MusicComposerModel createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        return new MusicComposerModel(parcel.readString(), parcel.readInt(), parcel.readInt(), (MusicModel) parcel.readSerializable());
    }

    @Override // android.os.Parcelable.Creator
    public final MusicComposerModel[] newArray(int i) {
        return new MusicComposerModel[i];
    }
}
