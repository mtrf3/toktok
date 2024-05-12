package com.ss.android.ugc.aweme.sticker.view.internal.search;

import X.AbstractC73672Svk;
import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C29S;
import X.C3C5;
import X.C73411SrX;
import X.C74266TCs;
import X.C76800UCe;
import X.C90903hW;
import X.InterfaceC65784Pro;
import X.OSZ;
import X.TF1;
import Y.AObserverS80S0100000_12;
import Y.AfS64S0100000_12;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.ss.android.ugc.aweme.sticker.view.internal.pager.pages.AbstractStickerFragment;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SearchStickerFragment extends AbstractStickerFragment<C74266TCs> {
    public static final /* synthetic */ int LJZI = 0;
    public SearchStickerViewContainer LJLLJ;
    public TF1 LJLLL;
    public LiveData<C76800UCe> LJLLLL;
    public InterfaceC65784Pro<C76800UCe> LJLLLLLL;
    public C73411SrX LJLZ;
    public boolean LJZ;

    @Override // com.ss.android.ugc.aweme.sticker.view.internal.pager.pages.AbstractStickerFragment
    public final void Il() {
    }

    @Override // com.ss.android.ugc.aweme.sticker.view.internal.pager.pages.AbstractStickerFragment
    public final void _$_clearFindViewByIdCache() {
    }

    @Override // com.ss.android.ugc.aweme.sticker.view.internal.pager.pages.AbstractStickerFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
    }

    public final SearchStickerViewContainer Ml() {
        SearchStickerViewContainer searchStickerViewContainer = this.LJLLJ;
        if (searchStickerViewContainer != null) {
            return searchStickerViewContainer;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        if (this.LJLLJ == null || this.LJLLL == null || this.LJLLLL == null) {
            return;
        }
        Ml().LJIIIIZZ();
        AbstractC73672Svk<OSZ<Integer, Integer>> abstractC73672Svk = wl().LJI;
        if (abstractC73672Svk != null) {
            this.LJLZ = (C73411SrX) abstractC73672Svk.LJJJJZI(new AfS64S0100000_12(this, 44));
        }
        LiveData<C76800UCe> liveData = this.LJLLLL;
        if (liveData != null) {
            liveData.observe(this, new AObserverS80S0100000_12(this, 30));
        } else {
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        C73411SrX c73411SrX = this.LJLZ;
        if (c73411SrX != null) {
            c73411SrX.dispose();
        }
    }

    @Override // com.ss.android.ugc.aweme.sticker.view.internal.pager.pages.AbstractStickerFragment
    public final LinearLayoutManager Jl(View root) {
        o.LJIIIZ(root, "root");
        SearchStickerViewContainer$getLayoutManager$stickerLayoutManager$1 searchStickerViewContainer$getLayoutManager$stickerLayoutManager$1 = Ml().LLFF;
        if (searchStickerViewContainer$getLayoutManager$stickerLayoutManager$1 != null) {
            return searchStickerViewContainer$getLayoutManager$stickerLayoutManager$1;
        }
        return new LinearLayoutManager();
    }

    @Override // com.ss.android.ugc.aweme.sticker.view.internal.pager.pages.AbstractStickerFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        boolean z;
        View view;
        o.LJIIIZ(inflater, "inflater");
        if (this.LJLLJ == null || this.LJLLL == null || this.LJLLLL == null) {
            z = true;
        } else {
            z = false;
        }
        C29S c29s = null;
        if (z) {
            view = null;
        } else {
            if (Ml().LLIIII.getParent() != null) {
                ViewParent parent = Ml().LLIIII.getParent();
                if (parent != null) {
                    C16880lQ.LJLLL(Ml().LLIIII, (ViewGroup) parent);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
                }
            }
            view = Ml().LLIIII;
        }
        if (!(view instanceof View)) {
            view = null;
        }
        if (view != null) {
            try {
                ViewTreeLifecycleOwner.set(view, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(view, this);
                C10A.LIZIZ(view, this);
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
        return view;
    }
}
