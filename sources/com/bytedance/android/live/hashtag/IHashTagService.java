package com.bytedance.android.live.hashtag;

import X.BHZ;
import X.C65776Prg;
import X.InterfaceC06390Mx;
import X.InterfaceC14450hV;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.livesdk.hashtag.AudienceHashTagWidget;
import com.bytedance.android.livesdk.hashtag.BroadcastHashTagWidget;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.ies.sdk.widgets.Layer2PriorityManager;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;

/* loaded from: classes.dex */
public interface IHashTagService extends InterfaceC06390Mx {
    BroadcastHashTagWidget Dx(Layer2PriorityManager layer2PriorityManager);

    Class<? extends LiveRecyclableWidget> jm0();

    C65776Prg nk();

    void pu0(FragmentManager fragmentManager, InterfaceC14450hV interfaceC14450hV, BHZ bhz, LiveMode liveMode);

    AudienceHashTagWidget qq(Layer2PriorityManager layer2PriorityManager);
}
