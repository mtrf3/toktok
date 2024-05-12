package X;

import kotlin.jvm.internal.AqS173S0100000_7;
import kotlin.jvm.internal.o;

/* renamed from: X.ICv, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C46241ICv implements TII {
    public final TEZ LIZ;
    public final InterfaceC88472Yns<? super C43916HLk, C76800UCe> LIZIZ;

    @Override // X.TII
    public final <T> TIH LIZ(InterfaceC46243ICx<T> request) {
        o.LJIIIZ(request, "request");
        if (request.LIZIZ() == EnumC44267HYx.UI_CLICK) {
            if (request instanceof TID) {
                TID tid = (TID) request;
                this.LIZIZ.invoke(C1JD.LJ(this.LIZ, tid, tid.LJIIIIZZ));
            } else if (request instanceof TIF) {
                this.LIZIZ.invoke(null);
            }
        }
        return new TIH(false, null);
    }

    public C46241ICv(TEZ stickerDataManager, AqS173S0100000_7 aqS173S0100000_7) {
        o.LJIIIZ(stickerDataManager, "stickerDataManager");
        this.LIZ = stickerDataManager;
        this.LIZIZ = aqS173S0100000_7;
    }
}
