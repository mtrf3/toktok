package com.bytedance.android.live.broadcast.dialog;

import X.C15490jB;
import X.C16880lQ;
import X.C28507BGt;
import X.C2A7;
import X.C76800UCe;
import X.C86881Y7x;
import X.C96Q;
import X.CFX;
import X.InterfaceC65784Pro;
import Y.IDCListenerS135S0100000;
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
public final class GameScreenShareTipsDialog extends LiveDialogFragment {
    public static final /* synthetic */ int LJLJJI = 0;
    public InterfaceC65784Pro<C76800UCe> LJLIL;
    public final Map<Integer, View> LJLJI = new LinkedHashMap();
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
        C28507BGt c28507BGt = new C28507BGt(R.layout.d0q);
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
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        if (this.LJLILLLLZI) {
            LIZ = C86881Y7x.LIZIZ().LIZ("pm_mt_liveStudio_permission_allowRecording_actionSheet_header");
        } else {
            LIZ = C86881Y7x.LIZIZ().LIZ("pm_mt_mobile_gaming_recording_title");
        }
        if (C96Q.LIZ(LIZ)) {
            ((TextView) _$_findCachedViewById(R.id.lo1)).setText(LIZ);
        }
        if (this.LJLILLLLZI) {
            LIZ2 = C86881Y7x.LIZIZ().LIZ("pm_mt_liveStudio_permission_allowRecording_actionSheet_desc");
        } else {
            LIZ2 = C86881Y7x.LIZIZ().LIZ("pm_mt_mobile_gaming_recording_text");
        }
        if (C96Q.LIZ(LIZ2)) {
            ((TextView) _$_findCachedViewById(R.id.lnz)).setText(LIZ2);
        }
        if (this.LJLILLLLZI) {
            LIZ3 = C86881Y7x.LIZIZ().LIZ("pm_mt_liveStudio_permission_allowRecording_actionSheet_button2");
        } else {
            LIZ3 = C86881Y7x.LIZIZ().LIZ("pm_mt_mobile_gaming_button");
        }
        if (C96Q.LIZ(LIZ3)) {
            ((C2A7) _$_findCachedViewById(R.id.lo2)).setText(LIZ3);
        }
        C15490jB.LJ(_$_findCachedViewById(R.id.lo0), CFX.LIZ("tiktok_live_broadcast_resource", "tiktok_live_game_demand_1"), "ttlive_screen_share_guide.png");
        C16880lQ.LJJIII((C2A7) _$_findCachedViewById(R.id.lo2), new IDCListenerS135S0100000(this, 20));
    }
}
