package X;

import com.bytedance.android.livesdk.model.RoomSticker;
import kotlin.jvm.internal.o;

/* renamed from: X.Bk9, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29637Bk9 {
    public final RoomSticker LIZ;
    public final Boolean LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29637Bk9)) {
            return false;
        }
        C29637Bk9 c29637Bk9 = (C29637Bk9) obj;
        return o.LJ(this.LIZ, c29637Bk9.LIZ) && o.LJ(this.LIZIZ, c29637Bk9.LIZIZ);
    }

    public final int hashCode() {
        RoomSticker roomSticker = this.LIZ;
        int hashCode = (roomSticker == null ? 0 : roomSticker.hashCode()) * 31;
        Boolean bool = this.LIZIZ;
        return hashCode + (bool != null ? bool.hashCode() : 0);
    }

    public C29637Bk9() {
        this(null, Boolean.FALSE);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ShownTextStickerModel(shownTextSticker=");
        LIZ.append(this.LIZ);
        LIZ.append(", isEdited=");
        return C78920UyC.LIZIZ(LIZ, this.LIZIZ, ')', LIZ);
    }

    public C29637Bk9(RoomSticker roomSticker, Boolean bool) {
        this.LIZ = roomSticker;
        this.LIZIZ = bool;
    }
}
