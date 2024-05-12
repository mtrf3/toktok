package X;

import kotlin.jvm.internal.o;

/* renamed from: X.3PA, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3PA extends C3PE {
    public final C3PC LIZIZ;
    public final Long LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3PA)) {
            return false;
        }
        C3PA c3pa = (C3PA) obj;
        return this.LIZIZ == c3pa.LIZIZ && o.LJ(this.LIZJ, c3pa.LIZJ);
    }

    public final int hashCode() {
        int hashCode = this.LIZIZ.hashCode() * 31;
        Long l = this.LIZJ;
        return hashCode + (l == null ? 0 : l.hashCode());
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SendSticker(messageType=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", stickerId=");
        return JBR.LJ(LIZ, this.LIZJ, ')', LIZ);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3PA(C3PC messageType, Long l) {
        super("send_sticker");
        o.LJIIIZ(messageType, "messageType");
        this.LIZIZ = messageType;
        this.LIZJ = l;
    }
}
