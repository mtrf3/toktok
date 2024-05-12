package X;

import kotlin.jvm.internal.o;

/* renamed from: X.3be, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C87263be implements InterfaceC87283bg {
    public final Long LJLIL;

    public C87263be() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C87263be) && o.LJ(this.LJLIL, ((C87263be) obj).LJLIL);
    }

    public final int hashCode() {
        Long l = this.LJLIL;
        if (l == null) {
            return 0;
        }
        return l.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("VideoStickerNotificationUserConfig(rangeStartTime=");
        return JBR.LJ(LIZ, this.LJLIL, ')', LIZ);
    }

    public C87263be(Long l) {
        this.LJLIL = l;
    }
}
