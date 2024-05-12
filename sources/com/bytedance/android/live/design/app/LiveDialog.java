package com.bytedance.android.live.design.app;

import X.AnonymousClass174;
import X.AnonymousClass176;
import X.AnonymousClass177;
import X.C006600w;
import X.C006800y;
import X.C018905p;
import X.C07S;
import X.C0K6;
import X.C0NF;
import X.C0NG;
import X.C14B;
import X.C15M;
import X.C16880lQ;
import X.C2A7;
import X.C47071t1;
import X.C47121t6;
import X.C55922Hk;
import X.ViewOnClickListenerC13880ga;
import X.X1D;
import Y.IDCListenerS10S0101000;
import Y.IDCListenerS83S0200000;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class LiveDialog extends LifecycleAwareDialog {
    public static final /* synthetic */ int LLIIL = 0;
    public View LJLJJI;
    public View LJLJJL;
    public LiveIconView LJLJJLL;
    public ImageView LJLJL;
    public ImageView LJLJLJ;
    public TextView LJLJLLL;
    public View LJLL;
    public FrameLayout LJLLI;
    public C47121t6 LJLLILLLL;
    public ImageView LJLLJ;
    public FrameLayout LJLLL;
    public C15M LJLLLL;
    public FrameLayout LJLLLLLL;
    public boolean LJLZ;
    public CharSequence LJZ;
    public CharSequence LJZI;
    public View LJZL;
    public C0NG LL;
    public boolean LLD;
    public int LLF;
    public int LLFF;
    public int LLFFF;
    public int LLFII;
    public int LLFZ;
    public boolean LLI;
    public float LLIFFJFJJ;
    public boolean LLII;
    public boolean LLIIII;
    public ColorStateList LLIIIILZ;
    public AnonymousClass176 LLIIIJ;
    public AnonymousClass177 LLIIIL;
    public C006800y LLIIIZ;
    public LinearLayout LLIIJI;
    public C0K6 LLIIJLIL;

    @Override // com.bytedance.android.live.design.app.LifecycleAwareDialog, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final void LJIJJ() {
        ImageView imageView = this.LJLJLJ;
        if (imageView == null) {
            return;
        }
        C018905p c018905p = (C018905p) imageView.getLayoutParams();
        if (this.LLI) {
            ((ViewGroup.MarginLayoutParams) c018905p).height = this.LLFZ;
            c018905p.dimensionRatio = null;
        } else if (this.LLII) {
            ((ViewGroup.MarginLayoutParams) c018905p).height = 0;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("w, ");
            LIZ.append(this.LLIFFJFJJ);
            c018905p.dimensionRatio = X1D.LIZIZ(LIZ);
        } else {
            ((ViewGroup.MarginLayoutParams) c018905p).height = -2;
            c018905p.dimensionRatio = null;
        }
        this.LJLJLJ.setLayoutParams(c018905p);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0NG c0ng = this.LL;
        if (c0ng != null && c0ng.LIZ() != null) {
            this.LL.LIZ().stop();
        }
    }

    public final void LJIL(C0NG c0ng) {
        C0NG c0ng2 = this.LL;
        if (c0ng == c0ng2) {
            return;
        }
        if (c0ng2 != null && c0ng2.LIZ() != null) {
            this.LL.LIZ().stop();
        }
        this.LL = null;
    }

    public final void LJJ(C15M c15m) {
        this.LJLLLL = c15m;
        FrameLayout frameLayout = this.LJLLL;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
            C15M c15m2 = this.LJLLLL;
            if (c15m2 != null) {
                View LIZ = c15m2.LIZ(getContext(), this.LJLLL, this);
                if (LIZ != null) {
                    ViewGroup.LayoutParams layoutParams = LIZ.getLayoutParams();
                    if (layoutParams != null) {
                        if (!(layoutParams instanceof FrameLayout.LayoutParams)) {
                            layoutParams = new FrameLayout.LayoutParams(layoutParams);
                        }
                    } else {
                        layoutParams = new FrameLayout.LayoutParams(-1, -2);
                    }
                    this.LJLLL.addView(LIZ, layoutParams);
                    this.LJLLL.setVisibility(0);
                    return;
                }
                this.LJLLL.setVisibility(8);
                return;
            }
            this.LJLLL.setVisibility(8);
        }
    }

    public final void LJJII(Drawable drawable) {
        ImageView imageView = this.LJLJLJ;
        if (imageView == null || this.LJLJJL == null) {
            return;
        }
        if (drawable == null) {
            imageView.setImageDrawable(null);
            this.LJLJLJ.setVisibility(8);
            this.LJLJJL.setVisibility(8);
        } else {
            imageView.setImageDrawable(drawable);
            this.LJLJLJ.setVisibility(0);
            this.LJLJJL.setVisibility(0);
        }
    }

    public final void LJJIII(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        LJJIIZ(null);
        LJJII(null);
        LJIL(null);
        this.LL = new C0NG(drawable, 1);
        LiveIconView liveIconView = this.LJLJJLL;
        if (liveIconView != null) {
            liveIconView.setIconAutoMirrored(this.LLD);
            this.LJLJJLL.setIconTintList(null);
        }
        LJJIIJ(drawable);
    }

    public final void LJJIIJ(Drawable drawable) {
        LiveIconView liveIconView = this.LJLJJLL;
        if (liveIconView == null || this.LJLJJL == null) {
            return;
        }
        if (drawable == null) {
            liveIconView.setImageDrawable(null);
            this.LJLJJLL.setVisibility(8);
            this.LJLJJL.setVisibility(8);
        } else {
            liveIconView.setImageDrawable(drawable);
            this.LJLJJLL.setVisibility(0);
            this.LJLJJL.setVisibility(0);
        }
    }

    public final void LJJIIZ(Drawable drawable) {
        ImageView imageView = this.LJLJL;
        if (imageView == null || this.LJLJJL == null) {
            return;
        }
        if (drawable == null) {
            imageView.setImageDrawable(null);
            this.LJLJL.setVisibility(8);
            this.LJLJJL.setVisibility(8);
        } else {
            imageView.setImageDrawable(drawable);
            this.LJLJL.setVisibility(0);
            this.LJLJJL.setVisibility(0);
        }
    }

    /* JADX WARN: Type inference failed for: r1v15, types: [X.177] */
    @Override // X.C18Z, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        int i = 0;
        if (window != null) {
            window.setStatusBarColor(0);
            window.setNavigationBarColor(0);
            window.addFlags(LiveLayoutPreloadThreadPriority.DEFAULT);
            if (Build.VERSION.SDK_INT < 23) {
                window.addFlags(67108864);
                window.addFlags(134217728);
            }
            window.getDecorView().setSystemUiVisibility(512);
            window.setLayout(-1, -1);
        }
        setContentView(View.inflate(getContext(), R.layout.bpn, null), new ViewGroup.LayoutParams(-1, -1));
        this.LJLJJI = findViewById(R.id.fwa);
        setCanceledOnTouchOutside(this.LJLZ);
        this.LJLJJL = findViewById(R.id.fw5);
        this.LJLJJLL = (LiveIconView) findViewById(R.id.fw3);
        this.LJLJL = (ImageView) findViewById(R.id.fw4);
        this.LJLJLJ = (ImageView) findViewById(R.id.fw2);
        C0NG c0ng = this.LL;
        if (c0ng != null) {
            Drawable drawable = c0ng.LIZIZ;
            if (drawable != null) {
                int i2 = c0ng.LIZJ;
                if (i2 == 1) {
                    LJJIII(drawable);
                    boolean z = this.LLD;
                    this.LLD = z;
                    LiveIconView liveIconView = this.LJLJJLL;
                    if (liveIconView != null) {
                        liveIconView.setIconAutoMirrored(z);
                    }
                    LiveIconView liveIconView2 = this.LJLJJLL;
                    if (liveIconView2 != null) {
                        liveIconView2.setIconTintList(null);
                    }
                    int i3 = this.LLF;
                    this.LLF = i3;
                    LiveIconView liveIconView3 = this.LJLJJLL;
                    if (liveIconView3 != null) {
                        ViewGroup.LayoutParams layoutParams = liveIconView3.getLayoutParams();
                        layoutParams.width = i3;
                        this.LJLJJLL.setLayoutParams(layoutParams);
                    }
                    int i4 = this.LLFF;
                    this.LLFF = i4;
                    LiveIconView liveIconView4 = this.LJLJJLL;
                    if (liveIconView4 != null) {
                        ViewGroup.LayoutParams layoutParams2 = liveIconView4.getLayoutParams();
                        layoutParams2.height = i4;
                        this.LJLJJLL.setLayoutParams(layoutParams2);
                    }
                } else if (i2 == 2) {
                    LJJIIJZLJL(drawable, this.LLFFF, this.LLFII);
                } else if (i2 == 3) {
                    if (this.LLI) {
                        LJJIFFI(drawable, this.LLFZ);
                    } else if (this.LLII) {
                        LJJI(drawable, this.LLIFFJFJJ);
                    }
                }
            } else if (c0ng.LIZ() != null) {
                C0NG c0ng2 = this.LL;
                int i5 = c0ng2.LIZJ;
                if (i5 == 1) {
                    int i6 = this.LLF;
                    this.LLF = i6;
                    LiveIconView liveIconView5 = this.LJLJJLL;
                    if (liveIconView5 != null) {
                        ViewGroup.LayoutParams layoutParams3 = liveIconView5.getLayoutParams();
                        layoutParams3.width = i6;
                        this.LJLJJLL.setLayoutParams(layoutParams3);
                    }
                    int i7 = this.LLFF;
                    this.LLFF = i7;
                    LiveIconView liveIconView6 = this.LJLJJLL;
                    if (liveIconView6 != null) {
                        ViewGroup.LayoutParams layoutParams4 = liveIconView6.getLayoutParams();
                        layoutParams4.height = i7;
                        this.LJLJJLL.setLayoutParams(layoutParams4);
                    }
                    boolean z2 = this.LLD;
                    this.LLD = z2;
                    LiveIconView liveIconView7 = this.LJLJJLL;
                    if (liveIconView7 != null) {
                        liveIconView7.setIconAutoMirrored(z2);
                    }
                    LiveIconView liveIconView8 = this.LJLJJLL;
                    if (liveIconView8 != null) {
                        liveIconView8.setIconTintList(null);
                    }
                    C0NG c0ng3 = this.LL;
                    LJIL(c0ng3);
                    c0ng3.LIZJ = 1;
                    this.LL = c0ng3;
                    c0ng3.LIZ = new C0NF() { // from class: X.1fO
                        @Override // X.C0NF
                        public final void LIZ(Drawable drawable2) {
                            LiveDialog.this.LJJIII(drawable2);
                        }
                    };
                    if (c0ng3.LIZ() != null) {
                        this.LL.LIZ().start();
                    }
                } else if (i5 == 2) {
                    final int i8 = this.LLFFF;
                    final int i9 = this.LLFII;
                    LJIL(c0ng2);
                    c0ng2.LIZJ = 2;
                    this.LL = c0ng2;
                    c0ng2.LIZ = new C0NF() { // from class: X.1fP
                        @Override // X.C0NF
                        public final void LIZ(Drawable drawable2) {
                            LiveDialog.this.LJJIIJZLJL(drawable2, i8, i9);
                        }
                    };
                    if (c0ng2.LIZ() != null) {
                        this.LL.LIZ().start();
                    }
                } else if (i5 == 3) {
                    if (this.LLI) {
                        final int i10 = this.LLFZ;
                        LJIL(c0ng2);
                        c0ng2.LIZJ = 3;
                        this.LL = c0ng2;
                        c0ng2.LIZ = new C0NF() { // from class: X.1fQ
                            @Override // X.C0NF
                            public final void LIZ(Drawable drawable2) {
                                LiveDialog.this.LJJIFFI(drawable2, i10);
                            }
                        };
                        if (c0ng2.LIZ() != null) {
                            this.LL.LIZ().start();
                        }
                    } else if (this.LLII) {
                        final float f = this.LLIFFJFJJ;
                        LJIL(c0ng2);
                        c0ng2.LIZJ = 3;
                        this.LL = c0ng2;
                        c0ng2.LIZ = new C0NF() { // from class: X.1fR
                            @Override // X.C0NF
                            public final void LIZ(Drawable drawable2) {
                                LiveDialog.this.LJJI(drawable2, f);
                            }
                        };
                        if (c0ng2.LIZ() != null) {
                            this.LL.LIZ().start();
                        }
                    }
                }
            }
        }
        this.LJLJLLL = (TextView) findViewById(R.id.fw_);
        setTitle(this.LJZ);
        this.LJLL = findViewById(R.id.fw8);
        this.LJLLI = (FrameLayout) findViewById(R.id.fw7);
        C47121t6 c47121t6 = (C47121t6) findViewById(R.id.fw9);
        this.LJLLILLLL = c47121t6;
        c47121t6.setMovementMethod(LinkMovementMethod.getInstance());
        LJIJJLI(this.LJZL, this.LJZI);
        ImageView imageView = (ImageView) findViewById(R.id.fw0);
        this.LJLLJ = imageView;
        C16880lQ.LJIILLIIL(imageView, new IDCListenerS10S0101000(0, this, 7));
        boolean z3 = this.LLIIII;
        this.LLIIII = z3;
        ImageView imageView2 = this.LJLLJ;
        if (imageView2 != null) {
            if (z3) {
                imageView2.setVisibility(0);
            } else {
                imageView2.setVisibility(8);
            }
        }
        ColorStateList colorStateList = this.LLIIIILZ;
        this.LLIIIILZ = colorStateList;
        ImageView imageView3 = this.LJLLJ;
        if (imageView3 != null) {
            C07S.LIZ(imageView3, colorStateList);
        }
        this.LJLLL = (FrameLayout) findViewById(R.id.fvy);
        LJJ(this.LJLLLL);
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.fvz);
        this.LJLLLLLL = frameLayout;
        AnonymousClass176 anonymousClass176 = this.LLIIIJ;
        if (anonymousClass176 != null) {
            this.LLIIIZ = null;
            this.LLIIIJ = anonymousClass176;
            if (frameLayout != null) {
                frameLayout.removeAllViews();
                if (this.LLIIIJ != null) {
                    if (this.LLIIIL == null) {
                        final Context context = getContext();
                        this.LLIIIL = new ViewGroup(context) { // from class: X.177
                            public int LJLIL;
                            public int LJLILLLLZI;
                            public int LJLJI;
                            public Paint LJLJJI;
                            public final TextPaint LJLJJL = new TextPaint();
                            public int LJLJJLL;
                            public int LJLJL;

                            {
                                setWillNotDraw(false);
                                this.LJLJI = getContext().getResources().getDimensionPixelSize(R.dimen.wx);
                                Paint paint = new Paint(1);
                                this.LJLJJI = paint;
                                paint.setColor(C259910h.LIZIZ(R.attr.bn5, getContext()));
                                this.LJLJJI.setStrokeWidth(this.LJLJI);
                                this.LJLJJLL = getContext().getResources().getDimensionPixelSize(R.dimen.wd);
                                this.LJLJL = getContext().getResources().getDimensionPixelSize(R.dimen.wc);
                            }

                            @Override // android.view.View
                            public final void draw(Canvas canvas) {
                                super.draw(canvas);
                                int childCount = getChildCount();
                                if (childCount > 0) {
                                    canvas.drawRect(0.0f, this.LJLJL, getWidth(), this.LJLJL + this.LJLJI, this.LJLJJI);
                                    int i11 = 1;
                                    if (this.LJLILLLLZI == 1) {
                                        int width = (getWidth() - ((childCount - 1) * this.LJLJI)) / childCount;
                                        while (i11 < childCount) {
                                            int i12 = this.LJLJI;
                                            float f2 = ((i11 - 1) * i12) + (i11 * width);
                                            int i13 = this.LJLJL;
                                            canvas.drawRect(f2, i13 + i12, f2 + i12, i13 + i12 + this.LJLJJLL, this.LJLJJI);
                                            i11++;
                                        }
                                        return;
                                    }
                                    while (i11 < childCount) {
                                        View childAt = getChildAt(i11 - 1);
                                        canvas.drawRect(0.0f, childAt.getBottom(), getWidth(), childAt.getBottom() + this.LJLJI, this.LJLJJI);
                                        i11++;
                                    }
                                }
                            }

                            public void setOrientation(int i11) {
                                this.LJLIL = i11;
                                requestLayout();
                            }

                            /* JADX WARN: Code restructure failed: missing block: B:23:0x00f6, code lost:
                            
                                if (r19.LJLILLLLZI == 1) goto L35;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:24:0x00f8, code lost:
                            
                                getChildAt(r2).measure(android.view.View.MeasureSpec.makeMeasureSpec(r1, 1073741824), android.view.View.MeasureSpec.makeMeasureSpec(r19.LJLJJLL, 1073741824));
                                r2 = r2 + 1;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:25:0x010b, code lost:
                            
                                if (r2 >= r5) goto L48;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:27:0x013f, code lost:
                            
                                super.onMeasure(android.view.View.MeasureSpec.makeMeasureSpec(r4, 1073741824), android.view.View.MeasureSpec.makeMeasureSpec((r19.LJLJL + r19.LJLJI) + r19.LJLJJLL, 1073741824));
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:28:0x0152, code lost:
                            
                                return;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:31:0x0110, code lost:
                            
                                getChildAt(r2).measure(android.view.View.MeasureSpec.makeMeasureSpec(r4, 1073741824), android.view.View.MeasureSpec.makeMeasureSpec(r19.LJLJJLL, 1073741824));
                                r2 = r2 + 1;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:32:0x010e, code lost:
                            
                                if (r2 >= r5) goto L50;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:34:0x0124, code lost:
                            
                                super.onMeasure(android.view.View.MeasureSpec.makeMeasureSpec(r4, 1073741824), android.view.View.MeasureSpec.makeMeasureSpec(((r19.LJLJI + r19.LJLJJLL) * r5) + r19.LJLJL, 1073741824));
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:35:?, code lost:
                            
                                return;
                             */
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // android.view.View
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                                To view partially-correct add '--show-bad-code' argument
                            */
                            public final void onMeasure(int r20, int r21) {
                                /*
                                    Method dump skipped, instructions count: 339
                                    To view this dump add '--comments-level debug' option
                                */
                                throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass177.onMeasure(int, int):void");
                            }

                            @Override // android.view.ViewGroup, android.view.View
                            public final void onLayout(boolean z4, int i11, int i12, int i13, int i14) {
                                boolean z5;
                                int measuredWidth;
                                int childCount = getChildCount();
                                int i15 = 0;
                                if (C16310kV.LIZLLL(this) == 1) {
                                    z5 = true;
                                } else {
                                    z5 = false;
                                }
                                if (childCount > 0) {
                                    if (this.LJLILLLLZI == 1) {
                                        int i16 = this.LJLJL + this.LJLJI;
                                        int i17 = this.LJLJJLL + i16;
                                        do {
                                            View childAt = getChildAt(i15);
                                            if (z5) {
                                                measuredWidth = (childAt.getMeasuredWidth() + this.LJLJI) * i15;
                                            } else {
                                                measuredWidth = ((i13 - i11) - (childAt.getMeasuredWidth() * (i15 + 1))) - (this.LJLJI * i15);
                                            }
                                            childAt.layout(measuredWidth, i16, childAt.getMeasuredWidth() + measuredWidth, i17);
                                            i15++;
                                        } while (i15 < childCount);
                                        return;
                                    }
                                    int i18 = this.LJLJL + this.LJLJI;
                                    int i19 = 0;
                                    do {
                                        View childAt2 = getChildAt(i19);
                                        childAt2.layout(0, i18, childAt2.getMeasuredWidth(), childAt2.getMeasuredHeight() + i18);
                                        i18 += childAt2.getMeasuredHeight() + this.LJLJI;
                                        i19++;
                                    } while (i19 < childCount);
                                }
                            }
                        };
                    }
                    List<AnonymousClass174> unmodifiableList = Collections.unmodifiableList(this.LLIIIJ.LIZ);
                    removeAllViews();
                    if (unmodifiableList != null && !unmodifiableList.isEmpty()) {
                        for (AnonymousClass174 anonymousClass174 : unmodifiableList) {
                            C55922Hk c55922Hk = new C55922Hk(getContext());
                            c55922Hk.LJLLLL.LLLLZLLIL(anonymousClass174.LIZIZ);
                            c55922Hk.setText(anonymousClass174.LIZ);
                            if (anonymousClass174.LIZJ != null) {
                                c55922Hk.setOnClickListener(new ViewOnClickListenerC13880ga(new C14B(i, this, anonymousClass174)));
                            }
                            c55922Hk.setEnabled(true);
                            addView(c55922Hk);
                        }
                    }
                    requestLayout();
                    setOrientation(this.LLIIIJ.LIZIZ);
                    this.LJLLLLLL.addView(this.LLIIIL, -1, -2);
                } else {
                    AnonymousClass177 anonymousClass177 = this.LLIIIL;
                    if (anonymousClass177 != null) {
                        anonymousClass177.removeAllViews();
                    }
                }
            }
        }
        C006800y c006800y = this.LLIIIZ;
        if (c006800y == null) {
            return;
        }
        this.LLIIIJ = null;
        this.LLIIIZ = c006800y;
        FrameLayout frameLayout2 = this.LJLLLLLL;
        if (frameLayout2 == null) {
            return;
        }
        frameLayout2.removeAllViews();
        if (this.LLIIIZ != null) {
            LinearLayout linearLayout = this.LLIIJI;
            if (linearLayout == null) {
                LinearLayout linearLayout2 = new LinearLayout(getContext());
                linearLayout2.setOrientation(1);
                FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(-1, -2);
                layoutParams5.topMargin = getContext().getResources().getDimensionPixelSize(R.dimen.we);
                int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.xh);
                layoutParams5.rightMargin = dimensionPixelSize;
                layoutParams5.leftMargin = dimensionPixelSize;
                linearLayout2.setLayoutParams(layoutParams5);
                this.LLIIJI = linearLayout2;
            } else {
                linearLayout.removeAllViews();
            }
            List unmodifiableList2 = Collections.unmodifiableList(this.LLIIIZ.LIZ);
            int size = unmodifiableList2.size();
            while (i < size) {
                C006600w c006600w = (C006600w) ListProtector.get(unmodifiableList2, i);
                C2A7 c2a7 = new C2A7(getContext(), null);
                c2a7.LJJLL(c006600w.LIZIZ);
                if (c006600w.LIZJ != null) {
                    C16880lQ.LJJIII(c2a7, new IDCListenerS83S0200000(c006600w, this, 12));
                }
                c2a7.setText(c006600w.LIZ);
                c2a7.setEnabled(true);
                LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-1, -2);
                if (i > 0) {
                    layoutParams6.topMargin = getContext().getResources().getDimensionPixelSize(R.dimen.wf);
                }
                c2a7.setLayoutParams(layoutParams6);
                this.LLIIJI.addView(c2a7);
                i++;
            }
            if (size > 1) {
                LinearLayout linearLayout3 = this.LLIIJI;
                linearLayout3.setPadding(linearLayout3.getPaddingLeft(), this.LLIIJI.getPaddingTop(), this.LLIIJI.getPaddingRight(), getContext().getResources().getDimensionPixelSize(R.dimen.xk));
            } else {
                LinearLayout linearLayout4 = this.LLIIJI;
                linearLayout4.setPadding(linearLayout4.getPaddingLeft(), this.LLIIJI.getPaddingTop(), this.LLIIJI.getPaddingRight(), getContext().getResources().getDimensionPixelSize(R.dimen.wp));
            }
            this.LJLLLLLL.addView(this.LLIIJI);
            return;
        }
        this.LLIIJI.removeAllViews();
    }

    @Override // android.app.Dialog
    public final void setCanceledOnTouchOutside(boolean z) {
        super.setCanceledOnTouchOutside(z);
        this.LJLZ = z;
        View view = this.LJLJJI;
        if (view != null) {
            if (z) {
                C16880lQ.LJIIJ(new IDCListenerS10S0101000(0, this, 8), view);
            } else {
                C16880lQ.LJIIJ(null, view);
            }
        }
    }

    @Override // X.C18Z, android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        this.LJZ = charSequence;
        if (this.LJLJLLL != null) {
            if (TextUtils.isEmpty(charSequence)) {
                this.LJLJLLL.setText("");
                this.LJLJLLL.setVisibility(8);
            } else {
                this.LJLJLLL.setText(this.LJZ);
                this.LJLJLLL.setVisibility(0);
            }
        }
        LJIJJLI(this.LJZL, this.LJZI);
    }

    @Override // X.C18Z, android.app.Dialog
    public final void setTitle(int i) {
        setTitle(getContext().getResources().getString(i));
    }

    public LiveDialog(Context context, C47071t1 c47071t1) {
        super(context, c47071t1);
        this.LL = c47071t1.LJFF;
        this.LLD = c47071t1.LJI;
        this.LLF = c47071t1.LJII;
        this.LLFF = c47071t1.LJIIIIZZ;
        this.LLFFF = c47071t1.LJIIIZ;
        this.LLFII = c47071t1.LJIIJ;
        this.LLFZ = 0;
        this.LLIFFJFJJ = c47071t1.LJIIJJI;
        this.LLI = false;
        this.LLII = c47071t1.LJIIL;
        this.LJZ = c47071t1.LIZJ;
        this.LJZI = c47071t1.LJ;
        this.LJZL = c47071t1.LIZLLL;
        this.LLIIII = c47071t1.LJIILIIL;
        this.LLIIIILZ = null;
        this.LJLLLL = c47071t1.LJIJI;
        setOnShowListener(c47071t1.LJIILLIIL);
        setOnCancelListener(c47071t1.LJIJ);
        setOnDismissListener(c47071t1.LJIIZILJ);
        setOnKeyListener(null);
        setCancelable(c47071t1.LJIILL);
        setCanceledOnTouchOutside(c47071t1.LJIILJJIL);
        this.LLIIIJ = c47071t1.LJIJJ;
        this.LLIIIZ = c47071t1.LJIJJLI;
        this.LLIIJLIL = c47071t1.LJJII;
    }

    public final void LJIJJLI(View view, CharSequence charSequence) {
        FrameLayout frameLayout;
        if (this.LJLL == null || this.LJLLILLLL == null || (frameLayout = this.LJLLI) == null) {
            return;
        }
        View view2 = this.LJZL;
        if (view2 != null) {
            C16880lQ.LJLLLL(view2, frameLayout);
        }
        this.LJZI = charSequence;
        this.LJZL = view;
        if (!TextUtils.isEmpty(charSequence)) {
            this.LJLLILLLL.setText(this.LJZI);
            if (TextUtils.isEmpty(this.LJZ)) {
                this.LJLLILLLL.LJJIJIL(R.style.a40);
            } else {
                this.LJLLILLLL.LJJIJIL(R.style.a43);
            }
            this.LJLLILLLL.setVisibility(0);
            this.LJLL.setVisibility(0);
            return;
        }
        View view3 = this.LJZL;
        if (view3 != null) {
            this.LJLLI.addView(view3, -1, -2);
            this.LJLLILLLL.setText("");
            this.LJLLILLLL.setVisibility(8);
            this.LJLL.setVisibility(0);
            return;
        }
        this.LJLLILLLL.setText("");
        this.LJLLILLLL.setVisibility(8);
        this.LJLL.setVisibility(8);
    }

    public final void LJJI(Drawable drawable, float f) {
        if (this.LL == null && drawable == null) {
            return;
        }
        LJJIIJ(null);
        LJJIIZ(null);
        LJIL(null);
        this.LL = new C0NG(drawable, 3);
        LJJII(drawable);
        this.LLIFFJFJJ = f;
        this.LLII = true;
        this.LLI = false;
        LJIJJ();
    }

    public final void LJJIFFI(Drawable drawable, int i) {
        if (this.LL == null && drawable == null) {
            return;
        }
        LJJIIJ(null);
        LJJIIZ(null);
        LJIL(null);
        this.LL = new C0NG(drawable, 3);
        LJJII(drawable);
        this.LLFZ = i;
        this.LLI = true;
        this.LLII = false;
        LJIJJ();
    }

    public final void LJJIIJZLJL(Drawable drawable, int i, int i2) {
        if (this.LL == null && drawable == null) {
            return;
        }
        LJJIIJ(null);
        LJJII(null);
        LJIL(null);
        this.LL = new C0NG(drawable, 2);
        LJJIIZ(drawable);
        this.LLFFF = i;
        this.LLFII = i2;
        ImageView imageView = this.LJLJL;
        if (imageView != null) {
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            layoutParams.width = this.LLFFF;
            layoutParams.height = this.LLFII;
            this.LJLJL.setLayoutParams(layoutParams);
        }
    }
}
