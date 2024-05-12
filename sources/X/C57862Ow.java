package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.governance.eventbus.IEvent;
import defpackage.q;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.2Ow, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C57862Ow implements IEvent {
    public final List<Aweme> LJLIL;
    public final String LJLILLLLZI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C57862Ow)) {
            return false;
        }
        C57862Ow c57862Ow = (C57862Ow) obj;
        return o.LJ(this.LJLIL, c57862Ow.LJLIL) && o.LJ(this.LJLILLLLZI, c57862Ow.LJLILLLLZI);
    }

    public final int hashCode() {
        int hashCode = this.LJLIL.hashCode() * 31;
        String str = this.LJLILLLLZI;
        return hashCode + (str == null ? 0 : str.hashCode());
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
        LIZ.append("BotAwemeListMergeEvent(awemeList=");
        LIZ.append(this.LJLIL);
        LIZ.append(", awemeIdTarget=");
        return q.LIZIZ(LIZ, this.LJLILLLLZI, ')', LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C57862Ow(List<? extends Aweme> awemeList, String str) {
        o.LJIIIZ(awemeList, "awemeList");
        this.LJLIL = awemeList;
        this.LJLILLLLZI = str;
    }
}
