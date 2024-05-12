package com.ss.android.ugc.aweme.music.ghost;

import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C246139lJ;
import X.C29S;
import X.C32I;
import X.C3C5;
import X.C51029K0z;
import X.C5H3;
import X.C61520OCm;
import X.C76800UCe;
import X.C8VV;
import X.C90903hW;
import X.O3E;
import X.OSZ;
import X.Z8A;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.geckox.OptionCheckUpdateParams;
import com.bytedance.geckox.model.CheckRequestBodyModel;
import com.bytedance.router.arg.RouteArgExtension;
import com.ss.android.ugc.aweme.profile.ui.ProfileListFragment;
import com.ss.android.ugc.aweme.services.MainServiceImpl;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class GhostMusicFragment extends ProfileListFragment {
    public ScrollView LJLJJI;
    public final Map<Integer, View> LJLJJLL = new LinkedHashMap();
    public final C5H3 LJLJJL = RouteArgExtension.INSTANCE.navArg(this);

    @Override // X.C8Z7
    public final boolean LJJ() {
        return false;
    }

    @Override // X.C8Z7
    public final void LJJJJ() {
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileListFragment
    public final void LL() {
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileListFragment
    public final void Oi() {
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileListFragment
    public final boolean isEmpty() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileListFragment
    public final int wl() {
        ScrollView scrollView = this.LJLJJI;
        if (scrollView != null) {
            return Z8A.LIZIZ.getViewRawBottomY(scrollView);
        }
        return super.wl();
    }

    @Override // X.OGG
    public final View LJIJJ() {
        if (isViewValid()) {
            return this.LJLJJI;
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ((LinkedHashMap) this.LJLJJLL).clear();
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        try {
            OptionCheckUpdateParams optionCheckUpdateParams = new OptionCheckUpdateParams();
            optionCheckUpdateParams.setLazyUpdate(true);
            String accessKey = MainServiceImpl.createIMainServicebyMonsterPlugin(false).getAccessKey();
            C61520OCm LIZ = O3E.LIZ(accessKey);
            if (LIZ != null) {
                List<String> preloadChannels = C246139lJ.LIZJ().getPreloadChannels();
                ArrayList arrayList = new ArrayList(C32I.LJJL(preloadChannels, 10));
                Iterator<String> it = preloadChannels.iterator();
                while (it.hasNext()) {
                    arrayList.add(new CheckRequestBodyModel.TargetChannel(it.next()));
                }
                LIZ.LIZ(null, C51029K0z.LJJIIZI(new OSZ(accessKey, arrayList)), optionCheckUpdateParams);
            }
        } catch (Throwable unused) {
        }
        C8VV.LIZ(this, false, new AqS170S0100000_4(this, 431));
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.c55, viewGroup, false);
        C29S c29s = null;
        if (LLLLIILL != null) {
            this.LJLJJI = (ScrollView) LLLLIILL.findViewById(R.id.drx);
        } else {
            LLLLIILL = null;
        }
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
