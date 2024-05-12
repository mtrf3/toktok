package com.ss.android.ugc.aweme.dsp.playpage.pageitem.v2.audio.collect;

import X.C73969T1h;
import X.C91086Zow;
import X.C91353ZtF;
import X.C91354ZtG;
import X.C91420ZuK;
import X.InterfaceC91296ZsK;
import X.T16;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import kotlin.jvm.internal.o;

/* loaded from: classes22.dex */
public final class CollectViewModel extends AssemViewModel<C91420ZuK> {
    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C91420ZuK defaultState() {
        return new C91420ZuK(null, null);
    }

    public final void gv0(InterfaceC91296ZsK playable, int i, String musicId) {
        o.LJIIIZ(playable, "playable");
        o.LJIIIZ(musicId, "musicId");
        String id = playable.getId();
        String fullClipId = playable.LIZIZ();
        o.LJIIIZ(fullClipId, "fullClipId");
        disposeOnClear(C91086Zow.LIZ().collectSong(fullClipId, i, musicId).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new C91353ZtF(i, playable, this, id, fullClipId), new C91354ZtG(this, id, fullClipId, i)));
    }
}
