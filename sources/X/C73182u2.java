package X;

import com.ss.android.ugc.aweme.emoji.stickerstore.model.SetSticker;
import kotlin.jvm.internal.o;

/* renamed from: X.2u2, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C73182u2 implements InterfaceC73202u4 {
    public final SetSticker LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C73182u2) && o.LJ(this.LIZ, ((C73182u2) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SuggestedSetStickerItem(data=");
        LIZ.append(this.LIZ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C73182u2(SetSticker setSticker) {
        this.LIZ = setSticker;
    }
}
