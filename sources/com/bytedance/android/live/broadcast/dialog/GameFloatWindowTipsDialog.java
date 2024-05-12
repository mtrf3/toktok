package com.bytedance.android.live.broadcast.dialog;

import X.C15490jB;
import X.C15540jG;
import X.C16880lQ;
import X.C28507BGt;
import X.C2A7;
import X.C31073CHl;
import X.C47061t0;
import X.C86881Y7x;
import X.C96Q;
import X.CFX;
import Y.IDCListenerS135S0100000;
import android.graphics.drawable.Animatable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.livesetting.broadcast.BroadcastGameFloatWindowLibra;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes.dex */
public final class GameFloatWindowTipsDialog extends LiveDialogFragment {
    public final Map<Integer, View> LJLJI = new LinkedHashMap();
    public String LJLIL = "";
    public final boolean LJLILLLLZI = BroadcastGameFloatWindowLibra.INSTANCE.isExperimentGroup();

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJI).clear();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJI;
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
        C28507BGt c28507BGt = new C28507BGt(R.layout.cwy);
        c28507BGt.LIZJ = R.style.aap;
        c28507BGt.LJIILIIL = 48;
        c28507BGt.LJII = 80;
        c28507BGt.LJIIIZ = c28507BGt.LJIIIZ;
        c28507BGt.LJIIJ = -2;
        return c28507BGt;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        mo49getActivity();
        o.LJIIIIZZ(onGetLayoutInflater, "getLayoutInflater(\n     …      activity,\n        )");
        return onGetLayoutInflater;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String LIZ;
        String LIZ2;
        String LIZ3;
        String str;
        String LIZ4;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        View findViewById = view.findViewById(R.id.lnn);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.t…overlay_permission_guide)");
        C47061t0 c47061t0 = (C47061t0) findViewById;
        View findViewById2 = view.findViewById(R.id.lnp);
        o.LJIIIIZZ(findViewById2, "view.findViewById(R.id.t…g_overlay_setting_button)");
        C2A7 c2a7 = (C2A7) findViewById2;
        if (this.LJLILLLLZI) {
            LIZ = C86881Y7x.LIZIZ().LIZ("pm_mt_liveStudio_permission_allowDisplay_actionSheet_header");
        } else {
            LIZ = C86881Y7x.LIZIZ().LIZ("pm_mt_mobile_gaming_floating_window_title");
        }
        if (C96Q.LIZ(LIZ)) {
            ((TextView) _$_findCachedViewById(R.id.lno)).setText(LIZ);
        }
        if (this.LJLILLLLZI) {
            LIZ2 = C86881Y7x.LIZIZ().LIZ("pm_mt_liveStudio_permission_allowDisplay_actionSheet_desc");
        } else {
            LIZ2 = C86881Y7x.LIZIZ().LIZ("pm_mt_mobile_gaming_floating_window_text");
        }
        if (C96Q.LIZ(LIZ2)) {
            ((TextView) _$_findCachedViewById(R.id.lnm)).setText(LIZ2);
        }
        if (this.LJLILLLLZI) {
            LIZ3 = C86881Y7x.LIZIZ().LIZ("pm_mt_liveStudio_permission_allowDisplay_actionSheet_button");
        } else {
            LIZ3 = C86881Y7x.LIZIZ().LIZ("pm_mt_mobile_gaming_floating_window_button");
        }
        if (C96Q.LIZ(LIZ3)) {
            ((C2A7) _$_findCachedViewById(R.id.lnp)).setText(LIZ3);
        }
        C15540jG c15540jG = new C15540jG();
        if (this.LJLILLLLZI) {
            str = "ttlive_float_window_permission_guide_new.webp";
            LIZ4 = "tiktok_live_game_demand_2";
        } else {
            str = "ttlive_float_window_permission_guide.webp";
            LIZ4 = CFX.LIZ("tiktok_live_broadcast_resource", "tiktok_live_game_demand_1");
        }
        c15540jG.LIZ = c47061t0;
        c15540jG.LIZIZ = LIZ4;
        c15540jG.LIZJ = str;
        c15540jG.LJFF = true;
        c15540jG.LJI = Integer.MAX_VALUE;
        c15540jG.LJ = new C31073CHl() { // from class: X.1j5
            @Override // X.C31073CHl
            public final void LJII(Animatable anim) {
                o.LJIIIZ(anim, "anim");
            }
        };
        C15490jB.LJI(c15540jG);
        C16880lQ.LJJIII(c2a7, new IDCListenerS135S0100000(this, 18));
    }
}
