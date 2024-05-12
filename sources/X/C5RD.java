package X;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.WindowManager;
import kotlin.jvm.internal.o;

/* renamed from: X.5RD, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5RD extends View {
    public final String LJLIL;
    public final String LJLILLLLZI;
    public C136215Wf LJLJI;
    public final int LJLJJI;
    public final int LJLJJL;
    public final int LJLJJLL;
    public final int LJLJL;
    public final int LJLJLJ;
    public final Rect LJLJLLL;
    public final RectF LJLL;

    public final C136215Wf getFrameCache() {
        C136215Wf c136215Wf = this.LJLJI;
        if (c136215Wf != null) {
            return c136215Wf;
        }
        o.LJIJI("frameCache");
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0146 A[LOOP:0: B:7:0x0061->B:31:0x0146, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0135 A[EDGE_INSN: B:32:0x0135->B:35:0x0135 BREAK  A[LOOP:0: B:7:0x0061->B:31:0x0146], SYNTHETIC] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onDraw(android.graphics.Canvas r18) {
        /*
            Method dump skipped, instructions count: 386
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5RD.onDraw(android.graphics.Canvas):void");
    }

    public final void setFrameCache(C136215Wf c136215Wf) {
        o.LJIIIZ(c136215Wf, "<set-?>");
        this.LJLJI = c136215Wf;
    }

    public C5RD(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LJLIL = "";
        this.LJLILLLLZI = "video";
        new Point(0, 0);
        this.LJLJJI = C5RE.LIZ(30.0f);
        this.LJLJJL = C5RE.LIZ(56.0f);
        this.LJLJJLL = 1000;
        Context context2 = getContext();
        o.LJIIIIZZ(context2, "context");
        Point point = new Point();
        Object LLILL = C16880lQ.LLILL(context2, "window");
        if (LLILL != null) {
            ((WindowManager) LLILL).getDefaultDisplay().getRealSize(point);
            int i = point.x;
            this.LJLJL = (-i) * 2;
            this.LJLJLJ = i * 2;
            this.LJLJLLL = new Rect();
            this.LJLL = new RectF();
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.WindowManager");
    }
}
