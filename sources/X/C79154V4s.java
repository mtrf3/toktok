package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.tools.ToolsUrlModel;

/* renamed from: X.V4s, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public class C79154V4s implements Parcelable.Creator<ToolsUrlModel> {
    @Override // android.os.Parcelable.Creator
    public final ToolsUrlModel createFromParcel(Parcel parcel) {
        return new ToolsUrlModel(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final ToolsUrlModel[] newArray(int i) {
        return new ToolsUrlModel[i];
    }
}
