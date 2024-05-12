package X;

import com.ss.android.ugc.aweme.emoji.stickerstore.model.VideoSticker;
import com.ss.android.ugc.governance.eventbus.IEvent;
import kotlin.jvm.internal.o;

/* renamed from: X.2sG, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C72082sG implements IEvent {
    public final VideoSticker LJLIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C72082sG) && o.LJ(this.LJLIL, ((C72082sG) obj).LJLIL);
    }

    public final int hashCode() {
        VideoSticker videoSticker = this.LJLIL;
        if (videoSticker == null) {
            return 0;
        }
        return videoSticker.hashCode();
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
        LIZ.append("AddStickerToProfileListEvent(videoSticker=");
        LIZ.append(this.LJLIL);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C72082sG(VideoSticker videoSticker) {
        this.LJLIL = videoSticker;
    }
}
