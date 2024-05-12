package X;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.UNk, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77092UNk {
    public final C77093UNl LIZ;
    public final EnumC77097UNp LIZIZ;
    public final int LIZJ = 84;
    public final /* synthetic */ C77095UNn LIZLLL;

    public final void LIZ() {
        FrameLayout LIZLLL = LIZLLL(this.LIZIZ);
        View LLLZIIL = C16880lQ.LLLZIIL(this.LIZ.LIZIZ, C16880lQ.LLZIL(this.LIZLLL.getContext()), null);
        View LLLZIIL2 = C16880lQ.LLLZIIL(this.LIZ.LIZJ, C16880lQ.LLZIL(this.LIZLLL.getContext()), null);
        int i = this.LIZLLL.getResources().getConfiguration().orientation;
        if (i != 1) {
            if (i == 2) {
                this.LIZLLL.setOrientation(0);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -1, 1.0f);
                LLLZIIL.setLayoutParams(layoutParams);
                LLLZIIL2.setLayoutParams(layoutParams);
            }
        } else {
            this.LIZLLL.setOrientation(1);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, 0, 1.0f);
            LLLZIIL.setLayoutParams(layoutParams2);
            LLLZIIL2.setLayoutParams(layoutParams2);
        }
        this.LIZLLL.addView(LLLZIIL);
        this.LIZLLL.addView(LIZLLL);
        this.LIZLLL.addView(LLLZIIL2);
    }

    public final void LIZIZ() {
        View LLLZIIL;
        ConstraintLayout constraintLayout = new ConstraintLayout(this.LIZLLL.getContext());
        constraintLayout.setId(View.generateViewId());
        constraintLayout.setLayoutParams(new C018905p(-1, -1));
        LIZJ(LIZLLL(this.LIZIZ), constraintLayout);
        int i = this.LIZLLL.getResources().getConfiguration().orientation;
        if (i != 1) {
            if (i != 2) {
                LLLZIIL = new FrameLayout(this.LIZLLL.getContext());
            } else {
                LLLZIIL = C16880lQ.LLLZIIL(this.LIZ.LIZLLL, C16880lQ.LLZIL(this.LIZLLL.getContext()), null);
                LLLZIIL.setId(View.generateViewId());
                LLLZIIL.setLayoutParams(new LinearLayout.LayoutParams(0, 0));
            }
        } else {
            LLLZIIL = C16880lQ.LLLZIIL(this.LIZ.LJFF, C16880lQ.LLZIL(this.LIZLLL.getContext()), null);
            LLLZIIL.setId(View.generateViewId());
            LLLZIIL.setLayoutParams(new LinearLayout.LayoutParams(0, 0));
        }
        LIZJ(LLLZIIL, constraintLayout);
        this.LIZLLL.addView(constraintLayout);
    }

    public final FrameLayout LIZLLL(EnumC77097UNp enumC77097UNp) {
        FrameLayout frameLayout = new FrameLayout(this.LIZLLL.getContext());
        frameLayout.setId(View.generateViewId());
        int i = this.LIZLLL.getResources().getConfiguration().orientation;
        if (i != 1) {
            if (i == 2) {
                frameLayout.setLayoutParams(new LinearLayout.LayoutParams(this.LIZJ, -1));
            }
        } else {
            frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, this.LIZJ));
        }
        int i2 = C77096UNo.LIZIZ[enumC77097UNp.ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                Context context = this.LIZLLL.getContext();
                o.LJIIIIZZ(context, "context");
                frameLayout.setBackground(new ColorDrawable(AnonymousClass636.LJIIIIZZ(R.attr.cl, context)));
            }
        } else {
            Context context2 = this.LIZLLL.getContext();
            o.LJIIIIZZ(context2, "context");
            frameLayout.setBackground(new ColorDrawable(AnonymousClass636.LJIIIIZZ(R.attr.d4, context2)));
        }
        return frameLayout;
    }

    public static void LIZJ(View view, ConstraintLayout constraintLayout) {
        constraintLayout.addView(view);
        AnonymousClass064 anonymousClass064 = new AnonymousClass064();
        anonymousClass064.LJII(constraintLayout);
        anonymousClass064.LJIIIZ(view.getId(), 3, 0, 3, 0);
        anonymousClass064.LJIIIZ(view.getId(), 1, 0, 1, 0);
        anonymousClass064.LJIIIZ(view.getId(), 2, 0, 2, 0);
        anonymousClass064.LJIIIZ(view.getId(), 4, 0, 4, 0);
        anonymousClass064.LIZIZ(constraintLayout);
    }

    public C77092UNk(C77095UNn c77095UNn, C77093UNl c77093UNl, EnumC77098UNq enumC77098UNq, EnumC77097UNp enumC77097UNp) {
        this.LIZLLL = c77095UNn;
        this.LIZ = c77093UNl;
        this.LIZIZ = enumC77097UNp;
        int i = C77096UNo.LIZ[enumC77098UNq.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return;
            }
            c77095UNn.setWeightSum(2.0f);
            c77095UNn.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
            if (c77095UNn.getResources().getConfiguration().orientation == 2) {
                if (c77093UNl.LIZLLL != -1) {
                    LIZIZ();
                    return;
                } else {
                    LIZ();
                    return;
                }
            }
            if (c77095UNn.getResources().getConfiguration().orientation != 1) {
                return;
            }
            if (c77093UNl.LJFF != -1) {
                LIZIZ();
                return;
            } else {
                LIZ();
                return;
            }
        }
        View LLLZIIL = C16880lQ.LLLZIIL(c77093UNl.LIZ, C16880lQ.LLZIL(c77095UNn.getContext()), null);
        LLLZIIL.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        c77095UNn.setOrientation(1);
        c77095UNn.addView(LLLZIIL);
    }
}
