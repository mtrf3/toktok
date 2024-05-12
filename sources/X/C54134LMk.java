package X;

import android.content.Context;
import android.util.AttributeSet;
import kotlin.jvm.internal.o;

/* renamed from: X.LMk, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54134LMk extends AbstractC2312495s {
    public InterfaceC54135LMl LJLIL;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C54134LMk(Context context) {
        this(context, null, 6);
        o.LJIIIZ(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C54134LMk(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        o.LJIIIZ(context, "context");
    }

    public final InterfaceC54135LMl getOnTabVisibilityChangeListener() {
        return this.LJLIL;
    }

    public final void setOnTabVisibilityChangeListener(InterfaceC54135LMl interfaceC54135LMl) {
        this.LJLIL = interfaceC54135LMl;
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        InterfaceC54135LMl interfaceC54135LMl;
        if (getVisibility() != i && (interfaceC54135LMl = this.LJLIL) != null) {
            interfaceC54135LMl.LIZ(i);
        }
        super.setVisibility(i);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C54134LMk(final android.content.Context r2, final android.util.AttributeSet r3, int r4) {
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
        throw new UnsupportedOperationException("Method not decompiled: X.C54134LMk.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
