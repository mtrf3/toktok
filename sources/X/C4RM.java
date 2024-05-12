package X;

import com.ss.android.ugc.aweme.feed.model.live.NewLiveRoomStruct;
import com.ss.android.ugc.governance.eventbus.IEvent;
import kotlin.jvm.internal.o;

/* renamed from: X.4RM, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4RM implements IEvent {
    public final String LJLIL;
    public final NewLiveRoomStruct LJLILLLLZI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4RM)) {
            return false;
        }
        C4RM c4rm = (C4RM) obj;
        return o.LJ(this.LJLIL, c4rm.LJLIL) && o.LJ(this.LJLILLLLZI, c4rm.LJLILLLLZI);
    }

    public final int hashCode() {
        int hashCode = this.LJLIL.hashCode() * 31;
        NewLiveRoomStruct newLiveRoomStruct = this.LJLILLLLZI;
        return hashCode + (newLiveRoomStruct == null ? 0 : newLiveRoomStruct.hashCode());
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
        LIZ.append("ImRoomStatusEvent(uid=");
        LIZ.append(this.LJLIL);
        LIZ.append(", room=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C4RM(String uid, NewLiveRoomStruct newLiveRoomStruct) {
        o.LJIIIZ(uid, "uid");
        this.LJLIL = uid;
        this.LJLILLLLZI = newLiveRoomStruct;
    }
}
