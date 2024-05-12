package com.bytedance.android.livesdk.rank.impl;

import X.B7I;
import X.BTJ;
import X.C01R;
import X.C05630Jz;
import X.C0K2;
import X.C0TL;
import X.C1EW;
import X.C28571BJf;
import X.C28652BMi;
import X.C29162BcU;
import X.C29401Dk;
import X.C29504Bi0;
import X.C29684Bku;
import X.C37946Eus;
import X.C72972SkS;
import X.CYY;
import X.CYZ;
import X.CZB;
import X.EnumC31514CYk;
import X.InterfaceC29505Bi1;
import X.InterfaceC31506CYc;
import X.Q7L;
import Y.AfS18S0001000_6;
import Y.AfS36S0101000_5;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.rank.impl.entrance.widget.RankEntranceWidget;
import com.bytedance.android.live.rank.impl.setting.AnchorRankingSettingFragment;
import com.bytedance.android.live.rank.impl.setting.BaseRankSettingFragment;
import com.bytedance.android.live.rank.impl.setting.NewRankSettingDialog;
import com.bytedance.android.live.rank.impl.setting.PreviewRankingSettingFragment;
import com.bytedance.android.live.rank.impl.setting.PreviewRankingSettingFragmentSheet;
import com.bytedance.android.livesdk.livesetting.gift.LiveAnchorGiftDisableSetting;
import com.bytedance.android.livesdk.model.BorderInfo;
import com.bytedance.android.livesdk.rank.api.IRankService;
import com.bytedance.android.livesdk.rank.impl.api.RankApi;
import com.bytedance.android.livesdk.rank.impl.widget.OnlineAudienceRankLandScapeWidget;
import com.bytedance.android.livesdk.rank.impl.widget.OnlineAudienceRankWidget;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.Layer2PriorityManager;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.zhiliaoapp.musically.R;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class RankService implements IRankService, InterfaceC29505Bi1 {
    @Override // X.InterfaceC06390Mx
    public final /* synthetic */ void onInit() {
    }

    @Override // com.bytedance.android.livesdk.rank.api.IRankService
    public final void W0() {
        RankApi rankApi = (RankApi) Q7L.LIZIZ(RankApi.class);
        rankApi.queryRankEntrancesV3(0L, 0L);
        rankApi.getOnlineRankList(0L, 0L, 0, false);
        rankApi.getRankListV2(0L, 0L, "", 0, 0L, false, 0);
    }

    @Override // com.bytedance.android.livesdk.rank.api.IRankService
    public final NewRankSettingDialog Xe0() {
        Bundle LIZ = C01R.LIZ("is_from_lynx_audience_list", true);
        NewRankSettingDialog newRankSettingDialog = new NewRankSettingDialog();
        newRankSettingDialog.setArguments(LIZ);
        return newRankSettingDialog;
    }

    @Override // com.bytedance.android.livesdk.rank.api.IRankService
    public final int dK() {
        return (int) C28652BMi.LIZLLL;
    }

    @Override // com.bytedance.android.livesdk.rank.api.IRankService
    public final C28571BJf fp0() {
        return new C28571BJf();
    }

    @Override // com.bytedance.android.livesdk.rank.api.IRankService
    public final void onPlayFragmentCreate() {
        CZB.LIZ.getClass();
        CZB.LIZLLL(R.layout.dhz, 2, 0);
    }

    @Override // com.bytedance.android.livesdk.rank.api.IRankService
    public final void yE() {
        if (CYZ.LJFF == 0) {
            CYZ.LJFF = System.currentTimeMillis();
        }
    }

    public RankService() {
        C29504Bi0.LIZ = this;
        C29162BcU c29162BcU = C29162BcU.LIZJ;
        if (c29162BcU.LIZIZ == null) {
            c29162BcU.LIZIZ = new B7I();
        }
    }

    @Override // com.bytedance.android.livesdk.rank.api.IRankService
    public final Class<? extends LiveRecyclableWidget> B40() {
        return RankEntranceWidget.class;
    }

    @Override // com.bytedance.android.livesdk.rank.api.IRankService
    public final int xh0() {
        return C28652BMi.LIZJ;
    }

    public final boolean LIZ(BorderInfo borderInfo) {
        if (!TextUtils.equals(borderInfo.source, "hourly_rank") && !TextUtils.equals(borderInfo.source, "weekly_rank") && !TextUtils.equals(borderInfo.source, "weekly_rising") && !TextUtils.equals(borderInfo.source, "daily_rank")) {
            return true;
        }
        return !LiveAnchorGiftDisableSetting.INSTANCE.getValue();
    }

    @Override // com.bytedance.android.livesdk.rank.api.IRankService
    public final Class<? extends LiveRecyclableWidget> kj(boolean z) {
        if (z) {
            return OnlineAudienceRankWidget.class;
        }
        return OnlineAudienceRankLandScapeWidget.class;
    }

    @Override // com.bytedance.android.livesdk.rank.api.IRankService
    public final C37946Eus Co0(Context context, DataChannel dataChannel) {
        return new C37946Eus(context, dataChannel);
    }

    @Override // com.bytedance.android.livesdk.rank.api.IRankService
    public final PreviewRankingSettingFragmentSheet JY(int i, int i2) {
        PreviewRankingSettingFragmentSheet previewRankingSettingFragmentSheet = new PreviewRankingSettingFragmentSheet();
        previewRankingSettingFragmentSheet.LLFII = i;
        previewRankingSettingFragmentSheet.LLFZ = i2;
        return previewRankingSettingFragmentSheet;
    }

    @Override // com.bytedance.android.livesdk.rank.api.IRankService
    public final void uh(long j, long j2) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        JSONObject jSONObject4 = new JSONObject();
        C05630Jz.LJI(jSONObject, "current_entrance_rank_type", "");
        C05630Jz.LIZ(EnumC31514CYk.DEFAULT.getType(), "group_type", jSONObject);
        CYZ.LIZ(j, j2, jSONObject3);
        if (CYZ.LJI == 0) {
            CYZ.LJI = System.currentTimeMillis();
            C05630Jz.LJI(jSONObject, "event_name", "event_request");
            C05630Jz.LJFF(jSONObject2, "event_duration", CYZ.LJI - CYZ.LJFF);
            C05630Jz.LJFF(jSONObject3, "event_duration", CYZ.LJI - CYZ.LJFF);
            C05630Jz.LJI(jSONObject3, "data_source", "components");
            C05630Jz.LJI(jSONObject4, "extra", "extra");
            C0K2.LJI("ttlive_ranklist_entrance_show", jSONObject, jSONObject2, jSONObject4);
        }
    }

    @Override // com.bytedance.android.livesdk.rank.api.IRankService
    public final void vy(long j, long j2, Throwable th) {
        String message;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        JSONObject jSONObject4 = new JSONObject();
        String str = "";
        C05630Jz.LJI(jSONObject, "current_entrance_rank_type", "");
        C05630Jz.LIZ(EnumC31514CYk.DEFAULT.getType(), "group_type", jSONObject);
        CYZ.LIZ(j, j2, jSONObject3);
        if (CYZ.LJI == 0) {
            long currentTimeMillis = System.currentTimeMillis();
            CYZ.LJI = currentTimeMillis;
            C05630Jz.LJFF(jSONObject2, "event_duration", currentTimeMillis - CYZ.LJFF);
            C05630Jz.LJFF(jSONObject3, "event_duration", CYZ.LJI - CYZ.LJFF);
            C05630Jz.LJI(jSONObject3, "data_source", "components");
            if (th instanceof C29401Dk) {
                C05630Jz.LJI(jSONObject3, "error_type", "api_error");
                C29401Dk c29401Dk = (C29401Dk) th;
                C05630Jz.LIZ(c29401Dk.getErrorCode(), "error_code", jSONObject3);
                String errorMsg = c29401Dk.getErrorMsg();
                if (errorMsg != null) {
                    str = errorMsg;
                }
                C05630Jz.LJI(jSONObject3, "error_msg", str);
            } else if (th instanceof C0TL) {
                C05630Jz.LJI(jSONObject3, "error_type", "net_error");
                C0TL c0tl = (C0TL) th;
                C05630Jz.LIZ(c0tl.getCronetError(), "error_code", jSONObject3);
                String message2 = c0tl.getMessage();
                if (message2 != null) {
                    str = message2;
                }
                C05630Jz.LJI(jSONObject3, "error_msg", str);
            } else {
                C05630Jz.LJI(jSONObject3, "error_type", "unknown_error");
                C05630Jz.LIZ(-1, "error_code", jSONObject3);
                if (th != null && (message = th.getMessage()) != null) {
                    str = message;
                }
                C05630Jz.LJI(jSONObject3, "error_msg", str);
            }
            C05630Jz.LIZJ("extra", jSONObject4, jSONObject3);
            C0K2.LJI("ttlive_ranklist_entrance_show", jSONObject, jSONObject2, jSONObject4);
        }
    }

    @Override // com.bytedance.android.livesdk.rank.api.IRankService
    public final BaseRankSettingFragment wq(int i, int i2, int i3) {
        if (i != 0) {
            if (i != 1) {
                return null;
            }
            return new AnchorRankingSettingFragment();
        }
        PreviewRankingSettingFragment previewRankingSettingFragment = new PreviewRankingSettingFragment();
        previewRankingSettingFragment.LJLJJL = i2;
        previewRankingSettingFragment.LJLJJLL = i3;
        previewRankingSettingFragment.LJLJL = 0;
        return previewRankingSettingFragment;
    }

    @Override // com.bytedance.android.livesdk.rank.api.IRankService
    public final CYY Rf0(Fragment fragment, DataChannel dataChannel, InterfaceC31506CYc interfaceC31506CYc, Layer2PriorityManager layer2PriorityManager) {
        return new CYY(fragment, dataChannel, interfaceC31506CYc, layer2PriorityManager);
    }

    @Override // com.bytedance.android.livesdk.rank.api.IRankService
    public final void QV(long j, long j2, int i, int i2, Fragment fragment, C29684Bku c29684Bku) {
        if (fragment.isAdded()) {
            C1EW.LIZ(((RankApi) Q7L.LIZIZ(RankApi.class)).getRankListV2(j, j2, C72972SkS.LIZLLL(i, ""), 1, 0L, true, i2)).LJII(BTJ.LIZIZ(fragment)).LJJJLIIL(new AfS36S0101000_5(1, c29684Bku, 41), new AfS18S0001000_6(0, 3));
        }
    }
}
