package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import kotlin.jvm.internal.o;

/* renamed from: X.CWj, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31461CWj extends C31463CWl {
    public C31463CWl LJJLIIIJL;
    public C31463CWl LJJLIIIJLJLI;

    @Override // X.C31463CWl
    public final void LJIILLIIL() {
        C31463CWl c31463CWl = this.LJJLIIIJL;
        if (c31463CWl != null) {
            c31463CWl.LJIILLIIL();
        }
        C31463CWl c31463CWl2 = this.LJJLIIIJLJLI;
        if (c31463CWl2 != null) {
            c31463CWl2.LJIILLIIL();
        }
    }

    @Override // X.C31646CbS, X.AbstractC31467CWp
    public final int LJ(Paint paint) {
        int i;
        o.LJIIIZ(paint, "paint");
        C31463CWl c31463CWl = this.LJJLIIIJL;
        if (c31463CWl != null) {
            i = c31463CWl.LIZIZ(paint);
        } else {
            i = 0;
        }
        C31463CWl c31463CWl2 = this.LJJLIIIJLJLI;
        if (c31463CWl2 != null) {
            c31463CWl2.LIZIZ(paint);
        }
        return i;
    }

    @Override // X.C31463CWl, X.C31646CbS, X.AbstractC31467CWp
    public final void LIZLLL(Canvas canvas, Paint paint) {
        o.LJIIIZ(canvas, "canvas");
        o.LJIIIZ(paint, "paint");
        C31463CWl c31463CWl = this.LJJLIIIJL;
        if (c31463CWl != null && c31463CWl.LJJL > 0) {
            c31463CWl.LIZ(canvas, paint);
        }
        C31463CWl c31463CWl2 = this.LJJLIIIJLJLI;
        if (c31463CWl2 != null && c31463CWl2.LJJL > 0) {
            c31463CWl2.LIZ(canvas, paint);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31461CWj(Context context, Bitmap bitmap, int i, String str, C31647CbT c31647CbT) {
        super(context, bitmap, i, str, c31647CbT);
        o.LJIIIZ(context, "context");
    }
}
