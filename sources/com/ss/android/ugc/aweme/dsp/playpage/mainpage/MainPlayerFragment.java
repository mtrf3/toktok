package com.ss.android.ugc.aweme.dsp.playpage.mainpage;

import X.AbstractC91590Zx4;
import X.C91220Zr6;
import X.C91540ZwG;
import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.ViewModel;
import com.ss.android.ugc.aweme.dsp.playpage.base.BasePlayerFragment;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes22.dex */
public final class MainPlayerFragment extends BasePlayerFragment {
    public final Map<Integer, View> LLFFF = new LinkedHashMap();

    @Override // com.ss.android.ugc.aweme.dsp.playpage.base.BasePlayerFragment, com.ss.android.ugc.aweme.dsp.common.arch.BaseMusicDspFragment, com.bytedance.ies.foundation.fragment.BaseFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LLFFF).clear();
    }

    @Override // com.ss.android.ugc.aweme.dsp.playpage.base.BasePlayerFragment, com.ss.android.ugc.aweme.dsp.common.arch.BaseMusicDspFragment, com.bytedance.ies.foundation.fragment.BaseFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LLFFF;
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

    @Override // com.ss.android.ugc.aweme.dsp.playpage.base.BasePlayerFragment, com.ss.android.ugc.aweme.dsp.common.arch.BaseMusicDspFragment, com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public MainPlayerFragment() {
        super("track_reco");
    }

    @Override // com.ss.android.ugc.aweme.dsp.playpage.base.BasePlayerFragment
    public final boolean Al() {
        return o.LJ(this.LJLLILLLL, "Daily Mix V2");
    }

    @Override // com.ss.android.ugc.aweme.dsp.common.arch.BaseMusicDspFragment
    public final ViewModel vl() {
        return new MainPlayerViewModel();
    }

    @Override // X.InterfaceC91281Zs5
    public final AbstractC91590Zx4 getPlayerController() {
        return C91220Zr6.LIZIZ(getEnterMethod()).LIZ.getMainPlayerController();
    }

    @Override // com.ss.android.ugc.aweme.dsp.playpage.base.BasePlayerFragment, com.ss.android.ugc.aweme.dsp.common.arch.BaseMusicDspFragment, com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        fragmentConfiguration(C91540ZwG.LJLIL);
    }
}
