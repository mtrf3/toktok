package X;

import Y.ALAdapterS9S0100000_12;
import Y.ARunnableS50S0100000_14;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.ImageUrlModel;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.views.IDlS65S0100000_14;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.WHk, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82032WHk extends RecyclerView.ViewHolder {
    public final Context LJLIL;
    public final C82091WJr LJLILLLLZI;
    public final boolean LJLJI;
    public final SmartImageView LJLJJI;
    public final View LJLJJL;
    public final TuxTextView LJLJJLL;
    public final C29701Eo LJLJL;
    public final View LJLJLJ;
    public final TuxIconView LJLJLLL;
    public final SmartImageView LJLL;
    public C82033WHl LJLLI;
    public final IDlS65S0100000_14 LJLLILLLL;
    public final int LJLLJ;
    public final int LJLLL;

    public final C82033WHl M() {
        C82033WHl c82033WHl = this.LJLLI;
        if (c82033WHl != null) {
            return c82033WHl;
        }
        o.LJIJI("currentConfig");
        throw null;
    }

    public final void P() {
        SmartImageView smartImageView = this.LJLJJI;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(smartImageView, "scaleX", 1.0f, 0.6f);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(smartImageView, "scaleY", 1.0f, 0.6f);
        ofFloat.setDuration(200L);
        ofFloat.setInterpolator(C55953Lxd.LIZLLL());
        ofFloat2.setDuration(200L);
        ofFloat2.setInterpolator(C55953Lxd.LIZLLL());
        ofFloat.addListener(new ALAdapterS9S0100000_12(smartImageView, 8));
        ofFloat.start();
        ofFloat2.start();
    }

    public final void L(C82033WHl c82033WHl) {
        int i;
        this.LJLLI = c82033WHl;
        C78897Uxp.LJJJJLL(this.LJLJJI);
        int i2 = 8;
        if (c82033WHl.LJIIIZ) {
            this.LJLJLJ.setVisibility(0);
            C16880lQ.LJIIJ(new C82034WHm(this), this.LJLJLJ);
        } else {
            this.LJLJLJ.setVisibility(8);
        }
        C16880lQ.LJJIJLIJ(this.LJLJJI, this.LJLLILLLL);
        C16880lQ.LJJJJI(this.LJLJJLL, this.LJLLILLLL);
        C16880lQ.LJIIJ(this.LJLLILLLL, this.LJLJJL);
        this.LJLILLLLZI.LJLILLLLZI.invoke(new C82028WHg(EnumC79548VJw.BIND_VIEW, M().LIZ, this.LJLJJI));
        this.LJLILLLLZI.LJLJLJ.invoke(new C1537261o(M().LIZ, this.LJLJJLL, this.LJLJJI));
        ImageUrlModel imageUrlModel = c82033WHl.LJI;
        if (imageUrlModel != null) {
            W5F LJII = W5U.LJII(imageUrlModel);
            LJII.LJIIL = 0;
            LJII.LJJIIJ = this.LJLJJI;
            C16880lQ.LLJJJ(LJII);
        } else if (c82033WHl.LIZLLL != -1) {
            try {
                ViewGroup.LayoutParams layoutParams = this.LJLJJI.getLayoutParams();
                int i3 = c82033WHl.LJ;
                if (i3 == 0) {
                    i3 = R.attr.dj;
                }
                C2068389v c2068389v = new C2068389v();
                c2068389v.LIZJ = layoutParams.height - O6R.LJJIIZ(C32151Nz.LJIIZILJ(4));
                int i4 = layoutParams.width;
                C6MP c6mp = c82033WHl.LIZ;
                C6MP c6mp2 = C6MP.REVERSE;
                if (c6mp == c6mp2) {
                    i = 2;
                } else {
                    i = 4;
                }
                c2068389v.LIZIZ = i4 - O6R.LJJIIZ(C32151Nz.LJIIZILJ(i));
                c2068389v.LIZ = c82033WHl.LIZLLL;
                c2068389v.LJ = Integer.valueOf(i3);
                this.LJLJJI.setImageDrawable(c2068389v.LIZ(this.LJLIL));
                if (c82033WHl.LIZ == c6mp2) {
                    C26338AVi.LJIIIZ(this.LJLJJI, Integer.valueOf(this.LJLLL), Integer.valueOf(this.LJLLJ), Integer.valueOf(this.LJLLL), Integer.valueOf(this.LJLLJ), 16);
                } else {
                    C26338AVi.LJIIIZ(this.LJLJJI, Integer.valueOf(this.LJLLJ), Integer.valueOf(this.LJLLJ), Integer.valueOf(this.LJLLJ), Integer.valueOf(this.LJLLJ), 16);
                }
                this.LJLL.setVisibility(0);
            } catch (Throwable unused) {
            }
        } else {
            this.LJLJJI.setImageResource(c82033WHl.LIZJ);
        }
        int i5 = c82033WHl.LJFF;
        if (i5 != -1) {
            this.LJLJJLL.setText(C86V.LJFF(i5));
        }
        if (this.LJLJI) {
            if (c82033WHl.LJII.LJLIL == VLL.FIXED && c82033WHl.LIZ != C6MP.DRAFTS) {
                this.LJLJJLL.setVisibility(8);
            } else if (c82033WHl.LJIIIIZZ) {
                this.LJLJJLL.setVisibility(0);
            } else {
                this.LJLJJLL.setVisibility(8);
            }
        } else {
            this.LJLJJLL.setVisibility(0);
        }
        if (c82033WHl.LIZIZ == EnumC147935rJ.DISABLE_CLICK) {
            this.LJLJJI.setImageAlpha(127);
            this.LJLJJLL.setAlpha(0.5f);
        } else {
            this.LJLJJI.setImageAlpha(255);
            this.LJLJJLL.setAlpha(1.0f);
        }
        Integer num = c82033WHl.LJIIJJI;
        if (num != null) {
            this.LJLJLLL.setIconRes(num.intValue());
        }
        TuxIconView tuxIconView = this.LJLJLLL;
        if (c82033WHl.LJIIJ) {
            i2 = 0;
        }
        tuxIconView.setVisibility(i2);
    }

    public final void N(String lottiePath) {
        o.LJIIIZ(lottiePath, "lottiePath");
        this.LJLJL.setAnimation(lottiePath);
        this.LJLJL.setRepeatCount(1);
        this.LJLJL.setRepeatMode(1);
        this.LJLJL.post(new ARunnableS50S0100000_14(this, 157));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C82032WHk(Context context, View view, C82091WJr uiAction, boolean z) {
        super(view);
        Integer LIZJ;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(uiAction, "uiAction");
        this.LJLIL = context;
        this.LJLILLLLZI = uiAction;
        this.LJLJI = z;
        View findViewById = view.findViewById(R.id.ld4);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.toolbar_icon)");
        this.LJLJJI = (SmartImageView) findViewById;
        View findViewById2 = view.findViewById(R.id.azx);
        o.LJIIIIZZ(findViewById2, "itemView.findViewById(R.id.btn_tool_iv_container)");
        this.LJLJJL = findViewById2;
        View findViewById3 = view.findViewById(R.id.ldi);
        o.LJIIIIZZ(findViewById3, "itemView.findViewById(R.id.toolbar_item_text_view)");
        TuxTextView tuxTextView = (TuxTextView) findViewById3;
        this.LJLJJLL = tuxTextView;
        View findViewById4 = view.findViewById(R.id.ga_);
        o.LJIIIIZZ(findViewById4, "itemView.findViewById(R.id.lottie_view)");
        this.LJLJL = (C29701Eo) findViewById4;
        View findViewById5 = view.findViewById(R.id.fbk);
        o.LJIIIIZZ(findViewById5, "itemView.findViewById(R.id.iv_tool_cross)");
        this.LJLJLJ = findViewById5;
        View findViewById6 = view.findViewById(R.id.lde);
        o.LJIIIIZZ(findViewById6, "itemView.findViewById(R.id.toolbar_icon_selected)");
        this.LJLJLLL = (TuxIconView) findViewById6;
        View findViewById7 = view.findViewById(R.id.f57);
        o.LJIIIIZZ(findViewById7, "itemView.findViewById(R.id.iv_icon_shadow)");
        this.LJLL = (SmartImageView) findViewById7;
        this.LJLLILLLL = new IDlS65S0100000_14(this, 4);
        this.LJLLJ = C7MY.LIZIZ(2);
        this.LJLLL = C7MY.LIZIZ(1);
        if (AVExternalServiceImpl.LIZ().configService().avsettingsConfig().enableFrontFlash() && (LIZJ = C72972SkS.LIZJ(tuxTextView, "context", R.attr.d6)) != null) {
            tuxTextView.setShadowLayer(C74275TDb.LIZ(6.0f), 0.0f, 0.0f, LIZJ.intValue());
        }
    }
}
