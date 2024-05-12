package X;

import android.content.Context;
import android.os.Looper;
import android.view.LayoutInflater;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.2k5, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C67012k5 {
    public static volatile int LIZLLL;
    public static final C67012k5 LJ = new C67012k5();
    public final java.util.Map<String, LayoutInflater> LIZ = new ConcurrentHashMap();
    public LayoutInflater LIZIZ;
    public InterfaceC57062Lu LIZJ;

    public final synchronized void LIZLLL() {
        this.LIZJ = null;
        this.LIZIZ = null;
        ((ConcurrentHashMap) this.LIZ).clear();
    }

    static {
        C16880lQ.LJLLJ(C67012k5.class);
    }

    public final synchronized LayoutInflater LIZ(Context context) {
        LayoutInflater layoutInflater;
        InterfaceC57062Lu interfaceC57062Lu = this.LIZJ;
        if (interfaceC57062Lu != null) {
            layoutInflater = interfaceC57062Lu.LIZ();
        } else {
            layoutInflater = null;
        }
        if (layoutInflater != null) {
            if (Looper.myLooper() == C16880lQ.LLJJJJ() && !"NitaMainThread".equals(C16880lQ.LLLLIIIILLL().getName())) {
                return layoutInflater;
            }
            layoutInflater = layoutInflater.cloneInContext(context);
        }
        return layoutInflater;
    }

    public final LayoutInflater LIZIZ(Context context) {
        if (this.LIZJ == null) {
            return null;
        }
        int i = LIZLLL;
        if (i != 0) {
            if (i != 1) {
                return null;
            }
            String name = C16880lQ.LLLLIIIILLL().getName();
            LayoutInflater layoutInflater = (LayoutInflater) ((ConcurrentHashMap) this.LIZ).get(name);
            if (layoutInflater == null) {
                LayoutInflater LIZ = LIZ(context);
                ((ConcurrentHashMap) this.LIZ).put(name, LIZ);
                return LIZ;
            }
            return layoutInflater;
        }
        if (Looper.myLooper() == C16880lQ.LLJJJJ()) {
            if ("NitaMainThread".equals(C16880lQ.LLLLIIIILLL().getName())) {
                if (this.LIZIZ == null) {
                    this.LIZIZ = LIZ(context);
                }
                return this.LIZIZ;
            }
            return this.LIZJ.LIZ();
        }
        if (this.LIZIZ == null) {
            this.LIZIZ = LIZ(context);
        }
        return this.LIZIZ;
    }

    public final synchronized void LIZJ(InterfaceC57062Lu interfaceC57062Lu, int i) {
        this.LIZJ = interfaceC57062Lu;
        LIZLLL = i;
    }
}
