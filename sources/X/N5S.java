package X;

import android.app.Activity;
import android.webkit.WebView;
import com.ss.android.ugc.aweme.bullet.business.BulletBusinessService;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class N5S implements NUT {
    public WeakReference<Activity> LIZ;
    public C59472NVs LIZIZ;
    public NOV LIZJ;
    public InterfaceC59229NMj LIZLLL;
    public InterfaceC59469NVp LJ;
    public WebView LJFF;
    public final boolean LJI = true;
    public final BulletBusinessService LJII = new BulletBusinessService(this);

    @Override // X.NUT
    public final Activity getActivity() {
        WeakReference<Activity> weakReference = this.LIZ;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // X.NUT
    public final InterfaceC59469NVp LIZIZ() {
        return this.LJ;
    }

    @Override // X.NUT
    public final boolean LIZLLL() {
        return this.LJI;
    }

    @Override // X.NUT
    public final C59472NVs getParams() {
        return this.LIZIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    @Override // X.NUT
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <T extends com.ss.android.ugc.aweme.bullet.business.BulletBusinessService.Business> T LIZ(java.lang.Class<T> r8) {
        /*
            r7 = this;
            com.ss.android.ugc.aweme.bullet.business.BulletBusinessService r6 = r7.LJII
            r6.getClass()
            java.util.HashMap<java.lang.Class<?>, com.ss.android.ugc.aweme.bullet.business.BulletBusinessService$Business> r0 = r6.LIZIZ
            boolean r0 = r0.containsKey(r8)
            if (r0 == 0) goto L16
            java.util.HashMap<java.lang.Class<?>, com.ss.android.ugc.aweme.bullet.business.BulletBusinessService$Business> r0 = r6.LIZIZ
            java.lang.Object r1 = r0.get(r8)
            com.ss.android.ugc.aweme.bullet.business.BulletBusinessService$Business r1 = (com.ss.android.ugc.aweme.bullet.business.BulletBusinessService.Business) r1
        L15:
            return r1
        L16:
            int r0 = r8.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isAbstract(r0)
            r5 = 1
            r0 = r0 ^ 1
            if (r0 == 0) goto L59
            r4 = 0
            java.lang.Class[] r1 = new java.lang.Class[r5]     // Catch: java.lang.Exception -> L50
            java.lang.Class<X.N5S> r0 = X.N5S.class
            r3 = 0
            r1[r3] = r0     // Catch: java.lang.Exception -> L50
            java.lang.reflect.Constructor r2 = r8.getDeclaredConstructor(r1)     // Catch: java.lang.Exception -> L50
            java.lang.String r0 = "cls.getDeclaredConstruct…lletBusiness::class.java)"
            kotlin.jvm.internal.o.LJIIIIZZ(r2, r0)     // Catch: java.lang.Exception -> L50
            r2.setAccessible(r5)     // Catch: java.lang.Exception -> L50
            java.lang.Object[] r1 = new java.lang.Object[r5]     // Catch: java.lang.Exception -> L50
            X.N5S r0 = r6.LIZ     // Catch: java.lang.Exception -> L50
            r1[r3] = r0     // Catch: java.lang.Exception -> L50
            java.lang.Object r1 = r2.newInstance(r1)     // Catch: java.lang.Exception -> L50
            java.lang.String r0 = "null cannot be cast to non-null type com.ss.android.ugc.aweme.bullet.business.BulletBusinessService.Business"
            kotlin.jvm.internal.o.LJII(r1, r0)     // Catch: java.lang.Exception -> L50
            com.ss.android.ugc.aweme.bullet.business.BulletBusinessService$Business r1 = (com.ss.android.ugc.aweme.bullet.business.BulletBusinessService.Business) r1     // Catch: java.lang.Exception -> L50
            java.util.HashMap<java.lang.Class<?>, com.ss.android.ugc.aweme.bullet.business.BulletBusinessService$Business> r0 = r6.LIZIZ     // Catch: java.lang.Exception -> L4e
            r0.put(r8, r1)     // Catch: java.lang.Exception -> L4e
            goto L55
        L4e:
            r0 = move-exception
            goto L52
        L50:
            r0 = move-exception
            r1 = r4
        L52:
            X.C78983UzD.LJIIZILJ(r0)
        L55:
            if (r1 != 0) goto L15
            r1 = r4
            goto L15
        L59:
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "can't use abstract class!"
            r1.append(r0)
            java.lang.String r0 = X.C16880lQ.LJLLJ(r8)
            r1.append(r0)
            java.lang.String r1 = X.X1D.LIZIZ(r1)
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.N5S.LIZ(java.lang.Class):com.ss.android.ugc.aweme.bullet.business.BulletBusinessService$Business");
    }

    @Override // X.NUT
    public final void LIZJ(C59457NVd c59457NVd) {
        this.LJ = c59457NVd;
    }

    @Override // X.NUT
    public final void LJ(C59472NVs params) {
        o.LJIIIZ(params, "params");
        this.LIZIZ = params;
    }

    @Override // X.NUT
    public final void LJFF(WebView webView) {
        this.LJFF = webView;
    }

    @Override // X.NUT
    public final void LJI(InterfaceC59229NMj interfaceC59229NMj) {
        this.LIZLLL = interfaceC59229NMj;
    }

    @Override // X.NUT
    public final void LJII(NOV nov) {
        this.LIZJ = nov;
    }

    @Override // X.NUT
    public final void LJIIIIZZ(Activity activity) {
        this.LIZ = new WeakReference<>(activity);
    }
}
