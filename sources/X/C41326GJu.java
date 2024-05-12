package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import java.io.File;
import kotlin.jvm.internal.o;

/* renamed from: X.GJu, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41326GJu {
    public static String LIZ(CreativeInfo creativeInfo) {
        StringBuilder LIZ = X1D.LIZ();
        InterfaceC171126nc pathAdapter = C60903NvH.LJIIJJI().LJJIJL().getPathAdapter();
        o.LJI(creativeInfo);
        LIZ.append(pathAdapter.LJJIIZ(creativeInfo));
        String str = File.separator;
        return C025908h.LIZIZ(LIZ, str, "tts", str, LIZ);
    }

    public static boolean LIZIZ(InterfaceC45930I0w interfaceC45930I0w) {
        if (interfaceC45930I0w != null && TextUtils.equals(C44172HVg.LJIJ.getCurrentUserID(), interfaceC45930I0w.getUid())) {
            return true;
        }
        return false;
    }
}
