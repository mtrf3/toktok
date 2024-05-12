package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.TemplateEffectInfo;
import kotlin.jvm.internal.o;

/* renamed from: X.ERq, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36434ERq implements Parcelable.Creator<TemplateEffectInfo> {
    @Override // android.os.Parcelable.Creator
    public final TemplateEffectInfo createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        return new TemplateEffectInfo(parcel.readString(), parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final TemplateEffectInfo[] newArray(int i) {
        return new TemplateEffectInfo[i];
    }
}
