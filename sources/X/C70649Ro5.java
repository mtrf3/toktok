package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.android.livesdk.model.message.ext.GImage;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Ro5, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70649Ro5 extends LinearLayout {
    public int LJLIL;
    public int LJLILLLLZI;
    public java.util.Set<C70651Ro7> LJLJI;
    public float LJLJJI;
    public final java.util.Map<Integer, View> LJLJJL;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C70649Ro5(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        o.LJIIIZ(context, "context");
    }

    public final View LIZ(int i) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJJL;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final void setTagShow(boolean z) {
    }

    public final java.util.Set<C70651Ro7> getTagLayoutParams() {
        return this.LJLJI;
    }

    public final float getTagRadius() {
        return this.LJLJJI;
    }

    public final int getTextFont() {
        return this.LJLILLLLZI;
    }

    public final int getTextMaxLine() {
        return this.LJLIL;
    }

    public static boolean LIZJ(RUP rup) {
        RUH ruh;
        String str;
        Integer num;
        if (rup == null) {
            return false;
        }
        RUH ruh2 = rup.LIZ;
        if ((ruh2 == null || (num = ruh2.LIZ) == null || num.intValue() != 0) && ((ruh = rup.LIZJ) == null || (str = ruh.LIZIZ) == null || str.length() == 0)) {
            return false;
        }
        return true;
    }

    public static final GradientDrawable LJFF(float f) {
        int LIZ = C278817o.LIZ(f);
        int LIZIZ = C7MY.LIZIZ(2);
        int parseColor = ColorProtector.parseColor("#57FE2C55");
        int parseColor2 = ColorProtector.parseColor("#FFFFFF");
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(parseColor2);
        gradientDrawable.setCornerRadius(LIZIZ);
        gradientDrawable.setStroke(LIZ, parseColor);
        return gradientDrawable;
    }

    private final void setStyle(Integer num) {
        int i;
        if (num != null) {
            num.intValue();
            int intValue = num.intValue();
            C53613L2j c53613L2j = new C53613L2j();
            if (intValue != 0) {
                if (intValue != 17 && intValue != 14) {
                    if (intValue == 15) {
                        c53613L2j.LJLJI = C7MY.LIZIZ(2);
                    }
                } else {
                    c53613L2j.LJLJJL = C7MY.LIZIZ(1);
                    c53613L2j.LJLJJLL = C7MY.LIZIZ(1);
                    c53613L2j.LJLIL = C7MY.LIZIZ(3);
                }
            } else {
                c53613L2j.LJLILLLLZI = 0;
                c53613L2j.LJLJJI = 0;
                c53613L2j.LJLJJL = 0;
                c53613L2j.LJLJJLL = 0;
            }
            View tag_ic = LIZ(R.id.l00);
            o.LJIIIIZZ(tag_ic, "tag_ic");
            if (tag_ic.getVisibility() == 0) {
                i = c53613L2j.LJLIL;
            } else {
                i = c53613L2j.LJLILLLLZI;
            }
            C26338AVi.LJIIIZ(this, Integer.valueOf(i), Integer.valueOf(c53613L2j.LJLJJL), Integer.valueOf(c53613L2j.LJLJJI), Integer.valueOf(c53613L2j.LJLJJLL), 16);
            View tag_ic2 = LIZ(R.id.l00);
            o.LJIIIIZZ(tag_ic2, "tag_ic");
            if (tag_ic2.getVisibility() == 0) {
                C45804HyK.LJJLIIIIJ(c53613L2j.LJLJI, LIZ(R.id.l0f));
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0032, code lost:
    
        if (r3 != null) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void setTagBg(X.RUH r3) {
        /*
            r2 = this;
            r1 = 0
            if (r3 == 0) goto L17
            com.bytedance.android.livesdk.model.message.ext.GImage r0 = r3.LIZJ
            if (r0 == 0) goto L32
            com.bytedance.android.livesdk.model.message.ext.GImage r0 = r3.LIZJ
            java.util.List r0 = r0.getUrls()
            if (r0 == 0) goto L15
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L1f
        L15:
            java.lang.Integer r1 = r3.LIZ
        L17:
            android.graphics.drawable.Drawable r0 = LJ(r2, r1)
            r2.setBackground(r0)
        L1e:
            return
        L1f:
            com.bytedance.android.livesdk.model.message.ext.GImage r0 = r3.LIZJ
            X.2cu r0 = X.C69889Rbp.LIZJ(r0)
            X.W5F r1 = X.W5U.LJIIIZ(r0)
            X.Ro6 r0 = new X.Ro6
            r0.<init>(r2, r3)
            r1.LJIIIZ(r0)
            goto L1e
        L32:
            if (r3 == 0) goto L17
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70649Ro5.setTagBg(X.RUH):void");
    }

    private final void setTagIcon(RUH ruh) {
        boolean z;
        Integer num;
        if (ruh == null || (num = ruh.LIZ) == null || num.intValue() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            GImage gImage = ruh.LIZJ;
            if (gImage != null) {
                W5F LJIIIZ = W5U.LJIIIZ(C69889Rbp.LIZJ(gImage));
                LJIIIZ.LJJIIJ = (SmartImageView) LIZ(R.id.l00);
                C16880lQ.LLJJJ(LJIIIZ);
                LIZ(R.id.l00).setPadding(C7MY.LIZIZ(3), C7MY.LIZIZ(2), 0, O6R.LJJIIZ(C32151Nz.LJIIZILJ(2)));
                ((ImageView) LIZ(R.id.l00)).setVisibility(0);
                return;
            }
            RU7 ru7 = ruh.LIZLLL;
            if (ru7 != null && ru7.LIZJ != null) {
                ViewGroup.LayoutParams layoutParams = LIZ(R.id.l00).getLayoutParams();
                RU7 ru72 = ruh.LIZLLL;
                layoutParams.width = ru72.LIZ;
                layoutParams.height = ru72.LIZIZ;
                LIZ(R.id.l00).setLayoutParams(layoutParams);
                ((W5G) LIZ(R.id.l00)).setImageResource(ruh.LIZLLL.LIZJ.intValue());
                ((ImageView) LIZ(R.id.l00)).setVisibility(0);
                return;
            }
            ((ImageView) LIZ(R.id.l00)).setVisibility(8);
            return;
        }
        ((ImageView) LIZ(R.id.l00)).setVisibility(8);
    }

    private final void setTagIconV1(RUH ruh) {
        boolean z;
        Integer num;
        if (ruh == null || (num = ruh.LIZ) == null || num.intValue() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            GImage gImage = ruh.LIZJ;
            if (gImage != null) {
                W5F LJIIIZ = W5U.LJIIIZ(C69889Rbp.LIZJ(gImage));
                LJIIIZ.LJJIIJ = (SmartImageView) LIZ(R.id.l00);
                int LIZIZ = C7MY.LIZIZ(12);
                int LIZIZ2 = C7MY.LIZIZ(12);
                LJIIIZ.LJII = LIZIZ;
                LJIIIZ.LJIIIIZZ = LIZIZ2;
                C16880lQ.LLJJJ(LJIIIZ);
                ((ImageView) LIZ(R.id.l00)).setVisibility(0);
                return;
            }
            RU7 ru7 = ruh.LIZLLL;
            if (ru7 != null && ru7.LIZJ != null) {
                ViewGroup.LayoutParams layoutParams = LIZ(R.id.l00).getLayoutParams();
                RU7 ru72 = ruh.LIZLLL;
                layoutParams.width = ru72.LIZ;
                layoutParams.height = ru72.LIZIZ;
                LIZ(R.id.l00).setLayoutParams(layoutParams);
                ((W5G) LIZ(R.id.l00)).setImageResource(ruh.LIZLLL.LIZJ.intValue());
                ((ImageView) LIZ(R.id.l00)).setVisibility(0);
                return;
            }
            ((ImageView) LIZ(R.id.l00)).setVisibility(8);
            return;
        }
        ((ImageView) LIZ(R.id.l00)).setVisibility(8);
    }

    private final void setTagText(RUH ruh) {
        String str;
        boolean z;
        Integer num;
        Integer LJI;
        String str2 = null;
        if (ruh != null) {
            str = ruh.LIZIZ;
        } else {
            str = null;
        }
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            ((TuxTextView) LIZ(R.id.l0f)).setTuxFont(this.LJLILLLLZI);
            TextView tag_text = (TextView) LIZ(R.id.l0f);
            o.LJIIIIZZ(tag_text, "tag_text");
            int i = this.LJLIL;
            if (tag_text.getMaxLines() != i) {
                tag_text.setMaxLines(i);
            }
            C45804HyK.LJJLIIIIJ(0, LIZ(R.id.l0f));
            if (ruh != null) {
                num = ruh.LIZ;
            } else {
                num = null;
            }
            if (num == null || num.intValue() != 1) {
                if (num == null || num.intValue() != 2) {
                    if (num != null) {
                        if (num.intValue() == 3) {
                            Context context = getContext();
                            o.LJIIIIZZ(context, "context");
                            LJI = Integer.valueOf(AnonymousClass636.LJIIIIZZ(R.attr.ha, context));
                        } else if (num.intValue() == 4) {
                            Context context2 = getContext();
                            o.LJIIIIZZ(context2, "context");
                            LJI = C79045V0n.LJI(R.attr.gu, context2);
                        } else if (num.intValue() == 7) {
                            Context context3 = getContext();
                            o.LJIIIIZZ(context3, "context");
                            LJI = Integer.valueOf(AnonymousClass636.LJIIIIZZ(R.attr.ha, context3));
                        }
                    }
                    if (num != null) {
                        if (num.intValue() == 6) {
                            Context context4 = getContext();
                            o.LJIIIIZZ(context4, "context");
                            LJI = C79045V0n.LJI(R.attr.dj, context4);
                        } else if (num.intValue() == 5) {
                            Context context5 = getContext();
                            o.LJIIIIZZ(context5, "context");
                            LJI = C79045V0n.LJI(R.attr.eb, context5);
                        } else if (num.intValue() == 8) {
                            Context context6 = getContext();
                            o.LJIIIIZZ(context6, "context");
                            LJI = C79045V0n.LJI(R.attr.iu, context6);
                        } else if (num.intValue() == 9) {
                            Context context7 = getContext();
                            o.LJIIIIZZ(context7, "context");
                            LJI = C79045V0n.LJI(R.attr.ha, context7);
                        } else if (num.intValue() == 10) {
                            Context context8 = getContext();
                            o.LJIIIIZZ(context8, "context");
                            LJI = C79045V0n.LJI(R.attr.go, context8);
                        } else if (num.intValue() == 11) {
                            Context context9 = getContext();
                            o.LJIIIIZZ(context9, "context");
                            LJI = C79045V0n.LJI(R.attr.gx, context9);
                        }
                    }
                    Context context10 = getContext();
                    o.LJIIIIZZ(context10, "context");
                    LJI = C79045V0n.LJI(R.attr.dj, context10);
                } else {
                    Context context11 = getContext();
                    o.LJIIIIZZ(context11, "context");
                    LJI = C79045V0n.LJI(R.attr.eb, context11);
                }
            } else {
                Context context12 = getContext();
                o.LJIIIIZZ(context12, "context");
                LJI = C79045V0n.LJI(R.attr.gv, context12);
            }
            if (LJI != null) {
                ((TextView) LIZ(R.id.l0f)).setTextColor(LJI.intValue());
            }
            TextView textView = (TextView) LIZ(R.id.l0f);
            if (ruh != null) {
                str2 = ruh.LIZIZ;
            }
            textView.setText(str2);
            LIZ(R.id.l0f).setVisibility(0);
            return;
        }
        LIZ(R.id.l0f).setVisibility(8);
    }

    public final float LIZIZ(float f) {
        return (f * getContext().getResources().getDisplayMetrics().density) + 0.5f;
    }

    public final void setTagLayoutParams(java.util.Set<C70651Ro7> set) {
        this.LJLJI = set;
    }

    public final void setTagRadius(float f) {
        this.LJLJJI = f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:86:0x01ce, code lost:
    
        if (r24 != null) goto L77;
     */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void setTagUi(X.RUP r24) {
        /*
            Method dump skipped, instructions count: 482
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70649Ro5.setTagUi(X.RUP):void");
    }

    public final void setTagUiV1(RUP rup) {
        RUH ruh;
        RUH ruh2;
        RUH ruh3;
        RUH ruh4;
        if (LIZJ(rup)) {
            Integer num = null;
            if (rup != null) {
                ruh = rup.LIZ;
            } else {
                ruh = null;
            }
            setTagIconV1(ruh);
            if (rup != null) {
                ruh2 = rup.LIZJ;
            } else {
                ruh2 = null;
            }
            setTagText(ruh2);
            if (rup != null) {
                ruh3 = rup.LIZIZ;
            } else {
                ruh3 = null;
            }
            setTagBg(ruh3);
            if (rup != null && (ruh4 = rup.LIZIZ) != null) {
                num = ruh4.LIZ;
            }
            setStyle(num);
            setVisibility(0);
            return;
        }
        setVisibility(8);
    }

    public final void setTextFont(int i) {
        this.LJLILLLLZI = i;
    }

    public final void setTextMaxLine(int i) {
        this.LJLIL = i;
    }

    public static final Drawable LJ(C70649Ro5 c70649Ro5, Integer num) {
        if (num != null) {
            if (num.intValue() == 2) {
                return C04270Et.LIZIZ(c70649Ro5.getContext(), R.drawable.ao_);
            }
            if (num.intValue() == 1) {
                return C04270Et.LIZIZ(c70649Ro5.getContext(), R.drawable.ao9);
            }
            if (num.intValue() == 3) {
                return LJFF(0.5f);
            }
        }
        if (num != null) {
            if (num.intValue() == 4) {
                return LJFF(1.0f);
            }
            if (num.intValue() == 5) {
                return C04270Et.LIZIZ(c70649Ro5.getContext(), R.drawable.aod);
            }
            if (num.intValue() == 9) {
                return C04270Et.LIZIZ(c70649Ro5.getContext(), R.drawable.aob);
            }
            if (num.intValue() == 10) {
                return C04270Et.LIZIZ(c70649Ro5.getContext(), R.drawable.aoc);
            }
            if (num != null) {
                if (num.intValue() == 11) {
                    return C04270Et.LIZIZ(c70649Ro5.getContext(), R.drawable.aoa);
                }
                if (num.intValue() == 7) {
                    return C04270Et.LIZIZ(c70649Ro5.getContext(), R.drawable.aoa);
                }
                if (num.intValue() == 12) {
                    return C04270Et.LIZIZ(c70649Ro5.getContext(), R.drawable.aol);
                }
            }
        }
        if (num != null) {
            if (num.intValue() == 13) {
                C110614Vt c110614Vt = new C110614Vt();
                c110614Vt.LIZJ = C61328O5c.LIZJ(4);
                c110614Vt.LIZIZ = Integer.valueOf(R.attr.j_);
                c110614Vt.LIZLLL = KNV.LIZIZ(0.5d);
                c110614Vt.LJFF = Integer.valueOf(R.attr.jc);
                Context context = c70649Ro5.getContext();
                o.LJIIIIZZ(context, "context");
                return c110614Vt.LIZ(context);
            }
            if (num.intValue() == 14) {
                C110614Vt c110614Vt2 = new C110614Vt();
                c110614Vt2.LIZJ = C61328O5c.LIZJ(4);
                c110614Vt2.LIZIZ = Integer.valueOf(R.attr.jb);
                Context context2 = c70649Ro5.getContext();
                o.LJIIIIZZ(context2, "context");
                return c110614Vt2.LIZ(context2);
            }
            if (num.intValue() == 15) {
                C110614Vt c110614Vt3 = new C110614Vt();
                c110614Vt3.LIZJ = C61328O5c.LIZJ(4);
                c110614Vt3.LIZIZ = Integer.valueOf(R.attr.ha);
                Context context3 = c70649Ro5.getContext();
                o.LJIIIIZZ(context3, "context");
                return c110614Vt3.LIZ(context3);
            }
            if (num.intValue() == 16) {
                C110614Vt c110614Vt4 = new C110614Vt();
                c110614Vt4.LIZJ = C61328O5c.LIZJ(4);
                c110614Vt4.LIZIZ = Integer.valueOf(R.attr.jd);
                c110614Vt4.LIZLLL = KNV.LIZIZ(0.5d);
                c110614Vt4.LJFF = Integer.valueOf(R.attr.jf);
                Context context4 = c70649Ro5.getContext();
                o.LJIIIIZZ(context4, "context");
                return c110614Vt4.LIZ(context4);
            }
            if (num.intValue() == 17) {
                C110614Vt c110614Vt5 = new C110614Vt();
                c110614Vt5.LIZJ = C61328O5c.LIZJ(4);
                c110614Vt5.LIZIZ = Integer.valueOf(R.attr.h8);
                Context context5 = c70649Ro5.getContext();
                o.LJIIIIZZ(context5, "context");
                return c110614Vt5.LIZ(context5);
            }
            if (num.intValue() == 18) {
                C110614Vt c110614Vt6 = new C110614Vt();
                c110614Vt6.LIZJ = C61328O5c.LIZJ(4);
                c110614Vt6.LIZIZ = Integer.valueOf(R.attr.jk);
                Context context6 = c70649Ro5.getContext();
                o.LJIIIIZZ(context6, "context");
                return c110614Vt6.LIZ(context6);
            }
        }
        return null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C70649Ro5(android.content.Context r4, android.util.AttributeSet r5, int r6) {
        /*
            r3 = this;
            r0 = r6 & 2
            if (r0 == 0) goto L5
            r5 = 0
        L5:
            java.lang.String r0 = "context"
            java.util.LinkedHashMap r0 = X.C62850Ola.LJFF(r4, r0)
            r3.LJLJJL = r0
            r0 = 0
            r3.<init>(r4, r5, r0)
            android.view.LayoutInflater r2 = X.C16880lQ.LLZIL(r4)
            r1 = 2131560230(0x7f0d0726, float:1.8745826E38)
            r0 = 1
            X.C16880lQ.LLLLIILL(r2, r1, r3, r0)
            r3.LJLIL = r0
            r0 = 92
            r3.LJLILLLLZI = r0
            r0 = 1073741824(0x40000000, float:2.0)
            float r0 = r3.LIZIZ(r0)
            r3.LJLJJI = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70649Ro5.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public static Bitmap LIZLLL(float f, Bitmap bitmap, C70649Ro5 c70649Ro5) {
        if (bitmap == null) {
            return null;
        }
        Bitmap createBitmap = Bitmap.createBitmap(c70649Ro5.getWidth(), c70649Ro5.getHeight(), Bitmap.Config.ARGB_8888);
        Paint LIZIZ = C6D8.LIZIZ(true);
        RectF rectF = new RectF(new Rect(0, 0, c70649Ro5.getWidth(), c70649Ro5.getHeight()));
        Canvas canvas = new Canvas(createBitmap);
        canvas.drawARGB(0, 0, 0, 0);
        canvas.drawRoundRect(rectF, f, f, LIZIZ);
        int width = bitmap.getWidth();
        float height = c70649Ro5.getHeight() / bitmap.getHeight();
        Matrix matrix = new Matrix();
        matrix.postScale(c70649Ro5.getWidth() / width, height);
        canvas.drawBitmap(bitmap, matrix, LIZIZ);
        return createBitmap;
    }
}
