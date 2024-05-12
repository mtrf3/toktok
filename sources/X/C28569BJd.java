package X;

import android.content.Context;
import com.bytedance.android.live.rank.impl.setting.NewRankSettingDialog;
import com.bytedance.android.livesdk.rank.api.IRankService;

/* renamed from: X.BJd, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28569BJd extends AbstractViewOnClickListenerC28292B8m {
    public final /* synthetic */ NewRankSettingDialog LJLJJL;

    @Override // X.AbstractViewOnClickListenerC28292B8m
    public final void LIZ() {
        BJW bjw;
        long j;
        NewRankSettingDialog newRankSettingDialog = this.LJLJJL;
        C41071jL c41071jL = newRankSettingDialog.LJLJL;
        if (c41071jL != null) {
            if (!c41071jL.isChecked()) {
                bjw = BJW.RANK_SWITCH_STATUS_ON;
            } else {
                bjw = BJW.RANK_SWITCH_STATUS_OFF;
            }
            boolean LJIIJ = C29306Beo.LJIIJ(newRankSettingDialog.dataChannel);
            C28571BJf fp0 = ((IRankService) CN1.LIZ(IRankService.class)).fp0();
            Context context = newRankSettingDialog.getContext();
            if (LJIIJ) {
                j = 5;
            } else {
                j = 6;
            }
            fp0.LJII(context, j, bjw.getValue(), LJIIJ, new C28567BJb(c41071jL, LJIIJ, newRankSettingDialog, bjw));
        }
    }

    public C28569BJd(NewRankSettingDialog newRankSettingDialog) {
        this.LJLJJL = newRankSettingDialog;
    }
}
