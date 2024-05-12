package com.ss.android.ugc.aweme.search.pages.voice.core.ui;

import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C188727au;
import X.C1B3;
import X.C212418Vh;
import X.C213178Yf;
import X.C213198Yh;
import X.C221108m2;
import X.C29S;
import X.C33Q;
import X.C3C5;
import X.C3C8;
import X.C56412MCa;
import X.C62822Ol8;
import X.C76800UCe;
import X.C78983UzD;
import X.C8YZ;
import X.C90903hW;
import X.C93678aUk;
import X.C94582ajK;
import X.C94708alM;
import X.C94813an3;
import X.EnumC93590aTK;
import X.FMX;
import X.InterfaceC212848Wy;
import X.InterfaceC222288nw;
import X.InterfaceC88471Ynr;
import X.InterfaceC88472Yns;
import X.InterfaceC88473Ynt;
import X.InterfaceC88474Ynu;
import X.InterfaceC88475Ynv;
import X.InterfaceC88476Ynw;
import X.K0Z;
import X.K55;
import X.KJB;
import X.KPL;
import X.OSK;
import X.OSL;
import X.OSM;
import X.TBW;
import X.XKQ;
import X.XKX;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.ss.android.ugc.aweme.search.pages.voice.musicsearch.ui.MusicRecognitionFragment;
import com.ss.android.ugc.aweme.search.pages.voice.musicsearch.viewmodel.MusicRecognitionVM;
import com.ss.android.ugc.aweme.search.pages.voice.voicesearch.core.ui.VoiceSearchFragment;
import com.ss.android.ugc.aweme.search.pages.voice.voicesearch.core.viewmodel.VoiceSearchViewModel;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.IDqS423S0100000_42;
import kotlin.jvm.internal.o;

/* loaded from: classes34.dex */
public class VoiceSearchContainerFragment extends BaseFragment implements KPL, K0Z {
    public boolean LJLJJI;
    public XKQ LJLJJL;
    public K55 LJLJJLL;
    public final Map<Integer, View> LJLJL = new LinkedHashMap();
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(new IDqS423S0100000_42(this, 82));
    public final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(new IDqS423S0100000_42(this, 81));
    public final C62822Ol8 LJLJI = C221108m2.LIZIZ(new IDqS423S0100000_42(this, 83));

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment
    public void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJL).clear();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment
    public View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJL;
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

    @Override // X.KPL, X.C8YZ
    public final LifecycleOwner getActualLifecycleOwner() {
        return this;
    }

    @Override // X.KPL, X.C8YM
    public final C8YZ getActualLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.KPL, X.InterfaceC212848Wy
    public final C3C8 getActualReceiver() {
        return this;
    }

    @Override // X.KPL, X.C8YM
    public final InterfaceC212848Wy<C3C8> getActualReceiverHolder() {
        return this;
    }

    @Override // X.KPL, X.C8YM
    public final LifecycleOwner getHostLifecycleOwner() {
        return null;
    }

    @Override // X.KPL, X.C8YM
    public final LifecycleOwner getOwnLifecycleOwner() {
        return this;
    }

    @Override // X.KPL, X.C8YM
    public final C3C8 getReceiverForHostVM() {
        return null;
    }

    @Override // X.C8YM
    public final boolean getUniqueOnlyDefault() {
        return true;
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public final void vl() {
        MusicRecognitionFragment musicRecognitionFragment;
        VoiceSearchFragment voiceSearchFragment;
        XKQ xkq = this.LJLJJL;
        if (xkq != null) {
            xkq.LIZIZ(null);
        }
        this.LJLJJL = null;
        try {
            Fragment LJJJIL = getChildFragmentManager().LJJJIL("voice_search");
            if ((LJJJIL instanceof VoiceSearchFragment) && (voiceSearchFragment = (VoiceSearchFragment) LJJJIL) != null) {
                VoiceSearchViewModel Dl = voiceSearchFragment.Dl();
                XKQ xkq2 = Dl.LJLILLLLZI;
                if (xkq2 != null) {
                    xkq2.LIZIZ(null);
                }
                Dl.LJLIL.LIZIZ(2);
                Dl.setState(C94708alM.LJLIL);
            }
            Fragment LJJJIL2 = getChildFragmentManager().LJJJIL("music_search");
            if ((LJJJIL2 instanceof MusicRecognitionFragment) && (musicRecognitionFragment = (MusicRecognitionFragment) LJJJIL2) != null) {
                MusicRecognitionVM vl = musicRecognitionFragment.vl();
                vl.getClass();
                vl.hv0(EnumC93590aTK.CLOSED);
            }
            KJB LIZ = C93678aUk.LIZ((String) this.LJLJI.getValue());
            if (LIZ != null) {
                LIZ.LIZJ(mo49getActivity(), this);
            }
        } catch (IllegalStateException unused) {
            C78983UzD.LJIILL("voice_search_fragment_api");
        }
    }

    public final void wl() {
        try {
            FragmentManager childFragmentManager = getChildFragmentManager();
            o.LJIIIIZZ(childFragmentManager, "childFragmentManager");
            if (childFragmentManager.LJJJIL("music_search") != null) {
                return;
            }
            C1B3 c1b3 = new C1B3(childFragmentManager);
            HashMap mobParams = (HashMap) this.LJLIL.getValue();
            String source = (String) this.LJLJI.getValue();
            o.LJIIIZ(mobParams, "mobParams");
            o.LJIIIZ(source, "source");
            MusicRecognitionFragment musicRecognitionFragment = new MusicRecognitionFragment();
            Bundle bundle = new Bundle();
            bundle.putSerializable("mob", mobParams);
            bundle.putSerializable("source", source);
            musicRecognitionFragment.setArguments(bundle);
            c1b3.LJIIJ(musicRecognitionFragment, "music_search", R.id.nqh);
            c1b3.LJI();
        } catch (IllegalStateException unused) {
            C78983UzD.LJIILL("voice_search_fragment_api");
        }
    }

    @Override // X.K0Z
    public final void onBackPressed() {
        vl();
        K55 k55 = this.LJLJJLL;
        if (k55 != null) {
            k55.onDismiss();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (!this.LJLJJI) {
            this.LJLJJI = true;
            C188727au c188727au = new C188727au();
            c188727au.LJII((HashMap) this.LJLIL.getValue());
            if (((Number) this.LJLILLLLZI.getValue()).intValue() == 2) {
                c188727au.LJI("is_song_recog", "1");
            }
            FMX.LJIIL("voice_recept_board_show", c188727au.LIZ);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        KJB LIZ = C93678aUk.LIZ((String) this.LJLJI.getValue());
        if (LIZ != null) {
            LIZ.LIZ(mo49getActivity());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        KJB LIZ = C93678aUk.LIZ((String) this.LJLJI.getValue());
        if (LIZ != null) {
            LIZ.LIZIZ(mo49getActivity());
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        fragmentConfiguration(C94582ajK.LJLIL);
        super.onCreate(bundle);
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle outState) {
        o.LJIIIZ(outState, "outState");
        super.onSaveInstanceState(outState);
        outState.putBoolean("recreate", true);
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        if (bundle != null && bundle.getBoolean("recreate")) {
            vl();
            return;
        }
        if (((Number) this.LJLILLLLZI.getValue()).intValue() == 2) {
            wl();
        } else {
            try {
                FragmentManager childFragmentManager = getChildFragmentManager();
                o.LJIIIIZZ(childFragmentManager, "childFragmentManager");
                if (childFragmentManager.LJJJIL("voice_search") == null) {
                    C1B3 c1b3 = new C1B3(childFragmentManager);
                    HashMap mobParams = (HashMap) this.LJLIL.getValue();
                    o.LJIIIZ(mobParams, "mobParams");
                    VoiceSearchFragment voiceSearchFragment = new VoiceSearchFragment();
                    Bundle bundle2 = new Bundle();
                    bundle2.putSerializable("mob", mobParams);
                    voiceSearchFragment.setArguments(bundle2);
                    c1b3.LJIIJ(voiceSearchFragment, "voice_search", R.id.nqh);
                    c1b3.LJI();
                }
            } catch (IllegalStateException unused) {
                C78983UzD.LJIILL("voice_search_fragment_api");
            }
        }
        this.LJLJJL = XKX.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C94813an3(view, null), 3);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.dwl, viewGroup, false);
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

    @Override // X.C8YM
    public final <S extends C33Q> InterfaceC222288nw subscribe(AssemViewModel<S> assemViewModel, C56412MCa<S> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super C3C8, ? super S, C76800UCe> interfaceC88471Ynr) {
        return C212418Vh.LJIIIIZZ(this, assemViewModel, c56412MCa, interfaceC88472Yns, interfaceC88471Ynr);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, C56412MCa<C213178Yf<A>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super C3C8, ? super A, C76800UCe> interfaceC88471Ynr) {
        return C212418Vh.LIZJ(this, assemViewModel, tbw, c56412MCa, interfaceC88472Yns, interfaceC88471Ynr);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A> InterfaceC222288nw selectSubscribeOnAsync(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, C56412MCa<C213178Yf<A>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super C3C8, ? super A, C76800UCe> interfaceC88471Ynr) {
        return C212418Vh.LJII(this, assemViewModel, tbw, c56412MCa, interfaceC88472Yns, interfaceC88471Ynr);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A, B> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, C56412MCa<C213198Yh<A, B>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88473Ynt<? super C3C8, ? super A, ? super B, C76800UCe> interfaceC88473Ynt) {
        return C212418Vh.LIZIZ(assemViewModel, this, c56412MCa, interfaceC88472Yns, interfaceC88473Ynt, tbw, tbw2);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A, B, C> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, C56412MCa<OSK<A, B, C>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88474Ynu<? super C3C8, ? super A, ? super B, ? super C, C76800UCe> interfaceC88474Ynu) {
        return C212418Vh.LIZLLL(this, assemViewModel, tbw, tbw2, tbw3, c56412MCa, interfaceC88472Yns, interfaceC88474Ynu);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A, B, C, D> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, TBW<S, ? extends D> tbw4, C56412MCa<OSL<A, B, C, D>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88475Ynv<? super C3C8, ? super A, ? super B, ? super C, ? super D, C76800UCe> interfaceC88475Ynv) {
        return C212418Vh.LJ(this, assemViewModel, tbw, tbw2, tbw3, tbw4, c56412MCa, interfaceC88472Yns, interfaceC88475Ynv);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A, B, C, D, E> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, TBW<S, ? extends D> tbw4, TBW<S, ? extends E> tbw5, C56412MCa<OSM<A, B, C, D, E>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88476Ynw<? super C3C8, ? super A, ? super B, ? super C, ? super D, ? super E, C76800UCe> interfaceC88476Ynw) {
        return C212418Vh.LJFF(this, assemViewModel, tbw, tbw2, tbw3, tbw4, tbw5, c56412MCa, interfaceC88472Yns, interfaceC88476Ynw);
    }
}
