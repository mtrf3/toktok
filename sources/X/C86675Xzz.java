package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS104S0300000_15;
import kotlin.jvm.internal.o;

/* renamed from: X.Xzz, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86675Xzz {
    public static final /* synthetic */ int LIZJ = 0;
    public final C62822Ol8 LIZ;
    public final C62822Ol8 LIZIZ;

    public final Y0S LIZIZ() {
        return (Y0S) this.LIZ.getValue();
    }

    public final Y1D LIZJ() {
        return (Y1D) this.LIZIZ.getValue();
    }

    public final void LIZ() {
        C86652Xzc c86652Xzc = LIZJ().LJ;
        ValueAnimator valueAnimator = c86652Xzc.LJLJI;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            valueAnimator.cancel();
        }
        c86652Xzc.LJLJJI = null;
        LIZIZ().LIZJ = null;
    }

    public final void LIZLLL(EnumC86683Y0h resetType) {
        View LIZ;
        ImageView imageView;
        View LIZ2;
        o.LJIIIZ(resetType, "resetType");
        Y1D LIZJ2 = LIZJ();
        LIZJ2.getClass();
        C86652Xzc c86652Xzc = LIZJ2.LJ;
        c86652Xzc.getClass();
        int i = C86676Y0a.LIZIZ[resetType.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i == 5) {
                            TextView textView = (TextView) c86652Xzc.LIZ(R.id.b5d);
                            if (textView != null) {
                                textView.setText("");
                            }
                            View LIZ3 = c86652Xzc.LIZ(R.id.b5d);
                            if (LIZ3 != null) {
                                LIZ3.setVisibility(8);
                            }
                            View LIZ4 = c86652Xzc.LIZ(R.id.b5e);
                            if (LIZ4 != null) {
                                LIZ4.setVisibility(8);
                            }
                            TuxTextView tuxTextView = c86652Xzc.LJLILLLLZI;
                            if (tuxTextView != null) {
                                tuxTextView.setVisibility(8);
                            }
                            ImageView imageView2 = (ImageView) c86652Xzc.LIZ(R.id.lk7);
                            if (imageView2 != null) {
                                imageView2.setVisibility(8);
                            }
                        }
                    } else {
                        TextView textView2 = (TextView) c86652Xzc.LIZ(R.id.b5d);
                        if (textView2 != null) {
                            textView2.setText("");
                        }
                        View LIZ5 = c86652Xzc.LIZ(R.id.b5e);
                        if (LIZ5 != null) {
                            LIZ5.setVisibility(8);
                        }
                        View LIZ6 = c86652Xzc.LIZ(R.id.b5d);
                        if (LIZ6 != null) {
                            LIZ6.setVisibility(8);
                        }
                        TuxTextView tuxTextView2 = c86652Xzc.LJLILLLLZI;
                        if (tuxTextView2 != null) {
                            tuxTextView2.setVisibility(8);
                        }
                        ImageView imageView3 = (ImageView) c86652Xzc.LIZ(R.id.lk7);
                        if (imageView3 != null) {
                            imageView3.setVisibility(8);
                        }
                    }
                } else {
                    View LIZ7 = c86652Xzc.LIZ(R.id.b5e);
                    if (LIZ7 != null) {
                        LIZ7.setVisibility(8);
                    }
                    View LIZ8 = c86652Xzc.LIZ(R.id.b5d);
                    if (LIZ8 != null) {
                        LIZ8.setVisibility(8);
                    }
                    TuxTextView tuxTextView3 = c86652Xzc.LJLILLLLZI;
                    if (tuxTextView3 != null) {
                        tuxTextView3.setVisibility(8);
                    }
                    ImageView imageView4 = (ImageView) c86652Xzc.LIZ(R.id.bgr);
                    if (imageView4 != null) {
                        imageView4.setVisibility(8);
                    }
                    ImageView imageView5 = (ImageView) c86652Xzc.LIZ(R.id.lk7);
                    if (imageView5 != null) {
                        imageView5.setVisibility(8);
                    }
                }
            } else {
                if (C52280KfU.LIZ() && (LIZ2 = c86652Xzc.LIZ(R.id.e1t)) != null) {
                    LIZ2.setVisibility(8);
                }
                View LIZ9 = c86652Xzc.LIZ(R.id.b5f);
                if (LIZ9 != null) {
                    LIZ9.setVisibility(8);
                }
                View LIZ10 = c86652Xzc.LIZ(R.id.b5e);
                if (LIZ10 != null) {
                    LIZ10.setVisibility(8);
                }
                View LIZ11 = c86652Xzc.LIZ(R.id.b5d);
                if (LIZ11 != null) {
                    LIZ11.setVisibility(8);
                }
                TuxTextView tuxTextView4 = c86652Xzc.LJLILLLLZI;
                if (tuxTextView4 != null) {
                    tuxTextView4.setVisibility(8);
                }
                ImageView imageView6 = (ImageView) c86652Xzc.LIZ(R.id.bgr);
                if (imageView6 != null) {
                    imageView6.setVisibility(8);
                }
                ImageView imageView7 = (ImageView) c86652Xzc.LIZ(R.id.lk7);
                if (imageView7 != null) {
                    imageView7.setVisibility(8);
                }
            }
        } else {
            if (C53379KxD.LIZ() && (imageView = (ImageView) c86652Xzc.LIZ(R.id.bgr)) != null) {
                imageView.setVisibility(8);
            }
            if (C52280KfU.LIZ() && (LIZ = c86652Xzc.LIZ(R.id.e1t)) != null) {
                LIZ.setVisibility(8);
            }
            View LIZ12 = c86652Xzc.LIZ(R.id.b5f);
            if (LIZ12 != null) {
                LIZ12.setVisibility(8);
            }
            View LIZ13 = c86652Xzc.LIZ(R.id.b5e);
            if (LIZ13 != null) {
                LIZ13.setVisibility(8);
            }
            View LIZ14 = c86652Xzc.LIZ(R.id.b5d);
            if (LIZ14 != null) {
                LIZ14.setVisibility(8);
            }
            TuxTextView tuxTextView5 = c86652Xzc.LJLILLLLZI;
            if (tuxTextView5 != null) {
                tuxTextView5.setVisibility(8);
            }
            ImageView imageView8 = (ImageView) c86652Xzc.LIZ(R.id.bgr);
            if (imageView8 != null) {
                imageView8.setVisibility(8);
            }
            ImageView imageView9 = (ImageView) c86652Xzc.LIZ(R.id.lk7);
            if (imageView9 != null) {
                imageView9.setVisibility(8);
            }
        }
        Y00 y00 = LIZIZ().LIZIZ;
        y00.LJLLLL = false;
        y00.LJLLL = null;
        y00.setToastStatus(X6C.NONE);
        y00.setText("");
        y00.setState(null);
        y00.LJLLI = null;
        y00.LJLLILLLL = 0L;
        y00.LIZ(R.id.c4n).setVisibility(8);
        ((ImageView) y00.LIZ(R.id.b4m)).setVisibility(8);
    }

    public final void LJFF(EnumC86698Y0w style) {
        o.LJIIIZ(style, "style");
        Y1D LIZJ2 = LIZJ();
        LIZJ2.getClass();
        LIZJ2.LJ.setStyle(style);
    }

    public final void LJI(EnumC86689Y0n captionDisplayState) {
        o.LJIIIZ(captionDisplayState, "captionDisplayState");
        if (!C52248Key.LIZ()) {
            Y0S LIZIZ = LIZIZ();
            LIZIZ.getClass();
            LIZIZ.LIZIZ.setState(captionDisplayState);
        } else if (LIZIZ().LJ) {
            Y0S LIZIZ2 = LIZIZ();
            LIZIZ2.getClass();
            LIZIZ2.LIZIZ.setState(captionDisplayState);
        }
        Y1D LIZJ2 = LIZJ();
        LIZJ2.getClass();
        LIZJ2.LJ.LIZJ(captionDisplayState, LIZJ2.LIZ, LIZJ2.LIZIZ, LIZJ2.LIZJ);
    }

    public final void LJII(String str) {
        if (!C52248Key.LIZ()) {
            LIZIZ().LIZIZ.setText(str);
        } else if (LIZIZ().LJ) {
            LIZIZ().LIZIZ.setText(str);
        }
        LIZJ().LJ.setText(str);
    }

    public final void LJ(boolean z, EnumC86689Y0n enumC86689Y0n) {
        Y1D LIZJ2 = LIZJ();
        LIZJ2.getClass();
        if (L2D.LIZ()) {
            LIZJ2.LJ.setIsLoading(z);
            if (enumC86689Y0n != null) {
                LIZJ2.LJ.LIZJ(enumC86689Y0n, LIZJ2.LIZ, LIZJ2.LIZIZ, LIZJ2.LIZJ);
            }
        }
    }

    public C86675Xzz(Context context, boolean z, boolean z2, C86652Xzc c86652Xzc, Y00 y00, C86673Xzx c86673Xzx, Y03 y03) {
        this.LIZ = C221108m2.LIZIZ(new AqS104S0300000_15(context, y03, y00, 8));
        this.LIZIZ = C221108m2.LIZIZ(new Y1O(z, z2, c86673Xzx, c86652Xzc));
    }
}
