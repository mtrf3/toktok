package androidx.transition;

import X.AbstractC027608y;
import X.AbstractC03470Br;
import X.AbstractC03490Bt;
import X.C03510Bv;
import X.C1CS;
import X.C1CT;
import X.InterfaceC03480Bs;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.FragmentTransitionSupport;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class FragmentTransitionSupport extends AbstractC027608y {
    public static boolean hasSimpleTarget(AbstractC03490Bt abstractC03490Bt) {
        if (!AbstractC027608y.isNullOrEmpty(abstractC03490Bt.LJLJJL) || !AbstractC027608y.isNullOrEmpty(null) || !AbstractC027608y.isNullOrEmpty(null)) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC027608y
    public boolean canHandle(Object obj) {
        return obj instanceof AbstractC03490Bt;
    }

    @Override // X.AbstractC027608y
    public Object cloneTransition(Object obj) {
        if (obj != null) {
            return ((AbstractC03490Bt) obj).clone();
        }
        return null;
    }

    @Override // X.AbstractC027608y
    public Object wrapTransitionInSet(Object obj) {
        if (obj == null) {
            return null;
        }
        C1CT c1ct = new C1CT();
        c1ct.LJJIJL((AbstractC03490Bt) obj);
        return c1ct;
    }

    @Override // X.AbstractC027608y
    public void addTarget(Object obj, View view) {
        if (obj != null) {
            ((AbstractC03490Bt) obj).LIZIZ(view);
        }
    }

    @Override // X.AbstractC027608y
    public void addTargets(Object obj, ArrayList<View> arrayList) {
        Object obj2;
        AbstractC03490Bt abstractC03490Bt = (AbstractC03490Bt) obj;
        if (abstractC03490Bt == null) {
            return;
        }
        int i = 0;
        if (abstractC03490Bt instanceof C1CT) {
            C1CT c1ct = (C1CT) abstractC03490Bt;
            int size = c1ct.LLFZ.size();
            while (i < size) {
                if (i < 0 || i >= c1ct.LLFZ.size()) {
                    obj2 = null;
                } else {
                    obj2 = ListProtector.get(c1ct.LLFZ, i);
                }
                addTargets(obj2, arrayList);
                i++;
            }
            return;
        }
        if (!hasSimpleTarget(abstractC03490Bt) && AbstractC027608y.isNullOrEmpty(abstractC03490Bt.LJLJJLL)) {
            int size2 = arrayList.size();
            while (i < size2) {
                abstractC03490Bt.LIZIZ((View) ListProtector.get(arrayList, i));
                i++;
            }
        }
    }

    @Override // X.AbstractC027608y
    public void beginDelayedTransition(ViewGroup viewGroup, Object obj) {
        C03510Bv.LIZ(viewGroup, (AbstractC03490Bt) obj);
    }

    @Override // X.AbstractC027608y
    public void removeTarget(Object obj, View view) {
        if (obj != null) {
            ((AbstractC03490Bt) obj).LJJ(view);
        }
    }

    @Override // X.AbstractC027608y
    public void setEpicenter(Object obj, View view) {
        if (view != null) {
            final Rect rect = new Rect();
            getBoundsOnScreen(view, rect);
            ((AbstractC03490Bt) obj).LJJIIJ(new AbstractC03470Br() { // from class: X.1CO
                @Override // X.AbstractC03470Br
                public final Rect LIZ() {
                    return rect;
                }
            });
        }
    }

    @Override // X.AbstractC027608y
    public void setEpicenter(Object obj, final Rect rect) {
        if (obj != null) {
            ((AbstractC03490Bt) obj).LJJIIJ(new AbstractC03470Br() { // from class: X.1CQ
                @Override // X.AbstractC03470Br
                public final Rect LIZ() {
                    Rect rect2 = rect;
                    if (rect2 == null || rect2.isEmpty()) {
                        return null;
                    }
                    return rect;
                }
            });
        }
    }

    @Override // X.AbstractC027608y
    public Object mergeTransitionsInSequence(Object obj, Object obj2, Object obj3) {
        AbstractC03490Bt abstractC03490Bt = (AbstractC03490Bt) obj;
        AbstractC03490Bt abstractC03490Bt2 = (AbstractC03490Bt) obj2;
        AbstractC03490Bt abstractC03490Bt3 = (AbstractC03490Bt) obj3;
        if (abstractC03490Bt != null) {
            if (abstractC03490Bt2 != null) {
                C1CT c1ct = new C1CT();
                c1ct.LJJIJL(abstractC03490Bt);
                c1ct.LJJIJL(abstractC03490Bt2);
                c1ct.LJJIZ(1);
                abstractC03490Bt = c1ct;
            }
        } else if (abstractC03490Bt2 != null) {
            abstractC03490Bt = abstractC03490Bt2;
        } else {
            abstractC03490Bt = null;
        }
        if (abstractC03490Bt3 != null) {
            C1CT c1ct2 = new C1CT();
            if (abstractC03490Bt != null) {
                c1ct2.LJJIJL(abstractC03490Bt);
            }
            c1ct2.LJJIJL(abstractC03490Bt3);
            return c1ct2;
        }
        return abstractC03490Bt;
    }

    @Override // X.AbstractC027608y
    public Object mergeTransitionsTogether(Object obj, Object obj2, Object obj3) {
        C1CT c1ct = new C1CT();
        if (obj != null) {
            c1ct.LJJIJL((AbstractC03490Bt) obj);
        }
        if (obj2 != null) {
            c1ct.LJJIJL((AbstractC03490Bt) obj2);
        }
        if (obj3 != null) {
            c1ct.LJJIJL((AbstractC03490Bt) obj3);
        }
        return c1ct;
    }

    @Override // X.AbstractC027608y
    public void replaceTargets(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        Object obj2;
        AbstractC03490Bt abstractC03490Bt = (AbstractC03490Bt) obj;
        int i = 0;
        if (abstractC03490Bt instanceof C1CT) {
            C1CT c1ct = (C1CT) abstractC03490Bt;
            int size = c1ct.LLFZ.size();
            while (i < size) {
                if (i < 0 || i >= c1ct.LLFZ.size()) {
                    obj2 = null;
                } else {
                    obj2 = ListProtector.get(c1ct.LLFZ, i);
                }
                replaceTargets(obj2, arrayList, arrayList2);
                i++;
            }
            return;
        }
        if (!hasSimpleTarget(abstractC03490Bt)) {
            ArrayList<View> arrayList3 = abstractC03490Bt.LJLJJLL;
            if (arrayList3.size() == arrayList.size() && arrayList3.containsAll(arrayList)) {
                if (arrayList2 != null) {
                    int size2 = arrayList2.size();
                    while (i < size2) {
                        abstractC03490Bt.LIZIZ((View) ListProtector.get(arrayList2, i));
                        i++;
                    }
                }
                int size3 = arrayList.size();
                while (true) {
                    size3--;
                    if (size3 >= 0) {
                        abstractC03490Bt.LJJ((View) ListProtector.get(arrayList, size3));
                    } else {
                        return;
                    }
                }
            }
        }
    }

    @Override // X.AbstractC027608y
    public void scheduleHideFragmentView(Object obj, final View view, final ArrayList<View> arrayList) {
        ((AbstractC03490Bt) obj).LIZ(new InterfaceC03480Bs() { // from class: X.1CP
            @Override // X.InterfaceC03480Bs
            public final void LIZIZ(AbstractC03490Bt abstractC03490Bt) {
            }

            @Override // X.InterfaceC03480Bs
            public final void LIZLLL(AbstractC03490Bt abstractC03490Bt) {
            }

            @Override // X.InterfaceC03480Bs
            public final void LJ(C1CW c1cw) {
            }

            @Override // X.InterfaceC03480Bs
            public final void LJFF(AbstractC03490Bt abstractC03490Bt) {
            }

            @Override // X.InterfaceC03480Bs
            public final void LIZJ(AbstractC03490Bt abstractC03490Bt) {
                abstractC03490Bt.LJIL(this);
                view.setVisibility(8);
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((View) ListProtector.get(arrayList, i)).setVisibility(0);
                }
            }
        });
    }

    @Override // X.AbstractC027608y
    public void setSharedElementTargets(Object obj, View view, ArrayList<View> arrayList) {
        AbstractC03490Bt abstractC03490Bt = (AbstractC03490Bt) obj;
        ArrayList<View> arrayList2 = abstractC03490Bt.LJLJJLL;
        arrayList2.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            AbstractC027608y.bfsAddViewChildren(arrayList2, (View) ListProtector.get(arrayList, i));
        }
        arrayList2.add(view);
        arrayList.add(view);
        addTargets(abstractC03490Bt, arrayList);
    }

    @Override // X.AbstractC027608y
    public void swapSharedElementTargets(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        AbstractC03490Bt abstractC03490Bt = (AbstractC03490Bt) obj;
        if (abstractC03490Bt != null) {
            abstractC03490Bt.LJLJJLL.clear();
            abstractC03490Bt.LJLJJLL.addAll(arrayList2);
            replaceTargets(abstractC03490Bt, arrayList, arrayList2);
        }
    }

    @Override // X.AbstractC027608y
    public void scheduleRemoveTargets(Object obj, final Object obj2, final ArrayList<View> arrayList, final Object obj3, final ArrayList<View> arrayList2, final Object obj4, final ArrayList<View> arrayList3) {
        ((AbstractC03490Bt) obj).LIZ(new C1CS() { // from class: X.1hx
            @Override // X.C1CS, X.InterfaceC03480Bs
            public final void LIZIZ(AbstractC03490Bt abstractC03490Bt) {
                Object obj5 = obj2;
                if (obj5 != null) {
                    FragmentTransitionSupport.this.replaceTargets(obj5, arrayList, null);
                }
                Object obj6 = obj3;
                if (obj6 != null) {
                    FragmentTransitionSupport.this.replaceTargets(obj6, arrayList2, null);
                }
                Object obj7 = obj4;
                if (obj7 != null) {
                    FragmentTransitionSupport.this.replaceTargets(obj7, arrayList3, null);
                }
            }

            @Override // X.C1CS, X.InterfaceC03480Bs
            public final void LIZJ(AbstractC03490Bt abstractC03490Bt) {
                abstractC03490Bt.LJIL(this);
            }
        });
    }
}
