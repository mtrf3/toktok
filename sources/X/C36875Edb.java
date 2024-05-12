package X;

import Y.ARunnableS42S0100000_6;
import Y.IDComparatorS34S0000000_6;
import android.text.TextUtils;
import android.util.LruCache;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.service.unlogindigg.UnLoginDiggLocalCache;
import com.ss.android.ugc.aweme.utils.GsonHolder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* renamed from: X.Edb, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36875Edb {
    public static final C36879Edf LJFF = new C36879Edf();
    public static volatile C36875Edb LJI;
    public final C62822Ol8 LIZ;
    public final java.util.Set<String> LIZIZ;
    public final LruCache<String, C36876Edc> LIZJ;
    public boolean LIZLLL;
    public final long LJ;

    public C36875Edb() {
        C62822Ol8 LIZIZ = C221108m2.LIZIZ(C36877Edd.LJLIL);
        this.LIZ = LIZIZ;
        this.LIZIZ = new LinkedHashSet();
        this.LIZLLL = true;
        this.LJ = 604800000L;
        String string = ((Keva) LIZIZ.getValue()).getString("unlogin_digg_cache_key", "");
        this.LIZJ = new LruCache<>(50);
        if (!TextUtils.isEmpty(string)) {
            try {
                UnLoginDiggLocalCache unLoginDiggLocalCache = (UnLoginDiggLocalCache) GsonHolder.LIZLLL().LIZ().LJI(string, UnLoginDiggLocalCache.class);
                if (unLoginDiggLocalCache != null) {
                    Iterator it = ((ArrayList) LIZ(unLoginDiggLocalCache.lruCache)).iterator();
                    while (it.hasNext()) {
                        C36876Edc c36876Edc = (C36876Edc) it.next();
                        this.LIZJ.put(c36876Edc.LJLIL, c36876Edc);
                    }
                    this.LIZLLL = unLoginDiggLocalCache.showDiggToast;
                    return;
                }
                return;
            } catch (Exception unused) {
                return;
            }
        }
        this.LIZLLL = true;
    }

    public final void LIZIZ() {
        C38995FSd.LIZIZ().submit(new ARunnableS42S0100000_6(this, 58));
    }

    public final List<C36876Edc> LIZ(LruCache<String, C36876Edc> lruCache) {
        List LLILII = ORZ.LLILII(new IDComparatorS34S0000000_6(3), ORZ.LLJILJILJ(lruCache.snapshot().values()));
        long currentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList = new ArrayList();
        for (Object obj : LLILII) {
            if (((C36876Edc) obj).LJLILLLLZI + this.LJ > currentTimeMillis) {
                arrayList.add(obj);
            }
        }
        return ORZ.LLJILJILJ(arrayList);
    }
}
