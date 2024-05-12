package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.ttvideoengine.utils.TTVideoEngineLog;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.Inx, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C47709Inx {
    public int LIZ;
    public List<C47713Io1> LIZIZ;
    public boolean LIZJ;

    public final long LIZIZ() {
        long j = 0;
        if (this.LIZIZ != null) {
            for (int i = 0; i < ((ArrayList) this.LIZIZ).size(); i++) {
                j += ((C47713Io1) ListProtector.get(this.LIZIZ, i)).LIZIZ();
            }
        }
        return j;
    }

    public final boolean LIZJ() {
        boolean z;
        int i;
        if (this.LIZIZ != null) {
            z = true;
            i = 0;
            for (int i2 = 0; i2 < ((ArrayList) this.LIZIZ).size(); i2++) {
                C47713Io1 c47713Io1 = (C47713Io1) ListProtector.get(this.LIZIZ, i2);
                if (c47713Io1 != null && !c47713Io1.LIZ()) {
                    z = false;
                } else {
                    i++;
                }
            }
        } else {
            z = true;
            i = 0;
        }
        if (!this.LIZJ) {
            if (z) {
                return true;
            }
            if (i >= 1 && this.LIZ == 1) {
                return true;
            }
            return false;
        }
        if (z) {
            return true;
        }
        if (i >= 2 && this.LIZ == 1) {
            return true;
        }
        return false;
    }

    public final boolean LIZLLL() {
        if (this.LIZ != 2) {
            TTVideoEngineLog.d("DataLoaderHelper", "task is not a preload task");
            return false;
        }
        if (this.LIZIZ != null) {
            for (int i = 0; i < ((ArrayList) this.LIZIZ).size(); i++) {
                C47713Io1 c47713Io1 = (C47713Io1) ListProtector.get(this.LIZIZ, i);
                if (c47713Io1 != null && !c47713Io1.LIZ()) {
                    return false;
                }
            }
        }
        return true;
    }

    public final C47713Io1 LIZ(String str) {
        List<C47713Io1> list;
        if (!TextUtils.isEmpty(str) && (list = this.LIZIZ) != null) {
            for (C47713Io1 c47713Io1 : list) {
                if (c47713Io1.LIZ.equals(str)) {
                    return c47713Io1;
                }
            }
        }
        return null;
    }

    public final void LJ(C47708Inw c47708Inw) {
        boolean z;
        if (this.LIZIZ == null) {
            this.LIZIZ = new ArrayList();
        }
        Iterator it = ((CopyOnWriteArrayList) c47708Inw.LJIILL).iterator();
        int i = 0;
        int i2 = 0;
        while (it.hasNext()) {
            C47714Io2 c47714Io2 = (C47714Io2) it.next();
            C47713Io1 LIZ = LIZ(c47714Io2.LIZ);
            if (LIZ == null) {
                LIZ = new C47713Io1();
                z = false;
            } else {
                z = true;
            }
            LIZ.LIZ = c47714Io2.LIZ;
            LIZ.LIZIZ = c47714Io2.LJIIJ;
            long j = c47714Io2.LJIIJJI;
            if (LIZ.LIZLLL == null) {
                LIZ.LIZLLL = new ArrayList();
            }
            if (((ArrayList) LIZ.LIZLLL).size() == 0) {
                ((ArrayList) LIZ.LIZLLL).add(new C47732IoK());
            }
            ListProtector.get(LIZ.LIZLLL, 0).getClass();
            ((C47732IoK) ListProtector.get(LIZ.LIZLLL, 0)).LIZ = j;
            LIZ.LIZJ = c47714Io2.LJIIIZ;
            C47160If6 c47160If6 = c47714Io2.LJ;
            if (c47160If6 != null) {
                if (c47160If6.LIZ() == 0) {
                    i2++;
                } else if (c47714Io2.LJ.LIZ() == 1) {
                    i++;
                }
            }
            if (!z) {
                ((ArrayList) this.LIZIZ).add(LIZ);
            }
        }
        if (i > 0 && i2 > 0) {
            this.LIZJ = true;
        }
    }
}
