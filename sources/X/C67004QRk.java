package X;

import Y.IDComparatorS39S0000000_11;
import com.bytedance.common.utility.Logger;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: X.QRk, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67004QRk {
    public final TreeMap<C67005QRl, C67005QRl> LIZIZ = new TreeMap<>(new IDComparatorS39S0000000_11(24));
    public final int LIZ = 20;

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    public final synchronized String LIZJ() {
        String str;
        str = "";
        try {
            StringBuilder sb = new StringBuilder();
            Iterator<Map.Entry<C67005QRl, C67005QRl>> it = this.LIZIZ.entrySet().iterator();
            int i = 0;
            while (it.hasNext()) {
                C67005QRl value = it.next().getValue();
                if (value != null) {
                    if (i != r4.size() - 1) {
                        sb.append(value.toString());
                        sb.append("@");
                    } else {
                        sb.append(value.toString());
                    }
                    i++;
                }
            }
            str = sb.toString();
            Logger.debug();
        } catch (Throwable unused) {
        }
        return str;
    }

    public final synchronized void LIZ(C67005QRl c67005QRl) {
        try {
            Logger.debug();
            if (Logger.debug()) {
                LIZJ();
            }
            if (this.LIZIZ.size() >= this.LIZ && !LIZIZ(c67005QRl)) {
                Logger.debug();
                TreeMap<C67005QRl, C67005QRl> treeMap = this.LIZIZ;
                treeMap.remove(treeMap.firstKey());
            }
            if (LIZIZ(c67005QRl)) {
                Logger.debug();
                this.LIZIZ.remove(c67005QRl);
            }
            this.LIZIZ.put(c67005QRl, c67005QRl);
            if (Logger.debug()) {
                LIZJ();
            }
            Logger.debug();
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    public final synchronized boolean LIZIZ(C67005QRl c67005QRl) {
        boolean containsKey;
        containsKey = this.LIZIZ.containsKey(c67005QRl);
        Logger.debug();
        return containsKey;
    }
}
