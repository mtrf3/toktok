package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.ugc.aweme.creation.base.RecordBeautyConfigModel;
import com.ss.ugc.aweme.creation.base.RecordConfigModel;
import com.ss.ugc.aweme.creation.base.RecordFilterConfigModel;
import com.ss.ugc.aweme.creation.base.RecordFlashConfigModel;
import com.ss.ugc.aweme.creation.base.RecordSwapConfigModel;
import com.ss.ugc.aweme.creation.base.UploadConfigModel;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.PSn, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C64485PSn implements Parcelable.Creator<RecordConfigModel> {
    @Override // android.os.Parcelable.Creator
    public final RecordConfigModel createFromParcel(Parcel in) {
        Boolean bool;
        Integer num;
        Boolean bool2;
        boolean z;
        boolean z2;
        o.LJIIIZ(in, "in");
        int readInt = in.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        while (readInt != 0) {
            arrayList.add(in.readParcelable(RecordConfigModel.class.getClassLoader()));
            readInt--;
        }
        boolean z3 = false;
        Boolean bool3 = null;
        if (in.readInt() != 0) {
            if (in.readInt() != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            bool = Boolean.valueOf(z2);
        } else {
            bool = null;
        }
        ArrayList<String> createStringArrayList = in.createStringArrayList();
        if (in.readInt() != 0) {
            num = Integer.valueOf(in.readInt());
        } else {
            num = null;
        }
        if (in.readInt() != 0) {
            if (in.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            bool2 = Boolean.valueOf(z);
        } else {
            bool2 = null;
        }
        String readString = in.readString();
        if (in.readInt() != 0) {
            if (in.readInt() != 0) {
                z3 = true;
            }
            bool3 = Boolean.valueOf(z3);
        }
        return new RecordConfigModel(arrayList, bool, createStringArrayList, num, bool2, readString, bool3, (UploadConfigModel) in.readParcelable(RecordConfigModel.class.getClassLoader()), (RecordFilterConfigModel) in.readParcelable(RecordConfigModel.class.getClassLoader()), (RecordBeautyConfigModel) in.readParcelable(RecordConfigModel.class.getClassLoader()), (RecordSwapConfigModel) in.readParcelable(RecordConfigModel.class.getClassLoader()), (RecordFlashConfigModel) in.readParcelable(RecordConfigModel.class.getClassLoader()));
    }

    @Override // android.os.Parcelable.Creator
    public final RecordConfigModel[] newArray(int i) {
        return new RecordConfigModel[i];
    }
}
