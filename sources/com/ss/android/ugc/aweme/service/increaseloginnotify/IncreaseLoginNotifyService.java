package com.ss.android.ugc.aweme.service.increaseloginnotify;

import X.AKR;
import X.AKT;
import X.C198587qo;
import X.C221108m2;
import X.C35827E4h;
import X.C56281M6z;
import X.C58096Mr6;
import X.C5H3;
import X.C62822Ol8;
import X.E4P;
import X.EnumC221088m0;
import X.X1D;
import android.os.SystemClock;
import com.bytedance.keva.Keva;
import com.bytedance.poplayer.core.PopupManager;
import com.ss.android.ugc.aweme.service.IIncreaseLoginNotifyService;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class IncreaseLoginNotifyService implements IIncreaseLoginNotifyService {
    public final Set<String> LIZIZ;
    public Long LIZLLL;
    public AKT LJ;
    public final Long LJFF;
    public final C62822Ol8 LJI = C221108m2.LIZIZ(C35827E4h.LJLIL);
    public final C62822Ol8 LJII = C221108m2.LIZIZ(E4P.LJLIL);
    public final C5H3 LJIIIIZZ = C221108m2.LIZ(EnumC221088m0.NONE, C198587qo.LJLIL);
    public Long LIZJ = Long.valueOf(LJIIIIZZ().getLong("toast_show_time", 0));
    public Boolean LIZ = Boolean.valueOf(LJIIIIZZ().getBoolean("has_show_login_panel", false));

    @Override // com.ss.android.ugc.aweme.service.IIncreaseLoginNotifyService
    public final void LIZ() {
    }

    public static IIncreaseLoginNotifyService LJI() {
        Object LIZ = C58096Mr6.LIZ(IIncreaseLoginNotifyService.class, false);
        if (LIZ != null) {
            return (IIncreaseLoginNotifyService) LIZ;
        }
        if (C58096Mr6.q5 == null) {
            synchronized (IIncreaseLoginNotifyService.class) {
                if (C58096Mr6.q5 == null) {
                    C58096Mr6.q5 = new IncreaseLoginNotifyService();
                }
            }
        }
        return C58096Mr6.q5;
    }

    @Override // com.ss.android.ugc.aweme.service.IIncreaseLoginNotifyService
    public final void LIZIZ() {
        PopupManager.LIZJ(C56281M6z.class);
    }

    @Override // com.ss.android.ugc.aweme.service.IIncreaseLoginNotifyService
    public final void LJFF() {
        boolean z;
        Boolean bool = this.LIZ;
        Boolean bool2 = Boolean.TRUE;
        if (o.LJ(bool, bool2)) {
            return;
        }
        this.LIZ = bool2;
        Keva LJIIIIZZ = LJIIIIZZ();
        Boolean bool3 = this.LIZ;
        if (bool3 != null) {
            z = bool3.booleanValue();
        } else {
            z = false;
        }
        LJIIIIZZ.storeBoolean("has_show_login_panel", z);
    }

    public final int LJII() {
        return ((Number) this.LJII.getValue()).intValue();
    }

    public final Keva LJIIIIZZ() {
        return (Keva) this.LJI.getValue();
    }

    public final void LJIIJ() {
        long j;
        long j2;
        Long l = this.LIZJ;
        long j3 = 0;
        if (l != null) {
            j = l.longValue();
        } else {
            j = 0;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        Long l2 = this.LIZLLL;
        if (l2 != null) {
            j2 = l2.longValue();
        } else {
            j2 = 0;
        }
        this.LIZJ = Long.valueOf((elapsedRealtime - j2) + j);
        Keva LJIIIIZZ = LJIIIIZZ();
        Long l3 = this.LIZJ;
        if (l3 != null) {
            j3 = l3.longValue();
        }
        LJIIIIZZ.storeLong("toast_show_time", j3);
    }

    public IncreaseLoginNotifyService() {
        Integer num;
        long elapsedRealtime;
        Set<String> stringSet = LJIIIIZZ().getStringSet("watched_videos", new LinkedHashSet());
        this.LIZIZ = stringSet;
        if (!LJIIIIZZ().contains("first_launch_time")) {
            Long valueOf = Long.valueOf(SystemClock.elapsedRealtime());
            this.LJFF = valueOf;
            Keva LJIIIIZZ = LJIIIIZZ();
            if (valueOf != null) {
                elapsedRealtime = valueOf.longValue();
            } else {
                elapsedRealtime = SystemClock.elapsedRealtime();
            }
            LJIIIIZZ.storeLong("first_launch_time", elapsedRealtime);
        } else {
            this.LJFF = Long.valueOf(LJIIIIZZ().getLong("first_launch_time", SystemClock.elapsedRealtime()));
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("after init: hasShowLoginPanel=");
        LIZ.append(this.LIZ);
        LIZ.append(", toastTotalShowTime=");
        LIZ.append(this.LIZJ);
        LIZ.append(", vvCount=");
        if (stringSet != null) {
            num = Integer.valueOf(stringSet.size());
        } else {
            num = null;
        }
        LIZ.append(num);
        LIZ.append(", launchTime=");
        LIZ.append(this.LJFF);
        X1D.LIZIZ(LIZ);
    }

    @Override // com.ss.android.ugc.aweme.service.IIncreaseLoginNotifyService
    public final void LJ() {
        AKR akr;
        LIZIZ();
        AKT akt = this.LJ;
        if (akt != null && (akr = akt.LIZLLL) != null && akr.isShowing()) {
            akt.LIZ();
            LJIIJ();
        }
    }

    @Override // com.ss.android.ugc.aweme.service.IIncreaseLoginNotifyService
    public final void LIZJ(String str) {
        Set<String> set;
        Set<String> set2 = this.LIZIZ;
        if (set2 != null && set2.size() >= 16) {
            return;
        }
        if (str != null && (set = this.LIZIZ) != null) {
            set.add(str);
        }
        LJIIIIZZ().storeStringSet("watched_videos", this.LIZIZ);
    }

    public final long LJIIIZ(int i) {
        long j;
        long j2;
        if (i == 1) {
            j = 5000;
        } else {
            j = 14000;
        }
        Long l = this.LIZJ;
        if (l != null) {
            j2 = l.longValue();
        } else {
            j2 = 0;
        }
        long j3 = j - j2;
        if (0 <= j3 && j3 < 3000) {
            return 3000L;
        }
        return j3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0058, code lost:
    
        if (r1 != 3) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0060, code lost:
    
        if (r4 < 17) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0066, code lost:
    
        if (LJII() == 1) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006c, code lost:
    
        if (LJII() != 2) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x007f, code lost:
    
        if ((r9 instanceof X.ActivityC45651qj) != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0081, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0082, code lost:
    
        com.bytedance.poplayer.core.PopupManager.LJIIL(new X.C56281M6z(r10, new X.C56280M6y(r8, r9, r9)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x008f, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x007a, code lost:
    
        if (LJIIIZ(LJII()) > 0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x005b, code lost:
    
        if (r4 == 9) goto L30;
     */
    @Override // com.ss.android.ugc.aweme.service.IIncreaseLoginNotifyService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL(X.ActivityC45651qj r9, X.InterfaceC55643Lsd r10) {
        /*
            r8 = this;
            java.lang.String r0 = "scene"
            kotlin.jvm.internal.o.LJIIIZ(r10, r0)
            java.lang.Boolean r1 = r8.LIZ
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 == 0) goto L13
        Lf:
            r8.LJ()
            return
        L13:
            com.ss.android.ugc.aweme.IAccountUserService r0 = X.HG3.LJIILL()
            X.RBX r0 = (X.RBX) r0
            boolean r0 = r0.isLogin()
            if (r0 == 0) goto L20
            goto Lf
        L20:
            X.K74 r0 = X.K74.DAYS
            r5 = 1
            long r0 = X.C30581Hy.LJJJI(r5, r0)
            long r6 = X.K72.LJ(r0)
            long r2 = android.os.SystemClock.elapsedRealtime()
            java.lang.Long r0 = r8.LJFF
            if (r0 == 0) goto L4a
            long r0 = r0.longValue()
        L37:
            long r2 = r2 - r0
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r0 >= 0) goto Lf
            java.util.Set<java.lang.String> r0 = r8.LIZIZ
            if (r0 == 0) goto Lf
            int r4 = r0.size()
            r3 = 2
            r2 = 9
            if (r4 >= r2) goto L4f
            goto Lf
        L4a:
            long r0 = android.os.SystemClock.elapsedRealtime()
            goto L37
        L4f:
            int r1 = r8.LJII()
            if (r1 == r5) goto L5b
            if (r1 == r3) goto L5e
            r0 = 3
            if (r1 == r0) goto L5b
            goto Lf
        L5b:
            if (r4 != r2) goto Lf
            goto L62
        L5e:
            r0 = 17
            if (r4 >= r0) goto Lf
        L62:
            int r0 = r8.LJII()
            if (r0 == r5) goto L6e
            int r0 = r8.LJII()
            if (r0 != r3) goto L7d
        L6e:
            int r0 = r8.LJII()
            long r3 = r8.LJIIIZ(r0)
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L7d
            goto Lf
        L7d:
            boolean r0 = r9 instanceof X.ActivityC45651qj
            if (r0 != 0) goto L82
            return
        L82:
            X.M6z r1 = new X.M6z
            X.M6y r0 = new X.M6y
            r0.<init>(r8, r9, r9)
            r1.<init>(r10, r0)
            com.bytedance.poplayer.core.PopupManager.LJIIL(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.service.increaseloginnotify.IncreaseLoginNotifyService.LIZLLL(X.1qj, X.Lsd):void");
    }
}
