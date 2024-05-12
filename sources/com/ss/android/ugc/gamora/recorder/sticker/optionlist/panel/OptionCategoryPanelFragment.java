package com.ss.android.ugc.gamora.recorder.sticker.optionlist.panel;

import X.ActivityC45651qj;
import X.C0CM;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C29S;
import X.C3C5;
import X.C46193IAz;
import X.C76800UCe;
import X.C78496UrM;
import X.C78826Uwg;
import X.C78835Uwp;
import X.C78836Uwq;
import X.C78837Uwr;
import X.C78886Uxe;
import X.C80261Vej;
import X.C84488XDw;
import X.C90903hW;
import X.InterfaceC84498XEg;
import X.InterfaceC88472Yns;
import X.LHW;
import X.T4X;
import Y.ACListenerS33S0100000_13;
import Y.AObserverS69S0300000_13;
import Y.IDFactoryS411S0100000_13;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class OptionCategoryPanelFragment extends Fragment {
    public static final /* synthetic */ int LJLLL = 0;
    public final C46193IAz LJLIL;
    public final ShortVideoContext LJLILLLLZI;
    public C0CM LJLJI;
    public C80261Vej LJLJJI;
    public InterfaceC84498XEg LJLJJL;
    public C78826Uwg LJLJJLL;
    public OptionCategoryPanelViewModel LJLJL;
    public Effect LJLJLJ;
    public Effect LJLJLLL;
    public String LJLL;
    public Boolean LJLLILLLL;
    public final Map<Integer, View> LJLLJ = new LinkedHashMap();
    public InterfaceC88472Yns<? super Boolean, C76800UCe> LJLLI = C78837Uwr.LJLIL;

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ((LinkedHashMap) this.LJLLJ).clear();
    }

    public OptionCategoryPanelFragment(C46193IAz c46193IAz, ShortVideoContext shortVideoContext) {
        this.LJLIL = c46193IAz;
        this.LJLILLLLZI = shortVideoContext;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Effect effect;
        Effect effect2;
        String str;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments == null || (effect = (Effect) arguments.getParcelable("panel_effect")) == null) {
            effect = new Effect(null, 1, null);
        }
        this.LJLJLJ = effect;
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            effect2 = (Effect) arguments2.getParcelable("stackable_effect");
        } else {
            effect2 = null;
        }
        this.LJLJLLL = effect2;
        Bundle arguments3 = getArguments();
        if (arguments3 != null) {
            str = arguments3.getString("selected_image_path");
        } else {
            str = null;
        }
        this.LJLL = str;
        Context LLLLLILLIL = C16880lQ.LLLLLILLIL(requireActivity());
        o.LJIIIIZZ(LLLLLILLIL, "requireActivity().applicationContext");
        this.LJLJJL = C84488XDw.LIZ(LLLLLILLIL, null);
        Effect effect3 = this.LJLJLJ;
        if (effect3 != null) {
            InterfaceC84498XEg interfaceC84498XEg = this.LJLJJL;
            if (interfaceC84498XEg != null) {
                this.LJLJJLL = new C78826Uwg(effect3, interfaceC84498XEg, this.LJLIL, this.LJLILLLLZI);
                this.LJLJL = (OptionCategoryPanelViewModel) ViewModelProviders.of(this, new IDFactoryS411S0100000_13(this, 0)).get(OptionCategoryPanelViewModel.class);
                TuxIconView tuxIconView = (TuxIconView) view.findViewById(R.id.aej);
                if (tuxIconView != null) {
                    C16880lQ.LJJJ(tuxIconView, new ACListenerS33S0100000_13(this, 104));
                }
                View findViewById = view.findViewById(R.id.hc4);
                o.LJIIIIZZ(findViewById, "view.findViewById(R.id.option_category_view_pager)");
                this.LJLJI = (C0CM) findViewById;
                View findViewById2 = view.findViewById(R.id.hc1);
                o.LJIIIIZZ(findViewById2, "view.findViewById(R.id.option_category_tab_layout)");
                this.LJLJJI = (C80261Vej) findViewById2;
                T4X t4x = (T4X) view.findViewById(R.id.cfh);
                t4x.LIZIZ();
                TextView textView = (TextView) view.findViewById(R.id.hhr);
                Effect effect4 = this.LJLJLJ;
                if (effect4 != null) {
                    if (C78886Uxe.LJJIJIIJI(effect4)) {
                        View findViewById3 = view.findViewById(R.id.hc2);
                        if (findViewById3 != null) {
                            findViewById3.setVisibility(0);
                        }
                    } else {
                        C80261Vej c80261Vej = this.LJLJJI;
                        if (c80261Vej != null) {
                            c80261Vej.setVisibility(0);
                        } else {
                            o.LJIJI("tabLayout");
                            throw null;
                        }
                    }
                    C80261Vej c80261Vej2 = this.LJLJJI;
                    if (c80261Vej2 != null) {
                        c80261Vej2.addOnTabSelectedListener((LHW) new C78835Uwp(this));
                        C0CM c0cm = this.LJLJI;
                        if (c0cm != null) {
                            c0cm.LIZIZ(new C78836Uwq(this));
                            OptionCategoryPanelViewModel optionCategoryPanelViewModel = this.LJLJL;
                            if (optionCategoryPanelViewModel != null) {
                                optionCategoryPanelViewModel.LJLJLLL.observe(this, new AObserverS69S0300000_13(this, t4x, textView, 0));
                                return;
                            } else {
                                o.LJIJI("vm");
                                throw null;
                            }
                        }
                        o.LJIJI("viewPager");
                        throw null;
                    }
                    o.LJIJI("tabLayout");
                    throw null;
                }
                o.LJIJI("panelEffect");
                throw null;
            }
            o.LJIJI("effectPlatform");
            throw null;
        }
        o.LJIJI("panelEffect");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C29S c29s;
        View LIZIZ = C78496UrM.LIZIZ(layoutInflater, "inflater", layoutInflater, R.layout.bz5, viewGroup, false, "inflater.inflate(R.layou…layout, container, false)");
        try {
            ViewTreeLifecycleOwner.set(LIZIZ, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(LIZIZ, this);
            C10A.LIZIZ(LIZIZ, this);
            ActivityC45651qj mo49getActivity = mo49getActivity();
            if (mo49getActivity instanceof C29S) {
                c29s = (C29S) mo49getActivity;
            } else {
                c29s = null;
            }
            C90903hW.LIZ(c29s);
            C3C5.m7constructorimpl(C76800UCe.LIZ);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
        return LIZIZ;
    }
}
