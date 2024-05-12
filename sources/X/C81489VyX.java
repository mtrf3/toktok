package X;

import Y.ACListenerS34S0100000_14;
import Y.ARunnableS50S0100000_14;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bef.effectsdk.message.MessageCenter;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS164S0100000_14;
import kotlin.jvm.internal.AqS180S0100000_14;
import kotlin.jvm.internal.AqS196S0100000_14;
import kotlin.jvm.internal.o;

/* renamed from: X.VyX, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81489VyX extends AbstractC56012Ht<C81500Vyi, L48> {
    public View LJLILLLLZI;
    public C160726Sm LJLJI;
    public View LJLJJI;
    public C73305Spp LJLJJL;
    public View LJLJJLL;
    public View LJLJL;
    public View LJLJLJ;
    public C8HN LJLJLLL;
    public TuxTextView LJLL;
    public View LJLLI;
    public ImageView LJLLILLLL;
    public C81539VzL LJLLLLLL;
    public C81400Vx6 LJLZ;
    public int LJZ;
    public int LJLIL = 1;
    public final SafeHandler LJLLJ = new SafeHandler(this);
    public final int LJLLL = SFS.LJI(128.0d);
    public final int LJLLLL = SFS.LJI(70.0d);
    public final AqS196S0100000_14 LJZI = new AqS196S0100000_14(this, 20);
    public final AqS164S0100000_14 LJZL = new AqS164S0100000_14(this, 143);
    public boolean LL = true;
    public final C81505Vyn LLD = new C81505Vyn(this);
    public boolean LLF = true;
    public final ARunnableS50S0100000_14 LLFF = new ARunnableS50S0100000_14(this, 88);

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.WM7
    public final void onDestroyView() {
        super.onDestroyView();
        MessageCenter.removeListener(this.LLD);
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.WM7
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        View view = this.LJLILLLLZI;
        if (view != null) {
            View findViewById = view.findViewById(R.id.cik);
            o.LJIIIIZZ(findViewById, "rootView.findViewById(R.id.duet_layout_mode_list)");
            this.LJLJI = (C160726Sm) findViewById;
            View view2 = this.LJLILLLLZI;
            if (view2 != null) {
                View findViewById2 = view2.findViewById(R.id.cii);
                o.LJIIIIZZ(findViewById2, "rootView.findViewById(R.…et_layout_list_container)");
                this.LJLJJI = findViewById2;
                View view3 = this.LJLILLLLZI;
                if (view3 != null) {
                    View findViewById3 = view3.findViewById(R.id.cij);
                    o.LJIIIIZZ(findViewById3, "rootView.findViewById(R.….duet_layout_list_status)");
                    this.LJLJJL = (C73305Spp) findViewById3;
                    View view4 = this.LJLILLLLZI;
                    if (view4 != null) {
                        View findViewById4 = view4.findViewById(R.id.cis);
                        o.LJIIIIZZ(findViewById4, "rootView.findViewById(R.id.duet_name)");
                        this.LJLL = (TuxTextView) findViewById4;
                        View view5 = this.LJLILLLLZI;
                        if (view5 != null) {
                            View findViewById5 = view5.findViewById(R.id.cim);
                            o.LJIIIIZZ(findViewById5, "rootView.findViewById(R.id.duet_layout_name)");
                            this.LJLLI = findViewById5;
                            View view6 = this.LJLILLLLZI;
                            if (view6 != null) {
                                View findViewById6 = view6.findViewById(R.id.cig);
                                o.LJIIIIZZ(findViewById6, "rootView.findViewById(R.….duet_item_chosen_layout)");
                                ImageView imageView = (ImageView) findViewById6;
                                this.LJLLILLLL = imageView;
                                imageView.setImageResource(R.drawable.az4);
                                LayoutInflater LLZIL = C16880lQ.LLZIL(requireActivity());
                                View view7 = this.LJLILLLLZI;
                                if (view7 != null) {
                                    View LLLLIILL = C16880lQ.LLLLIILL(LLZIL, R.layout.k6, (ViewGroup) view7, false);
                                    o.LJIIIIZZ(LLLLIILL, "from(requireActivity()).…View as ViewGroup, false)");
                                    this.LJLJJLL = LLLLIILL;
                                    View findViewById7 = LLLLIILL.findViewById(R.id.cyn);
                                    o.LJIIIIZZ(findViewById7, "errorView.findViewById(R.id.error_retry_button)");
                                    this.LJLJL = findViewById7;
                                    C16880lQ.LJIIJ(new ACListenerS34S0100000_14(this, 27), findViewById7);
                                    TuxTextView tuxTextView = this.LJLL;
                                    if (tuxTextView != null) {
                                        tuxTextView.setVisibility(8);
                                        ImageView imageView2 = this.LJLLILLLL;
                                        if (imageView2 != null) {
                                            imageView2.setVisibility(8);
                                            this.LJZ = 300;
                                            AbstractC56012Ht.observeEvent$default(this, getUiStates(), new TBT() { // from class: X.Vyf
                                                @Override // X.TBT, X.TBZ, X.TBW
                                                public final Object get(Object obj) {
                                                    return ((C81500Vyi) obj).LJII;
                                                }
                                            }, null, new AqS180S0100000_14(this, 148), 2, null);
                                            AbstractC56012Ht.observe$default(this, getUiStates(), new TBT() { // from class: X.VyY
                                                @Override // X.TBT, X.TBZ, X.TBW
                                                public final Object get(Object obj) {
                                                    return Boolean.valueOf(((C81500Vyi) obj).LJFF);
                                                }
                                            }, null, new AqS180S0100000_14(this, 149), 2, null);
                                            AbstractC56012Ht.observeEvent$default(this, getUiStates(), new TBT() { // from class: X.Vyk
                                                @Override // X.TBT, X.TBZ, X.TBW
                                                public final Object get(Object obj) {
                                                    return ((C81500Vyi) obj).LJIIL;
                                                }
                                            }, null, new AqS180S0100000_14(this, 150), 2, null);
                                            AbstractC56012Ht.observeEvent$default(this, getUiStates(), new TBT() { // from class: X.Vyl
                                                @Override // X.TBT, X.TBZ, X.TBW
                                                public final Object get(Object obj) {
                                                    return ((C81500Vyi) obj).LJIILIIL;
                                                }
                                            }, null, new AqS180S0100000_14(this, 151), 2, null);
                                            AbstractC56012Ht.observe$default(this, getUiStates(), new TBT() { // from class: X.Vyb
                                                @Override // X.TBT, X.TBZ, X.TBW
                                                public final Object get(Object obj) {
                                                    return ((C81500Vyi) obj).LJI;
                                                }
                                            }, null, new AqS180S0100000_14(this, 131), 2, null);
                                            AbstractC56012Ht.observe$default(this, getUiStates(), new TBT() { // from class: X.Vyc
                                                @Override // X.TBT, X.TBZ, X.TBW
                                                public final Object get(Object obj) {
                                                    return ((C81500Vyi) obj).LIZLLL;
                                                }
                                            }, null, new AqS180S0100000_14(this, 132), 2, null);
                                            AbstractC56012Ht.observe$default(this, getUiStates(), new TBT() { // from class: X.VyZ
                                                @Override // X.TBT, X.TBZ, X.TBW
                                                public final Object get(Object obj) {
                                                    return Integer.valueOf(((C81500Vyi) obj).LIZJ);
                                                }
                                            }, null, new AqS180S0100000_14(this, 136), 2, null);
                                            AbstractC56012Ht.observe$default(this, getUiStates(), new TBT() { // from class: X.Vyd
                                                @Override // X.TBT, X.TBZ, X.TBW
                                                public final Object get(Object obj) {
                                                    return ((C81500Vyi) obj).LIZ;
                                                }
                                            }, null, new AqS180S0100000_14(this, 139), 2, null);
                                            AbstractC56012Ht.observe$default(this, getUiStates(), new TBT() { // from class: X.Vya
                                                @Override // X.TBT, X.TBZ, X.TBW
                                                public final Object get(Object obj) {
                                                    return ((C81500Vyi) obj).LJ;
                                                }
                                            }, null, new AqS180S0100000_14(this, 141), 2, null);
                                            AbstractC56012Ht.observeEvent$default(this, getUiStates(), new TBT() { // from class: X.Vye
                                                @Override // X.TBT, X.TBZ, X.TBW
                                                public final Object get(Object obj) {
                                                    return ((C81500Vyi) obj).LJIIIIZZ;
                                                }
                                            }, null, new AqS180S0100000_14(this, 144), 2, null);
                                            AbstractC56012Ht.observeEvent$default(this, getUiStates(), new TBT() { // from class: X.Vyg
                                                @Override // X.TBT, X.TBZ, X.TBW
                                                public final Object get(Object obj) {
                                                    return ((C81500Vyi) obj).LJIIIZ;
                                                }
                                            }, null, new AqS180S0100000_14(this, 145), 2, null);
                                            AbstractC56012Ht.observeEvent$default(this, getUiStates(), new TBT() { // from class: X.Vyh
                                                @Override // X.TBT, X.TBZ, X.TBW
                                                public final Object get(Object obj) {
                                                    return ((C81500Vyi) obj).LJIIJ;
                                                }
                                            }, null, new AqS180S0100000_14(this, 146), 2, null);
                                            AbstractC56012Ht.observeEvent$default(this, getUiStates(), new TBT() { // from class: X.Vyj
                                                @Override // X.TBT, X.TBZ, X.TBW
                                                public final Object get(Object obj) {
                                                    return ((C81500Vyi) obj).LJIIJJI;
                                                }
                                            }, null, new AqS180S0100000_14(this, 147), 2, null);
                                            C81539VzL c81539VzL = new C81539VzL(getUiActions().LJLIL.invoke(), getUiActions().LJLILLLLZI.invoke(), getUiActions());
                                            this.LJLLLLLL = c81539VzL;
                                            C160726Sm c160726Sm = this.LJLJI;
                                            if (c160726Sm != null) {
                                                c160726Sm.setAdapter(c81539VzL);
                                                C160726Sm c160726Sm2 = this.LJLJI;
                                                if (c160726Sm2 != null) {
                                                    c160726Sm2.setClipToPadding(false);
                                                    getUiActions().LJLL.invoke();
                                                    C160726Sm c160726Sm3 = this.LJLJI;
                                                    if (c160726Sm3 != null) {
                                                        c160726Sm3.post(new ARunnableS50S0100000_14(this, 87));
                                                        MessageCenter.addListener(this.LLD);
                                                        return;
                                                    } else {
                                                        o.LJIJI("modeRecyclerView");
                                                        throw null;
                                                    }
                                                }
                                                o.LJIJI("modeRecyclerView");
                                                throw null;
                                            }
                                            o.LJIJI("modeRecyclerView");
                                            throw null;
                                        }
                                        o.LJIJI("duetItemChosenLayout");
                                        throw null;
                                    }
                                    o.LJIJI("duetName");
                                    throw null;
                                }
                                o.LJIJI("rootView");
                                throw null;
                            }
                            o.LJIJI("rootView");
                            throw null;
                        }
                        o.LJIJI("rootView");
                        throw null;
                    }
                    o.LJIJI("rootView");
                    throw null;
                }
                o.LJIJI("rootView");
                throw null;
            }
            o.LJIJI("rootView");
            throw null;
        }
        o.LJIJI("rootView");
        throw null;
    }

    @Override // X.WM7
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        View findViewById = requireView().findViewById(R.id.cit);
        o.LJIIIIZZ(findViewById, "requireView().findViewById(R.id.duet_root_view)");
        this.LJLILLLLZI = findViewById;
        View findViewById2 = requireView().findViewById(R.id.lc2);
        o.LJIIIIZZ(findViewById2, "requireView().findViewById(R.id.tool_container)");
        this.LJLJLJ = findViewById2;
        View findViewById3 = requireView().findViewById(R.id.kir);
        o.LJIIIIZZ(findViewById3, "requireView().findViewById(R.id.sticker_prompt)");
        this.LJLJLLL = (C8HN) findViewById3;
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.WMH, X.WM7
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return (ViewGroup) C6D8.LIZJ(layoutInflater, "inflater", viewGroup, "container", layoutInflater, R.layout.k3, viewGroup, false, "null cannot be cast to non-null type android.view.ViewGroup");
    }
}
