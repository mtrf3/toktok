package X;

import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import kotlin.jvm.internal.o;

/* renamed from: X.a8A, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92278a8A implements InterfaceC91778a06 {
    @Override // X.InterfaceC91778a06
    public final void LIZ(String title, String buttonTitle, InterfaceC07790Sh modifier, boolean z, String str, InterfaceC65784Pro<C76800UCe> onRetry, InterfaceC24520xk interfaceC24520xk, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        o.LJIIIZ(title, "title");
        o.LJIIIZ(buttonTitle, "buttonTitle");
        o.LJIIIZ(modifier, "modifier");
        o.LJIIIZ(onRetry, "onRetry");
        C35931b3 LJIL = interfaceC24520xk.LJIL(547318441);
        if ((i & 14) == 0) {
            if (LJIL.LJIJJ(title)) {
                i8 = 4;
            } else {
                i8 = 2;
            }
            i2 = i8 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (LJIL.LJIJJ(buttonTitle)) {
                i7 = 32;
            } else {
                i7 = 16;
            }
            i2 |= i7;
        }
        if ((i & 896) == 0) {
            if (LJIL.LJIJJ(modifier)) {
                i6 = 256;
            } else {
                i6 = 128;
            }
            i2 |= i6;
        }
        if ((i & 7168) == 0) {
            if (LJIL.LJI(z)) {
                i5 = 2048;
            } else {
                i5 = 1024;
            }
            i2 |= i5;
        }
        if ((i & 57344) == 0) {
            if (LJIL.LJIJJ(str)) {
                i4 = 16384;
            } else {
                i4 = FileUtils.BUFFER_SIZE;
            }
            i2 |= i4;
        }
        if ((i & 458752) == 0) {
            if (LJIL.LJIJJ(onRetry)) {
                i3 = 131072;
            } else {
                i3 = 65536;
            }
            i2 |= i3;
        }
        if (((374491 & i2) ^ 74898) != 0 || !LJIL.LIZ()) {
            C92028a48.LIZ(title, buttonTitle, modifier, z, str, onRetry, LJIL, (57344 & i2) | (i2 & 14) | (i2 & 112) | (i2 & 896) | (i2 & 7168) | (i2 & 458752), 0);
        } else {
            LJIL.LIZLLL();
        }
        C35991b9 LJJJJLI = LJIL.LJJJJLI();
        if (LJJJJLI == null) {
            return;
        }
        LJJJJLI.LIZLLL = new C92955aJ5(this, title, buttonTitle, modifier, z, str, onRetry, i);
    }
}
