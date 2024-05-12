package X;

import android.graphics.drawable.Drawable;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import kotlin.jvm.internal.o;

/* renamed from: X.0WZ, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0WZ {
    public static final /* synthetic */ int LJI = 0;
    public final LiveEffect LIZ;
    public final long LIZIZ;
    public final long LIZJ;
    public final Drawable LIZLLL;
    public final EnumC08760Wa LJ;
    public boolean LJFF;

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("InsertSticker(effect=");
        LIZ.append(this.LIZ);
        LIZ.append(", fromUserId=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", startTime=");
        LIZ.append(this.LIZJ);
        LIZ.append(", localDrawable=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", insertStickerType=");
        LIZ.append(this.LJ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final int hashCode() {
        LiveEffect liveEffect = this.LIZ;
        if (liveEffect != null) {
            return liveEffect.hashCode();
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0WZ)) {
            return false;
        }
        C0WZ c0wz = (C0WZ) obj;
        if (!o.LJ(this.LIZ, c0wz.LIZ) || this.LIZIZ != c0wz.LIZIZ || this.LIZJ != c0wz.LIZJ) {
            return false;
        }
        return true;
    }

    public C0WZ(LiveEffect liveEffect, long j, long j2, EnumC08760Wa insertStickerType) {
        o.LJIIIZ(insertStickerType, "insertStickerType");
        this.LIZ = liveEffect;
        this.LIZIZ = j;
        this.LIZJ = j2;
        this.LIZLLL = null;
        this.LJ = insertStickerType;
    }
}
