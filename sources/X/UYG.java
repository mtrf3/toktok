package X;

import Y.ARunnableS12S0101000_8;
import Y.IDRunnableS6S0101000;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.sticker.panel.guide.ExtraParams;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import o53.IDdS198S0200000_13;

/* loaded from: classes14.dex */
public final class UYG implements InterfaceC81592W0m {
    public final Effect LJLIL;
    public final ExtraParams LJLILLLLZI;
    public View LJLJI;
    public FrameLayout LJLJJI;
    public ConstraintLayout LJLJJL;
    public TextView LJLJJLL;
    public final UYF LJLJL;
    public boolean LJLJLJ;
    public boolean LJLJLLL;
    public InterfaceC88471Ynr<? super Integer, ? super ViewGroup, ? extends View> LJLL;
    public final IDRunnableS6S0101000 LJLLI = new IDRunnableS6S0101000(9, this, 10);
    public final ARunnableS12S0101000_8 LJLLILLLL = new ARunnableS12S0101000_8(7, this, 2);

    @Override // X.InterfaceC81592W0m
    public final boolean isShowing() {
        return this.LJLJLLL;
    }

    @Override // X.InterfaceC81592W0m
    public final void LIZ(FrameLayout frameLayout) {
        ExtraParams extraParams;
        Effect effect = this.LJLIL;
        if (effect == null || TextUtils.isEmpty(effect.getExtra()) || (extraParams = this.LJLILLLLZI) == null || !extraParams.isGifValid()) {
            return;
        }
        this.LJLJJI = frameLayout;
        InterfaceC88471Ynr<? super Integer, ? super ViewGroup, ? extends View> interfaceC88471Ynr = this.LJLL;
        if (interfaceC88471Ynr != null && interfaceC88471Ynr.invoke(Integer.valueOf(R.layout.bn3), frameLayout) != null) {
            this.LJLJI = this.LJLL.invoke(Integer.valueOf(R.layout.bn3), frameLayout);
        } else {
            this.LJLJI = C16880lQ.LLLLIILL(C16880lQ.LLZIL(frameLayout.getContext()), R.layout.bn3, frameLayout, false);
        }
        this.LJLJJI.addView(this.LJLJI, 0);
        this.LJLJJLL = (TextView) this.LJLJI.findViewById(R.id.kir);
        String hint = this.LJLIL.getHint();
        if (TextUtils.isEmpty(hint)) {
            this.LJLJJLL.setVisibility(8);
        } else {
            this.LJLJJLL.setVisibility(0);
            this.LJLJJLL.setText(hint);
        }
        FrameLayout frameLayout2 = (FrameLayout) this.LJLJI.findViewById(R.id.khl);
        this.LJLJJL = (ConstraintLayout) this.LJLJI.findViewById(R.id.dc7);
        if (2 == this.LJLILLLLZI.gifType) {
            AnonymousClass064 anonymousClass064 = new AnonymousClass064();
            anonymousClass064.LJII(this.LJLJJL);
            anonymousClass064.LJIILL(R.id.khl).LIZLLL.LJJJJJL = (int) C74275TDb.LIZIZ(frameLayout.getContext(), 192.0f);
            anonymousClass064.LJIJI(R.id.khl, "3:4");
            anonymousClass064.LIZIZ(this.LJLJJL);
        }
        int LIZIZ = (int) C74275TDb.LIZIZ(frameLayout.getContext(), 264.0f);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.LJLJJL.getLayoutParams();
        layoutParams.height = (C81184Vtc.LIZIZ(frameLayout.getContext()) - LIZIZ) - ((int) C74275TDb.LIZIZ(frameLayout.getContext(), 112.0f));
        this.LJLJJL.setLayoutParams(layoutParams);
        ViewGroup.LayoutParams layoutParams2 = this.LJLJI.getLayoutParams();
        layoutParams2.height = C81184Vtc.LIZIZ(frameLayout.getContext()) - LIZIZ;
        this.LJLJI.setLayoutParams(layoutParams2);
        this.LJLJJL.post(this.LJLLI);
        this.LJLJLLL = true;
        Effect effect2 = this.LJLIL;
        if (effect2 == null) {
            return;
        }
        if (effect2.getHintIcon() == null || this.LJLIL.getHintIcon().getUrlList() == null || this.LJLIL.getHintIcon().getUrlList().isEmpty()) {
            this.LJLJJL.postDelayed(this.LJLLILLLL, 5000L);
            return;
        }
        VA9 va9 = (VA9) this.LJLJI.findViewById(R.id.kis);
        UrlModel LJIL = C78963Uyt.LJIL(this.LJLIL.getHintIcon());
        IDdS198S0200000_13 iDdS198S0200000_13 = new IDdS198S0200000_13(frameLayout2, this, 1);
        if (va9 == null || LJIL.getUrlList() == null || LJIL.getUrlList().size() == 0) {
            return;
        }
        if (va9.getContext() != null) {
            C16880lQ.LLLLL(va9.getContext());
        }
        W5O[] LJIIJJI = C78764Uvg.LJIIJJI(LJIL, null, W92.MEDIUM, null, Bitmap.Config.ARGB_8888);
        if (LJIIJJI == null || LJIIJJI.length == 0) {
            return;
        }
        C81705W4v LIZJ = W5I.LIZJ();
        LIZJ.LJIIL = va9.getController();
        LIZJ.LJFF(true, LJIIJJI);
        LIZJ.LJIIJ = true;
        LIZJ.LJII = iDdS198S0200000_13;
        va9.setController(LIZJ.LIZ());
    }

    @Override // X.InterfaceC81592W0m
    public final void LJJLIIIJL(boolean z) {
        Effect effect = this.LJLIL;
        if (effect == null || TextUtils.isEmpty(effect.getExtra())) {
            return;
        }
        this.LJLJJLL.clearAnimation();
        this.LJLJJL.removeCallbacks(this.LJLLILLLL);
        this.LJLJJL.removeCallbacks(this.LJLLI);
        C16880lQ.LJLLLL(this.LJLJI, this.LJLJJI);
        this.LJLJLLL = false;
    }

    public UYG(Effect effect, ExtraParams extraParams, UYF uyf) {
        this.LJLIL = effect;
        this.LJLILLLLZI = extraParams;
        this.LJLJL = uyf;
    }
}
