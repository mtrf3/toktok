package com.bytedance.android.live.liveinteract.multiguestv3.main.trymodel;

import X.C0KB;
import X.C15380j0;
import X.C16880lQ;
import X.C30161Gi;
import X.C74824TYe;
import X.C77123UOp;
import X.C78496UrM;
import X.ViewOnClickListenerC28841BTp;
import X.ViewOnClickListenerC28842BTq;
import X.ViewOnClickListenerC28843BTr;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class TryModeMultiGuestAnchorSettingSheet extends LiveSheetFragment {
    public final Map<Integer, View> LLD = new LinkedHashMap();

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final C0KB Kl() {
        C0KB c0kb = new C0KB();
        c0kb.LIZ(C15380j0.LJIILJJIL(R.string.o1w));
        ArrayList arrayList = new ArrayList();
        C30161Gi Gl = Gl();
        if (Gl != null) {
            arrayList.add(Gl);
        }
        c0kb.LJ = arrayList;
        return c0kb;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ((LinkedHashMap) this.LLD).clear();
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final View Jl(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C78496UrM.LIZIZ(layoutInflater, "inflater", layoutInflater, R.layout.dig, viewGroup, false, "inflater.inflate(R.layou…etting, container, false)");
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        C74824TYe.LJLL("livesdk_trymode_anchor_guest_setting_page_show", C77123UOp.LJJIIZ());
        C16880lQ.LJIIJ(ViewOnClickListenerC28841BTp.LJLIL, view.findViewById(R.id.kxg));
        C16880lQ.LJIIJ(ViewOnClickListenerC28842BTq.LJLIL, view.findViewById(R.id.kxx));
        C16880lQ.LJIIJ(ViewOnClickListenerC28843BTr.LJLIL, view.findViewById(R.id.kxh));
    }
}
