package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.tiktok.tpsc.settings.account.adapters.batchdelete.BatchDeleteAdapterConfigs;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SHQ implements Parcelable.Creator<BatchDeleteAdapterConfigs> {
    @Override // android.os.Parcelable.Creator
    public final BatchDeleteAdapterConfigs createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        return new BatchDeleteAdapterConfigs(SHR.valueOf(parcel.readString()), parcel.readInt());
    }

    @Override // android.os.Parcelable.Creator
    public final BatchDeleteAdapterConfigs[] newArray(int i) {
        return new BatchDeleteAdapterConfigs[i];
    }
}
