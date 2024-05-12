package X;

import android.content.Context;
import android.text.TextUtils;
import defpackage.i0;
import java.io.File;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes11.dex */
public final class O5O {
    public final java.util.Map<String, O5P> LIZ = new HashMap();
    public final String LIZIZ;
    public final String LIZJ;

    public final java.util.Map<String, Long> LIZIZ() {
        HashMap hashMap = new HashMap();
        synchronized (this.LIZ) {
            Collection<O5P> values = ((HashMap) this.LIZ).values();
            if (values == null) {
                return hashMap;
            }
            for (O5P o5p : values) {
                hashMap.put(o5p.LIZJ, o5p.LJ);
            }
            return hashMap;
        }
    }

    public final void LIZJ() {
        synchronized (this.LIZ) {
            Iterator it = ((HashMap) this.LIZ).values().iterator();
            while (it.hasNext()) {
                ((O5P) it.next()).LIZJ();
            }
            ((HashMap) this.LIZ).clear();
        }
    }

    public final O5P LIZ(String str) {
        O5P o5p;
        int indexOf = str.indexOf("/");
        if (indexOf != -1) {
            String substring = str.substring(0, indexOf);
            synchronized (this.LIZ) {
                o5p = (O5P) ((HashMap) this.LIZ).get(substring);
                if (o5p == null) {
                    o5p = new O5P(this.LIZIZ, this.LIZJ, substring);
                    ((HashMap) this.LIZ).put(substring, o5p);
                }
            }
            return o5p;
        }
        throw new RuntimeException(i0.LJFF("channel is needed：", str));
    }

    public O5O(Context context, String str, File file) {
        if (!TextUtils.isEmpty(str)) {
            this.LIZIZ = str;
            this.LIZJ = new File(file, str).getAbsolutePath();
            return;
        }
        throw new RuntimeException("access key is empty");
    }
}
