package com.ss.android.ugc.aweme.compliance.business.phl;

import X.AbstractC029409q;
import X.ActivityC45651qj;
import X.C07G;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C182757Ff;
import X.C188727au;
import X.C221108m2;
import X.C29S;
import X.C32151Nz;
import X.C3C5;
import X.C45631qh;
import X.C62822Ol8;
import X.C73305Spp;
import X.C76800UCe;
import X.C90903hW;
import X.FMX;
import X.GC9;
import X.InterfaceC182807Fk;
import X.InterfaceC65784Pro;
import X.O6R;
import X.SY4;
import Y.ACListenerS23S0100000_3;
import Y.AObserverS56S0000000_3;
import Y.AObserverS71S0100000_3;
import Y.ARunnableS39S0100000_3;
import android.os.Bundle;
import android.os.Handler;
import android.text.SpannableString;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.compliance.api.phl.model.PrivacyHighlightsForTeensVideo;
import com.ss.android.ugc.aweme.compliance.api.phl.vm.PhlViewModel;
import com.ss.android.ugc.aweme.compliance.business.phl.PhlFragment;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class PhlFragment extends BaseFragment implements InterfaceC182807Fk {
    public static final /* synthetic */ int LJZI = 0;
    public C73305Spp LJLIL;
    public TuxIconView LJLILLLLZI;
    public View LJLJI;
    public TextView LJLJJI;
    public TuxTextView LJLJJL;
    public TuxTextView LJLJJLL;
    public C45631qh LJLJL;
    public RecyclerView LJLJLJ;
    public View LJLJLLL;
    public SY4 LJLL;
    public InterfaceC65784Pro<C76800UCe> LJLLJ;
    public ARunnableS39S0100000_3 LJLLLLLL;
    public long LJLZ;
    public final Map<Integer, View> LJZ = new LinkedHashMap();
    public final C62822Ol8 LJLLI = C221108m2.LIZIZ(new AqS153S0100000_3(this, 169));
    public final C62822Ol8 LJLLILLLL = C221108m2.LIZIZ(new AqS153S0100000_3(this, 168));
    public String LJLLL = "";
    public final C62822Ol8 LJLLLL = C221108m2.LIZIZ(C182757Ff.INSTANCE);

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJZ).clear();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJZ;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null || (findViewById = view2.findViewById(i)) == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final PhlViewModel vl() {
        return (PhlViewModel) this.LJLLI.getValue();
    }

    public final boolean wl() {
        if (o.LJ(this.LJLLL, "new_user_journey") || o.LJ(this.LJLLL, "account_privacy_page")) {
            return true;
        }
        return false;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        ((Handler) this.LJLLLL.getValue()).removeCallbacksAndMessages(null);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        ((Handler) this.LJLLLL.getValue()).removeCallbacksAndMessages(null);
        ARunnableS39S0100000_3 aRunnableS39S0100000_3 = new ARunnableS39S0100000_3(this, 33);
        this.LJLLLLLL = aRunnableS39S0100000_3;
        ((Handler) this.LJLLLL.getValue()).postDelayed(aRunnableS39S0100000_3, 1000L);
    }

    @Override // X.InterfaceC182807Fk
    public final void ij(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        this.LJLLJ = interfaceC65784Pro;
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Object obj;
        super.onCreate(bundle);
        fragmentConfiguration(GC9.LJLIL);
        Bundle arguments = getArguments();
        if (arguments != null) {
            obj = C16880lQ.LLJJIII(arguments, "enter_from");
        } else {
            obj = null;
        }
        o.LJII(obj, "null cannot be cast to non-null type kotlin.String");
        this.LJLLL = (String) obj;
        ((Handler) this.LJLLLL.getValue()).removeCallbacksAndMessages(null);
        ARunnableS39S0100000_3 aRunnableS39S0100000_3 = new ARunnableS39S0100000_3(this, 33);
        this.LJLLLLLL = aRunnableS39S0100000_3;
        ((Handler) this.LJLLLL.getValue()).postDelayed(aRunnableS39S0100000_3, 1000L);
    }

    public final void xl(String str) {
        Integer num;
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", this.LJLLL);
        List<PrivacyHighlightsForTeensVideo> value = vl().LJLJJI.getValue();
        if (value != null) {
            num = Integer.valueOf(value.size());
        } else {
            num = null;
        }
        c188727au.LJFF(num, "video_cnt");
        c188727au.LJIIIZ("exit_method", str);
        c188727au.LJ(this.LJLZ, "staytime");
        FMX.LJIIL("exit_privacy_highlights_teens_page", c188727au.LIZ);
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        this.LJLIL = (C73305Spp) view.findViewById(R.id.hn9);
        if (o.LJ(this.LJLLL, "new_user_journey")) {
            C73305Spp c73305Spp = this.LJLIL;
            if (c73305Spp != null) {
                c73305Spp.setVisibility(8);
            }
        } else {
            C73305Spp c73305Spp2 = this.LJLIL;
            if (c73305Spp2 != null) {
                c73305Spp2.setVisibility(0);
            }
            C73305Spp c73305Spp3 = this.LJLIL;
            if (c73305Spp3 != null) {
                c73305Spp3.LJFF();
            }
            vl().LJLJJLL.observe(getViewLifecycleOwner(), new AObserverS71S0100000_3(this, 15));
        }
        View findViewById = view.findViewById(R.id.hn5);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.phl_iv_back)");
        this.LJLILLLLZI = (TuxIconView) findViewById;
        if (wl()) {
            TuxIconView tuxIconView = this.LJLILLLLZI;
            if (tuxIconView != null) {
                tuxIconView.setVisibility(8);
            } else {
                o.LJIJI("ivBack");
                throw null;
            }
        } else {
            TuxIconView tuxIconView2 = this.LJLILLLLZI;
            if (tuxIconView2 != null) {
                tuxIconView2.setVisibility(0);
                TuxIconView tuxIconView3 = this.LJLILLLLZI;
                if (tuxIconView3 != null) {
                    C16880lQ.LJJJ(tuxIconView3, new ACListenerS23S0100000_3(this, 32));
                } else {
                    o.LJIJI("ivBack");
                    throw null;
                }
            } else {
                o.LJIJI("ivBack");
                throw null;
            }
        }
        this.LJLJI = view.findViewById(R.id.hn_);
        this.LJLJJI = (TextView) view.findViewById(R.id.hnb);
        this.LJLJJL = (TuxTextView) view.findViewById(R.id.hnc);
        if (wl()) {
            TuxTextView tuxTextView = this.LJLJJL;
            o.LJI(tuxTextView);
            ViewGroup.LayoutParams layoutParams = tuxTextView.getLayoutParams();
            o.LJII(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.setMarginStart(O6R.LJJIIZ(C32151Nz.LJIIZILJ(32)));
            marginLayoutParams.setMarginEnd(O6R.LJJIIZ(C32151Nz.LJIIZILJ(32)));
            TuxTextView tuxTextView2 = this.LJLJJL;
            o.LJI(tuxTextView2);
            tuxTextView2.setLayoutParams(marginLayoutParams);
            TuxTextView tuxTextView3 = this.LJLJJL;
            o.LJI(tuxTextView3);
            tuxTextView3.setTextSize(1, 36.0f);
        }
        this.LJLJJLL = (TuxTextView) view.findViewById(R.id.hna);
        if (wl()) {
            TuxTextView tuxTextView4 = this.LJLJJLL;
            o.LJI(tuxTextView4);
            ViewGroup.LayoutParams layoutParams2 = tuxTextView4.getLayoutParams();
            o.LJII(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
            marginLayoutParams2.setMarginStart(O6R.LJJIIZ(C32151Nz.LJIIZILJ(32)));
            marginLayoutParams2.setMarginEnd(O6R.LJJIIZ(C32151Nz.LJIIZILJ(32)));
            marginLayoutParams2.topMargin = O6R.LJJIIZ(C32151Nz.LJIIZILJ(8));
            TuxTextView tuxTextView5 = this.LJLJJLL;
            o.LJI(tuxTextView5);
            tuxTextView5.setLayoutParams(marginLayoutParams2);
        }
        C45631qh c45631qh = (C45631qh) view.findViewById(R.id.hn8);
        this.LJLJL = c45631qh;
        o.LJI(c45631qh);
        c45631qh.setOnScrollChangeListener(new C07G() { // from class: X.7Fd
            @Override // X.C07G
            public final void LIZ(C45631qh c45631qh2, int i, int i2, int i3, int i4) {
                o.LJIIIZ(c45631qh2, "<anonymous parameter 0>");
                if (i2 > O6R.LJJIIZ(C32151Nz.LJIIZILJ(90))) {
                    View view2 = PhlFragment.this.LJLJI;
                    if (view2 != null) {
                        view2.setVisibility(0);
                    }
                    TextView textView = PhlFragment.this.LJLJJI;
                    if (textView == null) {
                        return;
                    }
                    textView.setVisibility(0);
                    return;
                }
                View view3 = PhlFragment.this.LJLJI;
                if (view3 != null) {
                    view3.setVisibility(4);
                }
                TextView textView2 = PhlFragment.this.LJLJJI;
                if (textView2 == null) {
                    return;
                }
                textView2.setVisibility(4);
            }
        });
        vl().LJLILLLLZI.observe(getViewLifecycleOwner(), new Observer() { // from class: X.7Fc
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                Number valueOf;
                String it = (String) obj;
                if (o.LJ(PhlFragment.this.LJLLL, "new_user_journey")) {
                    valueOf = 46;
                } else {
                    valueOf = Double.valueOf(37.5d);
                }
                int LJJIIZ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(valueOf));
                TuxTextView tuxTextView6 = PhlFragment.this.LJLJJL;
                o.LJIIIIZZ(it, "it");
                if (tuxTextView6 != null) {
                    SpannableString spannableString = new SpannableString(it);
                    spannableString.setSpan(new C8FU(LJJIIZ), 0, spannableString.length(), 33);
                    tuxTextView6.setText(spannableString);
                }
                TextView textView = PhlFragment.this.LJLJJI;
                if (textView == null) {
                    return;
                }
                textView.setText(it);
            }
        });
        vl().LJLJI.observe(getViewLifecycleOwner(), new AObserverS71S0100000_3(this, 16));
        this.LJLJLJ = (RecyclerView) view.findViewById(R.id.hn7);
        if (wl()) {
            RecyclerView recyclerView = this.LJLJLJ;
            o.LJI(recyclerView);
            ViewGroup.LayoutParams layoutParams3 = recyclerView.getLayoutParams();
            o.LJII(layoutParams3, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams3;
            marginLayoutParams3.setMarginStart(O6R.LJJIIZ(C32151Nz.LJIIZILJ(32)));
            marginLayoutParams3.setMarginEnd(O6R.LJJIIZ(C32151Nz.LJIIZILJ(32)));
            RecyclerView recyclerView2 = this.LJLJLJ;
            o.LJI(recyclerView2);
            recyclerView2.setLayoutParams(marginLayoutParams3);
        }
        getContext();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
        RecyclerView recyclerView3 = this.LJLJLJ;
        o.LJI(recyclerView3);
        recyclerView3.setLayoutManager(linearLayoutManager);
        RecyclerView recyclerView4 = this.LJLJLJ;
        o.LJI(recyclerView4);
        recyclerView4.setAdapter((AbstractC029409q) this.LJLLILLLL.getValue());
        vl().LJLJJI.observe(getViewLifecycleOwner(), new AObserverS71S0100000_3(this, 17));
        View findViewById2 = view.findViewById(R.id.hn6);
        o.LJIIIIZZ(findViewById2, "view.findViewById(R.id.phl_next_btn_divider)");
        this.LJLJLLL = findViewById2;
        View findViewById3 = view.findViewById(R.id.hmw);
        o.LJIIIIZZ(findViewById3, "view.findViewById(R.id.phl_btn_next)");
        this.LJLL = (SY4) findViewById3;
        if (wl()) {
            View view2 = this.LJLJLLL;
            if (view2 != null) {
                view2.setVisibility(0);
                SY4 sy4 = this.LJLL;
                if (sy4 != null) {
                    sy4.setVisibility(0);
                    SY4 sy42 = this.LJLL;
                    if (sy42 != null) {
                        ViewGroup.LayoutParams layoutParams4 = sy42.getLayoutParams();
                        o.LJII(layoutParams4, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                        ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) layoutParams4;
                        marginLayoutParams4.setMarginStart(O6R.LJJIIZ(C32151Nz.LJIIZILJ(32)));
                        marginLayoutParams4.setMarginEnd(O6R.LJJIIZ(C32151Nz.LJIIZILJ(32)));
                        SY4 sy43 = this.LJLL;
                        if (sy43 != null) {
                            sy43.setLayoutParams(marginLayoutParams4);
                            SY4 sy44 = this.LJLL;
                            if (sy44 != null) {
                                C16880lQ.LJJIZ(sy44, new ACListenerS23S0100000_3(this, 33));
                                vl().LJLJJL.observe(getViewLifecycleOwner(), new AObserverS71S0100000_3(this, 14));
                            } else {
                                o.LJIJI("btnNext");
                                throw null;
                            }
                        } else {
                            o.LJIJI("btnNext");
                            throw null;
                        }
                    } else {
                        o.LJIJI("btnNext");
                        throw null;
                    }
                } else {
                    o.LJIJI("btnNext");
                    throw null;
                }
            } else {
                o.LJIJI("nextButtonDivider");
                throw null;
            }
        } else {
            View view3 = this.LJLJLLL;
            if (view3 != null) {
                view3.setVisibility(8);
                SY4 sy45 = this.LJLL;
                if (sy45 != null) {
                    sy45.setVisibility(8);
                } else {
                    o.LJIJI("btnNext");
                    throw null;
                }
            } else {
                o.LJIJI("nextButtonDivider");
                throw null;
            }
        }
        if (wl()) {
            vl().LJLJL.observe(getViewLifecycleOwner(), new AObserverS56S0000000_3(1));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.agl, viewGroup, false);
        C29S c29s = null;
        if (!(LLLLIILL instanceof View)) {
            LLLLIILL = null;
        }
        if (LLLLIILL != null) {
            try {
                ViewTreeLifecycleOwner.set(LLLLIILL, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(LLLLIILL, this);
                C10A.LIZIZ(LLLLIILL, this);
                ActivityC45651qj mo49getActivity = mo49getActivity();
                if (mo49getActivity instanceof C29S) {
                    c29s = (C29S) mo49getActivity;
                }
                C90903hW.LIZ(c29s);
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
        }
        C3C5.m7constructorimpl(C76800UCe.LIZ);
        return LLLLIILL;
    }
}
