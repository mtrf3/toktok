package X;

import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes8.dex */
public final class HMW {
    public static String LIZ(String str) {
        Integer valueOf;
        if (str != null && (valueOf = Integer.valueOf(s.LJJLIIIJLLLLLLLZ(str, '.', 0, 6))) != null && valueOf.intValue() != -1) {
            int intValue = valueOf.intValue();
            if (str != null) {
                String substring = str.substring(intValue);
                o.LJIIIIZZ(substring, "(this as java.lang.String).substring(startIndex)");
                return substring;
            }
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        return "empty_file_suffix";
    }

    public static /* synthetic */ void LIZIZ(HMV hmv, MediaModel mediaModel, boolean z, long j, long j2, boolean z2, boolean z3, InterfaceC88472Yns interfaceC88472Yns, InterfaceC88472Yns interfaceC88472Yns2, int i) {
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            j = 0;
        }
        if ((i & 8) != 0) {
            j2 = -1;
        }
        if ((i & 16) != 0) {
            z2 = true;
        }
        if ((i & 32) != 0) {
            z3 = false;
        }
        hmv.LIZ(mediaModel, z, j, j2, z2, z3, interfaceC88472Yns, interfaceC88472Yns2);
    }
}
