package X;

import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;

/* renamed from: X.IgY, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47250IgY implements InterfaceC47219Ig3 {
    public IWH LIZ;
    public InterfaceC47258Igg LIZLLL;
    public C46539IOh LJFF;
    public C30921Jg LIZIZ = new C30921Jg();
    public C47256Ige LIZJ = null;
    public C111724a0 LJ = new C111724a0();
    public String LJI = null;

    @Override // X.InterfaceC47219Ig3
    public final void LJJIIJZLJL() {
    }

    @Override // X.InterfaceC47219Ig3
    public final void LIZLLL() {
        InterfaceC47258Igg interfaceC47258Igg = this.LIZLLL;
        if (interfaceC47258Igg != null) {
            interfaceC47258Igg.LLLI();
        }
    }

    @Override // X.InterfaceC47219Ig3
    public final void resume() {
        C47256Ige c47256Ige = this.LIZJ;
        if (c47256Ige != null) {
            if (c47256Ige.LIZIZ.LLLIIII()) {
                new RunnableC47252Iga(c47256Ige).run();
                return;
            } else {
                c47256Ige.LIZLLL = new RunnableC47252Iga(c47256Ige);
                return;
            }
        }
        this.LIZ.resume();
    }

    public C47250IgY(IWH iwh) {
        this.LIZ = iwh;
    }

    @Override // X.InterfaceC47219Ig3
    public final void LIZ(InterfaceC46811IYt interfaceC46811IYt) {
        InterfaceC47258Igg interfaceC47258Igg = this.LIZLLL;
        if (interfaceC47258Igg == null) {
            this.LIZ.LJIIL(C46810IYs.LIZ(interfaceC46811IYt, null));
            C16880lQ.LLLZ("play when videoView attached. aid:%s", new Object[]{interfaceC46811IYt.getKey()});
        } else {
            C47256Ige c47256Ige = new C47256Ige(this.LIZ, interfaceC47258Igg);
            this.LIZJ = c47256Ige;
            c47256Ige.LIZ(interfaceC46811IYt);
            C16880lQ.LLLZ("play when videoView attached. aid:%s", new Object[]{interfaceC46811IYt.getKey()});
        }
    }

    @Override // X.InterfaceC47219Ig3
    public final void LIZIZ(IZ2 iz2) {
        InterfaceC47258Igg LJ;
        this.LJ.LIZ(iz2.LJJLIIIJLJLI());
        FrameLayout LJJLIIIJLJLI = iz2.LJJLIIIJLJLI();
        View findViewWithTag = LJJLIIIJLJLI.findViewWithTag("VIDEO_VIEW_TAG");
        iz2.Q2();
        Boolean bool = Boolean.TRUE;
        if (findViewWithTag == null) {
            LJ = this.LIZIZ.LIZJ(bool);
            LJ.LLLII(LJJLIIIJLJLI);
            C16880lQ.LLLZ("attach when videoView null. container:%s", new Object[]{LJJLIIIJLJLI});
        } else {
            LJ = this.LIZIZ.LJ(findViewWithTag);
        }
        this.LIZLLL = LJ;
    }

    @Override // X.InterfaceC47219Ig3
    public final void LIZJ(C47249IgX c47249IgX) {
        InterfaceC47258Igg LJ;
        InterfaceC46811IYt interfaceC46811IYt = c47249IgX.LIZ;
        boolean z = c47249IgX.LIZIZ;
        int i = c47249IgX.LIZJ;
        FrameLayout LIZIZ = this.LJ.LIZIZ(z);
        if (LIZIZ == null) {
            C16880lQ.LLLZ("preRender nearbyContainer null, return. aid:%s, type:%s, isBelowCurrent:%s", new Object[]{interfaceC46811IYt.getKey(), Integer.valueOf(i), Boolean.valueOf(z)});
            return;
        }
        if (TextUtils.equals(interfaceC46811IYt.getKey(), this.LJI)) {
            C16880lQ.LLLZ("triggerPreRender. mPreparingAid exists, return. mPreparingAid:%s, type:%s, isBelowCurrent:%s", new Object[]{this.LJI, Integer.valueOf(i), Boolean.valueOf(z)});
            return;
        }
        this.LJI = interfaceC46811IYt.getKey();
        View findViewWithTag = LIZIZ.findViewWithTag("VIDEO_VIEW_TAG");
        if (findViewWithTag == null) {
            C16880lQ.LLLZ("do preRender when videoView null. aid:%s, type:%s, isBelowCurrent:%s", new Object[]{interfaceC46811IYt.getKey(), Integer.valueOf(i), Boolean.valueOf(z)});
            LJ = this.LIZIZ.LIZIZ();
            LJ.LLLII(LIZIZ);
        } else {
            C16880lQ.LLLZ("do preRender when videoView attached. aid:%s, type:%s, isBelowCurrent:%s", new Object[]{interfaceC46811IYt.getKey(), Integer.valueOf(i), Boolean.valueOf(z)});
            LJ = this.LIZIZ.LJ(findViewWithTag);
            if (LJ == null) {
                C16880lQ.LLLZ("preRender surfaceHolder null, return. aid:%s, type:%s, isBelowCurrent:%s", new Object[]{interfaceC46811IYt.getKey(), Integer.valueOf(i), Boolean.valueOf(z)});
                return;
            }
        }
        C16880lQ.LLLZ("really do preRender. aid:%s, type:%s, isBelowCurrent:%s", new Object[]{interfaceC46811IYt.getKey(), Integer.valueOf(i), Boolean.valueOf(z)});
        if (interfaceC46811IYt.LJ() != null) {
            interfaceC46811IYt.LJ().LIZ = this.LJFF;
        }
        new C47255Igd(this.LIZ, LJ, interfaceC46811IYt).run();
    }

    @Override // X.InterfaceC47219Ig3
    public final void LJ(C46539IOh c46539IOh) {
        this.LJFF = c46539IOh;
    }
}
