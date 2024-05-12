package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.google.android.gms.maps.model.StrokeStyle;
import com.google.android.gms.maps.model.StyleSpan;

/* renamed from: X.Qz1, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68779Qz1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int LJJIII = C67315QbP.LJJIII(parcel);
        StrokeStyle strokeStyle = null;
        double d = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
        while (parcel.dataPosition() < LJJIII) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c != 2) {
                if (c != 3) {
                    C67315QbP.LJJII(parcel, readInt);
                } else {
                    d = C67315QbP.LJIILLIIL(parcel, readInt);
                }
            } else {
                strokeStyle = (StrokeStyle) C67315QbP.LJI(parcel, readInt, StrokeStyle.CREATOR);
            }
        }
        C67315QbP.LJIIL(parcel, LJJIII);
        return new StyleSpan(strokeStyle, d);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new StyleSpan[i];
    }
}
