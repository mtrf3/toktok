package X;

import android.graphics.RectF;
import android.view.MotionEvent;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.6CZ, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6CZ implements InterfaceC139415dZ {
    public StickerModel LIZ;
    public final C62822Ol8 LIZIZ;

    public final void LIZIZ() {
        StickerModel stickerModel = this.LIZ;
        if (stickerModel == null) {
            return;
        }
        RectF viewRect = stickerModel.getBaseSticker().getViewRect();
        ((C6P6) this.LIZIZ.getValue()).onDown(MotionEvent.obtain(System.currentTimeMillis(), System.currentTimeMillis(), 0, viewRect.centerX(), viewRect.centerY(), 0));
    }

    public final MotionEvent LIZJ() {
        StickerModel stickerModel = this.LIZ;
        if (stickerModel == null) {
            return null;
        }
        RectF viewRect = stickerModel.getBaseSticker().getViewRect();
        MotionEvent obtain = MotionEvent.obtain(System.currentTimeMillis(), System.currentTimeMillis(), 1, viewRect.centerX(), viewRect.centerY(), 0);
        ((C6P6) this.LIZIZ.getValue()).LJJIIZI(obtain);
        return obtain;
    }

    public C6CZ(C160056Px stickerObjectContainer) {
        o.LJIIIZ(stickerObjectContainer, "stickerObjectContainer");
        this.LIZIZ = C221108m2.LIZIZ(new AqS152S0100000_2(stickerObjectContainer, 916));
    }

    @Override // X.InterfaceC139415dZ
    public final C6CZ LIZ(StickerModel stickerModel) {
        o.LJIIIZ(stickerModel, "stickerModel");
        this.LIZ = stickerModel;
        return this;
    }

    public final void LIZLLL(C139425da action) {
        o.LJIIIZ(action, "action");
        if (o.LJ(action, C139425da.LIZ)) {
            LIZIZ();
            MotionEvent LIZJ = LIZJ();
            if (LIZJ != null) {
                ((C6P6) this.LIZIZ.getValue()).onSingleTapConfirmed(LIZJ);
                return;
            }
            return;
        }
        if (!o.LJ(action, new AbstractC139435db() { // from class: X.5dc
        })) {
            return;
        }
        C84673XKz LJIILIIL = C79146V4k.LJIILIIL();
        XKX.LIZLLL(C48841JEv.LIZ(C36636EZk.LIZ.plus(LJIILIIL)), null, null, new C156446Ca(this, null), 3);
        LJIILIIL.LIZIZ(null);
    }
}
