package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.common.ShareKitPanel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.o;

/* renamed from: X.Gqm, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42788Gqm implements Parcelable.Creator<ShareKitPanel> {
    @Override // android.os.Parcelable.Creator
    public final ShareKitPanel createFromParcel(Parcel parcel) {
        Integer valueOf;
        o.LJIIIZ(parcel, "parcel");
        Effect effect = (Effect) parcel.readParcelable(ShareKitPanel.class.getClassLoader());
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        if (parcel.readInt() == 0) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(parcel.readInt());
        }
        return new ShareKitPanel(effect, readString, readString2, valueOf, parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final ShareKitPanel[] newArray(int i) {
        return new ShareKitPanel[i];
    }
}
