package X;

import com.ss.android.ugc.aweme.emoji.stickerstore.model.VideoSticker;
import kotlin.jvm.internal.o;

/* renamed from: X.2u3, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C73192u3 implements InterfaceC73202u4 {
    public final VideoSticker LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C73192u3) && o.LJ(this.LIZ, ((C73192u3) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SuggestedVideoStickerItem(data=");
        LIZ.append(this.LIZ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C73192u3(VideoSticker videoSticker) {
        this.LIZ = videoSticker;
    }
}
