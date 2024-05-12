package X;

import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.governance.eventbus.IEvent;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.EMt, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36307EMt implements IEvent {
    public final int LJLIL;
    public final int LJLILLLLZI;
    public final List<User> LJLJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C36307EMt)) {
            return false;
        }
        C36307EMt c36307EMt = (C36307EMt) obj;
        return this.LJLIL == c36307EMt.LJLIL && this.LJLILLLLZI == c36307EMt.LJLILLLLZI && o.LJ(this.LJLJI, c36307EMt.LJLJI);
    }

    public final int hashCode() {
        int i = ((this.LJLIL * 31) + this.LJLILLLLZI) * 31;
        List<User> list = this.LJLJI;
        return i + (list == null ? 0 : list.hashCode());
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
        LIZ.append("NoticeFollowingTabInfo(group=");
        LIZ.append(this.LJLIL);
        LIZ.append(", level=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", followeeInfo=");
        return C1NE.LIZIZ(LIZ, this.LJLJI, ')', LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C36307EMt(int i, int i2, List<? extends User> list) {
        this.LJLIL = i;
        this.LJLILLLLZI = i2;
        this.LJLJI = list;
    }
}
