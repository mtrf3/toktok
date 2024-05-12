package com.ss.android.ugc.aweme.relation.ffp.ui;

import X.C184077Kh;
import X.C213688a4;
import X.C214298b3;
import X.C214528bQ;
import X.C29701Eo;
import X.C55953Lxd;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78926UyI;
import X.C8YN;
import X.InterfaceC65350Pko;
import X.InterfaceC65784Pro;
import X.P2P;
import X.TBT;
import Y.ALAdapterS8S0100000_10;
import Y.ARunnableS46S0100000_10;
import android.view.View;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.relation.ffp.vm.AnimationAuthVM;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS160S0100000_10;
import kotlin.jvm.internal.AqS192S0100000_10;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class AnimationAuthFragment extends FFPBaseFragment {
    public final C214298b3 LJLJI;
    public C29701Eo LJLJJI;
    public final int LJLJJL;
    public final Map<Integer, View> LJLJJLL = new LinkedHashMap();

    @Override // com.ss.android.ugc.aweme.relation.ffp.ui.FFPBaseFragment
    public final void Hl() {
        C8YN.LJII(this, Il(), new TBT() { // from class: X.P2R
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((ATV) obj).LJLIL;
            }
        }, C213688a4.LIZLLL(), new AqS192S0100000_10(this, 15), 4);
        C8YN.LJII(this, Il(), new TBT() { // from class: X.P2Q
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((ATV) obj).LJLJI);
            }
        }, C213688a4.LIZLLL(), new AqS192S0100000_10(this, 16), 4);
    }

    @Override // com.ss.android.ugc.aweme.relation.ffp.ui.FFPBaseFragment, com.bytedance.ies.foundation.fragment.BaseFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJJLL).clear();
    }

    @Override // com.ss.android.ugc.aweme.relation.ffp.ui.FFPBaseFragment, com.bytedance.ies.foundation.fragment.BaseFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJJLL;
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

    @Override // com.ss.android.ugc.aweme.relation.ffp.ui.FFPBaseFragment, com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public AnimationAuthFragment() {
        C65776Prg LIZ = C65352Pkq.LIZ(AnimationAuthVM.class);
        this.LJLJI = new C214298b3(LIZ, new AqS160S0100000_10((InterfaceC65350Pko) LIZ, 316), C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C78926UyI.LJJIIJZLJL(this, false), C184077Kh.LJLIL, P2P.INSTANCE, (InterfaceC65784Pro) null, 384);
        this.LJLJJL = R.layout.axs;
    }

    public final AnimationAuthVM Il() {
        return (AnimationAuthVM) this.LJLJI.getValue();
    }

    public final void Jl() {
        C29701Eo c29701Eo = this.LJLJJI;
        if (c29701Eo != null) {
            c29701Eo.postDelayed(new ARunnableS46S0100000_10(this, 5), 700L);
        } else {
            o.LJIJI("guideLottieView");
            throw null;
        }
    }

    @Override // com.ss.android.ugc.aweme.relation.ffp.ui.FFPBaseFragment
    public final int getLayoutRes() {
        return this.LJLJJL;
    }

    @Override // com.ss.android.ugc.aweme.relation.ffp.ui.FFPBaseFragment
    public final void Gl(View view) {
        o.LJIIIZ(view, "view");
        View findViewById = view.findViewById(R.id.e13);
        ((C29701Eo) findViewById).addAnimatorListener(new ALAdapterS8S0100000_10(this, 2));
        o.LJIIIIZZ(findViewById, "view.findViewById<Lottie…\n            })\n        }");
        this.LJLJJI = (C29701Eo) findViewById;
        View findViewById2 = view.findViewById(R.id.lao);
        TuxTextView tuxTextView = (TuxTextView) findViewById2;
        tuxTextView.setTuxFont(13);
        tuxTextView.LJJJ(36.0f);
        tuxTextView.animate().setDuration(400L).setStartDelay(300L).alpha(1.0f).translationYBy(-40.0f).setInterpolator(C55953Lxd.LJ()).withEndAction(new ARunnableS46S0100000_10(this, 54)).start();
        o.LJIIIIZZ(findViewById2, "view.findViewById<TuxTex…       .start()\n        }");
    }
}
