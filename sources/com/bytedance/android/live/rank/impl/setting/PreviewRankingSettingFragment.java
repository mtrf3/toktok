package com.bytedance.android.live.rank.impl.setting;

import X.B83;
import X.BEE;
import X.BJV;
import X.BJW;
import X.BJX;
import X.BZI;
import X.C011602u;
import X.C03880Dg;
import X.C16880lQ;
import X.C28787BRn;
import X.C29033BaP;
import X.C29374Bfu;
import X.C41081jM;
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
import com.bytedance.android.livesdk.rank.api.GameRankSwitchChannel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class PreviewRankingSettingFragment extends BaseRankSettingFragment {
    public long LJLJJL;
    public long LJLJJLL;
    public long LJLJL;
    public final Map<Integer, View> LJLJLJ = new LinkedHashMap();

    @Override // com.bytedance.android.live.rank.impl.setting.BaseRankSettingFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJLJ).clear();
    }

    @Override // com.bytedance.android.live.rank.impl.setting.BaseRankSettingFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJLJ;
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

    @Override // com.bytedance.android.live.rank.impl.setting.BaseRankSettingFragment, com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // com.bytedance.android.live.rank.impl.setting.BaseRankSettingFragment
    public final BJW vl() {
        BJV bjv = BJW.Companion;
        long j = this.LJLJJLL;
        bjv.getClass();
        return BJV.LIZ(j);
    }

    @Override // com.bytedance.android.live.rank.impl.setting.BaseRankSettingFragment
    public final BJW wl() {
        BJV bjv = BJW.Companion;
        long j = this.LJLJL;
        bjv.getClass();
        return BJV.LIZ(j);
    }

    @Override // com.bytedance.android.live.rank.impl.setting.BaseRankSettingFragment
    public final BJW xl() {
        BJV bjv = BJW.Companion;
        long j = this.LJLJJL;
        bjv.getClass();
        return BJV.LIZ(j);
    }

    @Override // com.bytedance.android.live.rank.impl.setting.BaseRankSettingFragment
    public final void Dl(BJW value) {
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
        this.LJLJJLL = bjw.getValue();
        DataChannel LJIILIIL = C51029K0z.LJIILIIL(this);
        if (LJIILIIL != null) {
            LJIILIIL.rv0(ECRankSwitchChannel.class, Integer.valueOf((int) this.LJLJJLL));
        }
    }

    @Override // com.bytedance.android.live.rank.impl.setting.BaseRankSettingFragment
    public final void Gl(BJW value) {
        BJW bjw;
        o.LJIIIZ(value, "value");
        if (!((CompoundButton) _$_findCachedViewById(R.id.dqr)).isChecked()) {
            bjw = BJW.RANK_SWITCH_STATUS_ON;
        } else {
            bjw = BJW.RANK_SWITCH_STATUS_OFF;
        }
        ((C011602u) _$_findCachedViewById(R.id.dqr)).toggle();
        this.LJLJL = bjw.getValue();
        DataChannel LJIILIIL = C51029K0z.LJIILIIL(this);
        if (LJIILIIL != null) {
            LJIILIIL.rv0(GameRankSwitchChannel.class, Integer.valueOf((int) this.LJLJL));
        }
    }

    @Override // com.bytedance.android.live.rank.impl.setting.BaseRankSettingFragment
    public final void Hl(BJW value) {
        BJW bjw;
        o.LJIIIZ(value, "value");
        if (!((CompoundButton) _$_findCachedViewById(R.id.duo)).isChecked()) {
            bjw = BJW.RANK_SWITCH_STATUS_ON;
        } else {
            bjw = BJW.RANK_SWITCH_STATUS_OFF;
        }
        long value2 = bjw.getValue();
        BJX bjx = new BJX(this, bjw);
        if (getContext() != null && ((C29374Bfu) B83.LIZ().LIZIZ()).LIZIZ.getSecret() == 1 && value2 == BJW.RANK_SWITCH_STATUS_ON.getValue()) {
            C77437UaH c77437UaH = new C77437UaH(getContext());
            c77437UaH.LJI(R.string.mdx);
            c77437UaH.LIZIZ(R.string.nsg);
            c77437UaH.LJ(R.string.mo_, new IDCListenerS49S0200000_5(bjx, this, 10), false);
            c77437UaH.LIZJ(R.string.mdy, new IDCListenerS49S0200000_5(bjx, this, 11), false);
            c77437UaH.LJJII = false;
            DialogC77438UaI LIZ = c77437UaH.LIZ();
            if (!new C03880Dg(2).LIZJ(300000, "com/bytedance/android/livesdk/dialog/LiveModalDialog", "show", LIZ, new Object[0], "void", new C65300Pk0(false, "()V", "-3038481016481753674")).LIZ) {
                LIZ.show();
            }
            Al("livesdk_turn_on_ranking_popup_show").LJJIIJZLJL();
            return;
        }
        bjx.LIZ();
    }

    @Override // com.bytedance.android.live.rank.impl.setting.BaseRankSettingFragment, com.bytedance.android.livesdk.ui.BaseFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        mo49getActivity();
        return onGetLayoutInflater;
    }

    @Override // com.bytedance.android.live.rank.impl.setting.BaseRankSettingFragment, com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        C16880lQ.LJJIIZI((C41081jM) _$_findCachedViewById(R.id.aeg), new BEE(this));
    }
}
