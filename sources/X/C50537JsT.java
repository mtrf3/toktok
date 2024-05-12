package X;

import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.governance.eventbus.IEvent;

/* renamed from: X.JsT, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50537JsT implements IEvent {
    public final MusicModel LJLIL;
    public final String LJLILLLLZI;
    public final String LJLJI;

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

    public C50537JsT(MusicModel musicModel, String str, String str2) {
        this.LJLIL = musicModel;
        this.LJLILLLLZI = str;
        this.LJLJI = str2;
    }
}
