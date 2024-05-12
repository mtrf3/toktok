package X;

import com.bytedance.android.livesdk.model.Gift;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class UXJ implements UXX {
    public final UXI LIZ;
    public C68410Qt4 LIZIZ;

    public UXJ(UXO uxo) {
        this.LIZ = uxo;
    }

    @Override // X.UXX
    public final Object LIZ(String str) {
        C68410Qt4 c68410Qt4 = this.LIZIZ;
        if (c68410Qt4 != null) {
            String lowerCase = str.toLowerCase(Locale.ROOT);
            o.LJIIIIZZ(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            C58317Muf c58317Muf = (C58317Muf) c68410Qt4.LJLIL;
            ArrayList arrayList = new ArrayList();
            boolean z = false;
            int i = 0;
            int i2 = 0;
            while (i < lowerCase.length()) {
                int i3 = i2 + 1;
                String valueOf = String.valueOf(lowerCase.charAt(i));
                C58317Muf c58317Muf2 = c58317Muf;
                c58317Muf = c58317Muf.LIZ(valueOf, z);
                while (c58317Muf == null) {
                    c58317Muf2 = c58317Muf2.LIZ;
                    o.LJI(c58317Muf2);
                    c58317Muf = c58317Muf2.LIZ(valueOf, z);
                }
                java.util.Set<UXM> set = c58317Muf.LIZLLL;
                ArrayList arrayList2 = new ArrayList(C32I.LJJL(set, 10));
                for (UXM uxm : set) {
                    arrayList2.add(new UXT((i2 - uxm.LJLIL.length()) + 1, i2, new UXM(uxm.LJLILLLLZI, uxm.LJLIL, uxm.LJLJI, uxm.LJLJJI)));
                }
                arrayList.addAll(arrayList2);
                i++;
                i2 = i3;
                z = false;
            }
            ArrayList arrayList3 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                UXT uxt = (UXT) it.next();
                Gift LJJLIIJ = C45804HyK.LJJLIIJ(uxt.LJLJI.LJLILLLLZI);
                if (LJJLIIJ != null && LJJLIIJ.name != null) {
                    int i4 = uxt.LJLIL;
                    int i5 = uxt.LJLILLLLZI;
                    UXM uxm2 = uxt.LJLJI;
                    arrayList3.add(new UXT(i4, i5, new UXM(uxm2.LJLILLLLZI, uxm2.LJLIL, uxm2.LJLJI, uxm2.LJLJJI)));
                }
            }
            return arrayList3;
        }
        "Trie has not been prepared.".toString();
        throw new IllegalArgumentException("Trie has not been prepared.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x004a A[LOOP:0: B:11:0x0044->B:13:0x004a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ae A[LOOP:2: B:35:0x00a8->B:37:0x00ae, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01b2 A[LOOP:8: B:76:0x01b0->B:77:0x01b2, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    @Override // X.UXX
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(X.InterfaceC67352kd<? super X.C76800UCe> r19) {
        /*
            Method dump skipped, instructions count: 674
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.UXJ.LIZIZ(X.2kd):java.lang.Object");
    }
}
