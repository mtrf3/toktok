package X;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.react.bridge.ReadableMap;
import com.ss.android.ugc.aweme.search.lynx.xsearch.searchlist.core.ui.ILynxSearchList;
import com.ss.android.ugc.aweme.search.lynx.xsearch.searchlist.core.ui.SearchListContainer;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Map;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;

/* loaded from: classes9.dex */
public final class JRP extends FrameLayout implements ILynxSearchList, InterfaceC48907JHj {
    public final SearchListContainer LJLIL;

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
    public final void LLLLLJLJLL() {
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

    private final JR4 getHolderWrapper() {
        return this.LJLIL.LJIIL();
    }

    @Override // X.InterfaceC48907JHj
    public final View LJJIJIL() {
        return this.LJLIL.LJIIL().LJLIL;
    }

    @Override // X.InterfaceC48907JHj
    public final void LLLJIL() {
        this.LJLIL.LJIL();
    }

    public final RecyclerView getList() {
        return this.LJLIL.LJLIL.LJLILLLLZI;
    }

    @Override // X.InterfaceC49148JQq
    public final boolean isPlaying() {
        SearchListContainer searchListContainer = this.LJLIL;
        searchListContainer.LJLLL.clear();
        searchListContainer.LJIJI(searchListContainer.LJIIJJI());
        ArrayList<InterfaceC48907JHj> arrayList = searchListContainer.LJLLL;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            InterfaceC48907JHj interfaceC48907JHj = (InterfaceC48907JHj) ListProtector.get(arrayList, i);
            if (interfaceC48907JHj.isPlaying()) {
                searchListContainer.LJLLLLLL = interfaceC48907JHj;
                return true;
            }
        }
        return false;
    }

    @Override // X.InterfaceC49148JQq
    public final View LLLLZLLIL() {
        return C48905JHh.LIZ(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        C49181JRx c49181JRx;
        super.onAttachedToWindow();
        SearchListContainer searchListContainer = this.LJLIL;
        searchListContainer.getClass();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(" onViewAttachedToWindow  ");
        LIZ.append(searchListContainer);
        C15280iq.LIZIZ("HorizontalContainer", X1D.LIZIZ(LIZ));
        EventBus.LIZJ().LJIILJJIL(searchListContainer);
        int childCount = searchListContainer.LJIIJJI().getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = searchListContainer.LJIIJJI().getChildAt(i);
            if (childAt != null && (c49181JRx = (C49181JRx) searchListContainer.LJIIJJI().LJJJJJL(childAt)) != null && c49181JRx.getBindingAdapterPosition() != -1) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append(" onViewAttachedToWindow  holder:");
                LIZ2.append(i);
                C15280iq.LIZIZ("HorizontalContainer", X1D.LIZIZ(LIZ2));
                C49173JRp c49173JRp = searchListContainer.LLFF;
                c49173JRp.getClass();
                C49176JRs c49176JRs = c49173JRp.LJLLJ;
                if (c49176JRs != null) {
                    c49176JRs.LIZ(new C49174JRq(c49181JRx, "nodeappear"));
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        C49181JRx c49181JRx;
        super.onDetachedFromWindow();
        SearchListContainer searchListContainer = this.LJLIL;
        searchListContainer.getClass();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(" onViewDetachedFromWindow  ");
        LIZ.append(searchListContainer);
        C15280iq.LIZIZ("HorizontalContainer", X1D.LIZIZ(LIZ));
        EventBus.LIZJ().LJIJ(searchListContainer);
        int childCount = searchListContainer.LJIIJJI().getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = searchListContainer.LJIIJJI().getChildAt(i);
            if (childAt != null && (c49181JRx = (C49181JRx) searchListContainer.LJIIJJI().LJJJJJL(childAt)) != null && c49181JRx.getBindingAdapterPosition() != -1) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append(" onDetachedFromWindow  holder:");
                LIZ2.append(i);
                C15280iq.LIZIZ("HorizontalContainer", X1D.LIZIZ(LIZ2));
                C49173JRp c49173JRp = searchListContainer.LLFF;
                c49173JRp.getClass();
                C49176JRs c49176JRs = c49173JRp.LJLLJ;
                if (c49176JRs != null) {
                    c49176JRs.LIZ(new C49174JRq(c49181JRx, "nodedisappear"));
                }
            }
        }
    }

    @Override // X.InterfaceC49148JQq
    public final void LLLLLIL() {
        C48905JHh.LIZIZ(this);
    }

    public final void LIZ(ReadableMap readableMap) {
        if (!(readableMap instanceof JavaOnlyMap)) {
            return;
        }
        JR4 holderWrapper = getHolderWrapper();
        JavaOnlyMap javaOnlyMap = (JavaOnlyMap) readableMap;
        System.currentTimeMillis();
        LIZJ(javaOnlyMap);
        ILynxSearchList.ActiveArea area = (ILynxSearchList.ActiveArea) C75792yF.LIZ(C75792yF.LIZJ(javaOnlyMap), ILynxSearchList.ActiveArea.class);
        if (area == null) {
            holderWrapper.getClass();
        } else {
            JR3 jr3 = holderWrapper.LJLLL;
            if (jr3 != null) {
                jr3.LJIIJJI(area.getX(), area.getY(), area.getWidth(), area.getHeight());
            }
            holderWrapper.LJLLLL = area;
        }
        SearchListContainer searchListContainer = this.LJLIL;
        searchListContainer.getClass();
        o.LJIIIZ(area, "area");
        JR9 jr9 = searchListContainer.LJLIL.LJLJL;
        if (jr9 != null) {
            jr9.LIZ(area);
        }
    }

    public final void LIZIZ(ReadableMap readableMap) {
        if (!(readableMap instanceof JavaOnlyMap)) {
            return;
        }
        JR4 holderWrapper = getHolderWrapper();
        JavaOnlyMap javaOnlyMap = (JavaOnlyMap) readableMap;
        System.currentTimeMillis();
        LIZJ(javaOnlyMap);
        ILynxSearchList.HorizontalStyle horizontalStyle = (ILynxSearchList.HorizontalStyle) C75792yF.LIZ(C75792yF.LIZJ(javaOnlyMap), ILynxSearchList.HorizontalStyle.class);
        if (horizontalStyle == null) {
            holderWrapper.getClass();
            return;
        }
        Context context = holderWrapper.LJLLILLLL.getContext();
        if (context == null) {
            return;
        }
        holderWrapper.LJLLILLLL.setPadding(C63081OpJ.LJIJJLI(context, horizontalStyle.getLeftMargin()), holderWrapper.LJLLILLLL.getPaddingTop(), C63081OpJ.LJIJJLI(context, horizontalStyle.getRightMargin()), holderWrapper.LJLLILLLL.getPaddingBottom());
        if (holderWrapper.LJLLILLLL.getItemDecorationCount() <= 0) {
            holderWrapper.LJLLILLLL.LJII((AbstractC030309z) holderWrapper.LJLLLLLL.getValue(), -1);
        }
        ((C49159JRb) holderWrapper.LJLLLLLL.getValue()).LJLIL = KL2.LIZJ(context, horizontalStyle.getItemSpace());
    }

    public final JavaOnlyMap LIZJ(JavaOnlyMap javaOnlyMap) {
        for (Map.Entry<String, Object> entry : javaOnlyMap.entrySet()) {
            if (entry.getValue() instanceof JavaOnlyMap) {
                Object value = entry.getValue();
                o.LJII(value, "null cannot be cast to non-null type com.lynx.react.bridge.JavaOnlyMap");
                JavaOnlyMap javaOnlyMap2 = (JavaOnlyMap) value;
                if (javaOnlyMap2.containsKey("__lynx_val__")) {
                    javaOnlyMap.put(entry.getKey(), javaOnlyMap2.get("__lynx_val__"));
                } else {
                    String key = entry.getKey();
                    LIZJ(javaOnlyMap2);
                    javaOnlyMap.put(key, javaOnlyMap2);
                }
            } else {
                javaOnlyMap.put(entry.getKey(), entry.getValue());
            }
        }
        return javaOnlyMap;
    }

    public final void LIZLLL(boolean z) {
        JR4 holderWrapper = getHolderWrapper();
        if (z) {
            holderWrapper.LJZ = true;
            ((AbstractC28951Br) holderWrapper.LJLZ.getValue()).LIZIZ(holderWrapper.LJLLILLLL);
        } else {
            holderWrapper.LJZ = false;
            ((AbstractC28951Br) holderWrapper.LJLZ.getValue()).LIZIZ(null);
        }
    }

    public void setEventChangeListener(C49177JRt c49177JRt) {
        this.LJLIL.LJLLJ = c49177JRt;
    }

    public void setSessionIdFromLynx(int i) {
        C49177JRt c49177JRt;
        SearchListContainer searchListContainer = this.LJLIL;
        searchListContainer.getClass();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SearchHorizontalViewHolder:  generateDataProvider");
        LIZ.append(i);
        C15280iq.LIZIZ("HorizontalContainer", X1D.LIZIZ(LIZ));
        if (i != -1) {
            JRT jrt = new JRT(C49995Jjj.LIZ.LIZ(i));
            jrt.LIZIZ = searchListContainer.LJLLJ;
            searchListContainer.LJZL = jrt;
            searchListContainer.LLFF.LJLJJL = jrt;
            JR3 jr3 = searchListContainer.LJIIL().LJLLL;
            if (jr3 != null) {
                jr3.LJII = jrt.LIZIZ;
            }
            JRG jrg = searchListContainer.LJZI;
            if (jrg != null) {
                searchListContainer.LJIIJJI().LJJLL(jrg);
            }
            JRT jrt2 = searchListContainer.LJZL;
            if (jrt2 != null && (c49177JRt = jrt2.LIZIZ) != null) {
                JRG jrg2 = new JRG(c49177JRt);
                searchListContainer.LJZI = jrg2;
                searchListContainer.LJIIJJI().LJIIJJI(jrg2);
            }
        }
        if (C49995Jjj.LIZ.LIZ(i) != null) {
            new WeakReference(this);
        }
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JRP(Context context, VNL vnl) {
        super(context, null, 0);
        a1.LJFF(context, "context");
        SearchListContainer searchListContainer = new SearchListContainer(this, vnl, new JTI(C50365Jph.LIZIZ(R.layout.cjf, this)));
        this.LJLIL = searchListContainer;
        addView(searchListContainer.LJIIIZ());
    }
}
