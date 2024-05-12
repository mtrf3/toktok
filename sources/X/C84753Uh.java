package X;

import defpackage.s0;
import kotlin.jvm.internal.o;

/* renamed from: X.3Uh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C84753Uh extends C3UX {
    public final Integer LJ;

    public C84753Uh() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C84753Uh) && o.LJ(this.LJ, ((C84753Uh) obj).LJ);
    }

    public final int hashCode() {
        Integer num = this.LJ;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    @Override // X.C3UX
    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("EnterVideoStickerPageEventKey(type=");
        return s0.LIZJ(LIZ, this.LJ, ')', LIZ);
    }

    public C84753Uh(Integer num) {
        super("im_enter_video_sticker_page_performance", String.valueOf(num), 0.0f, null, 12);
        this.LJ = num;
    }
}
