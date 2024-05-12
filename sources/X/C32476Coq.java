package X;

import com.bytedance.android.live.base.model.ImageModel;
import kotlin.jvm.internal.o;

/* renamed from: X.Coq, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32476Coq {
    public final ImageModel LIZ;

    public C32476Coq() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C32476Coq) && o.LJ(this.LIZ, ((C32476Coq) obj).LIZ);
    }

    public final int hashCode() {
        ImageModel imageModel = this.LIZ;
        if (imageModel == null) {
            return 0;
        }
        return imageModel.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("GoalGiftListInfo(topLeftIcon=");
        LIZ.append(this.LIZ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C32476Coq(ImageModel imageModel) {
        this.LIZ = imageModel;
    }
}
