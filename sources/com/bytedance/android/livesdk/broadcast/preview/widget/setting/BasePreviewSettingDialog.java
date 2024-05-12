package com.bytedance.android.livesdk.broadcast.preview.widget.setting;

import X.BBG;
import X.BBH;
import X.BBI;
import X.BBJ;
import X.BBK;
import X.BBL;
import X.BBN;
import X.BBP;
import X.C0P2;
import X.C10A;
import X.C16880lQ;
import X.C1B3;
import X.C1B6;
import X.C28507BGt;
import X.C51029K0z;
import X.C5H3;
import X.C78996UzQ;
import X.C7N;
import X.CN1;
import Y.ACListenerS25S0100000_5;
import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.live.DismissPreviewSettingDialogEvent;
import com.bytedance.android.live.broadcast.BroadcastSettingResponse;
import com.bytedance.android.live.broadcast.api.BroadcastSettingResponseChannel;
import com.bytedance.android.live.common.keyboard.MeasureLinearLayout;
import com.bytedance.android.livesdk.broadcast.preview.base.BasePreviewDialogFragment;
import com.bytedance.android.livesdk.dataChannel.BroadcastDialogPageChannel;
import com.bytedance.android.livesdk.dataChannel.DismissSettingDialogEvent;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.bytedance.android.livesdk.rank.api.IRankService;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS155S0100000_5;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class BasePreviewSettingDialog extends BasePreviewDialogFragment {
    public BaseFragment LJLL;
    public String LJLLI;
    public final Map<Integer, View> LJLLILLLL = new LinkedHashMap();
    public final C5H3 LJLILLLLZI = C78996UzQ.LJJIJIIJI(BBJ.LJLIL);
    public final C5H3 LJLJI = C78996UzQ.LJJIJIIJI(new AqS155S0100000_5(this, 145));
    public final C5H3 LJLJJI = C78996UzQ.LJJIJIIJI(BBL.LJLIL);
    public final C5H3 LJLJJL = C78996UzQ.LJJIJIIJI(BBH.LJLIL);
    public final C5H3 LJLJJLL = C78996UzQ.LJJIJIIJI(BBK.LJLIL);
    public final C5H3 LJLJL = C78996UzQ.LJJIJIIJI(new AqS155S0100000_5(this, 143));
    public final C5H3 LJLJLJ = C78996UzQ.LJJIJIIJI(BBI.LJLIL);
    public final C5H3 LJLJLLL = C78996UzQ.LJJIJIIJI(new AqS155S0100000_5(this, 144));

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.BasePreviewDialogFragment, com.bytedance.android.livesdk.LiveDialogFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLLILLLL).clear();
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.BasePreviewDialogFragment, com.bytedance.android.livesdk.LiveDialogFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLLILLLL;
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

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.BasePreviewDialogFragment, com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C28507BGt createParams() {
        C28507BGt c28507BGt = new C28507BGt(R.layout.cvy);
        c28507BGt.LIZJ = R.style.aaq;
        c28507BGt.LJIIL = new ColorDrawable(0);
        c28507BGt.LJII = 80;
        c28507BGt.LJI = 0.0f;
        c28507BGt.LJIILIIL = 19;
        c28507BGt.LJIIJ = -1;
        return c28507BGt;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        Window window;
        View decorView;
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null && (decorView = window.getDecorView()) != null) {
            ViewTreeLifecycleOwner.set(decorView, this);
            ViewTreeViewModelStoreOwner.set(decorView, this);
            C10A.LIZIZ(decorView, this);
        }
    }

    public final Fragment vl(BBP bbp) {
        BroadcastSettingResponse broadcastSettingResponse;
        switch (BBN.LIZ[bbp.ordinal()]) {
            case 1:
                return (Fragment) this.LJLILLLLZI.getValue();
            case 2:
                return (Fragment) this.LJLJI.getValue();
            case 3:
                return (Fragment) this.LJLJJI.getValue();
            case 4:
                return (Fragment) this.LJLJJL.getValue();
            case 5:
                return C7N.LJIILLIIL().FF(this.LJLLI);
            case 6:
                return (Fragment) this.LJLJL.getValue();
            case 7:
                return (Fragment) this.LJLJLJ.getValue();
            case 8:
                return (Fragment) this.LJLJLLL.getValue();
            case 9:
                return C7N.LJIILLIIL().Z50();
            case 10:
                return (Fragment) this.LJLJJLL.getValue();
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                BaseFragment baseFragment = this.LJLL;
                if (baseFragment != null) {
                    return baseFragment;
                }
                DataChannel LJIILIIL = C51029K0z.LJIILIIL(this);
                if (LJIILIIL != null && (broadcastSettingResponse = (BroadcastSettingResponse) LJIILIIL.kv0(BroadcastSettingResponseChannel.class)) != null) {
                    this.LJLL = ((IRankService) CN1.LIZ(IRankService.class)).wq(0, broadcastSettingResponse.giftRankSwitchStatus, broadcastSettingResponse.ecRankSwitchStatus);
                }
                return this.LJLL;
            default:
                return null;
        }
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        Object obj;
        BBP bbp;
        Window window;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        ((MeasureLinearLayout) _$_findCachedViewById(R.id.ggi)).setWindowInsetsEnable(true);
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            C0P2.LIZ(window);
            window.addFlags(LiveLayoutPreloadThreadPriority.DEFAULT);
            window.setStatusBarColor(0);
            window.setNavigationBarColor(-1);
        }
        C16880lQ.LJIIJ(new ACListenerS25S0100000_5(this, 112), _$_findCachedViewById(R.id.hej));
        Bundle arguments = getArguments();
        if (arguments != null) {
            str = arguments.getString("argument_entrance");
        } else {
            str = null;
        }
        this.LJLLI = str;
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            obj = C16880lQ.LLJJIII(arguments2, "argument_initial_page");
        } else {
            obj = null;
        }
        if (!(obj instanceof BBP) || (bbp = (BBP) obj) == null) {
            bbp = BBP.GUIDE;
        }
        FragmentManager childFragmentManager = getChildFragmentManager();
        C1B3 LIZ = C1B6.LIZ(childFragmentManager, childFragmentManager);
        Fragment vl = vl(bbp);
        if (vl == null) {
            return;
        }
        LIZ.LJIIIIZZ(R.id.dm7, 1, vl, null);
        LIZ.LJIILJJIL();
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.lv0(this, BroadcastDialogPageChannel.class, new BBG(this));
            dataChannel.lv0(this, DismissPreviewSettingDialogEvent.class, new AqS171S0100000_5(this, 221));
            dataChannel.lv0(this, DismissSettingDialogEvent.class, new AqS171S0100000_5(this, 222));
        }
    }
}
