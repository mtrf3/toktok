package X;

import kotlin.jvm.internal.o;

/* renamed from: X.TDp, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74289TDp extends AbstractC74292TDs {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C74289TDp(C74291TDr view) {
        super(view);
        o.LJIIIZ(view, "view");
    }

    @Override // X.AbstractC74292TDs
    public final void LIZIZ(float[] fArr) {
        this.LIZLLL = fArr;
        this.LIZ.setOutlineProvider(new C74288TDo(fArr));
        this.LIZ.setClipToOutline(true);
    }
}
