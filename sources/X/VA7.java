package X;

import android.graphics.drawable.Animatable;
import android.view.View;
import com.facebook.fresco.animation.drawable.AnimatedDrawable2;

/* loaded from: classes14.dex */
public final class VA7 extends C81929WDl {
    public final boolean LJLJLJ;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public VA7(java.lang.String r8, boolean r9, boolean r10) {
        /*
            r7 = this;
            X.3Ua r3 = X.C84683Ua.LJFF
            java.lang.String r0 = "durationPerfMon"
            kotlin.jvm.internal.o.LJIIIZ(r3, r0)
            r4 = 0
            r6 = 56
            r1 = r8
            r2 = r9
            r0 = r7
            r5 = r4
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r0.LJLJLJ = r10
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.VA7.<init>(java.lang.String, boolean, boolean):void");
    }

    @Override // X.C81929WDl, X.InterfaceC70769Rq1
    public final void U0(android.net.Uri uri, View view, C2047581v c2047581v, Animatable animatable) {
        super.U0(uri, view, c2047581v, animatable);
        if (this.LJLJLJ && (animatable instanceof AnimatedDrawable2)) {
            ((AnimatedDrawable2) animatable).LJI(new VA6());
        }
    }
}
