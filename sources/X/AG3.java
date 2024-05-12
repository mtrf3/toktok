package X;

import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.setting.model.LiveReplayEntranceResponse;
import com.ss.android.ugc.aweme.setting.page.LivePage;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class AG3 implements InterfaceC65753PrJ<LiveReplayEntranceResponse> {
    public final /* synthetic */ LivePage LIZ;

    public AG3(LivePage livePage) {
        this.LIZ = livePage;
    }

    @Override // X.InterfaceC65753PrJ
    public final void onFailure(Throwable t) {
        o.LJIIIZ(t, "t");
        LiveOuterService.LJJJLL().LJII();
        C65211PiZ c65211PiZ = C54285LSf.LIZ;
        HashMap hashMap = new HashMap();
        hashMap.put("error_msg", t.getMessage());
        hashMap.put("error_code", -1);
        c65211PiZ.LIZ(1, "ttlive_live_replay_setting_entrance_show_all", hashMap);
        c65211PiZ.LIZ(1, "ttlive_live_replay_setting_entrance_show_error", hashMap);
    }

    @Override // X.InterfaceC65753PrJ
    public final void onSuccess(LiveReplayEntranceResponse liveReplayEntranceResponse) {
        Object obj;
        LiveReplayEntranceResponse liveReplayEntranceResponse2 = liveReplayEntranceResponse;
        if (liveReplayEntranceResponse2 != null) {
            if (liveReplayEntranceResponse2.enableLiveReplay == 1 && !EF7.LJIIIIZZ()) {
                AG2 ag2 = this.LIZ.LJLJJLL;
                if (ag2 != null) {
                    ag2.LJIIIZ(true);
                    this.LIZ.getClass();
                    LivePage.Dl("show");
                } else {
                    o.LJIJI("liveReplayUnit");
                    throw null;
                }
            } else {
                AG2 ag22 = this.LIZ.LJLJJLL;
                if (ag22 != null) {
                    ag22.LJIIIZ(false);
                } else {
                    o.LJIJI("liveReplayUnit");
                    throw null;
                }
            }
        }
        LiveOuterService.LJJJLL().LJII();
        C65211PiZ c65211PiZ = C54285LSf.LIZ;
        HashMap hashMap = new HashMap();
        if (liveReplayEntranceResponse2 != null) {
            StringBuilder LIZ = X1D.LIZ();
            obj = C08380Uo.LIZ(LIZ, liveReplayEntranceResponse2.enableLiveReplay, "", LIZ);
        } else {
            obj = -1;
        }
        hashMap.put("live_replay_show", obj);
        c65211PiZ.LIZ(0, "ttlive_live_replay_setting_entrance_show_all", hashMap);
    }
}
