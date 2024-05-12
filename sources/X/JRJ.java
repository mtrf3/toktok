package X;

import Y.AfS60S0100000_8;
import Y.IDhS69S0200000_8;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.react.bridge.ReadableMap;
import com.ss.android.ugc.aweme.search.lynx.xsearch.horizontallist.core.ui.ILynxSearchHorizontal;
import com.ss.android.ugc.aweme.search.lynx.xsearch.horizontallist.core.ui.SearchHorizontalInnerContainer;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS139S0200000_8;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class JRJ extends FrameLayout implements ILynxSearchHorizontal, InterfaceC48907JHj {
    public final C62822Ol8 LJLIL;
    public boolean LJLILLLLZI;
    public boolean LJLJI;
    public boolean LJLJJI;
    public boolean LJLJJL;
    public final SearchHorizontalInnerContainer LJLJJLL;

    @Override // X.InterfaceC48907JHj
    public final void LJIILL() {
    }

    @Override // X.InterfaceC49148JQq
    public final Boolean LLFFF() {
        return null;
    }

    @Override // X.InterfaceC49148JQq
    public final boolean LLIIII() {
        return true;
    }

    @Override // X.InterfaceC48907JHj
    public final void contextPause() {
    }

    @Override // X.InterfaceC48907JHj
    public final void g9() {
    }

    @Override // X.InterfaceC49148JQq
    public View getDetectView() {
        return null;
    }

    @Override // X.InterfaceC49148JQq
    public InterfaceC46334IGk getPreload() {
        return null;
    }

    @Override // X.InterfaceC49148JQq
    public InterfaceC49137JQf getPriority() {
        return null;
    }

    @Override // X.InterfaceC48907JHj
    public final void pause() {
    }

    @Override // X.InterfaceC48907JHj
    public final void play() {
    }

    public void setAutoPlay(boolean z) {
    }

    private final JR1 getHolderWrapper() {
        return this.LJLJJLL.LJLZ.LJIIL();
    }

    private final JRB getSubHolder() {
        return this.LJLJJLL.LJLZ;
    }

    public final boolean LIZLLL() {
        ReadableMap readableMap;
        if (this.LJLILLLLZI && this.LJLJJI && this.LJLJI && this.LJLJJL && (readableMap = this.LJLJJLL.LJLL) != null && readableMap.hasKey("rank")) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC48907JHj
    public final View LJJIJIL() {
        return this.LJLJJLL.LJLZ.LJJIJIL();
    }

    @Override // X.InterfaceC48907JHj
    public final void LLLJIL() {
        this.LJLJJLL.V();
    }

    @Override // X.InterfaceC48907JHj
    public final void LLLLLJLJLL() {
        if (!C46446IKs.LJLJLJ) {
            return;
        }
        C49153JQv c49153JQv = this.LJLJJLL.LJLZ.LJLZ;
        if (C79004UzY.LJJIFFI(c49153JQv.LIZIZ)) {
            return;
        }
        Iterator<AbstractC49155JQx> it = c49153JQv.LIZIZ.iterator();
        while (it.hasNext()) {
            it.next().LIZJ();
        }
    }

    public final C49128JPw getCurrentPlayingIndexInfo() {
        Integer num;
        Rect LIZIZ;
        int i;
        Rect LIZIZ2;
        SearchHorizontalInnerContainer searchHorizontalInnerContainer = this.LJLJJLL;
        JRB jrb = searchHorizontalInnerContainer.LJLZ;
        AbstractC49155JQx abstractC49155JQx = jrb.LJLZ.LIZJ;
        Integer num2 = null;
        if (C26338AVi.LIZJ(jrb.LJIIIIZZ())) {
            int LJJJJL = C63081OpJ.LJJJJL(searchHorizontalInnerContainer.LJLZ.LJIIIIZZ());
            if (abstractC49155JQx != null && (LIZIZ2 = abstractC49155JQx.LIZIZ()) != null) {
                i = LIZIZ2.right;
            } else {
                i = 0;
            }
            num = Integer.valueOf(LJJJJL - i);
        } else if (abstractC49155JQx != null && (LIZIZ = abstractC49155JQx.LIZIZ()) != null) {
            num = Integer.valueOf(LIZIZ.left);
        } else {
            num = null;
        }
        if (abstractC49155JQx != null) {
            num2 = Integer.valueOf(abstractC49155JQx.LIZ());
        }
        return new C49128JPw(num2, num);
    }

    public final List<InterfaceC92693kP> getDisposableList() {
        return (List) this.LJLIL.getValue();
    }

    public final InterfaceC48907JHj getPlayerView() {
        return this.LJLJJLL.T();
    }

    @Override // X.InterfaceC49148JQq
    public final boolean isPlaying() {
        if (this.LJLJJLL.T() != null) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC49148JQq
    public final View LLLLZLLIL() {
        return C48905JHh.LIZ(this);
    }

    @Override // X.InterfaceC49148JQq
    public final void LLLLLIL() {
        C48905JHh.LIZIZ(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JRJ(Context context) {
        super(context, null, 0);
        JIB jib;
        a1.LJFF(context, "context");
        JGU jgu = null;
        this.LJLIL = C221108m2.LIZIZ(C35965E9p.LJLIL);
        JI2 LIZ = C48923JHz.LIZ(this);
        if (LIZ != null) {
            jib = LIZ.LJLILLLLZI;
            jgu = LIZ.LJLJI;
        } else {
            jib = null;
        }
        SearchHorizontalInnerContainer searchHorizontalInnerContainer = new SearchHorizontalInnerContainer(C50365Jph.LIZIZ(R.layout.cji, this), jib, jgu);
        this.LJLJJLL = searchHorizontalInnerContainer;
        searchHorizontalInnerContainer.LLLLIIIILLL(new JQA());
        addView(searchHorizontalInnerContainer.itemView);
    }

    public final void LIZ(ReadableMap readableMap) {
        if (!(readableMap instanceof JavaOnlyMap)) {
            return;
        }
        LJI((JavaOnlyMap) readableMap, ILynxSearchHorizontal.ActiveArea.class, new AqS139S0200000_8(getHolderWrapper(), this, 46));
    }

    public final void LIZIZ(boolean z) {
        getSubHolder().LJIILLIIL(z);
    }

    public final void LIZJ(ReadableMap readableMap) {
        if (!(readableMap instanceof JavaOnlyMap)) {
            this.LJLJJL = true;
        } else {
            LJI((JavaOnlyMap) readableMap, ILynxSearchHorizontal.HorizontalStyle.class, new AqS139S0200000_8(getHolderWrapper(), this, 47));
        }
    }

    public final JavaOnlyMap LJ(JavaOnlyMap javaOnlyMap) {
        for (Map.Entry<String, Object> entry : javaOnlyMap.entrySet()) {
            if (entry.getValue() instanceof JavaOnlyMap) {
                Object value = entry.getValue();
                o.LJII(value, "null cannot be cast to non-null type com.lynx.react.bridge.JavaOnlyMap");
                JavaOnlyMap javaOnlyMap2 = (JavaOnlyMap) value;
                if (javaOnlyMap2.containsKey("__lynx_val__")) {
                    javaOnlyMap.put(entry.getKey(), javaOnlyMap2.get("__lynx_val__"));
                } else {
                    String key = entry.getKey();
                    LJ(javaOnlyMap2);
                    javaOnlyMap.put(key, javaOnlyMap2);
                }
            } else {
                javaOnlyMap.put(entry.getKey(), entry.getValue());
            }
        }
        return javaOnlyMap;
    }

    public final void LJFF(boolean z) {
        JR1 holderWrapper = getHolderWrapper();
        if (z) {
            holderWrapper.LJZ = true;
            ((AbstractC28951Br) holderWrapper.LJLZ.getValue()).LIZIZ(holderWrapper.LJLLILLLL);
        } else {
            holderWrapper.LJZ = false;
            ((AbstractC28951Br) holderWrapper.LJLZ.getValue()).LIZIZ(null);
        }
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        SearchHorizontalInnerContainer searchHorizontalInnerContainer = this.LJLJJLL;
        if (i == 8) {
            if (searchHorizontalInnerContainer.T() != null) {
                JLU.LJFF();
                return;
            }
            return;
        }
        searchHorizontalInnerContainer.getClass();
    }

    public final void setBounceView(View view) {
        Integer num;
        o.LJIIIZ(view, "view");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("set bounce view: ");
        LIZ.append(view);
        LIZ.append(" (WxH=");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Integer num2 = null;
        if (layoutParams != null) {
            num = Integer.valueOf(layoutParams.width);
        } else {
            num = null;
        }
        LIZ.append(num);
        LIZ.append('x');
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        if (layoutParams2 != null) {
            num2 = Integer.valueOf(layoutParams2.height);
        }
        LIZ.append(num2);
        LIZ.append(')');
        X1D.LIZIZ(LIZ);
        JRB subHolder = getSubHolder();
        subHolder.getClass();
        subHolder.LJZ = view;
        ViewGroup viewGroup = subHolder.LJLIL.LJLJI;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
            FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
            layoutParams3.gravity = 17;
            viewGroup.addView(subHolder.LJZ, layoutParams3);
        }
    }

    public void setEventChangeListener(C49177JRt c49177JRt) {
        this.LJLJJLL.LJLLI = c49177JRt;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0024, code lost:
    
        if (r2 != 40) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setSessionIdFromLynx(int r6) {
        /*
            r5 = this;
            com.ss.android.ugc.aweme.search.lynx.xsearch.horizontallist.core.ui.SearchHorizontalInnerContainer r4 = r5.LJLJJLL
            r4.getClass()
            X.Jjj r3 = X.C49995Jjj.LIZ
            X.JSE r0 = r3.LIZ(r6)
            if (r0 == 0) goto L6e
            com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch r0 = r0.LIZ
            if (r0 == 0) goto L6e
            int r2 = r0.getOriginType()
        L15:
            r4.LJLLLLLL = r2
            r0 = 72
            r1 = 0
            if (r2 == r0) goto L26
            r4.LLFZ = r1
            r0 = 74
            if (r2 == r0) goto L28
            r0 = 40
            if (r2 == r0) goto L28
        L26:
            r4.LLI = r1
        L28:
            X.JRE r1 = new X.JRE
            X.JSE r0 = r3.LIZ(r6)
            r1.<init>(r0)
            r4.Y(r1)
            X.1qj r0 = r4.getActivity()
            int r0 = r0.hashCode()
            java.lang.String r1 = java.lang.String.valueOf(r0)
            com.ss.android.ugc.aweme.search.lynx.xsearch.horizontallist.core.viewmodel.SearchTabHorizontalVM r0 = r4.LLFZ
            if (r0 == 0) goto L47
            r0.sv0(r1)
        L47:
            com.ss.android.ugc.aweme.search.lynx.xsearch.horizontallist.core.viewmodel.SearchSeparateTabHorizontalVM r0 = r4.LLI
            if (r0 == 0) goto L50
            r0.LJLLL = r2
            r0.sv0(r1)
        L50:
            X.JSE r0 = r3.LIZ(r6)
            r2 = 1
            if (r0 == 0) goto L6b
            int r1 = r0.LIZLLL
            com.ss.android.ugc.aweme.search.lynx.xsearch.horizontallist.core.ui.SearchHorizontalInnerContainer r0 = r5.LJLJJLL
            r0.getClass()
            X.JQA r0 = r0.LJLJL()
            r0.LJIIL = r1
            r5.LJLJI = r2
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r5)
        L6b:
            r5.LJLJI = r2
            return
        L6e:
            r2 = -1
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: X.JRJ.setSessionIdFromLynx(int):void");
    }

    @Override // X.InterfaceC49148JQq
    public final void x4(C49187JSd listener) {
        o.LJIIIZ(listener, "listener");
    }

    @Override // X.InterfaceC49148JQq
    public final void y(long j) {
        C48905JHh.LIZJ(this, j);
    }

    @Override // X.InterfaceC49148JQq
    public final void z8(C49187JSd listener) {
        o.LJIIIZ(listener, "listener");
    }

    public final void LJII(int i, int i2) {
        ViewGroup.LayoutParams layoutParams;
        JRB subHolder = getSubHolder();
        View view = subHolder.LJZ;
        if (view == null || (layoutParams = view.getLayoutParams()) == null) {
            layoutParams = new FrameLayout.LayoutParams(i, i2);
        }
        layoutParams.width = i;
        layoutParams.height = i2;
        View view2 = subHolder.LJZ;
        if (view2 != null) {
            view2.setLayoutParams(layoutParams);
        }
        ViewGroup viewGroup = subHolder.LJLIL.LJLJI;
        if (viewGroup != null) {
            ViewGroup.LayoutParams layoutParams2 = viewGroup.getLayoutParams();
            if (layoutParams2 == null) {
                layoutParams2 = new LinearLayout.LayoutParams(i, -1);
            }
            layoutParams2.width = i;
            viewGroup.setLayoutParams(layoutParams2);
        }
    }

    public final <T> void LJI(JavaOnlyMap javaOnlyMap, Class<T> cls, InterfaceC88472Yns<? super T, C76800UCe> interfaceC88472Yns) {
        getDisposableList().add(AbstractC73745Swv.LJFF(javaOnlyMap).LJI(new IDhS69S0200000_8(this, cls, 1)).LJIILJJIL(T16.LIZIZ).LJII(C73969T1h.LIZIZ()).LJIIJJI(new AfS60S0100000_8(interfaceC88472Yns, 25), JRL.LJLIL, new JRK(getDisposableList().size(), this), EnumC73750Sx0.INSTANCE));
    }
}
