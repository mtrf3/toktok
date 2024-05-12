package X;

import Y.ARunnableS33S0200000_14;
import Y.ARunnableS50S0100000_14;
import android.graphics.Bitmap;
import android.text.InputFilter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.effectmanager.common.model.UrlModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS164S0100000_14;
import kotlin.jvm.internal.o;
import o53.IDdS479S0100000_14;

/* renamed from: X.W0b, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81581W0b implements InterfaceC81592W0m, InterfaceC135635Tz {
    public final C81582W0c LJLIL;
    public final C82622Wbi LJLILLLLZI;
    public FrameLayout LJLJI;
    public View LJLJJI;
    public TuxTextView LJLJJL;
    public W5G LJLJJLL;
    public ConstraintLayout LJLJL;
    public boolean LJLJLJ;
    public InterfaceC88471Ynr<? super Integer, ? super ViewGroup, ? extends View> LJLJLLL;
    public final int LJLL;
    public long LJLLI;
    public final C62822Ol8 LJLLILLLL;
    public final ARunnableS50S0100000_14 LJLLJ;

    public final View LIZIZ() {
        return (View) this.LJLLILLLL.getValue();
    }

    public final void LIZJ() {
        TuxTextView tuxTextView;
        W5G w5g = this.LJLJJLL;
        if (w5g != null) {
            w5g.setVisibility(4);
        }
        String str = this.LJLIL.LJLIL;
        if (str != null && str.length() > 0) {
            TuxTextView tuxTextView2 = this.LJLJJL;
            if (tuxTextView2 != null) {
                tuxTextView2.setVisibility(0);
            }
            ConstraintLayout constraintLayout = this.LJLJL;
            if (constraintLayout != null && (tuxTextView = this.LJLJJL) != null) {
                LIZIZ().setVisibility(0);
                LIZIZ().setAlpha(0.3f);
                AnonymousClass064 anonymousClass064 = new AnonymousClass064();
                anonymousClass064.LJII(constraintLayout);
                anonymousClass064.LJIJJLI(tuxTextView.getId(), 3, 0);
                anonymousClass064.LJIIIIZZ(tuxTextView.getId(), 3, constraintLayout.getId(), 3);
                anonymousClass064.LJIIIIZZ(tuxTextView.getId(), 4, constraintLayout.getId(), 4);
                anonymousClass064.LIZIZ(constraintLayout);
                tuxTextView.post(new ARunnableS33S0200000_14(this, tuxTextView, 88));
                this.LJLJLJ = true;
                return;
            }
            return;
        }
        this.LJLJLJ = false;
    }

    @Override // X.InterfaceC135635Tz
    public final C82622Wbi getDiContainer() {
        return this.LJLILLLLZI;
    }

    @Override // X.InterfaceC81592W0m
    public final boolean isShowing() {
        return this.LJLJLJ;
    }

    @Override // X.InterfaceC81592W0m
    public final void LIZ(FrameLayout frameLayout) {
        View LLLLIILL;
        W5G w5g;
        ConstraintLayout constraintLayout;
        boolean z;
        if (frameLayout == null) {
            return;
        }
        this.LJLJI = frameLayout;
        InterfaceC88471Ynr<? super Integer, ? super ViewGroup, ? extends View> interfaceC88471Ynr = this.LJLJLLL;
        if (interfaceC88471Ynr == null || (LLLLIILL = interfaceC88471Ynr.invoke(Integer.valueOf(R.layout.bnn), frameLayout)) == null) {
            LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(frameLayout.getContext()), R.layout.bnn, frameLayout, false);
        }
        this.LJLJJI = LLLLIILL;
        FrameLayout frameLayout2 = this.LJLJI;
        if (frameLayout2 != null) {
            frameLayout2.addView(LLLLIILL);
        }
        View view = this.LJLJJI;
        TuxTextView tuxTextView = null;
        if (view != null) {
            w5g = (W5G) view.findViewById(R.id.khr);
        } else {
            w5g = null;
        }
        this.LJLJJLL = w5g;
        View view2 = this.LJLJJI;
        if (view2 != null) {
            constraintLayout = (ConstraintLayout) view2.findViewById(R.id.btg);
        } else {
            constraintLayout = null;
        }
        this.LJLJL = constraintLayout;
        View view3 = this.LJLJJI;
        if (view3 != null) {
            tuxTextView = (TuxTextView) view3.findViewById(R.id.kir);
        }
        this.LJLJJL = tuxTextView;
        UrlModel urlModel = this.LJLIL.LJLILLLLZI;
        if (urlModel != null) {
            z = !C77413UZt.LJIILL(urlModel.getUrlList());
        } else {
            z = false;
        }
        TuxTextView tuxTextView2 = this.LJLJJL;
        if (tuxTextView2 != null) {
            tuxTextView2.setVisibility(4);
            String str = this.LJLIL.LJLIL;
            if (str != null && str.length() > 0) {
                tuxTextView2.setText(this.LJLIL.LJLIL);
                tuxTextView2.setFilters(new InputFilter[]{new InputFilter.LengthFilter(50)});
                tuxTextView2.setTuxFont(12);
            } else {
                tuxTextView2.setText("");
            }
        }
        if (z) {
            C78764Uvg.LJII(this.LJLJJLL, C78963Uyt.LJIL(this.LJLIL.LJLILLLLZI), Bitmap.Config.RGB_565, false, new IDdS479S0100000_14(this, 3));
        } else {
            LIZJ();
        }
    }

    @Override // X.InterfaceC81592W0m
    public final void LJJLIIIJL(boolean z) {
        FrameLayout frameLayout;
        LIZIZ().setVisibility(4);
        FrameLayout frameLayout2 = this.LJLJI;
        if (frameLayout2 != null) {
            frameLayout2.removeCallbacks(this.LJLLJ);
        }
        View view = this.LJLJJI;
        if (view != null && (frameLayout = this.LJLJI) != null) {
            C16880lQ.LJLLLL(view, frameLayout);
        }
        this.LJLJLJ = false;
    }

    public C81581W0b(C81582W0c c81582W0c, C82622Wbi diContainer) {
        o.LJIIIZ(diContainer, "diContainer");
        this.LJLIL = c81582W0c;
        this.LJLILLLLZI = diContainer;
        this.LJLL = C7MY.LIZIZ(180);
        this.LJLLI = 3000L;
        this.LJLLILLLL = C221108m2.LIZIZ(new AqS164S0100000_14(this, 443));
        this.LJLLJ = new ARunnableS50S0100000_14(this, 229);
    }
}
