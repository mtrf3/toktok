package Y;

import X.ActivityC45651qj;
import X.AnonymousClass629;
import X.AnonymousClass636;
import X.AnonymousClass673;
import X.C113564cy;
import X.C135315St;
import X.C141765hM;
import X.C1552667m;
import X.C1556669a;
import X.C1556769b;
import X.C1557269g;
import X.C1557369h;
import X.C1557569j;
import X.C1558169p;
import X.C1558369r;
import X.C156426By;
import X.C156526Ci;
import X.C156556Cl;
import X.C156626Cs;
import X.C162606Zs;
import X.C173636rf;
import X.C5UO;
import X.C63081OpJ;
import X.C63E;
import X.C65C;
import X.C67399Qcl;
import X.C67C;
import X.C6W9;
import X.C6XX;
import X.C6Y2;
import X.C6Y3;
import X.C6Y4;
import X.C6Y7;
import X.C6YD;
import X.C6YX;
import X.C81184Vtc;
import X.InterfaceC153045zY;
import X.KL2;
import X.MFV;
import X.RunnableC1557769l;
import android.animation.ValueAnimator;
import android.text.Layout;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.lifecycle.LiveData;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.util.ToolSafeHandler;
import com.ss.android.ugc.aweme.shortvideo.vechoosecover.VEChooseVideoCoverFragment;
import com.ss.android.vesdk.VESize;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public class ARunnableS5S0201000_2 implements Runnable {
    public final int $t;
    public int i2;
    public Object l0;
    public Object l1;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                return;
            case 1:
                run$1(this);
                return;
            case 2:
                run$2(this);
                return;
            case 3:
                run$3(this);
                return;
            case 4:
                run$4(this);
                return;
            case 5:
                run$5(this);
                return;
            case 6:
                run$6(this);
                return;
            case 7:
                run$7(this);
                return;
            default:
                return;
        }
    }

    public final void LIZ$0() {
        int LJZL;
        if (((ARunnableS9S0000000_2) this.l0) != null) {
            this.l0 = null;
        }
        ToolSafeHandler toolSafeHandler = ((C156556Cl) this.l1).LJLLILLLL;
        if (toolSafeHandler != null) {
            toolSafeHandler.postDelayed(this, 16L);
            InterfaceC153045zY value = ((C156556Cl) this.l1).getEditPreviewApi().Kh().getValue();
            if (value == null || ((C156556Cl) this.l1).LLJJI().LJLL == null || (LJZL = value.LJZL()) == this.i2) {
                return;
            }
            this.i2 = LJZL;
            C156526Ci LLJJI = ((C156556Cl) this.l1).LLJJI();
            long j = LJZL;
            C156426By c156426By = LLJJI.LJLL;
            if ((c156426By instanceof C156626Cs) && c156426By != null) {
                c156426By.setPlayPosition(j);
            }
            if (LLJJI.LLFF) {
                C156426By c156426By2 = LLJJI.LJLL;
                if ((c156426By2 instanceof C156626Cs) && c156426By2 != null) {
                    c156426By2.LJIILL();
                    return;
                }
                return;
            }
            C156426By c156426By3 = LLJJI.LJLL;
            if (!(c156426By3 instanceof C156626Cs) || c156426By3 == null) {
                return;
            }
            c156426By3.LJIILIIL();
            return;
        }
        o.LJIJI("safeHandler");
        throw null;
    }

    public final void LIZ$1() {
        int LJZL;
        if (((ARunnableS9S0000000_2) this.l0) != null) {
            this.l0 = null;
        }
        ToolSafeHandler toolSafeHandler = ((AnonymousClass673) this.l1).LJLLILLLL;
        if (toolSafeHandler != null) {
            toolSafeHandler.postDelayed(this, 16L);
            InterfaceC153045zY value = ((AnonymousClass673) this.l1).getEditPreviewApi().Kh().getValue();
            if (value == null || ((AnonymousClass673) this.l1).LLJJI().LJLL == null || (LJZL = value.LJZL()) == this.i2) {
                return;
            }
            this.i2 = LJZL;
            C1556669a LLJJI = ((AnonymousClass673) this.l1).LLJJI();
            long j = LJZL;
            C156426By c156426By = LLJJI.LJLL;
            if (c156426By instanceof C1557369h) {
                c156426By.setPlayPosition(j);
                if (LLJJI.LLFF) {
                    LLJJI.LJLL.LJIILL();
                    return;
                } else {
                    LLJJI.LJLL.LJIILIIL();
                    return;
                }
            }
            return;
        }
        o.LJIJI("safeHandler");
        throw null;
    }

    public final void LIZ$2() {
        InterfaceC153045zY value;
        int LJZL;
        if (((ARunnableS9S0000000_2) this.l0) != null) {
            this.l0 = null;
        }
        ((C63E) this.l1).LJIIJJI().postDelayed(this, 16L);
        LiveData<InterfaceC153045zY> liveData = ((C63E) this.l1).LJLJL;
        if (liveData == null || (value = liveData.getValue()) == null || !((C63E) this.l1).LJIIL().LJJL() || (LJZL = value.LJZL()) == this.i2) {
            return;
        }
        this.i2 = LJZL;
        ((C63E) this.l1).LJIIL().Bp0(LJZL);
    }

    public final void LIZ$3() {
        int LJZL;
        if (((ARunnableS9S0000000_2) this.l0) != null) {
            this.l0 = null;
        }
        ToolSafeHandler toolSafeHandler = ((C67C) this.l1).LJLLL;
        if (toolSafeHandler != null) {
            toolSafeHandler.postDelayed(this, 16L);
            InterfaceC153045zY value = ((C67C) this.l1).getEditPreviewApi().Kh().getValue();
            if (value == null || ((C67C) this.l1).LLJJI().LJLL == null || (LJZL = value.LJZL()) == this.i2) {
                return;
            }
            this.i2 = LJZL;
            C1556769b LLJJI = ((C67C) this.l1).LLJJI();
            long j = LJZL;
            C156426By c156426By = LLJJI.LJLL;
            if ((c156426By instanceof C1557269g) && c156426By != null) {
                c156426By.setPlayPosition(j);
            }
            if (LLJJI.LLFF) {
                C156426By c156426By2 = LLJJI.LJLL;
                if ((c156426By2 instanceof C1557269g) && c156426By2 != null) {
                    c156426By2.LJIILL();
                    return;
                }
                return;
            }
            C156426By c156426By3 = LLJJI.LJLL;
            if (!(c156426By3 instanceof C1557269g) || c156426By3 == null) {
                return;
            }
            c156426By3.LJIILIIL();
            return;
        }
        o.LJIJI("safeHandler");
        throw null;
    }

    public final void LIZ$4() {
        int LJZL;
        if (((RunnableC1557769l) this.l0) != null) {
            this.l0 = null;
        }
        ToolSafeHandler toolSafeHandler = ((C1557569j) this.l1).LJLLJ;
        if (toolSafeHandler != null) {
            toolSafeHandler.postDelayed(this, 16L);
            InterfaceC153045zY value = ((C1557569j) this.l1).getEditPreviewApi().Kh().getValue();
            if (value == null || ((C1557569j) this.l1).LLJJ().LJLL == null || (LJZL = value.LJZL()) == this.i2) {
                return;
            }
            this.i2 = LJZL;
            C1558169p LLJJ = ((C1557569j) this.l1).LLJJ();
            long j = LJZL;
            C156426By c156426By = LLJJ.LJLL;
            if ((c156426By instanceof C1558369r) && c156426By != null) {
                c156426By.setPlayPosition(j);
            }
            if (LLJJ.LLFF) {
                C156426By c156426By2 = LLJJ.LJLL;
                if ((c156426By2 instanceof C1558369r) && c156426By2 != null) {
                    c156426By2.LJIILL();
                    return;
                }
                return;
            }
            C156426By c156426By3 = LLJJ.LJLL;
            if (!(c156426By3 instanceof C1558369r) || c156426By3 == null) {
                return;
            }
            c156426By3.LJIILIIL();
            return;
        }
        o.LJIJI("safeHandler");
        throw null;
    }

    public final void LIZ$5() {
        InterfaceC153045zY value;
        int LJZL;
        if (((ARunnableS9S0000000_2) this.l0) != null) {
            this.l0 = null;
        }
        SafeHandler safeHandler = ((C65C) this.l1).LLFII;
        if (safeHandler != null) {
            safeHandler.postDelayed(this, 16L);
            LiveData<InterfaceC153045zY> liveData = ((C65C) this.l1).LJLJL;
            if (liveData == null || (value = liveData.getValue()) == null || !((C65C) this.l1).LIZJ().LJJL() || (LJZL = value.LJZL()) == this.i2) {
                return;
            }
            this.i2 = LJZL;
            ((C65C) this.l1).LIZJ().Bp0(LJZL);
            return;
        }
        o.LJIJI("safeHandler");
        throw null;
    }

    public static final void run$0(ARunnableS5S0201000_2 aRunnableS5S0201000_2) {
        boolean LIZ;
        try {
            aRunnableS5S0201000_2.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS5S0201000_2 aRunnableS5S0201000_2) {
        boolean LIZ;
        try {
            aRunnableS5S0201000_2.LIZ$1();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$2(ARunnableS5S0201000_2 aRunnableS5S0201000_2) {
        boolean LIZ;
        try {
            aRunnableS5S0201000_2.LIZ$2();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$3(ARunnableS5S0201000_2 aRunnableS5S0201000_2) {
        boolean LIZ;
        try {
            aRunnableS5S0201000_2.LIZ$3();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$4(ARunnableS5S0201000_2 aRunnableS5S0201000_2) {
        C67399Qcl c67399Qcl;
        boolean z;
        float f;
        boolean z2;
        int i;
        switch (aRunnableS5S0201000_2.i2) {
            case 0:
                C6Y3 c6y3 = (C6Y3) aRunnableS5S0201000_2.l0;
                C6Y7<T> c6y7 = (C6Y7) aRunnableS5S0201000_2.l1;
                if (c6y3.LIZIZ == C6Y3.LIZLLL) {
                    synchronized (c6y3) {
                        c67399Qcl = c6y3.LIZ;
                        c6y3.LIZ = null;
                        c6y3.LIZIZ = c6y7;
                    }
                    c67399Qcl.getClass();
                    return;
                }
                throw new IllegalStateException("provide() can be called only once.");
            case 1:
            default:
                final C6XX c6xx = (C6XX) aRunnableS5S0201000_2.l0;
                VEChooseVideoCoverFragment vEChooseVideoCoverFragment = (VEChooseVideoCoverFragment) aRunnableS5S0201000_2.l1;
                c6xx.getClass();
                ActivityC45651qj mo49getActivity = vEChooseVideoCoverFragment.mo49getActivity();
                if (vEChooseVideoCoverFragment.isDetached() || mo49getActivity == null || mo49getActivity.isFinishing()) {
                    return;
                }
                int LJIIIIZZ = AnonymousClass636.LJIIIIZZ(R.attr.cc, c6xx.LIZ);
                ViewGroup viewGroup = vEChooseVideoCoverFragment.LJLJJL;
                Objects.requireNonNull(viewGroup);
                int measuredHeight = viewGroup.getMeasuredHeight();
                int i2 = vEChooseVideoCoverFragment.LLF;
                if (i2 == -1) {
                    i2 = C63081OpJ.LJJJJLI(vEChooseVideoCoverFragment.mo49getActivity());
                    vEChooseVideoCoverFragment.LLF = i2;
                }
                final int i3 = i2 + measuredHeight;
                ViewGroup viewGroup2 = vEChooseVideoCoverFragment.LJLJLJ;
                Objects.requireNonNull(viewGroup2);
                int measuredHeight2 = viewGroup2.getMeasuredHeight();
                FrameLayout frameLayout = vEChooseVideoCoverFragment.LJLJLLL;
                Objects.requireNonNull(frameLayout);
                final int measuredHeight3 = frameLayout.getMeasuredHeight() + measuredHeight2;
                FrameLayout frameLayout2 = vEChooseVideoCoverFragment.LJLJJLL;
                Objects.requireNonNull(frameLayout2);
                int measuredHeight4 = frameLayout2.getMeasuredHeight();
                final int LIZJ = C81184Vtc.LIZJ(mo49getActivity);
                C135315St c135315St = c6xx.LIZ.LJLJJI;
                if (c135315St == null) {
                    return;
                }
                c135315St.LJIIIZ.LJJLIIIIJ(LJIIIIZZ);
                final int LIZIZ = C81184Vtc.LIZIZ(vEChooseVideoCoverFragment.mo49getActivity());
                final int width = c6xx.LIZ.LJLJJLL.getWidth();
                VESize LLILZ = c6xx.LIZ.LJLJJI.LJIIIZ.LLILZ();
                float f2 = LLILZ.height;
                final float f3 = LLILZ.width / f2;
                float f4 = measuredHeight4;
                if (f3 > width / f4) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f2, (int) (r10 / f3));
                    if (c6xx.LIZ.LLIIJLIL()) {
                        ofFloat.setDuration(300L);
                    } else {
                        ofFloat.setDuration(0L);
                    }
                    ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
                    z = true;
                    ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.6XV
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            C6XX c6xx2 = C6XX.this;
                            float f5 = f3;
                            int i4 = LIZIZ;
                            int i5 = LIZJ;
                            int i6 = measuredHeight3;
                            int i7 = i3;
                            c6xx2.getClass();
                            float animatedFraction = valueAnimator.getAnimatedFraction();
                            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            float f6 = f5 * floatValue;
                            float f7 = ((((i4 - i5) - ((i6 + i7) * animatedFraction)) - floatValue) / 2.0f) + i7;
                            if (H7R.LJJJJI(c6xx2.LIZ.LJLJI)) {
                                f7 = 0.0f;
                            }
                            int i8 = (int) 0.0f;
                            int i9 = (int) f7;
                            int i10 = (int) f6;
                            int i11 = (int) floatValue;
                            c6xx2.LIZ.LJLJJI.LJIIIZ.LIZ(i8, i9, i10, i11);
                            ImageView imageView = c6xx2.LIZ.LJLJLJ;
                            if (imageView != null) {
                                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) imageView.getLayoutParams();
                                layoutParams.topMargin = i9;
                                layoutParams.width = i10;
                                layoutParams.height = i11;
                                c6xx2.LIZ.LJLJLJ.setLayoutParams(layoutParams);
                            }
                            c6xx2.LIZ.LLIIIJ(i8, i9, i10, i11);
                            if (animatedFraction == 1.0f) {
                                c6xx2.LIZ.LLIIIZ(i9, i10, i11);
                            }
                        }
                    });
                    ofFloat.start();
                } else {
                    z = true;
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f2, f4);
                    if (c6xx.LIZ.LLIIJLIL()) {
                        ofFloat2.setDuration(300L);
                    } else {
                        ofFloat2.setDuration(0L);
                    }
                    ofFloat2.setInterpolator(new AccelerateDecelerateInterpolator());
                    ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.6XW
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            C6XX c6xx2 = C6XX.this;
                            float f5 = f3;
                            int i4 = width;
                            int i5 = i3;
                            c6xx2.getClass();
                            float animatedFraction = valueAnimator.getAnimatedFraction();
                            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            float f6 = f5 * floatValue;
                            float f7 = (i4 - f6) / 2.0f;
                            float f8 = i5 * animatedFraction;
                            if (H7R.LJJJJI(c6xx2.LIZ.LJLJI)) {
                                f8 = 0.0f;
                            }
                            int i6 = (int) f7;
                            int i7 = (int) f8;
                            int i8 = (int) f6;
                            int i9 = (int) floatValue;
                            c6xx2.LIZ.LJLJJI.LJIIIZ.LIZ(i6, i7, i8, i9);
                            ImageView imageView = c6xx2.LIZ.LJLJLJ;
                            if (imageView != null) {
                                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) imageView.getLayoutParams();
                                layoutParams.topMargin = i7;
                                layoutParams.width = i8;
                                layoutParams.height = i9;
                                c6xx2.LIZ.LJLJLJ.setLayoutParams(layoutParams);
                            }
                            c6xx2.LIZ.LLIIIJ(i6, i7, i8, i9);
                            if (animatedFraction == 1.0f) {
                                c6xx2.LIZ.LLIIIZ(i7, i8, i9);
                            }
                        }
                    });
                    ofFloat2.start();
                }
                c6xx.LIZ.LJLJJI.LJIIIZ.LLJILJIL(false);
                int i4 = LLILZ.width;
                int i5 = LLILZ.height;
                FrameLayout frameLayout3 = vEChooseVideoCoverFragment.LJLJL;
                if (frameLayout3 != null) {
                    float f5 = i4 / i5;
                    int width2 = frameLayout3.getWidth();
                    int height = vEChooseVideoCoverFragment.LJLJL.getHeight();
                    float f6 = width2;
                    float f7 = height;
                    float f8 = f6 / f7;
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) vEChooseVideoCoverFragment.LJLJL.getLayoutParams();
                    if (f5 > f8) {
                        layoutParams.width = width2;
                        layoutParams.height = ((int) (f6 / f5)) + 2;
                        i = (height * 9) / 16;
                        f = 1.0f;
                        z2 = false;
                    } else {
                        f = ((int) (f5 * f7)) / f6;
                        if (f == 0.0f || Float.isNaN(f) || Float.isInfinite(f)) {
                            f = 1.0f;
                        }
                        layoutParams.height = (int) (f7 / f);
                        z2 = true;
                        i = -1;
                    }
                    vEChooseVideoCoverFragment.LJLJL.setLayoutParams(layoutParams);
                    vEChooseVideoCoverFragment.LJLJL.setScaleX(f);
                    vEChooseVideoCoverFragment.LJLJL.setScaleY(f);
                    vEChooseVideoCoverFragment.LJLJL.setTag(new C1552667m(f, i, z2));
                }
                float duration = (c6xx.LIZ.LJLJI.mVideoCoverStartTm * 1000.0f) / r1.LJLJJI.LJIIIZ.getDuration();
                VEChooseVideoCoverFragment vEChooseVideoCoverFragment2 = c6xx.LIZ.LJLJJL;
                vEChooseVideoCoverFragment2.LLFF = z;
                vEChooseVideoCoverFragment2.Hl(duration, false);
                C6Y2 c6y2 = vEChooseVideoCoverFragment2.LJLLL;
                if (c6y2 == null) {
                    return;
                }
                if (duration != 0.0f) {
                    c6y2.LIZLLL().getCoverPublishModel().setVideoCoverViewX((vEChooseVideoCoverFragment2.LJLILLLLZI.getWidth() - vEChooseVideoCoverFragment2.LJLILLLLZI.getOneThumbWidth()) * duration);
                }
                C6Y4 c6y4 = vEChooseVideoCoverFragment2.LJLILLLLZI;
                float videoCoverViewX = vEChooseVideoCoverFragment2.LJLLL.LIZLLL().getCoverPublishModel().getVideoCoverViewX();
                C141765hM c141765hM = c6y4.LJLJJL;
                if (C173636rf.LIZIZ(c6y4.getContext())) {
                    videoCoverViewX = (c6y4.getMeasuredWidth() - c6y4.getOneThumbWidth()) - videoCoverViewX;
                }
                c141765hM.setX(videoCoverViewX);
                return;
            case 2:
                View view = (View) aRunnableS5S0201000_2.l0;
                C6YD c6yd = (C6YD) aRunnableS5S0201000_2.l1;
                view.setVisibility(8);
                view.setAlpha(1.0f);
                c6yd.LIZ();
                return;
        }
    }

    public static final void run$5(ARunnableS5S0201000_2 aRunnableS5S0201000_2) {
        Layout layout;
        switch (aRunnableS5S0201000_2.i2) {
            case 0:
                ((AccessibilityManager) aRunnableS5S0201000_2.l0).sendAccessibilityEvent((AccessibilityEvent) aRunnableS5S0201000_2.l1);
                return;
            case 1:
                MFV mfv = (MFV) aRunnableS5S0201000_2.l0;
                AppCompatTextView appCompatTextView = (AppCompatTextView) aRunnableS5S0201000_2.l1;
                mfv.getClass();
                if (appCompatTextView.getParent() != null) {
                    if (((int) appCompatTextView.getPaint().measureText(appCompatTextView.getText().toString())) < mfv.LLFZ.getWidth() - KL2.LJIILL(mfv.LJLJLJ, 25.0f) || (layout = appCompatTextView.getLayout()) == null) {
                        return;
                    }
                    int i = 0;
                    for (int i2 = 0; i2 < layout.getLineCount(); i2++) {
                        i = Math.max(i, (int) layout.getLineWidth(i2));
                    }
                    appCompatTextView.setMaxWidth(i);
                    return;
                }
                return;
            default:
                VEChooseVideoCoverFragment vEChooseVideoCoverFragment = (VEChooseVideoCoverFragment) aRunnableS5S0201000_2.l0;
                VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) aRunnableS5S0201000_2.l1;
                int measuredHeight = vEChooseVideoCoverFragment.LJLILLLLZI.getMeasuredHeight();
                int oneThumbWidth = (int) vEChooseVideoCoverFragment.LJLILLLLZI.getOneThumbWidth();
                if (vEChooseVideoCoverFragment.xl(videoPublishEditModel)) {
                    final C113564cy c113564cy = new C113564cy(oneThumbWidth, measuredHeight);
                    vEChooseVideoCoverFragment.LJLILLLLZI.setAdapter(c113564cy);
                    C6YX c6yx = new C6YX();
                    c6yx.LIZIZ = new AnonymousClass629();
                    c6yx.LJIILL = C6W9.LIZ();
                    c6yx.LJIILJJIL = oneThumbWidth;
                    c6yx.LJIIJJI = vEChooseVideoCoverFragment.LJZL;
                    c6yx.LJIIL = vEChooseVideoCoverFragment.LL;
                    c6yx.LIZ(vEChooseVideoCoverFragment.mo49getActivity(), vEChooseVideoCoverFragment.LJLLL.getEditor(), 7, new C5UO() { // from class: X.4d1
                        @Override // X.C5UO
                        public final void LIZ(List list) {
                            C113564cy c113564cy2 = C113564cy.this;
                            c113564cy2.getClass();
                            if (list == null || list.isEmpty()) {
                                return;
                            }
                            ((ArrayList) c113564cy2.LJLJI).clear();
                            ((ArrayList) c113564cy2.LJLJI).addAll(list);
                            c113564cy2.notifyDataSetChanged();
                        }
                    });
                    return;
                }
                vEChooseVideoCoverFragment.LJLILLLLZI.setAdapter(new C162606Zs(vEChooseVideoCoverFragment.LJLLI, oneThumbWidth, measuredHeight, 1));
                return;
        }
    }

    public static final void run$6(ARunnableS5S0201000_2 aRunnableS5S0201000_2) {
        boolean LIZ;
        try {
            aRunnableS5S0201000_2.LIZ$4();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$7(ARunnableS5S0201000_2 aRunnableS5S0201000_2) {
        boolean LIZ;
        try {
            aRunnableS5S0201000_2.LIZ$5();
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS5S0201000_2(C63E c63e, int i) {
        this.$t = i;
        this.l1 = c63e;
        this.i2 = -1;
        this.l0 = new ARunnableS9S0000000_2(c63e, 4);
    }

    public ARunnableS5S0201000_2(C65C c65c, int i) {
        this.$t = i;
        this.l1 = c65c;
        this.i2 = -1;
        this.l0 = new ARunnableS9S0000000_2(c65c, 7);
    }

    public ARunnableS5S0201000_2(AnonymousClass673 anonymousClass673, int i) {
        this.$t = i;
        this.l1 = anonymousClass673;
        this.i2 = -1;
        this.l0 = new ARunnableS9S0000000_2(anonymousClass673, 3);
    }

    public ARunnableS5S0201000_2(C67C c67c, int i) {
        this.$t = i;
        this.l1 = c67c;
        this.i2 = -1;
        this.l0 = new ARunnableS9S0000000_2(c67c, 6);
    }

    public ARunnableS5S0201000_2(C156556Cl c156556Cl, int i) {
        this.$t = i;
        this.l1 = c156556Cl;
        this.i2 = -1;
        this.l0 = new ARunnableS9S0000000_2(c156556Cl, 2);
    }

    public ARunnableS5S0201000_2(C1557569j c1557569j, int i) {
        this.$t = i;
        this.l1 = c1557569j;
        this.i2 = -1;
        this.l0 = RunnableC1557769l.LJLIL;
    }

    public ARunnableS5S0201000_2(int i, Object obj, Object obj2, int i2) {
        this.$t = i2;
        this.i2 = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
