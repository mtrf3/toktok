package X;

import Y.IDCListenerS203S0100000_2;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.ss.android.ugc.aweme.views.IDlS62S0100000_2;
import com.ss.android.ugc.gamora.editor.sticker.read.ReadTextEffectBean;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.jvm.internal.AqS168S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.5dE, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C139205dE extends AbstractC56012Ht<C139135d7, C138385bu> implements C6LY {
    public ViewGroup LJLIL;
    public C6LV LJLILLLLZI;
    public InterfaceC45540Hu4 LJLJI;
    public final ViewTreeObserverOnPreDrawListenerC139215dF LJLJJI = new ViewTreeObserver.OnPreDrawListener() { // from class: X.5dF
        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public final boolean onPreDraw() {
            ViewTreeObserver viewTreeObserver;
            C6LV c6lv = C139205dE.this.LJLILLLLZI;
            if (c6lv != null) {
                View contentView = c6lv.getContentView();
                if (contentView != null && (viewTreeObserver = contentView.getViewTreeObserver()) != null) {
                    viewTreeObserver.removeOnPreDrawListener(this);
                }
                C139205dE.this.getUiActions().LJLL.invoke();
                return false;
            }
            o.LJIJI("ttsPanelView");
            throw null;
        }
    };
    public final C139225dG LJLJJL = new C5HC() { // from class: X.5dG
        @Override // X.C5HC
        public final boolean onKeyDown(int i, KeyEvent keyEvent) {
            if (i == 4 && C139205dE.this.isVisible()) {
                C139205dE.this.getUiActions().LJLILLLLZI.invoke();
                return true;
            }
            return false;
        }
    };

    @Override // X.C6LY
    public final void LLF() {
        getUiActions().LJLILLLLZI.invoke();
    }

    @Override // X.AbstractC56012Ht
    public final void onHide() {
        super.onHide();
        InterfaceC45540Hu4 interfaceC45540Hu4 = this.LJLJI;
        if (interfaceC45540Hu4 != null) {
            interfaceC45540Hu4.unRegisterActivityOnKeyDownListener(this.LJLJJL);
        }
    }

    @Override // X.AbstractC56012Ht
    public final void onShow() {
        ViewTreeObserver viewTreeObserver;
        ViewTreeObserver viewTreeObserver2;
        super.onShow();
        C6LV c6lv = this.LJLILLLLZI;
        if (c6lv != null) {
            c6lv.setVisibility(0);
            C6LV c6lv2 = this.LJLILLLLZI;
            if (c6lv2 != null) {
                c6lv2.setPlayViewVisible(8);
                C6LV c6lv3 = this.LJLILLLLZI;
                if (c6lv3 != null) {
                    View contentView = c6lv3.getContentView();
                    if (contentView != null && (viewTreeObserver2 = contentView.getViewTreeObserver()) != null) {
                        viewTreeObserver2.removeOnPreDrawListener(this.LJLJJI);
                    }
                    C6LV c6lv4 = this.LJLILLLLZI;
                    if (c6lv4 != null) {
                        View contentView2 = c6lv4.getContentView();
                        if (contentView2 != null && (viewTreeObserver = contentView2.getViewTreeObserver()) != null) {
                            viewTreeObserver.addOnPreDrawListener(this.LJLJJI);
                        }
                    } else {
                        o.LJIJI("ttsPanelView");
                        throw null;
                    }
                } else {
                    o.LJIJI("ttsPanelView");
                    throw null;
                }
            } else {
                o.LJIJI("ttsPanelView");
                throw null;
            }
        }
        InterfaceC45540Hu4 interfaceC45540Hu4 = this.LJLJI;
        if (interfaceC45540Hu4 != null) {
            interfaceC45540Hu4.registerActivityOnKeyDownListener(this.LJLJJL);
        }
    }

    @Override // X.C6LY
    public final boolean LLD(String textSpeaker) {
        o.LJIIIZ(textSpeaker, "textSpeaker");
        return getUiActions().LJLJJL.invoke(textSpeaker).booleanValue();
    }

    @Override // X.C6LY
    public final void LLFF(ReadTextEffectBean readTextEffectBean) {
        getUiActions().LJLJJLL.invoke(readTextEffectBean);
    }

    @Override // X.C6LY
    public final void LLFFF(ReadTextEffectBean model) {
        o.LJIIIZ(model, "model");
        getUiActions().LJLJLJ.invoke(model);
    }

    @Override // X.C6LY
    public final void LLFII(ReadTextEffectBean bean) {
        o.LJIIIZ(bean, "bean");
        getUiActions().LJLLI.invoke(bean);
    }

    @Override // X.C6LY
    public final void LLFZ(ReadTextEffectBean readTextEffectBean) {
        getUiActions().LJLILLLLZI.invoke();
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.WM7
    public final void onActivityCreated(Bundle bundle) {
        ViewTreeObserver viewTreeObserver;
        ViewTreeObserver viewTreeObserver2;
        super.onActivityCreated(bundle);
        View requireViewById = requireViewById(R.id.lt2);
        o.LJIIIIZZ(requireViewById, "requireViewById(R.id.tts_panel_view)");
        this.LJLILLLLZI = (C6LV) requireViewById;
        AbstractC56012Ht.observe$default(this, getUiStates(), new TBT() { // from class: X.5d8
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((C139135d7) obj).LIZ);
            }
        }, null, new AqS168S0100000_2(this, 282), 2, null);
        AbstractC56012Ht.observe$default(this, getUiStates(), new TBT() { // from class: X.5dC
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((C139135d7) obj).LIZIZ);
            }
        }, null, new AqS168S0100000_2(this, 283), 2, null);
        C6LV c6lv = this.LJLILLLLZI;
        if (c6lv != null) {
            c6lv.setOnCheckBoxChangeListener(new IDCListenerS203S0100000_2(this, 2));
            C6LV c6lv2 = this.LJLILLLLZI;
            if (c6lv2 != null) {
                c6lv2.setOnParentLayoutListener(new IDlS62S0100000_2(this, (AbstractC156316Bn<Object>) 30));
                AbstractC56012Ht.observe$default(this, getUiStates(), new TBT() { // from class: X.5dD
                    @Override // X.TBT, X.TBZ, X.TBW
                    public final Object get(Object obj) {
                        return Boolean.valueOf(((C139135d7) obj).LIZJ);
                    }
                }, null, new AqS168S0100000_2(this, 284), 2, null);
                AbstractC56012Ht.observe$default(this, getUiStates(), new TBT() { // from class: X.5dB
                    @Override // X.TBT, X.TBZ, X.TBW
                    public final Object get(Object obj) {
                        return ((C139135d7) obj).LIZLLL;
                    }
                }, null, new AqS168S0100000_2(this, 278), 2, null);
                AbstractC56012Ht.observe$default(this, getUiStates(), new TBT() { // from class: X.5cr
                    @Override // X.TBT, X.TBZ, X.TBW
                    public final Object get(Object obj) {
                        return Boolean.valueOf(((C139135d7) obj).LJ);
                    }
                }, null, new AqS168S0100000_2(this, 279), 2, null);
                C6LV c6lv3 = this.LJLILLLLZI;
                if (c6lv3 != null) {
                    c6lv3.setTTSPanelBeanOpt(this);
                    this.LJLJI = C163756bj.LIZIZ(this);
                    AbstractC56012Ht.observeEvent$default(this, getUiStates(), new TBT() { // from class: X.5d9
                        @Override // X.TBT, X.TBZ, X.TBW
                        public final Object get(Object obj) {
                            return ((C139135d7) obj).LJFF;
                        }
                    }, null, new AqS168S0100000_2(this, 280), 2, null);
                    AbstractC56012Ht.observeEvent$default(this, getUiStates(), new TBT() { // from class: X.5dA
                        @Override // X.TBT, X.TBZ, X.TBW
                        public final Object get(Object obj) {
                            return ((C139135d7) obj).LJI;
                        }
                    }, null, new AqS168S0100000_2(this, 281), 2, null);
                    C6LV c6lv4 = this.LJLILLLLZI;
                    if (c6lv4 != null) {
                        C138075bP.LLJJJ.getClass();
                        c6lv4.setContentLayoutHeight(SFS.LJI(C138075bP.LLJJJJ));
                        C6LV c6lv5 = this.LJLILLLLZI;
                        if (c6lv5 != null) {
                            View contentView = c6lv5.getContentView();
                            if (contentView != null && (viewTreeObserver2 = contentView.getViewTreeObserver()) != null) {
                                viewTreeObserver2.removeOnPreDrawListener(this.LJLJJI);
                            }
                            C6LV c6lv6 = this.LJLILLLLZI;
                            if (c6lv6 != null) {
                                View contentView2 = c6lv6.getContentView();
                                if (contentView2 != null && (viewTreeObserver = contentView2.getViewTreeObserver()) != null) {
                                    viewTreeObserver.addOnPreDrawListener(this.LJLJJI);
                                    return;
                                }
                                return;
                            }
                            o.LJIJI("ttsPanelView");
                            throw null;
                        }
                        o.LJIJI("ttsPanelView");
                        throw null;
                    }
                    o.LJIJI("ttsPanelView");
                    throw null;
                }
                o.LJIJI("ttsPanelView");
                throw null;
            }
            o.LJIJI("ttsPanelView");
            throw null;
        }
        o.LJIJI("ttsPanelView");
        throw null;
    }

    @Override // X.C6LY
    public final void LLIIII(ArrayList<ReadTextEffectBean> arrayList, int i, boolean z) {
        C6LV c6lv = this.LJLILLLLZI;
        if (c6lv != null) {
            if (i != c6lv.getCurrentItemIndex()) {
                return;
            }
            getUiActions().LJLJL.invoke(arrayList);
            return;
        }
        o.LJIJI("ttsPanelView");
        throw null;
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.WMH, X.WM7
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewGroup viewGroup2 = (ViewGroup) C6D8.LIZJ(layoutInflater, "inflater", viewGroup, "container", layoutInflater, R.layout.ccu, viewGroup, false, "null cannot be cast to non-null type android.view.ViewGroup");
        this.LJLIL = viewGroup2;
        return viewGroup2;
    }
}
