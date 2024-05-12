package X;

import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.preload.PreloadExtraInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.EjN, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37233EjN {
    public static final java.util.Map<String, List<String>> LJ = new LinkedHashMap();
    public static final java.util.Map<String, PreloadExtraInfo> LJFF = new LinkedHashMap();
    public final C37225EjF LIZ;
    public PreloadExtraInfo LIZIZ = null;
    public C38826FLq LIZJ = null;
    public boolean LIZLLL = false;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C37233EjN)) {
            return false;
        }
        C37233EjN c37233EjN = (C37233EjN) obj;
        return o.LJ(this.LIZ, c37233EjN.LIZ) && o.LJ(this.LIZIZ, c37233EjN.LIZIZ) && o.LJ(this.LIZJ, c37233EjN.LIZJ) && this.LIZLLL == c37233EjN.LIZLLL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = this.LIZ.hashCode() * 31;
        PreloadExtraInfo preloadExtraInfo = this.LIZIZ;
        int hashCode2 = (hashCode + (preloadExtraInfo == null ? 0 : preloadExtraInfo.hashCode())) * 31;
        C38826FLq c38826FLq = this.LIZJ;
        int hashCode3 = (hashCode2 + (c38826FLq != null ? c38826FLq.hashCode() : 0)) * 31;
        boolean z = this.LIZLLL;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode3 + i;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PreloadInfoExt(preloadKey=");
        LIZ.append(this.LIZ);
        LIZ.append(", eventInfo=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", strategyContainer=");
        LIZ.append(this.LIZJ);
        LIZ.append(", isPreload=");
        return C48339Iy7.LIZJ(LIZ, this.LIZLLL, ')', LIZ);
    }

    public C37233EjN(C37225EjF c37225EjF) {
        this.LIZ = c37225EjF;
    }

    public static String LIZ(android.net.Uri uri, List list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            StringBuilder LJFF2 = C72972SkS.LJFF(str, '=');
            LJFF2.append(UriProtector.getQueryParameter(uri, str));
            arrayList.add(X1D.LIZIZ(LJFF2));
        }
        return ORZ.LLD(arrayList, "&", null, null, null, 62);
    }
}
