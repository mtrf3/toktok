package X;

import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.o;

/* renamed from: X.0c3, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11070c3 {
    public final boolean LIZ;
    public final InterfaceC08020Te LIZIZ;
    public final LiveEffect LIZJ;
    public final InterfaceC65784Pro<String> LIZLLL;
    public final InterfaceC65784Pro<C76800UCe> LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11070c3)) {
            return false;
        }
        C11070c3 c11070c3 = (C11070c3) obj;
        return this.LIZ == c11070c3.LIZ && o.LJ(this.LIZIZ, c11070c3.LIZIZ) && o.LJ(this.LIZJ, c11070c3.LIZJ) && o.LJ(this.LIZLLL, c11070c3.LIZLLL) && o.LJ(this.LJ, c11070c3.LJ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    public final int hashCode() {
        int hashCode;
        boolean z = this.LIZ;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int hashCode2 = (this.LIZIZ.hashCode() + (r0 * 31)) * 31;
        LiveEffect liveEffect = this.LIZJ;
        if (liveEffect == null) {
            hashCode = 0;
        } else {
            hashCode = liveEffect.hashCode();
        }
        return this.LJ.hashCode() + C1JX.LIZLLL(this.LIZLLL, (hashCode2 + hashCode) * 31, 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MultiGuestStickerListViewBean(isGoLive=");
        LIZ.append(this.LIZ);
        LIZ.append(", effectWrapper=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", initSticker=");
        LIZ.append(this.LIZJ);
        LIZ.append(", eventPage=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", loadFullStickerList=");
        return C06540Nm.LIZJ(LIZ, this.LJ, ')', LIZ);
    }

    public C11070c3(boolean z, C75213TfV c75213TfV, LiveEffect liveEffect, InterfaceC65784Pro eventPage, AqS163S0100000_13 aqS163S0100000_13) {
        o.LJIIIZ(eventPage, "eventPage");
        this.LIZ = z;
        this.LIZIZ = c75213TfV;
        this.LIZJ = liveEffect;
        this.LIZLLL = eventPage;
        this.LJ = aqS163S0100000_13;
    }
}
