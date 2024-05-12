package X;

import android.graphics.Bitmap;
import java.util.List;

/* renamed from: X.2j9, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C66432j9 {
    public static final /* synthetic */ int LIZ = 0;

    public static Object LIZ(String str, InterfaceC67352kd interfaceC67352kd) {
        return XKX.LJI(C78613UtF.LIZ, new C66442jA(162, 162, str, null), interfaceC67352kd);
    }

    public static Object LIZIZ(Bitmap bitmap, String str, List list, InterfaceC67352kd interfaceC67352kd, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        List list2 = list;
        if ((i & 4) != 0) {
            i2 = 144;
        } else {
            i2 = 0;
        }
        if ((i & 8) != 0) {
            i3 = 144;
        } else {
            i3 = 0;
        }
        if ((i & 16) != 0) {
            i4 = 18;
        } else {
            i4 = 0;
        }
        if ((i & 32) != 0) {
            i5 = 18;
        } else {
            i5 = 0;
        }
        if ((i & 64) != 0) {
            i6 = 20;
        } else {
            i6 = 0;
        }
        if ((i & 128) != 0) {
            list2 = null;
        }
        return XKX.LJI(C78613UtF.LIZ, new C119524ma(i2, i3, i6, i4, i5, bitmap, str, list2, null), interfaceC67352kd);
    }
}
