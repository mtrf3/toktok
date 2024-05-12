package com.bytedance.android.live.effect.sticker.list;

import X.C0A2;
import X.C0A7;
import X.C0AC;
import X.C0G3;
import X.C0G4;
import X.C0LV;
import X.C0LX;
import X.C0LY;
import X.C0LZ;
import X.C118234kV;
import X.C15380j0;
import X.C1C9;
import X.C32I;
import X.C40511Fv9;
import X.C40517FvF;
import X.C40675Fxn;
import X.C78841Uwv;
import X.C78842Uww;
import X.OQY;
import X.ORZ;
import Y.IDCreatorS45S0000000;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.effect.sticker.list.SpannedGridLayoutManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.o;

/* loaded from: classes.dex */
public class SpannedGridLayoutManager extends C0A2 {
    public final C0LY LJLZ;
    public final int LJZ;
    public int LJZI;
    public C0G3 LJZL;
    public int LL;
    public int LLD;
    public final Map<Integer, Rect> LLF;
    public Integer LLFF;
    public boolean LLFFF;
    public C0LZ LLFII;

    @Override // X.C0A2
    public final boolean LJIJJLI() {
        if (this.LJLZ == C0LY.HORIZONTAL) {
            return true;
        }
        return false;
    }

    @Override // X.C0A2
    public final boolean LJIL() {
        if (this.LJLZ == C0LY.VERTICAL) {
            return true;
        }
        return false;
    }

    @Override // X.C0A2
    public final RecyclerView.LayoutParams LJJIJL() {
        return new RecyclerView.LayoutParams(-1, -2);
    }

    @Override // X.C0A2
    public final Parcelable LJLJLJ() {
        if (this.LLFFF && LJJJI() > 0) {
            return new SavedState(LLIIJLIL());
        }
        return null;
    }

    public final int LLIIL() {
        if (this.LJLZ == C0LY.VERTICAL) {
            return getPaddingBottom();
        }
        return getPaddingRight();
    }

    public final int LLIILII() {
        if (this.LJLZ == C0LY.VERTICAL) {
            return getPaddingTop();
        }
        return getPaddingLeft();
    }

    public final C0G3 LLIILZL() {
        C0G3 c0g3 = this.LJZL;
        if (c0g3 != null) {
            return c0g3;
        }
        o.LJIJI("rectsHelper");
        throw null;
    }

    public final int LLIIZ() {
        if (this.LJLZ == C0LY.VERTICAL) {
            return this.LJLLLLLL;
        }
        return this.LJLLLL;
    }

    public final int LLIIJLIL() {
        View LJJJ;
        if (LJJJI() == 0 || (LJJJ = LJJJ(0)) == null) {
            return 0;
        }
        return C0A2.LJJJLL(LJJJ);
    }

    /* loaded from: classes.dex */
    public static final class SavedState implements Parcelable {
        public final int firstVisibleItem;
        public static final C0LV Companion = new Object() { // from class: X.0LV
        };
        public static final Parcelable.Creator<SavedState> CREATOR = new IDCreatorS45S0000000(42);

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public SavedState(int i) {
            this.firstVisibleItem = i;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            o.LJIIIZ(dest, "dest");
            dest.writeInt(this.firstVisibleItem);
        }
    }

    public SpannedGridLayoutManager(C0LY orientation) {
        o.LJIIIZ(orientation, "orientation");
        this.LJLZ = orientation;
        this.LJZ = 5;
        this.LLF = new LinkedHashMap();
    }

    @Override // X.C0A2
    public final int LJJIIJ(C0AC state) {
        o.LJIIIZ(state, "state");
        return LJJJI();
    }

    @Override // X.C0A2
    public final int LJJIIJZLJL(C0AC state) {
        o.LJIIIZ(state, "state");
        if (LJJJI() == 0) {
            return 0;
        }
        return LLIIJLIL();
    }

    @Override // X.C0A2
    public final int LJJIIZ(C0AC state) {
        o.LJIIIZ(state, "state");
        return state.LIZIZ();
    }

    @Override // X.C0A2
    public final int LJJIIZI(C0AC state) {
        o.LJIIIZ(state, "state");
        return LJJJI();
    }

    @Override // X.C0A2
    public final int LJJIJ(C0AC state) {
        o.LJIIIZ(state, "state");
        if (LJJJI() == 0) {
            return 0;
        }
        return LLIIJLIL();
    }

    @Override // X.C0A2
    public final int LJJIJIIJI(C0AC state) {
        o.LJIIIZ(state, "state");
        return state.LIZIZ();
    }

    @Override // X.C0A2
    public final int LJJJJIZL(View child) {
        o.LJIIIZ(child, "child");
        int LJJJLL = C0A2.LJJJLL(child);
        int LJJIZ = C0A2.LJJIZ(child) + C0A2.LJJLI(child);
        Rect rect = (Rect) ((LinkedHashMap) this.LLF).get(Integer.valueOf(LJJJLL));
        if (rect != null) {
            LJJIZ = rect.bottom;
        }
        if (this.LJLZ == C0LY.VERTICAL) {
            return LJJIZ - (this.LJZI - LLIILII());
        }
        return LJJIZ;
    }

    @Override // X.C0A2
    public final int LJJJJJ(View child) {
        o.LJIIIZ(child, "child");
        int LJJJLL = C0A2.LJJJLL(child);
        int LJJJLIIL = C0A2.LJJJLIIL(child);
        Rect rect = (Rect) ((LinkedHashMap) this.LLF).get(Integer.valueOf(LJJJLL));
        if (rect != null) {
            LJJJLIIL = rect.left;
        }
        if (this.LJLZ == C0LY.HORIZONTAL) {
            return LJJJLIIL - this.LJZI;
        }
        return LJJJLIIL;
    }

    @Override // X.C0A2
    public final int LJJJJJL(View child) {
        o.LJIIIZ(child, "child");
        int LJJJLL = C0A2.LJJJLL(child);
        Rect rect = (Rect) ((LinkedHashMap) this.LLF).get(Integer.valueOf(LJJJLL));
        if (rect != null) {
            return rect.height();
        }
        return 0;
    }

    @Override // X.C0A2
    public final int LJJJJL(View child) {
        o.LJIIIZ(child, "child");
        int LJJJLL = C0A2.LJJJLL(child);
        Rect rect = (Rect) ((LinkedHashMap) this.LLF).get(Integer.valueOf(LJJJLL));
        if (rect != null) {
            return rect.width();
        }
        return 0;
    }

    @Override // X.C0A2
    public final int LJJJJLI(View child) {
        o.LJIIIZ(child, "child");
        int LJJJLL = C0A2.LJJJLL(child);
        int LJJJZ = C0A2.LJJJZ(child) + C0A2.LJJJLIIL(child);
        Rect rect = (Rect) ((LinkedHashMap) this.LLF).get(Integer.valueOf(LJJJLL));
        if (rect != null) {
            LJJJZ = rect.right;
        }
        if (this.LJLZ == C0LY.HORIZONTAL) {
            return LJJJZ - (this.LJZI - LLIILII());
        }
        return LJJJZ;
    }

    @Override // X.C0A2
    public final int LJJJJLL(View child) {
        o.LJIIIZ(child, "child");
        int LJJJLL = C0A2.LJJJLL(child);
        int LJJLI = C0A2.LJJLI(child);
        Rect rect = (Rect) ((LinkedHashMap) this.LLF).get(Integer.valueOf(LJJJLL));
        if (rect != null) {
            LJJLI = rect.top;
        }
        if (this.LJLZ == C0LY.VERTICAL) {
            return LJJLI - this.LJZI;
        }
        return LJJLI;
    }

    @Override // X.C0A2
    public final void LJLJL(Parcelable state) {
        SavedState savedState;
        o.LJIIIZ(state, "state");
        if ((state instanceof SavedState) && (savedState = (SavedState) state) != null) {
            LJZL(savedState.firstVisibleItem);
        }
    }

    @Override // X.C0A2
    public final void LJZL(int i) {
        this.LLFF = Integer.valueOf(i);
        LJZ();
    }

    public final void LLIIIL(C0A7 recycler) {
        int LIZIZ;
        int LIZIZ2;
        o.LJIIIZ(recycler, "recycler");
        int LLIIZ = LLIIZ() + this.LJZI;
        if (LLIILZL().LIZIZ() <= 0 || (LIZIZ = this.LLD / LLIILZL().LIZIZ()) > (LIZIZ2 = LLIIZ / LLIILZL().LIZIZ())) {
            return;
        }
        while (true) {
            Set set = (Set) ((LinkedHashMap) LLIILZL().LIZLLL).get(Integer.valueOf(LIZIZ));
            if (set != null) {
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    int intValue = ((Number) it.next()).intValue();
                    if (LJJIJIL(intValue) == null) {
                        LLIL(intValue, C0LX.END, recycler);
                    }
                }
            }
            if (LIZIZ != LIZIZ2) {
                LIZIZ++;
            } else {
                return;
            }
        }
    }

    public final void LLIIIZ(C0A7 recycler) {
        o.LJIIIZ(recycler, "recycler");
        C40511Fv9 LJIJJ = C78842Uww.LJIJJ(C78842Uww.LJJ((this.LJZI - LLIILII()) / LLIILZL().LIZIZ(), ((LLIIZ() + this.LJZI) - LLIILII()) / LLIILZL().LIZIZ()));
        int i = LJIJJ.LJLIL;
        int i2 = LJIJJ.LJLILLLLZI;
        int i3 = LJIJJ.LJLJI;
        if (i3 > 0) {
            if (i > i2) {
                return;
            }
        } else if (i3 >= 0 || i2 > i) {
            return;
        }
        while (true) {
            Iterable iterable = (Iterable) ((LinkedHashMap) LLIILZL().LIZLLL).get(Integer.valueOf(i));
            if (iterable == null) {
                iterable = OQY.INSTANCE;
            }
            Iterator it = ORZ.LLIILII(iterable).iterator();
            while (it.hasNext()) {
                int intValue = ((Number) it.next()).intValue();
                if (LJJIJIL(intValue) == null) {
                    LLIL(intValue, C0LX.START, recycler);
                }
            }
            if (i == i2) {
                return;
            } else {
                i += i3;
            }
        }
    }

    public final int LLIIJI(View child) {
        o.LJIIIZ(child, "child");
        if (this.LJLZ == C0LY.VERTICAL) {
            return LJJJJLL(child);
        }
        return LJJJJJ(child);
    }

    @Override // X.C0A2
    public final void LJLJJI(C0A7 recycler, C0AC state) {
        int LLIIL;
        Integer num;
        Integer num2;
        int LLIIL2;
        C0G4 c0g4;
        int i;
        Set<Integer> linkedHashSet;
        int i2;
        Set<Integer> linkedHashSet2;
        o.LJIIIZ(recycler, "recycler");
        o.LJIIIZ(state, "state");
        this.LJZL = new C0G3(this, this.LJLZ);
        int LLIILII = LLIILII();
        this.LL = LLIILII;
        int i3 = this.LJZI;
        if (i3 != 0) {
            LLIIL = LLIILZL().LIZIZ() * ((i3 - LLIILII) / LLIILZL().LIZIZ());
        } else {
            LLIIL = LLIIL();
        }
        this.LLD = LLIIL;
        ((LinkedHashMap) this.LLF).clear();
        LJJIJIIJIL(recycler);
        System.currentTimeMillis();
        int LIZIZ = state.LIZIZ();
        for (int i4 = 0; i4 < LIZIZ; i4++) {
            C0LZ c0lz = this.LLFII;
            if (c0lz != null) {
                c0g4 = c0lz.LIZ(i4);
            } else {
                c0g4 = new C0G4(1, 1);
            }
            Rect LIZ = LLIILZL().LIZ(i4, c0g4);
            C0G3 LLIILZL = LLIILZL();
            C0LY c0ly = LLIILZL.LIZIZ;
            C0LY c0ly2 = C0LY.VERTICAL;
            if (c0ly == c0ly2) {
                i = LIZ.top;
            } else {
                i = LIZ.left;
            }
            Iterable iterable = (Iterable) ((LinkedHashMap) LLIILZL.LIZLLL).get(Integer.valueOf(i));
            if (iterable != null) {
                linkedHashSet = ORZ.LLJILLL(iterable);
            } else {
                linkedHashSet = new LinkedHashSet<>();
            }
            linkedHashSet.add(Integer.valueOf(i4));
            LLIILZL.LIZLLL.put(Integer.valueOf(i), linkedHashSet);
            if (LLIILZL.LIZIZ == c0ly2) {
                i2 = LIZ.bottom;
            } else {
                i2 = LIZ.right;
            }
            int i5 = i2 - 1;
            Iterable iterable2 = (Iterable) ((LinkedHashMap) LLIILZL.LIZLLL).get(Integer.valueOf(i5));
            if (iterable2 != null) {
                linkedHashSet2 = ORZ.LLJILLL(iterable2);
            } else {
                linkedHashSet2 = new LinkedHashSet<>();
            }
            linkedHashSet2.add(Integer.valueOf(i4));
            LLIILZL.LIZLLL.put(Integer.valueOf(i5), linkedHashSet2);
            LLIILZL.LJ.put(Integer.valueOf(i4), LIZ);
            List<Rect> list = LLIILZL.LJFF;
            ArrayList arrayList = new ArrayList();
            Iterator it = ((ArrayList) list).iterator();
            while (it.hasNext()) {
                Object next = it.next();
                Rect rect = (Rect) next;
                if (C78841Uwv.LJIJJ(rect, LIZ) || rect.intersects(LIZ.left, LIZ.top, LIZ.right, LIZ.bottom)) {
                    arrayList.add(next);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                Rect rect2 = (Rect) it2.next();
                if (C78841Uwv.LJIJJ(rect2, LIZ) && !LIZ.contains(rect2)) {
                    arrayList3.add(rect2);
                } else {
                    ((ArrayList) LLIILZL.LJFF).remove(rect2);
                    if (rect2.left < LIZ.left) {
                        arrayList2.add(new Rect(rect2.left, rect2.top, LIZ.left, rect2.bottom));
                    }
                    if (rect2.right > LIZ.right) {
                        arrayList2.add(new Rect(LIZ.right, rect2.top, rect2.right, rect2.bottom));
                    }
                    if (rect2.top < LIZ.top) {
                        arrayList2.add(new Rect(rect2.left, rect2.top, rect2.right, LIZ.top));
                    }
                    if (rect2.bottom > LIZ.bottom) {
                        arrayList2.add(new Rect(rect2.left, LIZ.bottom, rect2.right, rect2.bottom));
                    }
                }
            }
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                Rect rect3 = (Rect) it3.next();
                Iterator it4 = arrayList3.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        break;
                    }
                    Object next2 = it4.next();
                    Rect rect4 = (Rect) next2;
                    if (!o.LJ(rect4, rect3) && rect4.contains(rect3)) {
                        if (next2 != null) {
                        }
                    }
                }
                Iterator it5 = arrayList2.iterator();
                while (true) {
                    if (!it5.hasNext()) {
                        break;
                    }
                    Object next3 = it5.next();
                    Rect rect5 = (Rect) next3;
                    if (!o.LJ(rect5, rect3) && rect5.contains(rect3)) {
                        if (next3 != null) {
                        }
                    }
                }
                ((ArrayList) LLIILZL.LJFF).add(rect3);
            }
            C40675Fxn.LJJLIIIJ(LLIILZL.LJFF, LLIILZL.LIZJ);
        }
        Integer num3 = this.LLFF;
        if (LJJJJZ() != 0 && num3 != null && num3.intValue() >= 0) {
            Map<Integer, Set<Integer>> map = LLIILZL().LIZLLL;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
                if (((Set) entry.getValue()).contains(num3)) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            Integer num4 = (Integer) ORZ.LJLLL(linkedHashMap.keySet());
            if (num4 != null) {
                this.LJZI = (LLIILZL().LIZIZ() * num4.intValue()) + LLIILII();
            }
            int i6 = this.LJZI;
            if (i6 != 0) {
                LLIIL2 = LLIILZL().LIZIZ() * ((i6 - this.LL) / LLIILZL().LIZIZ());
            } else {
                LLIIL2 = LLIIL();
            }
            this.LLD = LLIIL2;
            num = null;
            this.LLFF = null;
        } else {
            num = null;
        }
        C0LX direction = C0LX.END;
        o.LJIIIZ(direction, "direction");
        LLIIIL(recycler);
        LLILII(direction, recycler);
        int LLIIZ = ((LLIIZ() + this.LJZI) - this.LLD) - LLIIL();
        C40517FvF LJJ = C78842Uww.LJJ(0, LJJJI());
        ArrayList arrayList4 = new ArrayList(C32I.LJJL(LJJ, 10));
        C118234kV it6 = LJJ.iterator();
        while (it6.LJLJI) {
            View LJJJ = LJJJ(it6.nextInt());
            if (LJJJ != null) {
                num2 = Integer.valueOf(C0A2.LJJJLL(LJJJ));
            } else {
                num2 = num;
            }
            arrayList4.add(num2);
        }
        boolean contains = arrayList4.contains(Integer.valueOf(LJJJJZ() - 1));
        if (LJJJJZ() != 0) {
            if ((LLIIJLIL() == 0 && contains) || LLIIZ <= 0) {
                return;
            }
            LLILL(LLIIZ, state);
            LLIIIZ(recycler);
        }
    }

    public final void LLILII(C0LX direction, C0A7 recycler) {
        int LJJJJLI;
        o.LJIIIZ(direction, "direction");
        o.LJIIIZ(recycler, "recycler");
        if (direction == C0LX.END) {
            int LJJJI = LJJJI();
            int LLIILII = LLIILII();
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < LJJJI; i++) {
                View LJJJ = LJJJ(i);
                if (LJJJ != null) {
                    if (this.LJLZ == C0LY.VERTICAL) {
                        LJJJJLI = LJJJJIZL(LJJJ);
                    } else {
                        LJJJJLI = LJJJJLI(LJJJ);
                    }
                    if (LJJJJLI < LLIILII) {
                        arrayList.add(LJJJ);
                    }
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                View view = (View) it.next();
                LJLLL(view, recycler);
                LLILLIZIL(view, direction);
            }
            return;
        }
        int LJJJI2 = LJJJI();
        int LLIIL = LLIIL() + LLIIZ();
        ArrayList arrayList2 = new ArrayList();
        C40511Fv9 LJIJJ = C78842Uww.LJIJJ(C78842Uww.LJJ(0, LJJJI2));
        int i2 = LJIJJ.LJLIL;
        int i3 = LJIJJ.LJLILLLLZI;
        int i4 = LJIJJ.LJLJI;
        if (i4 <= 0 ? !(i4 >= 0 || i3 > i2) : i2 <= i3) {
            while (true) {
                View LJJJ2 = LJJJ(i2);
                if (LJJJ2 != null && LLIIJI(LJJJ2) > LLIIL) {
                    arrayList2.add(LJJJ2);
                }
                if (i2 == i3) {
                    break;
                } else {
                    i2 += i4;
                }
            }
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            View view2 = (View) it2.next();
            LJLLL(view2, recycler);
            LLILLIZIL(view2, direction);
        }
    }

    public final int LLILL(int i, C0AC state) {
        o.LJIIIZ(state, "state");
        int LIZIZ = LLIILZL().LIZIZ() + this.LLD + LLIIL();
        int i2 = this.LJZI - i;
        this.LJZI = i2;
        if (i2 < 0) {
            i += i2;
            this.LJZI = 0;
        }
        if (LLIIZ() + this.LJZI > LIZIZ) {
            if (LJJJI() + LLIIJLIL() + this.LJZ >= state.LIZIZ()) {
                i -= (LIZIZ - this.LJZI) - LLIIZ();
                this.LJZI = LIZIZ - LLIIZ();
            }
        }
        if (this.LJLZ == C0LY.VERTICAL) {
            LJJLIIIJLLLLLLLZ(i);
        } else {
            LJJLIIIJLJLI(i);
        }
        return i;
    }

    public final void LLILLIZIL(View view, C0LX direction) {
        int LJJJJLI;
        o.LJIIIZ(view, "view");
        o.LJIIIZ(direction, "direction");
        int LLIIJI = LLIIJI(view) + this.LJZI;
        if (this.LJLZ == C0LY.VERTICAL) {
            LJJJJLI = LJJJJIZL(view);
        } else {
            LJJJJLI = LJJJJLI(view);
        }
        int i = LJJJJLI + this.LJZI;
        if (direction == C0LX.END) {
            this.LL = LLIILII() + i;
        } else {
            if (direction != C0LX.START) {
                return;
            }
            this.LLD = LLIILII() + LLIIJI;
        }
    }

    @Override // X.C0A2
    public final int LJZI(int i, C0A7 recycler, C0AC state) {
        o.LJIIIZ(recycler, "recycler");
        o.LJIIIZ(state, "state");
        return LLILIL(i, recycler, state);
    }

    @Override // X.C0A2
    public final int LL(int i, C0A7 recycler, C0AC state) {
        o.LJIIIZ(recycler, "recycler");
        o.LJIIIZ(state, "state");
        return LLILIL(i, recycler, state);
    }

    @Override // X.C0A2
    public final void LLIIII(RecyclerView recyclerView, C0AC state, int i) {
        o.LJIIIZ(recyclerView, "recyclerView");
        o.LJIIIZ(state, "state");
        final Context context = recyclerView.getContext();
        C1C9 c1c9 = new C1C9(context) { // from class: X.1jW
            @Override // X.C1C9
            public final int LJIILJJIL() {
                return -1;
            }

            @Override // X.C0AB
            public final PointF LIZ(int i2) {
                int i3;
                if (this.LIZIZ.LJLLJ.LJJJI() == 0) {
                    return null;
                }
                if (i2 < SpannedGridLayoutManager.this.LLIIJLIL()) {
                    i3 = -1;
                } else {
                    i3 = 1;
                }
                return new PointF(0.0f, i3);
            }
        };
        c1c9.LIZ = i;
        LLIIIILZ(c1c9);
    }

    public final void LLIL(int i, C0LX direction, C0A7 recycler) {
        C0G4 c0g4;
        final int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        o.LJIIIZ(direction, "direction");
        o.LJIIIZ(recycler, "recycler");
        View LJFF = recycler.LJFF(i);
        o.LJIIIIZZ(LJFF, "recycler.getViewForPosition(position)");
        if (C15380j0.LJIIZILJ()) {
            LJFF.setLayoutDirection(1);
        } else {
            LJFF.setLayoutDirection(0);
        }
        C0G3 LLIILZL = LLIILZL();
        int LIZIZ = LLIILZL.LIZIZ();
        int LIZIZ2 = LLIILZL.LIZIZ();
        C0LZ c0lz = this.LLFII;
        if (c0lz != null) {
            c0g4 = c0lz.LIZ(i);
        } else {
            c0g4 = new C0G4(1, 1);
        }
        if (this.LJLZ == C0LY.HORIZONTAL) {
            i2 = c0g4.LIZIZ;
        } else {
            i2 = c0g4.LIZ;
        }
        if (i2 <= this.LJZ && i2 >= 1) {
            Rect LIZ = LLIILZL.LIZ(i, c0g4);
            if (C15380j0.LJIIZILJ()) {
                i3 = this.LJZ - LIZ.right;
            } else {
                i3 = LIZ.left;
            }
            int i7 = i3 * LIZIZ;
            if (C15380j0.LJIIZILJ()) {
                i4 = this.LJZ - LIZ.left;
            } else {
                i4 = LIZ.right;
            }
            int i8 = i4 * LIZIZ;
            int i9 = LIZ.top * LIZIZ2;
            int i10 = LIZ.bottom * LIZIZ2;
            Rect rect = new Rect();
            LJIJJ(rect, LJFF);
            if (C15380j0.LJIIZILJ()) {
                i5 = (i7 - i8) - rect.left;
                i6 = rect.right;
            } else {
                i5 = (i8 - i7) - rect.left;
                i6 = rect.right;
            }
            int i11 = i5 - i6;
            int i12 = ((i10 - i9) - rect.top) - rect.bottom;
            ViewGroup.LayoutParams layoutParams = LJFF.getLayoutParams();
            layoutParams.width = i11;
            layoutParams.height = i12;
            LJJLIIIJL(i11, i12, LJFF);
            this.LLF.put(Integer.valueOf(i), new Rect(i7, i9, i8, i10));
            Rect rect2 = (Rect) ((LinkedHashMap) this.LLF).get(Integer.valueOf(i));
            if (rect2 != null) {
                int i13 = this.LJZI;
                int LLIILII = LLIILII();
                if (this.LJLZ == C0LY.VERTICAL) {
                    C0A2.LJJLIIIJJI(LJFF, getPaddingLeft() + rect2.left, (rect2.top - i13) + LLIILII, getPaddingLeft() + rect2.right, (rect2.bottom - i13) + LLIILII);
                } else {
                    C0A2.LJJLIIIJJI(LJFF, (rect2.left - i13) + LLIILII, getPaddingTop() + rect2.top, (rect2.right - i13) + LLIILII, getPaddingTop() + rect2.bottom);
                }
            }
            int LLIILII2 = LLIILII() + LLIIJI(LJFF) + this.LJZI;
            if (LLIILII2 < this.LL) {
                this.LL = LLIILII2;
            }
            int LIZIZ3 = LLIILZL().LIZIZ() + LLIILII2;
            if (LIZIZ3 > this.LLD) {
                this.LLD = LIZIZ3;
            }
            if (direction == C0LX.END) {
                LJIIZILJ(LJFF);
                return;
            } else {
                LJIJ(0, LJFF, false);
                return;
            }
        }
        final int i14 = this.LJZ;
        throw new RuntimeException(i2, i14) { // from class: X.0G5
            /* JADX WARN: Illegal instructions before constructor call */
            {
                /*
                    r2 = this;
                    java.lang.StringBuilder r1 = X.X1D.LIZ()
                    java.lang.String r0 = "Invalid item span size: "
                    r1.append(r0)
                    r1.append(r3)
                    java.lang.String r0 = ". Span size must be in the range: (1..."
                    r1.append(r0)
                    r1.append(r4)
                    r0 = 41
                    r1.append(r0)
                    java.lang.String r0 = X.X1D.LIZIZ(r1)
                    r2.<init>(r0)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C0G5.<init>(int, int):void");
            }
        };
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0042, code lost:
    
        if ((LLIIZ() + r7.LJZI) < (LLIIL() + (LLIILZL().LIZIZ() + r7.LLD))) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int LLILIL(int r8, X.C0A7 r9, X.C0AC r10) {
        /*
            r7 = this;
            java.lang.String r0 = "recycler"
            kotlin.jvm.internal.o.LJIIIZ(r9, r0)
            java.lang.String r0 = "state"
            kotlin.jvm.internal.o.LJIIIZ(r10, r0)
            r6 = 0
            if (r8 != 0) goto Le
            return r6
        Le:
            int r0 = r7.LLIIJLIL()
            r5 = 1
            if (r0 < 0) goto L4b
            int r0 = r7.LJZI
            if (r0 <= 0) goto L4b
            if (r8 >= 0) goto L4b
            r4 = 1
        L1c:
            int r0 = r7.LLIIJLIL()
            int r1 = r7.LJJJI()
            int r1 = r1 + r0
            int r0 = r10.LIZIZ()
            if (r1 > r0) goto L49
            int r0 = r7.LJZI
            int r3 = r7.LLIIZ()
            int r3 = r3 + r0
            int r2 = r7.LLD
            X.0G3 r0 = r7.LLIILZL()
            int r1 = r0.LIZIZ()
            int r1 = r1 + r2
            int r0 = r7.LLIIL()
            int r0 = r0 + r1
            if (r3 >= r0) goto L49
        L44:
            if (r4 != 0) goto L4d
            if (r5 != 0) goto L4d
            return r6
        L49:
            r5 = 0
            goto L44
        L4b:
            r4 = 0
            goto L1c
        L4d:
            int r0 = -r8
            int r2 = r7.LLILL(r0, r10)
            if (r8 <= 0) goto L66
            X.0LX r1 = X.C0LX.END
        L56:
            r7.LLILII(r1, r9)
            X.0LX r0 = X.C0LX.END
            if (r1 != r0) goto L62
            r7.LLIIIL(r9)
        L60:
            int r0 = -r2
            return r0
        L62:
            r7.LLIIIZ(r9)
            goto L60
        L66:
            X.0LX r1 = X.C0LX.START
            goto L56
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.effect.sticker.list.SpannedGridLayoutManager.LLILIL(int, X.0A7, X.0AC):int");
    }
}
