package X;

import com.ss.android.ugc.aweme.creative.compileConfig.VEVideoEncodeConfigParams;
import kotlin.jvm.internal.AqS173S0100000_7;

/* renamed from: X.HeF, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44559HeF {
    public final C44537Hdt LIZ;

    public final int[] LIZ() {
        C44650Hfi LJIIZILJ = C78685UuP.LJIIZILJ();
        LJIIZILJ.LIZIZ(C44578HeY.LIZ, new AqS173S0100000_7(this, 447));
        LJIIZILJ.LIZIZ(C44577HeX.LIZ, new AqS173S0100000_7(this, 448));
        LJIIZILJ.LIZIZ(C44579HeZ.LIZ, new AqS173S0100000_7(this, 449));
        VEVideoEncodeConfigParams vEVideoEncodeConfigParams = (VEVideoEncodeConfigParams) LJIIZILJ.execute();
        return new int[]{vEVideoEncodeConfigParams.getOutputSize().getWidth(), vEVideoEncodeConfigParams.getOutputSize().getHeight()};
    }

    public C44559HeF(C44537Hdt c44537Hdt) {
        this.LIZ = c44537Hdt;
    }
}
