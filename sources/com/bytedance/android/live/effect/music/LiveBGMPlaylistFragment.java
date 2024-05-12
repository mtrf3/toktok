package com.bytedance.android.live.effect.music;

import X.AbstractC030109x;
import X.AbstractC28931Bp;
import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C14320hI;
import X.C14360hM;
import X.C14410hR;
import X.C15380j0;
import X.C16880lQ;
import X.C29306Beo;
import X.C29S;
import X.C2BY;
import X.C2EJ;
import X.C32537Cpp;
import X.C33481Tc;
import X.C33591Tn;
import X.C33601To;
import X.C3C5;
import X.C40171ht;
import X.C51029K0z;
import X.C76104Tts;
import X.C76800UCe;
import X.C90903hW;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.ViewModelProviders;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.ui.EnforceDarkModeFragment;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.IDqS416S0100000;
import kotlin.jvm.internal.IDqS443S0100000;
import kotlin.jvm.internal.o;

/* loaded from: classes.dex */
public final class LiveBGMPlaylistFragment extends EnforceDarkModeFragment {
    public BGMPlaylistViewModel LJLILLLLZI;
    public BGMSongListViewModel LJLJI;
    public C33601To LJLJJI;
    public long LJLJJL;
    public final Map<Integer, View> LJLJJLL = new LinkedHashMap();

    @Override // com.bytedance.android.livesdk.ui.EnforceDarkModeFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJJLL).clear();
    }

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

    @Override // com.bytedance.android.livesdk.ui.EnforceDarkModeFragment, com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        C14360hM.LJI((System.currentTimeMillis() - this.LJLJJL) / 1000, C51029K0z.LJIILIIL(this), "playlist", false);
        _$_clearFindViewByIdCache();
    }

    public final void vl(Number number) {
        if (!isViewValid()) {
            return;
        }
        ((TextView) _$_findCachedViewById(R.id.title)).setText(C15380j0.LJIILL(R.string.ou9, number));
        boolean LJ = o.LJ(number, 0L);
        C29306Beo.LJJLIIIJJI(_$_findCachedViewById(R.id.cvu), LJ);
        boolean z = !LJ;
        C29306Beo.LJJLIIIJJI(_$_findCachedViewById(R.id.lkc), z);
        C29306Beo.LJJLIIIJJI(_$_findCachedViewById(R.id.isn), z);
    }

    /* JADX WARN: Type inference failed for: r1v12, types: [java.lang.Integer, O] */
    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        AbstractC28931Bp abstractC28931Bp;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null) {
            this.LJLILLLLZI = (BGMPlaylistViewModel) ViewModelProviders.of(mo49getActivity, new C33481Tc(new C14320hI(), C51029K0z.LJIILIIL(this))).get(BGMPlaylistViewModel.class);
            ActivityC45651qj mo49getActivity2 = mo49getActivity();
            if (mo49getActivity2 != null) {
                this.LJLJI = (BGMSongListViewModel) ViewModelProviders.of(mo49getActivity2, new C33591Tn(new C14410hR(), C51029K0z.LJIILIIL(this))).get(BGMSongListViewModel.class);
            }
        }
        View trash_bin = _$_findCachedViewById(R.id.lkc);
        o.LJIIIIZZ(trash_bin, "trash_bin");
        C29306Beo.LJJJLL(trash_bin, 500L, new IDqS416S0100000(this, 238));
        View back = _$_findCachedViewById(R.id.aeg);
        o.LJIIIIZZ(back, "back");
        C29306Beo.LJJJLL(back, 500L, new IDqS416S0100000(this, 239));
        BGMSongListViewModel bGMSongListViewModel = this.LJLJI;
        if (bGMSongListViewModel != null) {
            BGMPlaylistViewModel bGMPlaylistViewModel = this.LJLILLLLZI;
            if (bGMPlaylistViewModel != null) {
                RecyclerView recycler_view = (RecyclerView) _$_findCachedViewById(R.id.isn);
                o.LJIIIIZZ(recycler_view, "recycler_view");
                this.LJLJJI = new C33601To(bGMSongListViewModel, bGMPlaylistViewModel, recycler_view, this, C51029K0z.LJIILIIL(this));
                BGMPlaylistViewModel bGMPlaylistViewModel2 = this.LJLILLLLZI;
                if (bGMPlaylistViewModel2 != null) {
                    vl(Long.valueOf(bGMPlaylistViewModel2.LJLIL.LIZJ));
                    ((RecyclerView) _$_findCachedViewById(R.id.isn)).setAdapter(this.LJLJJI);
                    AbstractC030109x itemAnimator = ((RecyclerView) _$_findCachedViewById(R.id.isn)).getItemAnimator();
                    if ((itemAnimator instanceof C40171ht) && (abstractC28931Bp = (AbstractC28931Bp) itemAnimator) != null) {
                        abstractC28931Bp.LJI = false;
                    }
                    BGMPlaylistViewModel bGMPlaylistViewModel3 = this.LJLILLLLZI;
                    if (bGMPlaylistViewModel3 != null) {
                        C14320hI c14320hI = bGMPlaylistViewModel3.LJLIL;
                        Integer LIZLLL = c14320hI.LIZLLL(c14320hI.LJ);
                        if (LIZLLL != null) {
                            ((RecyclerView) _$_findCachedViewById(R.id.isn)).LJLI(LIZLLL.intValue() + 1);
                        }
                        DataChannel LJIILIIL = C51029K0z.LJIILIIL(this);
                        if (LJIILIIL != null) {
                            ((C32537Cpp) LJIILIIL.gv0(C2BY.class)).LIZ = 1;
                        }
                        C29306Beo.LJJIIJZLJL(this, null, new C2EJ(this, null), 3);
                        this.LJLJJL = System.currentTimeMillis();
                        RecyclerView recycler_view2 = (RecyclerView) _$_findCachedViewById(R.id.isn);
                        o.LJIIIIZZ(recycler_view2, "recycler_view");
                        new C76104Tts(1, recycler_view2, new IDqS443S0100000(this, 7)).LIZJ(true);
                        return;
                    }
                    o.LJIJI("playlistViewModel");
                    throw null;
                }
                o.LJIJI("playlistViewModel");
                throw null;
            }
            o.LJIJI("playlistViewModel");
            throw null;
        }
        o.LJIJI("songListViewModel");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.d3d, viewGroup, false);
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
