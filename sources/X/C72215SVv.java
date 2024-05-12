package X;

import android.widget.TextView;

/* renamed from: X.SVv, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72215SVv extends AbstractC72218SVy {
    public final /* synthetic */ TextView LIZIZ;

    public C72215SVv(TextView textView) {
        this.LIZIZ = textView;
    }

    @Override // X.AbstractC72218SVy
    public final void LIZIZ(EnumC72217SVx enumC72217SVx) {
        if (enumC72217SVx == null) {
            return;
        }
        int i = C72216SVw.LIZ[enumC72217SVx.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return;
                }
                this.LIZIZ.setVisibility(0);
                return;
            }
            this.LIZIZ.setVisibility(8);
            return;
        }
        this.LIZIZ.setVisibility(0);
    }
}
