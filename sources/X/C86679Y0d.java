package X;

import android.view.MotionEvent;
import android.view.View;
import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget.InteractStickerWidget;

/* renamed from: X.Y0d, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86679Y0d implements InterfaceC221818nB {
    public final /* synthetic */ InteractStickerWidget LIZ;
    public final /* synthetic */ Y1W LIZIZ;
    public final /* synthetic */ MotionEvent LIZJ;

    @Override // X.InterfaceC221818nB
    public final void LIZ(boolean z) {
        Y1Q y1q;
        Y1Q y1q2;
        C245649kW c245649kW = this.LIZ.LJLJLLL;
        if (c245649kW != null && (y1q2 = c245649kW.LJIILJJIL) != null) {
            this.LIZIZ.LIZJ.getStickerType();
            Y1E y1e = this.LIZIZ.LIZJ;
            View LIZ = y1e.LIZ(y1e.getStickerType());
            MotionEvent motionEvent = this.LIZJ;
            if (motionEvent != null) {
                motionEvent.getX();
            }
            MotionEvent motionEvent2 = this.LIZJ;
            if (motionEvent2 != null) {
                motionEvent2.getY();
            }
            y1q2.LIZ(LIZ, this.LIZIZ.LIZJ.LJFF(), z);
        }
        C245649kW c245649kW2 = this.LIZ.LJLJLLL;
        if (c245649kW2 != null && (y1q = c245649kW2.LJIILJJIL) != null) {
            y1q.LIZIZ(this.LIZIZ.LIZJ.getStickerType(), true);
        }
    }

    public C86679Y0d(InteractStickerWidget interactStickerWidget, Y1W y1w, MotionEvent motionEvent) {
        this.LIZ = interactStickerWidget;
        this.LIZIZ = y1w;
        this.LIZJ = motionEvent;
    }
}
