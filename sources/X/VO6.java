package X;

import com.lynx.jsbridge.LynxIntersectionObserverModule;

/* loaded from: classes15.dex */
public final class VO6 extends VO1 {
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ int LJLJJI;
    public final /* synthetic */ LynxIntersectionObserverModule LJLJJL;

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0054, code lost:
    
        if (r2 != null) goto L20;
     */
    @Override // X.VO1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ() {
        /*
            r9 = this;
            com.lynx.jsbridge.LynxIntersectionObserverModule r0 = r9.LJLJJL
            X.VNU r0 = r0.mLynxContext
            X.VNq r1 = r0.LIZJ()
            int r0 = r9.LJLILLLLZI
            X.VOC r4 = r1.LJIIJ(r0)
            if (r4 == 0) goto L1c
            java.lang.String r8 = r9.LJLJI
            int r5 = r9.LJLJJI
            java.lang.String r0 = "#"
            boolean r0 = r8.startsWith(r0)
            if (r0 != 0) goto L1d
        L1c:
            return
        L1d:
            X.VNU r0 = r4.LIZIZ()
            r3 = 1
            r7 = 4
            java.lang.String r6 = "LynxIntersectionObserver"
            if (r0 != 0) goto L3e
            java.lang.String r0 = "observer failed because context is null"
            com.lynx.tasm.base.LLog.LIZLLL(r7, r6, r0)
        L2c:
            r1 = 3
            java.lang.String r0 = "Can't find element, finding in element"
            com.lynx.tasm.base.LLog.LIZLLL(r1, r6, r0)
            X.VOR r0 = r4.LIZLLL()
            if (r0 != 0) goto L57
            java.lang.String r0 = "observer failed because UIOwner is null"
            com.lynx.tasm.base.LLog.LIZLLL(r7, r6, r0)
            goto L1c
        L3e:
            X.VNU r0 = r4.LIZIZ()
            java.lang.String r2 = r8.substring(r3)
            com.lynx.tasm.behavior.ui.LynxBaseUI r1 = r4.LIZLLL
            java.lang.ref.WeakReference<X.VOR> r0 = r0.LJLLI
            java.lang.Object r0 = r0.get()
            if (r0 == 0) goto L2c
            com.lynx.tasm.behavior.ui.LynxBaseUI r2 = X.VOR.LJII(r2, r1)
            if (r2 != 0) goto L65
            goto L2c
        L57:
            X.VOR r1 = r4.LIZLLL()
            java.lang.String r0 = r8.substring(r3)
            com.lynx.tasm.behavior.ui.LynxBaseUI r2 = r1.LJI(r0)
            if (r2 == 0) goto L1c
        L65:
            r1 = 0
        L66:
            java.util.ArrayList<X.VOB> r0 = r4.LJIIL
            int r0 = r0.size()
            if (r1 >= r0) goto L7e
            java.util.ArrayList<X.VOB> r0 = r4.LJIIL
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r0, r1)
            X.VOB r0 = (X.VOB) r0
            com.lynx.tasm.behavior.ui.LynxBaseUI r0 = r0.LIZ
            if (r0 != r2) goto L7b
            goto L1c
        L7b:
            int r1 = r1 + 1
            goto L66
        L7e:
            X.VOB r1 = new X.VOB
            r1.<init>()
            r1.LIZ = r2
            r1.LIZIZ = r5
            java.util.ArrayList<X.VOB> r0 = r4.LJIIL
            r0.add(r1)
            android.graphics.Rect r0 = r4.LIZJ()
            r4.LIZ(r1, r0, r3)
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.VO6.LIZ():void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VO6(LynxIntersectionObserverModule lynxIntersectionObserverModule, VNU vnu, int i, String str, int i2) {
        super(vnu);
        this.LJLJJL = lynxIntersectionObserverModule;
        this.LJLILLLLZI = i;
        this.LJLJI = str;
        this.LJLJJI = i2;
    }
}
