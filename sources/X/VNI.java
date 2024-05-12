package X;

import com.lynx.tasm.base.LLog;
import com.lynx.tasm.lepus.LepusApiActor;

/* loaded from: classes15.dex */
public final class VNI implements Runnable {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ float LJLJI;
    public final /* synthetic */ float LJLJJI;
    public final /* synthetic */ float LJLJJL;
    public final /* synthetic */ float LJLJJLL;
    public final /* synthetic */ float LJLJL;
    public final /* synthetic */ float LJLJLJ;
    public final /* synthetic */ LepusApiActor LJLJLLL;

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LepusApiActor lepusApiActor = this.LJLJLLL;
            long j = lepusApiActor.LIZ;
            if (j == 0) {
                LLog.LIZLLL(4, "LepusApiActor", "SendSendTouchEvent failed since mNativePtr is null");
            } else {
                lepusApiActor.nativeSendTouchEvent(j, this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL, this.LJLJLJ);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public VNI(LepusApiActor lepusApiActor, String str, int i, float f, float f2, float f3, float f4, float f5, float f6) {
        this.LJLJLLL = lepusApiActor;
        this.LJLIL = str;
        this.LJLILLLLZI = i;
        this.LJLJI = f;
        this.LJLJJI = f2;
        this.LJLJJL = f3;
        this.LJLJJLL = f4;
        this.LJLJL = f5;
        this.LJLJLJ = f6;
    }
}
