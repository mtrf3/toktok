package X;

import kotlin.jvm.internal.AqS127S0300000_10;
import kotlin.jvm.internal.AqS192S0100000_10;

/* renamed from: X.OXg, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62060OXg {
    public static void LIZ(InterfaceC36488ETs interfaceC36488ETs, InterfaceC37146Ehy interfaceC37146Ehy, C29S c29s) {
        if (c29s != null) {
            C62059OXf c62059OXf = new C62059OXf(c29s);
            c62059OXf.LJ = new AqS127S0300000_10(c62059OXf, interfaceC36488ETs, interfaceC37146Ehy, 0);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("startBroadcastReceiver, mCanUseFeature:");
            C1DI.LIZJ(LIZ, c62059OXf.LIZIZ, LIZ, 4);
            if (c62059OXf.LIZIZ) {
                if (c62059OXf.LIZLLL == null) {
                    c62059OXf.LIZLLL = new C62061OXh(c62059OXf.LIZ, new AqS192S0100000_10(c62059OXf, 58));
                }
                C62061OXh c62061OXh = c62059OXf.LIZLLL;
                if (c62061OXh != null) {
                    try {
                        C16880lQ.LJJLIIIJILLIZJL(c62061OXh, c62061OXh.LIZ, AnonymousClass028.LIZ("com.google.android.gms.auth.api.phone.SMS_RETRIEVED"));
                    } catch (Exception e) {
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append("register exception: ");
                        LIZ2.append(e.getMessage());
                        C36746EbW.LIZ(4, X1D.LIZIZ(LIZ2));
                    }
                }
            }
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("startVerify, mCanUseFeature:");
            C1DI.LIZJ(LIZ3, c62059OXf.LIZIZ, LIZ3, 4);
            if (!c62059OXf.LIZIZ) {
                return;
            }
            C62062OXi c62062OXi = c62059OXf.LIZJ;
            c62062OXi.getClass();
            c62062OXi.LIZLLL(1, new C67971Qlz()).LIZIZ(C77123UOp.LJLJL);
        }
    }
}
