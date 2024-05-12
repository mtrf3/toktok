package X;

import com.ss.android.ugc.aweme.emoji.stickerstore.model.VideoSticker;
import kotlin.jvm.internal.o;

/* renamed from: X.3bQ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C87123bQ extends F9E implements InterfaceC57784Mm4 {
    public final VideoSticker LJLIL;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL};
    }

    public C87123bQ(VideoSticker videoSticker) {
        o.LJIIIZ(videoSticker, "videoSticker");
        this.LJLIL = videoSticker;
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areContentsTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        if (!(interfaceC57784Mm4 instanceof C87123bQ)) {
            return false;
        }
        C87123bQ c87123bQ = (C87123bQ) interfaceC57784Mm4;
        if (!o.LJ(this.LJLIL.getStatus(), c87123bQ.LJLIL.getStatus()) || !o.LJ(this.LJLIL.getOriginVideoId(), c87123bQ.LJLIL.getOriginVideoId()) || !o.LJ(this.LJLIL.getCreatorUid(), c87123bQ.LJLIL.getCreatorUid()) || !o.LJ(this.LJLIL.getCreatorSecUid(), c87123bQ.LJLIL.getCreatorSecUid()) || !o.LJ(this.LJLIL.getHaveFavorite(), c87123bQ.LJLIL.getHaveFavorite())) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areItemTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        if (!(interfaceC57784Mm4 instanceof C87123bQ) || this.LJLIL.getVideoStickerId() == null || !o.LJ(this.LJLIL.getVideoStickerId(), ((C87123bQ) interfaceC57784Mm4).LJLIL.getVideoStickerId())) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC57784Mm4
    public final Object getChangePayload(InterfaceC57784Mm4 interfaceC57784Mm4) {
        if ((interfaceC57784Mm4 instanceof C87123bQ) && !o.LJ(this.LJLIL.getHaveFavorite(), ((C87123bQ) interfaceC57784Mm4).LJLIL.getHaveFavorite())) {
            return new C87183bW();
        }
        return null;
    }
}
