package X;

import android.view.ViewGroup;
import com.bytedance.android.live.liveinteract.multihost.biz.topicroundtable.ui.dialog.TopicPairPreviewDialog;
import com.bytedance.android.livesdk.chatroom.interact.model.TopicPairResponse;

/* renamed from: X.Tmk, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75662Tmk implements InterfaceC75661Tmj {
    public final /* synthetic */ TopicPairPreviewDialog LIZ;

    @Override // X.InterfaceC75661Tmj
    public final void LIZ(OSZ<? extends EnumC75534Tkg, Long> osz) {
    }

    public C75662Tmk(TopicPairPreviewDialog topicPairPreviewDialog) {
        this.LIZ = topicPairPreviewDialog;
    }

    @Override // X.InterfaceC75661Tmj
    public final void LIZIZ(long j) {
        this.LIZ.dismiss();
        C75642TmQ.LJJJJJ(EnumC75664Tmm.PAIR_SUCCESS.getValue(), j);
    }

    @Override // X.InterfaceC75661Tmj
    public final void LIZJ(long j) {
        long j2;
        this.LIZ.vl(j);
        TopicPairResponse.ResponseData.Setting setting = C75650TmY.LJIIJ;
        if (setting != null) {
            j2 = setting.timeoutSec;
        } else {
            j2 = 180;
        }
        if (j >= j2) {
            TopicPairPreviewDialog topicPairPreviewDialog = this.LIZ;
            topicPairPreviewDialog.LJLJLLL = true;
            UHK uhk = topicPairPreviewDialog.LJLJJLL;
            if (uhk != null) {
                uhk.setVisibility(8);
            }
            ViewGroup viewGroup = topicPairPreviewDialog.LJLJL;
            if (viewGroup == null) {
                return;
            }
            viewGroup.setVisibility(0);
        }
    }
}
