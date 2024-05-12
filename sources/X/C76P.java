package X;

import com.ss.android.ugc.aweme.sticker.model.NewFaceStickerBean;
import com.ss.android.ugc.governance.eventbus.IEvent;

/* renamed from: X.76P, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C76P implements IEvent {
    public final NewFaceStickerBean LJLIL;

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

    public C76P(NewFaceStickerBean newFaceStickerBean) {
        this.LJLIL = newFaceStickerBean;
    }
}
