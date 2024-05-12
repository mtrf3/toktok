package X;

import Y.AfS58S0100000_6;
import android.app.Application;
import kotlin.jvm.internal.o;

/* renamed from: X.Fsi, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40360Fsi implements InterfaceC40375Fsx {
    public EnumC40361Fsj LIZIZ;
    public boolean LIZJ;
    public EnumC40361Fsj LJ;
    public long LJFF;
    public boolean LIZ = true;
    public volatile boolean LIZLLL = true;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // X.InterfaceC40375Fsx
    public final void LJFF(String str, Application application) {
        EnumC40361Fsj enumC40361Fsj;
        if (!this.LIZJ) {
            this.LIZJ = true;
            C84763XOl.LJI().LJJJJZI(new AfS58S0100000_6(this, 36));
        }
        if (!this.LIZLLL || this.LJ != null) {
            return;
        }
        switch (str.hashCode()) {
            case -2110102721:
                if (str.equals("com.ss.android.ugc.aweme.utils.AppWidgetLinkProxyActivity")) {
                    enumC40361Fsj = EnumC40361Fsj.WIDGET;
                    break;
                }
                enumC40361Fsj = EnumC40361Fsj.NONE;
                break;
            case -1915565709:
                if (str.equals("com.ss.android.ugc.aweme.shortcut.ShortcutProxyActivity")) {
                    enumC40361Fsj = EnumC40361Fsj.SHORTCUT;
                    break;
                }
                enumC40361Fsj = EnumC40361Fsj.NONE;
                break;
            case -1122151764:
                if (str.equals("com.ss.android.ugc.aweme.share.SystemShareActivity")) {
                    enumC40361Fsj = EnumC40361Fsj.OPEN_SHARE;
                    break;
                }
                enumC40361Fsj = EnumC40361Fsj.NONE;
                break;
            case 163197832:
                if (str.equals("com.ss.android.ugc.aweme.journey.StubMainActivity")) {
                    enumC40361Fsj = EnumC40361Fsj.MAIN;
                    break;
                }
                enumC40361Fsj = EnumC40361Fsj.NONE;
                break;
            case 683138905:
                if (str.equals("com.ss.android.ugc.aweme.main.MainActivity")) {
                    enumC40361Fsj = EnumC40361Fsj.MAIN;
                    break;
                }
                enumC40361Fsj = EnumC40361Fsj.NONE;
                break;
            case 1231814645:
                if (str.equals("com.ss.android.ugc.aweme.deeplink.DeepLinkActivityV2")) {
                    enumC40361Fsj = EnumC40361Fsj.DEEP_LINK;
                    break;
                }
                enumC40361Fsj = EnumC40361Fsj.NONE;
                break;
            case 1685925711:
                if (str.equals("com.ss.android.ugc.aweme.deeplink.AppLinkHandlerV2")) {
                    enumC40361Fsj = EnumC40361Fsj.DEEP_LINK;
                    break;
                }
                enumC40361Fsj = EnumC40361Fsj.NONE;
                break;
            default:
                enumC40361Fsj = EnumC40361Fsj.NONE;
                break;
        }
        if (enumC40361Fsj == EnumC40361Fsj.NONE) {
            enumC40361Fsj = EnumC40361Fsj.MAIN;
            if (this.LIZIZ == null) {
                this.LIZIZ = enumC40361Fsj;
                C188727au c188727au = new C188727au();
                c188727au.LJIIIZ("class_name", str);
                FMX.LJIIL("unknown_launch_method", c188727au.LIZ);
            }
        }
        this.LJ = enumC40361Fsj;
    }

    @Override // X.InterfaceC40375Fsx
    public final void LJI(EnumC40361Fsj launchType, String str) {
        o.LJIIIZ(launchType, "launchType");
        this.LIZLLL = false;
        this.LJ = null;
        String value = launchType.getValue();
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("launch_from", str);
        LJII(value, c188727au, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0009, code lost:
    
        if (kotlin.jvm.internal.o.LJ(r6, java.lang.Boolean.TRUE) != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJII(java.lang.String r4, X.C188727au r5, java.lang.Boolean r6) {
        /*
            r3 = this;
            r2 = 0
            if (r6 == 0) goto L66
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.o.LJ(r6, r0)
            if (r0 == 0) goto L6d
        Lb:
            r1 = 1
        Lc:
            r5.getClass()
            java.lang.String r0 = "launch_method"
            r5.LJIIIZ(r0, r4)
            java.lang.String r0 = "c_launch_method"
            r5.LJIIIZ(r0, r4)
            java.lang.String r0 = "is_cold_launch"
            r5.LIZLLL(r1, r0)
            java.lang.String r1 = "from_channel"
            java.lang.String r0 = "user"
            r5.LJIIIZ(r1, r0)
            android.content.Context r0 = X.EF7.LIZIZ()
            int r0 = X.C36850EdC.LIZIZ(r0)
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "device_ram_type"
            r5.LJIIIZ(r0, r1)
            int r0 = X.C36850EdC.LIZ()
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "device_go_type"
            r5.LJIIIZ(r0, r1)
            java.lang.String r1 = "is_gp_large_screen"
            java.lang.String r0 = "0"
            r5.LJIIIZ(r1, r0)
            X.LFH r0 = X.LFH.LIZIZ
            X.LEp r0 = r0.LIZLLL()
            X.FLT r0 = r0.LJIJ()
            int r0 = r0.LIZLLL()
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "is_pad"
            r5.LJIIIZ(r0, r1)
            android.content.Context r0 = X.EF7.LIZIZ()
            goto L6f
        L66:
            boolean r0 = r3.LIZ
            if (r0 == 0) goto L6d
            r3.LIZ = r2
            goto Lb
        L6d:
            r1 = 0
            goto Lc
        L6f:
            android.content.pm.PackageManager r1 = r0.getPackageManager()     // Catch: java.lang.Throwable -> L7b
            java.lang.String r0 = "com.lemon.lvoverseas"
            X.C16880lQ.LLLLLLZ(r1, r0, r2)     // Catch: java.lang.Throwable -> L7b
            java.lang.String r1 = "2"
            goto L7d
        L7b:
            java.lang.String r1 = "1"
        L7d:
            java.lang.String r0 = "cc_mode"
            r5.LJIIIZ(r0, r1)
            java.util.Map<java.lang.String, java.lang.String> r1 = r5.LIZ
            java.lang.String r0 = "launch_log"
            X.FMX.LJIIL(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC40360Fsi.LJII(java.lang.String, X.7au, java.lang.Boolean):void");
    }
}
