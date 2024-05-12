package X;

import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.governance.eventbus.IEvent;

/* loaded from: classes16.dex */
public final class XYA implements IEvent {
    public final int LJLIL;
    public final MusicModel LJLILLLLZI;

    @Override // com.ss.android.ugc.governance.eventbus.IEvent
    public final /* synthetic */ IEvent post() {
        C2U8.LIZ(this);
        return this;
    }

    @Override // com.ss.android.ugc.governance.eventbus.IEvent
    public final /* synthetic */ IEvent postSticky() {
        C2U8.LIZIZ(this);
        return this;
    }

    public XYA(MusicModel musicModel, int i) {
        this.LJLIL = i;
        this.LJLILLLLZI = musicModel;
    }
}
