package X;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes12.dex */
public final class QOX {
    public final int LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final java.util.Map<String, String> LIZLLL;
    public final java.util.Map<String, String> LJ;
    public final List<String> LJFF;
    public final int LJI;
    public final int LJII;
    public final String LJIIIIZZ;
    public final int LJIIIZ;
    public final boolean LJIIJ;
    public final List<Integer> LJIIJJI;
    public final String LJIIL;
    public final P9M LJIILIIL;
    public final boolean LJIILJJIL;
    public final List<Integer> LJIILL;

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ChannelInfo{channelId = ");
        LIZ.append(this.LIZ);
        LIZ.append(", deviceId = ");
        LIZ.append(this.LIZIZ);
        LIZ.append(", installId = ");
        LIZ.append(this.LIZJ);
        LIZ.append(", fpid = ");
        LIZ.append(this.LJI);
        LIZ.append(", aid = ");
        LIZ.append(this.LJII);
        LIZ.append(", updateVersionCode = ");
        LIZ.append(this.LJIIIZ);
        LIZ.append(", appKey = ");
        LIZ.append(this.LJIIIIZZ);
        LIZ.append(", header = ");
        LIZ.append(this.LJ);
        LIZ.append(", extra = ");
        LIZ.append(this.LIZLLL);
        LIZ.append(", urls = ");
        LIZ.append(this.LJFF);
        LIZ.append("}");
        return X1D.LIZIZ(LIZ);
    }

    public QOX(int i, int i2, int i3, String str, int i4, String str2, String str3, List list, java.util.Map map, List list2, P9M p9m, List list3, QOD qod) {
        HashMap hashMap = new HashMap();
        this.LIZLLL = hashMap;
        HashMap hashMap2 = new HashMap();
        this.LJ = hashMap2;
        ArrayList arrayList = new ArrayList();
        this.LJFF = arrayList;
        this.LJIIJJI = new ArrayList();
        this.LJIILL = new ArrayList();
        this.LIZ = i4;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LJIIIZ = i3;
        if (list != null) {
            arrayList.addAll(list);
        }
        if (map != null) {
            hashMap.putAll(map);
        }
        java.util.Map<String, String> map2 = qod.LIZJ;
        if (map2 != null) {
            hashMap2.putAll(map2);
        }
        this.LJI = i;
        this.LJII = i2;
        this.LJIIIIZZ = str;
        this.LJIIJJI = list2;
        this.LJIIJ = false;
        this.LJIIL = null;
        this.LJIILIIL = p9m;
        if (list2 == null || ((ArrayList) list2).isEmpty()) {
            this.LJIIJ = false;
        }
        this.LJIILJJIL = false;
        this.LJIILL = list3;
    }
}
