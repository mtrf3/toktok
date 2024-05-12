package X;

import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.governance.eventbus.IEvent;

/* renamed from: X.SVd, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72197SVd implements IEvent {
    public final int LJLIL;
    public final MusicModel LJLILLLLZI;
    public String LJLJI;

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

    public C72197SVd(MusicModel musicModel, int i) {
        this.LJLIL = i;
        this.LJLILLLLZI = musicModel;
    }
}
