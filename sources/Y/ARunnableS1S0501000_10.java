package Y;

import X.C1DH;
import X.C32151Nz;
import X.C36922EeM;
import X.C38816FLg;
import X.C61410O8g;
import X.C61447O9r;
import X.C61794ONa;
import X.C61800ONg;
import X.C63081OpJ;
import X.C80794VnK;
import X.EnumC61784OMq;
import X.FCD;
import X.InterfaceC61452O9w;
import X.OB4;
import X.OML;
import X.ONY;
import X.ONZ;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.WindowInsets;
import android.widget.LinearLayout;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.survey.FeedSurvey;
import com.ss.android.ugc.aweme.feed.model.survey.Option;
import com.ss.android.ugc.aweme.feed.model.survey.Question;
import com.zhiliaoapp.musically.R;

/* loaded from: classes11.dex */
public class ARunnableS1S0501000_10 implements Runnable {
    public final int $t;
    public int i5;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;

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
            default:
                return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0097 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ef  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ$0() {
        /*
            Method dump skipped, instructions count: 382
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS1S0501000_10.LIZ$0():void");
    }

    public final void LIZ$1() {
        String str;
        ((View) this.l0).setVisibility(4);
        C61800ONg LJIILJJIL = ((ONY) this.l1).LJIILJJIL();
        if (LJIILJJIL != null) {
            ViewStub viewStub = (ViewStub) this.l2;
            ONY ony = (ONY) this.l1;
            Context context = ony.LJLIL;
            EnumC61784OMq enumC61784OMq = ony.LLF;
            FeedSurvey feedSurvey = ony.LLD;
            String str2 = null;
            if (feedSurvey != null) {
                str = feedSurvey.getSubmitText();
            } else {
                str = null;
            }
            ONY ony2 = (ONY) this.l1;
            FeedSurvey feedSurvey2 = ony2.LLD;
            if (feedSurvey2 != null) {
                str2 = feedSurvey2.getId();
            }
            Option option = (Option) this.l3;
            int i = this.i5;
            Question question = (Question) this.l4;
            ONY ony3 = (ONY) this.l1;
            LJIILJJIL.LJII(viewStub, context, enumC61784OMq, str, ony2, str2, option, i, question, ony3.LJLILLLLZI, ony3.LL, false, ony3.LJLZ);
        }
    }

    public final void LIZ$2() {
        String str;
        ((View) this.l0).setVisibility(4);
        C61800ONg LJIILJJIL = ((C61794ONa) this.l1).LJIILJJIL();
        if (LJIILJJIL != null) {
            ViewStub viewStub = (ViewStub) this.l2;
            C61794ONa c61794ONa = (C61794ONa) this.l1;
            Context context = c61794ONa.LJLIL;
            EnumC61784OMq enumC61784OMq = c61794ONa.LL;
            FeedSurvey feedSurvey = c61794ONa.LJZL;
            String str2 = null;
            if (feedSurvey != null) {
                str = feedSurvey.getSubmitText();
            } else {
                str = null;
            }
            C61794ONa c61794ONa2 = (C61794ONa) this.l1;
            FeedSurvey feedSurvey2 = c61794ONa2.LJZL;
            if (feedSurvey2 != null) {
                str2 = feedSurvey2.getId();
            }
            Option option = (Option) this.l3;
            int i = this.i5;
            Question question = (Question) this.l4;
            C61794ONa c61794ONa3 = (C61794ONa) this.l1;
            LJIILJJIL.LJII(viewStub, context, enumC61784OMq, str, c61794ONa2, str2, option, i, question, c61794ONa3.LJLILLLLZI, c61794ONa3.LJZI, false, null);
        }
    }

    public final void LIZ$3() {
        String str;
        ((View) this.l0).setVisibility(4);
        C61800ONg LJIILJJIL = ((ONZ) this.l1).LJIILJJIL();
        if (LJIILJJIL != null) {
            ViewStub viewStub = (ViewStub) this.l2;
            ONZ onz = (ONZ) this.l1;
            Context context = onz.LJLIL;
            EnumC61784OMq enumC61784OMq = onz.LLFFF;
            FeedSurvey feedSurvey = onz.LLD;
            String str2 = null;
            if (feedSurvey != null) {
                str = feedSurvey.getSubmitText();
            } else {
                str = null;
            }
            ONZ onz2 = (ONZ) this.l1;
            FeedSurvey feedSurvey2 = onz2.LLD;
            if (feedSurvey2 != null) {
                str2 = feedSurvey2.getId();
            }
            Option option = (Option) this.l3;
            int i = this.i5;
            Question question = (Question) this.l4;
            ONZ onz3 = (ONZ) this.l1;
            Aweme aweme = onz3.LJLILLLLZI;
            OML oml = onz3.LL;
            onz3.getClass();
            LJIILJJIL.LJII(viewStub, context, enumC61784OMq, str, onz2, str2, option, i, question, aweme, oml, false, null);
        }
    }

    public final void LIZ$4() {
        String str;
        ((View) this.l0).setVisibility(4);
        C61800ONg LJIILJJIL = ((ONZ) this.l1).LJIILJJIL();
        if (LJIILJJIL != null) {
            ViewStub viewStub = (ViewStub) this.l2;
            ONZ onz = (ONZ) this.l1;
            Context context = onz.LJLIL;
            EnumC61784OMq enumC61784OMq = onz.LLFFF;
            FeedSurvey feedSurvey = onz.LLD;
            String str2 = null;
            if (feedSurvey != null) {
                str = feedSurvey.getSubmitText();
            } else {
                str = null;
            }
            ONZ onz2 = (ONZ) this.l1;
            FeedSurvey feedSurvey2 = onz2.LLD;
            if (feedSurvey2 != null) {
                str2 = feedSurvey2.getId();
            }
            Option option = (Option) this.l3;
            int i = this.i5;
            Question question = (Question) this.l4;
            ONZ onz3 = (ONZ) this.l1;
            Aweme aweme = onz3.LJLILLLLZI;
            OML oml = onz3.LL;
            onz3.getClass();
            LJIILJJIL.LJII(viewStub, context, enumC61784OMq, str, onz2, str2, option, i, question, aweme, oml, false, null);
        }
    }

    public static final void run$0(ARunnableS1S0501000_10 aRunnableS1S0501000_10) {
        boolean LIZ;
        try {
            aRunnableS1S0501000_10.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS1S0501000_10 aRunnableS1S0501000_10) {
        boolean z;
        boolean z2;
        final int LIZLLL;
        boolean z3;
        final Activity activity = (Activity) aRunnableS1S0501000_10.l0;
        int i = aRunnableS1S0501000_10.i5;
        final ViewGroup viewGroup = (ViewGroup) aRunnableS1S0501000_10.l1;
        final View view = (View) aRunnableS1S0501000_10.l2;
        final View view2 = (View) aRunnableS1S0501000_10.l3;
        final InterfaceC61452O9w interfaceC61452O9w = (InterfaceC61452O9w) aRunnableS1S0501000_10.l4;
        if (activity == null) {
            return;
        }
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        final DisplayMetrics displayMetrics = new DisplayMetrics();
        try {
            defaultDisplay.getRealMetrics(displayMetrics);
        } catch (Exception e) {
            C36922EeM.LJFF(e);
        }
        final boolean z4 = true;
        if (FCD.LJII() && C61410O8g.LJFF(activity)) {
            z = true;
        } else {
            z = false;
        }
        if (FCD.LJII() && Build.VERSION.SDK_INT >= 28 && !C61410O8g.LJFF(activity)) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z) {
            LIZLLL = 0;
        } else {
            LIZLLL = C61447O9r.LIZLLL(activity);
        }
        if (C1DH.LJJIIZ() && Build.VERSION.SDK_INT >= 28 && (Settings.Global.getInt(activity.getContentResolver(), "navigationbar_trigger_mode", 0) != 0 || Settings.Global.getInt(activity.getContentResolver(), "nav_fixed_mode", 0) != 0)) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!FCD.LIZLLL() || Settings.Secure.getInt(activity.getContentResolver(), "display_notch_status", 0) != 0) {
            z4 = false;
        }
        final int LIZIZ = C61447O9r.LIZIZ(activity);
        final int LJJJJLI = C63081OpJ.LJJJJLI(activity);
        if ((z4 && LIZIZ > 0) || z2 || z3) {
            LIZLLL -= LJJJJLI;
        }
        final int LJIILLIIL = C32151Nz.LJIILLIIL(Integer.valueOf(i));
        C38816FLg.LIZJ(new Runnable() { // from class: X.O9s
            @Override // java.lang.Runnable
            public final void run() {
                int i2;
                String str;
                int i3;
                int i4;
                boolean z5;
                boolean z6;
                boolean z7;
                WindowInsets rootWindowInsets;
                boolean z8;
                Activity activity2 = activity;
                ViewGroup viewGroup2 = viewGroup;
                View view3 = view;
                View view4 = view2;
                InterfaceC61452O9w interfaceC61452O9w2 = interfaceC61452O9w;
                DisplayMetrics displayMetrics2 = displayMetrics;
                boolean z9 = z4;
                int i5 = LIZLLL;
                int i6 = LJJJJLI;
                int i7 = LJIILLIIL;
                int i8 = LIZIZ;
                if (activity2.isFinishing() || viewGroup2 == null || view3 == null || view4 == null) {
                    return;
                }
                if (interfaceC61452O9w2 != null) {
                    interfaceC61452O9w2.onAdapterStart();
                }
                if (Build.VERSION.SDK_INT >= 23 && (rootWindowInsets = viewGroup2.getRootWindowInsets()) != null) {
                    Object LJIJI = C79081V1x.LJIJI(WindowInsets.class, "getDisplayCutout", null, null, rootWindowInsets);
                    C61447O9r c61447O9r = C57092Lx.LIZ;
                    if (LJIJI != null) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    c61447O9r.LJI = z8;
                }
                int i9 = displayMetrics2.heightPixels;
                int i10 = displayMetrics2.widthPixels;
                if (C32044Chs.LJ()) {
                    i9 = C32044Chs.LJII();
                    i10 = C32044Chs.LJIIIIZZ();
                }
                C61447O9r c61447O9r2 = C57092Lx.LIZ;
                if (c61447O9r2.LJI && !FCD.LJII() && !FCD.LIZLLL()) {
                    i2 = C63081OpJ.LJJJJLI(activity2);
                } else {
                    i2 = 0;
                }
                int i11 = i9 + i2;
                c61447O9r2.LIZJ = viewGroup2.getHeight();
                c61447O9r2.LIZLLL = z9;
                c61447O9r2.LIZ = i5;
                double d = i11 - i5;
                double d2 = d - i6;
                double d3 = i7;
                double d4 = i10;
                double d5 = (d2 - d3) / d4;
                double d6 = d2 / d4;
                double d7 = (d - d3) / d4;
                c61447O9r2.LIZIZ = i8;
                if (i5 > 0) {
                    if (d / d4 >= 1.7777777777777777d) {
                        if (d5 > 1.7777777777777777d) {
                            str = "D";
                            i3 = i6;
                            i4 = i7;
                        } else if (d6 >= 1.7777777777777777d || d7 >= 1.7777777777777777d) {
                            double d8 = d7 - 1.7777777777777777d;
                            if (d8 > LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX) {
                                double d9 = d6 - 1.7777777777777777d;
                                if (d9 < LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX || d8 < d9) {
                                    str = "E";
                                    i3 = 0;
                                    i4 = i7;
                                }
                            }
                            str = "F";
                            i3 = i6;
                            i4 = 0;
                        }
                    }
                    str = "G";
                    i3 = 0;
                    i4 = 0;
                } else if (d5 >= 1.7777777777777777d) {
                    str = "A";
                    i3 = i6;
                    i4 = i7;
                } else if (d6 < 1.7777777777777777d && d7 < 1.7777777777777777d) {
                    str = "Default";
                    i3 = 0;
                    i4 = 0;
                } else {
                    double d10 = d7 - 1.7777777777777777d;
                    if (d10 > LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX) {
                        double d11 = d6 - 1.7777777777777777d;
                        if (d11 < LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX || d10 < d11) {
                            str = "B";
                            i3 = 0;
                            i4 = i7;
                        }
                    }
                    str = "C";
                    i3 = i6;
                    i4 = 0;
                }
                C61447O9r.LJIILIIL = i3;
                C61447O9r.LJIILJJIL = i4;
                C61447O9r.LJIILL.postValue(Integer.valueOf(i4));
                if (view4.getVisibility() == 8) {
                    i3 = 0;
                }
                if (view3.getVisibility() == 8) {
                    i4 = 0;
                }
                if (i3 != 0) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                c61447O9r2.LJII = z5;
                if (i4 != 0) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                c61447O9r2.LJIIIIZZ = z6;
                if (i4 != 0) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                c61447O9r2.LJFF = z7;
                int i12 = c61447O9r2.LIZJ;
                if (i12 <= 0 || IIX.LIZ) {
                    c61447O9r2.LIZJ = (((int) d) - i3) - i4;
                } else {
                    int i13 = (((int) d) - i3) - i4;
                    if (i13 != i12) {
                        StringBuilder LJ = C7MY.LJ("realHeight:", i13, " vph:");
                        LJ.append(c61447O9r2.LIZJ);
                        C36922EeM.LIZLLL(6, "AdaptationManager", X1D.LIZIZ(LJ));
                    }
                }
                c61447O9r2.LJ.getClass();
                C3D9 c3d9 = c61447O9r2.LJ;
                c3d9.LIZ = i6;
                c3d9.LIZIZ = i4;
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) view4.getLayoutParams();
                if (layoutParams.height != i3) {
                    layoutParams.height = i3;
                    view4.setLayoutParams(layoutParams);
                }
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) view3.getLayoutParams();
                if (layoutParams2.height != i4) {
                    layoutParams2.height = i4;
                    view3.setLayoutParams(layoutParams2);
                }
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("doAdaptationV2: , realDisplayMetrics.heightPixels:");
                LIZ.append(displayMetrics2.heightPixels);
                LIZ.append(", isAndroidPHasNotch():");
                C1FL.LJFF(LIZ, c61447O9r2.LJI, ", statusBarHeight:", i6, ", realScreenHeight:");
                C15890jp.LIZIZ(LIZ, i11, ", virtualBarHeight:", i5, ", appNavHeight:");
                LIZ.append(i7);
                LIZ.append(", screenHeightWithoutVirtualBar:");
                LIZ.append(d);
                LIZ.append(", ViewPagerHeight:");
                C15890jp.LIZIZ(LIZ, c61447O9r2.LIZJ, ", topSpaceHeight:", i3, ", bottomSpaceHeight:");
                LIZ.append(i4);
                LIZ.append(", desiredTopSpaceHeight:");
                LIZ.append(C61447O9r.LJIILIIL);
                LIZ.append(", desiredBottomSpaceHeight:");
                LIZ.append(C61447O9r.LJIILJJIL);
                LIZ.append(", showTopCorner:");
                LIZ.append(c61447O9r2.LJII);
                LIZ.append(", showBottomCorner:");
                LIZ.append(c61447O9r2.LJIIIIZZ);
                LIZ.append(", plan");
                LIZ.append(str);
                X1D.LIZIZ(LIZ);
                for (int i14 = 0; i14 < viewGroup2.getChildCount(); i14++) {
                    Object tag = viewGroup2.getChildAt(i14).getTag(R.id.d87);
                    if (tag instanceof InterfaceC222408o8) {
                        ((InterfaceC222408o8) tag).LJJJJLL();
                    }
                }
                if (interfaceC61452O9w2 == null) {
                    return;
                }
                interfaceC61452O9w2.onAdapterFinish();
            }
        });
    }

    public static final void run$2(ARunnableS1S0501000_10 aRunnableS1S0501000_10) {
        boolean LIZ;
        try {
            aRunnableS1S0501000_10.LIZ$1();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$3(ARunnableS1S0501000_10 aRunnableS1S0501000_10) {
        boolean LIZ;
        try {
            aRunnableS1S0501000_10.LIZ$2();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$4(ARunnableS1S0501000_10 aRunnableS1S0501000_10) {
        boolean LIZ;
        try {
            aRunnableS1S0501000_10.LIZ$3();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$5(ARunnableS1S0501000_10 aRunnableS1S0501000_10) {
        boolean LIZ;
        try {
            aRunnableS1S0501000_10.LIZ$4();
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS1S0501000_10(Activity activity, View view, View view2, C80794VnK c80794VnK, OB4 ob4, int i) {
        this.$t = i;
        this.l0 = activity;
        this.i5 = 58;
        this.l1 = c80794VnK;
        this.l2 = view;
        this.l3 = view2;
        this.l4 = ob4;
    }

    public ARunnableS1S0501000_10(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i2) {
        this.$t = i2;
        this.l0 = obj;
        this.i5 = i;
        this.l1 = obj4;
        this.l2 = obj2;
        this.l3 = obj3;
        this.l4 = obj5;
    }
}
