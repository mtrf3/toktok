package X;

import com.bytedance.ies.smartmovie.jni.VecMeta;

/* renamed from: X.Hne, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45142Hne {
    public static /* synthetic */ void LIZ(InterfaceC45141Hnd interfaceC45141Hnd, VecMeta vecMeta, boolean z, int i, String str, String str2, Long l, String str3, String str4, boolean z2, int i2) {
        String str5 = str;
        int i3 = i;
        boolean z3 = z2;
        if ((i2 & 4) != 0) {
            i3 = 0;
        }
        if ((i2 & 16) != 0) {
            str5 = null;
        }
        if ((i2 & 1024) != 0) {
            z3 = false;
        }
        interfaceC45141Hnd.LIZJ(vecMeta, z, i3, 0, str5, str2, l, str3, str4, z3);
    }

    public static /* synthetic */ void LIZIZ(InterfaceC45141Hnd interfaceC45141Hnd, boolean z, int i, int i2, String str, String str2, String str3, String str4, String str5, VecMeta vecMeta, Boolean bool, String str6, String str7, int i3) {
        int i4 = i2;
        int i5 = i;
        VecMeta vecMeta2 = vecMeta;
        String str8 = str;
        String str9 = str4;
        String str10 = str5;
        if ((i3 & 2) != 0) {
            i5 = 0;
        }
        if ((i3 & 4) != 0) {
            i4 = 0;
        }
        Boolean bool2 = null;
        if ((i3 & 8) != 0) {
            str8 = null;
        }
        if ((i3 & 64) != 0) {
            str9 = null;
        }
        if ((i3 & 128) != 0) {
            str10 = null;
        }
        if ((i3 & 256) != 0) {
            vecMeta2 = null;
        }
        if ((i3 & 512) == 0) {
            bool2 = bool;
        }
        interfaceC45141Hnd.LIZ(z, i5, i4, str8, str2, str3, str9, str10, vecMeta2, bool2, str6, str7);
    }
}
