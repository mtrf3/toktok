package X;

import com.lynx.tasm.base.LLog;
import com.lynx.tasm.lepus.LepusApiActor;
import java.nio.ByteBuffer;

/* loaded from: classes15.dex */
public final class VNJ implements Runnable {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ ByteBuffer LJLJI;
    public final /* synthetic */ int LJLJJI;
    public final /* synthetic */ String LJLJJL;
    public final /* synthetic */ LepusApiActor LJLJJLL;

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LepusApiActor lepusApiActor = this.LJLJJLL;
            long j = lepusApiActor.LIZ;
            if (j == 0) {
                LLog.LIZLLL(4, "LepusApiActor", "SendCustomEvent failed since mNativePtr is null");
            } else {
                lepusApiActor.nativeSendCustomEvent(j, this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public VNJ(LepusApiActor lepusApiActor, String str, int i, ByteBuffer byteBuffer, int i2, String str2) {
        this.LJLJJLL = lepusApiActor;
        this.LJLIL = str;
        this.LJLILLLLZI = i;
        this.LJLJI = byteBuffer;
        this.LJLJJI = i2;
        this.LJLJJL = str2;
    }
}
