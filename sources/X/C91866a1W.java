package X;

import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import kotlin.jvm.internal.o;

/* renamed from: X.a1W, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C91866a1W {
    public static final void LIZ(InterfaceC07790Sh interfaceC07790Sh, float f, boolean z, InterfaceC88471Ynr<? super InterfaceC24520xk, ? super Integer, C76800UCe> topBar, InterfaceC88473Ynt<? super C23390vv, ? super InterfaceC24520xk, ? super Integer, C76800UCe> content, InterfaceC24520xk interfaceC24520xk, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        C35931b3 c35931b3;
        float f2 = f;
        boolean z2 = z;
        InterfaceC07790Sh interfaceC07790Sh2 = interfaceC07790Sh;
        o.LJIIIZ(topBar, "topBar");
        o.LJIIIZ(content, "content");
        C35931b3 LJIL = interfaceC24520xk.LJIL(1883615063);
        int i8 = i2 & 1;
        if (i8 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            if (LJIL.LJIJJ(interfaceC07790Sh2)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i;
        } else {
            i3 = i;
        }
        int i9 = i2 & 2;
        if (i9 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            if (LJIL.LJII(f2)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 7168) == 0) {
            if (LJIL.LJIJJ(topBar)) {
                i6 = 2048;
            } else {
                i6 = 1024;
            }
            i3 |= i6;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((57344 & i) == 0) {
            if (LJIL.LJIJJ(content)) {
                i7 = 16384;
            } else {
                i7 = FileUtils.BUFFER_SIZE;
            }
            i3 |= i7;
        }
        if (((46171 & i3) ^ 9234) != 0 || !LJIL.LIZ()) {
            if (i8 != 0) {
                interfaceC07790Sh2 = InterfaceC07790Sh.LJJJI;
            }
            if (i9 != 0) {
                f2 = 0;
            }
            if ((i2 & 4) != 0) {
                z2 = false;
            }
            c35931b3 = LJIL;
            C09300Yc.LIZ(null, null, false, C1DJ.LJ(LJIL, -819895677, new C92696aEu(interfaceC07790Sh2, f2, topBar, i3, content)), LJIL, 3072, 7);
        } else {
            LJIL.LIZLLL();
            c35931b3 = LJIL;
        }
        C35991b9 LJJJJLI = c35931b3.LJJJJLI();
        if (LJJJJLI == null) {
            return;
        }
        LJJJJLI.LIZLLL = new C92697aEv(interfaceC07790Sh2, f2, z2, topBar, content, i, i2);
    }
}
