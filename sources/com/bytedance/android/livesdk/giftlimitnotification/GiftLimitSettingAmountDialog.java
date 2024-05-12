package com.bytedance.android.livesdk.giftlimitnotification;

import X.BEA;
import X.C0P2;
import X.C16880lQ;
import X.C1B3;
import X.C1B6;
import Y.ACListenerS25S0100000_5;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.common.keyboard.MeasureLinearLayout;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class GiftLimitSettingAmountDialog extends LiveDialogFragment {
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

    /* JADX WARN: Removed duplicated region for block: B:10:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C28507BGt createParams() {
        /*
            r5 = this;
            com.bytedance.ies.sdk.datachannel.DataChannel r2 = r5.dataChannel
            r1 = 1
            if (r2 == 0) goto L42
            java.lang.Class<X.BCW> r0 = X.BCW.class
            java.lang.Object r0 = r2.kv0(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            if (r0 == 0) goto L42
            boolean r0 = r0.booleanValue()
            if (r0 != r1) goto L3e
        L15:
            r4 = 80
        L17:
            r3 = -1
            if (r0 != r1) goto L37
            r2 = -1
            r3 = -2
        L1c:
            X.BGt r1 = new X.BGt
            r0 = 2131563624(0x7f0d1468, float:1.875271E38)
            r1.<init>(r0)
            r0 = 2131887468(0x7f12056c, float:1.9409544E38)
            r1.LIZJ = r0
            r0 = 48
            r1.LJIILIIL = r0
            r1.LJII = r4
            r1.LJIIIZ = r2
            r1.LJIIJ = r3
            r0 = 0
            r1.LIZIZ = r0
            return r1
        L37:
            r0 = 1140129792(0x43f50000, float:490.0)
            int r2 = X.C15380j0.LIZ(r0)
            goto L1c
        L3e:
            if (r0 != 0) goto L44
            r4 = 5
            goto L17
        L42:
            r0 = 1
            goto L15
        L44:
            X.6Zf r0 = new X.6Zf
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.giftlimitnotification.GiftLimitSettingAmountDialog.createParams():X.BGt");
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Window window;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        ((MeasureLinearLayout) _$_findCachedViewById(R.id.ggi)).setWindowInsetsEnable(true);
        C16880lQ.LJIIJ(new ACListenerS25S0100000_5(this, 159), _$_findCachedViewById(R.id.jqp));
        BEA.LIZ.getClass();
        if (BEA.LJJII) {
            FragmentManager childFragmentManager = getChildFragmentManager();
            C1B3 LIZ = C1B6.LIZ(childFragmentManager, childFragmentManager);
            LIZ.LJIIIIZZ(R.id.dti, 1, new LiveGiftReminderAmountKeyboardFragment(), null);
            LIZ.LJIILJJIL();
        } else {
            FragmentManager childFragmentManager2 = getChildFragmentManager();
            C1B3 LIZ2 = C1B6.LIZ(childFragmentManager2, childFragmentManager2);
            LIZ2.LJIIIIZZ(R.id.dti, 1, new LiveGiftReminderAmountFragment(), null);
            LIZ2.LJIILJJIL();
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
