package com.ss.android.ugc.aweme.search.lynx.xsearch.horizontallist.core.ui;

import X.AbstractC73745Swv;
import X.C141335gf;
import X.C15280iq;
import X.C3C5;
import X.C48881JGj;
import X.C48883JGl;
import X.C49158JRa;
import X.C49177JRt;
import X.C49178JRu;
import X.C49218JTi;
import X.C73969T1h;
import X.C76800UCe;
import X.EWS;
import X.EnumC73750Sx0;
import X.InterfaceC48907JHj;
import X.InterfaceC64592gB;
import X.InterfaceC92693kP;
import X.JHN;
import X.JLS;
import X.JR1;
import X.JRB;
import X.JRJ;
import X.JS0;
import X.JSF;
import X.JSH;
import X.JSL;
import X.JTP;
import X.T16;
import X.VNU;
import X.VPD;
import X.X1D;
import Y.AfS60S0100000_8;
import Y.IDhS101S0100000_8;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.view.UISimpleView;
import com.ss.android.ugc.aweme.search.lynx.xsearch.horizontallist.core.ui.ILynxSearchHorizontal;
import com.ss.android.ugc.aweme.search.pages.result.autoplay.core.viewmodel.Taco;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AqS139S0200000_8;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class LynxSearchHorizontal extends UISimpleView<JRJ> implements ILynxSearchHorizontal {
    public SearchHorizontalBounceView LJLIL;

    @EWS
    public void becomeactive() {
        JRJ jrj = (JRJ) this.mView;
        SearchHorizontalInnerContainer searchHorizontalInnerContainer = jrj.LJLJJLL;
        searchHorizontalInnerContainer.LJLLLL = true;
        C15280iq.LIZIZ("HorizontalContainer", "SearchHorizontalInnerContainer:  attachAutoPlay");
        searchHorizontalInnerContainer.LJLZ.LJLLLLLL.notifyDataSetChanged();
        jrj.LJLJJLL.tryPlay();
    }

    @EWS
    public void resignactive() {
        SearchHorizontalInnerContainer searchHorizontalInnerContainer = ((JRJ) this.mView).LJLJJLL;
        searchHorizontalInnerContainer.LJLLLL = false;
        C15280iq.LIZIZ("HorizontalContainer", "SearchHorizontalInnerContainer:  detachAutoPlay");
        searchHorizontalInnerContainer.LJLZ.LJLLLLLL.notifyDataSetChanged();
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup, com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void destroy() {
        C48883JGl c48883JGl;
        super.destroy();
        JRJ jrj = (JRJ) this.mView;
        SearchHorizontalInnerContainer searchHorizontalInnerContainer = jrj.LJLJJLL;
        List<InterfaceC48907JHj> Q = searchHorizontalInnerContainer.Q();
        ArrayList arrayList = new ArrayList();
        Iterator it = ((ArrayList) Q).iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (next instanceof JHN) {
                arrayList.add(next);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            C48881JGj c48881JGj = ((JHN) it2.next()).LJLIL;
            if (c48881JGj != null && (c48883JGl = c48881JGj.LJIIJ) != null) {
                c48883JGl.onDestroy();
            }
        }
        ArrayList<RecyclerView.ViewHolder> viewHolderList = searchHorizontalInnerContainer.LJLLJ;
        o.LJIIIZ(viewHolderList, "viewHolderList");
        if (((Number) JTP.LIZ.getValue()).intValue() == 1) {
            try {
                Iterator<RecyclerView.ViewHolder> it3 = viewHolderList.iterator();
                while (it3.hasNext()) {
                    View view = it3.next().itemView;
                    o.LJIIIIZZ(view, "it.itemView");
                    if (view instanceof ViewGroup) {
                        JTP.LIZ((ViewGroup) view);
                    }
                }
                C3C5.m7constructorimpl(C76800UCe.LIZ);
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
        }
        jrj.LJLJI = false;
        jrj.LJLILLLLZI = false;
        jrj.LJLJJI = false;
        for (InterfaceC92693kP interfaceC92693kP : jrj.getDisposableList()) {
            if (!interfaceC92693kP.isDisposed()) {
                interfaceC92693kP.dispose();
            }
        }
        jrj.getDisposableList().clear();
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup, com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void initialize() {
        super.initialize();
        ILynxSearchHorizontal.LJJIIJ.getClass();
        ((JRJ) this.mView).setEventChangeListener(new C49177JRt(this, (Set) C49158JRa.LIZIZ.getValue()));
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup
    public final void measureChildren() {
        super.measureChildren();
        SearchHorizontalBounceView searchHorizontalBounceView = this.LJLIL;
        if (searchHorizontalBounceView != null) {
            int width = searchHorizontalBounceView.getWidth();
            int height = searchHorizontalBounceView.getHeight();
            SearchHorizontalBounceView searchHorizontalBounceView2 = this.LJLIL;
            if (searchHorizontalBounceView2 != null) {
                searchHorizontalBounceView2.measure();
            }
            ((JRJ) this.mView).LJII(width, height);
            SearchHorizontalBounceView searchHorizontalBounceView3 = this.LJLIL;
            if (searchHorizontalBounceView3 != null) {
                searchHorizontalBounceView3.layout();
            }
        }
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup, com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void layout() {
        super.layout();
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup, com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void measure() {
        super.measure();
    }

    public LynxSearchHorizontal(VNU vnu) {
        super(vnu);
    }

    @VPD(name = "activearea")
    public void activeAreaFromLynx(ReadableMap readableMap) {
        ((JRJ) this.mView).LIZ(readableMap);
    }

    @VPD(name = "anchormargin")
    public void anchorMarginFromLynx(String str) {
        this.mView.getClass();
    }

    @VPD(name = "anchortype")
    public void anchorTypeFromLynx(String str) {
        this.mView.getClass();
    }

    @VPD(name = "datalist")
    public void bind(ReadableMap readableMap) {
        JRJ jrj = (JRJ) this.mView;
        if (readableMap == null) {
            jrj.getClass();
            return;
        }
        jrj.getDisposableList().add(AbstractC73745Swv.LJFF(readableMap).LJI(new IDhS101S0100000_8(jrj, 5)).LJIILJJIL(T16.LIZIZ).LJII(C73969T1h.LIZIZ()).LJIIJJI(new AfS60S0100000_8(jrj, 26), new InterfaceC64592gB() { // from class: X.9FZ
            @Override // X.InterfaceC64592gB
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
            }
        }, new JS0(jrj.getDisposableList().size(), jrj), EnumC73750Sx0.INSTANCE));
    }

    @VPD(name = "bounce")
    public void bounceFromLynx(boolean z) {
        ((JRJ) this.mView).LIZIZ(z);
    }

    @EWS
    public void controlatposition(ReadableMap readableMap) {
        JSL jsl;
        int i;
        JSH jsh;
        int i2;
        C49178JRu.LJIIJ = System.currentTimeMillis();
        T t = this.mView;
        t.getClass();
        Taco LIZ = C49218JTi.LIZ(t, false);
        if (LIZ != null) {
            jsl = LIZ.LJFF(17);
        } else {
            jsl = null;
        }
        C49178JRu c49178JRu = (C49178JRu) jsl;
        if (c49178JRu != null) {
            if (readableMap != null) {
                i = readableMap.getInt("position");
            } else {
                i = 0;
            }
            RecyclerView recyclerView = c49178JRu.LIZIZ;
            if (recyclerView != null) {
                RecyclerView.ViewHolder LJJIZ = recyclerView.LJJIZ(i);
                if (!(LJJIZ instanceof JSH) || (jsh = (JSH) LJJIZ) == null) {
                    return;
                }
                C49178JRu.LJIIJJI = System.currentTimeMillis();
                if (readableMap != null && (i2 = readableMap.getInt("action")) != 0) {
                    if (i2 != 1) {
                        return;
                    }
                    jsh.LLLLLJLJLL();
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("pause:");
                    LIZ2.append(jsh);
                    X1D.LIZIZ(LIZ2);
                    return;
                }
                jsh.LLLJIL();
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("play:");
                LIZ3.append(jsh);
                X1D.LIZIZ(LIZ3);
                long j = C49178JRu.LJIIJJI - C49178JRu.LJIIIIZZ;
                StringBuilder LIZ4 = X1D.LIZ();
                LIZ4.append("time to build data:");
                LIZ4.append(C49178JRu.LJIIIZ - C49178JRu.LJIIIIZZ);
                X1D.LIZIZ(LIZ4);
                StringBuilder LIZ5 = X1D.LIZ();
                LIZ5.append("time to fe:");
                LIZ5.append(C49178JRu.LJIIJ - C49178JRu.LJIIIZ);
                X1D.LIZIZ(LIZ5);
                StringBuilder LIZ6 = X1D.LIZ();
                LIZ6.append("time to play child:");
                LIZ6.append(C49178JRu.LJIIJJI - C49178JRu.LJIIJ);
                X1D.LIZIZ(LIZ6);
                StringBuilder LIZ7 = X1D.LIZ();
                LIZ7.append("all time:");
                LIZ7.append(j);
                X1D.LIZIZ(LIZ7);
                if (j > 1000) {
                    return;
                }
                new JSF(j, "lynx").LJIILIIL();
                return;
            }
            o.LJIJI("listView");
            throw null;
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI
    public final View createView(Context context) {
        o.LJI(context);
        return new JRJ(context);
    }

    @VPD(name = "twomiddlevideosstyle")
    public void hasTwoMiddleVideo(boolean z) {
        JRB jrb = ((JRJ) this.mView).LJLJJLL.LJLZ;
        jrb.LJLLLLLL.LJLJJLL = z;
        JR1 LJIIL = jrb.LJIIL();
        LJIIL.LJZI = z;
        JLS jls = LJIIL.LJZL;
        if (jls != null) {
            jls.LIZLLL = z;
        }
    }

    @VPD(name = "horizontalstyle")
    public void horizontalStyleFromLynx(ReadableMap readableMap) {
        ((JRJ) this.mView).LIZJ(readableMap);
    }

    @VPD(name = "invokeforexittab")
    public void invokeForExitTab(boolean z) {
        this.mView.getClass();
    }

    @VPD(name = "logextra")
    public void logExtraFromLynx(ReadableMap readableMap) {
        JRJ jrj = (JRJ) this.mView;
        if (readableMap == null) {
            jrj.getClass();
            return;
        }
        SearchHorizontalInnerContainer searchHorizontalInnerContainer = jrj.LJLJJLL;
        searchHorizontalInnerContainer.LJLL = readableMap;
        String string = readableMap.getString("token_type");
        if (string == null) {
            string = "";
        }
        searchHorizontalInnerContainer.LJLLL = string;
        jrj.LJLILLLLZI = true;
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
        ((JRJ) this.mView).setSessionIdFromLynx(i);
    }

    @VPD(name = "snaptogrid")
    public void snapToGridFromLynx(boolean z) {
        ((JRJ) this.mView).LJFF(z);
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void insertChild(LynxBaseUI lynxBaseUI, int i) {
        if (lynxBaseUI instanceof SearchHorizontalBounceView) {
            SearchHorizontalBounceView searchHorizontalBounceView = (SearchHorizontalBounceView) lynxBaseUI;
            this.LJLIL = searchHorizontalBounceView;
            JRJ jrj = (JRJ) this.mView;
            View view = searchHorizontalBounceView.mView;
            o.LJIIIIZZ(view, "child.view");
            jrj.setBounceView(view);
        }
    }

    @EWS
    public void scrolltoindex(ReadableMap readableMap, Callback callback) {
        JRJ jrj = (JRJ) this.mView;
        jrj.getClass();
        if (readableMap instanceof JavaOnlyMap) {
            jrj.LJI((JavaOnlyMap) readableMap, ILynxSearchHorizontal.ScrollAnchorInfo.class, new AqS139S0200000_8(jrj, callback, 48));
        } else {
            jrj.LJLJJLL.X(null, callback);
        }
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
