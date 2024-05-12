package X;

import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import kotlin.jvm.internal.o;

/* renamed from: X.a87, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92275a87 implements InterfaceC91774a02 {
    @Override // X.InterfaceC91774a02
    public final void LIZ(String value, InterfaceC07790Sh modifier, InterfaceC88472Yns<? super String, C76800UCe> onValueChange, InterfaceC88472Yns<? super Boolean, C76800UCe> onFocusChange, int i, C18880oe keyboardOptions, C18850ob c18850ob, InterfaceC14810i5 visualTransformation, String str, String str2, boolean z, boolean z2, boolean z3, InterfaceC65784Pro<C76800UCe> onClear, InterfaceC88471Ynr<? super InterfaceC24520xk, ? super Integer, C76800UCe> interfaceC88471Ynr, InterfaceC88471Ynr<? super InterfaceC24520xk, ? super Integer, C76800UCe> interfaceC88471Ynr2, boolean z4, int i2, C1OH c1oh, InterfaceC24520xk interfaceC24520xk, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        o.LJIIIZ(value, "value");
        o.LJIIIZ(modifier, "modifier");
        o.LJIIIZ(onValueChange, "onValueChange");
        o.LJIIIZ(onFocusChange, "onFocusChange");
        o.LJIIIZ(keyboardOptions, "keyboardOptions");
        o.LJIIIZ(visualTransformation, "visualTransformation");
        o.LJIIIZ(onClear, "onClear");
        C35931b3 LJIL = interfaceC24520xk.LJIL(884771405);
        int i18 = 2;
        if ((i3 & 14) == 0) {
            if (LJIL.LJIJJ(value)) {
                i17 = 4;
            } else {
                i17 = 2;
            }
            i5 = i17 | i3;
        } else {
            i5 = i3;
        }
        int i19 = 16;
        if ((i3 & 112) == 0) {
            if (LJIL.LJIJJ(modifier)) {
                i16 = 32;
            } else {
                i16 = 16;
            }
            i5 |= i16;
        }
        int i20 = 128;
        if ((i3 & 896) == 0) {
            if (LJIL.LJIJJ(onValueChange)) {
                i15 = 256;
            } else {
                i15 = 128;
            }
            i5 |= i15;
        }
        int i21 = 1024;
        if ((i3 & 7168) == 0) {
            if (LJIL.LJIJJ(onFocusChange)) {
                i14 = 2048;
            } else {
                i14 = 1024;
            }
            i5 |= i14;
        }
        int i22 = 57344 & i3;
        int i23 = FileUtils.BUFFER_SIZE;
        if (i22 == 0) {
            if (LJIL.LJIIIZ(i)) {
                i13 = 16384;
            } else {
                i13 = FileUtils.BUFFER_SIZE;
            }
            i5 |= i13;
        }
        int i24 = 65536;
        if ((i3 & 458752) == 0) {
            if (LJIL.LJIJJ(keyboardOptions)) {
                i12 = 131072;
            } else {
                i12 = 65536;
            }
            i5 |= i12;
        }
        int i25 = 1048576;
        if ((i3 & 3670016) == 0) {
            if (LJIL.LJIJJ(c18850ob)) {
                i11 = 1048576;
            } else {
                i11 = 524288;
            }
            i5 |= i11;
        }
        int i26 = 8388608;
        if ((i3 & 29360128) == 0) {
            if (LJIL.LJIJJ(visualTransformation)) {
                i10 = 8388608;
            } else {
                i10 = 4194304;
            }
            i5 |= i10;
        }
        if ((i3 & 234881024) == 0) {
            if (LJIL.LJIJJ(str)) {
                i9 = 67108864;
            } else {
                i9 = 33554432;
            }
            i5 |= i9;
        }
        String str3 = str2;
        if ((i3 & 1879048192) == 0) {
            if (LJIL.LJIJJ(str3)) {
                i8 = 536870912;
            } else {
                i8 = 268435456;
            }
            i5 |= i8;
        }
        boolean z5 = z;
        if ((i4 & 14) == 0) {
            if (LJIL.LJI(z5)) {
                i18 = 4;
            }
            i6 = i18 | i4;
        } else {
            i6 = i4;
        }
        boolean z6 = z2;
        if ((i4 & 112) == 0) {
            if (LJIL.LJI(z6)) {
                i19 = 32;
            }
            i6 |= i19;
        }
        boolean z7 = z3;
        if ((i4 & 896) == 0) {
            if (LJIL.LJI(z7)) {
                i20 = 256;
            }
            i6 |= i20;
        }
        if ((i4 & 7168) == 0) {
            if (LJIL.LJIJJ(onClear)) {
                i21 = 2048;
            }
            i6 |= i21;
        }
        InterfaceC88471Ynr<? super InterfaceC24520xk, ? super Integer, C76800UCe> interfaceC88471Ynr3 = interfaceC88471Ynr;
        if ((57344 & i4) == 0) {
            if (LJIL.LJIJJ(interfaceC88471Ynr3)) {
                i23 = 16384;
            }
            i6 |= i23;
        }
        InterfaceC88471Ynr<? super InterfaceC24520xk, ? super Integer, C76800UCe> interfaceC88471Ynr4 = interfaceC88471Ynr2;
        if ((i4 & 458752) == 0) {
            if (LJIL.LJIJJ(interfaceC88471Ynr4)) {
                i24 = 131072;
            }
            i6 |= i24;
        }
        if ((i4 & 3670016) == 0) {
            if (!LJIL.LJI(z4)) {
                i25 = 524288;
            }
            i6 |= i25;
        }
        if ((i4 & 29360128) == 0) {
            if (!LJIL.LJIIIZ(i2)) {
                i26 = 4194304;
            }
            i6 |= i26;
        }
        if ((i4 & 234881024) == 0) {
            if (LJIL.LJIJJ(c1oh)) {
                i7 = 67108864;
            } else {
                i7 = 33554432;
            }
            i6 |= i7;
        }
        if (((i5 & 1533916891) ^ 306783378) != 0 || ((i6 & 191739611) ^ 38347922) != 0 || !LJIL.LIZ()) {
            str3 = str3;
            z5 = z5;
            z6 = z6;
            z7 = z7;
            interfaceC88471Ynr3 = interfaceC88471Ynr3;
            interfaceC88471Ynr4 = interfaceC88471Ynr4;
            C92026a46.LIZ(value, modifier, onValueChange, onFocusChange, i, keyboardOptions, c18850ob, visualTransformation, str, str3, z5, z6, z7, onClear, interfaceC88471Ynr3, interfaceC88471Ynr4, z4, i2, c1oh, LJIL, (i5 & 14) | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (i5 & 458752) | (i5 & 3670016) | (i5 & 29360128) | (i5 & 234881024) | (i5 & 1879048192), (i6 & 14) | (i6 & 112) | (i6 & 896) | (i6 & 7168) | (57344 & i6) | (i6 & 458752) | (i6 & 3670016) | (i6 & 29360128) | (i6 & 234881024), 0);
        } else {
            LJIL.LIZLLL();
        }
        C35991b9 LJJJJLI = LJIL.LJJJJLI();
        if (LJJJJLI == null) {
            return;
        }
        LJJJJLI.LIZLLL = new C92940aIq(this, value, modifier, onValueChange, onFocusChange, i, keyboardOptions, c18850ob, visualTransformation, str, str3, z5, z6, z7, onClear, interfaceC88471Ynr3, interfaceC88471Ynr4, z4, i2, c1oh, i3, i4);
    }
}
