package X;

import Y.ARunnableS50S0100000_14;
import Y.IDTListenerS122S0100000_14;
import android.content.Context;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Wce, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82680Wce implements InterfaceC82683Wch {
    public final View LJLIL;
    public final ViewGroup LJLILLLLZI;
    public boolean LJLJI;
    public boolean LJLJJI;
    public final C82682Wcg LJLJJL;
    public final C82679Wcd LJLJJLL;

    @Override // X.InterfaceC82683Wch
    public final void LIZLLL() {
        this.LJLJJLL.LJIIIIZZ();
        this.LJLILLLLZI.setX(this.LJLJJLL.LJIIIZ.LIZ);
        this.LJLILLLLZI.setY(this.LJLJJLL.LJIIIZ.LIZIZ);
    }

    public final void LJFF() {
        this.LJLIL.setVisibility(8);
        ViewGroup viewGroup = this.LJLJJL.LIZJ;
        if (viewGroup != null) {
            C16880lQ.LJLLL(this.LJLIL, viewGroup);
        }
        this.LJLJJI = true;
        InterfaceC82688Wcm interfaceC82688Wcm = this.LJLJJL.LJJIFFI;
        if (interfaceC82688Wcm != null) {
            interfaceC82688Wcm.onDismiss();
        }
    }

    public final void LJI() {
        C90W c90w = this.LJLJJL.LJIILL;
        if (c90w != null) {
            ((C9TV) c90w).LIZ();
        }
        ViewGroup viewGroup = this.LJLJJL.LIZJ;
        if (viewGroup != null) {
            viewGroup.addView(this.LJLIL);
        }
        this.LJLIL.setVisibility(0);
        this.LJLJJI = false;
        this.LJLILLLLZI.setX(this.LJLJJLL.LJIIIZ.LIZ);
        this.LJLILLLLZI.setY(this.LJLJJLL.LJIIIZ.LIZIZ);
        C82679Wcd c82679Wcd = this.LJLJJLL;
        c82679Wcd.LJIIIZ(c82679Wcd.LJIIIZ, true);
        InterfaceC82689Wcn interfaceC82689Wcn = this.LJLJJL.LJJII;
        if (interfaceC82689Wcn != null) {
            interfaceC82689Wcn.onShow();
        }
        if (this.LJLJJL.LJII != -1001) {
            new Handler().postDelayed(new ARunnableS50S0100000_14(this, 164), this.LJLJJL.LJII);
        }
    }

    @Override // X.InterfaceC82683Wch
    public final void dismiss() {
        if (!this.LJLJJI) {
            if (this.LJLJJL.LJIIJJI) {
                if (!this.LJLJI) {
                    C82679Wcd c82679Wcd = this.LJLJJLL;
                    c82679Wcd.LJIIIZ(c82679Wcd.LJIIIZ, false);
                    this.LJLJI = true;
                    new Handler().postDelayed(new ARunnableS50S0100000_14(this, 163), this.LJLJJL.LJIIJ);
                    return;
                }
                return;
            }
            LJFF();
        }
    }

    @Override // X.InterfaceC82683Wch
    public final boolean isShowing() {
        return !this.LJLJJI;
    }

    @Override // X.InterfaceC82683Wch
    public final void show() {
        C82682Wcg c82682Wcg = this.LJLJJL;
        if ((c82682Wcg.LIZIZ == null && (c82682Wcg.LJIILLIIL < 0 || c82682Wcg.LJIIZILJ < 0)) || c82682Wcg.LIZJ == null || !this.LJLJJI) {
            return;
        }
        if (!this.LJLJJLL.LJIIIIZZ()) {
            int i = WHO.LIZ[this.LJLJJL.LIZLLL.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4) {
                            this.LJLJJL.LIZ(WHL.BOTTOM);
                        }
                    } else {
                        this.LJLJJL.LIZ(WHL.TOP);
                    }
                } else {
                    this.LJLJJL.LIZ(WHL.START);
                }
            } else {
                this.LJLJJL.LIZ(WHL.END);
            }
            this.LJLJJLL.LJFF();
            this.LJLJJLL.LJI();
            if (this.LJLJJLL.LJIIIIZZ() || this.LJLJJL.LJIIIZ) {
                LJI();
                return;
            }
            return;
        }
        LJI();
    }

    @Override // X.InterfaceC82683Wch
    public final void LIZ(boolean z) {
        this.LJLJJL.LJIJJLI = z;
        if (z) {
            this.LJLIL.setOnTouchListener(new IDTListenerS122S0100000_14(this, 6));
        } else {
            this.LJLIL.setOnTouchListener(null);
        }
    }

    @Override // X.InterfaceC82683Wch
    public final void LIZIZ(InterfaceC82688Wcm interfaceC82688Wcm) {
        this.LJLJJL.LJJIFFI = interfaceC82688Wcm;
    }

    @Override // X.InterfaceC82683Wch
    public final void LJ(InterfaceC82689Wcn interfaceC82689Wcn) {
        this.LJLJJL.LJJII = interfaceC82689Wcn;
    }

    public C82680Wce(Context context, C82682Wcg toolTipBundle) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(toolTipBundle, "toolTipBundle");
        View LLLZIIL = C16880lQ.LLLZIIL(R.layout.bs, C16880lQ.LLZIL(context), null);
        o.LJIIIIZZ(LLLZIIL, "from(context).inflate(R.…base_tooltip_popup, null)");
        this.LJLIL = LLLZIIL;
        View findViewById = LLLZIIL.findViewById(R.id.bul);
        o.LJIIIIZZ(findViewById, "mRoot.findViewById(R.id.content_view)");
        ViewGroup viewGroup = (ViewGroup) findViewById;
        this.LJLILLLLZI = viewGroup;
        this.LJLJJI = true;
        viewGroup.setClipChildren(true);
        C82679Wcd c82679Wcd = new C82679Wcd(context, toolTipBundle, this, viewGroup, false);
        this.LJLJJLL = c82679Wcd;
        this.LJLJJL = c82679Wcd.LIZIZ;
        c82679Wcd.LJ();
        c82679Wcd.LJFF();
        c82679Wcd.LJI();
    }

    @Override // X.InterfaceC82683Wch
    public final void LIZJ(View.OnClickListener onClickListener, boolean z) {
        this.LJLJJL.LJJ = onClickListener;
        C16880lQ.LJIIL(this.LJLILLLLZI, onClickListener);
        this.LJLILLLLZI.setClickable(z);
    }
}
