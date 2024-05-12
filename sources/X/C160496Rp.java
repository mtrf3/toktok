package X;

import android.graphics.Rect;
import android.graphics.RectF;
import kotlin.jvm.internal.o;

/* renamed from: X.6Rp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C160496Rp extends F9E {
    public final Rect LJLIL;
    public final RectF LJLILLLLZI;
    public final float LJLJI;
    public final boolean LJLJJI;

    public C160496Rp() {
        this(0);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI, Float.valueOf(this.LJLJI), Boolean.valueOf(this.LJLJJI)};
    }

    public /* synthetic */ C160496Rp(int i) {
        this(new Rect(), new RectF(), 0.0f, false);
    }

    public static C160496Rp L(C160496Rp c160496Rp, boolean z) {
        Rect marginRect = c160496Rp.LJLIL;
        RectF rect = c160496Rp.LJLILLLLZI;
        float f = c160496Rp.LJLJI;
        c160496Rp.getClass();
        o.LJIIIZ(marginRect, "marginRect");
        o.LJIIIZ(rect, "rect");
        return new C160496Rp(marginRect, rect, f, z);
    }

    public C160496Rp(Rect marginRect, RectF rect, float f, boolean z) {
        o.LJIIIZ(marginRect, "marginRect");
        o.LJIIIZ(rect, "rect");
        this.LJLIL = marginRect;
        this.LJLILLLLZI = rect;
        this.LJLJI = f;
        this.LJLJJI = z;
    }
}
