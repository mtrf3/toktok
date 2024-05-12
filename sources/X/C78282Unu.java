package X;

import android.graphics.Bitmap;
import android.view.View;
import com.bytedance.android.monitorV2.webview.blank.WebBlankDetectorDefault;

/* renamed from: X.Unu, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78282Unu extends AbstractC65781Prl implements InterfaceC88472Yns<C78285Unx, C76800UCe> {
    public final /* synthetic */ WebBlankDetectorDefault LJLIL;
    public final /* synthetic */ View LJLILLLLZI;
    public final /* synthetic */ float LJLJI;
    public final /* synthetic */ Bitmap.Config LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C78282Unu(WebBlankDetectorDefault webBlankDetectorDefault, View view, float f, Bitmap.Config config) {
        super(1);
        this.LJLIL = webBlankDetectorDefault;
        this.LJLILLLLZI = view;
        this.LJLJI = f;
        this.LJLJJI = config;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0061, code lost:
    
        if (r4 == null) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0088, code lost:
    
        r2 = new android.graphics.Canvas(r4);
        r2.scale(r6, r6);
        r3.computeScroll();
        r2.translate(-r3.getScrollX(), -r3.getScrollY());
        X.C37203Eit.LIZJ.getClass();
        X.C39214FaE.LIZ(r3, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00aa, code lost:
    
        if (r8 == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00ac, code lost:
    
        r0 = X.C78283Unv.LIZ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00ae, code lost:
    
        if (r0 == null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00b4, code lost:
    
        if (r0.isRecycled() != false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00b6, code lost:
    
        r0 = X.C78283Unv.LIZ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00b8, code lost:
    
        if (r0 == null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00ba, code lost:
    
        r0.recycle();
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00c0, code lost:
    
        kotlin.jvm.internal.o.LJIIZILJ();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00c3, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00bd, code lost:
    
        X.C78283Unv.LIZ = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0086, code lost:
    
        if (r4 != null) goto L27;
     */
    @Override // X.InterfaceC88472Yns
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C76800UCe invoke(X.C78285Unx r13) {
        /*
            r12 = this;
            X.Unx r13 = (X.C78285Unx) r13
            java.lang.String r0 = "$receiver"
            kotlin.jvm.internal.o.LJIIJ(r13, r0)
            long r10 = java.lang.System.currentTimeMillis()
            android.view.View r3 = r12.LJLILLLLZI
            float r6 = r12.LJLJI
            android.graphics.Bitmap$Config r7 = r12.LJLJJI
            java.lang.String r0 = "view"
            kotlin.jvm.internal.o.LJIIJ(r3, r0)
            java.lang.String r0 = "config"
            kotlin.jvm.internal.o.LJIIJ(r7, r0)
            X.FxO r0 = new X.FxO
            r0.<init>()
            int r0 = r3.getWidth()
            float r0 = (float) r0
            float r0 = r0 * r6
            r1 = 1056964608(0x3f000000, float:0.5)
            float r0 = r0 + r1
            int r5 = (int) r0
            int r0 = r3.getHeight()
            float r0 = (float) r0
            float r0 = r0 * r6
            float r0 = r0 + r1
            int r2 = (int) r0
            if (r5 <= 0) goto L36
            if (r2 > 0) goto L3e
        L36:
            int r5 = r3.getWidth()
            int r2 = r3.getHeight()
        L3e:
            android.graphics.Bitmap r0 = X.C78283Unv.LIZ
            r9 = 0
            r8 = 1
            if (r0 == 0) goto L6c
            boolean r0 = r0.isRecycled()
            if (r0 != 0) goto L6c
            android.graphics.Bitmap r0 = X.C78283Unv.LIZ
            if (r0 == 0) goto L68
            int r0 = r0.getWidth()
            if (r0 != r5) goto L6c
            android.graphics.Bitmap r0 = X.C78283Unv.LIZ
            if (r0 == 0) goto L64
            int r0 = r0.getHeight()
            if (r0 != r2) goto L6c
            android.graphics.Bitmap r4 = X.C78283Unv.LIZ
            r8 = 0
            if (r4 != 0) goto L88
            goto L6c
        L64:
            kotlin.jvm.internal.o.LJIIZILJ()
            throw r9
        L68:
            kotlin.jvm.internal.o.LJIIZILJ()
            throw r9
        L6c:
            android.content.Context r1 = r3.getContext()     // Catch: java.lang.OutOfMemoryError -> Lc4
            java.lang.String r0 = "view.context"
            kotlin.jvm.internal.o.LJFF(r1, r0)     // Catch: java.lang.OutOfMemoryError -> Lc4
            android.content.res.Resources r1 = r1.getResources()     // Catch: java.lang.OutOfMemoryError -> Lc4
            java.lang.String r0 = "view.context.resources"
            kotlin.jvm.internal.o.LJFF(r1, r0)     // Catch: java.lang.OutOfMemoryError -> Lc4
            android.util.DisplayMetrics r0 = r1.getDisplayMetrics()     // Catch: java.lang.OutOfMemoryError -> Lc4
            android.graphics.Bitmap r4 = android.graphics.Bitmap.createBitmap(r0, r5, r2, r7)     // Catch: java.lang.OutOfMemoryError -> Lc4
            if (r4 == 0) goto Lc5
        L88:
            android.graphics.Canvas r2 = new android.graphics.Canvas
            r2.<init>(r4)
            r2.scale(r6, r6)
            r3.computeScroll()
            int r0 = r3.getScrollX()
            float r0 = (float) r0
            float r1 = -r0
            int r0 = r3.getScrollY()
            float r0 = (float) r0
            float r0 = -r0
            r2.translate(r1, r0)
            X.FaE r0 = X.C37203Eit.LIZJ
            r0.getClass()
            X.C39214FaE.LIZ(r3, r2)
            if (r8 == 0) goto Lbd
            android.graphics.Bitmap r0 = X.C78283Unv.LIZ
            if (r0 == 0) goto Lbd
            boolean r0 = r0.isRecycled()
            if (r0 != 0) goto Lbd
            android.graphics.Bitmap r0 = X.C78283Unv.LIZ
            if (r0 == 0) goto Lc0
            r0.recycle()
        Lbd:
            X.C78283Unv.LIZ = r4
            goto Lc5
        Lc0:
            kotlin.jvm.internal.o.LJIIZILJ()
            throw r9
        Lc4:
            r4 = r9
        Lc5:
            com.bytedance.android.monitorV2.webview.blank.WebBlankDetectorDefault r0 = r12.LJLIL
            r0.checkBlank(r4, r13)
            long r0 = java.lang.System.currentTimeMillis()
            long r0 = r0 - r10
            r13.LIZIZ = r0
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C78282Unu.invoke(java.lang.Object):java.lang.Object");
    }
}
