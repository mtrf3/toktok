package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.ugc.aweme.creation.base.UploadConfigModel;
import kotlin.jvm.internal.o;

/* renamed from: X.PSm, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C64484PSm implements Parcelable.Creator<UploadConfigModel> {
    @Override // android.os.Parcelable.Creator
    public final UploadConfigModel createFromParcel(Parcel in) {
        Integer num;
        Integer num2;
        Integer num3;
        Integer num4;
        Integer num5;
        Integer num6;
        boolean z;
        boolean z2;
        Boolean bool;
        boolean z3;
        o.LJIIIZ(in, "in");
        EnumC61992bz enumC61992bz = null;
        if (in.readInt() != 0) {
            num = Integer.valueOf(in.readInt());
        } else {
            num = null;
        }
        String readString = in.readString();
        if (in.readInt() != 0) {
            num2 = Integer.valueOf(in.readInt());
        } else {
            num2 = null;
        }
        if (in.readInt() != 0) {
            num3 = Integer.valueOf(in.readInt());
        } else {
            num3 = null;
        }
        if (in.readInt() != 0) {
            num4 = Integer.valueOf(in.readInt());
        } else {
            num4 = null;
        }
        if (in.readInt() != 0) {
            num5 = Integer.valueOf(in.readInt());
        } else {
            num5 = null;
        }
        if (in.readInt() != 0) {
            num6 = Integer.valueOf(in.readInt());
        } else {
            num6 = null;
        }
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
            z4 = true;
        }
        if (in.readInt() != 0) {
            enumC61992bz = (EnumC61992bz) V0N.LJJJ(EnumC61992bz.class, in.readString());
        }
        return new UploadConfigModel(num, readString, num2, num3, num4, num5, num6, z, z2, bool, z4, enumC61992bz);
    }

    @Override // android.os.Parcelable.Creator
    public final UploadConfigModel[] newArray(int i) {
        return new UploadConfigModel[i];
    }
}
