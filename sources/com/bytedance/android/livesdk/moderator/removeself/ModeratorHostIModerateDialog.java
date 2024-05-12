package com.bytedance.android.livesdk.moderator.removeself;

import X.BB8;
import X.C0P2;
import X.C16880lQ;
import X.C1B3;
import X.C1B6;
import X.CN1;
import Y.ACListenerS25S0100000_5;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.common.keyboard.MeasureLinearLayout;
import com.bytedance.android.live.moderator.IModeratorService;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.dataChannel.BroadcastDialogPageChannel;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class ModeratorHostIModerateDialog extends LiveDialogFragment {
    public final Map<Integer, View> LJLIL = new LinkedHashMap();

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLIL).clear();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLIL;
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

    /* JADX WARN: Removed duplicated region for block: B:12:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0039  */
    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C28507BGt createParams() {
        /*
            r6 = this;
            com.bytedance.ies.sdk.datachannel.DataChannel r2 = r6.dataChannel
            r1 = 1
            if (r2 == 0) goto L48
            java.lang.Class<X.BCW> r0 = X.BCW.class
            java.lang.Object r0 = r2.kv0(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            if (r0 == 0) goto L48
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L40
        L15:
            r5 = 2131886730(0x7f12028a, float:1.9408047E38)
            if (r0 != r1) goto L44
            r4 = 80
        L1c:
            r3 = -1
            if (r0 != r1) goto L39
            r2 = -1
            r3 = -2
        L21:
            X.BGt r1 = new X.BGt
            r0 = 2131563979(0x7f0d15cb, float:1.875343E38)
            r1.<init>(r0)
            r1.LIZJ = r5
            r0 = 48
            r1.LJIILIIL = r0
            r1.LJII = r4
            r1.LJIIIZ = r2
            r1.LJIIJ = r3
            r0 = 0
            r1.LJI = r0
            return r1
        L39:
            r0 = 1140129792(0x43f50000, float:490.0)
            int r2 = X.C15380j0.LIZ(r0)
            goto L21
        L40:
            r5 = 2131886731(0x7f12028b, float:1.940805E38)
            goto L46
        L44:
            if (r0 != 0) goto L4a
        L46:
            r4 = 5
            goto L1c
        L48:
            r0 = 1
            goto L15
        L4a:
            X.6Zf r0 = new X.6Zf
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.moderator.removeself.ModeratorHostIModerateDialog.createParams():X.BGt");
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Window window;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        ((MeasureLinearLayout) _$_findCachedViewById(R.id.ggi)).setWindowInsetsEnable(true);
        C16880lQ.LJIIJ(new ACListenerS25S0100000_5(this, 218), _$_findCachedViewById(R.id.jr6));
        ModeratorHostIModeratorListFragment MT = ((IModeratorService) CN1.LIZ(IModeratorService.class)).MT();
        if (MT != null) {
            FragmentManager childFragmentManager = getChildFragmentManager();
            C1B3 LIZ = C1B6.LIZ(childFragmentManager, childFragmentManager);
            LIZ.LJIIIIZZ(R.id.dtj, 1, MT, null);
            LIZ.LJIILJJIL();
        }
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.lv0(this, BroadcastDialogPageChannel.class, new BB8(this));
        }
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            C0P2.LIZ(window);
            window.addFlags(LiveLayoutPreloadThreadPriority.DEFAULT);
            window.setStatusBarColor(0);
            window.setNavigationBarColor(-1);
        }
    }
}
