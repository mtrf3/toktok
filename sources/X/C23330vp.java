package X;

import android.graphics.Rect;
import android.graphics.drawable.RippleDrawable;
import java.lang.reflect.Method;
import kotlin.jvm.internal.o;

/* renamed from: X.0vp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C23330vp extends RippleDrawable {
    public static Method LJLJJL;
    public static boolean LJLJJLL;
    public final boolean LJLIL;
    public C11850dJ LJLILLLLZI;
    public Integer LJLJI;
    public boolean LJLJJI;

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.Drawable
    public final Rect getDirtyBounds() {
        if (!this.LJLIL) {
            this.LJLJJI = true;
        }
        Rect dirtyBounds = super.getDirtyBounds();
        o.LJIIIIZZ(dirtyBounds, "super.getDirtyBounds()");
        this.LJLJJI = false;
        return dirtyBounds;
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public final boolean isProjected() {
        return this.LJLJJI;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C23330vp(boolean r5) {
        /*
            r4 = this;
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            android.content.res.ColorStateList r3 = android.content.res.ColorStateList.valueOf(r0)
            r2 = 0
            if (r5 == 0) goto L15
            android.graphics.drawable.ColorDrawable r1 = new android.graphics.drawable.ColorDrawable
            r0 = -1
            r1.<init>(r0)
        Lf:
            r4.<init>(r3, r2, r1)
            r4.LJLIL = r5
            return
        L15:
            r1 = r2
            goto Lf
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23330vp.<init>(boolean):void");
    }
}
