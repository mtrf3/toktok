package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.MediaQueueContainerMetadata;
import com.google.android.gms.cast.MediaQueueData;
import com.google.android.gms.cast.MediaQueueItem;
import java.util.ArrayList;

/* renamed from: X.ZWr, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90073ZWr implements Parcelable.Creator<MediaQueueData> {
    @Override // android.os.Parcelable.Creator
    public final MediaQueueData createFromParcel(Parcel parcel) {
        int LJJIII = C67315QbP.LJJIII(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        MediaQueueContainerMetadata mediaQueueContainerMetadata = null;
        ArrayList arrayList = null;
        long j = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < LJJIII) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    str = C67315QbP.LJII(parcel, readInt);
                    break;
                case 3:
                    str2 = C67315QbP.LJII(parcel, readInt);
                    break;
                case 4:
                    i = C67315QbP.LJIJJLI(parcel, readInt);
                    break;
                case 5:
                    str3 = C67315QbP.LJII(parcel, readInt);
                    break;
                case 6:
                    mediaQueueContainerMetadata = (MediaQueueContainerMetadata) C67315QbP.LJI(parcel, readInt, MediaQueueContainerMetadata.CREATOR);
                    break;
                case 7:
                    i2 = C67315QbP.LJIJJLI(parcel, readInt);
                    break;
                case '\b':
                    arrayList = C67315QbP.LJIIJJI(parcel, readInt, MediaQueueItem.CREATOR);
                    break;
                case '\t':
                    i3 = C67315QbP.LJIJJLI(parcel, readInt);
                    break;
                case '\n':
                    j = C67315QbP.LJJ(parcel, readInt);
                    break;
                default:
                    C67315QbP.LJJII(parcel, readInt);
                    break;
            }
        }
        C67315QbP.LJIIL(parcel, LJJIII);
        return new MediaQueueData(str, str2, i, str3, mediaQueueContainerMetadata, i2, arrayList, i3, j);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ MediaQueueData[] newArray(int i) {
        return new MediaQueueData[i];
    }
}
