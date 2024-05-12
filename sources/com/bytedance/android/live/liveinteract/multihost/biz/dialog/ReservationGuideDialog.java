package com.bytedance.android.live.liveinteract.multihost.biz.dialog;

import X.C16880lQ;
import X.C28507BGt;
import Y.ACListenerS25S0100000_5;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class ReservationGuideDialog extends LiveDialogFragment {
    public String LJLIL;
    public String LJLILLLLZI;
    public String LJLJI;
    public String LJLJJI;
    public final Map<Integer, View> LJLJJL = new LinkedHashMap();

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJJL).clear();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJJL;
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

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C28507BGt createParams() {
        C28507BGt c28507BGt = new C28507BGt(R.layout.d0f);
        c28507BGt.LIZJ = R.style.aai;
        c28507BGt.LJII = 80;
        c28507BGt.LJIIJ = -2;
        return c28507BGt;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        boolean z;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        View findViewById = view.findViewById(R.id.mhg);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.tv_reserve_guide_1)");
        TextView textView = (TextView) findViewById;
        View findViewById2 = view.findViewById(R.id.mhh);
        o.LJIIIIZZ(findViewById2, "view.findViewById(R.id.tv_reserve_guide_2)");
        TextView textView2 = (TextView) findViewById2;
        View findViewById3 = view.findViewById(R.id.mhi);
        o.LJIIIIZZ(findViewById3, "view.findViewById(R.id.tv_reserve_guide_3)");
        TextView textView3 = (TextView) findViewById3;
        View findViewById4 = view.findViewById(R.id.mhj);
        o.LJIIIIZZ(findViewById4, "view.findViewById(R.id.tv_reserve_guide_4)");
        TextView textView4 = (TextView) findViewById4;
        String str = this.LJLJI;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            textView3.setVisibility(8);
            textView4.setVisibility(0);
            textView2.setVisibility(0);
            textView.setVisibility(0);
            textView.setText(this.LJLIL);
            textView2.setText(this.LJLILLLLZI);
            textView4.setText(this.LJLJJI);
        } else {
            textView4.setVisibility(0);
            textView3.setVisibility(0);
            textView.setVisibility(8);
            textView2.setVisibility(8);
            textView3.setText(this.LJLJI);
            textView4.setText(this.LJLJJI);
        }
        C16880lQ.LJIIJ(new ACListenerS25S0100000_5(this, 29), view.findViewById(R.id.e_6));
    }
}
