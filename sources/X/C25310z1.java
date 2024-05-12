package X;

import com.bytedance.android.livesdk.model.RoomSticker;
import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.0z1, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C25310z1 {
    public final RoomSticker LIZ;
    public final String LIZIZ;

    public C25310z1() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25310z1)) {
            return false;
        }
        C25310z1 c25310z1 = (C25310z1) obj;
        return o.LJ(this.LIZ, c25310z1.LIZ) && o.LJ(this.LIZIZ, c25310z1.LIZIZ);
    }

    public final int hashCode() {
        RoomSticker roomSticker = this.LIZ;
        int hashCode = (roomSticker == null ? 0 : roomSticker.hashCode()) * 31;
        String str = this.LIZIZ;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("RecentVisibleTextStickerData(roomSticker=");
        LIZ.append(this.LIZ);
        LIZ.append(", stickerContent=");
        return q.LIZIZ(LIZ, this.LIZIZ, ')', LIZ);
    }

    public C25310z1(RoomSticker roomSticker, String str) {
        this.LIZ = roomSticker;
        this.LIZIZ = str;
    }
}
