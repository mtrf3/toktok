package X;

import android.content.Context;
import android.view.OrientationEventListener;

/* renamed from: X.VFq, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C79438VFq extends OrientationEventListener {
    public final /* synthetic */ C79435VFn LIZ;

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0018, code lost:
    
        if (r5 >= 360) goto L13;
     */
    @Override // android.view.OrientationEventListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onOrientationChanged(int r5) {
        /*
            r4 = this;
            X.VFn r3 = r4.LIZ
            X.VFo r2 = r3.LJJLI
            if (r2 == 0) goto L3b
            int r1 = r3.LJJLJ
            r0 = 2
            if (r1 == r0) goto L64
            boolean r0 = r3.LJJLIIIJ
            if (r0 == 0) goto L64
            r0 = 1
        L10:
            r2.LJLJJL = r0
            r3 = 315(0x13b, float:4.41E-43)
            if (r5 < r3) goto L3c
            r0 = 360(0x168, float:5.04E-43)
            if (r5 < r0) goto L42
        L1a:
            android.view.Display r0 = r2.LJLJL
            if (r0 == 0) goto L3b
            X.VFs r0 = r2.LJLJJLL
            int r1 = r0.ordinal()
            android.view.Display r0 = r2.LJLJL
            int r0 = r0.getRotation()
            int r1 = r1 - r0
            if (r1 >= 0) goto L33
            X.VFs[] r0 = X.EnumC79440VFs.values()
            int r0 = r0.length
            int r1 = r1 + r0
        L33:
            X.VFs[] r0 = X.EnumC79440VFs.values()
            r0 = r0[r1]
            r2.LJLJLJ = r0
        L3b:
            return
        L3c:
            r0 = 45
            if (r5 < 0) goto L1a
            if (r5 >= r0) goto L47
        L42:
            X.VFs r0 = X.EnumC79440VFs.PORTRAIT
            r2.LJLJJLL = r0
            goto L1a
        L47:
            r1 = 135(0x87, float:1.89E-43)
            if (r5 < r0) goto L1a
            if (r5 >= r1) goto L52
            X.VFs r0 = X.EnumC79440VFs.LANDSCAPE_RIGHT
            r2.LJLJJLL = r0
            goto L1a
        L52:
            r0 = 225(0xe1, float:3.15E-43)
            if (r5 < r1) goto L1a
            if (r5 >= r0) goto L5d
            X.VFs r0 = X.EnumC79440VFs.UPSIDE_DOWN
            r2.LJLJJLL = r0
            goto L1a
        L5d:
            if (r5 >= r3) goto L1a
            X.VFs r0 = X.EnumC79440VFs.LANDSCAPE_LEFT
            r2.LJLJJLL = r0
            goto L1a
        L64:
            r0 = 0
            goto L10
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C79438VFq.onOrientationChanged(int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C79438VFq(C79435VFn c79435VFn, Context context) {
        super(context);
        this.LIZ = c79435VFn;
    }
}
