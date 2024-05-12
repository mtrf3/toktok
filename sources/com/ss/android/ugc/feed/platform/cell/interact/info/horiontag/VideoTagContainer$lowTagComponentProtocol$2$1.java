package com.ss.android.ugc.feed.platform.cell.interact.info.horiontag;

import X.C113554cx;
import X.C210888Pk;
import X.C8PV;
import X.C8T7;
import X.EnumC210828Pe;
import android.view.View;
import com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol;
import com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol;
import java.util.Map;

/* loaded from: classes4.dex */
public final class VideoTagContainer$lowTagComponentProtocol$2$1 implements ComponentPriorityProtocol {
    public final /* synthetic */ VideoTagContainer LJLIL;

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final String o0() {
        String LIZLLL = C210888Pk.LIZLLL(this.LJLIL.a1());
        String str = this.LJLIL.rp0().eventType;
        Map<String, PriorityProtocol> map = this.LJLIL.C4().LIZ(EnumC210828Pe.VIDEO_TAG).get("low_tag");
        if (map == null) {
            map = C113554cx.LJJJLIIL();
        }
        return C210888Pk.LIZJ(LIZLLL, str, map);
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final View l0() {
        return ((C8PV) C113554cx.LJJJLL("low_tag", this.LJLIL.C4().LIZJ)).LJ();
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final C8T7 e2() {
        Map<String, PriorityProtocol> map;
        PriorityProtocol priorityProtocol;
        String o0 = o0();
        if (o0 == null || o0.length() == 0 || (map = this.LJLIL.C4().LIZ(EnumC210828Pe.VIDEO_TAG).get("low_tag")) == null || (priorityProtocol = map.get(o0())) == null) {
            return null;
        }
        return priorityProtocol.LJLILLLLZI();
    }

    public VideoTagContainer$lowTagComponentProtocol$2$1(VideoTagContainer videoTagContainer) {
        this.LJLIL = videoTagContainer;
    }
}
