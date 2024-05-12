package X;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class ASR extends FrameLayout {
    public boolean LJLIL;
    public boolean LJLILLLLZI;
    public boolean LJLJI;
    public boolean LJLJJI;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ASR(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        o.LJIIIZ(context, "context");
    }

    public final boolean getRemoveBottomInsets() {
        return this.LJLILLLLZI;
    }

    public final boolean getRemoveLeftInsets() {
        return this.LJLJI;
    }

    public final boolean getRemoveRightInsets() {
        return this.LJLJJI;
    }

    public final boolean getRemoveTopInsets() {
        return this.LJLIL;
    }

    @Override // android.view.View
    public final boolean fitSystemWindows(Rect rect) {
        if (this.LJLIL && rect != null) {
            rect.top = 0;
        }
        if (this.LJLILLLLZI && rect != null) {
            rect.bottom = 0;
        }
        if (this.LJLJI && rect != null) {
            rect.left = 0;
        }
        if (this.LJLJJI && rect != null) {
            rect.right = 0;
        }
        return super.fitSystemWindows(rect);
    }

    public final void setRemoveBottomInsets(boolean z) {
        this.LJLILLLLZI = z;
    }

    public final void setRemoveLeftInsets(boolean z) {
        this.LJLJI = z;
    }

    public final void setRemoveRightInsets(boolean z) {
        this.LJLJJI = z;
    }

    public final void setRemoveTopInsets(boolean z) {
        this.LJLIL = z;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ASR(android.content.Context r2, android.util.AttributeSet r3, int r4) {
        /*
            r1 = this;
            r0 = r4 & 2
            if (r0 == 0) goto L5
            r3 = 0
        L5:
            java.lang.String r0 = "context"
            defpackage.a1.LJFF(r2, r0)
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ASR.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
