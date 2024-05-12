package com.bytedance.android.livesdk.broadcast.preview.helper;

import X.C15380j0;
import X.C15490jB;
import X.C15510jD;
import X.C16880lQ;
import X.C28507BGt;
import X.C2A7;
import Y.ACListenerS25S0100000_5;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class CppAgeVerifyDialogHelper extends LiveDialogFragment {
    public boolean LJLIL;
    public final Map<Integer, View> LJLILLLLZI = new LinkedHashMap();

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLILLLLZI).clear();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLILLLLZI;
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
        C28507BGt c28507BGt = new C28507BGt(R.layout.cw4);
        c28507BGt.LIZJ = R.style.ab_;
        c28507BGt.LJII = 80;
        c28507BGt.LJIIIZ = -1;
        c28507BGt.LJIIJ = -1;
        return c28507BGt;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        int i;
        int i2;
        String str;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        TextView textView = (TextView) view.findViewById(R.id.c_i);
        if (this.LJLIL) {
            i = R.string.jzi;
        } else {
            i = R.string.jzl;
        }
        textView.setText(C15380j0.LJIILJJIL(i));
        TextView textView2 = (TextView) view.findViewById(R.id.c_h);
        if (this.LJLIL) {
            i2 = R.string.jzh;
        } else {
            i2 = R.string.jzk;
        }
        textView2.setText(C15380j0.LJIILJJIL(i2));
        C16880lQ.LJJIII((C2A7) view.findViewById(R.id.awj), new ACListenerS25S0100000_5(this, 94));
        C16880lQ.LJIIJ(new ACListenerS25S0100000_5(this, 95), view.findViewById(R.id.nb4));
        View findViewById = view.findViewById(R.id.c_b);
        if (this.LJLIL) {
            str = "ttlive_cpp_age_verify_failed.png";
        } else {
            str = "ttlive_cpp_age_verify_processing.png";
        }
        C15490jB.LIZJ(findViewById, C15510jD.LJIIIZ("tiktok_live_broadcast_demand_4", str));
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment
    public final void show(FragmentManager manager, String str) {
        o.LJIIIZ(manager, "manager");
        super.show(manager, str);
    }
}
