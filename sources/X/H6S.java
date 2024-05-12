package X;

import android.graphics.BitmapFactory;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.vesdk.VEWatermarkParam;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class H6S {
    public static final void LIZIZ(String imagePath) {
        o.LJIIIZ(imagePath, "imagePath");
        H72 h72 = new H72();
        h72.LIZ = BitmapFactory.decodeResource(C44172HVg.LIZ.getResources(), R.drawable.auz);
        h72.LIZLLL(imagePath);
    }

    public final H2U LIZ(int i, InterfaceC45930I0w interfaceC45930I0w, CreativeInfo creativeInfo, String str, String str2, String str3, boolean z, boolean z2, int[] iArr) {
        VEWatermarkParam LIZ = HOV.LIZ(HOV.LIZIZ(creativeInfo, i, str, z, iArr), interfaceC45930I0w, iArr, true, str2, z2, str3);
        if (LIZ != null) {
            return new H2U(LIZ);
        }
        return null;
    }
}
