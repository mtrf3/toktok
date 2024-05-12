package X;

import X.C0M9;
import android.os.Bundle;
import android.os.Handler;
import android.os.Messenger;
import androidx.mediarouter.media.MediaRouteProviderService;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.Zgy, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public class C90592Zgy extends ZXV {
    public final C1HQ LJLJLJ;
    public final Handler LJLJLLL;
    public final java.util.Map<String, Integer> LJLL;
    public final /* synthetic */ C90864ZlM LJLLI;

    @Override // X.ZXV
    public final Bundle LIZ(C90099ZXr c90099ZXr) {
        if (this.LJLL.isEmpty()) {
            return super.LIZ(c90099ZXr);
        }
        ArrayList arrayList = new ArrayList();
        for (C90089ZXh c90089ZXh : c90099ZXr.LIZIZ) {
            if (this.LJLL.containsKey(c90089ZXh.LIZLLL())) {
                C90088ZXg c90088ZXg = new C90088ZXg(c90089ZXh);
                c90088ZXg.LIZ.putBoolean("enabled", false);
                arrayList.add(c90088ZXg.LIZIZ());
            } else {
                arrayList.add(c90089ZXh);
            }
        }
        C90098ZXq c90098ZXq = new C90098ZXq(c90099ZXr);
        if (arrayList.isEmpty()) {
            c90098ZXq.LIZ = null;
        } else {
            c90098ZXq.LIZ = new ArrayList(arrayList);
        }
        return super.LIZ(new C90099ZXr(c90098ZXq.LIZ, c90098ZXq.LIZIZ));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.ZXV
    public final boolean LJFF(int i) {
        C90086ZXe c90086ZXe;
        C90099ZXr c90099ZXr;
        C90087ZXf c90087ZXf = this.LJLLI.LJ;
        String str = c90087ZXf.LJLJJI.get(i);
        if (str != null) {
            c90087ZXf.LJLJJI.remove(i);
            synchronized (c90087ZXf.LJLIL) {
                c90086ZXe = (C90086ZXe) c90087ZXf.LJLJI.remove(str);
            }
            if (c90086ZXe != null) {
                c90086ZXe.LIZIZ(false);
            }
        }
        AbstractC90096ZXo abstractC90096ZXo = this.LJLJJL.get(i);
        if (abstractC90096ZXo != null) {
            Iterator it = ((C0M9.b) this.LJLJLJ.entrySet()).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                if (entry.getValue() == abstractC90096ZXo) {
                    this.LJLJLJ.remove(entry.getKey());
                    break;
                }
            }
        }
        Iterator<Map.Entry<String, Integer>> it2 = this.LJLL.entrySet().iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Map.Entry<String, Integer> next = it2.next();
            if (next.getValue().intValue() == i) {
                if (this.LJLL.remove(next.getKey()) != null && (c90099ZXr = this.LJLLI.LIZ.LJLJJI.LJLJL) != null) {
                    MediaRouteProviderService.LJ(this.LJLIL, 5, 0, 0, LIZ(c90099ZXr), null);
                }
            }
        }
        return super.LJFF(i);
    }

    @Override // X.ZXV
    public final Bundle LIZIZ(int i, String str) {
        Bundle LIZIZ = super.LIZIZ(i, str);
        if (LIZIZ != null && this.LJLJI != null) {
            this.LJLLI.LJ.LJ(this, this.LJLJJL.get(i), i, this.LJLJI, str);
        }
        return LIZIZ;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003c, code lost:
    
        if (r2 != false) goto L12;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.ZXV
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZJ(int r10, java.lang.String r11, java.lang.String r12) {
        /*
            r9 = this;
            r4 = r9
            X.1HQ r1 = r4.LJLJLJ
            r0 = 0
            r8 = r11
            java.lang.Object r1 = r1.getOrDefault(r8, r0)
            r6 = r10
            if (r1 == 0) goto L13
            android.util.SparseArray<X.ZXo> r0 = r4.LJLJJL
            r0.put(r6, r1)
            r0 = 1
            return r0
        L13:
            boolean r2 = super.LIZJ(r6, r8, r12)
            if (r12 != 0) goto L3c
            if (r2 == 0) goto L3b
            java.lang.String r0 = r4.LJLJI
            if (r0 == 0) goto L30
            X.ZlM r0 = r4.LJLLI
            X.ZXf r3 = r0.LJ
            android.util.SparseArray<X.ZXo> r0 = r4.LJLJJL
            java.lang.Object r5 = r0.get(r6)
            X.ZXo r5 = (X.AbstractC90096ZXo) r5
            java.lang.String r7 = r4.LJLJI
            r3.LJ(r4, r5, r6, r7, r8)
        L30:
            X.1HQ r1 = r4.LJLJLJ
            android.util.SparseArray<X.ZXo> r0 = r4.LJLJJL
            java.lang.Object r0 = r0.get(r6)
            r1.put(r8, r0)
        L3b:
            return r2
        L3c:
            if (r2 == 0) goto L3b
            goto L30
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C90592Zgy.LIZJ(int, java.lang.String, java.lang.String):boolean");
    }

    @Override // X.ZXV
    public final void LJI(AbstractC90599Zh5 abstractC90599Zh5, C90089ZXh c90089ZXh, Collection<C90092ZXk> collection) {
        super.LJI(abstractC90599Zh5, c90089ZXh, collection);
        C90087ZXf c90087ZXf = this.LJLLI.LJ;
        if (c90087ZXf != null) {
            c90087ZXf.LJFF(abstractC90599Zh5, c90089ZXh, collection);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C90592Zgy(C90864ZlM c90864ZlM, Messenger messenger, int i, String str) {
        super(c90864ZlM, messenger, i, str);
        this.LJLLI = c90864ZlM;
        this.LJLJLJ = new C1HQ();
        this.LJLJLLL = new Handler(C16880lQ.LLJJJJ());
        if (i < 4) {
            this.LJLL = new C1HQ();
        } else {
            this.LJLL = Collections.emptyMap();
        }
    }
}
