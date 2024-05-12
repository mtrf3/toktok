package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* renamed from: X.5Aw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C130665Aw {
    public static final C62822Ol8 LJIIIIZZ = C221108m2.LIZIZ(C5BR.LJLIL);
    public static final C62822Ol8 LJIIIZ = C221108m2.LIZIZ(C5BS.LJLIL);
    public final InterfaceC130745Be LIZ;
    public final Rect LIZIZ;
    public final Rect LIZJ;
    public final Paint LIZLLL;
    public int LJ;
    public float LJFF;
    public long LJI;
    public InterfaceC65784Pro<Integer> LJII;

    public C130665Aw(InterfaceC130745Be frameView) {
        o.LJIIIZ(frameView, "frameView");
        this.LIZ = frameView;
        this.LIZIZ = new Rect();
        this.LIZJ = new Rect();
        this.LIZLLL = new Paint(1);
        this.LJI = -1L;
        this.LJII = C130835Bn.LJLIL;
    }

    public static long LIZLLL(NLETrackSlot nLETrackSlot, NLETrackSlot nLETrackSlot2) {
        long j = 1000;
        return (nLETrackSlot2.getStartTime() / j) + (nLETrackSlot.getStartTime() / j);
    }

    public final Long LIZ(NLETrackSlot nLETrackSlot, float f) {
        if (this.LIZ.getItemWidth() <= 0) {
            return null;
        }
        float LIZIZ = ((C1300758p.LIZIZ() * ((float) nLETrackSlot.getStartTime())) / 1000) + f;
        Iterator<NLETrackSlot> it = nLETrackSlot.LJFF().iterator();
        while (it.hasNext()) {
            NLETrackSlot it2 = it.next();
            float LIZIZ2 = C1300758p.LIZIZ();
            o.LJIIIIZZ(it2, "it");
            if (Math.abs((LIZIZ2 * ((float) LIZLLL(it2, nLETrackSlot))) - LIZIZ) < C1300758p.LIZIZ / 2) {
                return Long.valueOf(LIZLLL(it2, nLETrackSlot));
            }
        }
        return null;
    }

    public final void LIZIZ(Canvas canvas, NLETrackSlot nLETrackSlot) {
        o.LJIIIZ(canvas, "canvas");
        NLETrackSlot LJFF = this.LIZ.LJFF();
        this.LJFF += this.LJ;
        Iterator<NLETrackSlot> it = nLETrackSlot.LJFF().iterator();
        NLETrackSlot nLETrackSlot2 = null;
        boolean z = false;
        while (it.hasNext()) {
            NLETrackSlot it2 = it.next();
            o.LJIIIIZZ(it2, "it");
            if (this.LIZ.getItemWidth() <= 0 || Math.abs((C1300758p.LIZIZ() * ((float) LIZLLL(it2, nLETrackSlot))) - this.LJII.invoke().floatValue()) >= C1300758p.LIZIZ / 2.0f || z) {
                if (this.LIZ.LIZ()) {
                    Bitmap frameIcon = (Bitmap) LJIIIIZZ.getValue();
                    o.LJIIIIZZ(frameIcon, "frameIcon");
                    LIZJ(frameIcon, canvas, nLETrackSlot, it2, 1.0f);
                }
            } else {
                nLETrackSlot2 = it2;
                z = true;
            }
        }
        if (nLETrackSlot2 != null) {
            if ((LJFF == null || !o.LJ(nLETrackSlot2.getName(), LJFF.getName())) && this.LIZ.LJI()) {
                this.LIZ.LJIIIIZZ(nLETrackSlot2);
            }
            if (this.LIZ.LIZ()) {
                Bitmap frameSelectedIcon = (Bitmap) LJIIIZ.getValue();
                o.LJIIIIZZ(frameSelectedIcon, "frameSelectedIcon");
                LIZJ(frameSelectedIcon, canvas, nLETrackSlot, nLETrackSlot2, 1.2f);
                return;
            }
            return;
        }
        if (LJFF == null || !this.LIZ.LJI()) {
            return;
        }
        this.LIZ.LJII();
    }

    public final void LIZJ(Bitmap bitmap, Canvas canvas, NLETrackSlot nLETrackSlot, NLETrackSlot nLETrackSlot2, float f) {
        this.LIZJ.set(0, 0, bitmap.getWidth(), bitmap.getHeight());
        int LIZIZ = (int) ((C1300758p.LIZIZ() * ((float) (LIZLLL(nLETrackSlot2, nLETrackSlot) - (nLETrackSlot.getStartTime() / 1000)))) - this.LJFF);
        int itemHeight = (int) (this.LIZ.getItemHeight() / 2.0f);
        Rect rect = this.LIZIZ;
        int i = C1300758p.LIZIZ / 2;
        rect.set(LIZIZ - i, itemHeight - i, LIZIZ + i, i + itemHeight);
        Rect rect2 = this.LIZJ;
        Rect rect3 = this.LIZIZ;
        o.LJIIIZ(rect3, "<this>");
        if (f > 0.0f && f != 1.0f) {
            float f2 = f - 1;
            float width = rect3.width() * f2;
            float height = rect3.height() * f2;
            float f3 = 2;
            float f4 = rect3.left - (width / f3);
            float f5 = rect3.top - (height / f3);
            rect3 = new Rect((int) f4, (int) f5, (int) ((rect3.width() * f) + f4), (int) ((f * rect3.height()) + f5));
        }
        canvas.drawBitmap(bitmap, rect2, rect3, this.LIZLLL);
    }
}
