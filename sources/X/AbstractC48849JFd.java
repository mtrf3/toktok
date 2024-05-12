package X;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.JFd, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC48849JFd implements Cloneable {
    public final boolean LJLIL;
    public final C48306Ixa LJLILLLLZI;
    public final boolean LJLJI;
    public final boolean LJLJJI;
    public final C48848JFc LJLJJL = new C48848JFc(this);
    public final C48846JFa LJLJJLL = new C48846JFa(this);

    public final Object clone() {
        return super.clone();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AbsEnv{isChildMode=");
        LIZ.append(this.LJLIL);
        LIZ.append(", config=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", isI18n=");
        LIZ.append(this.LJLJI);
        LIZ.append(", isBoe=");
        return C48339Iy7.LIZJ(LIZ, this.LJLJJI, '}', LIZ);
    }

    public final SharedPreferences LIZ(QIF qif) {
        Object obj;
        if (qif.LJJIIZI) {
            return this.LJLJJL.LIZIZ(qif.LIZJ);
        }
        Context context = qif.LIZJ;
        String valueOf = String.valueOf(qif.LIZ);
        C48846JFa c48846JFa = this.LJLJJLL;
        Object[] objArr = {context};
        Object obj2 = null;
        if (c48846JFa.LIZIZ == null) {
            obj = null;
        } else {
            obj = ((ConcurrentHashMap) c48846JFa.LIZIZ).get(valueOf);
        }
        if (obj == null) {
            synchronized (c48846JFa) {
                if (((ConcurrentHashMap) c48846JFa.LIZIZ) != null) {
                    obj2 = ((ConcurrentHashMap) c48846JFa.LIZIZ).get(valueOf);
                }
                if (obj2 != null) {
                    obj = obj2;
                } else {
                    obj = c48846JFa.LJI(valueOf, objArr);
                    if (obj != null) {
                        if (((ConcurrentHashMap) c48846JFa.LIZIZ) == null) {
                            c48846JFa.LIZIZ = new ConcurrentHashMap(4);
                        }
                        ((ConcurrentHashMap) c48846JFa.LIZIZ).put(valueOf, obj);
                    }
                }
            }
        }
        return (SharedPreferences) obj;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC48849JFd)) {
            return false;
        }
        AbstractC48849JFd abstractC48849JFd = (AbstractC48849JFd) obj;
        if (this.LJLILLLLZI.equals(abstractC48849JFd.LJLILLLLZI) && this.LJLJJI == abstractC48849JFd.LJLJJI && this.LJLJI == abstractC48849JFd.LJLJI && this.LJLIL == abstractC48849JFd.LJLIL) {
            return true;
        }
        return false;
    }

    public AbstractC48849JFd(C48306Ixa c48306Ixa, boolean z, boolean z2, boolean z3) {
        this.LJLILLLLZI = c48306Ixa;
        this.LJLJI = z;
        this.LJLJJI = z2;
        this.LJLIL = z3;
    }
}
