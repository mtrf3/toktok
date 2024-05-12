package com.bytedance.android.live.rank.impl.setting;

import X.B83;
import X.BJS;
import X.BJV;
import X.BJW;
import X.BZI;
import X.C011602u;
import X.C03880Dg;
import X.C28787BRn;
import X.C29033BaP;
import X.C29374Bfu;
import X.C51029K0z;
import X.C65300Pk0;
import X.C77437UaH;
import X.DialogC77438UaI;
import X.TTL;
import Y.IDCListenerS49S0200000_5;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.CompoundButton;
import com.bytedance.android.livesdk.rank.api.ECRankSwitchChannel;
import com.bytedance.android.livesdk.rank.api.GiftRankSwitchChannel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class PreviewRankingSettingFragmentSheet extends BaseRankSettingFragmentSheet {
    public long LLFII;
    public long LLFZ;
    public final Map<Integer, View> LLI = new LinkedHashMap();

    @Override // com.bytedance.android.live.rank.impl.setting.BaseRankSettingFragmentSheet
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LLI).clear();
    }

    @Override // com.bytedance.android.live.rank.impl.setting.BaseRankSettingFragmentSheet
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LLI;
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

    @Override // com.bytedance.android.live.rank.impl.setting.BaseRankSettingFragmentSheet, com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // com.bytedance.android.live.rank.impl.setting.BaseRankSettingFragmentSheet
    public final BJW Ml() {
        long value;
        Integer num;
        DataChannel LJIILIIL = C51029K0z.LJIILIIL(this);
        if (LJIILIIL != null && (num = (Integer) LJIILIIL.kv0(ECRankSwitchChannel.class)) != null) {
            value = num.intValue();
        } else {
            value = BJW.RANK_SWITCH_STATUS_HIDE.getValue();
        }
        this.LLFZ = value;
        BJW.Companion.getClass();
        return BJV.LIZ(value);
    }

    @Override // com.bytedance.android.live.rank.impl.setting.BaseRankSettingFragmentSheet
    public final BJW Nl() {
        long value;
        Integer num;
        DataChannel LJIILIIL = C51029K0z.LJIILIIL(this);
        if (LJIILIIL != null && (num = (Integer) LJIILIIL.kv0(GiftRankSwitchChannel.class)) != null) {
            value = num.intValue();
        } else {
            value = BJW.RANK_SWITCH_STATUS_HIDE.getValue();
        }
        this.LLFII = value;
        BJW.Companion.getClass();
        return BJV.LIZ(value);
    }

    @Override // com.bytedance.android.live.rank.impl.setting.BaseRankSettingFragmentSheet
    public final void Pl(BJW value) {
        BJW bjw;
        String str;
        o.LJIIIZ(value, "value");
        if (!((CompoundButton) _$_findCachedViewById(R.id.cko)).isChecked()) {
            bjw = BJW.RANK_SWITCH_STATUS_ON;
        } else {
            bjw = BJW.RANK_SWITCH_STATUS_OFF;
        }
        BZI LIZ = C28787BRn.LIZ("livesdk_live_sale_rankings_setting_click");
        LIZ.LJIIZILJ();
        LIZ.LJIJJ(DataChannelGlobal.LJLJJI.mv0(C29033BaP.class), "enter_from");
        if (bjw == BJW.RANK_SWITCH_STATUS_ON) {
            str = "open";
        } else {
            str = "close";
        }
        LIZ.LJIJJ(String.valueOf(((C29374Bfu) TTL.LIZJ(LIZ, str, "status")).getCurrentUserId()), "author_id");
        LIZ.LJJIIJZLJL();
        ((C011602u) _$_findCachedViewById(R.id.cko)).toggle();
        this.LLFZ = bjw.getValue();
        DataChannel LJIILIIL = C51029K0z.LJIILIIL(this);
        if (LJIILIIL != null) {
            LJIILIIL.rv0(ECRankSwitchChannel.class, Integer.valueOf((int) this.LLFZ));
        }
    }

    @Override // com.bytedance.android.live.rank.impl.setting.BaseRankSettingFragmentSheet
    public final void Ql(BJW value) {
        BJW bjw;
        o.LJIIIZ(value, "value");
        if (!((CompoundButton) _$_findCachedViewById(R.id.duo)).isChecked()) {
            bjw = BJW.RANK_SWITCH_STATUS_ON;
        } else {
            bjw = BJW.RANK_SWITCH_STATUS_OFF;
        }
        long value2 = bjw.getValue();
        BJS bjs = new BJS(this, bjw);
        if (getContext() != null && ((C29374Bfu) B83.LIZ().LIZIZ()).LIZIZ.getSecret() == 1 && value2 == BJW.RANK_SWITCH_STATUS_ON.getValue()) {
            C77437UaH c77437UaH = new C77437UaH(getContext());
            c77437UaH.LJI(R.string.mdx);
            c77437UaH.LIZIZ(R.string.nsg);
            c77437UaH.LJ(R.string.mo_, new IDCListenerS49S0200000_5(bjs, this, 12), false);
            c77437UaH.LIZJ(R.string.mdy, new IDCListenerS49S0200000_5(bjs, this, 13), false);
            c77437UaH.LJJII = false;
            DialogC77438UaI LIZ = c77437UaH.LIZ();
            if (!new C03880Dg(2).LIZJ(300000, "com/bytedance/android/livesdk/dialog/LiveModalDialog", "show", LIZ, new Object[0], "void", new C65300Pk0(false, "()V", "-5270538219137844919")).LIZ) {
                LIZ.show();
            }
            Ol("livesdk_turn_on_ranking_popup_show").LJJIIJZLJL();
            return;
        }
        bjs.LIZ();
    }

    @Override // com.bytedance.android.live.rank.impl.setting.BaseRankSettingFragmentSheet, com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        mo49getActivity();
        return onGetLayoutInflater;
    }
}
