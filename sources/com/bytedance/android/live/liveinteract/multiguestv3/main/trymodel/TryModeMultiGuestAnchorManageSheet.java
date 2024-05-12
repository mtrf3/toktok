package com.bytedance.android.live.liveinteract.multiguestv3.main.trymodel;

import X.B83;
import X.C05170If;
import X.C0KB;
import X.C0KJ;
import X.C15380j0;
import X.C16880lQ;
import X.C30161Gi;
import X.C31597Caf;
import X.C31665Cbl;
import X.C78496UrM;
import X.ViewOnClickListenerC28444BEi;
import X.ViewOnClickListenerC28844BTs;
import Y.ACListenerS25S0100000_5;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class TryModeMultiGuestAnchorManageSheet extends LiveSheetFragment {
    public final Map<Integer, View> LLD = new LinkedHashMap();

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final C0KB Kl() {
        C0KB c0kb = new C0KB();
        c0kb.LIZ(C15380j0.LJIILJJIL(R.string.nl_));
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C0KJ(R.drawable.d25, new ACListenerS25S0100000_5(this, 24)));
        arrayList.add(new C30161Gi(R.attr.atj, new ACListenerS25S0100000_5(this, 25)));
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
        return C78496UrM.LIZIZ(layoutInflater, "inflater", layoutInflater, R.layout.dif, viewGroup, false, "inflater.inflate(\n      …         false,\n        )");
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        User LJ = B83.LIZ().LIZIZ().LJ();
        o.LJIIIIZZ(LJ, "getInstance().user().currentUserOpt");
        C31597Caf c31597Caf = (C31597Caf) view.findViewById(R.id.f67);
        C31665Cbl.LJIIJ(c31597Caf, LJ.getAvatarThumb(), c31597Caf.getWidth(), c31597Caf.getHeight(), R.drawable.cuk);
        C16880lQ.LJJIJIIJI(c31597Caf, new ACListenerS25S0100000_5(this, 285));
        ((TextView) view.findViewById(R.id.mpz)).setText(C05170If.LIZ(LJ));
        C16880lQ.LJIILLIIL((ImageView) view.findViewById(R.id.f4v), ViewOnClickListenerC28844BTs.LJLIL);
        C16880lQ.LJIILLIIL((ImageView) view.findViewById(R.id.atp), ViewOnClickListenerC28444BEi.LJLIL);
    }
}
