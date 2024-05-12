package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: X.Inz, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C47711Inz {
    public final ReentrantLock LIZ = new ReentrantLock();
    public final ArrayList<C47708Inw> LIZIZ = new ArrayList<>();
    public long LIZJ = 0;

    public final long LIZIZ() {
        this.LIZ.lock();
        long size = this.LIZIZ.size();
        this.LIZ.unlock();
        return size;
    }

    public final C47708Inw LJ() {
        this.LIZ.lock();
        if (this.LIZIZ.size() == 0) {
            this.LIZ.unlock();
            return null;
        }
        C47708Inw c47708Inw = (C47708Inw) ListProtector.get(this.LIZIZ, r1.size() - 1);
        this.LIZIZ.remove(c47708Inw);
        this.LIZ.unlock();
        return c47708Inw;
    }

    public final ArrayList<C47708Inw> LJII() {
        try {
            this.LIZ.lock();
            ArrayList<C47708Inw> arrayList = new ArrayList<>();
            arrayList.addAll(this.LIZIZ);
            return arrayList;
        } finally {
            this.LIZ.unlock();
        }
    }

    public final boolean LIZ(String str) {
        int i = 0;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Boolean bool = Boolean.FALSE;
        this.LIZ.lock();
        while (true) {
            if (i >= this.LIZIZ.size()) {
                break;
            }
            if (((C47708Inw) ListProtector.get(this.LIZIZ, i)).LIZLLL(str) != null) {
                bool = Boolean.TRUE;
                break;
            }
            i++;
        }
        this.LIZ.unlock();
        return bool.booleanValue();
    }

    public final boolean LIZJ(C47708Inw c47708Inw) {
        Boolean bool;
        Boolean bool2;
        boolean z = false;
        if (c47708Inw == null || ((CopyOnWriteArrayList) c47708Inw.LJIILL).size() == 0) {
            return false;
        }
        this.LIZ.lock();
        if (this.LIZJ >= 1) {
            if (this.LIZIZ.size() >= this.LIZJ) {
                z = true;
            }
            bool = Boolean.valueOf(z);
        } else {
            bool = Boolean.FALSE;
        }
        if (bool.booleanValue()) {
            bool2 = Boolean.FALSE;
        } else {
            this.LIZIZ.add(c47708Inw);
            bool2 = Boolean.TRUE;
        }
        this.LIZ.unlock();
        return bool2.booleanValue();
    }

    public final C47708Inw LIZLLL(String str) {
        C47708Inw c47708Inw = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        this.LIZ.lock();
        int i = 0;
        while (true) {
            if (i >= this.LIZIZ.size()) {
                break;
            }
            C47708Inw c47708Inw2 = (C47708Inw) ListProtector.get(this.LIZIZ, i);
            if (c47708Inw2.LIZLLL(str) != null) {
                c47708Inw = c47708Inw2;
                break;
            }
            i++;
        }
        this.LIZ.unlock();
        return c47708Inw;
    }

    public final C47708Inw LJFF(String str) {
        C47708Inw c47708Inw = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        this.LIZ.lock();
        int i = 0;
        while (true) {
            if (i >= this.LIZIZ.size()) {
                break;
            }
            C47708Inw c47708Inw2 = (C47708Inw) ListProtector.get(this.LIZIZ, i);
            if (c47708Inw2.LIZLLL(str) != null) {
                c47708Inw = c47708Inw2;
                this.LIZIZ.remove(c47708Inw2);
                break;
            }
            i++;
        }
        this.LIZ.unlock();
        return c47708Inw;
    }

    public final C47708Inw LJI(String str) {
        C47708Inw c47708Inw = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        this.LIZ.lock();
        int i = 0;
        while (true) {
            if (i >= this.LIZIZ.size()) {
                break;
            }
            C47708Inw c47708Inw2 = (C47708Inw) ListProtector.get(this.LIZIZ, i);
            if (!TextUtils.isEmpty(c47708Inw2.LIZ) && c47708Inw2.LIZ.equals(str)) {
                c47708Inw = c47708Inw2;
                this.LIZIZ.remove(c47708Inw2);
                break;
            }
            i++;
        }
        this.LIZ.unlock();
        return c47708Inw;
    }
}
