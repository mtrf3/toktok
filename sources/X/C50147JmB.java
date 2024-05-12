package X;

import com.ss.android.ugc.governance.eventbus.IEvent;
import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.JmB, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50147JmB implements IEvent {
    public final String LJLIL;
    public final String LJLILLLLZI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C50147JmB)) {
            return false;
        }
        C50147JmB c50147JmB = (C50147JmB) obj;
        return o.LJ(this.LJLIL, c50147JmB.LJLIL) && o.LJ(this.LJLILLLLZI, c50147JmB.LJLILLLLZI);
    }

    public final int hashCode() {
        String str = this.LJLIL;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LJLILLLLZI;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
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
        LIZ.append("SearchShowResultsEvent(searchPageCode=");
        LIZ.append(this.LJLIL);
        LIZ.append(", tabName=");
        return q.LIZIZ(LIZ, this.LJLILLLLZI, ')', LIZ);
    }

    public C50147JmB(String str, String str2) {
        this.LJLIL = str;
        this.LJLILLLLZI = str2;
    }
}
