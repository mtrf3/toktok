package X;

import com.lynx.tasm.TemplateAssembler;

/* loaded from: classes15.dex */
public final class VNF implements Runnable {
    public final /* synthetic */ long LJLIL;
    public final /* synthetic */ TemplateAssembler LJLILLLLZI;

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            this.LJLILLLLZI.nativeDestroy(this.LJLIL);
        } finally {
            if (LIZ) {
            }
        }
    }

    public VNF(TemplateAssembler templateAssembler, long j) {
        this.LJLILLLLZI = templateAssembler;
        this.LJLIL = j;
    }
}
