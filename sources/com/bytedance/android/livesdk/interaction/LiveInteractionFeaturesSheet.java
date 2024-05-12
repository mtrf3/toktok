package com.bytedance.android.livesdk.interaction;

import X.C1B3;
import X.C1B6;
import X.C51029K0z;
import X.C78496UrM;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.bytedance.android.live.toolbar.DismissToolbarPopEvent;
import com.bytedance.android.livesdk.dataChannel.CppSeeDetailsClickEvent;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class LiveInteractionFeaturesSheet extends LiveSheetFragment {
    public static final /* synthetic */ int LLF = 0;
    public final Map<Integer, View> LLD = new LinkedHashMap();

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ((LinkedHashMap) this.LLD).clear();
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        DataChannel LJIILIIL = C51029K0z.LJIILIIL(this);
        if (LJIILIIL != null) {
            LJIILIIL.lv0(this, CppSeeDetailsClickEvent.class, new AqS171S0100000_5(this, 407));
            LJIILIIL.lv0(this, DismissToolbarPopEvent.class, new AqS171S0100000_5(this, 408));
        }
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final View Jl(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C78496UrM.LIZIZ(layoutInflater, "inflater", layoutInflater, R.layout.did, viewGroup, false, "inflater.inflate(R.layou…atures, container, false)");
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        LiveInteractionFeaturesFragment liveInteractionFeaturesFragment = new LiveInteractionFeaturesFragment();
        Bundle bundle2 = new Bundle();
        bundle2.putBoolean("collapsable", false);
        bundle2.putString("entrance", "toolbar");
        liveInteractionFeaturesFragment.setArguments(bundle2);
        FragmentManager childFragmentManager = getChildFragmentManager();
        C1B3 LIZ = C1B6.LIZ(childFragmentManager, childFragmentManager);
        LIZ.LJIIIIZZ(R.id.dm7, 1, liveInteractionFeaturesFragment, null);
        LIZ.LJI();
    }
}
