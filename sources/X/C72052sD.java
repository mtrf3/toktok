package X;

import com.ss.android.ugc.aweme.emoji.stickerstore.model.SetSticker;
import kotlin.jvm.internal.o;

/* renamed from: X.2sD, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C72052sD implements InterfaceC57784Mm4 {
    public final SetSticker LJLIL;

    public C72052sD() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C72052sD) && o.LJ(this.LJLIL, ((C72052sD) obj).LJLIL);
    }

    @Override // X.InterfaceC57784Mm4
    public final Object getChangePayload(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return null;
    }

    public final int hashCode() {
        SetSticker setSticker = this.LJLIL;
        if (setSticker == null) {
            return 0;
        }
        return setSticker.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SetStickerItem(sticker=");
        LIZ.append(this.LJLIL);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C72052sD(SetSticker setSticker) {
        this.LJLIL = setSticker;
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areContentsTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return o.LJ(interfaceC57784Mm4, this);
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areItemTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        if (!(interfaceC57784Mm4 instanceof C72052sD)) {
            return false;
        }
        SetSticker setSticker = this.LJLIL;
        Long l = null;
        if (setSticker == null || setSticker.getStickerId() == null) {
            return false;
        }
        Long stickerId = this.LJLIL.getStickerId();
        SetSticker setSticker2 = ((C72052sD) interfaceC57784Mm4).LJLIL;
        if (setSticker2 != null) {
            l = setSticker2.getStickerId();
        }
        if (!o.LJ(stickerId, l)) {
            return false;
        }
        return true;
    }
}
