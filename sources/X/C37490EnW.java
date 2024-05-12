package X;

import Y.ARunnableS10S0101000_6;
import android.text.TextUtils;
import com.bytedance.pia.core.utils.GsonUtils;
import com.google.gson.m;
import com.google.gson.o;

/* renamed from: X.EnW, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37490EnW {
    public final String LIZ;
    public final m LIZIZ;

    public final String toString() {
        return this.LIZIZ.toString();
    }

    public C37490EnW(String str) {
        m mVar;
        this.LIZ = str;
        C37491EnX c37491EnX = C37492EnY.LIZ;
        String str2 = "";
        if (c37491EnX.LIZ.contains(str)) {
            c37491EnX.LIZIZ.storeLong(str, System.currentTimeMillis());
            str2 = c37491EnX.LIZ.getString(str, "");
        } else {
            c37491EnX.LIZIZ.storeLong(str, System.currentTimeMillis());
            c37491EnX.LIZ.storeString(str, "");
            if (c37491EnX.LIZIZ.count() >= c37491EnX.LIZJ) {
                C37613EpV.LIZJ(new ARunnableS10S0101000_6(1, c37491EnX, 2));
            }
        }
        try {
            if (TextUtils.isEmpty(str2)) {
                mVar = new m();
            } else {
                GsonUtils.LIZIZ.getClass();
                mVar = o.LIZ(str2).LJIIZILJ();
            }
        } catch (Throwable th) {
            C37238EjS.LIZLLL(4, "[PageStorage]The info is invalid, fallback to empty: ", th);
            mVar = new m();
        }
        this.LIZIZ = mVar;
    }

    public final void LIZ(Object obj) {
        synchronized (this.LIZIZ) {
            try {
                this.LIZIZ.LJJII("manifest", GsonUtils.LIZIZ().LJIJJLI(obj));
                C37491EnX c37491EnX = C37492EnY.LIZ;
                String str = this.LIZ;
                String jVar = this.LIZIZ.toString();
                c37491EnX.LIZIZ.storeLong(str, System.currentTimeMillis());
                c37491EnX.LIZ.storeString(str, jVar);
                if (c37491EnX.LIZIZ.count() >= c37491EnX.LIZJ) {
                    C37613EpV.LIZJ(new ARunnableS10S0101000_6(1, c37491EnX, 2));
                }
            } finally {
            }
        }
    }
}
