package X;

import com.lynx.tasm.LynxTemplateRender;
import com.lynx.tasm.TemplateBundle;
import com.lynx.tasm.TemplateData;

/* renamed from: X.VNc, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class RunnableC79632VNc implements Runnable {
    public final /* synthetic */ TemplateBundle LJLIL;
    public final /* synthetic */ TemplateData LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ LynxTemplateRender LJLJJI;

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            this.LJLJJI.LJIL(this.LJLIL, this.LJLILLLLZI, this.LJLJI);
        } finally {
            if (LIZ) {
            }
        }
    }

    public RunnableC79632VNc(LynxTemplateRender lynxTemplateRender, TemplateBundle templateBundle, TemplateData templateData, String str) {
        this.LJLJJI = lynxTemplateRender;
        this.LJLIL = templateBundle;
        this.LJLILLLLZI = templateData;
        this.LJLJI = str;
    }
}
