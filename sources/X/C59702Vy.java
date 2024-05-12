package X;

import com.ss.android.ugc.aweme.im.sdk.common.data.model.SuggestedStickerStruct;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.2Vy, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C59702Vy {
    public final List<SuggestedStickerStruct> LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C59702Vy) && o.LJ(this.LIZ, ((C59702Vy) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Loaded(stickers=");
        return C1NE.LIZIZ(LIZ, this.LIZ, ')', LIZ);
    }

    public C59702Vy(List<SuggestedStickerStruct> stickers) {
        o.LJIIIZ(stickers, "stickers");
        this.LIZ = stickers;
    }
}
