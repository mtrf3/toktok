package com.ss.android.ugc.aweme.dsp.playpage.favpage;

import X.AbstractC91590Zx4;
import X.C91220Zr6;
import X.InterfaceC91296ZsK;
import Y.IDObserverS226S0100000_29;
import android.view.View;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProviders;
import com.ss.android.ugc.aweme.dsp.playpage.base.BasePlayerFragment;
import com.ss.android.ugc.aweme.dsp.playpage.base.BasePlayerViewModel;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes22.dex */
public final class FavPlayerFragment extends BasePlayerFragment {
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

    public FavPlayerFragment() {
        super("dsp_player");
    }

    @Override // com.ss.android.ugc.aweme.dsp.playpage.base.BasePlayerFragment
    public final boolean Al() {
        return o.LJ(this.LJLLILLLL, "LIBRARY V2");
    }

    @Override // X.InterfaceC91281Zs5
    public final AbstractC91590Zx4 getPlayerController() {
        return C91220Zr6.LIZIZ(getEnterMethod()).LIZ.getSubPlayerController();
    }

    @Override // com.ss.android.ugc.aweme.dsp.common.arch.BaseMusicDspFragment
    public final ViewModel vl() {
        return ViewModelProviders.of(this).get(FavPlayerViewModel.class);
    }

    @Override // com.ss.android.ugc.aweme.dsp.playpage.base.BasePlayerFragment, com.ss.android.ugc.aweme.dsp.common.arch.BaseMusicDspFragment
    public final void wl() {
        FavPlayerViewModel favPlayerViewModel;
        MutableLiveData<List<InterfaceC91296ZsK>> mutableLiveData;
        super.wl();
        BasePlayerViewModel xl = xl();
        if ((xl instanceof FavPlayerViewModel) && (favPlayerViewModel = (FavPlayerViewModel) xl) != null && (mutableLiveData = favPlayerViewModel.LJLLL) != null) {
            mutableLiveData.observe(this, new IDObserverS226S0100000_29(this, 8));
        }
    }
}
