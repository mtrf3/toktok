package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.V8c, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C79242V8c implements Parcelable.Creator<LiveEffect.PlDataBean> {
    @Override // android.os.Parcelable.Creator
    public final LiveEffect.PlDataBean createFromParcel(Parcel parcel) {
        boolean z;
        o.LJIIIZ(parcel, "parcel");
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        boolean z2 = false;
        if (parcel.readInt() != 0) {
            z = true;
        } else {
            z = false;
        }
        if (parcel.readInt() != 0) {
            z2 = true;
        }
        return new LiveEffect.PlDataBean(createStringArrayList, readString, readString2, z, z2, parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
    }

    @Override // android.os.Parcelable.Creator
    public final LiveEffect.PlDataBean[] newArray(int i) {
        return new LiveEffect.PlDataBean[i];
    }
}
