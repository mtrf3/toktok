package com.bytedance.android.livesdk.giftlimitnotification;

import X.ActivityC45651qj;
import X.BE1;
import X.BEA;
import X.BZI;
import X.C011602u;
import X.C10A;
import X.C141335gf;
import X.C15380j0;
import X.C15490jB;
import X.C16880lQ;
import X.C28787BRn;
import X.C29306Beo;
import X.C29494Bhq;
import X.C29S;
import X.C30868C9o;
import X.C3C5;
import X.C41071jL;
import X.C51029K0z;
import X.C76800UCe;
import X.C90903hW;
import X.CFX;
import Y.ACListenerS25S0100000_5;
import Y.AObserverS73S0100000_5;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftLimitNotificationFaqUrlSetting;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class LiveGiftReminderFragment extends BaseFragment {
    public int LJLIL;
    public int LJLILLLLZI;
    public final Map<Integer, View> LJLJJI = new LinkedHashMap();
    public String LJLJI = "";

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

    public final void vl() {
        FragmentManager fragmentManager;
        BEA.LIZ.getClass();
        if (!BEA.LJJIIJ) {
            GiftLimitSettingAmountDialog giftLimitSettingAmountDialog = new GiftLimitSettingAmountDialog();
            DataChannel LJIILIIL = C51029K0z.LJIILIIL(this);
            if (LJIILIIL != null && (fragmentManager = (FragmentManager) LJIILIIL.kv0(C29494Bhq.class)) != null) {
                giftLimitSettingAmountDialog.show(fragmentManager, "GiftLimitSettingAmountDialog");
                return;
            }
            return;
        }
        C30868C9o.LJI(C15380j0.LJIILJJIL(R.string.lnk));
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ((LinkedHashMap) this.LJLJJI).clear();
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        mo49getActivity();
        o.LJIIIIZZ(onGetLayoutInflater, "getLayoutInflater(\n     …      activity,\n        )");
        return onGetLayoutInflater;
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        boolean z;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        C011602u c011602u = (C011602u) _$_findCachedViewById(R.id.dux);
        BEA.LIZ.getClass();
        MutableLiveData<Integer> mutableLiveData = BEA.LJJIIJZLJL;
        Integer value = mutableLiveData.getValue();
        int i = 0;
        if (value == null || value.intValue() != 1) {
            z = false;
        } else {
            z = true;
        }
        c011602u.setChecked(z);
        View _$_findCachedViewById = _$_findCachedViewById(R.id.jqk);
        if (!((CompoundButton) _$_findCachedViewById(R.id.dux)).isChecked()) {
            i = 8;
        }
        _$_findCachedViewById.setVisibility(i);
        C15490jB.LJ(_$_findCachedViewById(R.id.ivc), CFX.LIZ("tiktok_live_interaction_resource", "tiktok_live_revenue_demand_1"), "ttlive_gift_limit_notification.png");
        C15490jB.LJ(_$_findCachedViewById(R.id.dtf), CFX.LIZ("tiktok_live_interaction_resource", "tiktok_live_revenue_demand_1"), "ttlive_gift_limit_error_refresh.png");
        this.LJLJI = LiveGiftLimitNotificationFaqUrlSetting.INSTANCE.getValue();
        C16880lQ.LJJIIJZLJL((C41071jL) _$_findCachedViewById(R.id.dux), new ACListenerS25S0100000_5(this, 310));
        _$_findCachedViewById(R.id.dux).setOnTouchListener(BE1.LJLIL);
        FrameLayout frameLayout = (FrameLayout) _$_findCachedViewById(R.id.aeg);
        int i2 = this.LJLIL;
        if (i2 != 0) {
            if (i2 == 1) {
                C29306Beo.LJJLJLI(frameLayout);
                C16880lQ.LJIILJJIL(frameLayout, new ACListenerS25S0100000_5(this, 311));
            }
        } else {
            frameLayout.setVisibility(4);
        }
        C16880lQ.LJIIZILJ((LinearLayout) _$_findCachedViewById(R.id.jqk), new ACListenerS25S0100000_5(this, 312));
        C16880lQ.LJIILJJIL((FrameLayout) _$_findCachedViewById(R.id.d4s), new ACListenerS25S0100000_5(this, 313));
        mutableLiveData.observe(this, new AObserverS73S0100000_5(this, 41));
        BEA.LJJ.observe(this, new AObserverS73S0100000_5(this, 42));
        BEA.LJJIIZ.observe(this, new AObserverS73S0100000_5(this, 43));
        boolean LJ = BEA.LJ();
        String firstPanelFrom = BEA.LJJIIZI;
        o.LJIIIZ(firstPanelFrom, "firstPanelFrom");
        BZI LIZ = C28787BRn.LIZ("livesdk_gift_limit_notification_panel_show");
        LIZ.LJIJJ(Integer.valueOf(LJ ? 1 : 0), "is_anchor");
        LIZ.LJIJJ(firstPanelFrom, "first_panel_from");
        LIZ.LJIIZILJ();
        LIZ.LJJIIJZLJL();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        C29S c29s;
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.d62, viewGroup, false);
        if (this.LJLIL == 0) {
            this.LJLILLLLZI = 359;
        } else {
            this.LJLILLLLZI = 440;
        }
        LLLLIILL.setLayoutParams(new ViewGroup.LayoutParams(-1, C15380j0.LIZ(this.LJLILLLLZI)));
        try {
            ViewTreeLifecycleOwner.set(LLLLIILL, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(LLLLIILL, this);
            C10A.LIZIZ(LLLLIILL, this);
            ActivityC45651qj mo49getActivity = mo49getActivity();
            if (mo49getActivity instanceof C29S) {
                c29s = (C29S) mo49getActivity;
            } else {
                c29s = null;
            }
            C90903hW.LIZ(c29s);
            C3C5.m7constructorimpl(C76800UCe.LIZ);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
        return LLLLIILL;
    }
}
