package X;

import android.text.TextUtils;
import com.bytedance.sync.SyncSDK;
import com.google.gson.m;
import com.google.gson.p;
import com.ss.android.ugc.aweme.sync.SyncConfigSettings;
import defpackage.a1;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.o;

/* renamed from: X.QSp, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67035QSp {
    public static volatile InterfaceC67043QSx LJI;
    public static final String LIZ = "https://bsync-va.tiktokv.com";
    public static final AtomicBoolean LIZIZ = new AtomicBoolean(false);
    public static final AtomicBoolean LIZJ = new AtomicBoolean(false);
    public static final ConcurrentHashMap<Long, InterfaceC67030QSk> LIZLLL = new ConcurrentHashMap<>();
    public static final CopyOnWriteArrayList<QT0> LJ = new CopyOnWriteArrayList<>();
    public static final C62822Ol8 LJFF = C221108m2.LIZIZ(C35629Dyb.LJLIL);
    public static final C36181EHx LJII = new C36181EHx();

    public static SyncConfigSettings.SyncSdkConfigModel LIZIZ() {
        return (SyncConfigSettings.SyncSdkConfigModel) LJFF.getValue();
    }

    public static boolean LIZJ(long j) {
        p LJJIJL;
        if (!o.LJ(LIZIZ().enable, Boolean.TRUE)) {
            return false;
        }
        try {
            m mVar = LIZIZ().bizEnableInfo;
            if (mVar == null || (LJJIJL = mVar.LJJIJL(String.valueOf(j))) == null) {
                return false;
            }
            if (!LJJIJL.LJFF()) {
                return false;
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static void LJ(C66947QPf c66947QPf) {
        InterfaceC67043QSx interfaceC67043QSx = LJI;
        if (interfaceC67043QSx == null || !LIZJ.compareAndSet(false, true)) {
            return;
        }
        String valueOf = String.valueOf(c66947QPf.LJLIL);
        int LJJLI = interfaceC67043QSx.LJJLI();
        int i = c66947QPf.LJLJL;
        C67039QSt c67039QSt = new C67039QSt(valueOf, LJJLI, i);
        String str = LIZ;
        c67039QSt.LJI = str;
        c67039QSt.LJII = "https://mon.isnssdk.com";
        c67039QSt.LJIIIIZZ = true;
        c67039QSt.LIZLLL = C67038QSs.LJLIL;
        c67039QSt.LJ = new C67037QSr(interfaceC67043QSx);
        if (!TextUtils.isEmpty(str)) {
            if (!TextUtils.isEmpty(valueOf)) {
                if (i >= 0) {
                    if (c67039QSt.LIZLLL != null) {
                        if (c67039QSt.LJ != null) {
                            if (c67039QSt.LJFF == null) {
                                c67039QSt.LJFF = new C67045QSz();
                            }
                            SyncSDK.init(EF7.LIZIZ(), new C67040QSu(c67039QSt));
                            SyncSDK.start(c66947QPf.LJLILLLLZI, c66947QPf.LJLJI);
                            return;
                        }
                        throw new IllegalArgumentException("please set wsService before build");
                    }
                    throw new IllegalArgumentException("please set commonParamProvider before build");
                }
                throw new IllegalArgumentException("please set upStreamServiceId before build");
            }
            throw new IllegalArgumentException("please set aid before build");
        }
        throw new IllegalArgumentException("please set host before build");
    }

    public static void LIZLLL(String str, String str2) {
        InterfaceC67043QSx c66946QPe;
        if (str.length() == 0 || str2.length() == 0) {
            return;
        }
        C66947QPf c66947QPf = new C66947QPf(str, str2, a1.LJ("wss://", "frontier-va.tiktokv.com", "/ws/v2"));
        Boolean bool = LIZIZ().useSharedWs;
        Boolean bool2 = Boolean.TRUE;
        if (o.LJ(bool, bool2)) {
            c66946QPe = new QPZ(c66947QPf);
        } else {
            c66946QPe = new C66946QPe(c66947QPf);
        }
        c66946QPe.LIZJ(new C67036QSq(c66947QPf));
        LJI = c66946QPe;
        InterfaceC67043QSx interfaceC67043QSx = LJI;
        if (interfaceC67043QSx != null) {
            interfaceC67043QSx.LJ();
        }
        if (o.LJ(LIZIZ().syncConnectOpt, bool2)) {
            LIZ(true, c66947QPf, null);
        } else {
            LJ(c66947QPf);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
    
        if (r3 <= 0) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZ(boolean r6, X.C66947QPf r7, X.C66930QOo r8) {
        /*
            if (r6 == 0) goto L28
            com.ss.android.ugc.aweme.sync.SyncConfigSettings$SyncSdkConfigModel r0 = LIZIZ()
            java.lang.Long r0 = r0.syncConnectFallbackTs
            r5 = 30000(0x7530, double:1.4822E-319)
            if (r0 == 0) goto L24
            long r3 = r0.longValue()
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L26
        L16:
            X.10K r2 = X.C10K.LJII(r5)
            Y.AgS128S0100000_11 r1 = new Y.AgS128S0100000_11
            r0 = 3
            r1.<init>(r7, r0)
            r2.LIZLLL(r1)
            return
        L24:
            r3 = 30000(0x7530, double:1.4822E-319)
        L26:
            r5 = r3
            goto L16
        L28:
            if (r8 == 0) goto L34
            X.QOr r1 = r8.LIZIZ
        L2c:
            X.QOr r0 = X.EnumC66933QOr.CONNECTED
            if (r1 != r0) goto L33
            LJ(r7)
        L33:
            return
        L34:
            r1 = 0
            goto L2c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67035QSp.LIZ(boolean, X.QPf, X.QOo):void");
    }
}
