package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Nzy, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61194Nzy implements InterfaceC61190Nzu {
    public final /* synthetic */ O01 LIZ;

    public C61194Nzy(O00 o00) {
        this.LIZ = o00;
    }

    @Override // X.InterfaceC61190Nzu
    public final void LIZ(C61187Nzr c61187Nzr) {
        O01 o01 = this.LIZ;
        C61195Nzz c61195Nzz = new C61195Nzz();
        c61195Nzz.LIZ = Boolean.valueOf(c61187Nzr.LJ);
        Long l = c61187Nzr.LIZ;
        if (l != null) {
            c61195Nzz.LIZIZ = Long.valueOf(l.longValue());
        }
        String str = c61187Nzr.LIZIZ;
        if (str != null) {
            c61195Nzz.LIZJ = str;
        }
        c61195Nzz.LIZLLL = c61187Nzr.LIZJ;
        EnumC61188Nzs enumC61188Nzs = c61187Nzr.LIZLLL;
        o.LJIIJ(enumC61188Nzs, "<set-?>");
        c61195Nzz.LJ = enumC61188Nzs;
        o01.LIZ(c61195Nzz, "");
    }
}
