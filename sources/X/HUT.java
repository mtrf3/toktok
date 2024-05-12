package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.tools.mvtemplate.cutsame.net.MvEffect;
import com.ss.ugc.effectplatform.model.Effect;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HUT implements Parcelable.Creator<MvEffect> {
    @Override // android.os.Parcelable.Creator
    public final MvEffect createFromParcel(Parcel parcel) {
        Object obj;
        Parcelable.Creator creator;
        o.LJIIIZ(parcel, "parcel");
        Effect effect = null;
        try {
            Object obj2 = Effect.class.getField("CREATOR").get(null);
            if ((obj2 instanceof Parcelable.Creator) && (creator = (Parcelable.Creator) obj2) != null) {
                obj = creator.createFromParcel(parcel);
            } else {
                obj = null;
            }
            if (obj instanceof Effect) {
                effect = (Effect) obj;
            }
        } catch (Exception unused) {
        }
        MvEffect mvEffect = new MvEffect(effect);
        mvEffect.setMd5(parcel.readString());
        return mvEffect;
    }

    @Override // android.os.Parcelable.Creator
    public final MvEffect[] newArray(int i) {
        return new MvEffect[i];
    }
}
