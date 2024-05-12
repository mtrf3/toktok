package X;

import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.governance.eventbus.IEvent;

/* renamed from: X.6w8, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C176406w8 implements IEvent {
    public final Comment LJLIL;

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

    public C176406w8(Comment comment) {
        this.LJLIL = comment;
    }
}
