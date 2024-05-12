package X;

import Y.ACListenerS10S1101000_1;
import Y.AObserverS69S0100000_1;
import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.MutableLiveData;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS18S1101000_1;
import kotlin.jvm.internal.o;

/* renamed from: X.4Xa, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C110944Xa extends ConstraintLayout {
    public final List<List<C110984Xe>> LJLIL;
    public C4XW LJLILLLLZI;
    public final MutableLiveData<Boolean> LJLJI;
    public boolean LJLJJI;
    public final java.util.Map<Integer, View> LJLJJL;

    public final View _$_findCachedViewById(int i) {
        java.util.Map<Integer, View> map = this.LJLJJL;
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

    public final boolean getNeedPlayAnimation() {
        return this.LJLJJI;
    }

    public final void setEmojiDataList(List<String> emojiList) {
        final int i;
        C110984Xe c110984Xe;
        o.LJIIIZ(emojiList, "emojiList");
        int size = emojiList.size();
        if (size < 2) {
            return;
        }
        int min = Math.min(size / 2, 3);
        Iterator it = ((ArrayList) this.LJLIL).iterator();
        while (true) {
            i = 0;
            if (!it.hasNext()) {
                break;
            }
            List list = (List) it.next();
            while (i < min) {
                View view = (View) ORZ.LJLLLLLL(i, list);
                if (view != null) {
                    C17N.LJJLIIIJJI(view);
                }
                i++;
            }
            for (int i2 = min; i2 < 3; i2++) {
                View view2 = (View) ORZ.LJLLLLLL(i2, list);
                if (view2 != null) {
                    C17N.LJJIIJZLJL(view2);
                }
            }
        }
        int i3 = min * 2;
        while (i < i3) {
            int i4 = i % min;
            List list2 = (List) ORZ.LJLLLLLL(i / min, this.LJLIL);
            if (list2 != null) {
                c110984Xe = (C110984Xe) ORZ.LJLLLLLL(i4, list2);
            } else {
                c110984Xe = null;
            }
            final String str = (String) ORZ.LJLLLLLL(i, emojiList);
            if (str == null) {
                str = "";
            }
            if (c110984Xe != null) {
                c110984Xe.setText((CharSequence) ORZ.LJLLLLLL(i, emojiList));
                this.LJLJI.observe(c110984Xe, new AObserverS69S0100000_1(c110984Xe, 38));
            }
            if (!this.LJLJJI) {
                if (c110984Xe != null) {
                    c110984Xe.setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS10S1101000_1(this, str, i, 1)));
                }
            } else if (c110984Xe != null) {
                c110984Xe.setOnClickListener(new ViewOnClickListenerC13880ga(new View.OnClickListener() { // from class: X.4Xc
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view3) {
                    }
                }));
                c110984Xe.setOnTouchListener(new View.OnTouchListener() { // from class: X.4Xb
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r3v2, types: [T, android.animation.ObjectAnimator, java.lang.Object] */
                    /* JADX WARN: Type inference failed for: r4v2, types: [T, android.animation.ObjectAnimator, java.lang.Object] */
                    @Override // android.view.View.OnTouchListener
                    public final boolean onTouch(View view3, MotionEvent motionEvent) {
                        C110984Xe c110984Xe2;
                        int action = motionEvent.getAction();
                        if (action != 0) {
                            if (action == 1) {
                                if ((view3 instanceof C110984Xe) && (c110984Xe2 = (C110984Xe) view3) != null) {
                                    c110984Xe2.setSelect(true);
                                }
                                C110944Xa.this.LJLJI.postValue(Boolean.TRUE);
                                int bottom = ((C110944Xa.this._$_findCachedViewById(R.id.cu5).getBottom() - C110944Xa.this._$_findCachedViewById(R.id.cu5).getTop()) / 2) + C110944Xa.this._$_findCachedViewById(R.id.cu5).getTop();
                                int right = ((C110944Xa.this._$_findCachedViewById(R.id.cu5).getRight() - C110944Xa.this._$_findCachedViewById(R.id.cu5).getLeft()) / 2) + C110944Xa.this._$_findCachedViewById(R.id.cu5).getLeft();
                                o.LJIIIIZZ(view3, "view");
                                OSZ osz = new OSZ(Integer.valueOf(bottom), Integer.valueOf(right));
                                AqS18S1101000_1 aqS18S1101000_1 = new AqS18S1101000_1(C110944Xa.this, str, i, 2);
                                float floatValue = ((Number) osz.getFirst()).floatValue() - (((view3.getBottom() - view3.getTop()) / 2.0f) + view3.getTop());
                                float floatValue2 = ((Number) osz.getSecond()).floatValue() - (((view3.getRight() - view3.getLeft()) / 2.0f) + view3.getLeft());
                                C68322mC c68322mC = new C68322mC();
                                ?? ofFloat = ObjectAnimator.ofFloat(view3, "scaleX", 0.7f, 2.0f);
                                o.LJIIIIZZ(ofFloat, "ofFloat(view, \"scaleX\", 0.7f, 2f)");
                                c68322mC.element = ofFloat;
                                C68322mC c68322mC2 = new C68322mC();
                                ?? ofFloat2 = ObjectAnimator.ofFloat(view3, "scaleY", 0.7f, 2.0f);
                                o.LJIIIIZZ(ofFloat2, "ofFloat(view, \"scaleY\", 0.7f, 2f)");
                                c68322mC2.element = ofFloat2;
                                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(view3, "translationX", view3.getTranslationX(), floatValue2);
                                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(view3, "translationY", view3.getTranslationY(), floatValue);
                                C16880lQ.LJLJJL(C88124YiG.LIZ());
                                C88124YiG.LIZ().setDuration(300L);
                                C88124YiG.LIZ().setInterpolator(C55953Lxd.LJFF());
                                C88124YiG.LIZ().play((Animator) c68322mC.element).with((Animator) c68322mC2.element).with(ofFloat3).with(ofFloat4);
                                C88124YiG.LIZ().addListener(new MKL(c68322mC, view3, c68322mC2, 0.0f - view3.getLeft(), osz, aqS18S1101000_1));
                                C88124YiG.LIZ().start();
                            }
                        } else {
                            C4XW c4xw = C110944Xa.this.LJLILLLLZI;
                            if (c4xw != null) {
                                c4xw.LIZ();
                            }
                            o.LJIIIIZZ(view3, "view");
                            ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(view3, "scaleX", 1.0f, 0.7f);
                            o.LJIIIIZZ(ofFloat5, "ofFloat(view, \"scaleX\", 1f, 0.7f)");
                            ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(view3, "scaleY", 1.0f, 0.7f);
                            o.LJIIIIZZ(ofFloat6, "ofFloat(view, \"scaleY\", 1f, 0.7f)");
                            C88124YiG.LIZIZ().setDuration(150L);
                            C88124YiG.LIZIZ().setInterpolator(new LinearInterpolator());
                            C88124YiG.LIZIZ().play(ofFloat5).with(ofFloat6);
                            C88124YiG.LIZIZ().start();
                            C88124YiG.LIZIZ().start();
                        }
                        return true;
                    }
                });
            }
            i++;
        }
    }

    public final void setEmojiViewSize(float f) {
        Iterator<List<C110984Xe>> it = this.LJLIL.iterator();
        while (it.hasNext()) {
            Iterator<C110984Xe> it2 = it.next().iterator();
            while (it2.hasNext()) {
                it2.next().LJJJ(f);
            }
        }
    }

    public final void setIncludePadding(boolean z) {
        Iterator<List<C110984Xe>> it = this.LJLIL.iterator();
        while (it.hasNext()) {
            Iterator<C110984Xe> it2 = it.next().iterator();
            while (it2.hasNext()) {
                it2.next().setIncludeFontPadding(z);
            }
        }
    }

    public final void setNeedPlayAnimation(boolean z) {
        this.LJLJJI = z;
    }

    public final void setOnEmojiSelected(C4XW c4xw) {
        this.LJLILLLLZI = c4xw;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C110944Xa(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        o.LJIIIZ(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C110944Xa(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LJLJJL = C62850Ola.LJFF(context, "context");
        ArrayList arrayList = new ArrayList();
        this.LJLIL = arrayList;
        this.LJLJI = new MutableLiveData<>();
        this.LJLJJI = true;
        ViewGroup.inflate(context, R.layout.b77, this);
        arrayList.add(C47261Igj.LJJIJIIJI(_$_findCachedViewById(R.id.ctt), _$_findCachedViewById(R.id.ctu), _$_findCachedViewById(R.id.ctv)));
        arrayList.add(C47261Igj.LJJIJIIJI(_$_findCachedViewById(R.id.ctw), _$_findCachedViewById(R.id.ctx), _$_findCachedViewById(R.id.cty)));
    }
}
