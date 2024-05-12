package com.bytedance.android.livesdk.adminsetting.fastaddblockwords;

import X.BBT;
import X.BBW;
import X.C0P2;
import X.C16880lQ;
import X.C1B3;
import X.C28507BGt;
import X.C5H3;
import X.C78996UzQ;
import Y.ACListenerS25S0100000_5;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.common.keyboard.MeasureLinearLayout;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.dataChannel.BroadcastDialogPageChannel;
import com.bytedance.android.livesdk.dataChannel.DismissSettingDialogEvent;
import com.bytedance.android.livesdk.dataChannel.LiveEndDismissDialogEvent;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS155S0100000_5;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class LiveFastAddBlockKeywordsDialog extends LiveDialogFragment {
    public List<String> LJLJI;
    public final Map<Integer, View> LJLJJI = new LinkedHashMap();
    public final C5H3 LJLIL = C78996UzQ.LJJIJIIJI(BBW.LJLIL);
    public final C5H3 LJLILLLLZI = C78996UzQ.LJJIJIIJI(new AqS155S0100000_5(this, 104));

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJJI).clear();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJJI;
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
        C28507BGt c28507BGt = new C28507BGt(R.layout.cy8);
        c28507BGt.LIZJ = R.style.ab1;
        c28507BGt.LIZIZ = 0;
        c28507BGt.LJIILIIL = 18;
        c28507BGt.LJII = 80;
        c28507BGt.LJIIIZ = -1;
        c28507BGt.LJIIJ = -2;
        return c28507BGt;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment
    public final void dismiss() {
        Object obj;
        InputMethodManager inputMethodManager;
        Context context = getContext();
        IBinder iBinder = null;
        if (context != null) {
            obj = C16880lQ.LLILL(context, "input_method");
        } else {
            obj = null;
        }
        if ((obj instanceof InputMethodManager) && (inputMethodManager = (InputMethodManager) obj) != null) {
            View view = getView();
            if (view != null) {
                iBinder = view.getWindowToken();
            }
            inputMethodManager.hideSoftInputFromWindow(iBinder, 0);
        }
        super.dismiss();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        ArrayList<String> stringArrayList;
        Window window;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments == null || (stringArrayList = arguments.getStringArrayList("key_block_keywords_list")) == null) {
            return;
        }
        this.LJLJI = stringArrayList;
        ((MeasureLinearLayout) _$_findCachedViewById(R.id.ggi)).setWindowInsetsEnable(true);
        C16880lQ.LJIIJ(new ACListenerS25S0100000_5(this, 84), _$_findCachedViewById(R.id.nb4));
        FragmentManager childFragmentManager = getChildFragmentManager();
        childFragmentManager.getClass();
        C1B3 c1b3 = new C1B3(childFragmentManager);
        c1b3.LJIIIIZZ(R.id.bs8, 1, (Fragment) this.LJLILLLLZI.getValue(), null);
        c1b3.LJIILJJIL();
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.lv0(this, LiveEndDismissDialogEvent.class, new AqS171S0100000_5(this, 125));
        }
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null) {
            dataChannel2.lv0(this, BroadcastDialogPageChannel.class, new BBT(this));
            dataChannel2.lv0(this, DismissSettingDialogEvent.class, new AqS171S0100000_5(this, 126));
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
