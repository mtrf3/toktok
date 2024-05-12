package X;

import android.content.Context;
import java.io.File;

/* renamed from: X.IjM, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47424IjM implements InterfaceC47432IjU {
    @Override // X.InterfaceC47432IjU
    public final boolean LIZIZ() {
        return P8H.LJIIJJI();
    }

    @Override // X.InterfaceC47432IjU
    public final File LIZ(Context context, EnumC47428IjQ enumC47428IjQ) {
        EnumC47429IjR enumC47429IjR;
        int i = C47427IjP.LIZ[enumC47428IjQ.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    enumC47429IjR = null;
                } else {
                    enumC47429IjR = EnumC47429IjR.PREFER_SD_CARD;
                }
            } else {
                enumC47429IjR = EnumC47429IjR.PREFER_PRIVATE;
            }
        } else {
            enumC47429IjR = EnumC47429IjR.PREFER_EXTERNAL;
        }
        return P8H.LJI(context, enumC47429IjR);
    }
}
