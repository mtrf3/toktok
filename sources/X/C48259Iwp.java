package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.effect.ClipsModel;
import com.ss.android.ugc.aweme.effect.MultiSegmentPropExtra;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.Iwp, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C48259Iwp implements Parcelable.Creator<MultiSegmentPropExtra> {
    @Override // android.os.Parcelable.Creator
    public final MultiSegmentPropExtra createFromParcel(Parcel in) {
        o.LJIIIZ(in, "in");
        int readInt = in.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        while (readInt != 0) {
            arrayList.add(ClipsModel.CREATOR.createFromParcel(in));
            readInt--;
        }
        return new MultiSegmentPropExtra(arrayList);
    }

    @Override // android.os.Parcelable.Creator
    public final MultiSegmentPropExtra[] newArray(int i) {
        return new MultiSegmentPropExtra[i];
    }
}
