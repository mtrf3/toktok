package X;

import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.governance.eventbus.IEvent;

/* renamed from: X.JrK, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50466JrK implements IEvent {
    public final Music LJLIL;

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

    public C50466JrK(Music music) {
        this.LJLIL = music;
    }
}
