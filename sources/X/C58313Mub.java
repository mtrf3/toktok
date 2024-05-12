package X;

import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Mub, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58313Mub {
    public final /* synthetic */ int LIZ;
    public final HashMap LIZIZ;

    public C58313Mub(int i) {
        this.LIZ = i;
        if (i != 1) {
            if (i != 2) {
                this.LIZIZ = new HashMap();
                return;
            } else {
                this.LIZIZ = new HashMap();
                return;
            }
        }
        this.LIZIZ = new HashMap();
    }

    private final C61520OCm LIZIZ(String str, String str2) {
        boolean z;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        C61520OCm c61520OCm = null;
        if (z) {
            return null;
        }
        synchronized (this.LIZIZ) {
            java.util.Map map = (java.util.Map) this.LIZIZ.get(str2);
            if (map != null) {
                c61520OCm = (C61520OCm) map.get(str);
            }
        }
        return c61520OCm;
    }

    public final C61520OCm LIZ(String str, String str2) {
        boolean z;
        switch (this.LIZ) {
            case 1:
                if (str == null || str.length() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                C61520OCm c61520OCm = null;
                if (!z) {
                    synchronized (this.LIZIZ) {
                        java.util.Map map = (java.util.Map) this.LIZIZ.get(str2);
                        if (map != null) {
                            c61520OCm = (C61520OCm) map.get(str);
                        }
                    }
                }
                return c61520OCm;
            default:
                return LIZIZ(str, str2);
        }
    }

    private final void LIZLLL(String accessKey, String str, C61520OCm c61520OCm) {
        o.LJIIJ(accessKey, "accessKey");
        synchronized (this.LIZIZ) {
            java.util.Map map = (java.util.Map) this.LIZIZ.get(str);
            if (map == null) {
                map = new LinkedHashMap();
            }
            map.put(accessKey, c61520OCm);
            this.LIZIZ.put(str, map);
        }
    }

    public final void LIZJ(String accessKey, String str, C61520OCm c61520OCm) {
        switch (this.LIZ) {
            case 1:
                o.LJIIJ(accessKey, "accessKey");
                synchronized (this.LIZIZ) {
                    java.util.Map map = (java.util.Map) this.LIZIZ.get(str);
                    if (map == null) {
                        map = new LinkedHashMap();
                    }
                    map.put(accessKey, c61520OCm);
                    this.LIZIZ.put(str, map);
                }
                return;
            default:
                LIZLLL(accessKey, str, c61520OCm);
                return;
        }
    }
}
