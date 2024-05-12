package X;

import com.ss.android.ugc.aweme.im.message.template.component.ImageComponent;
import kotlin.jvm.internal.o;

/* renamed from: X.4by, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C112944by implements InterfaceC112844bo {
    public final ImageComponent LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C112944by) && o.LJ(this.LIZ, ((C112944by) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("RemoteType(imageComponent=");
        LIZ.append(this.LIZ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C112944by(ImageComponent imageComponent) {
        o.LJIIIZ(imageComponent, "imageComponent");
        this.LIZ = imageComponent;
    }
}
