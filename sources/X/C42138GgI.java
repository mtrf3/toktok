package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.EditAdjustClipsState;
import kotlin.jvm.internal.o;

/* renamed from: X.GgI, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42138GgI implements Parcelable.Creator<EditAdjustClipsState> {
    @Override // android.os.Parcelable.Creator
    public final EditAdjustClipsState createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        return new EditAdjustClipsState((OSZ) parcel.readSerializable(), (OSZ) parcel.readSerializable());
    }

    @Override // android.os.Parcelable.Creator
    public final EditAdjustClipsState[] newArray(int i) {
        return new EditAdjustClipsState[i];
    }
}
