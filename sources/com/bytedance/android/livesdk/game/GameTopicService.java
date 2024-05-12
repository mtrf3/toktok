package com.bytedance.android.livesdk.game;

import X.BHV;
import X.BHW;
import X.BHX;
import X.BHZ;
import X.C15380j0;
import X.C28516BHc;
import X.C28522BHi;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.game.IGameTopicService;
import com.bytedance.android.livesdk.model.GameTag;
import com.bytedance.android.livesdk.model.Hashtag;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public class GameTopicService implements IGameTopicService {
    @Override // X.InterfaceC06390Mx
    public final /* synthetic */ void onInit() {
    }

    @Override // com.bytedance.android.live.game.IGameTopicService
    public final Hashtag bV(LiveMode liveMode) {
        Hashtag hashtag;
        BHZ.Companion.getClass();
        BHZ LIZ = BHW.LIZ(liveMode);
        if (LIZ == null || (hashtag = LIZ.getHashtag()) == null) {
            return new Hashtag(0L, "", null, 0, 12, null);
        }
        return hashtag;
    }

    @Override // com.bytedance.android.live.game.IGameTopicService
    public final GameTag re(LiveMode liveMode) {
        GameTag gameTag;
        o.LJIIIZ(liveMode, "liveMode");
        BHZ.Companion.getClass();
        BHZ LIZ = BHW.LIZ(liveMode);
        if (LIZ == null || (gameTag = LIZ.getGameTag()) == null) {
            return new GameTag(0L, C15380j0.LJIILJJIL(R.string.mk7), C15380j0.LJIILJJIL(R.string.mk7), C15380j0.LJIILJJIL(R.string.mk7), 0, null, null, null, null, 496, null);
        }
        return gameTag;
    }

    @Override // com.bytedance.android.live.game.IGameTopicService
    public final void lm0(Fragment fragment, DataChannel dataChannel) {
        o.LJIIIZ(fragment, "fragment");
        BHZ.THIRD_PARTY.updateHashTagGameTag(null, null);
        BHV.LIZ(dataChannel, fragment, BHX.LJLIL, null);
    }

    @Override // com.bytedance.android.live.game.IGameTopicService
    public final void zu0(FragmentManager fragmentManager, C28516BHc c28516BHc, BHZ bhz, LiveMode liveMode) {
        o.LJIIIZ(liveMode, "liveMode");
        C28522BHi.LIZ(fragmentManager, c28516BHc, bhz, liveMode, "go_live");
    }
}
