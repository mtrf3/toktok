package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.governance.eventbus.IEvent;
import java.util.List;

/* renamed from: X.9G7, reason: invalid class name */
/* loaded from: classes5.dex */
public final class C9G7 implements IEvent {
    public final List<Aweme> LJLIL;

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

    /* JADX WARN: Multi-variable type inference failed */
    public C9G7(List<? extends Aweme> list) {
        this.LJLIL = list;
    }
}
