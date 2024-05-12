package X;

import com.bytedance.android.livesdk.livesetting.broadcast.LiveTryModeCountDownThresholdSetting;
import com.ss.android.ugc.aweme.creative.compileConfig.CompileConfigResolution;
import com.ss.android.ugc.aweme.creative.compileConfig.VEVideoEncodeConfigParams;
import kotlin.jvm.internal.AqS138S0200000_7;
import kotlin.jvm.internal.AqS173S0100000_7;

/* renamed from: X.HfK, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44626HfK {
    public final C44630HfO LIZ;

    public final CompileConfigResolution LIZ() {
        C44628HfM c44628HfM = new C44628HfM();
        C44650Hfi LJIIZILJ = C78685UuP.LJIIZILJ();
        LJIIZILJ.LIZIZ(C44632HfQ.LIZ, new AqS173S0100000_7(c44628HfM, 440));
        LJIIZILJ.LIZIZ(C44631HfP.LIZ, new AqS138S0200000_7(c44628HfM, this, LiveTryModeCountDownThresholdSetting.DEFAULT));
        return ((VEVideoEncodeConfigParams) LJIIZILJ.execute()).getOutputSize();
    }

    public C44626HfK(C44630HfO c44630HfO) {
        this.LIZ = c44630HfO;
    }
}
