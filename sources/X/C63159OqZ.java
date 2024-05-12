package X;

import android.text.TextUtils;
import android.util.LruCache;

/* renamed from: X.OqZ, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63159OqZ {
    public static volatile C63159OqZ LIZIZ;
    public final LruCache<String, C109544Rq> LIZ;

    public static C63159OqZ LIZJ() {
        if (LIZIZ == null) {
            synchronized (C63159OqZ.class) {
                if (LIZIZ == null) {
                    LIZIZ = new C63159OqZ();
                }
            }
        }
        return LIZIZ;
    }

    public C63159OqZ() {
        int i = C63308Osy.LJI().LIZLLL().LJJJJ;
        this.LIZ = new LruCache<>(i <= 0 ? 20 : i);
    }

    public final void LIZ(C109544Rq c109544Rq) {
        if (!TextUtils.isEmpty(c109544Rq.getUuid()) && this.LIZ.get(c109544Rq.getUuid()) != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("SendMsgCache checkUpdate, uuid:");
            LIZ.append(c109544Rq.getUuid());
            C63322OtC.LJFF(X1D.LIZIZ(LIZ));
            this.LIZ.put(c109544Rq.getUuid(), c109544Rq);
        }
    }

    public final C109544Rq LIZIZ(String str) {
        boolean z;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        C109544Rq c109544Rq = this.LIZ.get(str);
        StringBuilder LIZIZ2 = C25620zW.LIZIZ("SendMsgCache getMsg, uuid:", str, ", result:");
        if (c109544Rq != null) {
            z = true;
        } else {
            z = false;
        }
        LIZIZ2.append(z);
        C63322OtC.LJFF(X1D.LIZIZ(LIZIZ2));
        return c109544Rq;
    }
}
