package X;

import Y.ACallableS1S0002000_4;
import Y.ARunnableS15S0300000_4;
import Y.AUListenerS90S0100000_1;
import Y.AUListenerS93S0200000_1;
import Y.IDAListenerS38S0200000_4;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Color;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveChatShowDelayForHotLiveSetting;
import com.bytedance.touchpoint.core.model.FeedBottomTip;
import com.bytedance.touchpoint.core.model.TipText;
import com.bytedance.touchpoint.core.model.TouchPoint;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.95D, reason: invalid class name */
/* loaded from: classes5.dex */
public final class C95D implements C95P {
    public static final java.util.Map<String, FeedBottomTip> LJIIL = new LinkedHashMap();
    public static String LJIILIIL;
    public static FeedBottomTip LJIILJJIL;
    public ViewGroup LIZ;
    public final Handler LIZIZ = new Handler(C16880lQ.LLJJJJ());
    public FeedBottomTip LIZJ;
    public W5G LIZLLL;
    public W5G LJ;
    public TuxTextView LJFF;
    public View LJI;
    public Animator LJII;
    public Animator LJIIIIZZ;
    public boolean LJIIIZ;
    public boolean LJIIJ;
    public String LJIIJJI;

    public static C95F LIZJ() {
        return (C95F) C95J.LIZ(13);
    }

    public final void LJIIIIZZ() {
        String str = this.LJIIJJI;
        if (str != null) {
            LJIIL.remove(str);
        }
        ViewGroup viewGroup = this.LIZ;
        if (viewGroup != null) {
            viewGroup.setVisibility(8);
        }
        Animator animator = this.LJII;
        if (animator != null) {
            animator.cancel();
        }
        Animator animator2 = this.LJIIIIZZ;
        if (animator2 != null) {
            animator2.cancel();
        }
        this.LJII = null;
        this.LJIIIIZZ = null;
        this.LIZIZ.removeCallbacksAndMessages(null);
        this.LJIIIZ = false;
        this.LJIIJ = false;
        this.LIZJ = null;
        this.LJIIJJI = null;
    }

    public final void LIZLLL(ViewStub viewStub) {
        W5G w5g;
        W5G w5g2;
        TuxTextView tuxTextView = null;
        if (this.LIZ == null) {
            View inflate = viewStub.inflate();
            if (inflate != null) {
                ViewGroup viewGroup = (ViewGroup) inflate;
                this.LIZ = viewGroup;
                if ((viewGroup instanceof View) && viewGroup != null) {
                    C16880lQ.LJIIJ(new View.OnClickListener() { // from class: X.920
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                        }
                    }, viewGroup);
                }
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
            }
        }
        if (this.LIZLLL == null) {
            ViewGroup viewGroup2 = this.LIZ;
            if (viewGroup2 != null) {
                w5g2 = (W5G) viewGroup2.findViewById(R.id.ejy);
            } else {
                w5g2 = null;
            }
            this.LIZLLL = w5g2;
        }
        if (this.LJ == null) {
            ViewGroup viewGroup3 = this.LIZ;
            if (viewGroup3 != null) {
                w5g = (W5G) viewGroup3.findViewById(R.id.eje);
            } else {
                w5g = null;
            }
            this.LJ = w5g;
        }
        if (this.LJFF == null) {
            ViewGroup viewGroup4 = this.LIZ;
            if (viewGroup4 != null) {
                tuxTextView = (TuxTextView) viewGroup4.findViewById(R.id.m2v);
            }
            this.LJFF = tuxTextView;
        }
    }

    public final void LJ(Context context) {
        C95F LIZJ;
        Animator animator = this.LJIIIIZZ;
        if (animator != null) {
            animator.start();
        }
        String str = this.LJIIJJI;
        FeedBottomTip feedBottomTip = LJIILJJIL;
        if (str != null && o.LJ(str, LJIILIIL) && feedBottomTip != null) {
            LJIIL.put(str, feedBottomTip);
        }
        LJIILIIL = null;
        LJIILJJIL = null;
        Animator animator2 = this.LJIIIIZZ;
        if (animator2 != null && animator2.isRunning() && (LIZJ = LIZJ()) != null) {
            LIZJ.LJ(context);
        }
    }

    public final void LJII(FeedBottomTip feedBottomTip) {
        String str;
        this.LJIIIZ = true;
        C243649hI LIZ = C95I.LIZ();
        String valueOf = String.valueOf(feedBottomTip.LIZ);
        C247339nF.LJI.getClass();
        C247289nA LIZJ = C247409nM.LIZJ();
        if (LIZJ != null && LIZJ.LIZJ()) {
            str = "tiktok_now";
        } else {
            str = "";
        }
        String LJ = C247409nM.LJ();
        InterfaceC243629hG interfaceC243629hG = new InterfaceC243629hG() { // from class: X.95E
            @Override // X.InterfaceC243629hG
            public final void LIZ() {
            }

            @Override // X.InterfaceC243629hG
            public final void LIZIZ() {
            }

            @Override // X.InterfaceC243629hG
            public final void onFail() {
                C95D c95d = C95D.this;
                c95d.LJIIIZ = false;
                c95d.LJIIJ = true;
            }

            @Override // X.InterfaceC243629hG
            public final void onSuccess(List<TouchPoint> touchPoints) {
                C95D c95d = C95D.this;
                c95d.LJIIIZ = false;
                c95d.LJIIJ = true;
                if (touchPoints == null || touchPoints.isEmpty()) {
                    return;
                }
                C9O7 LIZ2 = C2MW.LIZ();
                LIZ2.getClass();
                o.LJIIIZ(touchPoints, "touchPoints");
                HashMap<Integer, TouchPoint> hashMap = new HashMap<>();
                ArrayList arrayList = new ArrayList();
                for (TouchPoint touchPoint : touchPoints) {
                    if (touchPoint.touchPointId == 13) {
                        arrayList.add(touchPoint);
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    TouchPoint touchPoint2 = (TouchPoint) it.next();
                    LIZ2.LIZIZ.put(Integer.valueOf(touchPoint2.touchPointId), touchPoint2);
                    hashMap.put(Integer.valueOf(touchPoint2.touchPointId), touchPoint2);
                }
                new C9MI().LIZ(hashMap);
                C95D.this.LIZJ = (FeedBottomTip) C2MW.LIZ().LIZLLL(13);
            }
        };
        LIZ.getClass();
        C243649hI.LIZ(valueOf, str, LJ, interfaceC243629hG);
    }

    @Override // X.C95P
    public final void onConfigurationChanged(Configuration newConfig) {
        o.LJIIIZ(newConfig, "newConfig");
        LJIIIIZZ();
    }

    public static final void LJFF(Context context, C136815Yn c136815Yn) {
        C95F LIZJ;
        View LIZIZ;
        float LIZJ2;
        int i;
        ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(context);
        if (c136815Yn == null || LJJIFFI == null || (LIZJ = LIZJ()) == null || (LIZIZ = LIZJ.LIZIZ(LJJIFFI)) == null) {
            return;
        }
        int[] iArr = new int[2];
        LIZIZ.getLocationInWindow(iArr);
        if (C251659uD.LIZ()) {
            AbstractC247499nV abstractC247499nV = (AbstractC247499nV) C95J.LIZ(0);
            if (abstractC247499nV != null) {
                i = abstractC247499nV.LJIIJJI();
            } else {
                i = 0;
            }
            LIZJ2 = (i - KL2.LIZJ(context, 12.0f)) - c136815Yn.getWidth();
        } else {
            LIZJ2 = KL2.LIZJ(context, 12.0f);
        }
        c136815Yn.setBubbleLegOffset(((LIZIZ.getWidth() / 2) + iArr[0]) - ((int) LIZJ2));
    }

    public static boolean LIZIZ(boolean z, String str, List list, FeedBottomTip feedBottomTip) {
        List<String> list2;
        if (z) {
            return false;
        }
        if (feedBottomTip.videoIds == null || !(!r0.isEmpty()) || (list2 = feedBottomTip.videoIds) == null || !ORZ.LJLJJI(str, list2)) {
            if (feedBottomTip.hashtagIds != null && (!r0.isEmpty()) && list != null) {
                boolean z2 = false;
                for (Object obj : list) {
                    List<String> list3 = feedBottomTip.hashtagIds;
                    if (list3 != null && list3.contains(obj)) {
                        z2 = true;
                    }
                }
                if (z2) {
                }
            }
            return false;
        }
        return true;
    }

    public final boolean LIZ(Context context, boolean z, String str, List<String> list, FeedBottomTip feedBottomTip) {
        TipText tipText;
        String str2;
        int i;
        ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(context);
        if (LJJIFFI == null || !LIZIZ(z, str, list, feedBottomTip) || (tipText = feedBottomTip.tipText) == null || (str2 = tipText.text) == null || str2.length() <= 0) {
            return false;
        }
        C95F LIZJ = LIZJ();
        if (LIZJ != null && !LIZJ.LIZLLL(LJJIFFI)) {
            return false;
        }
        View view = this.LJI;
        if (view != null) {
            i = view.getHeight();
        } else {
            i = 0;
        }
        if (i > KL2.LIZJ(context, 20.0f)) {
            return false;
        }
        C95F LIZJ2 = LIZJ();
        if (LIZJ2 != null && !LIZJ2.LIZJ(LJJIFFI)) {
            return false;
        }
        return true;
    }

    public final void LJI(final Context context, final boolean z, final String str, final List<String> list, ViewStub viewStub) {
        Context context2;
        if (context != null && str != null) {
            Activity LJIJJ = C45804HyK.LJIJJ(context);
            if (LJIJJ == null || !LJIJJ.isFinishing()) {
                if (!(context instanceof Activity)) {
                    context2 = null;
                } else {
                    context2 = context;
                }
                Activity activity = (Activity) context2;
                if (activity != null && activity.isDestroyed()) {
                    return;
                }
                FeedBottomTip feedBottomTip = this.LIZJ;
                if ((feedBottomTip == null && (feedBottomTip = (FeedBottomTip) C2MW.LIZ().LIZLLL(13)) == null) || !LIZ(context, z, str, list, feedBottomTip)) {
                    return;
                }
                if (viewStub != null) {
                    LIZLLL(viewStub);
                }
                final ViewGroup viewGroup = this.LIZ;
                if (viewGroup == null) {
                    return;
                }
                if (!this.LJIIIZ && !this.LJIIJ) {
                    LJII(feedBottomTip);
                }
                this.LJIIJJI = str;
                this.LIZIZ.postDelayed(new Runnable() { // from class: X.95K
                    public final void LIZ() {
                        int i;
                        boolean z2;
                        int i2;
                        int i3;
                        String str2;
                        List<String> list2;
                        Integer num;
                        String str3;
                        TuxTextView tuxTextView;
                        String str4;
                        AbstractC247499nV abstractC247499nV;
                        C95D c95d = C95D.this;
                        Context context3 = context;
                        boolean z3 = z;
                        String str5 = str;
                        List<String> list3 = list;
                        ViewGroup viewGroup2 = viewGroup;
                        FeedBottomTip feedBottomTip2 = c95d.LIZJ;
                        if (feedBottomTip2 == null || !c95d.LIZ(context3, z3, str5, list3, feedBottomTip2)) {
                            return;
                        }
                        Activity LJIJJ2 = C45804HyK.LJIJJ(context3);
                        if (LJIJJ2 != null && (abstractC247499nV = (AbstractC247499nV) C95J.LIZ(0)) != null) {
                            abstractC247499nV.LIZIZ(LJIJJ2, c95d);
                        }
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append("real show touchPointId:");
                        LIZ.append(feedBottomTip2.LIZ);
                        LIZ.append(",launchPlanId:");
                        Integer num2 = feedBottomTip2.LIZJ;
                        if (num2 != null) {
                            i = num2.intValue();
                        } else {
                            i = 0;
                        }
                        LIZ.append(i);
                        X1D.LIZIZ(LIZ);
                        if (str5 != null) {
                            C95D.LJIIL.put(str5, feedBottomTip2);
                        }
                        TuxTextView tuxTextView2 = c95d.LJFF;
                        ViewGroup viewGroup3 = null;
                        if (tuxTextView2 != null) {
                            TipText tipText = feedBottomTip2.tipText;
                            if (tipText != null) {
                                str4 = tipText.text;
                            } else {
                                str4 = null;
                            }
                            tuxTextView2.setText(str4);
                        }
                        try {
                            TipText tipText2 = feedBottomTip2.tipText;
                            if (tipText2 != null && (str3 = tipText2.color) != null && str3.length() > 0 && (tuxTextView = c95d.LJFF) != null) {
                                tuxTextView.setTextColor(Color.parseColor(str3));
                            }
                        } catch (IllegalArgumentException unused) {
                        }
                        String str6 = feedBottomTip2.leftIcon;
                        if (str6 == null || str6.length() == 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (z2) {
                            W5G w5g = c95d.LIZLLL;
                            if (w5g != null) {
                                w5g.setVisibility(8);
                            }
                        } else {
                            W5G w5g2 = c95d.LIZLLL;
                            if (w5g2 != null) {
                                w5g2.setVisibility(0);
                            }
                            W5G w5g3 = c95d.LIZLLL;
                            if (w5g3 != null) {
                                w5g3.setImageURI(feedBottomTip2.leftIcon);
                            }
                        }
                        String str7 = feedBottomTip2.rightIcon;
                        if (str7 == null || str7.length() == 0) {
                            W5G w5g4 = c95d.LJ;
                            if (w5g4 != null) {
                                w5g4.setVisibility(8);
                            }
                        } else {
                            W5G w5g5 = c95d.LJ;
                            if (w5g5 != null) {
                                w5g5.setVisibility(0);
                            }
                            W5G w5g6 = c95d.LJ;
                            if (w5g6 != null) {
                                w5g6.setImageURI(feedBottomTip2.rightIcon);
                            }
                        }
                        ViewGroup viewGroup4 = c95d.LIZ;
                        if (!(viewGroup4 instanceof C136815Yn)) {
                            viewGroup4 = null;
                        }
                        C136815Yn c136815Yn = (C136815Yn) viewGroup4;
                        if (c136815Yn != null && (list2 = feedBottomTip2.backgroundColor) != null && (!list2.isEmpty())) {
                            List<String> list4 = feedBottomTip2.backgroundColor;
                            if (list4 != null) {
                                num = Integer.valueOf(list4.size());
                            } else {
                                num = null;
                            }
                            int intValue = num.intValue();
                            int[] iArr = new int[intValue];
                            try {
                                List<String> list5 = feedBottomTip2.backgroundColor;
                                if (list5 != null) {
                                    int i4 = 0;
                                    for (String str8 : list5) {
                                        int i5 = i4 + 1;
                                        if (i4 >= 0) {
                                            iArr[i4] = Color.parseColor(str8);
                                            i4 = i5;
                                        } else {
                                            C47261Igj.LJJJJJ();
                                            throw null;
                                        }
                                    }
                                }
                            } catch (IllegalArgumentException unused2) {
                            }
                            if (intValue > 1) {
                                c136815Yn.lambda$setGradient$0(iArr, feedBottomTip2.gradientType);
                            } else if (intValue == 1) {
                                c136815Yn.setBubbleColor(iArr[0]);
                            }
                        }
                        String str9 = "";
                        if (str5 == null) {
                            str5 = "";
                        }
                        java.util.Map<String, String> map = feedBottomTip2.eventParams;
                        if (map != null && (str2 = map.get("show_reason")) != null) {
                            str9 = str2;
                        }
                        LinkedHashMap LIZIZ = JF1.LIZIZ("enter_from", "homepage_hot", "item_id", str5);
                        LIZIZ.put("show_reason", str9);
                        InterfaceC247459nR interfaceC247459nR = C95J.LIZ;
                        if (interfaceC247459nR != null) {
                            interfaceC247459nR.LIZIZ("now_bubble_show", LIZIZ);
                        }
                        int i6 = feedBottomTip2.LIZ;
                        Integer num3 = feedBottomTip2.LIZJ;
                        if (num3 != null) {
                            i2 = num3.intValue();
                        } else {
                            i2 = 0;
                        }
                        C10K.LIZJ(new ACallableS1S0002000_4(i6, i2, 2));
                        viewGroup2.setVisibility(0);
                        Object parent = viewGroup2.getParent();
                        if (!(parent instanceof ViewGroup)) {
                            parent = null;
                        }
                        View view = (View) parent;
                        if (view != null) {
                            viewGroup2.measure(View.MeasureSpec.makeMeasureSpec(view.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(LiveChatShowDelayForHotLiveSetting.DEFAULT, LiveLayoutPreloadThreadPriority.DEFAULT));
                            i3 = viewGroup2.getMeasuredHeight();
                        } else {
                            i3 = 0;
                        }
                        ViewGroup.LayoutParams layoutParams = viewGroup2.getLayoutParams();
                        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                            layoutParams = null;
                        }
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                        if (marginLayoutParams != null) {
                            marginLayoutParams.bottomMargin = -i3;
                        }
                        viewGroup2.setLayoutParams(marginLayoutParams);
                        ValueAnimator ofInt = ValueAnimator.ofInt(-i3, (int) KL2.LIZJ(context3, 4.0f));
                        ofInt.setDuration(300L);
                        ofInt.addUpdateListener(new AUListenerS93S0200000_1((View) viewGroup2, marginLayoutParams, 6));
                        ofInt.setInterpolator(C18950ol.LIZIZ(0.25f, 0.0f, 0.25f, 1.0f));
                        ValueAnimator it = ValueAnimator.ofFloat(0.0f, 1.0f);
                        o.LJIIIIZZ(it, "it");
                        it.setDuration(300L);
                        it.addUpdateListener(new AUListenerS90S0100000_1(viewGroup2, 87));
                        it.setInterpolator(C18950ol.LIZIZ(0.25f, 0.0f, 0.25f, 1.0f));
                        AnimatorSet animatorSet = new AnimatorSet();
                        c95d.LJII = animatorSet;
                        animatorSet.playTogether(ofInt, it);
                        animatorSet.addListener(new IDAListenerS38S0200000_4(c95d, context3, 6));
                        animatorSet.setInterpolator(C18950ol.LIZIZ(0.25f, 0.0f, 0.25f, 1.0f));
                        animatorSet.start();
                        ViewGroup viewGroup5 = c95d.LIZ;
                        if (viewGroup5 instanceof C136815Yn) {
                            viewGroup3 = viewGroup5;
                        }
                        C136815Yn c136815Yn2 = (C136815Yn) viewGroup3;
                        if (c136815Yn2 == null) {
                            return;
                        }
                        if (c136815Yn2.getWidth() <= 0 || c136815Yn2.getHeight() <= 0) {
                            c136815Yn2.post(new ARunnableS15S0300000_4(c95d, context3, c136815Yn2, 21));
                        } else {
                            C95D.LJFF(context3, c136815Yn2);
                        }
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean LIZ;
                        try {
                            LIZ();
                        } finally {
                            if (LIZ) {
                            }
                        }
                    }
                }, feedBottomTip.delaySeconds * 1000);
            }
        }
    }
}
