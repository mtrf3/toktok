package X;

import android.content.Context;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class TTZ {
    public final Room LIZ;
    public final Context LIZIZ;
    public final DataChannel LIZJ;

    public TTZ() {
        this(null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TTZ)) {
            return false;
        }
        TTZ ttz = (TTZ) obj;
        return o.LJ(this.LIZ, ttz.LIZ) && o.LJ(this.LIZIZ, ttz.LIZIZ) && o.LJ(this.LIZJ, ttz.LIZJ);
    }

    public final int hashCode() {
        Room room = this.LIZ;
        int hashCode = (room == null ? 0 : room.hashCode()) * 31;
        Context context = this.LIZIZ;
        int hashCode2 = (hashCode + (context == null ? 0 : context.hashCode())) * 31;
        DataChannel dataChannel = this.LIZJ;
        return hashCode2 + (dataChannel != null ? dataChannel.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MultiGuestDataPackage(room=");
        LIZ.append(this.LIZ);
        LIZ.append(", context=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", dataChannel=");
        LIZ.append(this.LIZJ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public TTZ(Context context, Room room, DataChannel dataChannel) {
        this.LIZ = room;
        this.LIZIZ = context;
        this.LIZJ = dataChannel;
    }
}
