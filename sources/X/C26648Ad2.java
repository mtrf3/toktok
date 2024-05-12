package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.LinkRichText;
import kotlin.jvm.internal.o;

/* renamed from: X.Ad2, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26648Ad2 {
    public final LinkRichText LIZ;
    public final boolean LIZIZ;

    public C26648Ad2() {
        this(null, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C26648Ad2)) {
            return false;
        }
        C26648Ad2 c26648Ad2 = (C26648Ad2) obj;
        return o.LJ(this.LIZ, c26648Ad2.LIZ) && this.LIZIZ == c26648Ad2.LIZIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        LinkRichText linkRichText = this.LIZ;
        int hashCode = (linkRichText == null ? 0 : linkRichText.hashCode()) * 31;
        boolean z = this.LIZIZ;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PolicyItemVO(privacyPolicyStatement=");
        LIZ.append(this.LIZ);
        LIZ.append(", isFromLuckyBag=");
        return C48339Iy7.LIZJ(LIZ, this.LIZIZ, ')', LIZ);
    }

    public C26648Ad2(LinkRichText linkRichText, boolean z) {
        this.LIZ = linkRichText;
        this.LIZIZ = z;
    }
}
