package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.share.base.model.ShareModel;
import kotlin.jvm.internal.o;

/* renamed from: X.Og9, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public class C62513Og9 implements Parcelable.Creator<ShareModel> {
    @Override // android.os.Parcelable.Creator
    public final ShareModel createFromParcel(Parcel in) {
        o.LJIIIZ(in, "in");
        return new ShareModel(in.readSerializable());
    }

    @Override // android.os.Parcelable.Creator
    public final ShareModel[] newArray(int i) {
        return new ShareModel[i];
    }
}
