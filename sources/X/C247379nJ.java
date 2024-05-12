package X;

import android.content.Context;
import android.view.View;
import com.bytedance.touchpoint.core.model.ReferralFeedBanner;
import com.bytedance.tux.input.TuxTextView;

/* renamed from: X.9nJ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C247379nJ implements AnonymousClass907 {
    public View LIZ;
    public W5G LIZIZ;
    public TuxTextView LIZJ;
    public TuxTextView LIZLLL;
    public C29701Eo LJ;
    public TuxTextView LJFF;
    public ReferralFeedBanner LJI;
    public View LJII;
    public View LJIIIIZZ;
    public View LJIIIZ;
    public View LJIIJ;
    public View LJIIJJI;
    public TuxTextView LJIIL;
    public Context LJIILIIL;
    public int LJIILJJIL = -1;

    @Override // X.AnonymousClass907
    public final void LIZIZ() {
        C29701Eo c29701Eo = this.LJ;
        if (c29701Eo != null) {
            c29701Eo.cancelAnimation();
        }
        C29701Eo c29701Eo2 = this.LJ;
        if (c29701Eo2 != null) {
            c29701Eo2.clearAnimation();
        }
    }

    @Override // X.AnonymousClass907
    public final void LIZJ() {
        View view = this.LIZ;
        if (view != null) {
            view.setVisibility(8);
        }
        View view2 = this.LJII;
        if (view2 != null) {
            view2.setVisibility(0);
        }
        View view3 = this.LJIIIZ;
        if (view3 != null) {
            view3.setVisibility(0);
        }
        View view4 = this.LJIIJ;
        if (view4 != null) {
            view4.setVisibility(0);
        }
        View view5 = this.LJIIIIZZ;
        if (view5 != null) {
            view5.setVisibility(0);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0082, code lost:
    
        if (X.C3C5.m10exceptionOrNullimpl(r7) != null) goto L29;
     */
    @Override // X.AnonymousClass907
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL() {
        /*
            r8 = this;
            com.bytedance.touchpoint.core.model.ReferralFeedBanner r0 = r8.LJI
            r7 = 0
            if (r0 == 0) goto L50
            java.util.List<com.bytedance.touchpoint.core.model.CompactPicture> r1 = r0.compactPictures
            if (r1 == 0) goto L50
            int r0 = r8.LJIILJJIL
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r1, r0)
            com.bytedance.touchpoint.core.model.CompactPicture r0 = (com.bytedance.touchpoint.core.model.CompactPicture) r0
            if (r0 == 0) goto L50
            com.bytedance.touchpoint.core.model.Animation r5 = r0.animation
            if (r5 == 0) goto L50
            java.lang.String r0 = r5.LJLIL
            r6 = 0
            if (r0 == 0) goto L22
            int r0 = r0.length()
            if (r0 != 0) goto L58
        L22:
            X.1Eo r0 = r8.LJ
            if (r0 == 0) goto L29
            r0.setRepeatCount(r6)
        L29:
            X.1Eo r0 = r8.LJ
            if (r0 == 0) goto L30
            r0.setFrame(r6)
        L30:
            X.1Eo r2 = r8.LJ
            if (r2 == 0) goto L3e
            Y.ALAdapterS3S0100000_4 r1 = new Y.ALAdapterS3S0100000_4
            r0 = 32
            r1.<init>(r8, r0)
            r2.addAnimatorListener(r1)
        L3e:
            X.1Eo r1 = r8.LJ
            if (r1 == 0) goto L47
            X.9nO r0 = new X.InterfaceC04760Gq() { // from class: X.9nO
                static {
                    /*
                        X.9nO r0 = new X.9nO
                        r0.<init>()
                        
                        // error: 0x0005: SPUT (r0 I:X.9nO) X.9nO.LIZ X.9nO
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C247429nO.<clinit>():void");
                }

                {
                    /*
                        r0 = this;
                        r0.<init>()
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C247429nO.<init>():void");
                }

                @Override // X.InterfaceC04760Gq
                public final /* bridge */ /* synthetic */ void onResult(java.lang.Object r1) {
                    /*
                        r0 = this;
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C247429nO.onResult(java.lang.Object):void");
                }
            }
            r1.setFailureListener(r0)
        L47:
            X.1Eo r1 = r8.LJ
            if (r1 == 0) goto L50
            java.lang.String r0 = r5.LJLIL
            r1.setImageAssetsFolder(r0)
        L50:
            X.1Eo r0 = r8.LJ
            if (r0 == 0) goto L57
            r0.playAnimation()
        L57:
            return
        L58:
            X.1Eo r4 = r8.LJ     // Catch: java.lang.Throwable -> L76
            if (r4 == 0) goto L72
            android.util.JsonReader r3 = new android.util.JsonReader     // Catch: java.lang.Throwable -> L76
            java.io.FileReader r2 = new java.io.FileReader     // Catch: java.lang.Throwable -> L76
            java.io.File r1 = new java.io.File     // Catch: java.lang.Throwable -> L76
            java.lang.String r0 = r5.LJLIL     // Catch: java.lang.Throwable -> L76
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L76
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L76
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L76
            r4.setAnimation(r3, r7)     // Catch: java.lang.Throwable -> L76
            X.UCe r7 = X.C76800UCe.LIZ     // Catch: java.lang.Throwable -> L76
        L72:
            X.C3C5.m7constructorimpl(r7)     // Catch: java.lang.Throwable -> L76
            goto L7e
        L76:
            r0 = move-exception
            X.3C4 r7 = X.C141335gf.LIZ(r0)
            X.C3C5.m7constructorimpl(r7)
        L7e:
            java.lang.Throwable r0 = X.C3C5.m10exceptionOrNullimpl(r7)
            if (r0 == 0) goto L22
            goto L50
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C247379nJ.LIZLLL():void");
    }

    @Override // X.AnonymousClass907
    public final boolean isShowing() {
        View view = this.LIZ;
        if (view == null || view.getVisibility() != 0) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x016f  */
    @Override // X.AnonymousClass907
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(android.view.ViewStub r21, android.content.Context r22, int r23, android.view.View r24, android.view.View r25, android.view.View r26, android.view.View r27, java.lang.String r28) {
        /*
            Method dump skipped, instructions count: 587
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C247379nJ.LIZ(android.view.ViewStub, android.content.Context, int, android.view.View, android.view.View, android.view.View, android.view.View, java.lang.String):void");
    }
}
