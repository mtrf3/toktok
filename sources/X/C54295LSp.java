package X;

import Y.IDComparatorS37S0000000_9;
import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.LSp, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public class C54295LSp {
    public final List<C54296LSq> LIZ = new ArrayList();
    public InterfaceC54281LSb LIZIZ;

    public final C54297LSr LIZJ(FragmentManager fragmentManager) {
        int size;
        List<C54296LSq> list = this.LIZ;
        if (C79004UzY.LJJIFFI(list)) {
            size = 0;
        } else {
            HashSet hashSet = new HashSet();
            Iterator it = ((ArrayList) list).iterator();
            while (it.hasNext()) {
                C54296LSq c54296LSq = (C54296LSq) it.next();
                if (c54296LSq != null) {
                    hashSet.add(Integer.valueOf(c54296LSq.LJ));
                }
            }
            size = hashSet.size();
        }
        C54297LSr c54297LSr = new C54297LSr(fragmentManager, size);
        c54297LSr.LJLL = this.LIZIZ;
        List<C54296LSq> list2 = this.LIZ;
        c54297LSr.LJLJL = list2;
        if (!C79004UzY.LJJIFFI(list2)) {
            c54297LSr.LJLJLJ = new HashMap<>(c54297LSr.LJLJL.size());
            c54297LSr.LJLJLLL = new ArrayList();
            for (C54296LSq c54296LSq2 : c54297LSr.LJLJL) {
                if (c54296LSq2 != null) {
                    c54297LSr.LJLJLJ.put(c54296LSq2.LIZIZ, c54296LSq2);
                    int i = c54296LSq2.LJ;
                    if (i >= ((ArrayList) c54297LSr.LJLJLLL).size()) {
                        ListProtector.add(c54297LSr.LJLJLLL, i, c54296LSq2);
                    }
                }
            }
            InterfaceC54281LSb interfaceC54281LSb = c54297LSr.LJLL;
            if (interfaceC54281LSb != null) {
                interfaceC54281LSb.LIZJ(c54297LSr.LJLJLLL);
            }
            ((ArrayList) c54297LSr.LJLJLLL).size();
        }
        return c54297LSr;
    }

    public final void LIZ(Bundle bundle, Class cls) {
        int i;
        if (C79004UzY.LJJIFFI(this.LIZ)) {
            i = 0;
        } else {
            Collections.sort(this.LIZ, new IDComparatorS37S0000000_9(3));
            i = 1;
            for (int i2 = 1; i2 < ((ArrayList) this.LIZ).size(); i2++) {
                if (((C54296LSq) ListProtector.get(this.LIZ, i2 - 1)).LJ != ((C54296LSq) ListProtector.get(this.LIZ, i2)).LJ) {
                    i++;
                }
            }
        }
        LIZIZ(cls, "page_profile", i, bundle);
    }

    public final void LIZIZ(Class cls, String str, int i, Bundle bundle) {
        ((ArrayList) this.LIZ).add(new C54296LSq(cls, str, i, bundle));
    }
}
