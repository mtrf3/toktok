package X;

import com.ss.android.agilelogger.ALog;

/* renamed from: X.PvJ, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66001PvJ implements InterfaceC36921EeL {
    public final boolean LIZ;

    @Override // X.InterfaceC36921EeL
    public final /* synthetic */ void LIZIZ() {
    }

    @Override // X.InterfaceC36921EeL
    public final void getLogTag() {
    }

    @Override // X.InterfaceC36921EeL
    public final boolean isEnable() {
        return this.LIZ;
    }

    public C66001PvJ(boolean z) {
        this.LIZ = z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00b5, code lost:
    
        if (r2 < r4) goto L6;
     */
    @Override // X.InterfaceC36921EeL
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void init(android.content.Context r8) {
        /*
            r7 = this;
            java.io.File r6 = X.C66580QBc.LJFF(r8)
            boolean r0 = X.P8H.LJIIJJI()
            r4 = 20971520(0x1400000, float:3.526483E-38)
            if (r0 == 0) goto Lb9
            long r2 = r6.getFreeSpace()
            r0 = 8
            long r2 = r2 / r0
            long r4 = (long) r4
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto Lb0
        L18:
            r2 = r4
        L19:
            X.PvL r1 = new X.PvL
            android.content.Context r0 = X.C16880lQ.LLLLL(r8)
            r1.<init>(r0)
            int r0 = (int) r2
            r1.LIZIZ = r0
            r0 = 2097152(0x200000, float:2.938736E-39)
            r1.LIZJ = r0
            if (r6 == 0) goto Lae
            java.lang.String r0 = r6.getAbsolutePath()
        L2f:
            r1.LIZLLL = r0
            r2 = 1
            r1.LJI = r2
            X.Ol8 r0 = X.C34919Dn9.LIZ
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1.LJII = r0
            r1.LJIIIIZZ = r2
            X.Ol8 r0 = X.C52766KnK.LIZ
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            r1.LJIIIZ = r0
            X.Ol8 r0 = X.C52764KnI.LIZ
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1.LJIIJ = r0
            X.PvM r1 = r1.LIZ()
            java.lang.Class<X.EeM> r0 = X.C36922EeM.class
            java.lang.String r0 = X.C16880lQ.LJLLILLLL(r0)
            com.ss.android.agilelogger.ALog.setsPackageClassName(r0)
            X.Pcg r0 = new X.Pcg
            r0.<init>()
            com.ss.android.agilelogger.ALog.addNativeFuncAddrCallback(r0)
            java.util.concurrent.ScheduledExecutorService r0 = X.C38995FSd.LJ()
            com.ss.android.agilelogger.ALog.setOuterExecutorService(r0)
            com.ss.android.agilelogger.ALog.init(r1)
            java.lang.String r1 = X.EF7.LJIILIIL
            java.lang.String r0 = "local_test"
            boolean r0 = android.text.TextUtils.equals(r1, r0)
            if (r0 != 0) goto L93
            java.lang.String r1 = X.EF7.LJIILIIL
            java.lang.String r0 = "local_test_av"
            boolean r0 = android.text.TextUtils.equals(r1, r0)
            if (r0 == 0) goto Lac
        L93:
            com.ss.android.agilelogger.ALog.setDebug(r2)
            X.PvK r0 = new X.PvK
            r0.<init>()
            X.AbstractC66014PvW.LIZ = r0
            X.PvM r0 = com.ss.android.agilelogger.ALog.sConfig
            boolean r0 = r0.LJIIL
            if (r0 == 0) goto Lab
            X.PvE r0 = new X.PvE
            r0.<init>()
            com.ss.android.agilelogger.ALog.addMessageInterceptor(r0)
        Lab:
            return
        Lac:
            r2 = 0
            goto L93
        Lae:
            r0 = 0
            goto L2f
        Lb0:
            r0 = 10485760(0xa00000, float:1.469368E-38)
            long r4 = (long) r0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 >= 0) goto L19
            goto L18
        Lb9:
            long r2 = (long) r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66001PvJ.init(android.content.Context):void");
    }

    @Override // X.InterfaceC36921EeL
    public final void LIZJ(String str, Throwable th) {
        ALog.e(str, th);
    }

    @Override // X.InterfaceC36921EeL
    public final void LIZ(int i, String str, String str2) {
        if (i != 2) {
            if (i != 3) {
                if (i != 4) {
                    if (i != 5) {
                        if (i != 6) {
                            return;
                        }
                        ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogE(str, str2);
                        return;
                    }
                    ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogW(str, str2);
                    return;
                }
                ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogI(str, str2);
                return;
            }
            ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogD(str, str2);
            return;
        }
        ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogV(str, str2);
    }

    @Override // X.InterfaceC36921EeL
    public final void LIZLLL(String str, String str2, Exception exc) {
        ALog.e(str, str2, exc);
    }
}
