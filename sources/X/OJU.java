package X;

import android.content.Context;
import android.graphics.drawable.PictureDrawable;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.zhiliaoapp.musically.R;
import java.io.File;
import java.io.FileInputStream;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class OJU extends LinearLayout {
    public final float LJLIL;
    public final float LJLILLLLZI;
    public final ImageView LJLJI;
    public String LJLJJI;
    public boolean LJLJJL;
    public Float LJLJJLL;
    public Float LJLJL;
    public Long LJLJLJ;

    public final void LIZIZ() {
        Float f;
        if (this.LJLJJL && (f = this.LJLJJLL) != null) {
            float floatValue = f.floatValue();
            Float f2 = this.LJLJL;
            if (f2 != null) {
                AlphaAnimation alphaAnimation = new AlphaAnimation(floatValue, f2.floatValue());
                alphaAnimation.setInterpolator(new LinearInterpolator());
                alphaAnimation.setFillAfter(true);
                alphaAnimation.setRepeatCount(-1);
                alphaAnimation.setRepeatMode(2);
                Long l = this.LJLJLJ;
                if (l != null) {
                    l.longValue();
                    Long l2 = this.LJLJLJ;
                    if (l2 != null) {
                        alphaAnimation.setDuration(l2.longValue());
                    } else {
                        throw new C37692Eqm("null cannot be cast to non-null type kotlin.Long");
                    }
                }
                this.LJLJI.startAnimation(alphaAnimation);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (getVisibility() == 0) {
            LIZIZ();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.LJLJI.clearAnimation();
    }

    public final Long getDuration() {
        return this.LJLJLJ;
    }

    public final Float getFromAlpha() {
        return this.LJLJJLL;
    }

    public final boolean getHasAnimation() {
        return this.LJLJJL;
    }

    public final String getSrc() {
        return this.LJLJJI;
    }

    public final Float getToAlpha() {
        return this.LJLJL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OJU(Context context) {
        super(context, null, 0);
        o.LJIIJ(context, "context");
        this.LJLIL = 14.0f;
        this.LJLILLLLZI = 14.0f;
        C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.cms, this, true);
        View findViewById = findViewById(R.id.k1x);
        o.LJFF(findViewById, "this.findViewById(R.id.skeleton)");
        this.LJLJI = (ImageView) findViewById;
    }

    public final void LIZ(File file) {
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            byte[] bArr = new byte[fileInputStream.available()];
            fileInputStream.read(bArr);
            C87698YbO LIZJ = C87698YbO.LIZJ(new String(bArr, PVC.LIZ));
            if (LIZJ != null) {
                YZD yzd = YZD.LIZJ;
                C87714Ybe c87714Ybe = LIZJ.LIZ;
                if (c87714Ybe != null) {
                    c87714Ybe.LJIIIIZZ = yzd;
                } else {
                    throw new IllegalArgumentException("SVG document is empty");
                }
            }
            this.LJLJI.setImageDrawable(new PictureDrawable(LIZJ.LJ(new VU5(this.LJLIL, this.LJLILLLLZI), null)));
            fileInputStream.close();
            C3C5.m7constructorimpl(C76800UCe.LIZ);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
    }

    public final void setDuration(Long l) {
        this.LJLJLJ = l;
    }

    public final void setFromAlpha(Float f) {
        this.LJLJJLL = f;
    }

    public final void setHasAnimation(boolean z) {
        this.LJLJJL = z;
    }

    public final void setSrc(String str) {
        this.LJLJJI = str;
    }

    public final void setToAlpha(Float f) {
        this.LJLJL = f;
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        if (i == 0) {
            LIZIZ();
        } else {
            this.LJLJI.clearAnimation();
        }
    }
}
