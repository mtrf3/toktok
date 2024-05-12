package X;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Paint;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommercelive.business.common.data.AtmosphereTag;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class S3N extends AbstractC71456S2q {
    public FrameLayout LJIIJJI;
    public TuxTextView LJIIL;
    public AppCompatImageView LJIILIIL;
    public AtmosphereTag LJIILJJIL;
    public ValueAnimator LJIILL;
    public float LJIILLIIL;
    public final C62822Ol8 LJIIZILJ;

    @Override // X.AbstractC71456S2q
    public final int LJFF() {
        return 3;
    }

    @Override // X.AbstractC71456S2q
    public final void LJII() {
        FrameLayout frameLayout = this.LJIIJJI;
        if (frameLayout != null) {
            S2R.LIZIZ(frameLayout, false);
        }
    }

    @Override // X.AbstractC71456S2q
    public final S31 LJIIIIZZ(boolean z) {
        long j;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        int i;
        int i2;
        int i3;
        int i4;
        AtmosphereTag atmosphereTag;
        if (z && (atmosphereTag = this.LJIIIIZZ) != null) {
            j = atmosphereTag.count;
        } else {
            j = 0;
        }
        S31 s31 = new S31();
        StringBuilder LIZJ = V10.LIZJ("HotSaleTagV2 show saleRank = ", j, ", isShow = ");
        FrameLayout frameLayout = this.LJIIJJI;
        if (frameLayout != null && frameLayout.getVisibility() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        C1DI.LIZJ(LIZJ, z2, LIZJ, 4);
        if (1 <= j && j < 4) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            if (this.LJIIJJI == null) {
                FrameLayout frameLayout2 = (FrameLayout) LJI(R.id.lfy);
                this.LJIIJJI = frameLayout2;
                View findViewById = frameLayout2.findViewById(R.id.lg0);
                o.LJIIIIZZ(findViewById, "value.findViewById(R.id.top_sale_title)");
                this.LJIIL = (TuxTextView) findViewById;
                View findViewById2 = frameLayout2.findViewById(R.id.lfz);
                o.LJIIIIZZ(findViewById2, "value.findViewById(R.id.top_sale_img)");
                this.LJIILIIL = (AppCompatImageView) findViewById2;
                TuxTextView tuxTextView = this.LJIIL;
                if (tuxTextView != null) {
                    tuxTextView.setTypeface(tuxTextView.getTypeface(), 2);
                    TuxTextView tuxTextView2 = this.LJIIL;
                    if (tuxTextView2 != null) {
                        int paddingEnd = tuxTextView2.getPaddingEnd() + tuxTextView2.getPaddingStart();
                        ViewGroup.LayoutParams layoutParams = tuxTextView2.getLayoutParams();
                        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                            i3 = C16530kr.LIZJ((ViewGroup.MarginLayoutParams) layoutParams);
                        } else {
                            i3 = 0;
                        }
                        int i5 = paddingEnd + i3;
                        ViewGroup.LayoutParams layoutParams2 = tuxTextView2.getLayoutParams();
                        if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                            i4 = C16530kr.LIZIZ((ViewGroup.MarginLayoutParams) layoutParams2);
                        } else {
                            i4 = 0;
                        }
                        this.LJIILLIIL = this.LJIIIZ - (i5 + i4);
                        z4 = true;
                    } else {
                        o.LJIJI("topSaleTitle");
                        throw null;
                    }
                } else {
                    o.LJIJI("topSaleTitle");
                    throw null;
                }
            } else {
                z4 = false;
            }
            FrameLayout frameLayout3 = this.LJIIJJI;
            if (frameLayout3 != null) {
                C45804HyK.LJJLIIIJ(this.LJIIJ.getMarginTop(), frameLayout3);
                if (frameLayout3.getVisibility() != 0) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (z4 | z5) {
                    OUP.LJJLIIIJ(frameLayout3);
                    StringBuilder LIZ = X1D.LIZ();
                    Object value = this.LJII.getValue();
                    o.LJIIIIZZ(value, "<get-topTitle>(...)");
                    String LLLZ = C16880lQ.LLLZ((String) value, Arrays.copyOf(new Object[]{Long.valueOf(j)}, 1));
                    o.LJIIIIZZ(LLLZ, "format(format, *args)");
                    LIZ.append(LLLZ);
                    LIZ.append("  ");
                    String LIZIZ = X1D.LIZIZ(LIZ);
                    TuxTextView tuxTextView3 = this.LJIIL;
                    if (tuxTextView3 != null) {
                        tuxTextView3.setText(LIZIZ);
                        AppCompatImageView appCompatImageView = this.LJIILIIL;
                        if (appCompatImageView != null) {
                            if (j != 1) {
                                if (j == 2) {
                                    i2 = R.drawable.b3j;
                                } else if (j == 3) {
                                    i2 = R.drawable.b3i;
                                }
                                appCompatImageView.setImageResource(i2);
                                LJIIIZ(this.LJIILLIIL, LIZIZ);
                                ((AnimatorSet) this.LJIIZILJ.getValue()).start();
                                this.LJIILJJIL = this.LJIIIIZZ;
                                s31.LIZIZ = true;
                            }
                            i2 = R.drawable.b3h;
                            appCompatImageView.setImageResource(i2);
                            LJIIIZ(this.LJIILLIIL, LIZIZ);
                            ((AnimatorSet) this.LJIIZILJ.getValue()).start();
                            this.LJIILJJIL = this.LJIIIIZZ;
                            s31.LIZIZ = true;
                        } else {
                            o.LJIJI("topSaleImg");
                            throw null;
                        }
                    } else {
                        o.LJIJI("topSaleTitle");
                        throw null;
                    }
                } else if (!AbstractC71456S2q.LIZLLL(this.LJIIIIZZ, this.LJIILJJIL)) {
                    StringBuilder LIZ2 = X1D.LIZ();
                    Object value2 = this.LJII.getValue();
                    o.LJIIIIZZ(value2, "<get-topTitle>(...)");
                    String LLLZ2 = C16880lQ.LLLZ((String) value2, Arrays.copyOf(new Object[]{Long.valueOf(j)}, 1));
                    o.LJIIIIZZ(LLLZ2, "format(format, *args)");
                    LIZ2.append(LLLZ2);
                    LIZ2.append("  ");
                    String LIZIZ2 = X1D.LIZIZ(LIZ2);
                    TuxTextView tuxTextView4 = this.LJIIL;
                    if (tuxTextView4 != null) {
                        tuxTextView4.setText(LIZIZ2);
                        AppCompatImageView appCompatImageView2 = this.LJIILIIL;
                        if (appCompatImageView2 != null) {
                            if (j != 1) {
                                if (j == 2) {
                                    i = R.drawable.b3j;
                                } else if (j == 3) {
                                    i = R.drawable.b3i;
                                }
                                appCompatImageView2.setImageResource(i);
                                LJIIIZ(this.LJIILLIIL, LIZIZ2);
                                ((AnimatorSet) this.LJIIZILJ.getValue()).start();
                                this.LJIILJJIL = this.LJIIIIZZ;
                                s31.LIZIZ = true;
                            }
                            i = R.drawable.b3h;
                            appCompatImageView2.setImageResource(i);
                            LJIIIZ(this.LJIILLIIL, LIZIZ2);
                            ((AnimatorSet) this.LJIIZILJ.getValue()).start();
                            this.LJIILJJIL = this.LJIIIIZZ;
                            s31.LIZIZ = true;
                        } else {
                            o.LJIJI("topSaleImg");
                            throw null;
                        }
                    } else {
                        o.LJIJI("topSaleTitle");
                        throw null;
                    }
                }
            }
            s31.LIZ = true;
        } else {
            FrameLayout frameLayout4 = this.LJIIJJI;
            if (frameLayout4 != null) {
                frameLayout4.setVisibility(8);
            }
            this.LJIIIIZZ = null;
            this.LJIILJJIL = null;
        }
        return s31;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S3N(ViewGroup parentView, int i) {
        super(parentView, i);
        o.LJIIIZ(parentView, "parentView");
        this.LJIILLIIL = C32151Nz.LJIIZILJ(56);
        this.LJIIZILJ = C221108m2.LIZIZ(new AqS162S0100000_12(this, 1279));
    }

    public final void LJIIIZ(float f, String text) {
        TuxTextView tuxTextView = this.LJIIL;
        if (tuxTextView != null) {
            tuxTextView.setMaxWidth((int) f);
            TuxTextView tuxTextView2 = this.LJIIL;
            if (tuxTextView2 != null) {
                Paint paint = new Paint(tuxTextView2.getPaint());
                paint.setTextSize(C87277YNd.LJI(9, this.LIZJ));
                float f2 = 9.0f;
                if (paint.measureText(text) > f) {
                    TuxTextView tuxTextView3 = this.LJIIL;
                    if (tuxTextView3 != null) {
                        tuxTextView3.LJJJ(9.0f);
                        TuxTextView tuxTextView4 = this.LJIIL;
                        if (tuxTextView4 != null) {
                            tuxTextView4.setEllipsize(TextUtils.TruncateAt.MARQUEE);
                            TuxTextView tuxTextView5 = this.LJIIL;
                            if (tuxTextView5 != null) {
                                tuxTextView5.setMarqueeRepeatLimit(0);
                                int LJI = C87277YNd.LJI(40, this.LIZJ);
                                paint.setTextSize(C87277YNd.LJFF(this.LIZJ, 9.0f));
                                StringBuilder LIZ = X1D.LIZ();
                                LIZ.append(text);
                                LIZ.append("     ");
                                int measureText = (int) paint.measureText(X1D.LIZIZ(LIZ));
                                TuxTextView tuxTextView6 = this.LJIIL;
                                if (tuxTextView6 != null) {
                                    StringBuilder LIZ2 = X1D.LIZ();
                                    LIZ2.append(text);
                                    LIZ2.append("     ");
                                    LIZ2.append(text);
                                    tuxTextView6.setText(X1D.LIZIZ(LIZ2));
                                    TuxTextView tuxTextView7 = this.LJIIL;
                                    if (tuxTextView7 != null) {
                                        tuxTextView7.post(new S3P(this, measureText, LJI, text));
                                        return;
                                    } else {
                                        o.LJIJI("topSaleTitle");
                                        throw null;
                                    }
                                }
                                o.LJIJI("topSaleTitle");
                                throw null;
                            }
                            o.LJIJI("topSaleTitle");
                            throw null;
                        }
                        o.LJIJI("topSaleTitle");
                        throw null;
                    }
                    o.LJIJI("topSaleTitle");
                    throw null;
                }
                TuxTextView tuxTextView8 = this.LJIIL;
                if (tuxTextView8 != null) {
                    Context context = this.LIZJ;
                    o.LJIIIZ(context, "context");
                    o.LJIIIZ(text, "text");
                    Paint paint2 = new Paint(tuxTextView8.getPaint());
                    int i = 13;
                    do {
                        paint2.setTextSize(C87277YNd.LJI(i, context));
                        if (paint2.measureText(text) <= f || i == 9) {
                            f2 = i;
                            break;
                        }
                        i--;
                    } while (8 < i);
                    tuxTextView8.LJJJ(f2);
                    TuxTextView tuxTextView9 = this.LJIIL;
                    if (tuxTextView9 != null) {
                        tuxTextView9.setEllipsize(TextUtils.TruncateAt.END);
                        TuxTextView tuxTextView10 = this.LJIIL;
                        if (tuxTextView10 != null) {
                            tuxTextView10.requestLayout();
                            return;
                        } else {
                            o.LJIJI("topSaleTitle");
                            throw null;
                        }
                    }
                    o.LJIJI("topSaleTitle");
                    throw null;
                }
                o.LJIJI("topSaleTitle");
                throw null;
            }
            o.LJIJI("topSaleTitle");
            throw null;
        }
        o.LJIJI("topSaleTitle");
        throw null;
    }
}
