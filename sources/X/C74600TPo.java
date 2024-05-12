package X;

import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import kotlin.jvm.internal.o;

/* renamed from: X.TPo, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C74600TPo {
    public final boolean LIZ;
    public final boolean LIZIZ;
    public final int LIZJ;
    public final LiveEffect LIZLLL;
    public final C0TV LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C74600TPo)) {
            return false;
        }
        C74600TPo c74600TPo = (C74600TPo) obj;
        return this.LIZ == c74600TPo.LIZ && this.LIZIZ == c74600TPo.LIZIZ && this.LIZJ == c74600TPo.LIZJ && o.LJ(this.LIZLLL, c74600TPo.LIZLLL) && o.LJ(this.LJ, c74600TPo.LJ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v9 */
    public final int hashCode() {
        boolean z = this.LIZ;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = ((((r0 * 31) + (this.LIZIZ ? 1 : 0)) * 31) + this.LIZJ) * 31;
        LiveEffect liveEffect = this.LIZLLL;
        int hashCode = (i + (liveEffect == null ? 0 : liveEffect.hashCode())) * 31;
        C0TV c0tv = this.LJ;
        return hashCode + (c0tv != null ? c0tv.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PreviewData(isVideoSwitchOn=");
        LIZ.append(this.LIZ);
        LIZ.append(", isUsingBackCamera=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", beautyLevel=");
        LIZ.append(this.LIZJ);
        LIZ.append(", sticker=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", stickerImageBean=");
        LIZ.append(this.LJ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public /* synthetic */ C74600TPo(boolean z, int i, LiveEffect liveEffect) {
        this(true, z, i, liveEffect, null);
    }

    public C74600TPo(boolean z, boolean z2, int i, LiveEffect liveEffect, C0TV c0tv) {
        this.LIZ = z;
        this.LIZIZ = z2;
        this.LIZJ = i;
        this.LIZLLL = liveEffect;
        this.LJ = c0tv;
    }
}
