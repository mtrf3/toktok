package X;

import Y.ARunnableS33S0200000_14;
import Y.ARunnableS50S0100000_14;
import android.view.View;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.sticker.panel.guide.ExtraParams;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.AqS164S0100000_14;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class W0F implements InterfaceC81592W0m, InterfaceC135635Tz {
    public final Effect LJLIL;
    public final ExtraParams LJLILLLLZI;
    public final UYF LJLJI;
    public final C82622Wbi LJLJJI;
    public FrameLayout LJLJJL;
    public View LJLJJLL;
    public TuxTextView LJLJL;
    public C0GU<C0GY> LJLJLJ;
    public C29701Eo LJLJLLL;
    public ConstraintLayout LJLL;
    public boolean LJLLI;
    public final int LJLLILLLL;
    public final C62822Ol8 LJLLJ;
    public final ARunnableS50S0100000_14 LJLLL;
    public final W0D LJLLLL;
    public final W0E LJLLLLLL;

    public final View LIZIZ() {
        return (View) this.LJLLJ.getValue();
    }

    public final void LIZJ() {
        TuxTextView tuxTextView;
        C29701Eo c29701Eo = this.LJLJLLL;
        if (c29701Eo != null) {
            c29701Eo.setVisibility(4);
        }
        if (this.LJLIL.getHint().length() > 0) {
            TuxTextView tuxTextView2 = this.LJLJL;
            if (tuxTextView2 != null) {
                tuxTextView2.setVisibility(0);
            }
            ConstraintLayout constraintLayout = this.LJLL;
            if (constraintLayout != null && (tuxTextView = this.LJLJL) != null) {
                LIZIZ().setVisibility(0);
                LIZIZ().setAlpha(0.3f);
                AnonymousClass064 anonymousClass064 = new AnonymousClass064();
                anonymousClass064.LJII(constraintLayout);
                anonymousClass064.LJIJJLI(tuxTextView.getId(), 3, 0);
                anonymousClass064.LJIIIIZZ(tuxTextView.getId(), 3, constraintLayout.getId(), 3);
                anonymousClass064.LJIIIIZZ(tuxTextView.getId(), 4, constraintLayout.getId(), 4);
                anonymousClass064.LIZIZ(constraintLayout);
                tuxTextView.post(new ARunnableS33S0200000_14(this, tuxTextView, 86));
                this.LJLLI = true;
                return;
            }
            return;
        }
        this.LJLLI = false;
    }

    @Override // X.InterfaceC135635Tz
    public final C82622Wbi getDiContainer() {
        return this.LJLJJI;
    }

    @Override // X.InterfaceC81592W0m
    public final boolean isShowing() {
        return this.LJLLI;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00c5, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L36;
     */
    @Override // X.InterfaceC81592W0m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(android.widget.FrameLayout r7) {
        /*
            r6 = this;
            if (r7 != 0) goto L3
            return
        L3:
            com.ss.android.ugc.aweme.sticker.panel.guide.ExtraParams r0 = r6.LJLILLLLZI
            r2 = 1
            r5 = 0
            if (r0 == 0) goto Ldd
            boolean r0 = r0.isLottieValid()
            if (r2 != r0) goto Ldd
            r6.LJLJJL = r7
            android.content.Context r0 = r7.getContext()
            android.view.LayoutInflater r1 = X.C16880lQ.LLZIL(r0)
            r0 = 2131561580(0x7f0d0c6c, float:1.8748565E38)
            android.view.View r1 = X.C16880lQ.LLLLIILL(r1, r0, r7, r5)
            r6.LJLJJLL = r1
            android.widget.FrameLayout r0 = r6.LJLJJL
            if (r0 == 0) goto L29
            r0.addView(r1)
        L29:
            android.view.View r1 = r6.LJLJJLL
            r4 = 0
            if (r1 == 0) goto Lda
            r0 = 2131376803(0x7f0a3aa3, float:1.8373792E38)
            android.view.View r0 = r1.findViewById(r0)
            X.1Eo r0 = (X.C29701Eo) r0
        L37:
            r6.LJLJLLL = r0
            android.view.View r1 = r6.LJLJJLL
            if (r1 == 0) goto Ld7
            r0 = 2131364896(0x7f0a0c20, float:1.8349642E38)
            android.view.View r0 = r1.findViewById(r0)
            androidx.constraintlayout.widget.ConstraintLayout r0 = (androidx.constraintlayout.widget.ConstraintLayout) r0
        L46:
            r6.LJLL = r0
            X.1Eo r3 = r6.LJLJLLL
            if (r3 == 0) goto L56
            Y.ALAdapterS11S0100000_14 r1 = new Y.ALAdapterS11S0100000_14
            r0 = 36
            r1.<init>(r6, r0)
            r3.addAnimatorListener(r1)
        L56:
            X.1Eo r0 = r6.LJLJLLL
            if (r0 != 0) goto Ld3
        L5a:
            android.view.View r1 = r6.LJLJJLL
            if (r1 == 0) goto L67
            r0 = 2131376839(0x7f0a3ac7, float:1.8373865E38)
            android.view.View r4 = r1.findViewById(r0)
            com.bytedance.tux.input.TuxTextView r4 = (com.bytedance.tux.input.TuxTextView) r4
        L67:
            r6.LJLJL = r4
            if (r4 == 0) goto L97
            r0 = 4
            r4.setVisibility(r0)
            com.ss.android.ugc.effectmanager.effect.model.Effect r0 = r6.LJLIL
            java.lang.String r0 = r0.getHint()
            int r0 = r0.length()
            if (r0 <= 0) goto Lcd
            com.ss.android.ugc.effectmanager.effect.model.Effect r0 = r6.LJLIL
            java.lang.String r0 = r0.getHint()
            r4.setText(r0)
            android.text.InputFilter[] r3 = new android.text.InputFilter[r2]
            android.text.InputFilter$LengthFilter r1 = new android.text.InputFilter$LengthFilter
            r0 = 50
            r1.<init>(r0)
            r3[r5] = r1
            r4.setFilters(r3)
            r0 = 12
            r4.setTuxFont(r0)
        L97:
            com.ss.android.ugc.effectmanager.effect.model.Effect r0 = r6.LJLIL
            com.ss.android.ugc.effectmanager.common.model.UrlModel r0 = r0.getHintFile()
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = X.C78963Uyt.LJIL(r0)
            java.util.List r0 = r0.getUrlList()
            if (r0 == 0) goto Lc7
            java.lang.Object r1 = X.ORZ.LJLLLL(r0)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto Lc7
            android.content.Context r0 = r7.getContext()
            X.0GU r1 = X.C04650Gf.LJIIIZ(r0, r1)
            X.W0D r0 = r6.LJLLLL
            r1.LIZIZ(r0)
            X.W0E r0 = r6.LJLLLLLL
            r1.LIZ(r0)
            r6.LJLJLJ = r1
            X.UCe r0 = X.C76800UCe.LIZ
            if (r0 != 0) goto Lca
        Lc7:
            r6.LIZJ()
        Lca:
            r6.LJLLI = r2
            return
        Lcd:
            java.lang.String r0 = ""
            r4.setText(r0)
            goto L97
        Ld3:
            r0.setRepeatCount(r2)
            goto L5a
        Ld7:
            r0 = r4
            goto L46
        Lda:
            r0 = r4
            goto L37
        Ldd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.W0F.LIZ(android.widget.FrameLayout):void");
    }

    @Override // X.InterfaceC81592W0m
    public final void LJJLIIIJL(boolean z) {
        FrameLayout frameLayout;
        C0GU<C0GY> c0gu = this.LJLJLJ;
        if (c0gu != null) {
            c0gu.LJII(this.LJLLLL);
            c0gu.LJI(this.LJLLLLLL);
        }
        LIZIZ().setVisibility(4);
        C29701Eo c29701Eo = this.LJLJLLL;
        if (c29701Eo != null) {
            c29701Eo.cancelAnimation();
        }
        FrameLayout frameLayout2 = this.LJLJJL;
        if (frameLayout2 != null) {
            frameLayout2.removeCallbacks(this.LJLLL);
        }
        View view = this.LJLJJLL;
        if (view != null && (frameLayout = this.LJLJJL) != null) {
            C16880lQ.LJLLLL(view, frameLayout);
        }
        this.LJLLI = false;
    }

    public W0F(Effect faceStickerBean, ExtraParams extraParams, W0P w0p, C82622Wbi diContainer) {
        o.LJIIIZ(faceStickerBean, "faceStickerBean");
        o.LJIIIZ(diContainer, "diContainer");
        this.LJLIL = faceStickerBean;
        this.LJLILLLLZI = extraParams;
        this.LJLJI = w0p;
        this.LJLJJI = diContainer;
        this.LJLLILLLL = 180;
        this.LJLLJ = C221108m2.LIZIZ(new AqS164S0100000_14(this, 442));
        this.LJLLL = new ARunnableS50S0100000_14(this, 228);
        this.LJLLLL = new W0D(this);
        this.LJLLLLLL = new W0E(this);
    }
}
