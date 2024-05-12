package X;

/* renamed from: X.2I4, reason: invalid class name */
/* loaded from: classes.dex */
public final /* synthetic */ class C2I4 extends TBS implements InterfaceC88472Yns<C14550hf, C76800UCe> {
    public C2I4(C14560hg c14560hg) {
        super(1, c14560hg, C14560hg.class, "onClipEvent", "onClipEvent(Lcom/bytedance/android/live/linkmic/LivePublicScreenClipEvent;)V", 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x007f, code lost:
    
        if (r4.LJI == r7) goto L9;
     */
    @Override // X.InterfaceC88472Yns
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C76800UCe invoke(X.C14550hf r10) {
        /*
            r9 = this;
            X.0hf r10 = (X.C14550hf) r10
            java.lang.String r0 = "p0"
            kotlin.jvm.internal.o.LJIIIZ(r10, r0)
            java.lang.Object r4 = r9.receiver
            X.0hg r4 = (X.C14560hg) r4
            r4.getClass()
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "onClipEvent => "
            r1.append(r0)
            java.util.List<android.graphics.Rect> r0 = r10.LIZ
            r1.append(r0)
            java.lang.String r0 = " , size = "
            r1.append(r0)
            java.util.List<android.graphics.Rect> r0 = r10.LIZ
            int r0 = r0.size()
            r1.append(r0)
            java.lang.String r1 = X.X1D.LIZIZ(r1)
            java.lang.String r0 = "maskhollow"
            X.C0NB.LIZIZ(r0, r1)
            android.view.View r5 = r4.LJ
            if (r5 == 0) goto L5f
            boolean r0 = r5 instanceof X.C54232Ax
            if (r0 == 0) goto L5f
            java.util.List<android.graphics.Rect> r8 = r10.LIZ
            float r7 = r10.LIZIZ
            java.util.List<android.graphics.Rect> r6 = r4.LJFF
            int r1 = r6.size()
            int r0 = r8.size()
            if (r1 == r0) goto L62
        L4b:
            r4.LJFF = r8
            r4.LJI = r7
            java.util.List<android.graphics.Rect> r0 = r10.LIZ
            java.util.List r1 = r4.LIZ(r0)
            X.2Ax r5 = (X.C54232Ax) r5
            float r0 = r10.LIZIZ
            r5.LIZ(r1, r0)
            r0 = 0
            r4.LIZIZ = r0
        L5f:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L62:
            int r3 = r6.size()
            r2 = 0
        L67:
            if (r2 >= r3) goto L7b
            java.lang.Object r1 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r6, r2)
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r8, r2)
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 != 0) goto L78
            goto L4b
        L78:
            int r2 = r2 + 1
            goto L67
        L7b:
            float r0 = r4.LJI
            int r0 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r0 != 0) goto L4b
            goto L5f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2I4.invoke(java.lang.Object):java.lang.Object");
    }
}
