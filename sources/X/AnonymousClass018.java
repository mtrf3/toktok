package X;

import com.bytedance.android.live.base.model.ImageModel;
import kotlin.jvm.internal.o;

/* renamed from: X.018, reason: invalid class name */
/* loaded from: classes.dex */
public final class AnonymousClass018 {
    public final String LIZ;
    public final String LIZIZ;
    public final ImageModel LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnonymousClass018)) {
            return false;
        }
        AnonymousClass018 anonymousClass018 = (AnonymousClass018) obj;
        return o.LJ(this.LIZ, anonymousClass018.LIZ) && o.LJ(this.LIZIZ, anonymousClass018.LIZIZ) && o.LJ(this.LIZJ, anonymousClass018.LIZJ);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("UserData(userId=");
        LIZ.append(this.LIZ);
        LIZ.append(", nickName=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", avatarThumb=");
        LIZ.append(this.LIZJ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final int hashCode() {
        return this.LIZJ.hashCode() + C79062V1e.LJ(this.LIZIZ, this.LIZ.hashCode() * 31, 31);
    }

    public AnonymousClass018(String userId, String str, ImageModel imageModel) {
        o.LJIIIZ(userId, "userId");
        this.LIZ = userId;
        this.LIZIZ = str;
        this.LIZJ = imageModel;
    }
}
