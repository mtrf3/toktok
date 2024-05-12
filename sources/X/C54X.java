package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.54X, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C54X extends View {
    public List<C122864ry> LJLIL;
    public float LJLILLLLZI;
    public int LJLJI;
    public float LJLJJI;
    public long LJLJJL;
    public final Rect LJLJJLL;
    public final Rect LJLJL;
    public final C62822Ol8 LJLJLJ;
    public final int LJLJLLL;
    public final Path LJLL;
    public final RectF LJLLI;
    public Bitmap LJLLILLLL;
    public InterfaceC88471Ynr<? super String, ? super Integer, Bitmap> LJLLJ;
    public final Rect LJLLL;

    public final InterfaceC88471Ynr<String, Integer, Bitmap> getFrameFetcher() {
        return this.LJLLJ;
    }

    public final int getFrameWidth() {
        return this.LJLJI;
    }

    public final Rect getPreInitVisibleRect() {
        return this.LJLLL;
    }

    public final float getPxPerMs() {
        return this.LJLJJI;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C54X(Context context) {
        super(context);
        new LinkedHashMap();
        this.LJLIL = C61878OQg.INSTANCE;
        this.LJLILLLLZI = 1000.0f;
        int LIZ = C134845Qy.LIZ(48.0f);
        this.LJLJI = LIZ;
        this.LJLJJI = LIZ / this.LJLILLLLZI;
        this.LJLJJLL = new Rect();
        this.LJLJL = new Rect();
        this.LJLJLJ = C221108m2.LIZIZ(new AqS152S0100000_2(this, 670));
        this.LJLJLLL = C134845Qy.LIZ(4.0f);
        this.LJLL = new Path();
        this.LJLLI = new RectF();
        this.LJLLL = new Rect();
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00cf A[LOOP:0: B:19:0x006e->B:33:0x00cf, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x000a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d2  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onDraw(android.graphics.Canvas r13) {
        /*
            Method dump skipped, instructions count: 344
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C54X.onDraw(android.graphics.Canvas):void");
    }

    public final void setData(List<? extends NLETrackSlot> slots) {
        o.LJIIIZ(slots, "slots");
        ArrayList arrayList = new ArrayList(C32I.LJJL(slots, 10));
        for (NLETrackSlot nLETrackSlot : slots) {
            NLESegmentVideo LJJ = NLESegmentVideo.LJJ(nLETrackSlot.LJI());
            if (LJJ == null) {
                return;
            } else {
                arrayList.add(C121084p6.LIZ(nLETrackSlot, LJJ));
            }
        }
        this.LJLIL = arrayList;
        Iterator it = arrayList.iterator();
        long j = 0;
        while (it.hasNext()) {
            C122864ry c122864ry = (C122864ry) it.next();
            j += c122864ry.LJLJI - c122864ry.LJLJJLL;
        }
        this.LJLJJL = j;
        requestLayout();
        invalidate();
    }

    public final void setFrameFetcher(InterfaceC88471Ynr<? super String, ? super Integer, Bitmap> interfaceC88471Ynr) {
        this.LJLLJ = interfaceC88471Ynr;
    }

    public final void setFrameWidth(int i) {
        this.LJLJI = i;
    }

    public final void setPxPerMs(float f) {
        this.LJLJJI = f;
        this.LJLILLLLZI = this.LJLJI * f;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        if (View.MeasureSpec.getMode(i) == 1073741824) {
            i3 = View.MeasureSpec.getSize(i);
            float f = i3 / ((float) (this.LJLJJL / 1000));
            this.LJLJJI = f;
            this.LJLILLLLZI = this.LJLJI * f;
        } else {
            i3 = (int) (((float) (this.LJLJJL / 1000)) * this.LJLJJI);
        }
        if (View.MeasureSpec.getMode(i2) == 1073741824) {
            i4 = View.MeasureSpec.getSize(i2);
        } else {
            i4 = this.LJLJI;
        }
        setMeasuredDimension(i3, i4);
    }
}
