package com.bytedance.lobby.internal;

import X.C0MT;
import X.C77119UOl;
import X.QB9;
import X.QCI;
import X.X1D;
import android.app.Application;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes12.dex */
public abstract class BaseProvider<T> extends BaseViewModel<T> implements QB9 {
    public final AtomicBoolean LJLILLLLZI;
    public final QCI LJLJI;

    public abstract void onCreate();

    @Override // X.QB9
    public final void wv() {
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000d. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:3:0x0010 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean LJJZZIII() {
        /*
            r4 = this;
            X.QCI r0 = r4.LJLJI
            java.lang.String r3 = r0.LIZIZ
            r3.getClass()
            int r0 = r3.hashCode()
            r2 = 1
            r1 = 0
            switch(r0) {
                case -1240244679: goto L51;
                case -916346253: goto L48;
                case 3765: goto L3e;
                case 3321844: goto L35;
                case 28903346: goto L2c;
                case 323062851: goto L23;
                case 486515695: goto L1a;
                case 497130182: goto L11;
                default: goto L10;
            }
        L10:
            return r1
        L11:
            java.lang.String r0 = "facebook"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L5a
            goto L10
        L1a:
            java.lang.String r0 = "kakaotalk"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L5d
            goto L10
        L23:
            java.lang.String r0 = "google_onetap"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L60
            goto L10
        L2c:
            java.lang.String r0 = "instagram"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L63
            goto L10
        L35:
            java.lang.String r0 = "line"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L64
            goto L10
        L3e:
            java.lang.String r0 = "vk"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L67
            goto L10
        L48:
            java.lang.String r0 = "twitter"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L6a
            goto L10
        L51:
            java.lang.String r0 = "google"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L6d
            goto L10
        L5a:
            boolean r0 = X.QBE.LIZJ
            return r0
        L5d:
            boolean r0 = X.QBE.LJFF
            return r0
        L60:
            boolean r0 = X.QBE.LIZIZ
            return r0
        L63:
            return r2
        L64:
            boolean r0 = X.QBE.LIZLLL
            return r0
        L67:
            boolean r0 = X.QBE.LJI
            return r0
        L6a:
            boolean r0 = X.QBE.LJ
            return r0
        L6d:
            boolean r0 = X.QBE.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.lobby.internal.BaseProvider.LJJZZIII():boolean");
    }

    @Override // X.QB9
    public void init() {
        if (this.LJLILLLLZI.compareAndSet(false, true)) {
            if (C77119UOl.LIZIZ) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("Initializing ");
                C0MT.LJ(LIZ, this.LJLJI.LIZIZ, " (lazy)", LIZ);
            }
            onCreate();
        }
    }

    @Override // X.QB9
    public final QCI getConfig() {
        return this.LJLJI;
    }

    public BaseProvider(Application application, QCI qci) {
        super(application);
        this.LJLILLLLZI = new AtomicBoolean();
        this.LJLJI = qci;
    }
}
