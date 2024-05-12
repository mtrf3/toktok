package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Ifo, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47204Ifo extends AbstractC47210Ifu {
    public C46539IOh LJ;
    public IWH LJI;
    public InterfaceC46811IYt LJII;
    public String LJIIIZ;
    public final C47218Ig2 LJFF = new C47218Ig2(this);
    public final C35751E1j LJIIIIZZ = new C35751E1j(8);

    @Override // X.AbstractC47210Ifu
    public final InterfaceC47233IgH LJIIIZ() {
        return this.LJFF.LIZLLL;
    }

    public final List<InterfaceC46811IYt> LJIIL() {
        List<InterfaceC46811IYt> list = (List) this.LJIIIIZZ.get(this.LJIIIZ);
        if (list == null) {
            return new ArrayList();
        }
        return list;
    }

    @Override // X.AbstractC47210Ifu, X.IZ0
    public final void stop() {
        C46539IOh c46539IOh = this.LJ;
        if (c46539IOh == null) {
            return;
        }
        c46539IOh.LIZJ(this.LJFF.LIZIZ);
    }

    @Override // X.AbstractC47210Ifu
    public final boolean LJIIJJI() {
        C1DG.LIZ().getConfig().getSimPlayerConfig().getPreRenderConfig().getClass();
        return true;
    }

    @Override // X.AbstractC47210Ifu, X.IZ0
    public final void release() {
        super.release();
        C46539IOh c46539IOh = this.LJ;
        if (c46539IOh != null) {
            c46539IOh.LIZJ(this.LJFF.LIZIZ);
        }
        this.LJ = null;
    }

    @Override // X.AbstractC47210Ifu, X.IZ0
    public final void LIZ(InterfaceC46811IYt interfaceC46811IYt) {
        this.LJII = interfaceC46811IYt;
        C46539IOh c46539IOh = this.LJ;
        if (c46539IOh != null) {
            c46539IOh.LIZ(this.LJFF.LIZIZ);
        }
    }

    @Override // X.AbstractC47210Ifu
    public final void LIZLLL(C46539IOh c46539IOh) {
        this.LJ = c46539IOh;
    }

    @Override // X.AbstractC47210Ifu, X.IZ0
    public final void LJFF(String str) {
        LJIIL().clear();
    }

    @Override // X.AbstractC47210Ifu
    public final void LJIIIIZZ(IWH iwh) {
        this.LJI = iwh;
    }

    @Override // X.AbstractC47210Ifu, X.IZ0
    public final void LJI(String str, List<InterfaceC46811IYt> list) {
        if (TextUtils.isEmpty(str) || list.size() == 0) {
            return;
        }
        if (this.LJIIIIZZ.get(str) == 0) {
            this.LJIIIIZZ.put(str, new ArrayList());
        }
        this.LJIIIZ = str;
        LJIIL().clear();
        LJIIL().addAll(list);
    }

    public final void LJIILIIL(int i, boolean z) {
        int i2;
        InterfaceC46811IYt interfaceC46811IYt;
        List<InterfaceC46811IYt> LJIIL = LJIIL();
        if (LJIIL.size() == 0) {
            C16880lQ.LLLZ("triggerPreRender. playRequests null, return. type:%s, isBelowCurrent:%s", new Object[]{Integer.valueOf(i), Boolean.TRUE});
            return;
        }
        if (this.LJII == null) {
            C16880lQ.LLLZ("triggerPreRender. currentPlayRequest null, return. type:%s, isBelowCurrent:%s", new Object[]{Integer.valueOf(i), Boolean.TRUE});
            return;
        }
        int i3 = 0;
        while (true) {
            if (i3 >= LJIIL.size()) {
                break;
            }
            if (TextUtils.equals(((InterfaceC46811IYt) ListProtector.get(LJIIL, i3)).getKey(), this.LJII.getKey())) {
                if (i3 >= 0 && (i2 = i3 + 1) >= 0 && i2 < LJIIL.size() && (interfaceC46811IYt = (InterfaceC46811IYt) ListProtector.get(LJIIL, i2)) != null) {
                    if (i == 1) {
                        C1DG.LIZ().getConfig().getSimPlayerConfig().getPreRenderConfig().getClass();
                    }
                    List<InterfaceC46813IYv> LJIIJ = interfaceC46811IYt.LJIIJ();
                    if (LJIIJ == null || LJIIJ.size() == 0) {
                        C16880lQ.LLLZ("triggerPreRender. playItems null, return. type:%s, isBelowCurrent:%s", new Object[]{Integer.valueOf(i), Boolean.TRUE});
                        return;
                    }
                    C46810IYs.LIZJ(interfaceC46811IYt, (InterfaceC46813IYv) ListProtector.get(LJIIJ, 0));
                    C1DG.LIZ().getConfig().getSimPlayerConfig().getPreRenderConfig().getClass();
                    this.LIZIZ.LIZIZ(this, new C47228IgC(new C47249IgX(interfaceC46811IYt, true, i)));
                    C16880lQ.LLLZ("triggerPreRender. trigger successfully. type:%s, isBelowCurrent:%s, aid:%s, current:%s", new Object[]{Integer.valueOf(i), Boolean.TRUE, interfaceC46811IYt.getKey(), this.LJII.getKey()});
                    return;
                }
            } else {
                i3++;
            }
        }
        C16880lQ.LLLZ("triggerPreRender. preRenderTarget null, return. type:%s, isBelowCurrent:%s", new Object[]{Integer.valueOf(i), Boolean.TRUE});
    }
}
