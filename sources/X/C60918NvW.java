package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.lynx.hybrid.param.HybridSchemaParam;
import kotlin.jvm.internal.o;

/* renamed from: X.NvW, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60918NvW implements Parcelable.Creator<HybridSchemaParam> {
    @Override // android.os.Parcelable.Creator
    public final HybridSchemaParam createFromParcel(Parcel parcel) {
        o.LJIIJ(parcel, "parcel");
        return new HybridSchemaParam(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final HybridSchemaParam[] newArray(int i) {
        return new HybridSchemaParam[i];
    }
}
