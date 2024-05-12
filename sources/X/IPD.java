package X;

import com.ss.android.ugc.aweme.playereventreporter.VideoInfo;
import com.ss.android.ugc.playerkit.simapicommon.reporter.IEvent;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class IPD {
    public static final /* synthetic */ int LIZJ = 0;
    public VideoInfo LIZ;
    public IPA LIZIZ;

    public final void LIZIZ() {
        VideoInfo videoInfo;
        JSONObject LIZ;
        IPA ipa = this.LIZIZ;
        if (ipa == null || (videoInfo = this.LIZ) == null) {
            return;
        }
        if (!IZ8.LJIJJ()) {
            LIZ = LIZ(ipa, videoInfo);
        } else {
            LIZ = LIZ(ipa, videoInfo);
        }
        if (LIZ == null) {
            return;
        }
        IEvent LIZJ2 = C46982IcE.LIZJ();
        if (LIZJ2 != null) {
            LIZJ2.onEvent("video_play_failed", LIZ);
        }
        C79146V4k.LJJJJIZL();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00e0 A[Catch: Exception -> 0x00fa, TryCatch #0 {Exception -> 0x00fa, blocks: (B:19:0x00da, B:21:0x00e0, B:24:0x00f2), top: B:18:0x00da, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b4 A[Catch: JSONException -> 0x00ff, TryCatch #1 {JSONException -> 0x00ff, blocks: (B:3:0x0005, B:5:0x0094, B:10:0x00a0, B:12:0x00cc, B:15:0x00d3, B:33:0x00fb, B:34:0x00a4, B:35:0x00ae, B:37:0x00b4, B:40:0x00c8, B:19:0x00da, B:21:0x00e0, B:24:0x00f2), top: B:2:0x0005, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static org.json.JSONObject LIZ(X.IPA r4, com.ss.android.ugc.aweme.playereventreporter.VideoInfo r5) {
        /*
            Method dump skipped, instructions count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.IPD.LIZ(X.IPA, com.ss.android.ugc.aweme.playereventreporter.VideoInfo):org.json.JSONObject");
    }
}
