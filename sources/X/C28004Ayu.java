package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ChunkDebugInfo;
import kotlin.jvm.internal.o;

/* renamed from: X.Ayu, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28004Ayu implements Parcelable.Creator<ChunkDebugInfo> {
    @Override // android.os.Parcelable.Creator
    public final ChunkDebugInfo createFromParcel(Parcel parcel) {
        Long valueOf;
        o.LJIIIZ(parcel, "parcel");
        if (parcel.readInt() == 0) {
            valueOf = null;
        } else {
            valueOf = Long.valueOf(parcel.readLong());
        }
        return new ChunkDebugInfo(valueOf);
    }

    @Override // android.os.Parcelable.Creator
    public final ChunkDebugInfo[] newArray(int i) {
        return new ChunkDebugInfo[i];
    }
}
