package X;

import com.ss.android.socialbase.downloader.model.HttpHeader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.X4k, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84242X4k implements X5J {
    public static final ArrayList<String> LJIIIZ;
    public final String LIZ;
    public final List<HttpHeader> LIZIZ;
    public java.util.Map<String, String> LIZJ;
    public int LIZLLL;
    public long LJ;
    public final Object LJFF = new Object();
    public boolean LJI;
    public boolean LJII;
    public X5J LJIIIIZZ;

    static {
        ArrayList<String> arrayList = new ArrayList<>(6);
        LJIIIZ = arrayList;
        C19U.LIZLLL(arrayList, "Content-Length", "Content-Range", "Transfer-Encoding", "Accept-Ranges");
        arrayList.add("Etag");
        arrayList.add("Content-Disposition");
    }

    public final void LIZLLL() {
        X5J LIZLLL;
        if (this.LIZJ != null) {
            return;
        }
        boolean z = true;
        try {
            this.LJII = true;
            String str = this.LIZ;
            List<HttpHeader> list = this.LIZIZ;
            int[] LJIILL = C84212X3g.LJIILL(0);
            int length = LJIILL.length;
            X5J x5j = null;
            Exception e = null;
            int i = 0;
            while (true) {
                if (i < length) {
                    try {
                        LIZLLL = C84212X3g.LIZLLL(str, list, LJIILL[i], false, null);
                    } catch (Exception e2) {
                        e = e2;
                    }
                    if (LIZLLL == null) {
                        i++;
                    } else {
                        x5j = LIZLLL;
                        break;
                    }
                } else if (e != null) {
                    throw e;
                }
            }
            this.LJIIIIZZ = x5j;
            synchronized (this.LJFF) {
                if (this.LJIIIIZZ != null) {
                    HashMap hashMap = new HashMap();
                    this.LIZJ = hashMap;
                    LJFF(this.LJIIIIZZ, hashMap);
                    this.LIZLLL = this.LJIIIIZZ.LIZ();
                    this.LJ = System.currentTimeMillis();
                    int i2 = this.LIZLLL;
                    if (i2 < 200 || i2 >= 300) {
                        z = false;
                    }
                    this.LJI = z;
                }
                this.LJII = false;
                this.LJFF.notifyAll();
            }
        } catch (Throwable th) {
            synchronized (this.LJFF) {
                if (this.LJIIIIZZ != null) {
                    HashMap hashMap2 = new HashMap();
                    this.LIZJ = hashMap2;
                    LJFF(this.LJIIIIZZ, hashMap2);
                    this.LIZLLL = this.LJIIIIZZ.LIZ();
                    this.LJ = System.currentTimeMillis();
                    int i3 = this.LIZLLL;
                    if (i3 < 200 || i3 >= 300) {
                        z = false;
                    }
                    this.LJI = z;
                }
                this.LJII = false;
                this.LJFF.notifyAll();
                throw th;
            }
        }
    }

    public final void LJ() {
        synchronized (this.LJFF) {
            if (this.LJII && this.LIZJ == null) {
                this.LJFF.wait();
            }
        }
    }

    @Override // X.X5J
    public final void cancel() {
        X5J x5j = this.LJIIIIZZ;
        if (x5j != null) {
            x5j.cancel();
        }
    }

    @Override // X.X5J
    public final int LIZ() {
        return this.LIZLLL;
    }

    @Override // X.X5J
    public final String LIZIZ(String str) {
        java.util.Map<String, String> map = this.LIZJ;
        if (map != null) {
            return map.get(str);
        }
        X5J x5j = this.LJIIIIZZ;
        if (x5j != null) {
            return x5j.LIZIZ(str);
        }
        return null;
    }

    public C84242X4k(String str, List list) {
        this.LIZ = str;
        this.LIZIZ = list;
    }

    public static void LJFF(X5J x5j, java.util.Map map) {
        if (x5j != null) {
            Iterator<String> it = LJIIIZ.iterator();
            while (it.hasNext()) {
                String next = it.next();
                ((HashMap) map).put(next, x5j.LIZIZ(next));
            }
        }
    }
}
