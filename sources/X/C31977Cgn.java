package X;

import com.bytedance.android.live.base.model.ImageModel;
import defpackage.s0;
import kotlin.jvm.internal.o;

/* renamed from: X.Cgn, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31977Cgn {
    public final String LIZ;
    public final ImageModel LIZIZ;
    public final Integer LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31977Cgn)) {
            return false;
        }
        C31977Cgn c31977Cgn = (C31977Cgn) obj;
        return o.LJ(this.LIZ, c31977Cgn.LIZ) && o.LJ(this.LIZIZ, c31977Cgn.LIZIZ) && o.LJ(this.LIZJ, c31977Cgn.LIZJ);
    }

    public final int hashCode() {
        int hashCode = this.LIZ.hashCode() * 31;
        ImageModel imageModel = this.LIZIZ;
        int hashCode2 = (hashCode + (imageModel == null ? 0 : imageModel.hashCode())) * 31;
        Integer num = this.LIZJ;
        return hashCode2 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("GameInteractionTipsMessage(logKey=");
        LIZ.append(this.LIZ);
        LIZ.append(", iconLeft=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", bgColor=");
        return s0.LIZJ(LIZ, this.LIZJ, ')', LIZ);
    }

    public C31977Cgn(String str, ImageModel imageModel, Integer num) {
        this.LIZ = str;
        this.LIZIZ = imageModel;
        this.LIZJ = num;
    }

    public /* synthetic */ C31977Cgn(String str, ImageModel imageModel, Integer num, int i) {
        this(str, (i & 2) != 0 ? null : imageModel, (i & 4) != 0 ? null : num);
    }
}
