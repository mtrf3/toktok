package X;

import Y.ACListenerS34S0100000_14;
import Y.ACListenerS48S0200000_14;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.W1a, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81606W1a implements InterfaceC81592W0m, C5HC, InterfaceC135635Tz {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLLI;
    public final Effect LJLIL;
    public final C82622Wbi LJLILLLLZI;
    public final int LJLJI;
    public final InterfaceC65784Pro<C76800UCe> LJLJJI;
    public final InterfaceC88472Yns<FrameLayout, C76800UCe> LJLJJL;
    public final C82632Wbs LJLJJLL;
    public final C82632Wbs LJLJL;
    public boolean LJLJLJ;
    public FrameLayout LJLJLLL;
    public View LJLL;

    static {
        TBT tbt = new TBT(C81606W1a.class, "stickerApi", "getStickerApi()Lcom/ss/android/ugc/gamora/recorder/sticker/sticker_core/StickerApiComponent;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LJLLI = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(C81606W1a.class, "activityRegistry", "getActivityRegistry()Lcom/ss/android/ugc/tools/view/activity/AVListenableActivityRegistry;", 0, c65351Pkp)};
    }

    public final I0N LIZIZ() {
        return (I0N) this.LJLJJLL.LIZ(this, LJLLI[0]);
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
        this.LJLJJI.invoke();
        if (this.LJLIL == null || frameLayout == null) {
            return;
        }
        View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(frameLayout.getContext()), R.layout.bj2, frameLayout, false);
        C16880lQ.LJIIJ(ViewOnClickListenerC81608W1c.LJLIL, LLLLIILL);
        View findViewById = LLLLIILL.findViewById(R.id.cca);
        o.LJIIIIZZ(findViewById, "findViewById(R.id.distur…ker_warning_continue_btn)");
        SY4 sy4 = (SY4) findViewById;
        View findViewById2 = LLLLIILL.findViewById(R.id.cc_);
        o.LJIIIIZZ(findViewById2, "findViewById(R.id.distur…icker_warning_cancel_btn)");
        C26338AVi.LJI(sy4, null, Integer.valueOf((int) ((frameLayout.getHeight() * 0.7d) + C7MY.LIZIZ(42))), null, null, false, 28);
        C16880lQ.LJJIZ(sy4, new ACListenerS48S0200000_14(this, frameLayout, 0));
        C16880lQ.LJJIZ((SY4) findViewById2, new ACListenerS34S0100000_14(this, 0));
        int height = frameLayout.getHeight();
        View findViewById3 = LLLLIILL.findViewById(R.id.hol);
        o.LJIIIIZZ(findViewById3, "guideLayout.findViewById…ive_sticker_warning_icon)");
        ImageView imageView = (ImageView) findViewById3;
        View findViewById4 = LLLLIILL.findViewById(R.id.ccb);
        o.LJIIIIZZ(findViewById4, "guideLayout.findViewById…ing_sticker_warning_icon)");
        ImageView imageView2 = (ImageView) findViewById4;
        View findViewById5 = LLLLIILL.findViewById(R.id.ccc);
        o.LJIIIIZZ(findViewById5, "guideLayout.findViewById…r_warning_icon_container)");
        View findViewById6 = LLLLIILL.findViewById(R.id.cce);
        o.LJIIIIZZ(findViewById6, "guideLayout.findViewById…ng_sticker_warning_title)");
        TextView textView = (TextView) findViewById6;
        View findViewById7 = LLLLIILL.findViewById(R.id.ccd);
        o.LJIIIIZZ(findViewById7, "guideLayout.findViewById…ing_sticker_warning_text)");
        TextView textView2 = (TextView) findViewById7;
        C26338AVi.LJI(findViewById5, null, Integer.valueOf((int) ((height * 0.4d) - C7MY.LIZIZ(114))), null, null, false, 28);
        int i = this.LJLJI;
        if (i != 0) {
            if (i == 1) {
                findViewById5.setBackgroundResource(R.drawable.qh);
                imageView.setVisibility(0);
                imageView2.setVisibility(8);
                textView.setText(R.string.jlr);
                textView2.setText(R.string.jlt);
            }
        } else {
            findViewById5.setBackground(null);
            imageView.setVisibility(8);
            imageView2.setVisibility(0);
            textView.setText(R.string.elc);
            textView2.setText(R.string.elb);
        }
        this.LJLL = LLLLIILL;
        frameLayout.addView(LLLLIILL);
        this.LJLJLLL = frameLayout;
        ((InterfaceC45540Hu4) this.LJLJL.LIZ(this, LJLLI[1])).registerActivityOnKeyDownListenerHead(this);
        LIZIZ().fV(false);
        this.LJLJLJ = true;
    }

    @Override // X.InterfaceC81592W0m
    public final void LJJLIIIJL(boolean z) {
        if (this.LJLIL == null) {
            return;
        }
        FrameLayout frameLayout = this.LJLJLLL;
        if (frameLayout != null) {
            C16880lQ.LJLLLL(this.LJLL, frameLayout);
        }
        ((InterfaceC45540Hu4) this.LJLJL.LIZ(this, LJLLI[1])).unRegisterActivityOnKeyDownListener(this);
        LIZIZ().fV(true);
        this.LJLJLJ = false;
    }

    @Override // X.C5HC
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4 || !this.LJLJLJ) {
            return false;
        }
        LJJLIIIJL(false);
        C82398WVm.LIZ(LIZIZ());
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C81606W1a(Effect effect, C82622Wbi diContainer, int i, InterfaceC65784Pro<C76800UCe> onBeforeShow, InterfaceC88472Yns<? super FrameLayout, C76800UCe> onClickContinue) {
        o.LJIIIZ(diContainer, "diContainer");
        o.LJIIIZ(onBeforeShow, "onBeforeShow");
        o.LJIIIZ(onClickContinue, "onClickContinue");
        this.LJLIL = effect;
        this.LJLILLLLZI = diContainer;
        this.LJLJI = i;
        this.LJLJJI = onBeforeShow;
        this.LJLJJL = onClickContinue;
        this.LJLJJLL = UCI.LJI(diContainer, I0N.class, null);
        this.LJLJL = UCI.LJI(diContainer, InterfaceC45540Hu4.class, null);
    }
}
