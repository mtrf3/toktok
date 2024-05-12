package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.notification.creator.model.response.NoticeFilterModel;
import com.ss.android.ugc.aweme.notification.creator.model.response.NoticeSortModel;
import com.ss.android.ugc.aweme.notification.creator.model.response.NoticeTabModel;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class MUG implements Parcelable.Creator<NoticeTabModel> {
    @Override // android.os.Parcelable.Creator
    public final NoticeTabModel createFromParcel(Parcel parcel) {
        boolean z;
        boolean z2;
        ArrayList arrayList;
        boolean z3;
        o.LJIIIZ(parcel, "parcel");
        int readInt = parcel.readInt();
        int readInt2 = parcel.readInt();
        String readString = parcel.readString();
        int readInt3 = parcel.readInt();
        if (parcel.readInt() != 0) {
            z = true;
        } else {
            z = false;
        }
        if (parcel.readInt() != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        ArrayList arrayList2 = null;
        if (parcel.readInt() == 0) {
            arrayList = null;
        } else {
            int readInt4 = parcel.readInt();
            arrayList = new ArrayList(readInt4);
            int i = 0;
            while (i != readInt4) {
                i = C279117r.LIZIZ(NoticeFilterModel.CREATOR, parcel, arrayList, i, 1);
            }
        }
        if (parcel.readInt() != 0) {
            int readInt5 = parcel.readInt();
            arrayList2 = new ArrayList(readInt5);
            int i2 = 0;
            while (i2 != readInt5) {
                i2 = C279117r.LIZIZ(NoticeSortModel.CREATOR, parcel, arrayList2, i2, 1);
            }
        }
        int readInt6 = parcel.readInt();
        int readInt7 = parcel.readInt();
        String readString2 = parcel.readString();
        int readInt8 = parcel.readInt();
        if (parcel.readInt() != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        return new NoticeTabModel(readInt, readInt2, readString, readInt3, z, z2, arrayList, arrayList2, readInt6, readInt7, readString2, readInt8, z3, parcel.readInt());
    }

    @Override // android.os.Parcelable.Creator
    public final NoticeTabModel[] newArray(int i) {
        return new NoticeTabModel[i];
    }
}
