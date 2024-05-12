package X;

import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.liveinteract.multiguestv3.main.gift.liveshow.LiveShowLeaveRankDialog;
import com.bytedance.android.live.liveinteract.multiguestv3.main.show.anchor.LiveShowAnchorWidget;
import com.bytedance.android.live.liveinteract.multiguestv3.main.show.common.LiveShowEndEvent;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import webcast.data.multi_guest_play.ShowConfig;
import webcast.data.multi_guest_play.ShowContent;

/* renamed from: X.TjC, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75442TjC implements InterfaceC76578U3q {
    public final /* synthetic */ LiveShowAnchorWidget LIZ;

    @Override // X.InterfaceC76578U3q
    public final void LIZ() {
        long j;
        long j2;
        FragmentManager fragmentManager;
        String str;
        ShowContent content;
        String l;
        ShowContent content2;
        ShowConfig showConfig;
        ShowContent content3;
        ShowConfig showConfig2;
        Long LJIIJ;
        String LLLLLLIL;
        U35 LIZ = TQA.LIZ();
        int i = 0;
        if (LIZ != null && LIZ.LIZ()) {
            LiveShowAnchorWidget liveShowAnchorWidget = this.LIZ;
            liveShowAnchorWidget.getClass();
            DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
            if (dataChannelGlobal.mv0(C29044Baa.class) != null) {
                Room room = (Room) dataChannelGlobal.mv0(C29044Baa.class);
                if (room == null) {
                    room = (Room) dataChannelGlobal.mv0(C29108Bbc.class);
                }
                long j3 = 0;
                if (room != null) {
                    j = room.getId();
                } else {
                    j = 0;
                }
                InterfaceC75441TjB R6 = C8E.LJ().R6();
                if (R6 != null && (LLLLLLIL = R6.LLLLLLIL()) != null) {
                    j2 = CastLongProtector.parseLong(LLLLLLIL);
                } else {
                    j2 = 0;
                }
                U35 LIZ2 = TQA.LIZ();
                if (LIZ2 != null && (LJIIJ = LIZ2.LJIIJ()) != null) {
                    j3 = LJIIJ.longValue();
                }
                LiveShowLeaveRankDialog liveShowLeaveRankDialog = new LiveShowLeaveRankDialog();
                liveShowLeaveRankDialog.LJLJL = liveShowAnchorWidget;
                liveShowAnchorWidget.getLifecycle().addObserver(liveShowLeaveRankDialog);
                liveShowLeaveRankDialog.LJLJLJ = Long.valueOf(j);
                liveShowLeaveRankDialog.LJLJLLL = Long.valueOf(j2);
                liveShowLeaveRankDialog.LJLL = Long.valueOf(j3);
                C78866UxK.LJIJJ(liveShowLeaveRankDialog, 10, true, true, null, 0, 240);
                DataChannel dataChannel = liveShowAnchorWidget.dataChannel;
                if (dataChannel != null && (fragmentManager = (FragmentManager) dataChannel.kv0(C29494Bhq.class)) != null) {
                    java.util.Map LIZJ = C76548U2m.LIZJ();
                    LIZJ.put("guest_cnt", String.valueOf(C76548U2m.LJ()));
                    U35 LIZ3 = TQA.LIZ();
                    String str2 = "";
                    if (LIZ3 == null || (content3 = LIZ3.getContent()) == null || (showConfig2 = content3.showConfig) == null || (str = Long.valueOf(showConfig2.durationPerGuest).toString()) == null) {
                        str = "";
                    }
                    LIZJ.put("show_duration_per_guest", str);
                    U35 LIZ4 = TQA.LIZ();
                    if (LIZ4 != null && (content2 = LIZ4.getContent()) != null && (showConfig = content2.showConfig) != null && showConfig.allowOpenMicFreely) {
                        i = 1;
                    }
                    LIZJ.put("is_guest_mic_open", String.valueOf(i));
                    U35 LIZ5 = TQA.LIZ();
                    if (LIZ5 != null && (content = LIZ5.getContent()) != null && (l = Long.valueOf(content.showId).toString()) != null) {
                        str2 = l;
                    }
                    LIZJ.put("multiguest_liveshow_id", str2);
                    C76548U2m.LJIIZILJ("livesdk_anchor_multiguest_liveshow_ranking_show", LIZJ);
                    liveShowLeaveRankDialog.show(fragmentManager, LiveShowAnchorWidget.class.getName());
                }
            }
        }
        this.LIZ.dataChannel.qv0(LiveShowEndEvent.class, C76800UCe.LIZ);
        this.LIZ.LJLZ();
    }

    public C75442TjC(LiveShowAnchorWidget liveShowAnchorWidget) {
        this.LIZ = liveShowAnchorWidget;
    }
}
