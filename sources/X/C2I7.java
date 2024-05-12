package X;

import android.view.KeyEvent;
import kotlin.jvm.internal.IDqS28S0300000;
import kotlin.jvm.internal.o;

/* renamed from: X.2I7, reason: invalid class name */
/* loaded from: classes.dex */
public final /* synthetic */ class C2I7 extends TBS implements InterfaceC88472Yns<C24870yJ, Boolean> {
    public C2I7(C18510o3 c18510o3) {
        super(1, c18510o3, C18510o3.class, "process", "process-ZmokQxo(Landroid/view/KeyEvent;)Z", 0);
    }

    @Override // X.InterfaceC88472Yns
    public final Boolean invoke(C24870yJ c24870yJ) {
        EnumC18670oJ LIZIZ;
        KeyEvent p0 = c24870yJ.LIZ;
        o.LJIIIZ(p0, "p0");
        C18510o3 c18510o3 = (C18510o3) this.receiver;
        c18510o3.getClass();
        boolean z = false;
        if (p0.getAction() == 0 && p0.getUnicodeChar() != 0 && 1 != 0) {
            StringBuilder appendCodePointX = new StringBuilder();
            appendCodePointX.appendCodePoint(p0.getUnicodeChar());
            o.LJIIIIZZ(appendCodePointX, "appendCodePointX");
            String sb = appendCodePointX.toString();
            o.LJIIIIZZ(sb, "StringBuilder().appendCo…              .toString()");
            C33711Tz c33711Tz = new C33711Tz(sb, 1);
            if (c18510o3.LIZLLL) {
                c18510o3.LIZ(C47261Igj.LJJIJ(c33711Tz));
                c18510o3.LJFF.LIZ = null;
                z = true;
            }
        } else if (C36071bH.LJIIIZ(p0) == 2 && (LIZIZ = c18510o3.LJIIIIZZ.LIZIZ(p0)) != null && (!LIZIZ.getEditsText() || c18510o3.LIZLLL)) {
            C34K c34k = new C34K();
            c34k.element = true;
            IDqS28S0300000 iDqS28S0300000 = new IDqS28S0300000(LIZIZ, c18510o3, c34k, 21);
            C1YW c1yw = new C1YW(c18510o3.LIZJ, c18510o3.LJI, c18510o3.LIZ.LIZJ(), c18510o3.LJFF);
            iDqS28S0300000.invoke(c1yw);
            if (!C08350Ul.LIZ(c1yw.LJFF, c18510o3.LIZJ.LIZIZ) || !o.LJ(c1yw.LJI, c18510o3.LIZJ.LIZ)) {
                c18510o3.LJIIIZ.invoke(C15010iP.LIZ(c1yw.LJII, c1yw.LJI, c1yw.LJFF, 4));
            }
            C18900og c18900og = c18510o3.LJII;
            if (c18900og != null) {
                c18900og.LJFF = true;
            }
            z = c34k.element;
        }
        return Boolean.valueOf(z);
    }
}
