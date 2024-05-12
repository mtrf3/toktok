package X;

import Y.ARunnableS50S0100000_14;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.lynx.react.bridge.JavaOnlyArray;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.tasm.TemplateAssembler;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.behavior.ui.LynxUI;
import com.lynx.tasm.behavior.ui.list.ListLayoutManager;
import com.lynx.tasm.behavior.ui.list.UIList;
import com.lynx.tasm.behavior.ui.view.UIComponent;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.VUr, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79829VUr extends AbstractC029409q<C79831VUt> {
    public final UIList LJLJI;
    public boolean LJLJJI;
    public boolean LJLJJL;
    public boolean LJLJJLL;
    public boolean LJLJL;
    public JavaOnlyArray LJLJLJ;
    public JavaOnlyArray LJLJLLL;
    public JavaOnlyArray LJLL;
    public JavaOnlyArray LJLLI;
    public JavaOnlyArray LJLLILLLL;
    public JavaOnlyArray LJLLJ;
    public JavaOnlyArray LJLLL;
    public JavaOnlyArray LJLLLL;
    public JavaOnlyArray LJLLLLLL;
    public int LJZ;
    public final C79834VUw LJZI;
    public JavaOnlyArray LJZL;
    public HashMap<String, Integer> LL;
    public boolean LLD;
    public final ARunnableS50S0100000_14 LLF = new ARunnableS50S0100000_14(this, 43);
    public final ARunnableS50S0100000_14 LLFF = new ARunnableS50S0100000_14(this, 44);
    public final ArrayList<HashMap<Integer, Integer>> LLFFF = new ArrayList<>();
    public final HashMap<String, Integer> LLFII = new HashMap<>();
    public final HashMap<String, Integer> LJLIL = new HashMap<>();
    public final HashMap<Long, C79831VUt> LJLILLLLZI = new HashMap<>();
    public final C79835VUx LJLZ = new C79835VUx(this);

    public final long LJLZ() {
        long sign = this.LJLJI.getSign() << 32;
        int i = this.LJZ;
        this.LJZ = i + 1;
        return sign + i;
    }

    public final int LJZ() {
        int intValue;
        int intValue2;
        RecyclerView.ViewHolder LJJJJJL;
        int intValue3;
        C0A2 layoutManager = ((RecyclerView) this.LJLJI.mView).getLayoutManager();
        if (this.LLFFF.isEmpty()) {
            return 0;
        }
        if (layoutManager instanceof ListLayoutManager.ListLinearLayoutManager) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
            int LLILL = linearLayoutManager.LLILL();
            int i = -((int) linearLayoutManager.LJJIJIL(LLILL).getY());
            HashMap hashMap = (HashMap) ListProtector.get(this.LLFFF, 0);
            for (int i2 = 0; i2 < LLILL; i2++) {
                if (hashMap.get(Integer.valueOf(i2)) == null) {
                    intValue3 = 0;
                } else {
                    intValue3 = ((Integer) hashMap.get(Integer.valueOf(i2))).intValue();
                }
                i += intValue3;
            }
            return i;
        }
        if (layoutManager instanceof ListLayoutManager.ListGridLayoutManager) {
            try {
                ListLayoutManager.ListGridLayoutManager listGridLayoutManager = (ListLayoutManager.ListGridLayoutManager) layoutManager;
                int i3 = 0;
                for (int i4 = 0; i4 < this.LLFFF.size(); i4++) {
                    View LJJJ = listGridLayoutManager.LJJJ(i4);
                    if (LJJJ != null) {
                        int LJJJLL = C0A2.LJJJLL(LJJJ);
                        int i5 = -((int) LJJJ.getY());
                        HashMap hashMap2 = (HashMap) ListProtector.get(this.LLFFF, i4);
                        for (int i6 = 0; i6 < LJJJLL; i6++) {
                            if (hashMap2.get(Integer.valueOf(i6)) != null) {
                                intValue = ((Integer) hashMap2.get(Integer.valueOf(i6))).intValue();
                            } else {
                                intValue = 0;
                            }
                            i5 += intValue;
                        }
                        i3 = Math.max(i3, i5);
                    }
                }
                return i3;
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
                return 0;
            }
        }
        int i7 = this.LJLJI.LJLJJI;
        int[] iArr = new int[i7];
        View[] viewArr = new View[i7];
        ((StaggeredGridLayoutManager) layoutManager).LLIL(iArr);
        for (int i8 = 0; i8 < i7; i8++) {
            int i9 = 0;
            while (true) {
                if (i9 >= ((ViewGroup) this.LJLJI.mView).getChildCount()) {
                    break;
                }
                View childAt = ((ViewGroup) this.LJLJI.mView).getChildAt(i9);
                if (childAt == null || (LJJJJJL = ((RecyclerView) this.LJLJI.mView).LJJJJJL(childAt)) == null || iArr[i8] != LJJJJJL.getAdapterPosition()) {
                    i9++;
                } else {
                    viewArr[i8] = childAt;
                    break;
                }
            }
        }
        int i10 = 0;
        for (int i11 = 0; i11 < i7 && i11 < this.LLFFF.size(); i11++) {
            View view = viewArr[i11];
            if (view != null) {
                int i12 = -((int) view.getY());
                HashMap hashMap3 = (HashMap) ListProtector.get(this.LLFFF, i11);
                for (int i13 = 0; i13 < iArr[i11]; i13++) {
                    if (hashMap3.get(Integer.valueOf(i13)) == null) {
                        intValue2 = 0;
                    } else {
                        intValue2 = ((Integer) hashMap3.get(Integer.valueOf(i13))).intValue();
                    }
                    i12 += intValue2;
                }
                i10 = Math.max(i10, i12);
            }
        }
        return i10;
    }

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        JavaOnlyArray javaOnlyArray = this.LJLJLJ;
        if (javaOnlyArray != null) {
            return javaOnlyArray.size();
        }
        return 0;
    }

    public final int LJZI(int i) {
        for (int i2 = 0; i2 < this.LJLJLLL.size(); i2++) {
            Integer num = (Integer) this.LJLJLLL.get(i2);
            if (num.intValue() >= i) {
                return num.intValue();
            }
        }
        return -1;
    }

    public final int LJZL(int i) {
        for (int size = this.LJLJLLL.size() - 1; size >= 0; size--) {
            Integer num = (Integer) this.LJLJLLL.get(size);
            if (num.intValue() <= i) {
                return num.intValue();
            }
        }
        return -1;
    }

    public final int LL(int i) {
        for (int i2 = 0; i2 < this.LJLJLLL.size(); i2++) {
            Integer num = (Integer) this.LJLJLLL.get(i2);
            if (num.intValue() >= i) {
                if (this.LJLLI.contains(Integer.valueOf(num.intValue()))) {
                    return num.intValue();
                }
            }
        }
        return -1;
    }

    public final int LLD(int i) {
        for (int size = this.LJLJLLL.size() - 1; size >= 0; size--) {
            Integer num = (Integer) this.LJLJLLL.get(size);
            if (num.intValue() <= i) {
                if (this.LJLL.contains(Integer.valueOf(num.intValue()))) {
                    return num.intValue();
                }
            }
        }
        return -1;
    }

    public final boolean LLF(int i) {
        return this.LJLJLLL.contains(Integer.valueOf(i));
    }

    public final void LLFFF(C79831VUt c79831VUt) {
        VRX vrx = c79831VUt.LJLIL;
        UIComponent uIComponent = vrx.LJLILLLLZI;
        if (uIComponent != null) {
            vrx.removeAllViews();
            c79831VUt.LJLIL.LJLILLLLZI = null;
            if (this.LJLJL) {
                UIList uIList = this.LJLJI;
                C79655VNz c79655VNz = uIList.LJLIL;
                int sign = uIList.getSign();
                int sign2 = uIComponent.getSign();
                TemplateAssembler templateAssembler = (TemplateAssembler) c79655VNz.LIZ;
                if (templateAssembler != null) {
                    templateAssembler.LJIJJ(sign, sign2);
                }
                c79831VUt.LJLIL.LJLIL = 0;
                return;
            }
            this.LJLJI.LJIL(uIComponent);
        }
    }

    public final void LLFZ(JavaOnlyMap javaOnlyMap) {
        boolean z;
        UIList uIList;
        T t;
        UIList uIList2;
        T t2;
        JavaOnlyArray javaOnlyArray = this.LJLJLJ;
        if (javaOnlyArray != null && this.LJLJLLL != null && javaOnlyArray.size() == this.LJLJLLL.size()) {
            z = true;
        } else {
            z = false;
        }
        if (javaOnlyMap == null || javaOnlyMap.isEmpty()) {
            return;
        }
        this.LJZL = javaOnlyMap.getArray("itemkeys");
        this.LL = new HashMap<>();
        for (int i = 0; i < this.LJZL.size(); i++) {
            this.LL.put(this.LJZL.getString(i), Integer.valueOf(i));
        }
        this.LJLJLLL = javaOnlyMap.getArray("fullspan");
        this.LJLJLJ = javaOnlyMap.getArray("viewTypes");
        this.LJLL = javaOnlyMap.getArray("stickyTop");
        this.LJLLI = javaOnlyMap.getArray("stickyBottom");
        this.LJLLILLLL = javaOnlyMap.getArray("estimatedHeight");
        this.LJLLJ = javaOnlyMap.getArray("estimatedHeightPx");
        boolean z2 = javaOnlyMap.getBoolean("diffable");
        this.LJLJJI = javaOnlyMap.getBoolean("newarch");
        for (int i2 = 0; i2 < this.LJLJLJ.size(); i2++) {
            String string = this.LJLJLJ.getString(i2);
            if (!this.LJLIL.containsKey(string)) {
                HashMap<String, Integer> hashMap = this.LJLIL;
                hashMap.put(string, Integer.valueOf(hashMap.size()));
            }
        }
        if (!z && z2 && this.LJLJJL) {
            C79835VUx c79835VUx = this.LJLZ;
            ReadableMap map = javaOnlyMap.getMap("diffResult");
            c79835VUx.getClass();
            c79835VUx.LIZ = map.getArray("insertions");
            c79835VUx.LIZIZ = map.getArray("removals");
            c79835VUx.LIZJ = map.getArray("updateFrom");
            c79835VUx.LIZLLL = map.getArray("updateTo");
            c79835VUx.LJ = map.getArray("moveFrom");
            c79835VUx.LJFF = map.getArray("moveTo");
            if (C79835VUx.LIZ(c79835VUx.LIZ) || C79835VUx.LIZ(c79835VUx.LIZIZ) || C79835VUx.LIZ(c79835VUx.LIZJ) || C79835VUx.LIZ(c79835VUx.LIZLLL) || C79835VUx.LIZ(c79835VUx.LJ) || C79835VUx.LIZ(c79835VUx.LJFF)) {
                c79835VUx.LJI.LJLJJL = false;
            }
            if (this.LJLJJI && (uIList2 = this.LJLJI) != null && (t2 = uIList2.mView) != 0 && ((RecyclerView) t2).LJJJLL()) {
                C79411VEp.LIZJ(this.LLF);
                return;
            } else {
                this.LLF.run();
                return;
            }
        }
        this.LLFII.clear();
        if (this.LJLJJI && (uIList = this.LJLJI) != null && (t = uIList.mView) != 0 && ((RecyclerView) t).LJJJLL()) {
            C79411VEp.LIZJ(this.LLFF);
        } else {
            this.LLFF.run();
        }
    }

    @Override // X.AbstractC029409q
    public final long getItemId(int i) {
        if (this.mHasStableIds) {
            return i;
        }
        return -1L;
    }

    @Override // X.AbstractC029409q
    public final int getItemViewType(int i) {
        Integer num = this.LJLIL.get(this.LJLJLJ.getString(i));
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    @Override // X.AbstractC029409q
    public final void onViewAttachedToWindow(C79831VUt c79831VUt) {
        int height;
        UIComponent uIComponent;
        C79831VUt c79831VUt2 = c79831VUt;
        if (c79831VUt2.LJLIL.LJLILLLLZI == null && (!this.LJLJL || !this.LJLILLLLZI.containsValue(c79831VUt2))) {
            if (this.LJLJJI) {
                LJLLLLLL(c79831VUt2, c79831VUt2.getAdapterPosition());
            } else {
                onBindViewHolder(c79831VUt2, c79831VUt2.getAdapterPosition());
            }
        }
        if (!this.LJLJL) {
            this.LJZI.LIZLLL(c79831VUt2);
        }
        if (this.LJLJJI && (uIComponent = c79831VUt2.LJLIL.LJLILLLLZI) != null) {
            uIComponent.onListCellAppear(uIComponent.LJLIL, this.LJLJI);
        }
        int adapterPosition = c79831VUt2.getAdapterPosition();
        int itemCount = (getItemCount() - c79831VUt2.getAdapterPosition()) - 1;
        int i = 0;
        if (itemCount == 0 || (itemCount < this.LJLJI.LJLJJI && LJZI(adapterPosition) == -1)) {
            c79831VUt2.LJLIL.LJLJJLL = 0;
        } else {
            c79831VUt2.LJLIL.LJLJJLL = this.LJLJI.LJLJJL;
        }
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) c79831VUt2.itemView.getLayoutParams();
        if (layoutParams instanceof C1BZ) {
            ((C1BZ) layoutParams).LJLILLLLZI = LLF(adapterPosition);
        }
        if (this.LLFFF.isEmpty()) {
            return;
        }
        UIComponent uIComponent2 = c79831VUt2.LJLIL.LJLILLLLZI;
        if (uIComponent2 == null) {
            height = 0;
        } else {
            height = uIComponent2.getHeight();
        }
        if (((RecyclerView) this.LJLJI.mView).getLayoutManager() instanceof ListLayoutManager.ListLinearLayoutManager) {
            ((HashMap) ListProtector.get(this.LLFFF, 0)).put(Integer.valueOf(adapterPosition), Integer.valueOf(height));
            return;
        }
        if (((RecyclerView) this.LJLJI.mView).getLayoutManager() instanceof C79833VUv) {
            C1BZ c1bz = (C1BZ) c79831VUt2.itemView.getLayoutParams();
            if (LLF(adapterPosition)) {
                while (i < this.LLFFF.size()) {
                    ((HashMap) ListProtector.get(this.LLFFF, i)).put(Integer.valueOf(adapterPosition), Integer.valueOf(height));
                    i++;
                }
                return;
            } else {
                while (i < this.LLFFF.size()) {
                    if (c1bz.LIZ() == i) {
                        ((HashMap) ListProtector.get(this.LLFFF, i)).put(Integer.valueOf(adapterPosition), Integer.valueOf(height));
                    } else {
                        ((HashMap) ListProtector.get(this.LLFFF, i)).remove(Integer.valueOf(adapterPosition));
                    }
                    i++;
                }
                return;
            }
        }
        if (!(((RecyclerView) this.LJLJI.mView).getLayoutManager() instanceof GridLayoutManager)) {
            return;
        }
        GridLayoutManager gridLayoutManager = (GridLayoutManager) ((RecyclerView) this.LJLJI.mView).getLayoutManager();
        int LJ = gridLayoutManager.LLIILII.LJ(adapterPosition, gridLayoutManager.LLIIIL);
        if (LLF(adapterPosition)) {
            while (i < this.LLFFF.size()) {
                ((HashMap) ListProtector.get(this.LLFFF, i)).put(Integer.valueOf(adapterPosition), Integer.valueOf(height));
                i++;
            }
        } else {
            while (i < this.LLFFF.size()) {
                if (LJ == i) {
                    ((HashMap) ListProtector.get(this.LLFFF, i)).put(Integer.valueOf(adapterPosition), Integer.valueOf(height));
                } else {
                    ((HashMap) ListProtector.get(this.LLFFF, i)).remove(Integer.valueOf(adapterPosition));
                }
                i++;
            }
        }
    }

    @Override // X.AbstractC029409q
    public final void onViewDetachedFromWindow(C79831VUt c79831VUt) {
        boolean contains;
        C79831VUt c79831VUt2 = c79831VUt;
        this.LJZI.LIZ(c79831VUt2);
        if (this.LJLJJI) {
            UIComponent uIComponent = c79831VUt2.LJLIL.LJLILLLLZI;
            if (uIComponent != null) {
                JavaOnlyArray javaOnlyArray = this.LJZL;
                if (javaOnlyArray == null) {
                    contains = false;
                } else {
                    contains = javaOnlyArray.contains(uIComponent.LJLIL);
                }
                UIComponent uIComponent2 = c79831VUt2.LJLIL.LJLILLLLZI;
                uIComponent2.onListCellDisAppear(uIComponent2.LJLIL, this.LJLJI, contains);
            }
            if (!this.LJLJL) {
                LLFFF(c79831VUt2);
            }
        }
    }

    public C79829VUr(UIList uIList, C79834VUw c79834VUw) {
        this.LJLJI = uIList;
        this.LJZI = c79834VUw;
    }

    public final void LJLLLLLL(C79831VUt c79831VUt, int i) {
        UIComponent uIComponent;
        int intValue;
        long LJLZ = LJLZ();
        this.LJLILLLLZI.put(Long.valueOf(LJLZ), c79831VUt);
        if (this.LJLJL) {
            c79831VUt.LJLILLLLZI = LJLZ;
            UIList uIList = this.LJLJI;
            C79655VNz c79655VNz = uIList.LJLIL;
            int sign = uIList.getSign();
            TemplateAssembler templateAssembler = (TemplateAssembler) c79655VNz.LIZ;
            if (templateAssembler != null) {
                templateAssembler.LJIILL(sign, i, LJLZ);
            }
            ViewGroup.LayoutParams layoutParams = c79831VUt.itemView.getLayoutParams();
            if (layoutParams instanceof C1BZ) {
                ((C1BZ) layoutParams).LJLILLLLZI = LLF(i);
            }
            Object obj = this.LJZL.get(i);
            c79831VUt.LJLIL.LJLIL = 0;
            if (this.LLFII.containsKey(obj)) {
                int intValue2 = this.LLFII.get(obj).intValue();
                if (intValue2 > 0) {
                    c79831VUt.LJLIL.LJLJI = intValue2;
                    return;
                }
                return;
            }
            LLFII(c79831VUt, i);
            return;
        }
        UIComponent LJIJJLI = this.LJLJI.LJIJJLI(i, LJLZ, this.LLD);
        if (LJIJJLI == null) {
            this.LJLILLLLZI.remove(Long.valueOf(LJLZ));
            return;
        }
        if (!this.LJLJI.LLIIIZ && C16330kX.LIZIZ(LJIJJLI.mView)) {
            this.LJLILLLLZI.remove(Long.valueOf(LJLZ));
            return;
        }
        if (LJIJJLI != c79831VUt.LJLIL.LJLILLLLZI) {
            if (LJIJJLI.mView.getParent() != null) {
                C16880lQ.LJLLL(LJIJJLI.mView, (ViewGroup) LJIJJLI.mView.getParent());
            }
            LLFFF(c79831VUt);
            c79831VUt.L(LJIJJLI);
            this.LJZI.LIZJ(c79831VUt);
        }
        ViewGroup.LayoutParams layoutParams2 = c79831VUt.itemView.getLayoutParams();
        if (layoutParams2 instanceof C1BZ) {
            ((C1BZ) layoutParams2).LJLILLLLZI = LLF(i);
        }
        UIList uIList2 = this.LJLJI;
        if (uIList2.LLIIJLIL && uIList2.LJJI() && (uIComponent = c79831VUt.LJLIL.LJLILLLLZI) != null && this.LLFII.containsKey(uIComponent.LJLIL) && (intValue = this.LLFII.get(uIComponent.LJLIL).intValue()) != uIComponent.getHeight()) {
            uIComponent.setHeight(intValue);
        }
        LLFII(c79831VUt, i);
    }

    @Override // X.AbstractC029409q
    /* renamed from: LLFF, reason: merged with bridge method [inline-methods] */
    public final void onBindViewHolder(C79831VUt c79831VUt, int i) {
        int i2;
        int LIZ;
        VRX vrx;
        if (c79831VUt != null && (vrx = c79831VUt.LJLIL) != null && vrx.getMeasureListener() == null) {
            c79831VUt.LJLIL.setMeasureListener(new VRY(this));
        }
        if (this.LJLJJI) {
            LJLLLLLL(c79831VUt, i);
            return;
        }
        long LJLZ = LJLZ();
        this.LJLILLLLZI.put(Long.valueOf(LJLZ), c79831VUt);
        VRX vrx2 = c79831VUt.LJLIL;
        UIComponent uIComponent = vrx2.LJLILLLLZI;
        if (uIComponent == null) {
            UIList uIList = this.LJLJI;
            C79655VNz c79655VNz = uIList.LJLIL;
            int sign = uIList.getSign();
            TemplateAssembler templateAssembler = (TemplateAssembler) c79655VNz.LIZ;
            if (templateAssembler != null) {
                templateAssembler.LJJI(sign, i, LJLZ);
            }
            LynxUI lynxUI = (LynxUI) uIList.LJLILLLLZI;
            uIList.LJLILLLLZI = null;
            UIComponent uIComponent2 = (UIComponent) lynxUI;
            if (uIComponent2 != null) {
                c79831VUt.L(uIComponent2);
                this.LJZI.LIZJ(c79831VUt);
            } else {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("Adapter onBindViewHolder ");
                LIZ2.append(i);
                LIZ2.append("child null");
                LLog.LIZLLL(2, "UIList", X1D.LIZIZ(LIZ2));
            }
        } else {
            vrx2.LJLIL = 1;
            UIList uIList2 = this.LJLJI;
            C79655VNz c79655VNz2 = uIList2.LJLIL;
            int sign2 = uIList2.getSign();
            int sign3 = uIComponent.getSign();
            TemplateAssembler templateAssembler2 = (TemplateAssembler) c79655VNz2.LIZ;
            if (templateAssembler2 != null) {
                templateAssembler2.LJJIZ(sign2, sign3, i, LJLZ);
            }
        }
        JavaOnlyArray javaOnlyArray = this.LJLLJ;
        if (javaOnlyArray != null && javaOnlyArray.size() > i && (LIZ = (int) V9Y.LIZ(this.LJLLJ.getInt(i))) > 0) {
            c79831VUt.LJLIL.LJLJI = LIZ;
        }
        JavaOnlyArray javaOnlyArray2 = this.LJLLILLLL;
        if (javaOnlyArray2 != null && javaOnlyArray2.size() > i && (i2 = this.LJLLILLLL.getInt(i)) > 0) {
            c79831VUt.LJLIL.LJLJI = i2;
        }
    }

    public final void LLFII(C79831VUt c79831VUt, int i) {
        JavaOnlyArray javaOnlyArray = this.LJLLJ;
        if (javaOnlyArray != null && javaOnlyArray.size() > i) {
            int LIZ = (int) V9Y.LIZ(this.LJLLJ.getInt(i));
            if (LIZ > 0) {
                c79831VUt.LJLIL.LJLJI = LIZ;
            } else {
                c79831VUt.getClass();
            }
        }
        JavaOnlyArray javaOnlyArray2 = this.LJLLILLLL;
        if (javaOnlyArray2 != null && javaOnlyArray2.size() > i) {
            int i2 = this.LJLLILLLL.getInt(i);
            if (i2 > 0) {
                c79831VUt.LJLIL.LJLJI = i2;
            } else {
                c79831VUt.getClass();
            }
        }
    }

    @Override // X.AbstractC029409q
    public final C79831VUt onCreateViewHolder(ViewGroup viewGroup, int i) {
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -2);
        VRX vrx = new VRX(viewGroup.getContext());
        vrx.setLayoutParams(layoutParams);
        vrx.setComponentInitMeasure(this.LJLJJLL);
        C79831VUt c79831VUt = new C79831VUt(vrx);
        C0AX.LIZ(viewGroup, c79831VUt.itemView, R.id.lj7);
        View view = c79831VUt.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(viewGroup));
        }
        try {
            if (c79831VUt.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C79831VUt.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c79831VUt.itemView.getParent();
                    if (viewGroup2 != null) {
                        C16880lQ.LJLLL(c79831VUt.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = C79831VUt.class.getName();
        return c79831VUt;
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(C79831VUt c79831VUt, int i, List list) {
        VRX vrx;
        C79831VUt c79831VUt2 = c79831VUt;
        if (c79831VUt2 != null && (vrx = c79831VUt2.LJLIL) != null && vrx.getMeasureListener() == null) {
            c79831VUt2.LJLIL.setMeasureListener(new VRY(this));
        }
        if (this.LJLJJI) {
            if (!list.isEmpty()) {
                i = ((Integer) DIX.LIZJ(list, 1, list)).intValue();
            }
            LJLLLLLL(c79831VUt2, Integer.valueOf(i).intValue());
            return;
        }
        if (list.isEmpty()) {
            onBindViewHolder(c79831VUt2, i);
            return;
        }
        if (c79831VUt2.LJLIL.LJLILLLLZI == null) {
            return;
        }
        long LJLZ = LJLZ();
        Integer num = (Integer) DIX.LIZJ(list, 1, list);
        this.LJLILLLLZI.put(Long.valueOf(LJLZ), c79831VUt2);
        this.LJZI.LIZ(c79831VUt2);
        VRX vrx2 = c79831VUt2.LJLIL;
        vrx2.LJLIL = 1;
        UIList uIList = this.LJLJI;
        UIComponent uIComponent = vrx2.LJLILLLLZI;
        int intValue = num.intValue();
        C79655VNz c79655VNz = uIList.LJLIL;
        int sign = uIList.getSign();
        int sign2 = uIComponent.getSign();
        TemplateAssembler templateAssembler = (TemplateAssembler) c79655VNz.LIZ;
        if (templateAssembler != null) {
            templateAssembler.LJJIZ(sign, sign2, intValue, LJLZ);
        }
        this.LJZI.LIZLLL(c79831VUt2);
        LLFII(c79831VUt2, i);
    }
}
