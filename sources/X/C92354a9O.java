package X;

import android.graphics.Bitmap;
import android.text.TextUtils;
import kotlin.jvm.internal.IDqS418S0100000_31;
import kotlin.jvm.internal.o;

/* renamed from: X.a9O, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92354a9O extends C92219a7D implements InterfaceC91976a3I {
    public final C91841a17 LJIIZILJ;

    public C92354a9O() {
        throw null;
    }

    @Override // X.C92219a7D
    public final String LJIIIIZZ() {
        if (o.LJ(this.LIZ.getParamName(), EnumC91966a38.CardHolderName.getType())) {
            String placeholder = this.LIZ.getPlaceholder();
            if (placeholder == null) {
                placeholder = "";
            }
            String LIZ = C92054a4Y.LIZ(placeholder, new String[0]);
            if (LIZ.length() > 0 && !TextUtils.equals(placeholder, LIZ)) {
                return LIZ;
            }
        }
        return super.LJIIIIZZ();
    }

    @Override // X.InterfaceC91976a3I
    public final void LIZJ(Bitmap bitmap, String value) {
        o.LJIIIZ(value, "value");
        if (o.LJ(this.LIZ.getParamName(), EnumC91966a38.CardHolderName.getType())) {
            C91841a17 c91841a17 = this.LJIIZILJ;
            c91841a17.getClass();
            c91841a17.LIZ = Boolean.TRUE;
            c91841a17.LIZIZ = value;
            ((IDqS418S0100000_31) this.LJIILL).invoke(value);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C92354a9O(java.lang.String r12, X.InterfaceC88472Yns r13, com.bytedance.pipo.checkout.api.network.model.response.Elements r14, X.C92229a7N r15, int r16) {
        /*
            r11 = this;
            r6 = r12
            r7 = r13
            r0 = r16 & 1
            if (r0 == 0) goto L8
            java.lang.String r6 = ""
        L8:
            r0 = r16 & 2
            if (r0 == 0) goto L3d
            r5 = 1
        Ld:
            r0 = r16 & 4
            r9 = 0
            if (r0 == 0) goto L13
            r7 = r9
        L13:
            r0 = r16 & 16
            if (r0 == 0) goto L3b
        L17:
            r0 = 128(0x80, float:1.8E-43)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            r8 = 0
            r10 = 162(0xa2, float:2.27E-43)
            r2 = r11
            r3 = r14
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            X.a17 r0 = new X.a17
            r0.<init>()
            r2.LJIIZILJ = r0
            java.util.List<? extends X.a2o<java.lang.String>> r1 = r2.LJ
            X.a6e r0 = X.C92184a6e.LIZ
            java.util.List r0 = X.C47261Igj.LJJIJ(r0)
            java.util.List r0 = X.ORZ.LLIIIZ(r0, r1)
            r2.LJ = r0
            return
        L3b:
            r9 = r15
            goto L17
        L3d:
            r5 = 0
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C92354a9O.<init>(java.lang.String, X.Yns, com.bytedance.pipo.checkout.api.network.model.response.Elements, X.a7N, int):void");
    }
}
