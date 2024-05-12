package X;

import com.ss.android.ugc.aweme.im.sdk.common.data.model.SuggestedStickerStruct;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.2Vz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C59712Vz implements InterfaceC73052tp {
    public final List<SuggestedStickerStruct> LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C59712Vz) && o.LJ(this.LIZ, ((C59712Vz) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Hit(stickers=");
        return C1NE.LIZIZ(LIZ, this.LIZ, ')', LIZ);
    }

    public C59712Vz(List<SuggestedStickerStruct> stickers) {
        o.LJIIIZ(stickers, "stickers");
        this.LIZ = stickers;
    }
}
