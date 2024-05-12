package X;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.aiQ, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94526aiQ extends RecyclerView {
    public static final /* synthetic */ int LLLIIIL = 0;
    public final int LLLF;
    public final int LLLFF;
    public int LLLFFI;
    public final HashMap<Class<?>, Integer> LLLFZ;
    public InterfaceC88474Ynu<? super Integer, ? super Integer, ? super View, ? super EnumC93441aQv, C76800UCe> LLLI;
    public InterfaceC88474Ynu<? super Integer, ? super Integer, ? super C94624ak0, ? super EnumC93441aQv, C76800UCe> LLLII;
    public InterfaceC88474Ynu<? super Integer, ? super Integer, ? super C94062aaw, ? super EnumC93441aQv, C76800UCe> LLLIIII;
    public final C94057aar LLLIIIIL;

    public C94526aiQ(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    private final int getTriggerIndex() {
        int i = 0;
        for (Object obj : this.LLLIIIIL.LJLJI) {
            int i2 = i + 1;
            if (i >= 0) {
                if (C94219adT.class.isAssignableFrom(obj.getClass())) {
                    return i;
                }
                i = i2;
            } else {
                C47261Igj.LJJJJJ();
                throw null;
            }
        }
        return -1;
    }

    public final View getPivotView() {
        RecyclerView.ViewHolder LJJIZ = LJJIZ(getTriggerIndex());
        if (LJJIZ != null) {
            return LJJIZ.itemView;
        }
        return null;
    }

    public final int LJLJJL(Class<?> cls) {
        Integer num = this.LLLFZ.get(cls);
        if (num == null) {
            int i = 0;
            for (Object obj : this.LLLIIIIL.LJLJI) {
                int i2 = i + 1;
                if (i >= 0) {
                    if (cls.isAssignableFrom(obj.getClass())) {
                        this.LLLFZ.put(cls, Integer.valueOf(i));
                        return i;
                    }
                    i = i2;
                } else {
                    C47261Igj.LJJJJJ();
                    throw null;
                }
            }
            return -1;
        }
        return num.intValue();
    }

    public final int LJLJJLL(Object obj) {
        List<? extends Object> list = this.LLLIIIIL.LJLJI;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (obj2 instanceof C94218adS) {
                arrayList.add(obj2);
            }
        }
        return arrayList.indexOf(obj);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        AbstractC030109x itemAnimator = getItemAnimator();
        if (itemAnimator != null && itemAnimator.LJIILJJIL()) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onDraw(Canvas canvas) {
        if (canvas != null) {
            canvas.translate(0.0f, this.LLLFFI);
        }
        super.onDraw(canvas);
    }

    public final void setOffsetY(int i) {
        this.LLLFFI = i;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C94526aiQ(android.content.Context r8, android.util.AttributeSet r9, int r10) {
        /*
            r7 = this;
            r0 = r10 & 2
            if (r0 == 0) goto L5
            r9 = 0
        L5:
            java.lang.String r0 = "context"
            kotlin.jvm.internal.o.LJIIIZ(r8, r0)
            r5 = 0
            r7.<init>(r8, r9, r5)
            r0 = 4
            int r0 = X.C93742aVm.LIZIZ(r0)
            r7.LLLF = r0
            r6 = 12
            int r0 = X.C93742aVm.LIZIZ(r6)
            r7.LLLFF = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r7.LLLFZ = r0
            X.aQb r4 = new X.aQb
            r4.<init>()
            java.lang.Class<X.aVR> r3 = X.C93721aVR.class
            X.adg r2 = new X.adg
            r2.<init>()
            kotlin.jvm.internal.IDqS442S0100000_42 r1 = new kotlin.jvm.internal.IDqS442S0100000_42
            r0 = 1
            r1.<init>(r7, r0)
            r2.LIZ = r1
            r4.LIZ(r3, r2)
            java.lang.Class<X.aVQ> r3 = X.C93720aVQ.class
            X.ade r2 = new X.ade
            r2.<init>()
            kotlin.jvm.internal.IDqS442S0100000_42 r1 = new kotlin.jvm.internal.IDqS442S0100000_42
            r0 = 0
            r1.<init>(r7, r0)
            r2.LIZ = r1
            r4.LIZ(r3, r2)
            java.lang.Class<X.adS> r3 = X.C94218adS.class
            X.adi r2 = new X.adi
            r2.<init>()
            kotlin.jvm.internal.IDqS442S0100000_42 r1 = new kotlin.jvm.internal.IDqS442S0100000_42
            r0 = 2
            r1.<init>(r7, r0)
            r2.LIZ = r1
            r4.LIZ(r3, r2)
            java.lang.Class<X.adT> r3 = X.C94219adT.class
            X.adl r2 = new X.adl
            r2.<init>()
            kotlin.jvm.internal.IDqS442S0100000_42 r1 = new kotlin.jvm.internal.IDqS442S0100000_42
            r0 = 3
            r1.<init>(r7, r0)
            r2.LIZ = r1
            r4.LIZ(r3, r2)
            X.aar r4 = r4.LIZ
            r7.LLLIIIIL = r4
            int r3 = X.C93742aVm.LIZIZ(r5)
            r0 = 3
            int r2 = X.C93742aVm.LIZIZ(r0)
            int r1 = X.C93742aVm.LIZIZ(r5)
            int r0 = X.C93742aVm.LIZIZ(r0)
            r7.setPadding(r3, r2, r1, r0)
            r7.setClipChildren(r5)
            r7.setClipToPadding(r5)
            android.graphics.drawable.GradientDrawable r2 = new android.graphics.drawable.GradientDrawable
            r2.<init>()
            r2.mutate()
            r2.setShape(r5)
            android.content.Context r1 = r7.getContext()
            r0 = 1711472647(0x66030007, float:1.5465763E23)
            int r0 = X.C04330Ez.LIZIZ(r1, r0)
            r2.setColor(r0)
            int r0 = X.C93742aVm.LIZIZ(r6)
            float r0 = (float) r0
            r2.setCornerRadius(r0)
            r7.setBackground(r2)
            androidx.recyclerview.widget.LinearLayoutManager r1 = new androidx.recyclerview.widget.LinearLayoutManager
            r1.<init>()
            r0 = 1
            r1.LLJJIII(r0)
            r7.setLayoutManager(r1)
            X.aiP r0 = new X.aiP
            r0.<init>()
            r7.setItemAnimator(r0)
            r7.setAdapter(r4)
            X.0gh r0 = new X.0gh
            r0.<init>()
            r7.addOnAttachStateChangeListener(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C94526aiQ.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public final void LJLJL(AbstractC94370afu command, boolean z, boolean z2, int i, EnumC93441aQv activeType, boolean z3, InterfaceC88474Ynu<? super Integer, ? super Integer, ? super View, ? super EnumC93441aQv, C76800UCe> interfaceC88474Ynu) {
        C94217adR c94217adR;
        int i2;
        boolean z4;
        int i3;
        o.LJIIIZ(command, "command");
        o.LJIIIZ(activeType, "activeType");
        ArrayList arrayList = new ArrayList();
        if (z) {
            arrayList.add(new C93721aVR());
            int i4 = this.LLLF;
            setPadding(0, i4, 0, i4);
        } else {
            int i5 = this.LLLFF;
            setPadding(0, i5, 0, i5);
        }
        C94666akg LJII = command.LJII();
        String LIZLLL = LJII.LIZLLL();
        EnumC93994aZq LJII2 = LJII.LJII();
        Double LJI = LJII.LJI();
        C94665akf LJFF = LJII.LJFF();
        if (LJFF != null) {
            c94217adR = new C94217adR(LJFF.LIZJ());
        } else {
            c94217adR = null;
        }
        int i6 = C93687aUt.LIZ[activeType.ordinal()];
        if (i6 != 1) {
            if (i6 != 2) {
                i2 = 0;
            } else {
                i2 = 1;
            }
        } else {
            i2 = 2;
        }
        arrayList.add(new C94219adT(LIZLLL, LJII2, LJI, c94217adR, i2));
        List<AbstractC94372afw> LJI2 = command.LJI();
        ArrayList arrayList2 = new ArrayList(C32I.LJJL(LJI2, 10));
        int i7 = 0;
        for (AbstractC94372afw abstractC94372afw : LJI2) {
            int i8 = i7 + 1;
            if (i7 >= 0) {
                AbstractC94372afw abstractC94372afw2 = abstractC94372afw;
                List<AbstractC94512aiC> LJ = abstractC94372afw2.LJ();
                ArrayList arrayList3 = new ArrayList(C32I.LJJL(LJ, 10));
                Iterator<AbstractC94512aiC> it = LJ.iterator();
                while (it.hasNext()) {
                    arrayList3.add(new C94217adR(it.next().LIZJ()));
                }
                String LIZLLL2 = abstractC94372afw2.LIZLLL().LIZLLL();
                EnumC93988aZk LJFF2 = abstractC94372afw2.LIZLLL().LJFF();
                Double valueOf = Double.valueOf(abstractC94372afw2.LIZLLL().LJ());
                if (i7 == 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                int LIZIZ = abstractC94372afw2.LIZIZ();
                if (i == i7) {
                    int i9 = C93687aUt.LIZIZ[activeType.ordinal()];
                    if (i9 != 1) {
                        if (i9 != 2) {
                            i3 = 0;
                        } else {
                            i3 = 2;
                        }
                    } else {
                        i3 = 1;
                    }
                } else {
                    i3 = 0;
                }
                arrayList2.add(new C94218adS(arrayList3, LIZLLL2, LJFF2, valueOf, z4, z2, LIZIZ, i3));
                i7 = i8;
            } else {
                C47261Igj.LJJJJJ();
                throw null;
            }
        }
        arrayList.addAll(arrayList2);
        if (z) {
            arrayList.add(new C93720aVQ());
        }
        C94057aar c94057aar = this.LLLIIIIL;
        List<? extends Object> list = c94057aar.LJLJI;
        c94057aar.LJLJI = arrayList;
        if (z3) {
            c94057aar.notifyDataSetChanged();
        } else {
            C03200Aq.LIZ(new C94063aax(list, arrayList), true).LIZJ(this.LLLIIIIL);
        }
        this.LLLI = interfaceC88474Ynu;
    }
}
