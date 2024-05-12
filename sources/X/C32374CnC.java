package X;

import com.bytedance.android.livesdk.gift.assets.AssetsModel;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftLowFpsResourceSetting;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AqS155S0100000_5;

/* renamed from: X.CnC, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32374CnC extends AbstractC32375CnD {
    public C32374CnC() {
        C221108m2.LIZIZ(new AqS155S0100000_5(this, 314));
    }

    @Override // X.InterfaceC32340Cme
    public final boolean LIZ(AssetsModel assetsModel) {
        ArrayList arrayList = new ArrayList();
        if (!LiveGiftLowFpsResourceSetting.INSTANCE.alwaysUseTarget()) {
            C32420Cnw LJIIIZ = AbstractC32375CnD.LJIIIZ(assetsModel, 0);
            if (LJIIIZ != null) {
                arrayList.add(LJIIIZ);
            }
            C32420Cnw LIZLLL = AbstractC32375CnD.LIZLLL(assetsModel, 0);
            if (LIZLLL != null) {
                arrayList.add(LIZLLL);
            }
            C32420Cnw LJ = AbstractC32375CnD.LJ(assetsModel, 0);
            if (LJ != null) {
                arrayList.add(LJ);
            }
            C32420Cnw LJIIIIZZ = AbstractC32375CnD.LJIIIIZZ(assetsModel, 0);
            if (LJIIIIZZ != null) {
                arrayList.add(LJIIIIZZ);
            }
        } else {
            C32420Cnw LIZJ = LIZJ(assetsModel, 0);
            if (LIZJ != null) {
                arrayList.add(LIZJ);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (PU0.LJI().LJII((C32420Cnw) it.next())) {
                return true;
            }
        }
        return false;
    }

    @Override // X.AbstractC32375CnD, X.InterfaceC32340Cme
    public final C32420Cnw LIZIZ(AssetsModel assetsModel, int i) {
        if (!LiveGiftLowFpsResourceSetting.INSTANCE.alwaysUseTarget()) {
            return LIZJ(assetsModel, i);
        }
        boolean LJIILJJIL = AbstractC32375CnD.LJIILJJIL(assetsModel);
        C32420Cnw LIZLLL = AbstractC32375CnD.LIZLLL(assetsModel, i);
        C32420Cnw LJ = AbstractC32375CnD.LJ(assetsModel, i);
        C32420Cnw LJIIIIZZ = AbstractC32375CnD.LJIIIIZZ(assetsModel, i);
        if (LJIILJJIL) {
            if (PU0.LJI().LJII(LIZLLL)) {
                return LIZLLL;
            }
            if (PU0.LJI().LJII(LJ)) {
                return LJ;
            }
            if (PU0.LJI().LJII(LJIIIIZZ)) {
                return LJIIIIZZ;
            }
            return null;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0074, code lost:
    
        if (r8 != null) goto L34;
     */
    @Override // X.InterfaceC32340Cme
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C32420Cnw LIZJ(com.bytedance.android.livesdk.gift.assets.AssetsModel r15, int r16) {
        /*
            r14 = this;
            com.bytedance.android.livesdk.livesetting.gift.LiveGiftLowFpsResourceSetting r13 = com.bytedance.android.livesdk.livesetting.gift.LiveGiftLowFpsResourceSetting.INSTANCE
            boolean r0 = r13.markNonTargeted()
            r3 = r16
            if (r0 == 0) goto La6
            boolean r12 = X.AbstractC32375CnD.LJIILJJIL(r15)
            boolean r11 = X.AbstractC32375CnD.LJIIL(r15)
            com.bytedance.android.livesdk.livesetting.gift.LiveGiftByteVC1OptResourceSetting r1 = com.bytedance.android.livesdk.livesetting.gift.LiveGiftByteVC1OptResourceSetting.INSTANCE
            boolean r0 = r1.getValue()
            r10 = 0
            if (r0 == 0) goto La3
            X.Cnw r8 = X.AbstractC32375CnD.LIZLLL(r15, r3)
        L1f:
            boolean r0 = r1.getValue()
            if (r0 == 0) goto La1
            X.Cnw r7 = X.AbstractC32375CnD.LJ(r15, r3)
        L29:
            X.Cnw r6 = X.AbstractC32375CnD.LJIIIIZZ(r15, r3)
            X.Cnw r9 = X.AbstractC32375CnD.LJIIIZ(r15, r3)
            X.PU0 r0 = X.PU0.LJI()
            boolean r0 = r0.LJII(r8)
            r5 = 0
            r4 = 1
            if (r0 == 0) goto L9f
            if (r12 == 0) goto L42
            X.C32366Cn4.LJIIIIZZ(r15)
        L42:
            r3 = 1
        L43:
            X.PU0 r0 = X.PU0.LJI()
            boolean r0 = r0.LJII(r7)
            if (r0 == 0) goto L9d
            X.C32366Cn4.LJIIIIZZ(r15)
            r2 = 1
        L51:
            X.PU0 r0 = X.PU0.LJI()
            boolean r0 = r0.LJII(r6)
            if (r0 == 0) goto L9b
            if (r12 == 0) goto L60
            X.C32366Cn4.LJIIIIZZ(r15)
        L60:
            r1 = 1
        L61:
            boolean r0 = r13.alwaysUseTarget()
            if (r0 == 0) goto L6d
            if (r12 == 0) goto L72
            if (r9 == 0) goto L72
        L6b:
            r10 = r9
        L6c:
            return r10
        L6d:
            if (r3 == 0) goto L78
            if (r8 == 0) goto L78
            goto L76
        L72:
            if (r11 == 0) goto L82
            if (r8 == 0) goto L82
        L76:
            r10 = r8
            goto L6c
        L78:
            if (r2 == 0) goto L7e
            if (r7 == 0) goto L7e
            r10 = r7
            goto L6c
        L7e:
            if (r1 == 0) goto L84
            if (r6 == 0) goto L84
        L82:
            r10 = r6
            goto L6c
        L84:
            if (r9 != 0) goto L6b
            r2 = 3
            X.Cnw[] r1 = new X.C32420Cnw[r2]
            r1[r5] = r8
            r1[r4] = r7
            r0 = 2
            r1[r0] = r6
        L90:
            r0 = r1[r5]
            if (r0 != 0) goto L99
            int r5 = r5 + 1
            if (r5 >= r2) goto L6c
            goto L90
        L99:
            r10 = r0
            goto L6c
        L9b:
            r1 = 0
            goto L61
        L9d:
            r2 = 0
            goto L51
        L9f:
            r3 = 0
            goto L43
        La1:
            r7 = r10
            goto L29
        La3:
            r8 = r10
            goto L1f
        La6:
            X.Cnw r2 = X.AbstractC32375CnD.LJIIIIZZ(r15, r3)
            X.PU0 r0 = X.PU0.LJI()
            boolean r0 = r0.LJII(r2)
            if (r0 == 0) goto Lb5
            return r2
        Lb5:
            X.Cnw r1 = X.AbstractC32375CnD.LJ(r15, r3)
            X.PU0 r0 = X.PU0.LJI()
            boolean r0 = r0.LJII(r1)
            if (r0 == 0) goto Lc4
            return r1
        Lc4:
            X.Cnw r1 = X.AbstractC32375CnD.LIZLLL(r15, r3)
            X.PU0 r0 = X.PU0.LJI()
            boolean r0 = r0.LJII(r1)
            if (r0 == 0) goto Ld3
            return r1
        Ld3:
            X.Cnw r0 = X.AbstractC32375CnD.LJIIIZ(r15, r3)
            if (r0 == 0) goto Lda
            return r0
        Lda:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32374CnC.LIZJ(com.bytedance.android.livesdk.gift.assets.AssetsModel, int):X.Cnw");
    }
}
