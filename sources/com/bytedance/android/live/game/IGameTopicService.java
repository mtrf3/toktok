package com.bytedance.android.live.game;

import X.BHZ;
import X.C28516BHc;
import X.InterfaceC06390Mx;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.livesdk.model.GameTag;
import com.bytedance.android.livesdk.model.Hashtag;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* loaded from: classes.dex */
public interface IGameTopicService extends InterfaceC06390Mx {
    Hashtag bV(LiveMode liveMode);

    void lm0(Fragment fragment, DataChannel dataChannel);

    GameTag re(LiveMode liveMode);

    void zu0(FragmentManager fragmentManager, C28516BHc c28516BHc, BHZ bhz, LiveMode liveMode);
}
