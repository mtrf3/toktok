package X;

import com.bytedance.android.livesdk.gift.model.GiftHintInfo;
import kotlin.jvm.internal.o;

/* renamed from: X.CrD, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32623CrD {
    public final GiftHintInfo LIZ;
    public final C09 LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C32623CrD)) {
            return false;
        }
        C32623CrD c32623CrD = (C32623CrD) obj;
        return o.LJ(this.LIZ, c32623CrD.LIZ) && this.LIZIZ == c32623CrD.LIZIZ;
    }

    public final int hashCode() {
        int hashCode = this.LIZ.hashCode() * 31;
        C09 c09 = this.LIZIZ;
        return hashCode + (c09 == null ? 0 : c09.hashCode());
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("GiftShowBubbleHintEvent(hint=");
        LIZ.append(this.LIZ);
        LIZ.append(", tooltipType=");
        LIZ.append(this.LIZIZ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C32623CrD(GiftHintInfo giftHintInfo, C09 c09) {
        this.LIZ = giftHintInfo;
        this.LIZIZ = c09;
    }
}
