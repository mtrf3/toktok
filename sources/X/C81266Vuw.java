package X;

import Y.ACListenerS34S0100000_14;
import Y.ARunnableS13S0210000_14;
import Y.ARunnableS50S0100000_14;
import android.animation.AnimatorSet;
import android.app.Activity;
import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Vuw, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81266Vuw extends PopupWindow {
    public int LIZ;
    public float LIZIZ;
    public float LIZJ;
    public boolean LIZLLL;
    public int LJ;
    public final long LJFF;
    public boolean LJI;
    public C136865Ys LJII;
    public C8HN LJIIIIZZ;
    public boolean LJIIIZ;
    public int LJIIJ;
    public AnimatorSet LJIIJJI;
    public final Activity LJIIL;
    public final ARunnableS50S0100000_14 LJIILIIL;

    public final void LIZIZ() {
        AnimatorSet animatorSet = this.LJIIJJI;
        if (animatorSet != null) {
            C16880lQ.LJLJJL(animatorSet);
        }
        AnimatorSet animatorSet2 = this.LJIIJJI;
        if (animatorSet2 != null) {
            animatorSet2.cancel();
        }
        this.LJIIJJI = null;
        if (this.LJIIL.isFinishing() || !isShowing()) {
            return;
        }
        super.dismiss();
    }

    @Override // android.widget.PopupWindow
    public final void dismiss() {
        if (!this.LJIIIZ) {
            LIZ(false);
            getContentView().removeCallbacks(this.LJIILIIL);
            this.LJ = 0;
        }
    }

    public C81266Vuw(C81267Vux c81267Vux) {
        int i = 1;
        this.LJFF = 5000L;
        Activity activity = c81267Vux.LJIIIZ;
        this.LJIIL = activity;
        this.LIZ = 0;
        this.LIZJ = 0.0f;
        boolean z = c81267Vux.LIZ;
        this.LIZLLL = false;
        this.LJ = 0;
        this.LJFF = c81267Vux.LIZIZ;
        String str = c81267Vux.LIZJ;
        int i2 = c81267Vux.LIZLLL;
        float f = c81267Vux.LJ;
        boolean z2 = c81267Vux.LJFF;
        float f2 = c81267Vux.LJI;
        boolean z3 = c81267Vux.LJII;
        boolean z4 = c81267Vux.LJIIIIZZ;
        C74275TDb.LIZIZ(activity, 3.0f);
        setWidth(-2);
        setHeight(-2);
        setFocusable(false);
        setOutsideTouchable(z3);
        setClippingEnabled(false);
        setBackgroundDrawable(new ColorDrawable(0));
        setInputMethodMode(1);
        setSoftInputMode(16);
        C8HN c8hn = new C8HN(activity);
        this.LJIIIIZZ = c8hn;
        c8hn.setTextColor(activity.getResources().getColor(R.color.wj));
        C8HN c8hn2 = this.LJIIIIZZ;
        if (c8hn2 != null) {
            c8hn2.setTextSize(1, 13.0f);
            C8HN c8hn3 = this.LJIIIIZZ;
            if (c8hn3 != null) {
                c8hn3.setTextAlignment(5);
                C8HN c8hn4 = this.LJIIIIZZ;
                if (c8hn4 != null) {
                    c8hn4.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                    C8HN c8hn5 = this.LJIIIIZZ;
                    if (c8hn5 != null) {
                        c8hn5.setGravity(17);
                        C8HN c8hn6 = this.LJIIIIZZ;
                        if (c8hn6 != null) {
                            c8hn6.setMaxWidth((int) C74275TDb.LIZIZ(activity, 197.0f));
                            C8HN c8hn7 = this.LJIIIIZZ;
                            if (c8hn7 != null) {
                                c8hn7.setMaxLines(2);
                                C8HN c8hn8 = this.LJIIIIZZ;
                                if (c8hn8 != null) {
                                    C136865Ys c136865Ys = new C136865Ys(activity);
                                    this.LJII = c136865Ys;
                                    c136865Ys.setBackgroundColor(0);
                                    C136865Ys c136865Ys2 = this.LJII;
                                    if (c136865Ys2 != null) {
                                        c136865Ys2.addView(c8hn8);
                                        C136865Ys c136865Ys3 = this.LJII;
                                        if (c136865Ys3 != null) {
                                            c136865Ys3.setGravity(17);
                                            ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
                                            C136865Ys c136865Ys4 = this.LJII;
                                            if (c136865Ys4 != null) {
                                                c136865Ys4.setLayoutParams(marginLayoutParams);
                                                C136865Ys c136865Ys5 = this.LJII;
                                                if (c136865Ys5 != null) {
                                                    c136865Ys5.setVisibility(8);
                                                    C136865Ys c136865Ys6 = this.LJII;
                                                    if (c136865Ys6 != null) {
                                                        c136865Ys6.setMNeedPath(z);
                                                        C136865Ys c136865Ys7 = this.LJII;
                                                        if (c136865Ys7 != null) {
                                                            c136865Ys7.setMNeedArrow(z2);
                                                            C136865Ys c136865Ys8 = this.LJII;
                                                            if (c136865Ys8 != null) {
                                                                c136865Ys8.setMNeedPressFade(false);
                                                                C136865Ys c136865Ys9 = this.LJII;
                                                                if (c136865Ys9 != null) {
                                                                    c136865Ys9.setMNeedShadow(false);
                                                                    C136865Ys c136865Ys10 = this.LJII;
                                                                    if (c136865Ys10 != null) {
                                                                        c136865Ys10.setMShadowColor(0);
                                                                        C136865Ys c136865Ys11 = this.LJII;
                                                                        if (c136865Ys11 != null) {
                                                                            c136865Ys11.setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS34S0100000_14(this, 2)));
                                                                            C136865Ys c136865Ys12 = this.LJII;
                                                                            if (c136865Ys12 != null) {
                                                                                setContentView(c136865Ys12);
                                                                                getContentView().measure(LiveLayoutPreloadThreadPriority.DEFAULT, LiveLayoutPreloadThreadPriority.DEFAULT);
                                                                                this.LIZLLL = true;
                                                                                if (!TextUtils.isEmpty(str)) {
                                                                                    C8HN c8hn9 = this.LJIIIIZZ;
                                                                                    if (c8hn9 != null) {
                                                                                        c8hn9.setText(str);
                                                                                    } else {
                                                                                        o.LJIJI("mTextView");
                                                                                        throw null;
                                                                                    }
                                                                                }
                                                                                if (i2 != 0) {
                                                                                    C8HN c8hn10 = this.LJIIIIZZ;
                                                                                    if (c8hn10 != null) {
                                                                                        c8hn10.setText(i2);
                                                                                    } else {
                                                                                        o.LJIJI("mTextView");
                                                                                        throw null;
                                                                                    }
                                                                                }
                                                                                if (f != 0.0f) {
                                                                                    C8HN c8hn11 = this.LJIIIIZZ;
                                                                                    if (c8hn11 != null) {
                                                                                        c8hn11.setTextSize(1, f);
                                                                                    } else {
                                                                                        o.LJIJI("mTextView");
                                                                                        throw null;
                                                                                    }
                                                                                }
                                                                                getContentView().measure(LiveLayoutPreloadThreadPriority.DEFAULT, LiveLayoutPreloadThreadPriority.DEFAULT);
                                                                                if (this.LIZLLL) {
                                                                                    View contentView = getContentView();
                                                                                    o.LJIIIIZZ(contentView, "contentView");
                                                                                    contentView.setSystemUiVisibility(4102);
                                                                                }
                                                                                if (!z4) {
                                                                                    C136865Ys c136865Ys13 = this.LJII;
                                                                                    if (c136865Ys13 != null) {
                                                                                        c136865Ys13.setNeedAddColor(false);
                                                                                    } else {
                                                                                        o.LJIJI("mDmtBubbleLayout");
                                                                                        throw null;
                                                                                    }
                                                                                }
                                                                                C136865Ys c136865Ys14 = this.LJII;
                                                                                if (c136865Ys14 != null) {
                                                                                    c136865Ys14.setMNeedPath(z);
                                                                                    C136865Ys c136865Ys15 = this.LJII;
                                                                                    if (c136865Ys15 != null) {
                                                                                        int i3 = this.LIZ;
                                                                                        if (i3 != 3) {
                                                                                            if (i3 != 5) {
                                                                                                if (i3 != 48) {
                                                                                                    if (i3 == 80) {
                                                                                                        i = 0;
                                                                                                    }
                                                                                                } else {
                                                                                                    i = 3;
                                                                                                }
                                                                                            }
                                                                                        } else {
                                                                                            i = 2;
                                                                                        }
                                                                                        c136865Ys15.setBubbleOrientation(i);
                                                                                        if (f2 != 0.0f) {
                                                                                            C136865Ys c136865Ys16 = this.LJII;
                                                                                            if (c136865Ys16 != null) {
                                                                                                c136865Ys16.setMPadding(f2);
                                                                                            } else {
                                                                                                o.LJIJI("mDmtBubbleLayout");
                                                                                                throw null;
                                                                                            }
                                                                                        }
                                                                                        this.LJIILIIL = new ARunnableS50S0100000_14(this, 4);
                                                                                        return;
                                                                                    }
                                                                                    o.LJIJI("mDmtBubbleLayout");
                                                                                    throw null;
                                                                                }
                                                                                o.LJIJI("mDmtBubbleLayout");
                                                                                throw null;
                                                                            }
                                                                            o.LJIJI("mDmtBubbleLayout");
                                                                            throw null;
                                                                        }
                                                                        o.LJIJI("mDmtBubbleLayout");
                                                                        throw null;
                                                                    }
                                                                    o.LJIJI("mDmtBubbleLayout");
                                                                    throw null;
                                                                }
                                                                o.LJIJI("mDmtBubbleLayout");
                                                                throw null;
                                                            }
                                                            o.LJIJI("mDmtBubbleLayout");
                                                            throw null;
                                                        }
                                                        o.LJIJI("mDmtBubbleLayout");
                                                        throw null;
                                                    }
                                                    o.LJIJI("mDmtBubbleLayout");
                                                    throw null;
                                                }
                                                o.LJIJI("mDmtBubbleLayout");
                                                throw null;
                                            }
                                            o.LJIJI("mDmtBubbleLayout");
                                            throw null;
                                        }
                                        o.LJIJI("mDmtBubbleLayout");
                                        throw null;
                                    }
                                    o.LJIJI("mDmtBubbleLayout");
                                    throw null;
                                }
                                o.LJIJI("mTextView");
                                throw null;
                            }
                            o.LJIJI("mTextView");
                            throw null;
                        }
                        o.LJIJI("mTextView");
                        throw null;
                    }
                    o.LJIJI("mTextView");
                    throw null;
                }
                o.LJIJI("mTextView");
                throw null;
            }
            o.LJIJI("mTextView");
            throw null;
        }
        o.LJIJI("mTextView");
        throw null;
    }

    public final void LIZ(boolean z) {
        C136865Ys c136865Ys = this.LJII;
        if (c136865Ys != null) {
            if (!z) {
                this.LJIIIZ = true;
            }
            this.LJIIJJI = new AnimatorSet();
            c136865Ys.post(new ARunnableS13S0210000_14(this, c136865Ys, z, 0));
            return;
        }
        o.LJIJI("mDmtBubbleLayout");
        throw null;
    }

    public final void LIZJ(float f, int i, View view) {
        this.LJ = i;
        this.LIZIZ = f;
        if (this.LJIIL.isFinishing() || view == null || view.getWindowToken() == null) {
            return;
        }
        view.getMeasuredHeight();
        view.getMeasuredWidth();
        getContentView().removeCallbacks(this.LJIILIIL);
        this.LIZ = 48;
        C136865Ys c136865Ys = this.LJII;
        if (c136865Ys != null) {
            this.LJIIJ = c136865Ys.getPADDING();
            if (isShowing()) {
                super.dismiss();
                return;
            }
            getContentView().measure(LiveLayoutPreloadThreadPriority.DEFAULT, LiveLayoutPreloadThreadPriority.DEFAULT);
            if (!this.LJI) {
                this.LIZJ += this.LJIIJ * 8;
                this.LJI = true;
            }
            C136865Ys c136865Ys2 = this.LJII;
            if (c136865Ys2 != null) {
                c136865Ys2.LJZ = this.LIZIZ + this.LIZJ;
                c136865Ys2.LJZI = 3;
                int[] iArr = new int[2];
                view.getLocationOnScreen(iArr);
                int LIZIZ = iArr[0] + this.LJ + ((int) C74275TDb.LIZIZ(this.LJIIL, 1.4f));
                int i2 = iArr[1];
                getContentView().measure(LiveLayoutPreloadThreadPriority.DEFAULT, LiveLayoutPreloadThreadPriority.DEFAULT);
                View contentView = getContentView();
                o.LJIIIIZZ(contentView, "contentView");
                C16880lQ.LLL(this, view, LIZIZ, (i2 - contentView.getMeasuredHeight()) + ((int) C74275TDb.LIZIZ(this.LJIIL, 1.3f)));
                this.LJIIIZ = false;
                if (this.LJFF <= 0) {
                    return;
                }
                getContentView().postDelayed(this.LJIILIIL, this.LJFF);
                return;
            }
            o.LJIJI("mDmtBubbleLayout");
            throw null;
        }
        o.LJIJI("mDmtBubbleLayout");
        throw null;
    }

    @Override // android.widget.PopupWindow
    public final void showAtLocation(View parent, int i, int i2, int i3) {
        o.LJIIIZ(parent, "parent");
        super.showAtLocation(parent, i, i2, i3);
        LIZ(true);
    }
}
