package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.ugc.effectplatform.model.TemplateEffectExtra;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public class ESY implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel in) {
        o.LJIIJ(in, "in");
        return new TemplateEffectExtra(in.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new TemplateEffectExtra[i];
    }
}
