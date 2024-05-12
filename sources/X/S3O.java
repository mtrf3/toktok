package X;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Paint;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommercelive.business.common.data.AtmosphereTag;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import kotlin.jvm.internal.AqS15S2200000_12;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class S3O extends AbstractC71456S2q {
    public FrameLayout LJIIJJI;
    public TuxTextView LJIIL;
    public FrameLayout LJIILIIL;
    public LinearLayout LJIILJJIL;
    public TuxTextView LJIILL;
    public TuxTextView LJIILLIIL;
    public AtmosphereTag LJIIZILJ;
    public float LJIJ;
    public AnimatorSet LJIJI;
    public AnimatorSet LJIJJ;
    public final C62822Ol8 LJIJJLI;
    public final C62822Ol8 LJIL;
    public final C62822Ol8 LJJ;
    public final C62822Ol8 LJJI;

    @Override // X.AbstractC71456S2q
    public final int LJFF() {
        return 1;
    }

    @Override // X.AbstractC71456S2q
    public final void LJII() {
        FrameLayout frameLayout = this.LJIILIIL;
        if (frameLayout != null) {
            S2R.LIZIZ(frameLayout, false);
        }
        FrameLayout frameLayout2 = this.LJIIJJI;
        if (frameLayout2 != null) {
            S2R.LIZIZ(frameLayout2, false);
        }
    }

    @Override // X.AbstractC71456S2q
    public final S31 LJIIIIZZ(boolean z) {
        boolean z2;
        long j;
        S31 s31;
        boolean z3;
        boolean z4;
        boolean z5;
        AtmosphereTag atmosphereTag;
        Long l;
        boolean z6;
        boolean z7;
        boolean z8;
        int i;
        int i2;
        AtmosphereTag atmosphereTag2;
        if (((Number) C52672Klo.LIZ.getValue()).intValue() == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            if (z && (atmosphereTag2 = this.LJIIIIZZ) != null) {
                l = Long.valueOf(atmosphereTag2.count);
            } else {
                l = null;
            }
            s31 = new S31();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("HotSaleTagV2 show hotCount = ");
            LIZ.append(l);
            LIZ.append(", isShow = ");
            FrameLayout frameLayout = this.LJIILIIL;
            if (frameLayout != null && frameLayout.getVisibility() == 0) {
                z6 = true;
            } else {
                z6 = false;
            }
            C1DI.LIZJ(LIZ, z6, LIZ, 4);
            if (l != null && l.longValue() >= 0) {
                if (this.LJIILIIL == null) {
                    FrameLayout frameLayout2 = (FrameLayout) LJI(R.id.e7l);
                    this.LJIILIIL = frameLayout2;
                    View findViewById = frameLayout2.findViewById(R.id.e7n);
                    o.LJIIIIZZ(findViewById, "value.findViewById(R.id.hot_title_v2)");
                    this.LJIILL = (TuxTextView) findViewById;
                    View findViewById2 = frameLayout2.findViewById(R.id.e7h);
                    o.LJIIIIZZ(findViewById2, "value.findViewById(R.id.hot_count_v2)");
                    this.LJIILLIIL = (TuxTextView) findViewById2;
                    View findViewById3 = frameLayout2.findViewById(R.id.e7g);
                    o.LJIIIIZZ(findViewById3, "value.findViewById(R.id.hot_content_v2)");
                    this.LJIILJJIL = (LinearLayout) findViewById3;
                    TuxTextView tuxTextView = this.LJIILL;
                    if (tuxTextView != null) {
                        tuxTextView.setTypeface(tuxTextView.getTypeface(), 2);
                        TuxTextView tuxTextView2 = this.LJIILLIIL;
                        if (tuxTextView2 != null) {
                            tuxTextView2.setTypeface(tuxTextView2.getTypeface(), 2);
                            LinearLayout linearLayout = this.LJIILJJIL;
                            if (linearLayout != null) {
                                int paddingEnd = linearLayout.getPaddingEnd() + linearLayout.getPaddingStart();
                                ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
                                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                                    i = C16530kr.LIZJ((ViewGroup.MarginLayoutParams) layoutParams);
                                } else {
                                    i = 0;
                                }
                                int i3 = paddingEnd + i;
                                ViewGroup.LayoutParams layoutParams2 = linearLayout.getLayoutParams();
                                if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                                    i2 = C16530kr.LIZIZ((ViewGroup.MarginLayoutParams) layoutParams2);
                                } else {
                                    i2 = 0;
                                }
                                this.LJIJ = this.LJIIIZ - (i3 + i2);
                                z7 = true;
                            } else {
                                o.LJIJI("hotSaleContentV2");
                                throw null;
                            }
                        } else {
                            o.LJIJI("hotSaleCountV2");
                            throw null;
                        }
                    } else {
                        o.LJIJI("hotSaleTitleV2");
                        throw null;
                    }
                } else {
                    z7 = false;
                }
                FrameLayout frameLayout3 = this.LJIILIIL;
                if (frameLayout3 != null) {
                    C45804HyK.LJJLIIIJ(this.LJIIJ.getMarginTop(), frameLayout3);
                    if (frameLayout3.getVisibility() != 0) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    String str = "";
                    if (z7 | z8) {
                        frameLayout3.setVisibility(0);
                        FrameLayout frameLayout4 = this.LJIIJJI;
                        if (frameLayout4 != null) {
                            frameLayout4.setVisibility(8);
                        }
                        TuxTextView tuxTextView3 = this.LJIILL;
                        if (tuxTextView3 != null) {
                            tuxTextView3.setVisibility(4);
                            TuxTextView tuxTextView4 = this.LJIILLIIL;
                            if (tuxTextView4 != null) {
                                tuxTextView4.setVisibility(4);
                                if (l.longValue() > 0) {
                                    str = LJIIJ(l.longValue(), true);
                                }
                                StringBuilder LIZ2 = X1D.LIZ();
                                LIZ2.append(LJ());
                                LIZ2.append((char) 160);
                                LJIIIZ(X1D.LIZIZ(LIZ2), str, this.LJIJ);
                                AnimatorSet animatorSet = this.LJIJJ;
                                if (animatorSet == null) {
                                    animatorSet = new AnimatorSet();
                                    animatorSet.play(S3V.LIZ(frameLayout3, S3S.LJLIL, S3T.LJLIL)).before((Animator) this.LJIL.getValue());
                                    this.LJIJJ = animatorSet;
                                }
                                animatorSet.start();
                                this.LJIIZILJ = this.LJIIIIZZ;
                                s31.LIZIZ = true;
                            } else {
                                o.LJIJI("hotSaleCountV2");
                                throw null;
                            }
                        } else {
                            o.LJIJI("hotSaleTitleV2");
                            throw null;
                        }
                    } else if (!AbstractC71456S2q.LIZLLL(this.LJIIIIZZ, this.LJIIZILJ)) {
                        if (l.longValue() > 0) {
                            AtmosphereTag atmosphereTag3 = this.LJIIZILJ;
                            if (atmosphereTag3 != null) {
                                if (atmosphereTag3.count > 0) {
                                    StringBuilder LIZ3 = X1D.LIZ();
                                    LIZ3.append(LJ());
                                    LIZ3.append((char) 160);
                                    LJIIIZ(X1D.LIZIZ(LIZ3), LJIIJ(l.longValue(), true), this.LJIJ);
                                    ((AnimatorSet) this.LJJ.getValue()).start();
                                } else {
                                    StringBuilder LIZ4 = X1D.LIZ();
                                    LIZ4.append(LJ());
                                    LIZ4.append((char) 160);
                                    LJIIJJI(X1D.LIZIZ(LIZ4), LJIIJ(l.longValue(), true), this.LJIJ);
                                }
                            }
                        } else {
                            AtmosphereTag atmosphereTag4 = this.LJIIZILJ;
                            if (atmosphereTag4 != null && atmosphereTag4.count > 0) {
                                StringBuilder LIZ5 = X1D.LIZ();
                                LIZ5.append(LJ());
                                LIZ5.append("  ");
                                LJIIJJI(X1D.LIZIZ(LIZ5), "", this.LJIJ);
                            }
                        }
                        s31.LIZIZ = true;
                        this.LJIIZILJ = this.LJIIIIZZ;
                    }
                }
                s31.LIZ = true;
            } else {
                FrameLayout frameLayout5 = this.LJIILIIL;
                if (frameLayout5 != null) {
                    frameLayout5.setVisibility(4);
                }
                this.LJIIIIZZ = null;
                this.LJIIZILJ = null;
            }
        } else {
            if (z && (atmosphereTag = this.LJIIIIZZ) != null) {
                j = atmosphereTag.count;
            } else {
                j = 0;
            }
            s31 = new S31();
            StringBuilder LIZJ = V10.LIZJ("HotSaleTag show hotCount = ", j, ", isShow = ");
            FrameLayout frameLayout6 = this.LJIIJJI;
            if (frameLayout6 != null && frameLayout6.getVisibility() == 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            C1DI.LIZJ(LIZJ, z3, LIZJ, 4);
            if (j > 0) {
                if (this.LJIIJJI == null) {
                    FrameLayout frameLayout7 = (FrameLayout) LJI(R.id.e7k);
                    this.LJIIJJI = frameLayout7;
                    View findViewById4 = frameLayout7.findViewById(R.id.e7m);
                    o.LJIIIIZZ(findViewById4, "value.findViewById(R.id.hot_title)");
                    TuxTextView tuxTextView5 = (TuxTextView) findViewById4;
                    this.LJIIL = tuxTextView5;
                    tuxTextView5.setTypeface(tuxTextView5.getTypeface(), 2);
                    z4 = true;
                } else {
                    z4 = false;
                }
                FrameLayout frameLayout8 = this.LJIIJJI;
                if (frameLayout8 != null) {
                    C45804HyK.LJJLIIIJ(this.LJIIJ.getMarginTop(), frameLayout8);
                    if (frameLayout8.getVisibility() != 0) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if (z4 | z5) {
                        frameLayout8.setVisibility(0);
                        FrameLayout frameLayout9 = this.LJIILIIL;
                        if (frameLayout9 != null) {
                            frameLayout9.setVisibility(8);
                        }
                        TuxTextView tuxTextView6 = this.LJIIL;
                        if (tuxTextView6 != null) {
                            StringBuilder LIZ6 = X1D.LIZ();
                            LIZ6.append(LJ());
                            LIZ6.append((char) 160);
                            tuxTextView6.setText(X1D.LIZIZ(LIZ6));
                            AnimatorSet animatorSet2 = this.LJIJI;
                            if (animatorSet2 == null) {
                                animatorSet2 = new AnimatorSet();
                                animatorSet2.play(S3V.LIZ(frameLayout8, S3S.LJLIL, S3T.LJLIL)).before((Animator) this.LJIJJLI.getValue());
                                this.LJIJI = animatorSet2;
                            }
                            animatorSet2.start();
                            this.LJIIZILJ = this.LJIIIIZZ;
                            s31.LIZIZ = true;
                        } else {
                            o.LJIJI("hotSaleTitle");
                            throw null;
                        }
                    } else if (!AbstractC71456S2q.LIZLLL(this.LJIIIIZZ, this.LJIIZILJ)) {
                        TuxTextView tuxTextView7 = this.LJIIL;
                        if (tuxTextView7 != null) {
                            tuxTextView7.setText(LJIIJ(j, false));
                            ((AnimatorSet) this.LJIJJLI.getValue()).start();
                            s31.LIZIZ = true;
                            this.LJIIZILJ = this.LJIIIIZZ;
                        } else {
                            o.LJIJI("hotSaleTitle");
                            throw null;
                        }
                    }
                }
                s31.LIZ = true;
            } else {
                FrameLayout frameLayout10 = this.LJIIJJI;
                if (frameLayout10 != null) {
                    frameLayout10.setVisibility(4);
                }
                this.LJIIIIZZ = null;
                this.LJIIZILJ = null;
            }
        }
        return s31;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S3O(ViewGroup parentView, int i) {
        super(parentView, i);
        o.LJIIIZ(parentView, "parentView");
        this.LJIJ = C32151Nz.LJIIZILJ(56);
        this.LJIJJLI = C221108m2.LIZIZ(new AqS162S0100000_12(this, 1267));
        this.LJIL = C221108m2.LIZIZ(new AqS162S0100000_12(this, 1268));
        this.LJJ = C221108m2.LIZIZ(new AqS162S0100000_12(this, 1270));
        this.LJJI = C221108m2.LIZIZ(new AqS162S0100000_12(this, 1269));
    }

    public final String LJIIJ(long j, boolean z) {
        if (j > 999) {
            if (z) {
                return "999+  ";
            }
            StringBuilder LIZ = X1D.LIZ();
            Object value = this.LJFF.getValue();
            o.LJIIIIZZ(value, "<get-countTitle>(...)");
            String LLLZ = C16880lQ.LLLZ((String) value, Arrays.copyOf(new Object[]{999}, 1));
            o.LJIIIIZZ(LLLZ, "format(format, *args)");
            LIZ.append(LLLZ);
            LIZ.append("+  ");
            return X1D.LIZIZ(LIZ);
        }
        if (z) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(j);
            LIZ2.append("  ");
            return X1D.LIZIZ(LIZ2);
        }
        StringBuilder LIZ3 = X1D.LIZ();
        Object value2 = this.LJFF.getValue();
        o.LJIIIIZZ(value2, "<get-countTitle>(...)");
        String LLLZ2 = C16880lQ.LLLZ((String) value2, Arrays.copyOf(new Object[]{Long.valueOf(j)}, 1));
        o.LJIIIIZZ(LLLZ2, "format(format, *args)");
        LIZ3.append(LLLZ2);
        LIZ3.append("  ");
        return X1D.LIZIZ(LIZ3);
    }

    public final void LJIIIZ(String str, String str2, float f) {
        Context context = this.LIZJ;
        TuxTextView tuxTextView = this.LJIILL;
        if (tuxTextView != null) {
            TuxTextView tuxTextView2 = this.LJIILLIIL;
            if (tuxTextView2 != null) {
                OSZ<Float, Float> LIZ = S2P.LIZ(context, f, tuxTextView, tuxTextView2, str, str2);
                TuxTextView tuxTextView3 = this.LJIILL;
                if (tuxTextView3 != null) {
                    tuxTextView3.LJJJ(LIZ.getFirst().floatValue());
                    TuxTextView tuxTextView4 = this.LJIILLIIL;
                    if (tuxTextView4 != null) {
                        tuxTextView4.LJJJ(LIZ.getFirst().floatValue());
                        TuxTextView tuxTextView5 = this.LJIILL;
                        if (tuxTextView5 != null) {
                            tuxTextView5.setText(str);
                            TuxTextView tuxTextView6 = this.LJIILLIIL;
                            if (tuxTextView6 != null) {
                                tuxTextView6.setText(str2);
                                TuxTextView tuxTextView7 = this.LJIILLIIL;
                                if (tuxTextView7 != null) {
                                    tuxTextView7.setEllipsize(TextUtils.TruncateAt.END);
                                    LinearLayout linearLayout = this.LJIILJJIL;
                                    if (linearLayout != null) {
                                        linearLayout.requestLayout();
                                        return;
                                    } else {
                                        o.LJIJI("hotSaleContentV2");
                                        throw null;
                                    }
                                }
                                o.LJIJI("hotSaleCountV2");
                                throw null;
                            }
                            o.LJIJI("hotSaleCountV2");
                            throw null;
                        }
                        o.LJIJI("hotSaleTitleV2");
                        throw null;
                    }
                    o.LJIJI("hotSaleCountV2");
                    throw null;
                }
                o.LJIJI("hotSaleTitleV2");
                throw null;
            }
            o.LJIJI("hotSaleCountV2");
            throw null;
        }
        o.LJIJI("hotSaleTitleV2");
        throw null;
    }

    public final void LJIIJJI(String text1, String text2, float f) {
        C46415IJn c46415IJn;
        Context context = this.LIZJ;
        TuxTextView tuxTextView = this.LJIILL;
        if (tuxTextView != null) {
            TuxTextView tuxTextView2 = this.LJIILLIIL;
            if (tuxTextView2 != null) {
                o.LJIIIZ(context, "context");
                o.LJIIIZ(text1, "text1");
                o.LJIIIZ(text2, "text2");
                Paint paint = new Paint(tuxTextView.getPaint());
                Paint paint2 = new Paint(tuxTextView2.getPaint());
                for (int i = 13; 8 < i; i--) {
                    paint.setTextSize(C87277YNd.LJI(i, context));
                    paint2.setTextSize(C87277YNd.LJI(i, context));
                    float measureText = paint2.measureText(text2) + paint.measureText(text1);
                    if (measureText <= f || i == 9) {
                        c46415IJn = new C46415IJn(measureText + C87277YNd.LJI(15, context), i);
                        break;
                    }
                }
                c46415IJn = new C46415IJn(f + C87277YNd.LJI(15, context), 9);
                if (!o.LJ(text2, "")) {
                    LinearLayout linearLayout = this.LJIILJJIL;
                    if (linearLayout != null) {
                        ValueAnimator LIZIZ = S3V.LIZIZ(linearLayout, linearLayout.getWidth(), c46415IJn.LJLJI, null, new AqS15S2200000_12(this, c46415IJn, text1, text2, 0), 8);
                        AnimatorSet animatorSet = new AnimatorSet();
                        animatorSet.play(LIZIZ).before((Animator) this.LJJ.getValue());
                        animatorSet.start();
                        return;
                    }
                    o.LJIJI("hotSaleContentV2");
                    throw null;
                }
                LinearLayout linearLayout2 = this.LJIILJJIL;
                if (linearLayout2 != null) {
                    ValueAnimator LIZIZ2 = S3V.LIZIZ(linearLayout2, linearLayout2.getWidth(), c46415IJn.LJLJI, new AqS15S2200000_12(this, c46415IJn, text1, text2, 1), null, 16);
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    animatorSet2.play(LIZIZ2).after((Animator) this.LJJI.getValue());
                    animatorSet2.start();
                    return;
                }
                o.LJIJI("hotSaleContentV2");
                throw null;
            }
            o.LJIJI("hotSaleCountV2");
            throw null;
        }
        o.LJIJI("hotSaleTitleV2");
        throw null;
    }
}
