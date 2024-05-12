package X;

import kotlin.jvm.internal.o;

/* renamed from: X.PxR, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66133PxR implements InterfaceC66214Pyk {
    public long LIZ;
    public final C66120PxE LIZIZ;

    public C66133PxR(C66120PxE c66120PxE) {
        this.LIZIZ = c66120PxE;
    }

    @Override // X.InterfaceC66214Pyk
    public final void LIZ(EnumC66158Pxq checkMode, C66210Pyg c66210Pyg) {
        o.LJIIIZ(checkMode, "checkMode");
        C66114Px8.LIZIZ(this.LIZIZ, false, c66210Pyg, this.LIZ);
        C66120PxE event = this.LIZIZ;
        o.LJIIIZ(event, "event");
        C66059PwF.LIZIZ.getClass();
        HandlerC66060PwG.LIZIZ(event);
    }

    @Override // X.InterfaceC66214Pyk
    public final void LIZIZ(EnumC66158Pxq checkMode, java.util.Map<String, Object> map) {
        o.LJIIIZ(checkMode, "checkMode");
        if (checkMode == EnumC66158Pxq.ASYNC && this.LIZIZ.LLI.getCheckModes().contains(EnumC66158Pxq.SYNC)) {
            C66120PxE c66120PxE = this.LIZIZ;
            c66120PxE.getClass();
            c66120PxE.LJLZ = "SensitiveApiException";
            InterfaceC66159Pxr interfaceC66159Pxr = C66117PxB.LIZLLL;
            if (interfaceC66159Pxr != null) {
                interfaceC66159Pxr.actionInvoke(this.LIZIZ);
            }
        }
        this.LIZ = System.nanoTime();
    }
}
