package com.bytedance.android.livesdk.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import defpackage.q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class UserExtra extends Extra {

    @InterfaceC65349Pkn("anonymous_is_silence")
    public final boolean anonymousIsSilence;

    @InterfaceC65349Pkn("preload_empty_reason")
    public final String preloadEmptyReason;

    @InterfaceC65349Pkn("preload_room")
    public final Room preloadRoom;

    /* JADX WARN: Multi-variable type inference failed */
    public UserExtra() {
        this(false, null, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserExtra)) {
            return false;
        }
        UserExtra userExtra = (UserExtra) obj;
        return this.anonymousIsSilence == userExtra.anonymousIsSilence && o.LJ(this.preloadRoom, userExtra.preloadRoom) && o.LJ(this.preloadEmptyReason, userExtra.preloadEmptyReason);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v9 */
    public final int hashCode() {
        boolean z = this.anonymousIsSilence;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        Room room = this.preloadRoom;
        return this.preloadEmptyReason.hashCode() + ((i + (room == null ? 0 : room.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("UserExtra(anonymousIsSilence=");
        LIZ.append(this.anonymousIsSilence);
        LIZ.append(", preloadRoom=");
        LIZ.append(this.preloadRoom);
        LIZ.append(", preloadEmptyReason=");
        return q.LIZIZ(LIZ, this.preloadEmptyReason, ')', LIZ);
    }

    public UserExtra(boolean z, Room room, String preloadEmptyReason) {
        o.LJIIIZ(preloadEmptyReason, "preloadEmptyReason");
        this.anonymousIsSilence = z;
        this.preloadRoom = room;
        this.preloadEmptyReason = preloadEmptyReason;
    }

    public /* synthetic */ UserExtra(boolean z, Room room, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : room, (i & 4) != 0 ? "" : str);
    }
}
