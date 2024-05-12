package X;

import kotlin.jvm.internal.o;

/* renamed from: X.0Rk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C07560Rk {
    public final boolean LIZ = false;
    public final C3BJ<AbstractC07660Ru> LIZIZ;

    public C07560Rk(XLL xll) {
        this.LIZIZ = xll;
    }

    public final Object LIZ(AbstractC07660Ru abstractC07660Ru, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("emitState: ");
        LIZ.append(abstractC07660Ru);
        C0NB.LIZIZ("KaraokeViewModel", X1D.LIZIZ(LIZ));
        if (this.LIZ) {
            if (abstractC07660Ru instanceof C1LQ) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("PlayerAction Success: ");
                LIZ2.append(((C1LQ) abstractC07660Ru).LIZ);
                String content = X1D.LIZIZ(LIZ2);
                o.LJIIIZ(content, "content");
                C30868C9o.LJI(content);
            } else if (abstractC07660Ru instanceof C1LD) {
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("SongAction Success: ");
                LIZ3.append(((C1LD) abstractC07660Ru).LIZ);
                String content2 = X1D.LIZIZ(LIZ3);
                o.LJIIIZ(content2, "content");
                C30868C9o.LJI(content2);
            } else if (abstractC07660Ru instanceof C1LO) {
                StringBuilder LIZ4 = X1D.LIZ();
                LIZ4.append("PlayerAction Failed: ");
                LIZ4.append(((C1LO) abstractC07660Ru).LIZ);
                String content3 = X1D.LIZIZ(LIZ4);
                o.LJIIIZ(content3, "content");
                C30868C9o.LJI(content3);
            } else if (abstractC07660Ru instanceof C1LB) {
                StringBuilder LIZ5 = X1D.LIZ();
                LIZ5.append("SongAction Failed: ");
                LIZ5.append(((C1LB) abstractC07660Ru).LIZ);
                String content4 = X1D.LIZIZ(LIZ5);
                o.LJIIIZ(content4, "content");
                C30868C9o.LJI(content4);
            }
        }
        Object emit = this.LIZIZ.emit(abstractC07660Ru, interfaceC67352kd);
        if (emit == EnumC58928NAu.COROUTINE_SUSPENDED) {
            return emit;
        }
        return C76800UCe.LIZ;
    }
}
