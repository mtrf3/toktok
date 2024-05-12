package X;

import com.bytedance.android.livesdk.chatroom.model.AnchorReplayInfoData;
import com.bytedance.android.livesdk.chatroom.model.AnchorReplayInfoResponse;
import com.bytedance.android.livesdk.chatroom.model.RoomReplay;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.SmE, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73082SmE<T> implements InterfaceC64592gB {
    public static final C73082SmE<T> LJLIL = new C73082SmE<>();

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        AnchorReplayInfoData anchorReplayInfoData;
        List<RoomReplay> list;
        AnchorReplayInfoResponse anchorReplayInfoResponse = (AnchorReplayInfoResponse) obj;
        if (anchorReplayInfoResponse != null && (anchorReplayInfoData = anchorReplayInfoResponse.data) != null && (list = anchorReplayInfoData.replays) != null) {
            for (RoomReplay roomReplay : list) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("startDownload background, id: ");
                LIZ.append(roomReplay.id);
                LIZ.append(", roomReplay.status+:");
                C1DD.LJFF(LIZ, roomReplay.status, LIZ, "LiveReplyVideoPlayer");
                int i = roomReplay.status;
                if (i == 4) {
                    C0NB.LIZIZ("LiveReplyVideoPlayer", "startDownload background : DOWNLOAD_STATUS_UNAVAILABLE");
                    C48459J0d<java.util.Map<String, String>> c48459J0d = InterfaceC30442Bx8.f64J;
                    c48459J0d.LIZJ().remove(roomReplay.id);
                    c48459J0d.LIZ(c48459J0d.LIZJ());
                } else if (i == 3) {
                    C0NB.LIZIZ("LiveReplyVideoPlayer", "startDownload background : DOWNLOAD_STATUS_READY");
                    C48459J0d<java.util.Map<String, String>> c48459J0d2 = InterfaceC30442Bx8.f64J;
                    java.util.Map<String, String> LIZJ = c48459J0d2.LIZJ();
                    o.LJIIIIZZ(LIZJ, "LIVE_REPLAY_SCHEDULED_DOWNLOAD_VIDEO_LIST.value");
                    LIZJ.put(roomReplay.id, roomReplay.downloadUrl);
                    c48459J0d2.LIZ(c48459J0d2.LIZJ());
                    C0ER LIZJ2 = C0ER.LIZJ();
                    String str = roomReplay.downloadUrl;
                    String str2 = roomReplay.id;
                    LIZJ2.getClass();
                    int LIZLLL = C0ER.LIZLLL(str, str2);
                    C012403c.LJ("startDownload background, downloadStatus+:", LIZLLL, "LiveReplyVideoPlayer");
                    if (LIZLLL == 2 || LIZLLL == 4) {
                        C0NB.LIZIZ("LiveReplyVideoPlayer", "startDownload background : clear task");
                        c48459J0d2.LIZJ().remove(roomReplay.id);
                        c48459J0d2.LIZ(c48459J0d2.LIZJ());
                    } else if (C48189Ivh.LJI(C15380j0.LIZLLL())) {
                        C0NB.LIZIZ("LiveReplyVideoPlayer", "startDownload background : do task");
                        C73083SmF.LIZ(roomReplay.downloadUrl, roomReplay.id);
                    }
                }
            }
        }
        C73083SmF.LIZIZ();
    }
}
