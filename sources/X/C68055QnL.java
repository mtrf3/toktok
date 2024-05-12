package X;

import android.content.Context;
import android.os.Binder;

/* renamed from: X.QnL, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68055QnL implements InterfaceC68071Qnb {
    public static C68055QnL LIZJ;
    public final Context LIZ;
    public final QCA LIZIZ;

    public C68055QnL() {
    }

    public static synchronized void LIZJ() {
        Context context;
        synchronized (C68055QnL.class) {
            C68055QnL c68055QnL = LIZJ;
            if (c68055QnL != null && (context = c68055QnL.LIZ) != null && c68055QnL.LIZIZ != null) {
                context.getContentResolver().unregisterContentObserver(LIZJ.LIZIZ);
            }
            LIZJ = null;
        }
    }

    public C68055QnL(Context context) {
        this.LIZ = context;
        QCA qca = new QCA();
        this.LIZIZ = qca;
        context.getContentResolver().registerContentObserver(C68058QnO.LIZ, true, qca);
    }

    public static C68055QnL LIZIZ(Context context) {
        C68055QnL c68055QnL;
        C68055QnL c68055QnL2;
        synchronized (C68055QnL.class) {
            if (LIZJ == null) {
                if (C38891fp.LJIIJ(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0) {
                    c68055QnL2 = new C68055QnL(context);
                } else {
                    c68055QnL2 = new C68055QnL();
                }
                LIZJ = c68055QnL2;
            }
            c68055QnL = LIZJ;
        }
        return c68055QnL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [X.QnN] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object] */
    @Override // X.InterfaceC68071Qnb
    public final Object LIZ(String str) {
        Object obj;
        if (this.LIZ == null) {
            return null;
        }
        try {
            C68057QnN c68057QnN = new C68057QnN(this, str);
            try {
                c68057QnN = c68057QnN.LIZ();
                obj = c68057QnN;
            } catch (SecurityException unused) {
                long clearCallingIdentity = Binder.clearCallingIdentity();
                try {
                } finally {
                    Binder.restoreCallingIdentity(clearCallingIdentity);
                }
            }
            return obj;
        } catch (IllegalStateException | NullPointerException | SecurityException unused2) {
            return null;
        }
    }
}
