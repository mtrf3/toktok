package X;

import Y.IDCListenerS135S0100000;
import Y.IDRunnableS85S0100000;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.livesetting.broadcast.GameFloatNoticeSetting;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.IDqS420S0100000;
import kotlin.jvm.internal.o;

/* renamed from: X.1e5, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C37811e5 extends ConstraintLayout {
    public final GradientDrawable LJLIL;
    public final int LJLILLLLZI;
    public final int LJLJI;
    public final int LJLJJI;
    public final int LJLJJL;
    public final int LJLJJLL;
    public final int LJLJL;
    public final int LJLJLJ;
    public final C47121t6 LJLJLLL;
    public final LiveIconView LJLL;
    public final LiveIconView LJLLI;
    public final C47121t6 LJLLILLLL;
    public final View LJLLJ;
    public View.OnClickListener LJLLL;
    public final C62822Ol8 LJLLLL;
    public final C62822Ol8 LJLLLLLL;

    private final ValueAnimator getShowAlphaAnimator() {
        return (ValueAnimator) this.LJLLLL.getValue();
    }

    private final ValueAnimator getShowScaleAnimator() {
        return (ValueAnimator) this.LJLLLLLL.getValue();
    }

    public final View.OnClickListener getOnCloseClickListener() {
        return this.LJLLL;
    }

    public final void LJJLJLI(Throwable th) {
        ViewParent parent;
        Thread thread;
        View rootView = getRootView();
        Thread thread2 = null;
        if (rootView != null && (parent = rootView.getParent()) != null && parent.getClass().getName().equals("android.view.ViewRootImpl")) {
            try {
                Object obj = parent.getClass().getDeclaredField("mThread").get(parent);
                o.LJII(obj, "null cannot be cast to non-null type java.lang.Thread");
                thread = (Thread) obj;
            } catch (Throwable th2) {
                th = th2;
                thread = null;
            }
            try {
                C3C5.m7constructorimpl(C76800UCe.LIZ);
            } catch (Throwable th3) {
                th = th3;
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
                thread2 = thread;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("update ui error, is main = ");
                LIZ.append(o.LJ(C16880lQ.LLLLIIIILLL(), C16880lQ.LLJJJJ().getThread()));
                LIZ.append(", ViewRootImpl: thread = ");
                LIZ.append(thread2);
                LIZ.append(", wanna content = ");
                LIZ.append((Object) this.LJLJLLL.getText());
                C0K2.LIZ(X1D.LIZIZ(LIZ), th);
            }
            thread2 = thread;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("update ui error, is main = ");
        LIZ2.append(o.LJ(C16880lQ.LLLLIIIILLL(), C16880lQ.LLJJJJ().getThread()));
        LIZ2.append(", ViewRootImpl: thread = ");
        LIZ2.append(thread2);
        LIZ2.append(", wanna content = ");
        LIZ2.append((Object) this.LJLJLLL.getText());
        C0K2.LIZ(X1D.LIZIZ(LIZ2), th);
    }

    public final void setOnCloseClickListener(View.OnClickListener onClickListener) {
        this.LJLLL = onClickListener;
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        getShowAlphaAnimator().cancel();
        getShowScaleAnimator().cancel();
        if (i == 0) {
            getShowAlphaAnimator().start();
            getShowScaleAnimator().start();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C37811e5(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        new LinkedHashMap();
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.LJLIL = gradientDrawable;
        this.LJLILLLLZI = C15380j0.LIZIZ(R.color.bd);
        this.LJLJI = -13092808;
        this.LJLJJI = C15380j0.LIZIZ(R.color.c3);
        this.LJLJJL = C87277YNd.LJIIJJI(12);
        this.LJLJJLL = C87277YNd.LJIIJJI(6);
        this.LJLJL = C87277YNd.LJIIJJI(10);
        this.LJLJLJ = C87277YNd.LJIIJJI(6);
        this.LJLLLL = C221108m2.LIZIZ(new IDqS420S0100000(this, 186));
        this.LJLLLLLL = C221108m2.LIZIZ(new IDqS420S0100000(this, 187));
        ViewGroup.inflate(context, R.layout.dkx, this);
        View findViewById = findViewById(R.id.m7i);
        o.LJIIIIZZ(findViewById, "findViewById(R.id.tv_game_tip)");
        this.LJLJLLL = (C47121t6) findViewById;
        View findViewById2 = findViewById(R.id.f3j);
        o.LJIIIIZZ(findViewById2, "findViewById(R.id.iv_game_close)");
        LiveIconView liveIconView = (LiveIconView) findViewById2;
        this.LJLL = liveIconView;
        View findViewById3 = findViewById(R.id.f3o);
        o.LJIIIIZZ(findViewById3, "findViewById(R.id.iv_game_warn)");
        this.LJLLI = (LiveIconView) findViewById3;
        View findViewById4 = findViewById(R.id.lyv);
        o.LJIIIIZZ(findViewById4, "findViewById(R.id.tv_action)");
        C47121t6 c47121t6 = (C47121t6) findViewById4;
        this.LJLLILLLL = c47121t6;
        this.LJLLJ = findViewById(R.id.g1h);
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(C87277YNd.LJIIJJI(4));
        C16880lQ.LJJII(liveIconView, new IDCListenerS135S0100000(this, 90));
        C16880lQ.LJJIIZ(c47121t6, new IDCListenerS135S0100000(this, 91));
    }

    public final void LJJLL(EnumC264412a floatTipType, CharSequence tipContent, Object obj) {
        Integer num;
        ImageModel imageModel;
        boolean z;
        Drawable drawable;
        View view;
        o.LJIIIZ(floatTipType, "floatTipType");
        o.LJIIIZ(tipContent, "tipContent");
        GameFloatNoticeSetting gameFloatNoticeSetting = GameFloatNoticeSetting.INSTANCE;
        if (gameFloatNoticeSetting.isExperimentGroup() && (obj instanceof C31977Cgn)) {
            C31977Cgn c31977Cgn = (C31977Cgn) obj;
            imageModel = c31977Cgn.LIZIZ;
            num = c31977Cgn.LIZJ;
            if (num == null) {
                num = null;
            }
        } else {
            num = null;
            imageModel = null;
        }
        this.LJLJLLL.setTextColor(this.LJLILLLLZI);
        this.LJLLILLLL.setTextColor(this.LJLILLLLZI);
        if (floatTipType.getPriority() == 0 || (floatTipType.getPriority() == 1 && floatTipType.isRed())) {
            z = true;
        } else {
            z = false;
        }
        if (num != null) {
            this.LJLIL.setColor(num.intValue());
        } else if (z) {
            this.LJLIL.setColor(this.LJLJJI);
        } else {
            this.LJLIL.setColor(this.LJLJI);
        }
        setBackground(this.LJLIL);
        C12I leftIcon = floatTipType.getLeftIcon();
        if (leftIcon != null && leftIcon.LIZ != null) {
            this.LJLLI.setIconTintList(leftIcon.LIZIZ);
            this.LJLLI.setImageDrawable(leftIcon.LIZ);
            C87277YNd.LJJIJ(this.LJLLI);
            drawable = leftIcon.LIZ;
        } else {
            C87277YNd.LJJIIZ(this.LJLLI);
            this.LJLLI.setIconTintList(null);
            drawable = null;
        }
        if (gameFloatNoticeSetting.isExperimentGroup() && imageModel != null) {
            C87277YNd.LJJIJ(this.LJLLI);
            C78720Uuy LJIIIZ = C15650jR.LIZ().LJIIIZ(imageModel);
            LJIIIZ.LIZLLL(ImageView.ScaleType.FIT_CENTER);
            if (drawable != null) {
                LJIIIZ.LJIIJ = drawable;
            }
            LJIIIZ.LJIIJJI(this.LJLLI);
        }
        this.LJLJLLL.setText(tipContent);
        if (floatTipType.getRightText() != null) {
            this.LJLLILLLL.setText(floatTipType.getRightText());
            C87277YNd.LJJIJ(this.LJLLILLLL);
            View view2 = this.LJLLJ;
            if (view2 != null) {
                C87277YNd.LJJIJ(view2);
            }
        } else {
            C87277YNd.LJJIIZ(this.LJLLILLLL);
        }
        C12I rightIcon = floatTipType.getRightIcon();
        if (rightIcon != null && rightIcon.LIZ != null) {
            this.LJLL.setIconTintList(rightIcon.LIZIZ);
            this.LJLL.setIcon(rightIcon.LIZ);
            C87277YNd.LJJIJ(this.LJLL);
            View view3 = this.LJLLJ;
            if (view3 != null) {
                C87277YNd.LJJIJ(view3);
            }
            post(new IDRunnableS85S0100000(this, 125));
        } else {
            C87277YNd.LJJIIZ(this.LJLL);
            this.LJLL.setIconTintList(null);
            setTouchDelegate(null);
        }
        if (floatTipType.getRightText() == null && floatTipType.getRightIcon() == null && (view = this.LJLLJ) != null) {
            C87277YNd.LJJIIZ(view);
        }
    }
}
