package X;

import Y.IDComparatorS30S0000000_2;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.59W, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C59W extends View {
    public static final float LJLJJLL;
    public final Paint LJLIL;
    public final List<NLETrackSlot> LJLILLLLZI;
    public final float LJLJI;
    public long LJLJJI;
    public final C62822Ol8 LJLJJL;

    static {
        int LIZ;
        if (C1291054w.LJ().LJJJLL) {
            LIZ = C134845Qy.LIZ(1.5f);
        } else {
            LIZ = C134845Qy.LIZ(1.0f);
        }
        LJLJJLL = LIZ;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C59W(Context context) {
        this(context, null);
        o.LJIIIZ(context, "context");
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (canvas == null) {
            return;
        }
        float f = C1300058i.LJIIJ / 2.0f;
        Iterator it = ((ArrayList) this.LJLILLLLZI).iterator();
        long j = -1;
        while (it.hasNext()) {
            NLETimeSpaceNode nLETimeSpaceNode = (NLETimeSpaceNode) it.next();
            long j2 = 1000;
            long startTime = nLETimeSpaceNode.getStartTime() / j2;
            long endTime = nLETimeSpaceNode.getEndTime() / j2;
            float f2 = this.LJLJI / 2;
            if (startTime >= j) {
                j = startTime;
            } else if (j <= endTime) {
            }
            if (((Boolean) this.LJLJJL.getValue()).booleanValue()) {
                canvas.drawLine((getMeasuredWidth() - (C1300758p.LIZIZ() * ((float) endTime))) - f, f2, (getMeasuredWidth() - (C1300758p.LIZIZ() * ((float) j))) - f, f2, this.LJLIL);
            } else {
                canvas.drawLine((C1300758p.LIZIZ() * ((float) j)) + f, f2, (C1300758p.LIZIZ() * ((float) endTime)) + f, f2, this.LJLIL);
            }
            j = endTime;
        }
    }

    public final void setLineColor(int i) {
        this.LJLIL.setColor(i);
        invalidate();
    }

    public final void setTrackList(List<C1280750x> trackList) {
        o.LJIIIZ(trackList, "trackList");
        ((ArrayList) this.LJLILLLLZI).clear();
        this.LJLJJI = 0L;
        Iterator<C1280750x> it = trackList.iterator();
        while (it.hasNext()) {
            for (NLETrackSlot nLETrackSlot : it.next().LIZLLL) {
                ((ArrayList) this.LJLILLLLZI).add(nLETrackSlot);
                this.LJLJJI = Math.max(this.LJLJJI, nLETrackSlot.getEndTime() / 1000);
            }
        }
        ArrayList arrayList = (ArrayList) this.LJLILLLLZI;
        if (arrayList.size() > 1) {
            C40675Fxn.LJJLIIIJ(arrayList, new IDComparatorS30S0000000_2(22));
        }
        requestLayout();
        invalidate();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C59W(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        Paint paint = new Paint();
        this.LJLIL = paint;
        this.LJLILLLLZI = new ArrayList();
        float f = LJLJJLL;
        this.LJLJI = f;
        int color = getResources().getColor(R.color.qk);
        this.LJLJJL = C221108m2.LIZIZ(new AqS152S0100000_2(this, 636));
        paint.setAntiAlias(true);
        paint.setColor(color);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(f);
        paint.setStyle(Paint.Style.FILL);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int LIZIZ;
        int i3;
        if (View.MeasureSpec.getMode(i) == 1073741824) {
            LIZIZ = View.MeasureSpec.getSize(i);
        } else {
            LIZIZ = (int) ((C1300758p.LIZIZ() * ((float) this.LJLJJI)) + C1300058i.LJIIJ);
        }
        if (View.MeasureSpec.getMode(i2) == 1073741824) {
            i3 = View.MeasureSpec.getSize(i2);
        } else {
            i3 = (int) this.LJLJI;
        }
        setMeasuredDimension(LIZIZ, i3);
    }
}
