package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.effectcreatormobile.assetEditor.liquefy.LiquefyFeatureData;
import kotlin.jvm.internal.o;

/* renamed from: X.aQn, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public class C93433aQn implements Parcelable.Creator<LiquefyFeatureData> {
    @Override // android.os.Parcelable.Creator
    public final LiquefyFeatureData createFromParcel(Parcel in) {
        boolean z;
        boolean z2;
        Boolean bool;
        boolean z3;
        o.LJIIIZ(in, "in");
        boolean z4 = false;
        if (in.readInt() != 0) {
            z = true;
        } else {
            z = false;
        }
        if (in.readInt() != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        float readFloat = in.readFloat();
        float readFloat2 = in.readFloat();
        double readDouble = in.readDouble();
        double readDouble2 = in.readDouble();
        double readDouble3 = in.readDouble();
        double readDouble4 = in.readDouble();
        double readDouble5 = in.readDouble();
        String readString = in.readString();
        Boolean bool2 = null;
        if (in.readInt() != 0) {
            if (in.readInt() != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            bool = Boolean.valueOf(z3);
        } else {
            bool = null;
        }
        if (in.readInt() != 0) {
            if (in.readInt() != 0) {
                z4 = true;
            }
            bool2 = Boolean.valueOf(z4);
        }
        return new LiquefyFeatureData(z, z2, readFloat, readFloat2, readDouble, readDouble2, readDouble3, readDouble4, readDouble5, readString, bool, bool2);
    }

    @Override // android.os.Parcelable.Creator
    public final LiquefyFeatureData[] newArray(int i) {
        return new LiquefyFeatureData[i];
    }
}
