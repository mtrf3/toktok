package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.governance.eventbus.IEvent;
import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.2QA, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C2QA implements IEvent {
    public final Aweme LJLIL;
    public final int LJLILLLLZI;
    public final String LJLJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2QA)) {
            return false;
        }
        C2QA c2qa = (C2QA) obj;
        return o.LJ(this.LJLIL, c2qa.LJLIL) && this.LJLILLLLZI == c2qa.LJLILLLLZI && o.LJ(this.LJLJI, c2qa.LJLJI);
    }

    public final int hashCode() {
        Aweme aweme = this.LJLIL;
        return this.LJLJI.hashCode() + ((((aweme == null ? 0 : aweme.hashCode()) * 31) + this.LJLILLLLZI) * 31);
    }

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

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("FullFeedFragmentPanelPageStateChangeEvent(mAweme=");
        LIZ.append(this.LJLIL);
        LIZ.append(", state=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", eventType=");
        return q.LIZIZ(LIZ, this.LJLJI, ')', LIZ);
    }

    public C2QA(int i, String eventType, Aweme aweme) {
        o.LJIIIZ(eventType, "eventType");
        this.LJLIL = aweme;
        this.LJLILLLLZI = i;
        this.LJLJI = eventType;
    }
}
