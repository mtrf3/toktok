package X;

import android.widget.CompoundButton;
import com.bytedance.android.livesdk.pip.ShareSettingsDialog;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.zhiliaoapp.musically.R;

/* renamed from: X.BJc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28568BJc implements BJT {
    public final /* synthetic */ ShareSettingsDialog LIZ;

    @Override // X.BJT
    public final void onCancel() {
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Long, O] */
    @Override // X.BJT
    public final void LIZ() {
        BJW bjw;
        String str;
        String str2;
        ((C011602u) this.LIZ._$_findCachedViewById(R.id.kxu)).toggle();
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
        if (((CompoundButton) this.LIZ._$_findCachedViewById(R.id.kxu)).isChecked()) {
            bjw = BJW.RANK_SWITCH_STATUS_ON;
        } else {
            bjw = BJW.RANK_SWITCH_STATUS_OFF;
        }
        ((C32537Cpp) dataChannelGlobal.gv0(C29025BaH.class)).LIZ = Long.valueOf(bjw.getValue());
        BZI LIZ = C28787BRn.LIZ("livesdk_live_rankings_setting_click");
        LIZ.LJIIZILJ();
        LIZ.LJIJJ(dataChannelGlobal.mv0(C29033BaP.class), "enter_from");
        if (((CompoundButton) this.LIZ._$_findCachedViewById(R.id.kxu)).isChecked()) {
            str = "open";
        } else {
            str = "close";
        }
        LIZ.LJIJJ(str, "ranking_status");
        LIZ.LJIJJ("user", "user_type");
        LIZ.LJIJJ("gift_ranking", "rank_type");
        if (C29306Beo.LJJI()) {
            str2 = "live_take_page";
        } else {
            str2 = "live_take_detail";
        }
        LIZ.LJIIJJI(str2);
        LIZ.LJJIIJZLJL();
    }

    @Override // X.BJT
    public final void onFailed() {
        C30868C9o.LIZJ(R.string.mg2);
    }

    public C28568BJc(ShareSettingsDialog shareSettingsDialog) {
        this.LIZ = shareSettingsDialog;
    }
}
