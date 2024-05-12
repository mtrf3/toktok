package X;

import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget.InteractStickerWidget;

/* renamed from: X.Y0f, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86681Y0f implements InterfaceC221818nB {
    public final /* synthetic */ InteractStickerWidget LIZ;
    public final /* synthetic */ Y1W LIZIZ;

    @Override // X.InterfaceC221818nB
    public final void LIZ(boolean z) {
        Y1Q y1q;
        Y1Q y1q2;
        C245649kW c245649kW = this.LIZ.LJLJLLL;
        if (c245649kW != null && (y1q2 = c245649kW.LJIILJJIL) != null) {
            this.LIZIZ.LIZJ.getStickerType();
            Y1E y1e = this.LIZIZ.LIZJ;
            y1q2.LIZ(y1e.LIZ(y1e.getStickerType()), this.LIZIZ.LIZJ.LJFF(), z);
        }
        C245649kW c245649kW2 = this.LIZ.LJLJLLL;
        if (c245649kW2 != null && (y1q = c245649kW2.LJIILJJIL) != null) {
            y1q.LIZIZ(this.LIZIZ.LIZJ.getStickerType(), true);
        }
    }

    public C86681Y0f(InteractStickerWidget interactStickerWidget, Y1W y1w, float f, float f2) {
        this.LIZ = interactStickerWidget;
        this.LIZIZ = y1w;
    }
}
