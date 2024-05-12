package X;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* JADX WARN: Unknown type variable: WIDGET in type: X.Tzp<WIDGET> */
/* renamed from: X.Tzr, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76475Tzr<V extends View, T> implements InterfaceC76501U0r {
    public final /* synthetic */ AbstractC76473Tzp<WIDGET> LIZ;

    /* JADX WARN: Unknown type variable: WIDGET in type: X.Tzp<WIDGET> */
    public C76475Tzr(AbstractC76473Tzp<WIDGET> abstractC76473Tzp) {
        this.LIZ = abstractC76473Tzp;
    }

    @Override // X.InterfaceC76501U0r
    public final void LIZ(View view, Object obj) {
        String LIZIZ;
        C76414Tys view2 = (C76414Tys) view;
        long longValue = ((Number) obj).longValue();
        o.LJIIIZ(view2, "view");
        if (C76265TwT.LIZ.LJJJJLI) {
            U46 u46 = this.LIZ.LJZL;
            if (u46 != null) {
                String LJIIIIZZ = C31012CFc.LJIIIIZZ(longValue);
                if (u46.LLI) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append(C15380j0.LJIILJJIL(R.string.omi));
                    LIZ.append(' ');
                    LIZ.append(LJIIIIZZ);
                    LIZIZ = X1D.LIZIZ(LIZ);
                } else {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append(C15380j0.LJIILJJIL(R.string.omf));
                    LIZ2.append(' ');
                    LIZ2.append(LJIIIIZZ);
                    LIZIZ = X1D.LIZIZ(LIZ2);
                }
                ((TextView) u46.LIZ(R.id.mnj)).setText(LIZIZ);
                return;
            }
            return;
        }
        view2.LIZ(R.id.fgu).setVisibility(8);
        view2.LIZ(R.id.fjd).setVisibility(8);
        ((TextView) view2.LIZ(R.id.me2)).setText(C31012CFc.LJIIIIZZ(longValue));
        view2.LIZ(R.id.fgu).setBackgroundResource(R.drawable.d9q);
        ((ImageView) view2.LIZ(R.id.f8n)).setVisibility(0);
        ImageView imageView = (ImageView) view2.LIZ(R.id.f8k);
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        if (view2.LIZ(R.id.fgv).getVisibility() != 0) {
            view2.LIZ(R.id.fgv).setVisibility(0);
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view2.LIZ(R.id.me3), (Property<View, Float>) View.ALPHA, 0.0f, 1.0f);
            ofFloat.setDuration(200L);
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view2.LIZ(R.id.me2), (Property<View, Float>) View.ALPHA, 0.0f, 1.0f);
            AnimatorSet LIZLLL = JBR.LIZLLL(ofFloat2, 200L);
            LIZLLL.playTogether(ofFloat, ofFloat2);
            LIZLLL.start();
            return;
        }
        view2.LIZ(R.id.me3).setAlpha(1.0f);
        view2.LIZ(R.id.me2).setAlpha(1.0f);
    }
}
