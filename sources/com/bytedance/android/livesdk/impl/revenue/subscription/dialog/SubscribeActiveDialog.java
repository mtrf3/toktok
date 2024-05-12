package com.bytedance.android.livesdk.impl.revenue.subscription.dialog;

import X.B83;
import X.BZI;
import X.C15380j0;
import X.C15490jB;
import X.C16880lQ;
import X.C28787BRn;
import X.C29374Bfu;
import X.C2A7;
import X.CFX;
import X.InterfaceC30442Bx8;
import Y.ACListenerS25S0100000_5;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class SubscribeActiveDialog extends BaseSubscribeBottomDialog {
    public final Map<Integer, View> LJLJI = new LinkedHashMap();

    @Override // com.bytedance.android.livesdk.impl.revenue.subscription.dialog.BaseSubscribeBottomDialog, com.bytedance.android.livesdk.LiveDialogFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJI).clear();
    }

    @Override // com.bytedance.android.livesdk.impl.revenue.subscription.dialog.BaseSubscribeBottomDialog, com.bytedance.android.livesdk.LiveDialogFragment
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

    @Override // com.bytedance.android.livesdk.impl.revenue.subscription.dialog.BaseSubscribeBottomDialog
    public final int vl() {
        return R.layout.d1b;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        C15490jB.LJ(_$_findCachedViewById(R.id.f51), CFX.LIZ("tiktok_live_basic_resource", "tiktok_live_watch_resource_demand_1"), "ttlive_subcribe_emote_hi.png");
        ((TextView) _$_findCachedViewById(R.id.m4u)).setText(C15380j0.LJIILJJIL(R.string.ocu));
        C16880lQ.LJJII((LiveIconView) _$_findCachedViewById(R.id.avl), new ACListenerS25S0100000_5(this, 164));
        C16880lQ.LJJIII((C2A7) _$_findCachedViewById(R.id.axo), new ACListenerS25S0100000_5(this, 165));
        InterfaceC30442Bx8.LJLLI.LIZJ(Boolean.TRUE);
        BZI LIZ = C28787BRn.LIZ("livesdk_anchor_subscription_active_show");
        LIZ.LJFF(String.valueOf(((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId()));
        LIZ.LJIJJ(this.LJLIL, "show_entrance");
        LIZ.LJJIIJZLJL();
    }
}
