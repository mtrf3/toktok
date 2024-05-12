package X;

import com.ss.android.ugc.aweme.topic.common.model.TopicRawInfo;
import com.ss.android.ugc.governance.eventbus.IEvent;
import kotlin.jvm.internal.o;

/* renamed from: X.7Nc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C184807Nc implements IEvent {
    public final TopicRawInfo LJLIL;
    public final boolean LJLILLLLZI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C184807Nc)) {
            return false;
        }
        C184807Nc c184807Nc = (C184807Nc) obj;
        return o.LJ(this.LJLIL, c184807Nc.LJLIL) && this.LJLILLLLZI == c184807Nc.LJLILLLLZI;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        TopicRawInfo topicRawInfo = this.LJLIL;
        int hashCode = (topicRawInfo == null ? 0 : topicRawInfo.hashCode()) * 31;
        boolean z = this.LJLILLLLZI;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
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
        LIZ.append("CollectTopicEvent(topicInfo=");
        LIZ.append(this.LJLIL);
        LIZ.append(", collectStatus=");
        return C48339Iy7.LIZJ(LIZ, this.LJLILLLLZI, ')', LIZ);
    }

    public C184807Nc(TopicRawInfo topicRawInfo, boolean z) {
        this.LJLIL = topicRawInfo;
        this.LJLILLLLZI = z;
    }
}
