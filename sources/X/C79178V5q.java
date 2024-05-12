package X;

import kotlin.jvm.internal.o;

/* renamed from: X.V5q, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C79178V5q extends AbstractC65781Prl implements InterfaceC88472Yns<InterfaceC33691Tx, C76800UCe> {
    public final /* synthetic */ C79225V7l LJLIL;
    public final /* synthetic */ V7U LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;
    public final /* synthetic */ V7R LJLJJI;
    public final /* synthetic */ InterfaceC24760y8<C11850dJ> LJLJJL;
    public final /* synthetic */ InterfaceC24760y8<C11850dJ> LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C79178V5q(C79225V7l c79225V7l, V7U v7u, boolean z, V7R v7r, InterfaceC24760y8<C11850dJ> interfaceC24760y8, InterfaceC24760y8<C11850dJ> interfaceC24760y82) {
        super(1);
        this.LJLIL = c79225V7l;
        this.LJLILLLLZI = v7u;
        this.LJLJI = z;
        this.LJLJJI = v7r;
        this.LJLJJL = interfaceC24760y8;
        this.LJLJJLL = interfaceC24760y82;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(InterfaceC33691Tx interfaceC33691Tx) {
        QZV c43041mW;
        float f;
        float f2;
        float f3;
        InterfaceC33691Tx Canvas = interfaceC33691Tx;
        o.LJIIIZ(Canvas, "$this$Canvas");
        float f4 = 2;
        float f5 = this.LJLIL.LIZ / f4;
        if (!C11850dJ.LIZJ(this.LJLJJL.getValue().LIZ, C11850dJ.LJFF)) {
            C14720hw.LIZJ(Canvas, this.LJLJJL.getValue().LIZ, Canvas.LJJJJIZL((1 - 0.125f) * f5), 0L, 0.0f, null, 124);
        }
        long j = this.LJLJJLL.getValue().LIZ;
        V7U v7u = this.LJLILLLLZI;
        boolean z = this.LJLJI;
        float LIZLLL = C10430b1.LIZLLL(Canvas.LIZIZ()) * 0.0625f;
        if (z) {
            c43041mW = C43031mV.LIZ;
        } else {
            c43041mW = new C43041mW(LIZLLL, 0.0f, 0, 0, 30);
        }
        if (v7u.LIZ) {
            float LIZLLL2 = C10430b1.LIZLLL(Canvas.LIZIZ());
            if (z) {
                f3 = 12.0f;
            } else {
                f3 = 11.5f;
            }
            C14720hw.LIZJ(Canvas, j, (LIZLLL2 * f3) / 24, 0L, 0.0f, c43041mW, 108);
        } else {
            float LIZLLL3 = C10430b1.LIZLLL(Canvas.LIZIZ());
            if (z) {
                f = 1.0f;
            } else {
                f = 1.75f;
            }
            float f6 = 24;
            float f7 = (LIZLLL3 * f) / f6;
            float LIZLLL4 = C10430b1.LIZLLL(Canvas.LIZIZ());
            if (z) {
                f2 = 4.0f;
            } else {
                f2 = 3.25f;
            }
            float f8 = (LIZLLL4 * f2) / f6;
            float f9 = f4 * f7;
            C14720hw.LJIIJ(Canvas, j, C78923UyF.LIZ(f7, f7), C1DF.LIZIZ(C10430b1.LIZLLL(Canvas.LIZIZ()) - f9, C10430b1.LIZIZ(Canvas.LIZIZ()) - f9), C78897Uxp.LJI(f8, f8), c43041mW, 224);
        }
        if (this.LJLJI) {
            V7R v7r = this.LJLJJI;
            float LIZLLL5 = C10430b1.LIZLLL(Canvas.LIZIZ());
            v7r.LIZ.reset();
            float f10 = 24;
            float f11 = (10.25f * LIZLLL5) / f10;
            float f12 = (15.0642f * LIZLLL5) / f10;
            v7r.LIZ.LIZIZ(f11, f12);
            v7r.LIZ.LJIIJ((18.1307f * LIZLLL5) / f10, (6.94473f * LIZLLL5) / f10);
            v7r.LIZ.LJFF((18.323f * LIZLLL5) / f10, (6.74657f * LIZLLL5) / f10, (18.6395f * LIZLLL5) / f10, (6.74185f * LIZLLL5) / f10, (18.8377f * LIZLLL5) / f10, (6.93418f * LIZLLL5) / f10);
            v7r.LIZ.LJIIJ((19.5553f * LIZLLL5) / f10, (7.63065f * LIZLLL5) / f10);
            v7r.LIZ.LJFF((19.7534f * LIZLLL5) / f10, (7.82298f * LIZLLL5) / f10, (19.7581f * LIZLLL5) / f10, (8.13952f * LIZLLL5) / f10, (19.5658f * LIZLLL5) / f10, (8.33768f * LIZLLL5) / f10);
            float f13 = (17.1965f * LIZLLL5) / f10;
            v7r.LIZ.LJIIJ((10.9676f * LIZLLL5) / f10, f13);
            float f14 = (17.6012f * LIZLLL5) / f10;
            v7r.LIZ.LJFF((10.5748f * LIZLLL5) / f10, f14, (9.92521f * LIZLLL5) / f10, f14, (9.53241f * LIZLLL5) / f10, f13);
            v7r.LIZ.LJIIJ((5.43418f * LIZLLL5) / f10, (12.974f * LIZLLL5) / f10);
            v7r.LIZ.LJFF((5.24185f * LIZLLL5) / f10, (12.7759f * LIZLLL5) / f10, (5.24657f * LIZLLL5) / f10, (12.4593f * LIZLLL5) / f10, (5.44473f * LIZLLL5) / f10, (12.267f * LIZLLL5) / f10);
            v7r.LIZ.LJIIJ((6.16231f * LIZLLL5) / f10, (11.5705f * LIZLLL5) / f10);
            v7r.LIZ.LJFF((6.36046f * LIZLLL5) / f10, (11.3782f * LIZLLL5) / f10, (6.67701f * LIZLLL5) / f10, (11.3829f * LIZLLL5) / f10, (6.86934f * LIZLLL5) / f10, (LIZLLL5 * 11.5811f) / f10);
            v7r.LIZ.LJIIJ(f11, f12);
            v7r.LIZ.close();
            v7r.LIZIZ.LIZIZ(v7r.LIZ);
            v7r.LIZJ.reset();
            InterfaceC11660d0 interfaceC11660d0 = v7r.LIZIZ;
            interfaceC11660d0.LIZ(0.0f, interfaceC11660d0.getLength(), v7r.LIZJ);
            InterfaceC11610cv interfaceC11610cv = v7r.LIZJ;
            long j2 = C11850dJ.LIZJ;
            C43031mV c43031mV = C43031mV.LIZ;
            InterfaceC33691Tx.LJJJJL.getClass();
            Canvas.LJJLIIIJJI(interfaceC11610cv, j2, 1.0f, c43031mV, null, C14730hx.LIZIZ);
        }
        return C76800UCe.LIZ;
    }
}
