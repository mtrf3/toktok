package X;

import com.ss.android.ugc.aweme.emoji.stickerstore.model.StickerSetInfo;
import com.ss.android.ugc.governance.eventbus.IEvent;
import kotlin.jvm.internal.o;

/* renamed from: X.2rD, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C71432rD implements IEvent {
    public final StickerSetInfo LJLIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C71432rD) && o.LJ(this.LJLIL, ((C71432rD) obj).LJLIL);
    }

    public final int hashCode() {
        StickerSetInfo stickerSetInfo = this.LJLIL;
        if (stickerSetInfo == null) {
            return 0;
        }
        return stickerSetInfo.hashCode();
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
        LIZ.append("UseStickerSetEvent(info=");
        LIZ.append(this.LJLIL);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C71432rD(StickerSetInfo stickerSetInfo) {
        this.LJLIL = stickerSetInfo;
    }
}
