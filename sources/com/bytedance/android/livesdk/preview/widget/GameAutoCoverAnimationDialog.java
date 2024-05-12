package com.bytedance.android.livesdk.preview.widget;

import X.BFY;
import X.C10A;
import X.C15490jB;
import X.C16880lQ;
import X.C221108m2;
import X.C28507BGt;
import X.C29701Eo;
import X.C62822Ol8;
import X.CFX;
import X.CVT;
import Y.ACListenerS25S0100000_5;
import Y.IDAListenerS74S0100000_5;
import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.vcloud.vctrace.BuildConfig;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS155S0100000_5;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class GameAutoCoverAnimationDialog extends LiveDialogFragment {
    public final Map<Integer, View> LJLILLLLZI = new LinkedHashMap();
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(new AqS155S0100000_5(this, 255));

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

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C28507BGt createParams() {
        C28507BGt c28507BGt = new C28507BGt(R.layout.cwz);
        c28507BGt.LIZJ = R.style.abj;
        c28507BGt.LJIIL = new ColorDrawable(0);
        c28507BGt.LJI = 0.5f;
        c28507BGt.LJII = 17;
        c28507BGt.LJIIJ = -1;
        return c28507BGt;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        Window window;
        View decorView;
        Window window2;
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog != null && (window2 = dialog.getWindow()) != null) {
            window2.addFlags(2);
        }
        Dialog dialog2 = getDialog();
        if (dialog2 != null && (window = dialog2.getWindow()) != null && (decorView = window.getDecorView()) != null) {
            ViewTreeLifecycleOwner.set(decorView, this);
            ViewTreeViewModelStoreOwner.set(decorView, this);
            C10A.LIZIZ(decorView, this);
        }
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C29701Eo c29701Eo;
        View findViewById;
        View findViewById2;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        View view2 = getView();
        if (view2 != null && (findViewById2 = view2.findViewById(R.id.fk2)) != null) {
            C16880lQ.LJIIJ(new ACListenerS25S0100000_5(this, BuildConfig.VERSION_CODE), findViewById2);
        }
        View view3 = getView();
        if (view3 != null && (findViewById = view3.findViewById(R.id.fgn)) != null) {
            C16880lQ.LJIIJ(BFY.LJLIL, findViewById);
        }
        CVT cvt = (CVT) this.LJLIL.getValue();
        if (cvt != null) {
            cvt.setVisibility(0);
        }
        View view4 = getView();
        if (view4 != null && (c29701Eo = (C29701Eo) view4.findViewById(R.id.ga1)) != null) {
            c29701Eo.addAnimatorListener(new IDAListenerS74S0100000_5(this, 16));
            C15490jB.LJIIJ(c29701Eo, CFX.LIZ("tiktok_live_lottie_resource", "tiktok_live_game_demand_1"), "ttlive_game_auto_cover_animation.zip", true);
        }
    }
}
