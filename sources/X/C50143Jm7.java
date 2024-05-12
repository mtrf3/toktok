package X;

import com.ss.android.ugc.aweme.discover.model.GlobalDoodleConfig;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.governance.eventbus.IEvent;
import kotlin.jvm.internal.o;

/* renamed from: X.Jm7, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50143Jm7 implements IEvent {
    public final GlobalDoodleConfig LJLIL;
    public final LogPbBean LJLILLLLZI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C50143Jm7)) {
            return false;
        }
        C50143Jm7 c50143Jm7 = (C50143Jm7) obj;
        return o.LJ(this.LJLIL, c50143Jm7.LJLIL) && o.LJ(this.LJLILLLLZI, c50143Jm7.LJLILLLLZI);
    }

    public final int hashCode() {
        GlobalDoodleConfig globalDoodleConfig = this.LJLIL;
        int hashCode = (globalDoodleConfig == null ? 0 : globalDoodleConfig.hashCode()) * 31;
        LogPbBean logPbBean = this.LJLILLLLZI;
        return hashCode + (logPbBean != null ? logPbBean.hashCode() : 0);
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
        LIZ.append("SearchRequestSuccessConfigEvent(globalDoodleConfig=");
        LIZ.append(this.LJLIL);
        LIZ.append(", logPb=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C50143Jm7(GlobalDoodleConfig globalDoodleConfig, LogPbBean logPbBean) {
        this.LJLIL = globalDoodleConfig;
        this.LJLILLLLZI = logPbBean;
    }
}
