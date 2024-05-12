package X;

import com.bytedance.android.livesdk.model.message.AnchorToolModification;
import com.bytedance.android.livesdkapi.depend.model.live.EffectInfo;
import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.CYz, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31529CYz {
    public final AnchorToolModification LIZ;
    public final EffectInfo LIZIZ;
    public final long LIZJ;
    public final String LIZLLL;
    public final String LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31529CYz)) {
            return false;
        }
        C31529CYz c31529CYz = (C31529CYz) obj;
        return o.LJ(this.LIZ, c31529CYz.LIZ) && o.LJ(this.LIZIZ, c31529CYz.LIZIZ) && this.LIZJ == c31529CYz.LIZJ && o.LJ(this.LIZLLL, c31529CYz.LIZLLL) && o.LJ(this.LJ, c31529CYz.LJ);
    }

    public final int hashCode() {
        int hashCode;
        AnchorToolModification anchorToolModification = this.LIZ;
        int i = 0;
        if (anchorToolModification == null) {
            hashCode = 0;
        } else {
            hashCode = anchorToolModification.hashCode();
        }
        int i2 = hashCode * 31;
        EffectInfo effectInfo = this.LIZIZ;
        if (effectInfo != null) {
            i = effectInfo.hashCode();
        }
        return this.LJ.hashCode() + C79062V1e.LJ(this.LIZLLL, JBR.LIZJ(this.LIZJ, (i2 + i) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ModificationData(modification=");
        LIZ.append(this.LIZ);
        LIZ.append(", effectInfo=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", starTime=");
        LIZ.append(this.LIZJ);
        LIZ.append(", watchScene=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", watchType=");
        return q.LIZIZ(LIZ, this.LJ, ')', LIZ);
    }

    public C31529CYz(AnchorToolModification anchorToolModification, EffectInfo effectInfo, long j, String watchScene, String str) {
        o.LJIIIZ(watchScene, "watchScene");
        this.LIZ = anchorToolModification;
        this.LIZIZ = effectInfo;
        this.LIZJ = j;
        this.LIZLLL = watchScene;
        this.LJ = str;
    }
}
