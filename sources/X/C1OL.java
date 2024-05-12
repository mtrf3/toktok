package X;

import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.1OL, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1OL implements InterfaceC23370vt {
    public C0XA LJLIL = new C0XA() { // from class: X.1OM
        public static final long LJLILLLLZI = C10430b1.LIZJ;
        public static final EnumC23500w6 LJLJI = EnumC23500w6.Ltr;
        public static final C35431aF LJLJJI = new C35431aF(1.0f, 1.0f);

        @Override // X.C0XA
        public final long LIZIZ() {
            return LJLILLLLZI;
        }

        @Override // X.C0XA
        public final InterfaceC23370vt getDensity() {
            return LJLJJI;
        }

        @Override // X.C0XA
        public final EnumC23500w6 getLayoutDirection() {
            return LJLJI;
        }
    };
    public C0XB LJLILLLLZI;

    @Override // X.InterfaceC23370vt
    public final /* synthetic */ long LJIJ(long j) {
        return a1.LIZIZ(j, this);
    }

    @Override // X.InterfaceC23370vt
    public final /* synthetic */ int LJJIJ(float f) {
        return a1.LIZ(f, this);
    }

    @Override // X.InterfaceC23370vt
    public final /* synthetic */ float LJJIJL(long j) {
        return a1.LIZJ(j, this);
    }

    @Override // X.InterfaceC23370vt
    public final /* synthetic */ long LJJLI(long j) {
        return a1.LIZLLL(j, this);
    }

    public final long LIZIZ() {
        return this.LJLIL.LIZIZ();
    }

    @Override // X.InterfaceC23370vt
    public final float LJJJJI() {
        return this.LJLIL.getDensity().LJJJJI();
    }

    @Override // X.InterfaceC23370vt
    public final float getDensity() {
        return this.LJLIL.getDensity().getDensity();
    }

    public final C0XB LIZLLL(InterfaceC88472Yns<? super InterfaceC43021mU, C76800UCe> block) {
        o.LJIIIZ(block, "block");
        C0XB c0xb = new C0XB(block);
        this.LJLILLLLZI = c0xb;
        return c0xb;
    }

    @Override // X.InterfaceC23370vt
    public final float LJJJJIZL(float f) {
        return getDensity() * f;
    }

    @Override // X.InterfaceC23370vt
    public final float LJJJLL(int i) {
        return i / getDensity();
    }

    @Override // X.InterfaceC23370vt
    public final float LJJJLZIJ(float f) {
        return f / getDensity();
    }
}
