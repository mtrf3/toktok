package X;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.5G8, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5G8 extends View {
    public final String LJLIL;
    public final String LJLILLLLZI;
    public C162396Yx LJLJI;
    public final int LJLJJI;
    public final int LJLJJL;
    public final int LJLJJLL;
    public final int LJLJL;
    public final int LJLJLJ;
    public final Rect LJLJLLL;
    public final RectF LJLL;

    public final C162396Yx getFrameCache() {
        C162396Yx c162396Yx = this.LJLJI;
        if (c162396Yx != null) {
            return c162396Yx;
        }
        o.LJIJI("frameCache");
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00cb A[LOOP:0: B:7:0x004c->B:27:0x00cb, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00f7 A[EDGE_INSN: B:28:0x00f7->B:31:0x00f7 BREAK  A[LOOP:0: B:7:0x004c->B:27:0x00cb], SYNTHETIC] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onDraw(android.graphics.Canvas r12) {
        /*
            Method dump skipped, instructions count: 251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5G8.onDraw(android.graphics.Canvas):void");
    }

    public final void setFrameCache(C162396Yx c162396Yx) {
        o.LJIIIZ(c162396Yx, "<set-?>");
        this.LJLJI = c162396Yx;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5G8(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        new LinkedHashMap();
        this.LJLIL = "";
        this.LJLILLLLZI = "video";
        new Point(0, 0);
        this.LJLJJI = SFS.LJI(30.0d);
        this.LJLJJL = SFS.LJI(56.0d);
        this.LJLJJLL = 1000;
        int LJIIIIZZ = C60996Nwm.LJIIIIZZ(getContext());
        this.LJLJL = (-LJIIIIZZ) * 2;
        this.LJLJLJ = LJIIIIZZ * 2;
        this.LJLJLLL = new Rect();
        this.LJLL = new RectF();
    }
}
