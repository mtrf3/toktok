package X;

import Y.IDComparatorS30S0000000_2;
import android.content.Context;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import defpackage.a1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.58h, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1299958h extends FrameLayout {
    public static final int LJLJLLL = C134845Qy.LIZ(3.0f);
    public final List<C1300058i> LJLIL;
    public List<C1280750x> LJLILLLLZI;
    public final SparseArray<List<C1300058i>> LJLJI;
    public int LJLJJI;
    public int LJLJJL;
    public final C62822Ol8 LJLJJLL;
    public InterfaceC88472Yns<? super String, C76800UCe> LJLJL;
    public final List<C1300058i> LJLJLJ;

    public final List<C1300058i> getDropList() {
        return this.LJLIL;
    }

    public final InterfaceC88472Yns<String, C76800UCe> getOnItemClickCallback() {
        return this.LJLJL;
    }

    public final void setOnItemClickCallback(InterfaceC88472Yns<? super String, C76800UCe> interfaceC88472Yns) {
        o.LJIIIZ(interfaceC88472Yns, "<set-?>");
        this.LJLJL = interfaceC88472Yns;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1299958h(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        this.LJLIL = new ArrayList();
        this.LJLILLLLZI = C61878OQg.INSTANCE;
        this.LJLJI = new SparseArray<>();
        this.LJLJJLL = C221108m2.LIZIZ(new AqS152S0100000_2(this, 646));
        this.LJLJL = C1300358l.LJLIL;
        this.LJLJLJ = new ArrayList();
    }

    public final void LIZ(int i, int i2) {
        int i3;
        float f;
        float x;
        ((ArrayList) this.LJLJLJ).clear();
        this.LJLJJI = i;
        this.LJLJJL = i2;
        Iterator it = ((ArrayList) this.LJLIL).iterator();
        while (true) {
            i3 = 0;
            if (!it.hasNext()) {
                break;
            }
            C1300058i c1300058i = (C1300058i) it.next();
            C5BZ LIZ = c1300058i.LIZ();
            if (((Boolean) this.LJLJJLL.getValue()).booleanValue()) {
                f = i2;
                x = (getMeasuredWidth() - LIZ.getX()) - LIZ.getMeasuredWidth();
            } else {
                f = i2;
                x = LIZ.getX();
            }
            float f2 = x + f;
            float LIZIZ = C1300758p.LIZIZ() * ((float) (c1300058i.LIZJ.getEndTime() / 1000));
            if (((Boolean) this.LJLJJLL.getValue()).booleanValue()) {
                if (f2 < (-i) + c1300058i.LJIIIZ) {
                    LIZ.setTranslationX(i + f2 + LIZ.getTranslationX());
                    if ((getMeasuredWidth() - LIZ.getX()) - LIZ.getMeasuredWidth() >= LIZIZ) {
                        LIZ.setTranslationX(((getMeasuredWidth() - LIZ.getLeft()) - LIZ.getMeasuredWidth()) - LIZIZ);
                        c1300058i.LJIIIZ = 0;
                    } else {
                        ((ArrayList) this.LJLJLJ).add(c1300058i);
                    }
                } else if (LIZ.getTranslationX() != 0.0f) {
                    LIZ.setTranslationX(LIZ.getTranslationX() + f2 + i);
                    if (LIZ.getTranslationX() > 0.0f) {
                        LIZ.setTranslationX(0.0f);
                        c1300058i.LJIIIZ = 0;
                    } else {
                        ((ArrayList) this.LJLJLJ).add(c1300058i);
                    }
                }
            } else if (f2 < c1300058i.LJIIIZ + i) {
                LIZ.setTranslationX((i - f2) + LIZ.getTranslationX());
                if (LIZ.getX() >= LIZIZ) {
                    LIZ.setTranslationX(LIZIZ - LIZ.getLeft());
                    c1300058i.LJIIIZ = 0;
                } else {
                    ((ArrayList) this.LJLJLJ).add(c1300058i);
                }
            } else if (LIZ.getTranslationX() != 0.0f) {
                LIZ.setTranslationX(LIZ.getTranslationX() - (f2 - i));
                if (LIZ.getTranslationX() < 0.0f) {
                    LIZ.setTranslationX(0.0f);
                    c1300058i.LJIIIZ = 0;
                } else {
                    ((ArrayList) this.LJLJLJ).add(c1300058i);
                }
            }
        }
        ArrayList arrayList = (ArrayList) this.LJLJLJ;
        if (arrayList.size() > 1) {
            C40675Fxn.LJJLIIIJ(arrayList, new IDComparatorS30S0000000_2(21));
        }
        Iterator it2 = ((ArrayList) this.LJLJLJ).iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            int i4 = i3 + 1;
            if (i3 >= 0) {
                C1300058i c1300058i2 = (C1300058i) next;
                c1300058i2.LJIIIZ = LJLJLLL * i3;
                C5BZ LIZ2 = c1300058i2.LIZ();
                LIZ2.setTranslationX(LIZ2.getTranslationX() + c1300058i2.LJIIIZ);
                i3 = i4;
            } else {
                C47261Igj.LJJJJJ();
                throw null;
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int LIZIZ;
        int i3;
        if (View.MeasureSpec.getMode(i) == 1073741824) {
            LIZIZ = View.MeasureSpec.getSize(i);
        } else {
            Iterator it = ((ArrayList) this.LJLIL).iterator();
            long j = 0;
            while (it.hasNext()) {
                j = Math.max(j, ((C1300058i) it.next()).LIZJ.getEndTime() / 1000);
            }
            LIZIZ = (int) ((C1300758p.LIZIZ() * ((float) j)) + C1300058i.LJIIJ);
        }
        if (View.MeasureSpec.getMode(i2) == 1073741824) {
            i3 = View.MeasureSpec.getSize(i2);
        } else {
            i3 = C1300058i.LJIIJJI;
        }
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                measureChild(childAt, View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
            }
        }
        setMeasuredDimension(LIZIZ, i3);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int size = this.LJLJI.size();
        for (int i5 = 0; i5 < size; i5++) {
            int keyAt = this.LJLJI.keyAt(i5);
            List<C1300058i> list = this.LJLJI.get(keyAt);
            if (list != null) {
                if (list.size() > 1) {
                    C40675Fxn.LJJLIIIJ(list, new IDComparatorS30S0000000_2(20));
                }
                int i6 = 0;
                for (C1300058i c1300058i : list) {
                    int i7 = i6 + 1;
                    if (i6 >= 0) {
                        C5BZ LIZ = c1300058i.LIZ();
                        int i8 = LJLJLLL * i6;
                        float LIZIZ = C1300758p.LIZIZ() * keyAt;
                        if (((Boolean) this.LJLJJLL.getValue()).booleanValue()) {
                            o.LJII(getParent(), "null cannot be cast to non-null type android.view.View");
                            float measuredWidth = ((View) r1).getMeasuredWidth() - (i8 + LIZIZ);
                            LIZ.layout((int) (measuredWidth - LIZ.getMeasuredWidth()), 0, (int) measuredWidth, LIZ.getMeasuredHeight());
                        } else {
                            float f = i8 + LIZIZ;
                            LIZ.layout((int) f, 0, (int) (f + LIZ.getMeasuredWidth()), LIZ.getMeasuredHeight());
                        }
                        i6 = i7;
                    } else {
                        C47261Igj.LJJJJJ();
                        throw null;
                    }
                }
            }
        }
        LIZ(this.LJLJJI, this.LJLJJL);
    }
}
