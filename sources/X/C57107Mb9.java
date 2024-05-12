package X;

import android.content.Context;

/* renamed from: X.Mb9, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57107Mb9 {
    public static /* synthetic */ boolean LIZIZ(InterfaceC57106Mb8 interfaceC57106Mb8, String str, int i) {
        boolean z;
        if ((i & 2) != 0) {
            z = true;
        } else {
            z = false;
        }
        return interfaceC57106Mb8.LIZJ(null, str, z);
    }

    public static /* synthetic */ String LIZ(InterfaceC57106Mb8 interfaceC57106Mb8, Context context, String str, int i, int i2) {
        boolean z;
        if ((i2 & 4) != 0) {
            z = true;
        } else {
            z = false;
        }
        if ((i2 & 8) != 0) {
            i = Integer.MAX_VALUE;
        }
        return interfaceC57106Mb8.LJIIIIZZ(context, i, z, str);
    }
}
