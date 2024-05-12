package X;

import X.InterfaceC67808QjM;
import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import java.util.Collections;

/* renamed from: X.Qj5, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractC67791Qj5<O extends InterfaceC67808QjM> implements InterfaceC67549QfB<O> {
    public final Context LIZ;
    public final String LIZIZ;
    public final C67718Qhu<O> LIZJ;
    public final O LIZLLL;
    public final C67719Qhv<O> LJ;
    public final Looper LJFF;
    public final int LJI;
    public final C67727Qi3 LJII;
    public final InterfaceC68018Qmk LJIIIIZZ;
    public final C67824Qjc LJIIIZ;

    @Override // X.InterfaceC67549QfB
    public final C67719Qhv<O> LIZ() {
        return this.LJ;
    }

    public final C67793Qj7 LIZIZ() {
        java.util.Set<Scope> emptySet;
        GoogleSignInAccount LJJIJIL;
        C67793Qj7 c67793Qj7 = new C67793Qj7();
        O o = this.LIZLLL;
        Account account = null;
        if ((o instanceof InterfaceC67816QjU) && (LJJIJIL = ((InterfaceC67816QjU) o).LJJIJIL()) != null) {
            String str = LJJIJIL.zaf;
            if (str != null) {
                account = new Account(str, "com.google");
            }
        } else {
            O o2 = this.LIZLLL;
            if (o2 instanceof InterfaceC67815QjT) {
                account = ((InterfaceC67815QjT) o2).LJJJIL();
            }
        }
        c67793Qj7.LIZ = account;
        O o4 = this.LIZLLL;
        if (o4 instanceof InterfaceC67816QjU) {
            GoogleSignInAccount LJJIJIL2 = ((InterfaceC67816QjU) o4).LJJIJIL();
            if (LJJIJIL2 == null) {
                emptySet = Collections.emptySet();
            } else {
                emptySet = LJJIJIL2.LJJJJL();
            }
        } else {
            emptySet = Collections.emptySet();
        }
        if (c67793Qj7.LIZIZ == null) {
            c67793Qj7.LIZIZ = new C0M4<>();
        }
        c67793Qj7.LIZIZ.addAll(emptySet);
        c67793Qj7.LIZLLL = this.LIZ.getClass().getName();
        c67793Qj7.LIZJ = this.LIZ.getPackageName();
        return c67793Qj7;
    }

    public final void LIZJ(int i, AbstractC67748QiO abstractC67748QiO) {
        abstractC67748QiO.LJIIJJI();
        C67824Qjc c67824Qjc = this.LJIIIZ;
        c67824Qjc.getClass();
        C67828Qjg c67828Qjg = new C67828Qjg(i, abstractC67748QiO);
        HandlerC67272Qai handlerC67272Qai = c67824Qjc.LJLLL;
        handlerC67272Qai.sendMessage(handlerC67272Qai.obtainMessage(4, new C67894Qkk(c67828Qjg, c67824Qjc.LJLJLLL.get(), this)));
    }

    public final C67646Qgk LIZLLL(int i, AbstractC67886Qkc abstractC67886Qkc) {
        C67649Qgn c67649Qgn = new C67649Qgn();
        C67824Qjc c67824Qjc = this.LJIIIZ;
        InterfaceC68018Qmk interfaceC68018Qmk = this.LJIIIIZZ;
        c67824Qjc.getClass();
        c67824Qjc.LJFF(c67649Qgn, abstractC67886Qkc.LIZJ, this);
        C67830Qji c67830Qji = new C67830Qji(i, abstractC67886Qkc, c67649Qgn, interfaceC68018Qmk);
        HandlerC67272Qai handlerC67272Qai = c67824Qjc.LJLLL;
        handlerC67272Qai.sendMessage(handlerC67272Qai.obtainMessage(4, new C67894Qkk(c67830Qji, c67824Qjc.LJLJLLL.get(), this)));
        return c67649Qgn.LIZ;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AbstractC67791Qj5(android.app.Activity r4, X.C67718Qhu<O> r5, O r6, X.InterfaceC68018Qmk r7) {
        /*
            r3 = this;
            X.Qj8 r2 = new X.Qj8
            r2.<init>()
            java.lang.String r0 = "StatusExceptionMapper must not be null."
            X.QH7.LJIIIZ(r7, r0)
            r2.LIZ = r7
            android.os.Looper r1 = r4.getMainLooper()
            java.lang.String r0 = "Looper must not be null."
            X.QH7.LJIIIZ(r1, r0)
            r2.LIZIZ = r1
            X.Qj9 r0 = r2.LIZ()
            r3.<init>(r4, r5, r6, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC67791Qj5.<init>(android.app.Activity, X.Qhu, X.QjM, X.Qmk):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AbstractC67791Qj5(android.content.Context r3, X.C67718Qhu<O> r4, O r5, X.InterfaceC68018Qmk r6) {
        /*
            r2 = this;
            X.Qj8 r1 = new X.Qj8
            r1.<init>()
            java.lang.String r0 = "StatusExceptionMapper must not be null."
            X.QH7.LJIIIZ(r6, r0)
            r1.LIZ = r6
            X.Qj9 r0 = r1.LIZ()
            r2.<init>(r3, r4, r5, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC67791Qj5.<init>(android.content.Context, X.Qhu, X.QjM, X.Qmk):void");
    }

    public AbstractC67791Qj5(Activity activity, C67718Qhu<O> c67718Qhu, O o, C67795Qj9 c67795Qj9) {
        this(activity, activity, c67718Qhu, o, c67795Qj9);
    }

    public AbstractC67791Qj5(Context context, C67718Qhu<O> c67718Qhu, O o, C67795Qj9 c67795Qj9) {
        this(context, (Activity) null, c67718Qhu, o, c67795Qj9);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AbstractC67791Qj5(android.content.Context r6, android.app.Activity r7, X.C67718Qhu<O> r8, O r9, X.C67795Qj9 r10) {
        /*
            r5 = this;
            r5.<init>()
            java.lang.String r0 = "Null context is not permitted."
            X.QH7.LJIIIZ(r6, r0)
            java.lang.String r0 = "Api must not be null."
            X.QH7.LJIIIZ(r8, r0)
            java.lang.String r0 = "Settings must not be null; use Settings.DEFAULT_SETTINGS instead."
            X.QH7.LJIIIZ(r10, r0)
            android.content.Context r0 = X.C16880lQ.LLLLL(r6)
            r5.LIZ = r0
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 30
            r3 = 0
            if (r1 < r0) goto L32
            java.lang.Class<android.content.Context> r2 = android.content.Context.class
            java.lang.String r1 = "getAttributionTag"
            java.lang.Class[] r0 = new java.lang.Class[r3]     // Catch: java.lang.Throwable -> L32
            java.lang.reflect.Method r1 = r2.getMethod(r1, r0)     // Catch: java.lang.Throwable -> L32
            java.lang.Object[] r0 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L32
            java.lang.Object r1 = r1.invoke(r6, r0)     // Catch: java.lang.Throwable -> L32
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L32
            goto L33
        L32:
            r1 = 0
        L33:
            r5.LIZIZ = r1
            r5.LIZJ = r8
            r5.LIZLLL = r9
            android.os.Looper r0 = r10.LIZIZ
            r5.LJFF = r0
            X.Qhv r3 = new X.Qhv
            r3.<init>(r8, r9, r1)
            r5.LJ = r3
            X.Qi3 r0 = new X.Qi3
            r0.<init>(r5)
            r5.LJII = r0
            android.content.Context r0 = r5.LIZ
            X.Qjc r4 = X.C67824Qjc.LJI(r0)
            r5.LJIIIZ = r4
            java.util.concurrent.atomic.AtomicInteger r0 = r4.LJLJLJ
            int r0 = r0.getAndIncrement()
            r5.LJI = r0
            X.Qmk r0 = r10.LIZ
            r5.LJIIIIZZ = r0
            if (r7 == 0) goto L95
            boolean r0 = r7 instanceof com.google.android.gms.common.api.GoogleApiActivity
            if (r0 != 0) goto L95
            android.os.Looper r1 = android.os.Looper.myLooper()
            android.os.Looper r0 = X.C16880lQ.LLJJJJ()
            if (r1 != r0) goto L95
            X.QhC r0 = new X.QhC
            r0.<init>(r7)
            X.Qb6 r2 = com.google.android.gms.common.api.internal.LifecycleCallback.LIZJ(r0)
            java.lang.String r1 = "ConnectionlessLifecycleHelper"
            java.lang.Class<X.Qb5> r0 = X.C67295Qb5.class
            com.google.android.gms.common.api.internal.LifecycleCallback r1 = r2.U(r0, r1)
            X.Qb5 r1 = (X.C67295Qb5) r1
            if (r1 != 0) goto L8d
            X.Qb5 r1 = new X.Qb5
            com.google.android.gms.common.GoogleApiAvailability r0 = com.google.android.gms.common.GoogleApiAvailability.getInstance()
            r1.<init>(r2, r4, r0)
        L8d:
            X.0M4<X.Qhv<?>> r0 = r1.LJLJJLL
            r0.add(r3)
            r4.LIZIZ(r1)
        L95:
            X.Qai r1 = r4.LJLLL
            r0 = 7
            android.os.Message r0 = r1.obtainMessage(r0, r5)
            r1.sendMessage(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC67791Qj5.<init>(android.content.Context, android.app.Activity, X.Qhu, X.QjM, X.Qj9):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AbstractC67791Qj5(android.content.Context r3, X.C67718Qhu<O> r4, O r5, android.os.Looper r6, X.InterfaceC68018Qmk r7) {
        /*
            r2 = this;
            X.Qj8 r1 = new X.Qj8
            r1.<init>()
            java.lang.String r0 = "Looper must not be null."
            X.QH7.LJIIIZ(r6, r0)
            r1.LIZIZ = r6
            java.lang.String r0 = "StatusExceptionMapper must not be null."
            X.QH7.LJIIIZ(r7, r0)
            r1.LIZ = r7
            X.Qj9 r0 = r1.LIZ()
            r2.<init>(r3, r4, r5, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC67791Qj5.<init>(android.content.Context, X.Qhu, X.QjM, android.os.Looper, X.Qmk):void");
    }
}
