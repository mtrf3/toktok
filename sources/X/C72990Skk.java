package X;

import com.ss.android.ugc.aweme.live.livehostimpl.livereply.clip.LiveReplayVideoClipActivity;
import java.util.LinkedHashMap;
import java.util.Map;
import tikcast.api.anchor.AnchorLiveFragmentInfoResponse;
import tikcast.api.anchor.LiveFragmentDetail;

/* renamed from: X.Skk, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72990Skk<T> implements InterfaceC64592gB {
    public final /* synthetic */ LiveReplayVideoClipActivity LJLIL;
    public final /* synthetic */ long LJLILLLLZI;

    public C72990Skk(LiveReplayVideoClipActivity liveReplayVideoClipActivity, long j) {
        this.LJLIL = liveReplayVideoClipActivity;
        this.LJLILLLLZI = j;
    }

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        String str;
        long j;
        LiveFragmentDetail liveFragmentDetail;
        LiveFragmentDetail liveFragmentDetail2;
        AnchorLiveFragmentInfoResponse anchorLiveFragmentInfoResponse = (AnchorLiveFragmentInfoResponse) obj;
        AnchorLiveFragmentInfoResponse.ResponseData responseData = anchorLiveFragmentInfoResponse.data;
        if (responseData != null && (liveFragmentDetail2 = responseData.clipInfo) != null) {
            str = liveFragmentDetail2.downloadUrl;
        } else {
            str = null;
        }
        C279017q.LJ("getLiveReplayFragment: ", str, "LiveReplayVideoClip");
        if (this.LJLIL.LL.isEmpty() || str == null || str.length() == 0) {
            return;
        }
        java.util.Map<OSZ<Long, Long>, Long> map = this.LJLIL.LL;
        long j2 = this.LJLILLLLZI;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
            if (((Number) entry.getValue()).longValue() == j2) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        java.util.Set keySet = linkedHashMap.keySet();
        C72242sW c72242sW = new C72242sW();
        if (true ^ keySet.isEmpty()) {
            j = ((Number) ((OSZ) ORZ.LJLLILLLL(keySet)).getFirst()).longValue();
            c72242sW.element = ((Number) ((OSZ) ORZ.LJLLILLLL(keySet)).getSecond()).longValue() - j;
        } else {
            j = 0;
        }
        ((LinkedHashMap) this.LJLIL.LL).clear();
        A90 a90 = this.LJLIL.LJLLL;
        if (a90 != null) {
            a90.LIZLLL(30.0f);
        }
        AnchorLiveFragmentInfoResponse.ResponseData responseData2 = anchorLiveFragmentInfoResponse.data;
        if (responseData2 == null || (liveFragmentDetail = responseData2.clipInfo) == null) {
            return;
        }
        LiveReplayVideoClipActivity liveReplayVideoClipActivity = this.LJLIL;
        liveReplayVideoClipActivity.getClass();
        C188727au LLIIIILZ = liveReplayVideoClipActivity.LLIIIILZ();
        LLIIIILZ.LJ(j, "start_time");
        LLIIIILZ.LJ(c72242sW.element, "duration");
        LLIIIILZ.LJIIIZ("clip_id", liveFragmentDetail.fragmentIdStr);
        LLIIIILZ.LJIIIZ("click_stage", "2");
        FMX.LJIIL("livesdk_live_replay_clip_post_click", LLIIIILZ.LIZ);
        A90 a902 = liveReplayVideoClipActivity.LJLLL;
        if (a902 != null) {
            a902.setOnCancelListener(new DialogInterfaceOnCancelListenerC72993Skn(liveReplayVideoClipActivity, c72242sW, str));
        }
        C72991Skl.LIZJ = System.currentTimeMillis();
        C72991Skl.LIZJ(liveReplayVideoClipActivity, 30.0f, liveReplayVideoClipActivity.LJLLL, liveFragmentDetail.roomIdStr, liveFragmentDetail.fragmentIdStr, liveFragmentDetail.downloadUrl, ".mp4", "replay_clip");
    }
}
