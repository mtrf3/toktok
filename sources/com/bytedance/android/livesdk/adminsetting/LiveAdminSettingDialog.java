package com.bytedance.android.livesdk.adminsetting;

import X.BBF;
import X.BBO;
import X.BBP;
import X.BBZ;
import X.BZI;
import X.C0P2;
import X.C162476Zf;
import X.C16880lQ;
import X.C1B3;
import X.C1B6;
import X.C278817o;
import X.C28358BBa;
import X.C28359BBb;
import X.C28360BBc;
import X.C28361BBd;
import X.C28362BBe;
import X.C28363BBf;
import X.C28507BGt;
import X.C28787BRn;
import X.C51029K0z;
import X.C55002Dw;
import X.C5H3;
import X.C78996UzQ;
import X.CN1;
import X.InterfaceC28236B6i;
import Y.ACListenerS25S0100000_5;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.broadcast.api.BroadcastEndShowEvent;
import com.bytedance.android.live.common.keyboard.MeasureLinearLayout;
import com.bytedance.android.live.gift.IGiftReminderService;
import com.bytedance.android.live.room.LiveEndEvent;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.dataChannel.BroadcastDialogPageChannel;
import com.bytedance.android.livesdk.dataChannel.RefreshMoreRedDotEvent;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.bytedance.android.livesdk.moderator.ModeratorPermissionEditFragment;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS155S0100000_5;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class LiveAdminSettingDialog extends LiveDialogFragment implements InterfaceC28236B6i {
    public static final /* synthetic */ int LJLLL = 0;
    public String LJLIL;
    public final Map<Integer, View> LJLLJ = new LinkedHashMap();
    public final C5H3 LJLILLLLZI = C78996UzQ.LJJIJIIJI(C28363BBf.LJLIL);
    public final C5H3 LJLJI = C78996UzQ.LJJIJIIJI(C28362BBe.LJLIL);
    public final C5H3 LJLJJI = C78996UzQ.LJJIJIIJI(C28361BBd.LJLIL);
    public final C5H3 LJLJJL = C78996UzQ.LJJIJIIJI(C28358BBa.LJLIL);
    public final C5H3 LJLJJLL = C78996UzQ.LJJIJIIJI(BBZ.LJLIL);
    public final C5H3 LJLJL = C78996UzQ.LJJIJIIJI(new AqS155S0100000_5(this, 80));
    public final C5H3 LJLJLJ = C78996UzQ.LJJIJIIJI(new AqS155S0100000_5(this, 78));
    public final C5H3 LJLJLLL = C78996UzQ.LJJIJIIJI(C28359BBb.LJLIL);
    public final C5H3 LJLL = C78996UzQ.LJJIJIIJI(new AqS155S0100000_5(this, 79));
    public final C5H3 LJLLI = C78996UzQ.LJJIJIIJI(new AqS155S0100000_5(this, 81));
    public final Fragment LJLLILLLL = ((IGiftReminderService) CN1.LIZ(IGiftReminderService.class)).Kx(1);

    static {
        new C28360BBc();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLLJ).clear();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLLJ;
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

    public final boolean wg0() {
        return ((Boolean) this.LJLL.getValue()).booleanValue();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C28507BGt createParams() {
        Object obj;
        int i;
        int i2;
        int LIZ;
        Bundle arguments = getArguments();
        if (arguments == null || (obj = C16880lQ.LLJJIII(arguments, "argument_dim")) == null) {
            obj = Boolean.FALSE;
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        if (wg0()) {
            if (booleanValue) {
                i = R.style.ab2;
            } else {
                i = R.style.ab1;
            }
        } else {
            i = R.style.ab3;
        }
        boolean wg0 = wg0();
        if (wg0) {
            i2 = 80;
        } else if (!wg0) {
            i2 = 5;
        } else {
            throw new C162476Zf();
        }
        boolean wg02 = wg0();
        int i3 = -1;
        if (wg02) {
            LIZ = -1;
        } else if (!wg02) {
            LIZ = C278817o.LIZ(490.0f);
        } else {
            throw new C162476Zf();
        }
        boolean wg03 = wg0();
        if (wg03) {
            i3 = -2;
        } else if (wg03) {
            throw new C162476Zf();
        }
        C28507BGt c28507BGt = new C28507BGt(R.layout.cyj);
        c28507BGt.LIZIZ = 0;
        c28507BGt.LIZJ = i;
        c28507BGt.LJIILIIL = 18;
        c28507BGt.LJII = i2;
        c28507BGt.LJIIIZ = LIZ;
        c28507BGt.LJIIJ = i3;
        return c28507BGt;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment
    public final void dismiss() {
        Object obj;
        InputMethodManager inputMethodManager;
        DataChannel LJIILIIL = C51029K0z.LJIILIIL(this);
        if (LJIILIIL != null) {
            LJIILIIL.pv0(RefreshMoreRedDotEvent.class);
        }
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

    @Override // X.InterfaceC28236B6i
    public final DataChannel provideDataChannel() {
        return this.dataChannel;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        this.dataChannel = (DataChannel) DataChannelGlobal.LJLJJI.mv0(C55002Dw.class);
        super.onCreate(bundle);
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.lv0(this, BroadcastEndShowEvent.class, new AqS171S0100000_5(this, 106));
            dataChannel.lv0(this, LiveEndEvent.class, new AqS171S0100000_5(this, 107));
        }
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        mo49getActivity();
        o.LJIIIIZZ(onGetLayoutInflater, "getLayoutInflater(\n     …      activity,\n        )");
        return onGetLayoutInflater;
    }

    public final Fragment vl(BBP bbp) {
        switch (BBO.LIZ[bbp.ordinal()]) {
            case 1:
                return (Fragment) this.LJLILLLLZI.getValue();
            case 2:
                return (Fragment) this.LJLJL.getValue();
            case 3:
                return (Fragment) this.LJLJJI.getValue();
            case 4:
                return (Fragment) this.LJLJJL.getValue();
            case 5:
                return (Fragment) this.LJLJJLL.getValue();
            case 6:
                return (Fragment) this.LJLJLLL.getValue();
            case 7:
                return (Fragment) this.LJLJLJ.getValue();
            case 8:
                LiveManageListFragment liveManageListFragment = (LiveManageListFragment) this.LJLJI.getValue();
                liveManageListFragment.LJLJJI = 2;
                return liveManageListFragment;
            case 9:
                LiveManageListFragment liveManageListFragment2 = (LiveManageListFragment) this.LJLJI.getValue();
                liveManageListFragment2.LJLJJI = 3;
                return liveManageListFragment2;
            case 10:
                return (Fragment) this.LJLLI.getValue();
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                return this.LJLLILLLL;
            case 12:
                return new ModeratorPermissionEditFragment();
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                dismiss();
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
        DataChannel dataChannel;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        ((MeasureLinearLayout) _$_findCachedViewById(R.id.ggi)).setWindowInsetsEnable(true);
        C16880lQ.LJIIJ(new ACListenerS25S0100000_5(this, 43), _$_findCachedViewById(R.id.jr6));
        Bundle arguments = getArguments();
        if (arguments != null) {
            str = arguments.getString("argument_entrance");
        } else {
            str = null;
        }
        this.LJLIL = str;
        Bundle arguments2 = getArguments();
        if (arguments2 == null || (obj = C16880lQ.LLJJIII(arguments2, "argument_initial_page")) == null) {
            obj = BBP.GUIDE;
        }
        if (!(obj instanceof BBP) || (bbp = (BBP) obj) == null) {
            return;
        }
        FragmentManager childFragmentManager = getChildFragmentManager();
        C1B3 LIZ = C1B6.LIZ(childFragmentManager, childFragmentManager);
        Fragment vl = vl(bbp);
        if (vl == null) {
            return;
        }
        LIZ.LJIIIIZZ(R.id.xl, 1, vl, null);
        LIZ.LJIILJJIL();
        if (isAdded() && (dataChannel = this.dataChannel) != null) {
            dataChannel.lv0(this, BroadcastDialogPageChannel.class, new BBF(this));
        }
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            C0P2.LIZ(window);
            window.addFlags(LiveLayoutPreloadThreadPriority.DEFAULT);
            window.setStatusBarColor(0);
            window.setNavigationBarColor(-1);
        }
        BZI LIZ2 = C28787BRn.LIZ("livesdk_anchor_moderator_icon");
        LIZ2.LJIILLIIL(C51029K0z.LJIILIIL(this));
        LIZ2.LJIIJJI("live_take_detail");
        LIZ2.LJIJJ("show", "action_type");
        LIZ2.LJJIIJZLJL();
        BZI LIZ3 = C28787BRn.LIZ("livesdk_live_rankings_settings_show");
        LIZ3.LJIILLIIL(C51029K0z.LJIILIIL(this));
        LIZ3.LJIIJJI("live_take_detail");
        LIZ3.LJJIIJZLJL();
        BZI LIZ4 = C28787BRn.LIZ("livesdk_anchor_comment_settings_show");
        LIZ4.LJIILLIIL(C51029K0z.LJIILIIL(this));
        LIZ4.LJIIJJI("live_take_detail");
        LIZ4.LJJIIJZLJL();
    }
}
