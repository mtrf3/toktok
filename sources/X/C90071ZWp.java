package X;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.MediaMetadata;
import com.google.android.gms.common.images.WebImage;
import java.util.ArrayList;

/* renamed from: X.ZWp, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90071ZWp implements Parcelable.Creator<MediaMetadata> {
    @Override // android.os.Parcelable.Creator
    public final MediaMetadata createFromParcel(Parcel parcel) {
        int LJJIII = C67315QbP.LJJIII(parcel);
        ArrayList arrayList = null;
        Bundle bundle = null;
        int i = 0;
        while (parcel.dataPosition() < LJJIII) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c != 2) {
                if (c != 3) {
                    if (c != 4) {
                        C67315QbP.LJJII(parcel, readInt);
                    } else {
                        i = C67315QbP.LJIJJLI(parcel, readInt);
                    }
                } else {
                    bundle = C67315QbP.LIZIZ(parcel, readInt);
                }
            } else {
                arrayList = C67315QbP.LJIIJJI(parcel, readInt, WebImage.CREATOR);
            }
        }
        C67315QbP.LJIIL(parcel, LJJIII);
        return new MediaMetadata(arrayList, bundle, i);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ MediaMetadata[] newArray(int i) {
        return new MediaMetadata[i];
    }
}
