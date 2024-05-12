package com.bytedance.android.livesdk.broadcast.preview.widget.setting;

import X.C29306Beo;
import X.C78496UrM;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class PreviewPracticeModeFragmentSheet extends LiveSheetFragment {
    public final Map<Integer, View> LLD = new LinkedHashMap();

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ((LinkedHashMap) this.LLD).clear();
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final View Jl(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C78496UrM.LIZIZ(layoutInflater, "inflater", layoutInflater, R.layout.dgi, viewGroup, false, "inflater.inflate(\n      …         false,\n        )");
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        View findViewById = view.findViewById(R.id.i0d);
        o.LJIIIIZZ(findViewById, "view.findViewById<LiveBu…on>(R.id.practice_button)");
        C29306Beo.LJJJLL(findViewById, 500L, new AqS171S0100000_5(this, 228));
    }
}
