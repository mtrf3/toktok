package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.text.DynamicLayout;
import android.text.Layout;
import android.text.SpannableString;
import android.text.style.StyleSpan;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.PathInterpolator;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.tikbot.service.BotTypingProcessInfoManager;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.3rd, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C97173rd extends LinearLayout implements InterfaceC76122ym {
    public AnimatorSet LJLIL;
    public final List<View> LJLILLLLZI;
    public C109544Rq LJLJI;

    public final C109544Rq getMsg() {
        return this.LJLJI;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC76122ym
    public final void LIZ(C76112yl c76112yl) {
        List<C76142yo> list;
        AnimatorSet.Builder builder;
        int i;
        if (c76112yl != null && (list = c76112yl.LJLIL) != null && !list.isEmpty()) {
            int size = list.size();
            int i2 = c76112yl.LJLILLLLZI;
            if (size <= i2 + 1) {
                return;
            }
            int i3 = 1;
            List<C76142yo> subList = list.subList(i2 + 1, list.size());
            if (!C1GE.LJIILIIL(subList)) {
                return;
            }
            AnimatorSet animatorSet = this.LJLIL;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            this.LJLIL = new AnimatorSet();
            BotTypingProcessInfoManager.INSTANCE.setShownIndex$im_base_release(list.size() - 1);
            ArrayList arrayList = new ArrayList();
            List<View> LIZIZ = LIZIZ(subList);
            int i4 = 0;
            if (LIZIZ != null) {
                Iterator it = ((ArrayList) LIZIZ).iterator();
                int i5 = 0;
                while (it.hasNext()) {
                    Object next = it.next();
                    int i6 = i5 + 1;
                    if (i5 >= 0) {
                        final View view = (View) next;
                        view.setAlpha(0.0f);
                        view.setVisibility(8);
                        final C76142yo c76142yo = (C76142yo) ListProtector.get(subList, i5);
                        final TextView textView = (TextView) view.findViewById(R.id.g93);
                        final String str = c76142yo.LJLIL;
                        int i7 = c76142yo.LJLILLLLZI;
                        if (i7 > i3) {
                            int measuredWidth = getMeasuredWidth();
                            if (measuredWidth <= 0) {
                                C77119UOl.LJIILJJIL(getContext());
                                O6R.LJJIIZ(C32151Nz.LJIIZILJ(44));
                            }
                            i = new DynamicLayout(str, textView.getPaint(), C47135Ieh.LIZ(64, measuredWidth), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, i3).getLineCount();
                            if (i > i7) {
                                i = i7;
                            } else if (i < i3) {
                                i = 1;
                            }
                        } else {
                            i = 1;
                        }
                        long j = i * 300;
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f);
                        int[] iArr = new int[2];
                        iArr[i4] = i4;
                        iArr[i3] = str.length() - 1;
                        ValueAnimator ofInt = ValueAnimator.ofInt(iArr);
                        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.3rc
                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                Integer num;
                                int i8;
                                o.LJIIIZ(valueAnimator, "valueAnimator");
                                Object animatedValue = valueAnimator.getAnimatedValue();
                                if (animatedValue instanceof Integer) {
                                    num = (Integer) animatedValue;
                                } else {
                                    num = null;
                                }
                                if (num != null) {
                                    i8 = num.intValue();
                                } else {
                                    i8 = 0;
                                }
                                TextView textView2 = textView;
                                C97173rd c97173rd = this;
                                String substring = str.substring(0, i8 + 1);
                                o.LJIIIIZZ(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                                C76142yo c76142yo2 = c76142yo;
                                int i9 = c76142yo2.LJLJI;
                                int i10 = c76142yo2.LJLJJI;
                                c97173rd.getClass();
                                textView2.setText(C97173rd.LIZJ(i9, i10, substring));
                            }
                        });
                        ofInt.addListener(new AnimatorListenerAdapter() { // from class: X.3rb
                            public final void LIZIZ() {
                                view.setAlpha(1.0f);
                                view.setVisibility(0);
                                TextView textView2 = textView;
                                C97173rd c97173rd = this;
                                String str2 = str;
                                C76142yo c76142yo2 = c76142yo;
                                int i8 = c76142yo2.LJLJI;
                                int i9 = c76142yo2.LJLJJI;
                                c97173rd.getClass();
                                textView2.setText(C97173rd.LIZJ(i8, i9, str2));
                            }

                            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                            public final void onAnimationCancel(Animator animation) {
                                o.LJIIIZ(animation, "animation");
                                LIZIZ();
                            }

                            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                            public final void onAnimationEnd(Animator animation) {
                                o.LJIIIZ(animation, "animation");
                                LIZIZ();
                            }

                            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                            public final void onAnimationStart(Animator animation) {
                                o.LJIIIZ(animation, "animation");
                                view.setVisibility(0);
                            }
                        });
                        PathInterpolator LIZIZ2 = C18950ol.LIZIZ(0.4f, 0.0f, 0.2f, 1.0f);
                        o.LJIIIIZZ(LIZIZ2, "create(0.4f, 0f, 0.2f, 1f)");
                        ofFloat.setInterpolator(LIZIZ2);
                        ofInt.setInterpolator(LIZIZ2);
                        ofFloat.setDuration(j);
                        ofInt.setDuration(j);
                        arrayList.add(C47261Igj.LJJIJIIJI(ofInt, ofFloat));
                        i3 = 1;
                        i4 = 0;
                        i5 = i6;
                    } else {
                        C47261Igj.LJJJJJ();
                        throw null;
                    }
                }
            }
            AnimatorSet animatorSet2 = this.LJLIL;
            if (animatorSet2 != null) {
                builder = animatorSet2.play((Animator) ORZ.LJLLJ((List) ORZ.LJLLJ(arrayList)));
            } else {
                builder = null;
            }
            long duration = ((ValueAnimator) ORZ.LJLLJ((List) ORZ.LJLLJ(arrayList))).getDuration();
            int i8 = 0;
            for (Object obj : (Iterable) ORZ.LJLLJ(arrayList)) {
                int i9 = i8 + 1;
                if (i8 >= 0) {
                    Animator animator = (Animator) obj;
                    if (i8 > 0 && builder != null) {
                        builder.with(animator);
                    }
                    i8 = i9;
                } else {
                    C47261Igj.LJJJJJ();
                    throw null;
                }
            }
            Iterator it2 = arrayList.iterator();
            long j2 = 0;
            int i10 = 0;
            while (it2.hasNext()) {
                Object next2 = it2.next();
                int i11 = i10 + 1;
                if (i10 >= 0) {
                    List<ValueAnimator> list2 = (List) next2;
                    if (i10 > 0) {
                        long j3 = duration + 100 + j2;
                        long duration2 = ((ValueAnimator) ORZ.LJLLJ(list2)).getDuration();
                        for (ValueAnimator valueAnimator : list2) {
                            valueAnimator.setStartDelay(j3);
                            if (builder != null) {
                                builder.with(valueAnimator);
                            }
                        }
                        j2 = j3;
                        duration = duration2;
                    }
                    i10 = i11;
                } else {
                    C47261Igj.LJJJJJ();
                    throw null;
                }
            }
            AnimatorSet animatorSet3 = this.LJLIL;
            if (animatorSet3 == null) {
                return;
            }
            animatorSet3.start();
        }
    }

    public final List<View> LIZIZ(List<C76142yo> list) {
        if (list.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (C76142yo c76142yo : list) {
            View view = (View) ORS.LJJLJLI(this.LJLILLLLZI);
            if (view == null) {
                view = View.inflate(getContext(), R.layout.b90, null);
            }
            TextView textView = (TextView) view.findViewById(R.id.g93);
            textView.setMaxLines(c76142yo.LJLILLLLZI);
            textView.setText(LIZJ(c76142yo.LJLJI, c76142yo.LJLJJI, c76142yo.LJLIL));
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -2);
            arrayList.add(view);
            addView(view, layoutParams);
        }
        return arrayList;
    }

    public final void setMsg(C109544Rq c109544Rq) {
        this.LJLJI = c109544Rq;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C97173rd(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        this.LJLILLLLZI = new ArrayList();
        setOrientation(1);
    }

    public static CharSequence LIZJ(int i, int i2, String str) {
        if (str.length() == 0) {
            return str;
        }
        StyleSpan styleSpan = new StyleSpan(1);
        int length = str.length();
        if (i < 0) {
            i = 0;
        }
        int i3 = length - 1;
        if (i > i3) {
            i = i3;
        }
        if (i2 < i) {
            i2 = i;
        }
        if (i2 <= length) {
            length = i2;
        }
        if (length <= i) {
            return str;
        }
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(styleSpan, i, length, 33);
        return spannableString;
    }
}
