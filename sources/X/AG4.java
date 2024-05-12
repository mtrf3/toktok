package X;

import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.setting.model.LiveReplayEntranceResponse;
import com.ss.android.ugc.aweme.setting.ui.I18nSettingNewVersionFragment;
import java.util.HashMap;

/* loaded from: classes5.dex */
public final class AG4 implements InterfaceC65753PrJ<LiveReplayEntranceResponse> {
    public final /* synthetic */ I18nSettingNewVersionFragment LIZ;

    public AG4(I18nSettingNewVersionFragment i18nSettingNewVersionFragment) {
        this.LIZ = i18nSettingNewVersionFragment;
    }

    @Override // X.InterfaceC65753PrJ
    public final void onFailure(Throwable th) {
        String str;
        LiveOuterService.LJJJLL().LJII();
        C65211PiZ c65211PiZ = C54285LSf.LIZ;
        HashMap hashMap = new HashMap();
        if (th != null) {
            str = th.getMessage();
        } else {
            str = "";
        }
        hashMap.put("error_msg", str);
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
                this.LIZ.mLiveReplay.LJIIIZ(false);
            } else {
                this.LIZ.mLiveReplay.LJIIIZ(false);
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
