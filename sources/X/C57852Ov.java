package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.governance.eventbus.IEvent;
import defpackage.q;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.2Ov, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C57852Ov implements IEvent {
    public final List<Aweme> LJLIL;
    public final String LJLILLLLZI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C57852Ov)) {
            return false;
        }
        C57852Ov c57852Ov = (C57852Ov) obj;
        return o.LJ(this.LJLIL, c57852Ov.LJLIL) && o.LJ(this.LJLILLLLZI, c57852Ov.LJLILLLLZI);
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
        LIZ.append("HotSpotAwemeListMergeEvent(awemeList=");
        LIZ.append(this.LJLIL);
        LIZ.append(", awemeIdTarget=");
        return q.LIZIZ(LIZ, this.LJLILLLLZI, ')', LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C57852Ov(List<? extends Aweme> list, String str) {
        this.LJLIL = list;
        this.LJLILLLLZI = str;
    }
}
