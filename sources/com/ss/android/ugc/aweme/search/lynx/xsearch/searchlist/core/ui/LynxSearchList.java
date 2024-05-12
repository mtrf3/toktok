package com.ss.android.ugc.aweme.search.lynx.xsearch.searchlist.core.ui;

import X.C15280iq;
import X.C16320kW;
import X.C16880lQ;
import X.C48881JGj;
import X.C48883JGl;
import X.C49173JRp;
import X.C49177JRt;
import X.C49180JRw;
import X.C49181JRx;
import X.C75792yF;
import X.C79817VUf;
import X.EWS;
import X.InterfaceC48907JHj;
import X.JHN;
import X.JRP;
import X.JRT;
import X.JRV;
import X.VNU;
import X.VPD;
import X.VPY;
import X.X1D;
import Y.ARunnableS44S0100000_8;
import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.tasm.base.TraceEvent;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.view.UIComponent;
import com.lynx.tasm.behavior.ui.view.UISimpleView;
import com.ss.android.ugc.aweme.search.lynx.xsearch.searchlist.core.ui.ILynxSearchList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class LynxSearchList extends UISimpleView<JRP> implements ILynxSearchList {
    @Override // com.lynx.tasm.behavior.ui.UIGroup
    public final void onInsertChild(LynxBaseUI lynxBaseUI, int i) {
    }

    @EWS
    public void becomeactive() {
        JRP jrp = (JRP) this.mView;
        SearchListContainer searchListContainer = jrp.LJLIL;
        searchListContainer.LJLLLL = true;
        C15280iq.LIZIZ("HorizontalContainer", "SearchHorizontalInnerContainer:  attachAutoPlay");
        searchListContainer.LLFF.notifyDataSetChanged();
        jrp.LJLIL.LLF.LJ();
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup, com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void layout() {
        if (!this.mView.isLayoutRequested()) {
            TraceEvent.LJ("LynxSearchList.layout");
            return;
        }
        layoutChildren();
        ((ViewGroup) this.mView).layout(getLeft(), getTop(), getWidth() + getLeft(), getHeight() + getTop());
        C16320kW.LIZJ(this.mView, getBoundRectForOverflow());
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup, com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void measure() {
        TraceEvent.LIZIZ("LynxSearchList.measure");
        if (!this.mView.isLayoutRequested()) {
            TraceEvent.LJ("LynxSearchList.measure");
            return;
        }
        super.measureChildren();
        setLayoutParamsInternal();
        this.mView.measure(View.MeasureSpec.makeMeasureSpec(getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getHeight(), 1073741824));
        TraceEvent.LJ("UIList2.measure");
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI, X.VPH
    public final void requestLayout() {
        this.mView.requestLayout();
        if (!this.mView.isLayoutRequested()) {
            T mView = this.mView;
            o.LJIIIIZZ(mView, "mView");
            this.mView.post(new ARunnableS44S0100000_8(mView, 35));
        }
    }

    @EWS
    public void resignactive() {
        SearchListContainer searchListContainer = ((JRP) this.mView).LJLIL;
        searchListContainer.LJLLLL = false;
        C15280iq.LIZIZ("HorizontalContainer", "SearchHorizontalInnerContainer:  detachAutoPlay");
        searchListContainer.LLFF.notifyDataSetChanged();
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup, com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void destroy() {
        C48883JGl c48883JGl;
        super.destroy();
        SearchListContainer searchListContainer = ((JRP) this.mView).LJLIL;
        searchListContainer.LJLLL.clear();
        searchListContainer.LJIJI(searchListContainer.LJIIJJI());
        ArrayList<InterfaceC48907JHj> arrayList = searchListContainer.LJLLL;
        ArrayList arrayList2 = new ArrayList();
        Iterator<InterfaceC48907JHj> it = arrayList.iterator();
        while (it.hasNext()) {
            InterfaceC48907JHj next = it.next();
            if (next instanceof JHN) {
                arrayList2.add(next);
            }
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            C48881JGj c48881JGj = ((JHN) it2.next()).LJLIL;
            if (c48881JGj != null && (c48883JGl = c48881JGj.LJIIJ) != null) {
                c48883JGl.onDestroy();
            }
        }
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup, com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void initialize() {
        super.initialize();
        ILynxSearchList.LJJIIJZLJL.getClass();
        ((JRP) this.mView).setEventChangeListener(new C49177JRt(this, (Set) JRV.LIZIZ.getValue()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x01f5, code lost:
    
        if (r2 != ((java.lang.Number) r1).intValue()) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00eb  */
    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onPropsUpdated() {
        /*
            Method dump skipped, instructions count: 608
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.lynx.xsearch.searchlist.core.ui.LynxSearchList.onPropsUpdated():void");
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup
    public final void measureChildren() {
        super.measureChildren();
    }

    public LynxSearchList(VNU vnu) {
        super(vnu);
    }

    @VPD(name = "activearea")
    public void activeAreaFromLynx(ReadableMap readableMap) {
        ((JRP) this.mView).LIZ(readableMap);
    }

    @VPD(name = "anchormargin")
    public void anchorMarginFromLynx(String str) {
        this.mView.getClass();
    }

    @VPD(name = "anchortype")
    public void anchorTypeFromLynx(String str) {
        this.mView.getClass();
    }

    @VPD(name = "bounce")
    public void bounceFromLynx(boolean z) {
        ((JRP) this.mView).LJLIL.LJIIZILJ(z);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI
    public final View createView(Context context) {
        o.LJIIIZ(context, "context");
        JRP jrp = new JRP(context, this.mContext.LJLJJL);
        new C79817VUf(this.mContext.LJLJJL, jrp.getList(), this);
        return jrp;
    }

    @VPD(name = "extenddata")
    public void extendData(ReadableMap readableMap) {
        String str;
        SearchListContainer searchListContainer = ((JRP) this.mView).LJLIL;
        if (readableMap == null || (str = readableMap.getString("token_type")) == null) {
            str = "";
        }
        searchListContainer.getClass();
        if (!TextUtils.isEmpty(str)) {
            searchListContainer.LJLIL.M(str);
        }
    }

    @VPD(name = "horizontalstyle")
    public void horizontalStyleFromLynx(ReadableMap readableMap) {
        ((JRP) this.mView).LIZIZ(readableMap);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void onLayoutFinish(long j) {
        Integer num;
        boolean z;
        boolean z2;
        SearchListContainer searchListContainer = ((JRP) this.mView).LJLIL;
        C49173JRp c49173JRp = searchListContainer.LLFF;
        c49173JRp.getClass();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Adapter onLayoutFinish ");
        LIZ.append(65535 & j);
        C15280iq.LJ("LynxSearchList", X1D.LIZIZ(LIZ));
        C49181JRx remove = c49173JRp.LJLJL.remove(Long.valueOf(j));
        if (remove != null) {
            UIComponent L = remove.L();
            if (L != null) {
                L.setTop(0);
                L.setLeft(0);
                L.requestLayout();
                if (L.getWidth() != remove.itemView.getWidth()) {
                    z = true;
                } else {
                    z = false;
                }
                if (L.getHeight() != remove.itemView.getHeight()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z || z2) {
                    remove.itemView.requestLayout();
                }
            }
            Object[] objArr = new Object[3];
            objArr[0] = Integer.valueOf(remove.getAdapterPosition());
            Integer num2 = null;
            if (L != null) {
                num = Integer.valueOf(L.getWidth());
            } else {
                num = null;
            }
            objArr[1] = num;
            if (L != null) {
                num2 = Integer.valueOf(L.getHeight());
            }
            objArr[2] = num2;
            String LLLZ = C16880lQ.LLLZ("UIComponent layout finish, position %d (w %d, h %d)", Arrays.copyOf(objArr, 3));
            o.LJIIIIZZ(LLLZ, "format(format, *args)");
            C15280iq.LIZIZ("LynxSearchList", LLLZ);
            remove.LJLIL.setLayoutStatus(2);
        }
        C49173JRp c49173JRp2 = searchListContainer.LLFF;
        if (!c49173JRp2.LJLJLJ && c49173JRp2.LJLJLLL == 0) {
            searchListContainer.LJIILLIIL();
        }
    }

    @EWS
    public void scrolltoindex(ReadableMap readableMap) {
        JRP jrp = (JRP) this.mView;
        jrp.getClass();
        if (readableMap instanceof JavaOnlyMap) {
            JavaOnlyMap javaOnlyMap = (JavaOnlyMap) readableMap;
            System.currentTimeMillis();
            jrp.LIZJ(javaOnlyMap);
            jrp.LJLIL.LJJ((ILynxSearchList.ScrollAnchorInfo) C75792yF.LIZ(C75792yF.LIZJ(javaOnlyMap), ILynxSearchList.ScrollAnchorInfo.class));
            return;
        }
        jrp.LJLIL.LJJ(null);
    }

    @VPD(name = "autoplay")
    public final void setAutoPlay(boolean z) {
        if (z) {
            becomeactive();
        } else {
            resignactive();
        }
    }

    @VPD(name = "sessionid")
    public void setSessionIdFromLynx(int i) {
        ((JRP) this.mView).setSessionIdFromLynx(i);
        JRP jrp = (JRP) this.mView;
        jrp.getClass();
        SearchListContainer searchListContainer = jrp.LJLIL;
        searchListContainer.getClass();
        JRT jrt = searchListContainer.LJZL;
        if (jrt == null) {
            return;
        }
        jrt.LIZJ = new C49180JRw(this);
    }

    @VPD(name = "snaptogrid")
    public void snapToGridFromLynx(boolean z) {
        ((JRP) this.mView).LIZLLL(z);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final VPY hitTest(float f, float f2) {
        UIComponent L;
        RecyclerView list = ((JRP) this.mView).getList();
        if (list.getAdapter() == null) {
            return this;
        }
        for (int childCount = list.getChildCount() - 1; -1 < childCount; childCount--) {
            RecyclerView.ViewHolder LJJJJJL = list.LJJJJJL(list.getChildAt(childCount));
            if ((LJJJJJL instanceof C49181JRx) && (L = ((C49181JRx) LJJJJJL).L()) != null && L.containsPoint(f - r3.getLeft(), f2 - r3.getTop())) {
                VPY hitTest = L.hitTest(f - r3.getLeft(), f2 - r3.getTop());
                o.LJIIIIZZ(hitTest, "it.hitTest(x - childView.left, y - childView.top)");
                return hitTest;
            }
        }
        return this;
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void insertChild(LynxBaseUI child, int i) {
        C49180JRw c49180JRw;
        o.LJIIIZ(child, "child");
        JRT jrt = ((JRP) this.mView).LJLIL.LJZL;
        if (jrt == null || (c49180JRw = jrt.LIZJ) == null) {
            return;
        }
        child.setParent(this);
        List<LynxBaseUI> list = this.mChildren;
        ListProtector.add(list, list.size(), child);
        c49180JRw.LIZJ = child;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void updateLayout(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, Rect rect) {
        super.updateLayout(i, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, i15, i16, rect);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void updateLayoutInfo(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, Rect rect) {
        super.updateLayoutInfo(i, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, i15, i16, rect);
    }
}
