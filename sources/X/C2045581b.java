package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.model.SlidesImageLoadParams;
import java.util.LinkedHashMap;

/* renamed from: X.81b, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2045581b {
    public int LIZIZ;
    public Aweme LIZJ;
    public int LJ;
    public Long LJIIIZ;
    public boolean LJIIJ;
    public C2045881e LJIIJJI;
    public String LIZ = "";
    public String LIZLLL = "";
    public final java.util.Map<Integer, Long> LJFF = new LinkedHashMap();
    public final java.util.Map<Integer, Long> LJI = new LinkedHashMap();
    public final java.util.Map<Integer, C2047581v> LJII = new LinkedHashMap();
    public final java.util.Map<Integer, Boolean> LJIIIIZZ = new LinkedHashMap();

    public final void LIZ(int i) {
        long j;
        Long l = this.LJIIIZ;
        if (l != null) {
            j = System.currentTimeMillis() - l.longValue();
        } else {
            j = 0;
        }
        java.util.Map<Integer, Long> map = this.LJFF;
        Integer valueOf = Integer.valueOf(i);
        LinkedHashMap linkedHashMap = (LinkedHashMap) map;
        Object obj = linkedHashMap.get(valueOf);
        if (obj == null) {
            obj = 0L;
            linkedHashMap.put(valueOf, obj);
        }
        long longValue = ((Number) obj).longValue() + j;
        this.LJFF.put(Integer.valueOf(i), Long.valueOf(longValue));
    }

    public final void LIZIZ(int i, boolean z) {
        C2045881e c2045881e = this.LJIIJJI;
        if (c2045881e != null) {
            if (c2045881e.LIZLLL == null) {
                c2045881e.LIZLLL = Integer.valueOf(i);
            }
            SlidesImageLoadParams slidesImageLoadParams = (SlidesImageLoadParams) ((LinkedHashMap) c2045881e.LIZIZ).get(c2045881e.LIZLLL);
            if (slidesImageLoadParams != null && slidesImageLoadParams.status == 0) {
                c2045881e.LJFF = 1;
                if (c2045881e.LJ < 0) {
                    c2045881e.LJ = 0;
                }
            }
            if (!z && c2045881e.LIZ) {
                c2045881e.LIZJ++;
            }
        }
    }
}
