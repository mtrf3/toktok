package X;

import Y.ALAdapterS9S0100000_12;
import android.animation.ObjectAnimator;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.o;

/* renamed from: X.TBv, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74243TBv extends RecyclerView.ViewHolder {
    public final C62822Ol8 LJLIL;
    public final C62822Ol8 LJLILLLLZI;
    public final C62822Ol8 LJLJI;
    public final C62822Ol8 LJLJJI;
    public final C62822Ol8 LJLJJL;

    public final View L() {
        Object value = this.LJLJJL.getValue();
        o.LJIIIIZZ(value, "<get-mBackground>(...)");
        return (View) value;
    }

    public final C62846OlW M() {
        Object value = this.LJLJI.getValue();
        o.LJIIIIZZ(value, "<get-mImgIcon>(...)");
        return (C62846OlW) value;
    }

    public final ImageView N() {
        Object value = this.LJLJJI.getValue();
        o.LJIIIIZZ(value, "<get-mImgSelected>(...)");
        return (ImageView) value;
    }

    public final void P() {
        Drawable background = L().getBackground();
        o.LJII(background, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
        if (N().getVisibility() == 8) {
            Object value = this.LJLILLLLZI.getValue();
            o.LJIIIIZZ(value, "<get-mTvEnName>(...)");
            ObjectAnimator.ofArgb(value, "textColor", this.itemView.getResources().getColor(R.color.cs), this.itemView.getResources().getColor(R.color.bc)).setDuration(150L).start();
            Object value2 = this.LJLIL.getValue();
            o.LJIIIIZZ(value2, "<get-mTvLocalName>(...)");
            ObjectAnimator.ofArgb(value2, "textColor", this.itemView.getResources().getColor(R.color.ck), this.itemView.getResources().getColor(R.color.bc)).setDuration(150L).start();
            ObjectAnimator.ofArgb(background, "color", 0, ColorProtector.parseColor(L().getTag().toString())).setDuration(150L).start();
            N().setVisibility(0);
            ObjectAnimator.ofFloat(N(), "alpha", 0.0f, 1.0f).setDuration(150L).start();
            ObjectAnimator duration = ObjectAnimator.ofFloat(M(), "alpha", 1.0f, 0.0f).setDuration(150L);
            o.LJIIIIZZ(duration, "ofFloat(mImgIcon, \"alpha… 1F, 0F).setDuration(150)");
            duration.addListener(new ALAdapterS9S0100000_12(this, 10));
            duration.start();
            return;
        }
        Object value3 = this.LJLILLLLZI.getValue();
        o.LJIIIIZZ(value3, "<get-mTvEnName>(...)");
        ObjectAnimator.ofArgb(value3, "textColor", this.itemView.getResources().getColor(R.color.bc), this.itemView.getResources().getColor(R.color.cs)).setDuration(150L).start();
        Object value4 = this.LJLIL.getValue();
        o.LJIIIIZZ(value4, "<get-mTvLocalName>(...)");
        ObjectAnimator.ofArgb(value4, "textColor", this.itemView.getResources().getColor(R.color.bc), this.itemView.getResources().getColor(R.color.ck)).setDuration(150L).start();
        ObjectAnimator.ofArgb(background, "color", ColorProtector.parseColor(L().getTag().toString()), 0).setDuration(150L).start();
        M().setVisibility(0);
        ObjectAnimator.ofFloat(M(), "alpha", 0.0f, 1.0f).setDuration(150L).start();
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(N(), "alpha", 1.0f, 0.0f).setDuration(150L);
        o.LJIIIIZZ(duration2, "ofFloat(mImgSelected, \"a… 1F, 0F).setDuration(150)");
        duration2.addListener(new ALAdapterS9S0100000_12(this, 11));
        duration2.start();
    }

    public C74243TBv(View view) {
        super(view);
        this.LJLIL = C221108m2.LIZIZ(new AqS162S0100000_12(view, 1105));
        this.LJLILLLLZI = C221108m2.LIZIZ(new AqS162S0100000_12(view, 1104));
        this.LJLJI = C221108m2.LIZIZ(new AqS162S0100000_12(view, 1102));
        this.LJLJJI = C221108m2.LIZIZ(new AqS162S0100000_12(view, 1103));
        this.LJLJJL = C221108m2.LIZIZ(new AqS162S0100000_12(view, 1101));
    }
}
