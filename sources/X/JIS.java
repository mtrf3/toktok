package X;

import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.live.livehostimpl.EducationVideoPlayerDialogFragment;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class JIS implements InterfaceC46568IPk {
    public final /* synthetic */ EducationVideoPlayerDialogFragment LIZ;
    public final /* synthetic */ Video LIZIZ;

    @Override // X.InterfaceC46568IPk
    public final void onComplete() {
        Boolean bool;
        boolean z;
        long j;
        EducationVideoPlayerDialogFragment educationVideoPlayerDialogFragment = this.LIZ;
        educationVideoPlayerDialogFragment.LJLLILLLL = this.LIZIZ;
        educationVideoPlayerDialogFragment.dismiss();
        this.LIZ.onDestroy();
        JIT jit = this.LIZ.LJLLJ;
        if (jit != null) {
            jit.LIZJ();
        }
        JSONObject jSONObject = new JSONObject();
        C46579IPv c46579IPv = this.LIZ.LJLIL;
        Long l = null;
        if (c46579IPv != null) {
            bool = Boolean.valueOf(c46579IPv.LJIJI);
        } else {
            bool = null;
        }
        if (IPZ.LIZ == IPX.PLAYER_PAUSE) {
            z = true;
        } else {
            z = false;
        }
        C46579IPv c46579IPv2 = this.LIZ.LJLIL;
        long j2 = 0;
        if (c46579IPv2 != null) {
            IWF iwf = c46579IPv2.LJII;
            if (iwf != null) {
                j = iwf.getCurrentPosition();
            } else {
                j = 0;
            }
            l = Long.valueOf(j);
        }
        jSONObject.put("is_mute", bool);
        jSONObject.put("is_pause", z);
        jSONObject.put("position", this.LIZIZ.getVideoLength());
        if (l != null) {
            j2 = l.longValue() / 1000;
        }
        jSONObject.put("current_position", j2);
        C72818Shy.LIZ(new C76052yf(System.currentTimeMillis(), new C78528Urs(jSONObject), "video_full_screen_close"));
    }

    @Override // X.InterfaceC46568IPk
    public final void onFailed() {
        JIT jit = this.LIZ.LJLLJ;
        if (jit != null) {
            jit.LIZLLL();
        }
    }

    public JIS(EducationVideoPlayerDialogFragment educationVideoPlayerDialogFragment, Video video) {
        this.LIZ = educationVideoPlayerDialogFragment;
        this.LIZIZ = video;
    }
}
