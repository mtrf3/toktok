package com.bytedance.android.live.liveinteract.multihost.trymode;

import X.C0KB;
import X.C15380j0;
import X.C30161Gi;
import X.C78496UrM;
import Y.ACListenerS25S0100000_5;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes6.dex */
public final class TryModeCoHostManageSheet extends LiveSheetFragment {
    public final Map<Integer, View> LLD = new LinkedHashMap();

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final C0KB Kl() {
        C0KB c0kb = new C0KB();
        c0kb.LIZ(C15380j0.LJIILJJIL(R.string.kk2));
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C30161Gi(R.attr.atj, new ACListenerS25S0100000_5(this, 30)));
        c0kb.LJFF = arrayList;
        return c0kb;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ((LinkedHashMap) this.LLD).clear();
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final View Jl(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C78496UrM.LIZIZ(layoutInflater, "inflater", layoutInflater, R.layout.djg, viewGroup, false, "inflater.inflate(\n      …         false,\n        )");
    }
}
