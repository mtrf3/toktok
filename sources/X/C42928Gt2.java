package X;

import android.view.View;
import kotlin.jvm.internal.o;

/* renamed from: X.Gt2, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42928Gt2 extends AbstractC26257ASf {
    public final /* synthetic */ DialogC42922Gsw LIZ;

    public C42928Gt2(DialogC42922Gsw dialogC42922Gsw) {
        this.LIZ = dialogC42922Gsw;
    }

    @Override // X.AbstractC26257ASf
    public final void LIZ(View p0, float f) {
        o.LJIIIZ(p0, "p0");
        if (Math.abs(f) > 0.6d) {
            this.LIZ.LJJIFFI();
        }
    }

    @Override // X.AbstractC26257ASf
    public final void LIZIZ(int i, View view) {
        o.LJIIIZ(view, "view");
        if (i == 5) {
            this.LIZ.dismiss();
        }
    }
}
