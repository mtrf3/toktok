package com.ss.android.ugc.aweme.search.arch.v2.services;

import X.C00F;
import X.C2K0;
import X.C49265JVd;
import X.InterfaceC48979JKd;
import X.InterfaceC49279JVr;
import X.JYP;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.ui.jedi.SearchJediMixFeedFragment$initAdapter$layoutManager$1;
import java.util.List;
import kotlin.jvm.internal.AqS174S0100000_8;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class SearchServiceCenterImplKt {
    public static final InterfaceC49279JVr LJ(LifecycleOwner lifecycleOwner, List<? extends InterfaceC48979JKd> list) {
        o.LJIIIZ(lifecycleOwner, "<this>");
        InternalPlayerSyncAbilityImpl internalPlayerSyncAbilityImpl = new InternalPlayerSyncAbilityImpl(list);
        LIZ(lifecycleOwner, internalPlayerSyncAbilityImpl, InternalPlayerSyncAbility.class);
        return internalPlayerSyncAbilityImpl;
    }

    public static final void LIZ(LifecycleOwner lifecycleOwner, C2K0 c2k0, Class<? extends C2K0> cls) {
        if (C00F.LIZ(31744, 1, "search_card_container", true) > 0) {
            lifecycleOwner.getLifecycle().addObserver(new SearchServiceCenterImplKt$autoBindAbility$1(lifecycleOwner, c2k0, cls));
        }
    }

    public static final void LIZIZ(LifecycleOwner lifecycleOwner, RecyclerView recyclerView, SearchJediMixFeedFragment$initAdapter$layoutManager$1 searchJediMixFeedFragment$initAdapter$layoutManager$1) {
        o.LJIIIZ(lifecycleOwner, "<this>");
        LIZ(lifecycleOwner, new CommonAbilityImpl(recyclerView, searchJediMixFeedFragment$initAdapter$layoutManager$1), SearchServiceCenter$RecyclerViewAbility.class);
    }

    public static final void LIZJ(LifecycleOwner lifecycleOwner, C49265JVd adapter, SearchJediMixFeedFragment$initAdapter$layoutManager$1 searchJediMixFeedFragment$initAdapter$layoutManager$1) {
        o.LJIIIZ(lifecycleOwner, "<this>");
        o.LJIIIZ(adapter, "adapter");
        LIZ(lifecycleOwner, new TopMixAdapterControlAbilityImpl(adapter, searchJediMixFeedFragment$initAdapter$layoutManager$1), SearchServiceCenter$AdapterControlAbility.class);
    }

    public static final void LIZLLL(LifecycleOwner lifecycleOwner, Fragment fragment, JYP jyp, AqS174S0100000_8 aqS174S0100000_8) {
        o.LJIIIZ(lifecycleOwner, "<this>");
        o.LJIIIZ(fragment, "fragment");
        LIZ(lifecycleOwner, new TopMixNavigateAbilityImpl(fragment, jyp, aqS174S0100000_8), SearchServiceCenter$NavigateAbility.class);
    }
}
