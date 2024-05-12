package X;

import com.bytedance.android.live.base.model.ImageModel;
import kotlin.jvm.internal.o;

/* renamed from: X.B9r, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28323B9r {
    public final ImageModel LIZ;

    public C28323B9r() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C28323B9r) && o.LJ(this.LIZ, ((C28323B9r) obj).LIZ);
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
        LIZ.append("MicData(avatar=");
        LIZ.append(this.LIZ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C28323B9r(ImageModel imageModel) {
        this.LIZ = imageModel;
    }
}
