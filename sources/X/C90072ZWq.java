package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.google.android.gms.cast.MediaMetadata;
import com.google.android.gms.cast.MediaQueueContainerMetadata;
import com.google.android.gms.common.images.WebImage;
import java.util.ArrayList;

/* renamed from: X.ZWq, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90072ZWq implements Parcelable.Creator<MediaQueueContainerMetadata> {
    @Override // android.os.Parcelable.Creator
    public final MediaQueueContainerMetadata createFromParcel(Parcel parcel) {
        int LJJIII = C67315QbP.LJJIII(parcel);
        String str = null;
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        double d = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
        int i = 0;
        while (parcel.dataPosition() < LJJIII) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c != 2) {
                if (c != 3) {
                    if (c != 4) {
                        if (c != 5) {
                            if (c != 6) {
                                C67315QbP.LJJII(parcel, readInt);
                            } else {
                                d = C67315QbP.LJIILLIIL(parcel, readInt);
                            }
                        } else {
                            arrayList2 = C67315QbP.LJIIJJI(parcel, readInt, WebImage.CREATOR);
                        }
                    } else {
                        arrayList = C67315QbP.LJIIJJI(parcel, readInt, MediaMetadata.CREATOR);
                    }
                } else {
                    str = C67315QbP.LJII(parcel, readInt);
                }
            } else {
                i = C67315QbP.LJIJJLI(parcel, readInt);
            }
        }
        C67315QbP.LJIIL(parcel, LJJIII);
        return new MediaQueueContainerMetadata(i, d, str, arrayList, arrayList2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ MediaQueueContainerMetadata[] newArray(int i) {
        return new MediaQueueContainerMetadata[i];
    }
}
