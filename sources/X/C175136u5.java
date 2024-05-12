package X;

import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.governance.eventbus.IEvent;
import kotlin.jvm.internal.o;

/* renamed from: X.6u5, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C175136u5 implements IEvent {
    public final int LJLIL;
    public final Comment LJLILLLLZI;

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

    public C175136u5(Comment comment, int i) {
        o.LJIIIZ(comment, "comment");
        this.LJLIL = i;
        this.LJLILLLLZI = comment;
    }
}
