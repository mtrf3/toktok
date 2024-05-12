package com.bytedance.android.livesdk.hashtag;

import X.BHZ;
import X.C28522BHi;
import X.C65352Pkq;
import X.C65776Prg;
import X.InterfaceC14450hV;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.hashtag.IHashTagService;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.ies.sdk.widgets.Layer2PriorityManager;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public class HashTagService implements IHashTagService {
    @Override // com.bytedance.android.live.hashtag.IHashTagService
    public final Class<? extends LiveRecyclableWidget> jm0() {
        return AudienceHashTagWidget.class;
    }

    @Override // com.bytedance.android.live.hashtag.IHashTagService
    public final C65776Prg nk() {
        return C65352Pkq.LIZ(PreviewHashtagWidget2.class);
    }

    @Override // X.InterfaceC06390Mx
    public final /* synthetic */ void onInit() {
    }

    @Override // com.bytedance.android.live.hashtag.IHashTagService
    public final BroadcastHashTagWidget Dx(Layer2PriorityManager layer2PriorityManager) {
        o.LJIIIZ(layer2PriorityManager, "layer2PriorityManager");
        return new BroadcastHashTagWidget(layer2PriorityManager);
    }

    @Override // com.bytedance.android.live.hashtag.IHashTagService
    public final AudienceHashTagWidget qq(Layer2PriorityManager layer2PriorityManager) {
        o.LJIIIZ(layer2PriorityManager, "layer2PriorityManager");
        return new AudienceHashTagWidget(layer2PriorityManager);
    }

    @Override // com.bytedance.android.live.hashtag.IHashTagService
    public final void pu0(FragmentManager fragmentManager, InterfaceC14450hV interfaceC14450hV, BHZ bhz, LiveMode liveMode) {
        o.LJIIIZ(liveMode, "liveMode");
        C28522BHi.LIZ(fragmentManager, interfaceC14450hV, bhz, liveMode, "add_topic");
    }
}
