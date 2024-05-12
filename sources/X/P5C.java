package X;

import com.ss.android.ttve.nativePort.TEVideoUtils;
import com.ss.android.ttve.nativePort.TEVideoUtilsCallback;
import com.ss.android.vesdk.VEBingoInvoker;
import java.nio.ByteBuffer;

/* loaded from: classes12.dex */
public final class P5C implements Runnable {
    public final /* synthetic */ long[] LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ InterfaceC133855Nd LJLJJI;
    public final /* synthetic */ int LJLJJL;
    public final /* synthetic */ long LJLJJLL;
    public final /* synthetic */ int[] LJLJL;
    public final /* synthetic */ int[] LJLJLJ;
    public final /* synthetic */ int LJLJLLL;
    public final /* synthetic */ int LJLL;
    public final /* synthetic */ VEBingoInvoker LJLLI;

    public final void LIZ() {
        TEVideoUtilsCallback tEVideoUtilsCallback = new TEVideoUtilsCallback();
        tEVideoUtilsCallback.setListener(new P5B(this, new ByteBuffer[]{null}, new float[]{0.0f}));
        TEVideoUtils.nativeGetVideoFrameMore(this.LJLJI, this.LJLJLJ, this.LJLJLLL, this.LJLL, false, false, 2, true, tEVideoUtilsCallback);
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }

    public P5C(VEBingoInvoker vEBingoInvoker, long[] jArr, int i, String str, InterfaceC133855Nd interfaceC133855Nd, int i2, long j, int[] iArr, int[] iArr2, int i3, int i4) {
        this.LJLLI = vEBingoInvoker;
        this.LJLIL = jArr;
        this.LJLILLLLZI = i;
        this.LJLJI = str;
        this.LJLJJI = interfaceC133855Nd;
        this.LJLJJL = i2;
        this.LJLJJLL = j;
        this.LJLJL = iArr;
        this.LJLJLJ = iArr2;
        this.LJLJLLL = i3;
        this.LJLL = i4;
    }
}
