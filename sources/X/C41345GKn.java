package X;

import kotlin.jvm.internal.o;

/* renamed from: X.GKn, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41345GKn<T, R> implements InterfaceC48038ItG {
    public final /* synthetic */ C68322mC<String> LJLIL;
    public final /* synthetic */ C68322mC<String> LJLILLLLZI;
    public final /* synthetic */ C68322mC<String> LJLJI;

    public C41345GKn(C68322mC<String> c68322mC, C68322mC<String> c68322mC2, C68322mC<String> c68322mC3) {
        this.LJLIL = c68322mC;
        this.LJLILLLLZI = c68322mC2;
        this.LJLJI = c68322mC3;
    }

    @Override // X.InterfaceC48038ItG
    public final Object apply(Object it) {
        o.LJIIIZ(it, "it");
        String str = this.LJLIL.element;
        o.LJI(str);
        String str2 = this.LJLILLLLZI.element;
        o.LJI(str2);
        return AbstractC73638SvC.LJI(new C41812Gb2(str, str2, this.LJLJI.element)).LJIJJ(C73969T1h.LIZIZ());
    }
}
