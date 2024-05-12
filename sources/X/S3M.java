package X;

import android.animation.AnimatorSet;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommercelive.business.common.data.AtmosphereTag;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class S3M extends AbstractC71456S2q {
    public FrameLayout LJIIJJI;
    public LinearLayout LJIIL;
    public TuxTextView LJIILIIL;
    public TuxTextView LJIILJJIL;
    public AtmosphereTag LJIILL;
    public float LJIILLIIL;
    public final C62822Ol8 LJIIZILJ;
    public final C62822Ol8 LJIJ;
    public final C62822Ol8 LJIJI;

    @Override // X.AbstractC71456S2q
    public final int LJFF() {
        return 2;
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
        int i;
        int i2;
        AtmosphereTag atmosphereTag;
        if (z && (atmosphereTag = this.LJIIIIZZ) != null) {
            j = atmosphereTag.count;
        } else {
            j = 0;
        }
        S31 s31 = new S31();
        StringBuilder LIZJ = V10.LIZJ("LowStockTag show leftCount = ", j, ", isShow = ");
        FrameLayout frameLayout = this.LJIIJJI;
        if (frameLayout != null && frameLayout.getVisibility() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        C1DI.LIZJ(LIZJ, z2, LIZJ, 4);
        if (j > 0) {
            if (this.LJIIJJI == null) {
                FrameLayout frameLayout2 = (FrameLayout) LJI(R.id.gac);
                this.LJIIJJI = frameLayout2;
                View findViewById = frameLayout2.findViewById(R.id.gad);
                o.LJIIIIZZ(findViewById, "value.findViewById(R.id.low_stock_content)");
                this.LJIIL = (LinearLayout) findViewById;
                View findViewById2 = frameLayout2.findViewById(R.id.gaf);
                o.LJIIIIZZ(findViewById2, "value.findViewById(R.id.low_stock_title)");
                this.LJIILIIL = (TuxTextView) findViewById2;
                View findViewById3 = frameLayout2.findViewById(R.id.gae);
                o.LJIIIIZZ(findViewById3, "value.findViewById(R.id.low_stock_count)");
                this.LJIILJJIL = (TuxTextView) findViewById3;
                TuxTextView tuxTextView = this.LJIILIIL;
                if (tuxTextView != null) {
                    tuxTextView.setTypeface(tuxTextView.getTypeface(), 2);
                    TuxTextView tuxTextView2 = this.LJIILJJIL;
                    if (tuxTextView2 != null) {
                        tuxTextView2.setTypeface(tuxTextView2.getTypeface(), 2);
                        LinearLayout linearLayout = this.LJIIL;
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
                            this.LJIILLIIL = this.LJIIIZ - (i3 + i2);
                            z3 = true;
                        } else {
                            o.LJIJI("lowStockContent");
                            throw null;
                        }
                    } else {
                        o.LJIJI("lowStockCount");
                        throw null;
                    }
                } else {
                    o.LJIJI("lowStockTitle");
                    throw null;
                }
            } else {
                z3 = false;
            }
            FrameLayout frameLayout3 = this.LJIIJJI;
            if (frameLayout3 != null) {
                C45804HyK.LJJLIIIJ(this.LJIIJ.getMarginTop(), frameLayout3);
                if (frameLayout3.getVisibility() != 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (z3 | z4) {
                    frameLayout3.setVisibility(0);
                    TuxTextView tuxTextView3 = this.LJIILJJIL;
                    if (tuxTextView3 != null) {
                        tuxTextView3.setVisibility(4);
                        TuxTextView tuxTextView4 = this.LJIILIIL;
                        if (tuxTextView4 != null) {
                            tuxTextView4.setVisibility(4);
                            StringBuilder LIZ = X1D.LIZ();
                            LIZ.append(j);
                            LIZ.append((char) 160);
                            String LIZIZ = X1D.LIZIZ(LIZ);
                            StringBuilder LIZ2 = X1D.LIZ();
                            Object value = this.LJI.getValue();
                            o.LJIIIIZZ(value, "<get-leftTitle>(...)");
                            String LJFF = JBR.LJFF(LIZ2, (String) value, "  ", LIZ2);
                            Context context = this.LIZJ;
                            float f = this.LJIILLIIL;
                            TuxTextView tuxTextView5 = this.LJIILJJIL;
                            if (tuxTextView5 != null) {
                                TuxTextView tuxTextView6 = this.LJIILIIL;
                                if (tuxTextView6 != null) {
                                    OSZ<Float, Float> LIZ3 = S2P.LIZ(context, f, tuxTextView5, tuxTextView6, LIZIZ, LJFF);
                                    TuxTextView tuxTextView7 = this.LJIILJJIL;
                                    if (tuxTextView7 != null) {
                                        tuxTextView7.LJJJ(LIZ3.getFirst().floatValue());
                                        TuxTextView tuxTextView8 = this.LJIILIIL;
                                        if (tuxTextView8 != null) {
                                            tuxTextView8.LJJJ(LIZ3.getFirst().floatValue());
                                            TuxTextView tuxTextView9 = this.LJIILJJIL;
                                            if (tuxTextView9 != null) {
                                                tuxTextView9.setText(LIZIZ);
                                                TuxTextView tuxTextView10 = this.LJIILIIL;
                                                if (tuxTextView10 != null) {
                                                    tuxTextView10.setText(LJFF);
                                                    TuxTextView tuxTextView11 = this.LJIILIIL;
                                                    if (tuxTextView11 != null) {
                                                        tuxTextView11.setEllipsize(TextUtils.TruncateAt.END);
                                                        ((AnimatorSet) this.LJIJ.getValue()).start();
                                                        this.LJIILL = this.LJIIIIZZ;
                                                        s31.LIZIZ = true;
                                                    } else {
                                                        o.LJIJI("lowStockTitle");
                                                        throw null;
                                                    }
                                                } else {
                                                    o.LJIJI("lowStockTitle");
                                                    throw null;
                                                }
                                            } else {
                                                o.LJIJI("lowStockCount");
                                                throw null;
                                            }
                                        } else {
                                            o.LJIJI("lowStockTitle");
                                            throw null;
                                        }
                                    } else {
                                        o.LJIJI("lowStockCount");
                                        throw null;
                                    }
                                } else {
                                    o.LJIJI("lowStockTitle");
                                    throw null;
                                }
                            } else {
                                o.LJIJI("lowStockCount");
                                throw null;
                            }
                        } else {
                            o.LJIJI("lowStockTitle");
                            throw null;
                        }
                    } else {
                        o.LJIJI("lowStockCount");
                        throw null;
                    }
                } else if (!AbstractC71456S2q.LIZLLL(this.LJIIIIZZ, this.LJIILL)) {
                    TuxTextView tuxTextView12 = this.LJIILJJIL;
                    if (tuxTextView12 != null) {
                        StringBuilder LIZ4 = X1D.LIZ();
                        LIZ4.append(j);
                        LIZ4.append((char) 160);
                        tuxTextView12.setText(X1D.LIZIZ(LIZ4));
                        ((AnimatorSet) this.LJIIZILJ.getValue()).start();
                        this.LJIILL = this.LJIIIIZZ;
                        s31.LIZIZ = true;
                    } else {
                        o.LJIJI("lowStockCount");
                        throw null;
                    }
                }
                s31.LIZ = true;
            }
        } else {
            FrameLayout frameLayout4 = this.LJIIJJI;
            if (frameLayout4 != null) {
                frameLayout4.setVisibility(8);
            }
            this.LJIIIIZZ = null;
            this.LJIILL = null;
        }
        return s31;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S3M(ViewGroup parentView, int i) {
        super(parentView, i);
        o.LJIIIZ(parentView, "parentView");
        this.LJIILLIIL = C32151Nz.LJIIZILJ(56);
        this.LJIIZILJ = C221108m2.LIZIZ(new AqS162S0100000_12(this, 1275));
        this.LJIJ = C221108m2.LIZIZ(new AqS162S0100000_12(this, 1277));
        this.LJIJI = C221108m2.LIZIZ(new AqS162S0100000_12(this, 1276));
    }
}
