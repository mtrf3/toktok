package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.Window;
import com.ss.android.ugc.aweme.favorites.business.playlist.PlaylistCollectionStateAgent;
import kotlin.jvm.internal.o;
import o3.h0;

/* loaded from: classes14.dex */
public final class V69 {
    public static final void LIZ(String mixId, InterfaceC07790Sh interfaceC07790Sh, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro2, InterfaceC24520xk interfaceC24520xk, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z;
        Window window;
        View decorView;
        boolean z2;
        C07310Ql LIZ;
        InterfaceC07790Sh interfaceC07790Sh2 = interfaceC07790Sh;
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro3 = interfaceC65784Pro2;
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro4 = interfaceC65784Pro;
        o.LJIIIZ(mixId, "mixId");
        C35931b3 LJIL = interfaceC24520xk.LJIL(-870847225);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            if (LJIL.LJIJJ(mixId)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i;
        } else {
            i3 = i;
        }
        int i8 = i2 & 2;
        if (i8 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            if (LJIL.LJIJJ(interfaceC07790Sh2)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        int i9 = i2 & 4;
        if (i9 != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            if (LJIL.LJIJJ(interfaceC65784Pro4)) {
                i6 = 256;
            } else {
                i6 = 128;
            }
            i3 |= i6;
        }
        int i10 = i2 & 8;
        if (i10 != 0) {
            i3 |= 3072;
        } else if ((i & 7168) == 0) {
            if (LJIL.LJIJJ(interfaceC65784Pro3)) {
                i7 = 2048;
            } else {
                i7 = 1024;
            }
            i3 |= i7;
        }
        if ((i3 & 5851) != 1170 || !LJIL.LIZ()) {
            if (i8 != 0) {
                interfaceC07790Sh2 = InterfaceC07790Sh.LJJJI;
            }
            if (i9 != 0) {
                interfaceC65784Pro4 = V7Z.LJLIL;
            }
            if (i10 != 0) {
                interfaceC65784Pro3 = C79214V7a.LJLIL;
            }
            Context context = (Context) LJIL.LJIILLIIL(C04Q.LIZJ);
            LJIL.LJJIIJ(-492369756);
            Object LJJJZ = LJIL.LJJJZ();
            InterfaceC24520xk.LIZ.getClass();
            C24490xh c24490xh = C24500xi.LIZIZ;
            if (LJJJZ == c24490xh) {
                Activity LJIJJ = C45804HyK.LJIJJ(context);
                if (LJIJJ != null && (window = LJIJJ.getWindow()) != null && (decorView = window.getDecorView()) != null) {
                    C16800lI LJIIIZ = h0.LJIIIZ(decorView);
                    if (LJIIIZ != null && (LIZ = LJIIIZ.LIZ(2)) != null && LIZ.LIZLLL == 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    z = !z2;
                } else {
                    z = false;
                }
                LJJJZ = Boolean.valueOf(z);
                LJIL.LJLJLLL(LJJJZ);
            }
            LJIL.LJJJJJ(false);
            boolean booleanValue = ((Boolean) LJJJZ).booleanValue();
            LJIL.LJJIIJ(-492369756);
            Object LJJJZ2 = LJIL.LJJJZ();
            if (LJJJZ2 == c24490xh) {
                LJJJZ2 = Boolean.valueOf(PlaylistCollectionStateAgent.LJIJ().LJ(mixId).booleanValue());
                LJIL.LJLJLLL(LJJJZ2);
            }
            LJIL.LJJJJJ(false);
            boolean booleanValue2 = ((Boolean) LJJJZ2).booleanValue();
            LJIL.LJJIIJ(-492369756);
            Object LJJJZ3 = LJIL.LJJJZ();
            if (LJJJZ3 == c24490xh) {
                LJJJZ3 = new C79208V6u(PlaylistCollectionStateAgent.LJIIZILJ().LIZ());
                LJIL.LJLJLLL(LJJJZ3);
            }
            LJIL.LJJJJJ(false);
            V67.LIZ(null, null, null, null, null, null, C1DJ.LJ(LJIL, 180740002, new C79170V5i(interfaceC07790Sh2, booleanValue, context, interfaceC65784Pro4, i3, interfaceC65784Pro3, C78966Uyw.LJIIL((InterfaceC65462ha) LJJJZ3, Boolean.valueOf(booleanValue2), null, LJIL, 2))), LJIL, 1572864, 63);
        } else {
            LJIL.LIZLLL();
        }
        C35991b9 LJJJJLI = LJIL.LJJJJLI();
        if (LJJJJLI == null) {
            return;
        }
        LJJJJLI.LIZLLL = new C79197V6j(mixId, interfaceC07790Sh2, interfaceC65784Pro4, interfaceC65784Pro3, i, i2);
    }
}
