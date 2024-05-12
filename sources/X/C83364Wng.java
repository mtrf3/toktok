package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Wng, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83364Wng implements InterfaceC83392Wo8 {
    public final /* synthetic */ C83374Wnq LIZ;

    public C83364Wng(C83374Wnq c83374Wnq) {
        this.LIZ = c83374Wnq;
    }

    @Override // X.InterfaceC83392Wo8
    public final void LIZ(AbstractC83369Wnl message) {
        C83355WnX c83355WnX;
        EnumC83354WnW enumC83354WnW;
        C83356WnY c83356WnY;
        o.LJIIIZ(message, "message");
        int i = C83362Wne.LIZIZ[message.LIZ().ordinal()];
        if (i != 1) {
            if (i != 2 || !(message instanceof C83356WnY) || (c83356WnY = (C83356WnY) message) == null || !c83356WnY.LJ) {
                return;
            }
            this.LIZ.LJLLILLLL.LJI(C76800UCe.LIZ);
            return;
        }
        if (!(message instanceof C83355WnX) || (c83355WnX = (C83355WnX) message) == null || (enumC83354WnW = c83355WnX.LIZJ) == null) {
            return;
        }
        int i2 = C83362Wne.LIZ[enumC83354WnW.ordinal()];
        if (i2 != 1 && i2 != 2) {
            return;
        }
        this.LIZ.LJLLILLLL.LJI(C76800UCe.LIZ);
    }
}
