package X;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.favorites.service.FavoriteServiceImpl;
import com.ss.android.ugc.aweme.feed.assem.avatar.FeedDefaultAvatarAbility;
import com.zhiliaoapp.musically.R;

/* renamed from: X.7x4, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public class C202467x4 extends C77869UhF {
    public static final String LJLJLJ = getLikeAnim();
    public static final String LJLJLLL = getLikeGuideAnim();
    public static final String LJLL = getDislikeAnim();
    public C202427x0 LJLIL;
    public C202427x0 LJLILLLLZI;
    public C202427x0 LJLJI;
    public InterfaceC202447x2 LJLJJI;
    public C202477x5 LJLJJL;
    public FeedDefaultAvatarAbility LJLJJLL;
    public int LJLJL;

    private C202477x5 getDiggViewScaleHelper() {
        if (this.LJLJJL == null) {
            this.LJLJJL = new C202477x5();
        }
        return this.LJLJJL;
    }

    public static String getDislikeAnim() {
        if (C202677xP.LIZIZ()) {
            if (C5WZ.LIZ() != 0) {
                return "tt_feed_like_cancel_tux_lottie.json";
            }
            return "feed_fill_like/feed_fill_like_cancel_lottie.json";
        }
        if (C5WZ.LIZ() != 0) {
            return "tt_feed_like_cancel_old_tux_lottie.json";
        }
        return "icon_home_dislike_new.json";
    }

    public static String getLikeAnim() {
        if (C202677xP.LIZIZ()) {
            if ((C5WZ.LIZ() & 1) == 1) {
                return "tt_feed_like_tap_tux_lottie.json";
            }
            if ((C5WZ.LIZ() & 2) == 2) {
                return "tt_feed_like_tap_quick_tux_lottie.json";
            }
            return "feed_fill_like/feed_fill_like_add_lottie.json";
        }
        if ((C5WZ.LIZ() & 1) == 1) {
            return "tt_feed_like_tap_old_tux_lottie.json";
        }
        if ((C5WZ.LIZ() & 2) == 2) {
            return "tt_feed_like_tap_old_quick_tux_lottie.json";
        }
        return "icon_home_like_new.json";
    }

    public static String getLikeGuideAnim() {
        if ((FavoriteServiceImpl.LJIJJLI().LJI() > 0 || !C202677xP.LIZ()) && C202677xP.LIZIZ()) {
            return "feed_like_guide/like_reminder.json";
        }
        return "feed_like_guide/like_reminder_bold.json";
    }

    public final void LIZIZ() {
        if (C202677xP.LIZIZ() && !C204257zx.LJFF()) {
            return;
        }
        setImageAlpha(254);
        getDiggViewScaleHelper().getClass();
        Drawable LIZJ = C202477x5.LIZJ();
        if (R3A.LJII()) {
            if (LIZJ == null) {
                LIZJ = LIZJ(getContext());
            }
        } else if (LIZJ == null) {
            LIZJ = LIZJ(getContext());
        }
        setImageDrawable(LIZJ);
    }

    public final void LJ() {
        Drawable drawable = getDrawable();
        if (drawable != null && !(drawable instanceof C04740Go) && drawable.getIntrinsicWidth() > 0) {
            this.LJLJL = drawable.getIntrinsicWidth();
        }
    }

    public final void LJII() {
        LJ();
        setAnimation(LJLJLJ);
        if (this.LJLIL == null) {
            this.LJLIL = new C202427x0(this);
        }
        removeAnimatorListener(this.LJLIL);
        addAnimatorListener(this.LJLIL);
        playAnimation();
    }

    public C202467x4(Context context) {
        super(context);
    }

    public static Drawable LIZJ(Context context) {
        SY9 LJFF;
        SY9 LJFF2;
        if (context == null || context.getResources() == null) {
            return null;
        }
        if (FavoriteServiceImpl.LJIJJLI().LJI() > 0 || !C202677xP.LIZ()) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            if (C202677xP.LIZIZ()) {
                LJFF = LJFF(R.raw.icon_color_like_shadow_alt_1, context);
            } else {
                LJFF = LJFF(R.drawable.bo3, context);
            }
            if (C202677xP.LIZIZ()) {
                LJFF2 = LJFF(R.drawable.b10, context);
            } else {
                LJFF2 = LJFF(R.drawable.ic_home_like_after, context);
            }
            LJFF.setColorFilter(C04330Ez.LIZIZ(context, R.color.yi), PorterDuff.Mode.SRC_OVER);
            LJFF2.setColorFilter(C04330Ez.LIZIZ(context, R.color.yi), PorterDuff.Mode.SRC_OVER);
            stateListDrawable.addState(new int[]{-16842913}, LJFF);
            stateListDrawable.addState(new int[]{android.R.attr.state_selected}, LJFF2);
            return stateListDrawable;
        }
        return context.getResources().getDrawable(R.drawable.bnl);
    }

    public final void LIZ(Boolean bool) {
        int LIZIZ;
        if (bool.booleanValue()) {
            LIZIZ = (int) (((this.LJLJL * 1.0f) / 120.0f) * 168.0f);
        } else {
            LIZIZ = C202477x5.LIZIZ();
        }
        if (LIZIZ > 0 && getWidth() != LIZIZ) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            layoutParams.width = LIZIZ;
            layoutParams.height = LIZIZ;
            setLayoutParams(layoutParams);
        }
    }

    public void LJI(boolean z) {
        float f;
        String str = LJLJLJ;
        if ("icon_home_like_new.json".equals(str) || "tt_feed_like_tap_old_tux_lottie.json".equals(str) || "tt_feed_like_tap_old_quick_tux_lottie.json".equals(str)) {
            if ("tt_feed_like_tap_old_tux_lottie.json".equals(str) || "tt_feed_like_tap_old_quick_tux_lottie.json".equals(str)) {
                f = 1.5555556f;
            } else {
                f = 1.25f;
            }
            int LIZIZ = C202477x5.LIZIZ();
            if (z) {
                LIZIZ = (int) (Math.min(this.LJLJL, LIZIZ) * f);
            }
            if (LIZIZ > 0) {
                ViewGroup.LayoutParams layoutParams = getLayoutParams();
                layoutParams.width = LIZIZ;
                layoutParams.height = LIZIZ;
                setLayoutParams(layoutParams);
            }
        }
    }

    @Override // X.C29701Eo
    public void setComposition(C0GY c0gy) {
        super.setComposition(c0gy);
    }

    public C202467x4(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public static SY9 LJFF(int i, Context context) {
        C2068389v c2068389v = new C2068389v();
        c2068389v.LIZ = i;
        c2068389v.LIZIZ = C202477x5.LIZ();
        c2068389v.LIZJ = C202477x5.LIZ();
        return c2068389v.LIZ(context);
    }
}
