package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.favorites.service.FavoriteServiceImpl;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.7yb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public class C203417yb extends C77869UhF {
    public static final int LJLJL = O6R.LJJIIZ(C32151Nz.LJIIZILJ(50));
    public static final int LJLJLJ = C7MY.LIZIZ(24);
    public static final int LJLJLLL = C7MY.LIZIZ(32);
    public static final int LJLL;
    public static final int LJLLI;
    public static final int LJLLILLLL;
    public C203347yU LJLIL;
    public int LJLILLLLZI;
    public C203437yd LJLJI;
    public C203437yd LJLJJI;
    public final String LJLJJL;
    public final String LJLJJLL;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C203417yb(Context context) {
        this(context, null, 6, 0);
        o.LJIIIZ(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C203417yb(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        o.LJIIIZ(context, "context");
    }

    public int getLandscapeDrawableWidth() {
        if (C209418Jt.LIZ(null).LIZ()) {
            return LJLJLJ;
        }
        return LJLJLLL;
    }

    static {
        O6R.LJJIIZ(C32151Nz.LJIIZILJ(40));
        O6R.LJJIIZ(C32151Nz.LJIIZILJ(3));
        LJLL = O6R.LJJIIZ(C32151Nz.LJIIZILJ(34));
        LJLLI = C7MY.LIZIZ(56);
        LJLLILLLL = O6R.LJJIIZ(C32151Nz.LJIIZILJ(50));
    }

    public C203347yU getFavoriteViewScaleHelper() {
        if (this.LJLIL == null) {
            this.LJLIL = new C203347yU();
        }
        C203347yU c203347yU = this.LJLIL;
        o.LJI(c203347yU);
        return c203347yU;
    }

    private final int getLayoutWidth() {
        if (!C202677xP.LIZ()) {
            O6R.LJJIIZ(C32151Nz.LJIIZILJ(45));
        }
        return LJLJL;
    }

    private final int getLottieWidth() {
        if (!C202677xP.LIZ()) {
            return C7MY.LIZIZ(45);
        }
        if (C8D3.LIZJ() || FavoriteServiceImpl.LJIJJLI().LJIJJ()) {
            return LJLLILLLL;
        }
        return LJLLI;
    }

    public final void LIZIZ() {
        if (C202677xP.LIZIZ() && !C79004UzY.LJJIJIIJI(getContext())) {
            return;
        }
        setImageDrawable(getFavoriteViewScaleHelper().LIZ());
    }

    public final void LIZJ() {
        Drawable drawable = getDrawable();
        if (drawable != null && !(drawable instanceof C04740Go) && drawable.getIntrinsicWidth() > 0) {
            this.LJLILLLLZI = drawable.getIntrinsicWidth();
        }
        if (C79004UzY.LJJIJIIJI(getContext())) {
            this.LJLILLLLZI = getLandscapeDrawableWidth();
        }
    }

    public final C203347yU getScaleHelper() {
        return this.LJLIL;
    }

    public final void LIZ(boolean z) {
        int layoutWidth;
        if (C202677xP.LIZIZ() && !C79004UzY.LJJIJIIJI(getContext())) {
            return;
        }
        if (z) {
            layoutWidth = (int) ((this.LJLILLLLZI / 120.0f) * 168);
        } else {
            layoutWidth = getLayoutWidth();
        }
        if (C79004UzY.LJJIJIIJI(getContext())) {
            if (z) {
                layoutWidth = (int) ((this.LJLILLLLZI / 120.0f) * 168);
            } else {
                layoutWidth = getLandscapeDrawableWidth();
            }
        }
        if (z && layoutWidth == 0) {
            if (C79004UzY.LJJIJIIJI(getContext())) {
                layoutWidth = LJLL;
            } else {
                layoutWidth = getLottieWidth();
            }
        }
        if (layoutWidth > 0 && getWidth() != layoutWidth) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            layoutParams.width = layoutWidth;
            layoutParams.height = layoutWidth;
            setLayoutParams(layoutParams);
        }
    }

    public final void setScaleHelper(C203347yU c203347yU) {
        this.LJLIL = c203347yU;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C203417yb(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        String str;
        a1.LJFF(context, "context");
        if (!C202677xP.LIZIZ()) {
            str = "icon_home_favorite.json";
        } else {
            str = "feed_fill_favourite/feed_fill_favourite_add_lottie.json";
        }
        this.LJLJJL = str;
        this.LJLJJLL = C202677xP.LIZIZ() ? "feed_fill_favourite/feed_fill_favourite_cancel_lottie.json" : "icon_home_favorite.json";
    }

    public /* synthetic */ C203417yb(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
