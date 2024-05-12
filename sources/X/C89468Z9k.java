package X;

import java.util.List;
import kotlin.jvm.internal.AqS113S0101000_16;
import kotlin.jvm.internal.AqS166S0100000_16;
import kotlin.jvm.internal.AqS6S1102000_16;
import kotlin.jvm.internal.o;

/* renamed from: X.Z9k, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C89468Z9k implements InterfaceC83659WsR {
    public final InterfaceC83659WsR LIZ;
    public final C83835WvH LIZIZ;

    @Override // X.InterfaceC83659WsR
    public final void LJFF() {
        new AqS166S0100000_16(this, 30).invoke();
    }

    @Override // X.InterfaceC83659WsR
    public final void LJII() {
        new AqS166S0100000_16(this, 29).invoke();
    }

    @Override // X.InterfaceC83659WsR
    public final void LIZLLL(int i) {
        new AqS113S0101000_16(this, i, 3).invoke();
    }

    @Override // X.InterfaceC83659WsR
    public final void LJIIJ(int i) {
        new AqS113S0101000_16(this, i, 2).invoke();
    }

    public C89468Z9k(C73775SxP c73775SxP, C83835WvH sessionEventDispatcher) {
        o.LJIIIZ(sessionEventDispatcher, "sessionEventDispatcher");
        this.LIZIZ = sessionEventDispatcher;
        this.LIZ = sessionEventDispatcher.LIZJ;
        new C73318Sq2();
    }

    @Override // X.InterfaceC83659WsR
    public final void LIZ(int i, int i2) {
        new C89470Z9m(this, i, i2).invoke();
    }

    @Override // X.InterfaceC83659WsR
    public final void LIZIZ(int i, int i2, String str) {
        new AqS6S1102000_16(this, i, i2, str, 1).invoke();
    }

    @Override // X.InterfaceC83659WsR
    public final void LJ(boolean z, float f, List<Integer> list) {
        new C89466Z9i(this, z, f, list).invoke();
    }

    @Override // X.InterfaceC83659WsR
    public final void LJI(int i, int i2, String str) {
        new AqS6S1102000_16(this, i, i2, str, 0).invoke();
    }

    @Override // X.InterfaceC83659WsR
    public final void LJIIIZ(float f, int i, boolean z) {
        new C89465Z9h(this, i, f, z).invoke();
    }

    @Override // X.InterfaceC83659WsR
    public final void LJIIIIZZ(long j, String str, String str2, String str3) {
        new C89469Z9l(this, j, str, str2, str3).invoke();
    }

    @Override // X.InterfaceC83659WsR
    public final void LIZJ(int i, boolean z, boolean z2, float f, List<Integer> list) {
        new C89467Z9j(this, i, z, z2, f, list).invoke();
    }
}
