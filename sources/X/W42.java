package X;

import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class W42 extends AbstractC32664Crs<C81392Vwy<W5A>> {
    public final /* synthetic */ C81159VtD LIZ;

    @Override // X.AbstractC32664Crs, X.IHD
    public final void LIZ(W4W<C81392Vwy<W5A>> dataSource) {
        o.LJIIIZ(dataSource, "dataSource");
    }

    @Override // X.AbstractC32664Crs, X.IHD
    public final void LIZJ(AbstractC48384Iyq abstractC48384Iyq) {
    }

    public W42(C81159VtD this$0) {
        o.LJIIIZ(this$0, "this$0");
        this.LIZ = this$0;
    }

    @Override // X.AbstractC32664Crs
    public final void LJ(W4W<C81392Vwy<W5A>> w4w) {
        Throwable LJFF;
        if (w4w == null) {
            LJFF = null;
        } else {
            LJFF = w4w.LJFF();
        }
        o.LJIILLIIL(LJFF, "onFailureImpl : ");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0072, code lost:
    
        if (r0 == null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:?, code lost:
    
        return;
     */
    @Override // X.AbstractC32664Crs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJFF(X.W4W<X.C81392Vwy<X.W5A>> r8) {
        /*
            r7 = this;
            if (r8 == 0) goto L8
            boolean r0 = r8.LIZIZ()
            if (r0 != 0) goto L9
        L8:
            return
        L9:
            java.lang.Object r4 = r8.getResult()
            X.Vwy r4 = (X.C81392Vwy) r4
            X.VtD r0 = r7.LIZ
            java.lang.ref.WeakReference<android.widget.ImageView> r0 = r0.LIZIZ
            java.lang.Object r5 = r0.get()
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            if (r4 == 0) goto L8
            if (r5 == 0) goto L9c
            java.lang.Object r6 = r4.LJI()     // Catch: java.lang.Throwable -> L89
            java.lang.String r0 = "ref.get()"
            kotlin.jvm.internal.o.LJIIIIZZ(r6, r0)     // Catch: java.lang.Throwable -> L89
            X.W5A r6 = (X.W5A) r6     // Catch: java.lang.Throwable -> L89
            boolean r0 = r6 instanceof X.W5B     // Catch: java.lang.Throwable -> L89
            if (r0 == 0) goto L39
            X.VtD r2 = r7.LIZ     // Catch: java.lang.Throwable -> L89
            kotlin.jvm.internal.AqS161S0200000_14 r1 = new kotlin.jvm.internal.AqS161S0200000_14     // Catch: java.lang.Throwable -> L89
            r0 = 54
            r1.<init>(r5, r6, r0)     // Catch: java.lang.Throwable -> L89
            r2.LIZ(r1)     // Catch: java.lang.Throwable -> L89
            goto L6e
        L39:
            boolean r0 = r6 instanceof X.C81831W9r     // Catch: java.lang.Throwable -> L89
            if (r0 == 0) goto L52
        L3e:
            X.W8E r0 = X.W8E.LJII()     // Catch: java.lang.Throwable -> L89
            X.W86 r1 = r0.LIZ()     // Catch: java.lang.Throwable -> L89
            if (r1 != 0) goto L49
            goto L6e
        L49:
            android.content.Context r0 = r5.getContext()     // Catch: java.lang.Throwable -> L89
            X.W4N r0 = r1.getAnimatedDrawableFactory(r0)     // Catch: java.lang.Throwable -> L89
            goto L6c
        L52:
            int r2 = r6.getSizeInBytes()     // Catch: java.lang.Throwable -> L89
            byte[] r1 = new byte[r2]     // Catch: java.lang.Throwable -> L89
            r0 = 0
            android.graphics.Bitmap r3 = android.graphics.BitmapFactory.decodeByteArray(r1, r0, r2)     // Catch: java.lang.Throwable -> L89
            if (r3 == 0) goto L6e
            X.VtD r2 = r7.LIZ     // Catch: java.lang.Throwable -> L89
            kotlin.jvm.internal.AqS161S0200000_14 r1 = new kotlin.jvm.internal.AqS161S0200000_14     // Catch: java.lang.Throwable -> L89
            r0 = 56
            r1.<init>(r5, r3, r0)     // Catch: java.lang.Throwable -> L89
            r2.LIZ(r1)     // Catch: java.lang.Throwable -> L89
            goto L6e
        L6c:
            if (r0 != 0) goto L75
        L6e:
            X.VtD r0 = r7.LIZ
            X.Vwy<X.W5A> r0 = r0.LJ
            if (r0 != 0) goto L98
            goto L92
        L75:
            X.VtD r3 = r7.LIZ     // Catch: java.lang.Throwable -> L89
            android.graphics.drawable.Drawable r2 = r0.LIZIZ(r6)     // Catch: java.lang.Throwable -> L89
            if (r2 != 0) goto L7e
            goto L6e
        L7e:
            kotlin.jvm.internal.AqS161S0200000_14 r1 = new kotlin.jvm.internal.AqS161S0200000_14     // Catch: java.lang.Throwable -> L89
            r0 = 55
            r1.<init>(r5, r2, r0)     // Catch: java.lang.Throwable -> L89
            r3.LIZ(r1)     // Catch: java.lang.Throwable -> L89
            goto L6e
        L89:
            X.C81392Vwy.LJ(r4)     // Catch: java.lang.Throwable -> La1
            X.VtD r0 = r7.LIZ
            X.Vwy<X.W5A> r0 = r0.LJ
            if (r0 != 0) goto L98
        L92:
            X.VtD r0 = r7.LIZ
            r0.LJ = r4
            goto L8
        L98:
            X.C81392Vwy.LJ(r0)
            goto L92
        L9c:
            X.C81392Vwy.LJ(r4)
            goto L8
        La1:
            r1 = move-exception
            X.VtD r0 = r7.LIZ
            X.Vwy<X.W5A> r0 = r0.LJ
            if (r0 != 0) goto Lad
        La8:
            X.VtD r0 = r7.LIZ
            r0.LJ = r4
            throw r1
        Lad:
            X.C81392Vwy.LJ(r0)
            goto La8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.W42.LJFF(X.W4W):void");
    }
}
