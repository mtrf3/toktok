package X;

import Y.ACListenerS25S0100000_5;
import Y.IDAListenerS74S0100000_5;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.CZm, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31542CZm extends AbstractC31544CZo {
    public final View LJLIL;
    public final InterfaceC31548CZs LJLILLLLZI;
    public final LinearLayout LJLJI;
    public final C47121t6 LJLJJI;
    public final C47121t6 LJLJJL;
    public final C47121t6 LJLJJLL;
    public final ImageView LJLJL;
    public final View LJLJLJ;
    public ObjectAnimator LJLJLLL;

    public final void N(C31540CZk c31540CZk) {
        String LJIILJJIL;
        C47121t6 c47121t6 = this.LJLJJLL;
        if (c47121t6 != null) {
            c47121t6.setText(String.valueOf(c31540CZk.LIZ));
        }
        if (c31540CZk.LIZLLL) {
            LinearLayout linearLayout = this.LJLJI;
            if (linearLayout != null) {
                linearLayout.setTranslationY(C15380j0.LIZ(0.0f));
            }
            View view = this.LJLJLJ;
            if (view != null) {
                view.setBackground(C04270Et.LIZIZ(C39849FkT.LIZ(), R.drawable.clw));
            }
            C47121t6 c47121t62 = this.LJLJJI;
            if (c47121t62 != null) {
                long j = c31540CZk.LIZJ;
                if (j > 0) {
                    LJIILJJIL = C15380j0.LJIILL(R.string.o4o, String.valueOf(j));
                } else {
                    LJIILJJIL = C15380j0.LJIILJJIL(R.string.o4p);
                }
                c47121t62.setText(LJIILJJIL);
            }
        } else {
            LinearLayout linearLayout2 = this.LJLJI;
            if (linearLayout2 != null) {
                linearLayout2.setTranslationY(C15380j0.LIZ(16.0f));
            }
            View view2 = this.LJLJLJ;
            if (view2 != null) {
                view2.setBackground(C04270Et.LIZIZ(C39849FkT.LIZ(), R.drawable.clv));
            }
        }
        if (c31540CZk.LJ == EnumC31545CZp.HIGH) {
            C47121t6 c47121t63 = this.LJLJJL;
            if (c47121t63 != null) {
                AbstractC31544CZo.M(c47121t63);
            }
            C47121t6 c47121t64 = this.LJLJJL;
            if (c47121t64 != null) {
                c47121t64.setText(C15380j0.LJIILL(R.string.o4y, String.valueOf(c31540CZk.LIZIZ)));
            }
            ImageView imageView = this.LJLJL;
            if (imageView != null) {
                imageView.setImageDrawable(C04270Et.LIZIZ(C39849FkT.LIZ(), R.drawable.dau));
                return;
            }
            return;
        }
        C47121t6 c47121t65 = this.LJLJJL;
        if (c47121t65 != null) {
            c47121t65.setText(C15380j0.LJIILL(R.string.o4q, String.valueOf(c31540CZk.LIZIZ)));
        }
        ImageView imageView2 = this.LJLJL;
        if (imageView2 == null) {
            return;
        }
        imageView2.setImageDrawable(C04270Et.LIZIZ(C39849FkT.LIZ(), R.drawable.dat));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31542CZm(View view, InterfaceC31548CZs selectCallback) {
        super(view);
        o.LJIIIZ(selectCallback, "selectCallback");
        this.LJLIL = view;
        this.LJLILLLLZI = selectCallback;
        this.LJLJI = (LinearLayout) view.findViewById(R.id.kc1);
        this.LJLJJI = (C47121t6) view.findViewById(R.id.e5i);
        this.LJLJJL = (C47121t6) view.findViewById(R.id.title);
        this.LJLJJLL = (C47121t6) view.findViewById(R.id.bgn);
        this.LJLJL = (ImageView) view.findViewById(R.id.e_q);
        view.findViewById(R.id.time);
        this.LJLJLJ = view.findViewById(R.id.af5);
        C16880lQ.LJIIJ(new ACListenerS25S0100000_5(this, 429), view);
    }

    @Override // X.AbstractC31544CZo
    public final void L(C31540CZk data, List<? extends Object> payloads) {
        String LJIILJJIL;
        o.LJIIIZ(data, "data");
        o.LJIIIZ(payloads, "payloads");
        if (payloads.isEmpty()) {
            N(data);
            return;
        }
        Object obj = ListProtector.get(payloads, 0);
        o.LJII(obj, "null cannot be cast to non-null type kotlin.String");
        if (o.LJ(obj, "RefreshTime")) {
            C47121t6 c47121t6 = this.LJLJJI;
            if (c47121t6 == null) {
                return;
            }
            long j = data.LIZJ;
            if (j > 0) {
                LJIILJJIL = C15380j0.LJIILL(R.string.o4o, String.valueOf(j));
            } else {
                LJIILJJIL = C15380j0.LJIILJJIL(R.string.o4p);
            }
            c47121t6.setText(LJIILJJIL);
            return;
        }
        if (!o.LJ(obj, "ChangeSelect")) {
            return;
        }
        N(data);
        if (data.LIZLLL) {
            ObjectAnimator objectAnimator = this.LJLJLLL;
            if (objectAnimator != null) {
                objectAnimator.cancel();
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.LJLJI, (Property<LinearLayout, Float>) View.TRANSLATION_Y, C15380j0.LIZ(16.0f), 0.0f);
            this.LJLJLLL = ofFloat;
            if (ofFloat != null) {
                ofFloat.addListener(new IDAListenerS74S0100000_5(this, 35));
            }
            ObjectAnimator objectAnimator2 = this.LJLJLLL;
            if (objectAnimator2 != null) {
                objectAnimator2.setDuration(100L);
            }
            ObjectAnimator objectAnimator3 = this.LJLJLLL;
            if (objectAnimator3 != null) {
                C149985uc.LIZ(objectAnimator3);
            }
            ObjectAnimator objectAnimator4 = this.LJLJLLL;
            if (objectAnimator4 == null) {
                return;
            }
            objectAnimator4.start();
            return;
        }
        ObjectAnimator objectAnimator5 = this.LJLJLLL;
        if (objectAnimator5 != null) {
            objectAnimator5.cancel();
        }
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.LJLJI, (Property<LinearLayout, Float>) View.TRANSLATION_Y, 0.0f, C15380j0.LIZ(16.0f));
        this.LJLJLLL = ofFloat2;
        if (ofFloat2 != null) {
            ofFloat2.addListener(new IDAListenerS74S0100000_5(this, 36));
        }
        ObjectAnimator objectAnimator6 = this.LJLJLLL;
        if (objectAnimator6 != null) {
            objectAnimator6.setDuration(100L);
        }
        ObjectAnimator objectAnimator7 = this.LJLJLLL;
        if (objectAnimator7 != null) {
            C149985uc.LIZ(objectAnimator7);
        }
        ObjectAnimator objectAnimator8 = this.LJLJLLL;
        if (objectAnimator8 == null) {
            return;
        }
        objectAnimator8.start();
    }
}
