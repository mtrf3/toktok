package X;

import android.R;
import android.widget.CompoundButton;

/* renamed from: X.2HM, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2HM extends AbstractC534928b<CompoundButton> {
    @Override // X.QXX
    public final int[] LLLLLLL() {
        return new int[]{R.attr.button, com.zhiliaoapp.musically.R.attr.a0n, com.zhiliaoapp.musically.R.attr.a0o, com.zhiliaoapp.musically.R.attr.aqi};
    }

    public C2HM(CompoundButton compoundButton) {
        super(compoundButton);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    @Override // X.AbstractC534928b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLLLZIL(android.content.res.TypedArray r6) {
        /*
            r5 = this;
            int r0 = r6.getIndexCount()
            r4 = 0
            if (r0 <= 0) goto L2e
            boolean r0 = r6.hasValue(r4)
            if (r0 == 0) goto L23
            int r2 = r6.getResourceId(r4, r4)
            if (r2 == 0) goto L23
            T extends android.view.View r0 = r5.LJLIL
            r1 = r0
            android.widget.CompoundButton r1 = (android.widget.CompoundButton) r1
            android.content.Context r0 = r0.getContext()
            android.graphics.drawable.Drawable r0 = X.C20110qd.LIZ(r0, r2)
            r1.setButtonDrawable(r0)
        L23:
            T extends android.view.View r1 = r5.LJLIL
            android.widget.CompoundButton r1 = (android.widget.CompoundButton) r1
            android.graphics.drawable.Drawable r0 = r6.getDrawable(r4)
            r1.setButtonDrawable(r0)
        L2e:
            r1 = 3
            boolean r0 = r6.hasValue(r1)
            r3 = 1
            if (r0 == 0) goto L4d
            int r2 = r6.getResourceId(r1, r4)
            if (r2 == 0) goto L4d
            T extends android.view.View r0 = r5.LJLIL     // Catch: android.content.res.Resources.NotFoundException -> L4d
            r1 = r0
            android.widget.CompoundButton r1 = (android.widget.CompoundButton) r1     // Catch: android.content.res.Resources.NotFoundException -> L4d
            android.content.Context r0 = r0.getContext()     // Catch: android.content.res.Resources.NotFoundException -> L4d
            android.graphics.drawable.Drawable r0 = X.C20110qd.LIZ(r0, r2)     // Catch: android.content.res.Resources.NotFoundException -> L4d
            r1.setButtonDrawable(r0)     // Catch: android.content.res.Resources.NotFoundException -> L4d
            goto L69
        L4d:
            boolean r0 = r6.hasValue(r4)
            if (r0 == 0) goto L69
            int r2 = r6.getResourceId(r4, r4)
            if (r2 == 0) goto L69
            T extends android.view.View r0 = r5.LJLIL
            r1 = r0
            android.widget.CompoundButton r1 = (android.widget.CompoundButton) r1
            android.content.Context r0 = r0.getContext()
            android.graphics.drawable.Drawable r0 = X.C20110qd.LIZ(r0, r2)
            r1.setButtonDrawable(r0)
        L69:
            boolean r0 = r6.hasValue(r3)
            if (r0 == 0) goto L8c
            int r1 = r6.getResourceId(r3, r4)
            if (r1 == 0) goto L8c
            T extends android.view.View r0 = r5.LJLIL
            android.content.Context r0 = r0.getContext()
            android.content.res.ColorStateList r1 = X.C04330Ez.LIZJ(r1, r0)
            if (r1 != 0) goto L85
            android.content.res.ColorStateList r1 = r6.getColorStateList(r3)
        L85:
            T extends android.view.View r0 = r5.LJLIL
            android.widget.CompoundButton r0 = (android.widget.CompoundButton) r0
            X.C07L.LIZJ(r0, r1)
        L8c:
            r1 = 2
            boolean r0 = r6.hasValue(r1)
            if (r0 == 0) goto La4
            r0 = -1
            int r1 = r6.getInt(r1, r0)
            r0 = 0
            android.graphics.PorterDuff$Mode r1 = X.AnonymousClass179.LIZ(r1, r0)
            T extends android.view.View r0 = r5.LJLIL
            android.widget.CompoundButton r0 = (android.widget.CompoundButton) r0
            X.C07L.LIZLLL(r0, r1)
        La4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2HM.LLLLZIL(android.content.res.TypedArray):void");
    }
}
