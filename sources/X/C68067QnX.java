package X;

/* renamed from: X.QnX, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68067QnX {
    public static final Object LJI = new Object();
    public final String LIZ;
    public final InterfaceC68068QnY LIZIZ;
    public final Object LIZJ;
    public final Object LIZLLL;
    public final Object LJ = new Object();
    public volatile Object LJFF = null;

    public /* synthetic */ C68067QnX(String str, Object obj, Object obj2, InterfaceC68068QnY interfaceC68068QnY) {
        this.LIZ = str;
        this.LIZJ = obj;
        this.LIZLLL = obj2;
        this.LIZIZ = interfaceC68068QnY;
    }

    public final Object LIZ(Object obj) {
        Object obj2;
        synchronized (this.LJ) {
        }
        if (obj != null) {
            return obj;
        }
        if (C63081OpJ.LJLJJLL == null) {
            return this.LIZJ;
        }
        synchronized (LJI) {
            if (C17J.LJJJJZ()) {
                if (this.LJFF == null) {
                    obj2 = this.LIZJ;
                } else {
                    obj2 = this.LJFF;
                }
                return obj2;
            }
            try {
                for (C68067QnX c68067QnX : C68555QvP.LIZ) {
                    if (!C17J.LJJJJZ()) {
                        Object obj3 = null;
                        try {
                            InterfaceC68068QnY interfaceC68068QnY = c68067QnX.LIZIZ;
                            if (interfaceC68068QnY != null) {
                                obj3 = interfaceC68068QnY.zza();
                            }
                        } catch (IllegalStateException unused) {
                        }
                        synchronized (LJI) {
                            c68067QnX.LJFF = obj3;
                        }
                    } else {
                        throw new IllegalStateException("Refreshing flag cache must be done on a worker thread.");
                    }
                }
            } catch (SecurityException unused2) {
            }
            InterfaceC68068QnY interfaceC68068QnY2 = this.LIZIZ;
            if (interfaceC68068QnY2 == null) {
                return this.LIZJ;
            }
            try {
                return interfaceC68068QnY2.zza();
            } catch (IllegalStateException unused3) {
                return this.LIZJ;
            } catch (SecurityException unused4) {
                return this.LIZJ;
            }
        }
    }
}
