package com.ss.android.ugc.aweme.setting.experiment;

import X.C221108m2;
import X.C40604Fwe;
import X.C5H3;
import X.C72972SkS;
import X.EF7;
import X.EnumC221088m0;
import X.HG3;
import X.HXX;
import X.InterfaceC65349Pkn;
import X.OQY;
import X.R41;
import X.RBX;
import X.UPJ;
import X.X1D;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.keva.Keva;
import com.ss.android.agilelogger.ALog;
import com.ss.android.ugc.aweme.AccountService;
import defpackage.s0;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class BetaAppExperiment {
    public static final String LIZ;
    public static final String LIZIZ;
    public static final String LIZJ;
    public static final String LIZLLL;
    public static final String LJ;
    public static final Keva LJFF;
    public static final C5H3 LJI;
    public static boolean LJII;
    public static final BetaAppBody LJIIIIZZ;

    /* loaded from: classes7.dex */
    public static final class BetaAppBody {

        @InterfaceC65349Pkn("debug_gp_code")
        public final Integer debugVersionCode;

        @InterfaceC65349Pkn("enable")
        public final int enabled;

        @InterfaceC65349Pkn("store_region")
        public final Set<String> regions;

        public BetaAppBody() {
            this(0, null, null, 7, null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BetaAppBody)) {
                return false;
            }
            BetaAppBody betaAppBody = (BetaAppBody) obj;
            return this.enabled == betaAppBody.enabled && o.LJ(this.regions, betaAppBody.regions) && o.LJ(this.debugVersionCode, betaAppBody.debugVersionCode);
        }

        public final int hashCode() {
            int hashCode;
            int LIZ = HXX.LIZ(this.regions, this.enabled * 31, 31);
            Integer num = this.debugVersionCode;
            if (num == null) {
                hashCode = 0;
            } else {
                hashCode = num.hashCode();
            }
            return LIZ + hashCode;
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("BetaAppBody(enabled=");
            LIZ.append(this.enabled);
            LIZ.append(", regions=");
            LIZ.append(this.regions);
            LIZ.append(", debugVersionCode=");
            return s0.LIZJ(LIZ, this.debugVersionCode, ')', LIZ);
        }

        public BetaAppBody(int i, Set<String> regions, Integer num) {
            o.LJIIIZ(regions, "regions");
            this.enabled = i;
            this.regions = regions;
            this.debugVersionCode = num;
        }

        public BetaAppBody(int i, Set set, Integer num, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? OQY.INSTANCE : set, (i2 & 4) != 0 ? null : num);
        }
    }

    public static boolean LIZJ() {
        BetaAppBody betaAppBody = LJIIIIZZ;
        Set<String> set = betaAppBody.regions;
        if ((set instanceof Collection) && set.isEmpty()) {
            return false;
        }
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            if (ujb.o.LJJJJIZL(it.next(), AccountService.LJIJ().LJIILL(), true)) {
                if (betaAppBody.enabled != 1 || !((RBX) HG3.LJIILL()).isLogin() || R41.LIZ().isChildrenMode()) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    static {
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("launch-");
        LIZ2.append(EF7.LJI());
        LIZ = LJ(X1D.LIZIZ(LIZ2));
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("click-");
        LIZ3.append(EF7.LJI());
        LIZIZ = LJ(X1D.LIZIZ(LIZ3));
        LIZJ = LJ("bits-version-code");
        LIZLLL = LJ("bits-version-name");
        LJ = LJ("bits-gp-name");
        LJFF = Keva.getRepo("beta_testing");
        LJI = C221108m2.LIZ(EnumC221088m0.NONE, C40604Fwe.LJLIL);
        BetaAppBody betaAppBody = new BetaAppBody(0, null, null, 7, null);
        BetaAppBody betaAppBody2 = (BetaAppBody) SettingsManager.LIZLLL().LJIIIIZZ("ios_beta_testing_enable", BetaAppBody.class, betaAppBody);
        if (betaAppBody2 != null) {
            betaAppBody = betaAppBody2;
        }
        LJIIIIZZ = betaAppBody;
    }

    public static final boolean LIZ() {
        if (!LIZJ()) {
            return false;
        }
        Keva keva = LJFF;
        if (keva.getBoolean(LIZIZ, false) || System.currentTimeMillis() - keva.getLong(LIZ, Long.MAX_VALUE) > TimeUnit.DAYS.toMillis(14L)) {
            return false;
        }
        return true;
    }

    public static boolean LIZIZ(int i) {
        boolean LJ2;
        if (i <= EF7.LJI()) {
            return false;
        }
        String valueOf = String.valueOf(i);
        if (!ujb.o.LJJJJ(valueOf, "27", false)) {
            return false;
        }
        String valueOf2 = String.valueOf(EF7.LJI());
        if (valueOf2.length() == 6 && valueOf.length() == 6) {
            String substring = valueOf2.substring(0, 4);
            o.LJIIIIZZ(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            String substring2 = valueOf.substring(0, 4);
            o.LJIIIIZZ(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
            LJ2 = o.LJ(substring, substring2);
        } else {
            if (valueOf2.length() == 10 && valueOf.length() == 10) {
                String substring3 = valueOf2.substring(3, 7);
                o.LJIIIIZZ(substring3, "this as java.lang.String…ing(startIndex, endIndex)");
                String substring4 = valueOf.substring(3, 7);
                o.LJIIIIZZ(substring4, "this as java.lang.String…ing(startIndex, endIndex)");
                LJ2 = o.LJ(substring3, substring4);
            }
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("app version from GP: ");
            LIZ2.append(valueOf);
            ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogD("BetaAppExperiment", X1D.LIZIZ(LIZ2));
            return true;
        }
        if (LJ2) {
            return false;
        }
        StringBuilder LIZ22 = X1D.LIZ();
        LIZ22.append("app version from GP: ");
        LIZ22.append(valueOf);
        ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogD("BetaAppExperiment", X1D.LIZIZ(LIZ22));
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0027 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZLLL(int r8) {
        /*
            r0 = 1
            com.ss.android.ugc.aweme.setting.experiment.BetaAppExperiment.LJII = r0
            java.lang.String r6 = java.lang.String.valueOf(r8)
            int r1 = r6.length()
            r4 = 0
            r8 = 6
            r7 = 46
            java.lang.String r5 = "this as java.lang.String…ing(startIndex, endIndex)"
            if (r1 == r8) goto L4a
            r0 = 10
            if (r1 == r0) goto L7d
        L17:
            X.Fwj r0 = com.ss.android.ugc.aweme.setting.api.BetaAppApi.LIZ
            r0.getClass()
            com.bytedance.keva.Keva r1 = X.C40609Fwj.LJ
            java.lang.String r0 = X.C40609Fwj.LIZJ
            boolean r0 = r1.getBoolean(r0, r4)
            if (r0 == 0) goto L28
        L27:
            return
        L28:
            com.ss.android.ugc.aweme.setting.api.BetaAppApi r0 = X.C40609Fwj.LIZIZ
            com.ss.android.ugc.aweme.setting.api.InboxMsgRequestBody r1 = new com.ss.android.ugc.aweme.setting.api.InboxMsgRequestBody
            r2 = 3
            r3 = 0
            r6 = 14
            r4 = r3
            r5 = r3
            r7 = r3
            r1.<init>(r2, r3, r4, r5, r6, r7)
            X.Svk r1 = r0.sendInboxMsg(r1)
            X.T0k r0 = X.T16.LIZ()
            X.Sro r2 = r1.LJJL(r0)
            X.Fwk<T> r1 = X.C40610Fwk.LJLIL
            X.Fwm<T> r0 = X.C40612Fwm.LJLIL
            r2.LJJJLIIL(r1, r0)
            goto L27
        L4a:
            java.lang.StringBuilder r3 = X.X1D.LIZ()
            r2 = 2
            java.lang.String r0 = r6.substring(r4, r2)
            kotlin.jvm.internal.o.LJIIIIZZ(r0, r5)
            r3.append(r0)
            r3.append(r7)
            r1 = 4
            java.lang.String r0 = r6.substring(r2, r1)
            kotlin.jvm.internal.o.LJIIIIZZ(r0, r5)
            int r0 = com.bytedance.mt.protector.impl.string2number.CastIntegerProtector.parseInt(r0)
            r3.append(r0)
            r3.append(r7)
            java.lang.String r0 = r6.substring(r1, r8)
            kotlin.jvm.internal.o.LJIIIIZZ(r0, r5)
            r3.append(r0)
            java.lang.String r2 = X.X1D.LIZIZ(r3)
            goto Lb2
        L7d:
            java.lang.StringBuilder r3 = X.X1D.LIZ()
            r0 = 3
            r2 = 5
            java.lang.String r0 = r6.substring(r0, r2)
            kotlin.jvm.internal.o.LJIIIIZZ(r0, r5)
            r3.append(r0)
            r3.append(r7)
            r1 = 7
            java.lang.String r0 = r6.substring(r2, r1)
            kotlin.jvm.internal.o.LJIIIIZZ(r0, r5)
            int r0 = com.bytedance.mt.protector.impl.string2number.CastIntegerProtector.parseInt(r0)
            r3.append(r0)
            r3.append(r7)
            r0 = 9
            java.lang.String r0 = r6.substring(r1, r0)
            kotlin.jvm.internal.o.LJIIIIZZ(r0, r5)
            r3.append(r0)
            java.lang.String r2 = X.X1D.LIZIZ(r3)
        Lb2:
            if (r2 == 0) goto L17
            com.bytedance.keva.Keva r1 = com.ss.android.ugc.aweme.setting.experiment.BetaAppExperiment.LJFF
            java.lang.String r0 = com.ss.android.ugc.aweme.setting.experiment.BetaAppExperiment.LJ
            r1.storeString(r0, r2)
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.setting.experiment.BetaAppExperiment.LIZLLL(int):void");
    }

    public static String LJ(String str) {
        StringBuilder LJFF2 = C72972SkS.LJFF(str, '-');
        return UPJ.LJ((RBX) HG3.LJIILL(), LJFF2, LJFF2);
    }
}
