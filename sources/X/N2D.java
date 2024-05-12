package X;

import android.content.Context;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.shortcut.TiktokShortcutManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.AqS176S0100000_10;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class N2D<V> implements Callable {
    public final /* synthetic */ TiktokShortcutManager LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;
    public final /* synthetic */ List<String> LJLJI;

    public N2D(TiktokShortcutManager tiktokShortcutManager, boolean z, List<String> list) {
        this.LJLIL = tiktokShortcutManager;
        this.LJLILLLLZI = z;
        this.LJLJI = list;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Object LIZ;
        TiktokShortcutManager tiktokShortcutManager = this.LJLIL;
        boolean z = this.LJLILLLLZI;
        List<String> list = this.LJLJI;
        try {
            Context LIZIZ = EF7.LIZIZ();
            ShortcutManager shortcutManager = (ShortcutManager) LIZIZ.getSystemService(ShortcutManager.class);
            C110574Vp LJJJJLL = OJ4.LJJJJLL(new C39626Fgs(OJ4.LJJJJI(OJ4.LJJJJIZL(ORZ.LJLIIIL(tiktokShortcutManager.LIZ(LIZIZ, z))), new AqS176S0100000_10(list, (List<? extends User>) 253)), N2F.LJLIL), C58611MzP.LJLIL);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            OJ4.LJJLI(linkedHashSet, LJJJJLL);
            java.util.Set LJFF = C77275UUl.LJFF(linkedHashSet);
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("collectAllShortcuts: ");
            LIZ2.append(LJFF);
            C58612MzQ.LIZ(X1D.LIZIZ(LIZ2));
            int i = 0;
            TreeMap treeMap = new TreeMap();
            C113554cx.LJJLIIIJL(treeMap, new OSZ[0]);
            ArrayList arrayList = new ArrayList();
            for (Object obj : LJFF) {
                int i2 = i + 1;
                if (i >= 0) {
                    N29 n29 = (N29) obj;
                    Integer num = (Integer) n29.LIZJ.getValue();
                    if (i < 4) {
                        if (num == null) {
                            arrayList.add(n29);
                        } else if (!treeMap.containsKey(num)) {
                            treeMap.put(num, n29);
                        } else {
                            arrayList.add(n29);
                        }
                    } else {
                        treeMap.put(Integer.valueOf(i2), n29);
                    }
                    i = i2;
                } else {
                    C47261Igj.LJJJJJ();
                    throw null;
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                N29 n292 = (N29) it.next();
                int i3 = 1;
                while (true) {
                    if (!treeMap.containsKey(Integer.valueOf(i3))) {
                        treeMap.put(Integer.valueOf(i3), n292);
                        break;
                    }
                    i3++;
                    if (i3 < 5) {
                    }
                }
            }
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList(treeMap.size());
            for (Map.Entry entry : treeMap.entrySet()) {
                Object key = entry.getKey();
                o.LJIIIIZZ(key, "it.key");
                int intValue = ((Number) key).intValue();
                Object value = entry.getValue();
                o.LJIIIIZZ(value, "it.value");
                ShortcutInfo LIZ3 = ((N29) value).LIZ(LIZIZ, Integer.valueOf(intValue));
                String id = LIZ3.getId();
                o.LJIIIIZZ(id, "toShortcutInfo.id");
                arrayList2.add(id);
                arrayList3.add(LIZ3);
            }
            List<ShortcutInfo> LLJI = ORZ.LLJI(arrayList3);
            C188727au c188727au = new C188727au();
            c188727au.LJFF(arrayList2, "list");
            FMX.LJIIL("shortcut_list", c188727au.LIZ);
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append("finalShortcutsList: ");
            LIZ4.append(arrayList2);
            C58612MzQ.LIZ(X1D.LIZIZ(LIZ4));
            shortcutManager.setDynamicShortcuts(LLJI);
            LIZ = Boolean.TRUE;
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        Throwable m10exceptionOrNullimpl = C3C5.m10exceptionOrNullimpl(LIZ);
        if (m10exceptionOrNullimpl != null) {
            StringBuilder LIZ5 = X1D.LIZ();
            LIZ5.append("add shortcut error: ");
            LIZ5.append(m10exceptionOrNullimpl.getMessage());
            C58612MzQ.LIZ(X1D.LIZIZ(LIZ5));
            LIZ = Boolean.FALSE;
        }
        C58612MzQ.LIZ("refreshShortcuts: " + ((Boolean) LIZ).booleanValue());
        return C76800UCe.LIZ;
    }
}
