package X;

import Y.ACListenerS35S0100000_15;
import Y.AUListenerS102S0100000_15;
import Y.IDAListenerS82S0100000_15;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicRtcMixBitrateSetting;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes16.dex */
public final class Y00 extends FrameLayout {
    public ViewGroup LJLIL;
    public View LJLILLLLZI;
    public Y1J LJLJI;
    public boolean LJLJJI;
    public EnumC86689Y0n LJLJJL;
    public X6C LJLJJLL;
    public ValueAnimator LJLJL;
    public CharSequence LJLJLJ;
    public Y07 LJLJLLL;
    public boolean LJLL;
    public Long LJLLI;
    public long LJLLILLLL;
    public float LJLLJ;
    public Integer LJLLL;
    public boolean LJLLLL;
    public final java.util.Map<Integer, View> LJLLLLLL;

    public final View LIZ(int i) {
        java.util.Map<Integer, View> map = this.LJLLLLLL;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0094, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x009a, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00b6, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L41;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ() {
        /*
            r13 = this;
            android.view.View r8 = r13.LJLILLLLZI
            r3 = -1
            r2 = 1
            r12 = 0
            if (r8 == 0) goto Lcb
            android.view.ViewGroup r7 = r13.LJLIL
            if (r7 == 0) goto Lb8
            r5 = 2131365311(0x7f0a0dbf, float:1.8350484E38)
            android.view.View r0 = r13.LIZ(r5)
            android.view.ViewGroup$LayoutParams r4 = r0.getLayoutParams()
            java.lang.String r0 = "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams"
            kotlin.jvm.internal.o.LJII(r4, r0)
            X.05p r4 = (X.C018905p) r4
            X.Y07 r0 = r13.LJLJLLL
            java.util.List<java.lang.Float> r1 = r0.LJIJ
            java.util.ArrayList r9 = new java.util.ArrayList
            r0 = 10
            int r0 = X.C32I.LJJL(r1, r0)
            r9.<init>(r0)
            java.util.Iterator r11 = r1.iterator()
            r10 = 0
        L31:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L6e
            java.lang.Object r0 = r11.next()
            int r6 = r10 + 1
            if (r10 < 0) goto L6a
            java.lang.Number r0 = (java.lang.Number) r0
            float r1 = r0.floatValue()
            java.lang.Float r0 = r13.LIZLLL(r1, r7, r8)
            if (r0 == 0) goto L68
            r0.floatValue()
            java.lang.Integer r0 = r13.LJLLL
            if (r0 != 0) goto L61
            java.lang.Integer r0 = java.lang.Integer.valueOf(r10)
            r13.LJLLL = r0
            X.Y1J r0 = r13.LJLJI
            if (r0 == 0) goto L5f
            r0.LJI(r1, r10)
        L5f:
            r13.LJLLLL = r2
        L61:
            X.UCe r0 = X.C76800UCe.LIZ
        L63:
            r9.add(r0)
            r10 = r6
            goto L31
        L68:
            r0 = r12
            goto L63
        L6a:
            X.C47261Igj.LJJJJJ()
            throw r12
        L6e:
            java.lang.Integer r0 = r13.LJLLL
            r6 = 1065353216(0x3f800000, float:1.0)
            if (r0 == 0) goto L9c
            int r1 = r0.intValue()
            X.Y07 r0 = r13.LJLJLLL
            java.util.List<java.lang.Float> r0 = r0.LJIJ
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r0, r1)
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
            java.lang.Float r0 = r13.LIZLLL(r0, r7, r8)
            if (r0 == 0) goto L96
            float r0 = r0.floatValue()
            r4.verticalBias = r0
            X.UCe r0 = X.C76800UCe.LIZ
            if (r0 != 0) goto L98
        L96:
            r4.verticalBias = r6
        L98:
            X.UCe r0 = X.C76800UCe.LIZ
            if (r0 != 0) goto Lad
        L9c:
            r4.verticalBias = r6
            boolean r0 = r13.LJLLLL
            if (r0 != 0) goto Lad
            X.Y1J r1 = r13.LJLJI
            if (r1 == 0) goto Lab
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r1.LJI(r0, r3)
        Lab:
            r13.LJLLLL = r2
        Lad:
            android.view.View r0 = r13.LIZ(r5)
            r0.setLayoutParams(r4)
            X.UCe r0 = X.C76800UCe.LIZ
            if (r0 != 0) goto Lc7
        Lb8:
            boolean r0 = r13.LJLLLL
            if (r0 != 0) goto Lc7
            X.Y1J r1 = r13.LJLJI
            if (r1 == 0) goto Lc5
            r0 = -1069547520(0xffffffffc0400000, float:-3.0)
            r1.LJI(r0, r3)
        Lc5:
            r13.LJLLLL = r2
        Lc7:
            X.UCe r0 = X.C76800UCe.LIZ
            if (r0 != 0) goto Lda
        Lcb:
            boolean r0 = r13.LJLLLL
            if (r0 != 0) goto Lda
            X.Y1J r1 = r13.LJLJI
            if (r1 == 0) goto Ld8
            r0 = -1073741824(0xffffffffc0000000, float:-2.0)
            r1.LJI(r0, r3)
        Ld8:
            r13.LJLLLL = r2
        Lda:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Y00.LIZIZ():void");
    }

    public final ConstraintLayout getToolTipTarget() {
        return (ConstraintLayout) LIZ(R.id.c4n);
    }

    public final float getCaptionControlIconAlpha() {
        return this.LJLLJ;
    }

    public final Y1J getDelegate() {
        return this.LJLJI;
    }

    public final Y07 getModel() {
        return this.LJLJLLL;
    }

    public final EnumC86689Y0n getState() {
        return this.LJLJJL;
    }

    public final CharSequence getText() {
        return this.LJLJLJ;
    }

    public final ValueAnimator getValueAnimator() {
        return this.LJLJL;
    }

    public final ViewGroup getVideoContainer() {
        return this.LJLIL;
    }

    public final View getVideoView() {
        return this.LJLILLLLZI;
    }

    private final void setMenuClickable(boolean z) {
        this.LJLL = z;
        setModel(this.LJLJLLL);
        setState(this.LJLJJL);
    }

    public final void LIZJ(boolean z) {
        setMenuClickable(z);
    }

    public final void setCaptionControlIconAlpha(float f) {
        this.LJLLJ = f;
        setState(this.LJLJJL);
    }

    public final void setDelegate(Y1J y1j) {
        this.LJLJI = y1j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00eb, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void setModel(X.Y07 r11) {
        /*
            Method dump skipped, instructions count: 304
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Y00.setModel(X.Y07):void");
    }

    public final void setState(EnumC86689Y0n enumC86689Y0n) {
        int i;
        int i2;
        String str;
        String str2;
        String charSequence;
        String charSequence2;
        String charSequence3;
        int i3;
        Y1J y1j;
        Y1J y1j2;
        if (enumC86689Y0n == null) {
            i = -1;
        } else {
            i = Y12.LIZ[enumC86689Y0n.ordinal()];
        }
        int i4 = 0;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    LIZ(R.id.c4n).setVisibility(8);
                    ((ImageView) LIZ(R.id.b4m)).setVisibility(8);
                } else {
                    if (C52280KfU.LIZ() && this.LJLJJI) {
                        return;
                    }
                    if (this.LJLJJL == EnumC86689Y0n.EXPANDED) {
                        setToastStatus(X6C.HIDING);
                    }
                    if (this.LJLJJLL == X6C.HIDING) {
                        LIZ(R.id.c4n).setVisibility(0);
                        TextView textView = (TextView) LIZ(R.id.c4m);
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append('[');
                        LIZ.append(getResources().getString(R.string.dc8));
                        LIZ.append(']');
                        textView.setText(X1D.LIZIZ(LIZ));
                        LIZ(R.id.lk8).setVisibility(8);
                    } else {
                        LIZ(R.id.c4n).setVisibility(8);
                    }
                    ((ImageView) LIZ(R.id.b4m)).setVisibility(8);
                }
            } else {
                if (C52280KfU.LIZ() && this.LJLJJI) {
                    return;
                }
                if (this.LJLJJL == EnumC86689Y0n.EXPANDED) {
                    setToastStatus(X6C.HIDING);
                }
                if (this.LJLJJLL == X6C.HIDING) {
                    LIZ(R.id.c4n).setVisibility(0);
                    TextView textView2 = (TextView) LIZ(R.id.c4m);
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append('[');
                    LIZ2.append(getResources().getString(R.string.dc8));
                    LIZ2.append(']');
                    textView2.setText(X1D.LIZIZ(LIZ2));
                    LIZ(R.id.lk8).setVisibility(8);
                } else {
                    LIZ(R.id.c4n).setVisibility(8);
                }
                ImageView imageView = (ImageView) LIZ(R.id.b4m);
                if (!this.LJLJLLL.LJII) {
                    i4 = 8;
                }
                imageView.setVisibility(i4);
                ((TuxIconView) LIZ(R.id.b4m)).setIconRes(R.raw.icon_closed_caption);
                ((TuxIconView) LIZ(R.id.b4m)).setTintColor(-1);
                LIZ(R.id.b4m).setAlpha(this.LJLLJ);
            }
        } else {
            EnumC86689Y0n enumC86689Y0n2 = this.LJLJJL;
            String str3 = null;
            if (enumC86689Y0n2 == EnumC86689Y0n.HIDDEN || enumC86689Y0n2 == EnumC86689Y0n.COLLAPSED) {
                this.LJLLI = null;
                this.LJLLILLLL = 0L;
                setToastStatus(X6C.EXPANDING);
            }
            View LIZ3 = LIZ(R.id.c4n);
            if (this.LJLJJLL == X6C.EXPANDING) {
                TextView textView3 = (TextView) LIZ(R.id.c4m);
                StringBuilder LIZ4 = X1D.LIZ();
                LIZ4.append('[');
                LIZ4.append(getResources().getString(R.string.dc9));
                LIZ4.append(']');
                textView3.setText(X1D.LIZIZ(LIZ4));
                LIZ(R.id.lk8).setVisibility(8);
            } else {
                CharSequence charSequence4 = this.LJLJLJ;
                if (charSequence4 != null && charSequence4.length() > 0) {
                    if (this.LJLJLLL.LJI == EnumC71056Rue.TEXT) {
                        if (this.LJLLILLLL <= 500) {
                            LIZ(R.id.lk8).setVisibility(0);
                            TextView textView4 = (TextView) LIZ(R.id.lk8);
                            StringBuilder LIZ5 = X1D.LIZ();
                            LIZ5.append(" [");
                            LIZ5.append(getResources().getString(R.string.dc7));
                            LIZ5.append("] ");
                            textView4.setText(X1D.LIZIZ(LIZ5));
                        } else {
                            String charSequence5 = s.LJZI(((AppCompatTextView) LIZ(R.id.c4m)).getText().toString()).toString();
                            CharSequence charSequence6 = this.LJLJLJ;
                            if (charSequence6 != null && (charSequence3 = charSequence6.toString()) != null) {
                                str = s.LJZI(charSequence3).toString();
                            } else {
                                str = null;
                            }
                            if (!o.LJ(charSequence5, str)) {
                                LIZ(R.id.lk8).setVisibility(8);
                                StringBuilder LIZ6 = X1D.LIZ();
                                LIZ6.append("GONE: Has new text- ");
                                LIZ6.append(s.LJZI(((AppCompatTextView) LIZ(R.id.c4m)).getText().toString()).toString());
                                LIZ6.append(' ');
                                CharSequence charSequence7 = this.LJLJLJ;
                                if (charSequence7 != null && (charSequence2 = charSequence7.toString()) != null) {
                                    str2 = s.LJZI(charSequence2).toString();
                                } else {
                                    str2 = null;
                                }
                                LIZ6.append(str2);
                                LIZ6.append(' ');
                                String charSequence8 = s.LJZI(((AppCompatTextView) LIZ(R.id.c4m)).getText().toString()).toString();
                                CharSequence charSequence9 = this.LJLJLJ;
                                if (charSequence9 != null && (charSequence = charSequence9.toString()) != null) {
                                    str3 = s.LJZI(charSequence).toString();
                                }
                                LIZ6.append(!o.LJ(charSequence8, str3));
                                LIZ6.append(" =[");
                                LIZ6.append(this.LJLLILLLL);
                                LIZ6.append(']');
                                X1D.LIZIZ(LIZ6);
                            }
                        }
                    } else {
                        LIZ(R.id.lk8).setVisibility(8);
                    }
                    ((TextView) LIZ(R.id.c4m)).setText(this.LJLJLJ);
                } else {
                    LIZ(R.id.lk8).setVisibility(8);
                    i2 = 8;
                    LIZ3.setVisibility(i2);
                    ImageView imageView2 = (ImageView) LIZ(R.id.b4m);
                    if (this.LJLJLLL.LJIIIIZZ || ((y1j2 = this.LJLJI) != null && y1j2.LJ())) {
                        i3 = 8;
                    } else {
                        i3 = 0;
                    }
                    imageView2.setVisibility(i3);
                    ((TuxIconView) LIZ(R.id.b4m)).setIconRes(R.raw.icon_color_closed_caption_on);
                    ((TuxIconView) LIZ(R.id.b4m)).LIZ();
                    LIZ(R.id.b4m).setAlpha(this.LJLLJ);
                    View LIZ7 = LIZ(R.id.b4v);
                    y1j = this.LJLJI;
                    if (y1j != null || !y1j.LIZ() || !this.LJLJLLL.LJIJJ) {
                        i4 = 8;
                    }
                    LIZ7.setVisibility(i4);
                }
            }
            i2 = 0;
            LIZ3.setVisibility(i2);
            ImageView imageView22 = (ImageView) LIZ(R.id.b4m);
            if (this.LJLJLLL.LJIIIIZZ) {
            }
            i3 = 8;
            imageView22.setVisibility(i3);
            ((TuxIconView) LIZ(R.id.b4m)).setIconRes(R.raw.icon_color_closed_caption_on);
            ((TuxIconView) LIZ(R.id.b4m)).LIZ();
            LIZ(R.id.b4m).setAlpha(this.LJLLJ);
            View LIZ72 = LIZ(R.id.b4v);
            y1j = this.LJLJI;
            if (y1j != null) {
            }
            i4 = 8;
            LIZ72.setVisibility(i4);
        }
        this.LJLJJL = enumC86689Y0n;
    }

    public final void setText(CharSequence charSequence) {
        Long l;
        if (this.LJLJLLL.LJI == EnumC71056Rue.TEXT && this.LJLJJLL == X6C.NONE) {
            CharSequence charSequence2 = this.LJLJLJ;
            if (charSequence2 != null && charSequence2.length() != 0 && (l = this.LJLLI) != null) {
                this.LJLLILLLL = (System.currentTimeMillis() - l.longValue()) + this.LJLLILLLL;
            }
            if (charSequence != null && charSequence.length() != 0) {
                this.LJLLI = Long.valueOf(System.currentTimeMillis());
            }
        }
        this.LJLJLJ = charSequence;
        setState(this.LJLJJL);
    }

    public final void setToastStatus(X6C x6c) {
        int i;
        long j;
        if (x6c == X6C.HIDING && !this.LJLJLLL.LJIIJ) {
            return;
        }
        X6C x6c2 = X6C.EXPANDING;
        if (x6c == x6c2 && !this.LJLJLLL.LJIIIZ) {
            return;
        }
        this.LJLJJLL = x6c;
        setState(this.LJLJJL);
        if (x6c != X6C.NONE) {
            ValueAnimator valueAnimator = this.LJLJL;
            if (valueAnimator != null) {
                valueAnimator.removeAllUpdateListeners();
            }
            ValueAnimator valueAnimator2 = this.LJLJL;
            if (valueAnimator2 != null) {
                C16880lQ.LJLJL(valueAnimator2);
            }
            ValueAnimator valueAnimator3 = this.LJLJL;
            if (valueAnimator3 != null) {
                valueAnimator3.cancel();
            }
            int[] iArr = new int[2];
            iArr[0] = 0;
            if (this.LJLJJLL == x6c2) {
                i = 1100;
            } else {
                i = LinkMicRtcMixBitrateSetting.DEFAULT;
            }
            iArr[1] = i;
            ValueAnimator ofInt = ValueAnimator.ofInt(iArr);
            if (this.LJLJJLL == x6c2) {
                j = 1100;
            } else {
                j = 1200;
            }
            ofInt.setDuration(j);
            ofInt.addUpdateListener(new AUListenerS102S0100000_15(this, 21));
            ofInt.addListener(new IDAListenerS82S0100000_15(this, 4));
            ofInt.start();
            this.LJLJL = ofInt;
        }
    }

    public final void setValueAnimator(ValueAnimator valueAnimator) {
        this.LJLJL = valueAnimator;
    }

    public final void setVideoContainer(ViewGroup viewGroup) {
        this.LJLIL = viewGroup;
        requestLayout();
    }

    public final void setVideoView(View view) {
        this.LJLILLLLZI = view;
        requestLayout();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y00(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LJLLLLLL = C62850Ola.LJFF(context, "context");
        this.LJLJJLL = X6C.NONE;
        this.LJLJLJ = "";
        this.LJLJLLL = new Y07(0);
        this.LJLLJ = 1.0f;
        FrameLayout.inflate(context, R.layout.v9, this);
        C16880lQ.LJJJ((TuxIconView) LIZ(R.id.b4m), new ACListenerS35S0100000_15(this, 185));
        if (C52280KfU.LIZ()) {
            C16880lQ.LJIIZILJ((LinearLayout) LIZ(R.id.c4q), new ACListenerS35S0100000_15(this, 186));
        }
        C16880lQ.LJIL((ConstraintLayout) LIZ(R.id.c4n), new ACListenerS35S0100000_15(this, 187));
        if (C8LG.LIZ()) {
            LIZ(R.id.c4l).setBackgroundColor(Color.argb(60, 0, 105, 14));
        }
    }

    public final Float LIZLLL(float f, ViewGroup viewGroup, View view) {
        int i;
        float LJIIIZ = KL2.LJIIIZ(getContext());
        Rect rect = new Rect();
        getDrawingRect(rect);
        viewGroup.offsetDescendantRectToMyCoords(this, rect);
        int height = getHeight() + rect.top;
        EnumC86689Y0n enumC86689Y0n = this.LJLJJL;
        if (enumC86689Y0n == null || enumC86689Y0n == EnumC86689Y0n.HIDDEN) {
            i = 0;
        } else {
            i = C7MY.LIZIZ(32);
        }
        int i2 = height - i;
        Rect rect2 = new Rect();
        view.getDrawingRect(rect2);
        viewGroup.offsetDescendantRectToMyCoords(view, rect2);
        float height2 = ((-r6) + r2) / view.getHeight();
        float height3 = 1 - (((LJIIIZ - i2) + ((view.getHeight() + rect2.top) - LJIIIZ)) / view.getHeight());
        if (height2 < f && f < height3) {
            return Float.valueOf((f - height2) / (height3 - height2));
        }
        return null;
    }
}
