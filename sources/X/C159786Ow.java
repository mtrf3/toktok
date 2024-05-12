package X;

import android.content.Context;
import android.graphics.RectF;
import android.view.MotionEvent;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import java.util.Iterator;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.6Ow, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C159786Ow extends C6SD {
    public final C1NS<BaseStickerModel> LJII;
    public final C159376Nh LJIIIIZZ;
    public final C160056Px LJIIIZ;
    public final C62822Ol8 LJIIJ;

    @Override // X.C6SD
    public final C1NS<BaseStickerModel> LJJII() {
        return this.LJII;
    }

    @Override // X.C6SD, X.C6P6, X.C6V2
    public final boolean LJJIIZI(MotionEvent motionEvent) {
        if (motionEvent == null) {
            return false;
        }
        if (C77119UOl.LJIILL(motionEvent.getX(), motionEvent.getY(), this.LJIIIIZZ.getDeleteIconRect(), this.LJII.LJ.getRotation())) {
            C43045Guv.LIZLLL(new AqS152S0100000_2(this, 730), 100L);
            return true;
        }
        C159376Nh c159376Nh = this.LJIIIIZZ;
        c159376Nh.LLFF = false;
        c159376Nh.invalidate();
        super.LJJIIZI(motionEvent);
        return false;
    }

    @Override // X.C6SD, X.C6P6, X.C6V2
    public final boolean onDown(MotionEvent motionEvent) {
        if (motionEvent == null) {
            return false;
        }
        RectF visibleRectWithoutRotation = this.LJII.LJ.getVisibleRectWithoutRotation();
        if (!C77119UOl.LJIILL(motionEvent.getX(), motionEvent.getY(), this.LJIIIIZZ.getDeleteIconRect(), this.LJII.LJ.getRotation()) && C77119UOl.LJIILL(motionEvent.getX(), motionEvent.getY(), visibleRectWithoutRotation, this.LJII.LJ.getRotation())) {
            C159376Nh c159376Nh = this.LJIIIIZZ;
            c159376Nh.LLFF = true;
            c159376Nh.invalidate();
        }
        super.onDown(motionEvent);
        return false;
    }

    @Override // X.C6SD, X.C6P6, X.C6V2
    public final boolean onSingleTapConfirmed(MotionEvent e) {
        o.LJIIIZ(e, "e");
        if (!LJJIII()) {
            return false;
        }
        RectF visibleRectWithoutRotation = this.LJII.LJ.getVisibleRectWithoutRotation();
        if (!C77119UOl.LJIILL(e.getX(), e.getY(), visibleRectWithoutRotation, this.LJII.LJ.getRotation())) {
            return false;
        }
        Iterator<C6SJ> it = this.LIZJ.iterator();
        while (it.hasNext()) {
            if (it.next().LJIILJJIL(e.getX(), e.getY(), this.LJII.LJ.getId(), new RectF(visibleRectWithoutRotation), this.LJII.LJ.getType())) {
                return true;
            }
        }
        Iterator<C6SE> it2 = this.LIZIZ.iterator();
        while (it2.hasNext()) {
            it2.next().LJIILLIIL(this.LJII.LJ.getId(), this.LJII.LJ.getType(), e.getX(), e.getY(), new RectF(visibleRectWithoutRotation), this.LJII.LJ.getRotation());
        }
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C159786Ow(Context context, C1NS textStateContainer, C1NS stateContainer, C159376Nh c159376Nh, C160056Px stickerObjectContainer) {
        super(stateContainer);
        o.LJIIIZ(context, "context");
        o.LJIIIZ(textStateContainer, "textStateContainer");
        o.LJIIIZ(stateContainer, "stateContainer");
        o.LJIIIZ(stickerObjectContainer, "stickerObjectContainer");
        this.LJII = stateContainer;
        this.LJIIIIZZ = c159376Nh;
        this.LJIIIZ = stickerObjectContainer;
        this.LJIIJ = C221108m2.LIZIZ(new AqS152S0100000_2(this, 731));
    }
}
