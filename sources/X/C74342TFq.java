package X;

import android.os.Bundle;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.AqS143S0200000_12;
import kotlin.jvm.internal.o;

/* renamed from: X.TFq, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74342TFq implements TE1 {
    public final java.util.Map<String, HashSet<String>> LIZ;
    public final ExecutorService LIZIZ;
    public final TEZ LIZJ;
    public final InterfaceC74343TFr LIZLLL;

    @Override // X.TE1
    public final void LIZLLL(int i) {
        if ((i != 0 || !o.LJ(this.LIZJ.LJJIL().LJLIL, "xssticker")) && this.LIZJ.LJJIJIIJIL() != -1) {
            this.LIZLLL.LIZJ(i, System.currentTimeMillis() - this.LIZJ.LJJIJIIJIL());
            this.LIZJ.LJJJJL(-1L);
            this.LIZLLL.LJFF().LIZ("shown_sticker");
        }
    }

    @Override // X.TE1
    public final void clear(String str) {
        HashSet hashSet = (HashSet) ((LinkedHashMap) this.LIZ).get(str);
        if (hashSet != null) {
            hashSet.clear();
        }
    }

    public C74342TFq(TEZ stickerDataManager, InterfaceC74343TFr stickerMobHelper) {
        o.LJIIIZ(stickerDataManager, "stickerDataManager");
        o.LJIIIZ(stickerMobHelper, "stickerMobHelper");
        this.LIZJ = stickerDataManager;
        this.LIZLLL = stickerMobHelper;
        this.LIZ = new LinkedHashMap();
        C38027EwB LIZ = C38028EwC.LIZ(FSY.SERIAL);
        LIZ.LIZIZ = "default_sticker_view_mob";
        this.LIZIZ = C38995FSd.LIZ(LIZ.LIZ());
    }

    @Override // X.TE1
    public final void LIZ(List<? extends Effect> list, List<String> list2, List<Integer> list3) {
        this.LIZLLL.LIZ(list, list2, list3);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    @Override // X.TE1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(int r12, java.lang.String r13, android.os.Bundle r14, X.InterfaceC88472Yns<? super java.lang.Integer, ? extends com.ss.android.ugc.effectmanager.effect.model.Effect> r15) {
        /*
            r11 = this;
            r5 = r11
            java.util.Map<java.lang.String, java.util.HashSet<java.lang.String>> r0 = r5.LIZ
            java.util.LinkedHashMap r0 = (java.util.LinkedHashMap) r0
            r7 = r13
            java.lang.Object r3 = r0.get(r7)
            java.util.HashSet r3 = (java.util.HashSet) r3
            if (r3 == 0) goto L82
        Le:
            r8 = r12
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
            java.lang.Object r6 = r15.invoke(r0)
            com.ss.android.ugc.effectmanager.effect.model.Effect r6 = (com.ss.android.ugc.effectmanager.effect.model.Effect) r6
            X.TEZ r0 = r5.LIZJ
            java.util.Map r0 = r0.LJJIIJZLJL()
            java.lang.Object r1 = r0.get(r7)
            java.util.List r1 = (java.util.List) r1
            r4 = 0
            if (r1 == 0) goto L80
            int r0 = r1.size()
            java.util.ListIterator r2 = r1.listIterator(r0)
        L30:
            boolean r0 = r2.hasPrevious()
            if (r0 == 0) goto L7e
            java.lang.Object r1 = r2.previous()
            r0 = r1
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            if (r8 <= r0) goto L30
        L43:
            java.lang.Integer r1 = (java.lang.Integer) r1
            if (r1 == 0) goto L80
            int r9 = r1.intValue()
        L4b:
            if (r6 == 0) goto L51
            java.lang.String r4 = r6.getEffectId()
        L51:
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto L7d
            kotlin.jvm.internal.o.LJI(r6)
            java.lang.String r0 = r6.getEffectId()
            boolean r0 = r3.contains(r0)
            if (r0 != 0) goto L7d
            X.TFp r4 = new X.TFp
            r10 = r14
            r4.<init>(r5, r6, r7, r8, r9, r10)
            java.util.concurrent.ExecutorService r2 = r5.LIZIZ
            Y.ARunnableS48S0100000_12 r1 = new Y.ARunnableS48S0100000_12
            r0 = 97
            r1.<init>(r4, r0)
            r2.submit(r1)
            java.lang.String r0 = r6.getEffectId()
            r3.add(r0)
        L7d:
            return
        L7e:
            r1 = r4
            goto L43
        L80:
            r9 = 0
            goto L4b
        L82:
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>()
            java.util.Map<java.lang.String, java.util.HashSet<java.lang.String>> r0 = r5.LIZ
            r0.put(r7, r3)
            goto Le
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C74342TFq.LIZJ(int, java.lang.String, android.os.Bundle, X.Yns):void");
    }

    @Override // X.TE1
    public final void LIZIZ(int i, int i2, String str, Bundle bundle, AqS143S0200000_12 aqS143S0200000_12) {
        if (i < 1) {
            i = 1;
        }
        int i3 = i2 + 1;
        while (i < i3) {
            LIZJ(i, str, bundle, aqS143S0200000_12);
            i++;
        }
    }
}
