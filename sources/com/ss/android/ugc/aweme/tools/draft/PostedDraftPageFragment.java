package com.ss.android.ugc.aweme.tools.draft;

import X.ActivityC45651qj;
import X.C221108m2;
import X.C62822Ol8;
import Y.AObjectS86S0100000_7;
import android.os.Bundle;
import android.view.View;
import com.ss.android.ugc.aweme.tools.draft.viewmodel.DraftViewModel;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class PostedDraftPageFragment extends DraftFragment {
    public final Map<Integer, View> LLIIIZ = new LinkedHashMap();
    public final C62822Ol8 LLIIIJ = C221108m2.LIZIZ(new AqS157S0100000_7(this, 324));
    public final String LLIIIL = "posted_draft_page";

    @Override // com.ss.android.ugc.aweme.tools.draft.DraftFragment, com.ss.android.ugc.aweme.appcompat.AmeBaseLegacyFragment, com.ss.android.ugc.aweme.appcompat.AmeBaseFragmentAdaptationLegacyFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LLIIIZ).clear();
    }

    @Override // com.ss.android.ugc.aweme.tools.draft.DraftFragment
    public final String getEnterFrom() {
        return "general_draft_list";
    }

    @Override // com.ss.android.ugc.aweme.tools.draft.DraftFragment, com.ss.android.ugc.aweme.appcompat.AmeBaseLegacyFragment, com.ss.android.ugc.aweme.appcompat.AmeBaseFragmentAdaptationLegacyFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // com.ss.android.ugc.aweme.tools.draft.DraftFragment
    public final DraftViewModel Dl() {
        return (DraftViewModel) this.LLIIIJ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.tools.draft.DraftFragment
    public final void wl() {
        requireFragmentManager().LJJLIIIJJI();
    }

    @Override // com.ss.android.ugc.aweme.tools.draft.DraftFragment
    public final String Al() {
        return this.LLIIIL;
    }

    @Override // com.ss.android.ugc.aweme.tools.draft.DraftFragment, com.ss.android.ugc.aweme.appcompat.AmeBaseFragmentAdaptationLegacyFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        ActivityC45651qj requireActivity = requireActivity();
        o.LJII(requireActivity, "null cannot be cast to non-null type com.ss.android.ugc.aweme.tools.draft.DraftBoxActivity");
        ((DraftBoxActivity) requireActivity).LJLJJL.LIZLLL(this, new AObjectS86S0100000_7(this, 106));
    }
}
